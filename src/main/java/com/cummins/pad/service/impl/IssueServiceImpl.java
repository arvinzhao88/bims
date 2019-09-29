package com.cummins.pad.service.impl;

import com.alibaba.fastjson.JSON;
import com.cummins.bims.dao.*;
import com.cummins.bims.dto.*;
import com.cummins.bims.enums.RecordStatusEnum;
import com.cummins.bims.service.DealLogService;
import com.cummins.bims.service.NumberService;
import com.cummins.bims.service.SendEmailService;
import com.cummins.contact.dao.PersonMapper;
import com.cummins.contact.dto.Person;
import com.cummins.contact.dto.PersonCriteria;
import com.cummins.contact.service.IPersonService;
import com.cummins.pad.service.IIssueService;
import com.cummins.permission.model.BimsPerson;
import com.cummins.permission.service.PermissionService;
import com.cummins.util.DealLogUtil;
import com.cummins.util.SendMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * pad端
 * @author qixiao
 */
@Service
public class IssueServiceImpl implements IIssueService {
    @Autowired
    private IssueMapper dao;
    @Autowired
    private IssueExtendMapper extendDao;
    @Autowired
    private AdviceMapper adviceDao;
    @Autowired
    private NumberService nService;
    @Autowired
    private DealLogMapper logMapper;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private SendEmailService emailService;
    @Autowired
    private PermissionService bimsPersonService;
    @Autowired
    private MsgPersonMapper msgPersonMapper;

    /**
     * 添加问题
     * @param issue
     * @return
     */
    @Override
    @Transactional
    public int add(Issue issue) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("wx_person_info");
        if (issue != null && person != null) {
            String dealJson = null; // 处理表
            // 不合格
            if ("0".equals(issue.getIsRft())) {
                dealJson = issue.getComments();
            }
            String issueNo = nService.selectMaxSn(issue.getQualityType()); // 问题编码
            // 保存主表数据
            issue.setComments(null);
            if ("2".equals(issue.getIsRft())) {
                // 合格分类及描述不更新
                issue.setProcessStatus("7");
                issue.setProcessPerson(String.valueOf(person.getId()));
                issue.setProcessPersonAccount(person.getName());
                issue.setProcessPersonName(person.getAccount());
            }
            // 如果不合格，状态1，不需要接收
            else if ("0".equals(issue.getIsRft())) {
                issue.setProcessStatus("1");

                // 发邮件给处理人
                Person toPerson = getPersonByAccout(issue.getProcessPersonAccount()); // 收件人
                if (toPerson != null) {
                    sendEmail(toPerson.getEmail(), issueNo, issue);
                }

            } else {
                issue.setProcessStatus("0"); // 线边提交，状态为0

                // 发邮件给对应区域所有质量工程师
                String zone = getZone(issue.getQualityType(), issue.getPlant());
                if (zone != null && !"".equals(zone)) {
                    List<BimsPerson> toPersonList = bimsPersonService.getAllQeByZone(zone);
                    if (toPersonList != null && toPersonList.size() > 0) {
                        sendEmail(getEmails(toPersonList), issueNo,issue);
                    }
                }
            }
            issue.setNumber(issueNo); // 编号
            issue.setSubSource("1"); // pad提交
            issue.setDelflag("1"); // 未删除
            issue.setInputPerson(String.valueOf(person.getId())); // 登录人id
            issue.setInputPresonName(person.getName()); // 登录人姓名
            issue.setInputPersonAccount(person.getAccount()); // 工号
            issue.setInputTime(new Date()); // 时间
            issue.setIsEqr("0"); // 是否eqr默认0
            dao.insert(issue);

            //ATPU  采购件  通知物流班长和SQI
            //Issue issue1 = dao.selectByPrimaryKey(issue.getId());
            if (("A".equals(issue.getQualityType()) && "2".equals(issue.getIssueCategoryL1()))){
                //获取物流班长和SQI人员
                List<MsgPerson> msgPersonList = null;
                MsgPersonCriteria criteria = new MsgPersonCriteria();
                if ("64".equals(issue.getPlant())){
                    criteria.createCriteria().andTypeEqualTo("F");
                    msgPersonList = msgPersonMapper.selectByExample(criteria);
                }else {
                    criteria.createCriteria().andTypeEqualTo("X");
                    msgPersonList = msgPersonMapper.selectByExample(criteria);
                }

                for (MsgPerson msgPerson: msgPersonList) {
                    SendMsg.sendNoticeSQI(issue, msgPerson,new ArrayList<>());
                }
            }

            // 保存扩展表数据
            if (issue.getIssueExtend() != null && !"".equals(issue.getIssueExtend())) {
                IssueExtend extend = new IssueExtend();
                extend.setIssueManageId(issue.getId()); // 问题id
                extend.setAttribute(issue.getIssueExtend()); // 内容
                extendDao.insertSelective(extend);
            }
            // 保存处理表数据
            if (dealJson != null && !"".equals(dealJson)) {
                Advice deal = JSON.parseObject(dealJson, Advice.class);
                if (deal != null) {
                    deal.setIssueId(issue.getId()); // 问题id
                    deal.setHandlerDate(new Date()); // 处理时间
                    adviceDao.insertSelective(deal);
                }
            }
            insertLog(issue.getId(), RecordStatusEnum.SUMITISSUE);
            return 1;
        }
        return -1;
    }

    /**
     * 获取问题列表
     * @param temp 大区 A/T/M
     * @return
     */
    @Override
    public List<Issue> getIssueList(String temp) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("wx_person_info");
        IssueCriteria issueCriteria = new IssueCriteria();
        IssueCriteria.Criteria criteria = issueCriteria.createCriteria();
        criteria.andQualityTypeEqualTo(temp.toUpperCase()); // 大区
        criteria.andInputPersonEqualTo(String.valueOf(person.getId())); // 登录用户id
        criteria.andSubSourceEqualTo("1"); // pad提交
        criteria.andDelflagEqualTo("1"); // 未删除
        return dao.selectByExample(issueCriteria);
    }

    /**
     * 分页查询
     * @param temp
     * @param page
     * @param size
     * @return
     */
    @Override
    public List<Issue> getIssueListByPage(String temp, Integer page, Integer size,String searchText) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("wx_person_info");
        if (temp != null && !"".equals(temp) && page != null && size != null) {
            Map<String, Object> map = new HashMap<>();
            map.put("temp", temp);
            map.put("personId", person.getId()); // 用户id
            map.put("num", page * size);
            map.put("size", size);
            map.put("searchText", searchText);
            return dao.selectByPage(map);
        }
        return null;
    }

    /**
     * 通过id查询问题
     * @param id
     * @return
     */
    @Override
    @Transactional
    public Issue getIssueById(Integer id) {
        // 查询主表
        Issue issue = dao.selectByPrimaryKey(id);
        if (issue != null) {
            // 查询扩展表
            IssueExtendCriteria extendCriteria = new IssueExtendCriteria();
            IssueExtendCriteria.Criteria criteria = extendCriteria.createCriteria();
            criteria.andIssueManageIdEqualTo(id); // 问题编号
            List<IssueExtend> extendList = extendDao.selectByExample(extendCriteria);
            if (extendList != null && extendList.size() > 0) {
                issue.setIssueExtend(extendList.get(0).getAttribute());
            }
            // 查询处理表
            AdviceCriteria adviceCriteria = new AdviceCriteria();
            AdviceCriteria.Criteria aCriteria = adviceCriteria.createCriteria();
            aCriteria.andIssueIdEqualTo(id); // 问题编号
//            aCriteria.andResolutionIsNotNull(); // 处理意见不为空
            adviceCriteria.setOrderByClause("handler_date asc"); // 时间排序
            List<Advice> adviceList = adviceDao.selectByExample(adviceCriteria);
            if (adviceList != null && adviceList.size() > 0) {
                issue.setComments(JSON.toJSONStringWithDateFormat(adviceList, "yyyy-MM-dd HH:mm"));
            } else {
                issue.setComments(null);
            }
        }
        return issue;
    }

    /**
     * 修改问题
     * @param issue
     * @return
     */
    @Override
    @Transactional
    public int modify(Issue issue) {
        if (issue != null) {
            // 修改扩展表数据
            if (issue.getIssueExtend() != null && !"".equals(issue.getIssueExtend())) {
                IssueExtendCriteria extendCriteria = new IssueExtendCriteria();
                IssueExtendCriteria.Criteria criteria = extendCriteria.createCriteria();
                criteria.andIssueManageIdEqualTo(issue.getId());
                // 删除原来数据
                extendDao.deleteByExample(extendCriteria);
                IssueExtend extend = new IssueExtend();
                extend.setIssueManageId(issue.getId());
                extend.setAttribute(issue.getIssueExtend());
                // 插入新数据
                extendDao.insertSelective(extend);
            }
            // T区 不合格时流程表插入数据，合格不插入数据
            if (issue.getComments() != null && !"".equals(issue.getComments()) && issue.getIsRft() != null && "0".equals(issue.getIsRft())) {
                Advice deal = JSON.parseObject(issue.getComments(), Advice.class);
                // 状态
                if (deal != null) {
                    deal.setIssueId(issue.getId()); // 问题id
                    deal.setHandlerDate(new Date());
                    adviceDao.insertSelective(deal);

                    // 发邮件给处理人
                    Person toPerson = getPersonByAccout(issue.getProcessPersonAccount()); // 收件人
                    if (toPerson != null) {
                        sendEmail(toPerson.getEmail(), issue.getNumber(),issue);
                    }

                }
            } else {

                // 发邮件给对应区域所有质量工程师
                String zone = getZone(issue.getQualityType(), issue.getPlant());
                if (zone != null && !"".equals(zone)) {
                    List<BimsPerson> toPersonList = bimsPersonService.getAllQeByZone(zone);
                    if (toPersonList != null && toPersonList.size() > 0) {
                        sendEmail(getEmails(toPersonList), issue.getNumber(),issue);
                    }
                }

            }
            // 修改主表数据
            // 是否合格不为空，T区
            if(issue.getIsRft() != null) {
                if ("2".equals(issue.getIsRft())) {
                    // 合格分类及描述不更新
                    issue.setProcessStatus("7");
                }
                // 合格，问题描述及分类不用修改
                else if ("1".equals(issue.getIsRft())) {
                    // 合格分类及描述不更新
//                    issue.setIssueCategoryL1(null);
//                    issue.setIssueCategoryL2(null);
//                    issue.setIssueCategoryL3(null);
//                    issue.setIssueDesc(null);
                    issue.setProcessStatus("0");
                    // 处理人置空
                    issue.setProcessPerson("");
                    issue.setProcessPersonAccount("");
                    issue.setProcessPersonName("");
                } else {
                    issue.setProcessStatus("1");
                }
            }
            issue.setComments(null);
            if ("-1".equals(issue.getProcessStatus())){
                issue.setProcessStatus("0");
            }
            dao.updateByPrimaryKeySelective(issue);
            insertLog(issue.getId(), RecordStatusEnum.UPDATE);
            return 1;
        }
        return -1;
    }

    /**
     * 日志表
     * @param id
     * @param action
     * @return
     */
    private int insertLog(Integer id, RecordStatusEnum action) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("wx_person_info");
        DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(action.getCode()), person);
        dealLog.setIssueId(id);
        return logMapper.insert(dealLog);
    }

    /**
     * 通过account查询用户
     * @param account
     * @return
     */
    private Person getPersonByAccout(String account) {
        if (account != null && !"".equals(account)) {
            PersonCriteria personCriteria = new PersonCriteria();
            PersonCriteria.Criteria criteria = personCriteria.createCriteria();
            criteria.andDeletedEqualTo(false);
            criteria.andFiredEqualTo(false);
            criteria.andAccountEqualTo(account);
            List<Person> list = personMapper.selectByExample(personCriteria);
            if (list != null && list.size() > 0) {
                return list.get(0);
            }
        }
        return null;
    }

    /**
     * 日期格式化
     * @param date
     * @return
     */
    private String getFormatDate(Date date) {
        if (date != null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return format.format(date);
        }
        return "";
    }

    /**
     * 发送邮件
     * @return
     */
    private boolean sendEmail(String toEmails, String issueNo,Issue issue) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("wx_person_info");
        if (person != null) {
            return emailService.sendEmail(person.getEmail(), toEmails, issue.getPlantName()+'_'+issueNo+'_'+issue.getIssueDesc(),
                    "<br><strong>BIMS系统通知</strong><br><br>" + person.getName() + "（线边）提交任务，请及时在BIMS系统中处理，谢谢！<br><br>工厂："
                            + issue.getPlantName() + "<br><br>问题编号："+ issueNo +"<br><br>问题描述："+ issue.getIssueDesc() + "<br><br>时间：" + getFormatDate(new Date()) + "<br>");
        }
        return false;
    }

    /**
     * 获取所属区域
     * @param zone
     * @param plant
     * @return
     */
    private String getZone(String zone, String plant) {
        String result = "";
        if (zone != null) {
            if ("A".equals(zone)) {
                result = "8";
            } else {
                if ("T".equals(zone)) {
                    result = "1";
                } else {
                    if ("M".equals(zone)) {
                        result = "2";
                    }
                }
            }
        }
        if (plant != null) {
            if ("63".equals(plant)) {
                result += "X";
            } else {
                if ("64".equals(plant)) {
                    result += "F";
                }
            }
        }
        return result;
    }

    /**
     * 获取email列表
     * @param personList
     * @return
     */
    private String getEmails(List<BimsPerson> personList) {
        if (personList != null && personList.size() > 0) {
            String emails = "";
            Iterator<BimsPerson> iter = personList.iterator();
            while(iter.hasNext()) {
                BimsPerson bimsPerson = iter.next();
                if (bimsPerson.getEmail() != null && !"".equals(bimsPerson.getEmail())) {
                    emails += bimsPerson.getEmail() + ";";
                }
            }
            return emails;
        }
        return null;
    }

    /**
     * 删除数据
     * @param issue
     * @return
     */
//    private int deleteTempIssue(Issue issue) {
//        IssueCriteria issueCriteria = new IssueCriteria();
//        IssueCriteria.Criteria criteria = issueCriteria.createCriteria();
//        criteria.andQualityTypeEqualTo(issue.getQualityType()); // 大区
//        criteria.andInputPersonAccountEqualTo(issue.getInputPersonAccount()); // 登录用户工号
//        criteria.andSubSourceEqualTo("1"); // pad提交
//        criteria.andProcessStatusEqualTo("213");
//        return dao.deleteByExample(issueCriteria);
//    }

    /**
     * 保存
     * @param issue
     * @return
     */
//    @Override
//    @Transactional
//    public int save(Issue issue) {
//        issue.setProcessStatus("213");
//        issue.setSubSource("1"); // pad提交
//        deleteTempIssue(issue);
//        return dao.insert(issue);
//    }

    /**
     * 获取保存问题信息
     * @return
     */
//    @Override
//    public List<Issue> getTempIssue(Issue issue) {
//        IssueCriteria issueCriteria = new IssueCriteria();
//        IssueCriteria.Criteria criteria = issueCriteria.createCriteria();
//        criteria.andQualityTypeEqualTo(issue.getQualityType()); // 大区
//        criteria.andInputPersonAccountEqualTo(issue.getInputPersonAccount()); // 登录用户工号
//        criteria.andSubSourceEqualTo("1"); // pad提交
//        criteria.andProcessStatusEqualTo("213");
//        return dao.selectByExample(issueCriteria);
//    }
}
