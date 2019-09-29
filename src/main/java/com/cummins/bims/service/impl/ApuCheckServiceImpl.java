package com.cummins.bims.service.impl;

import com.cummins.bims.dao.*;
import com.cummins.bims.dto.*;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.enums.RecordStatusEnum;
import com.cummins.bims.service.PersonService;
import com.cummins.bims.service.SendEmailService;
import com.cummins.contact.dao.PersonMapper;
import com.cummins.contact.dto.Person;
import com.cummins.contact.dto.PersonCriteria;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.cummins.sevenstepscar.service.SevenStepsService;
import com.cummins.util.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

import static com.cummins.util.DateUtil.format;

@Service
public class ApuCheckServiceImpl implements ApuCheckService {
    @Autowired
    private BillMapper billMapper;

    @Autowired
    private IssueMapper issueMapper;

    @Autowired
    private IssueExtendMapper issueExtendMapper;

    @Autowired
    private DealLogMapper dealLogMapper;

    @Autowired
    private NotificationMapper notificationMapper;

    @Autowired
    private AdviceMapper adviceMapper;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private DealToolPersonMapper dealToolPersonMapper;

    @Autowired
    private SevenStepsService sevenStepsService;

    @Autowired
    private SendEmailService sendEmailService;

    @Autowired
    private PersonService personService;

    /**
     * 列表条件查询
     * @param search
     * @return
     */
    @Override
    public Page<IssueParam> getList(SearchParam search) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Page<IssueParam> list = new Page<>();
        PageHelper.startPage(search.getPageNo(), search.getPageSize());
        if (search != null) {
            search.setAccount(person.getAccount());
            // 如果是处理人，只查询不合格
            /*if (person != null && person.getBelongRole() != null && person.getBelongRole().contains("6")) {
                search.setIsRft(String.valueOf(0));
            }*/
            list = (Page<IssueParam>) issueMapper.getIssueListByArea(search);
            if (list != null && list.size() > 0) {
                return setToolList(list);
            }
        }
        return list;
    }

    @Override
    public Page<IssueParam> getList1(SearchParam search) {
        Page<IssueParam> list = new Page<>();
        PageHelper.startPage(search.getPageNo(), search.getPageSize());
        if (search != null) {
            list = (Page<IssueParam>) issueMapper.getList(search);
            if (list != null && list.size() > 0) {
                return setToolList(list);
            }
        }
        return list;
    }

    @Override
    public IssueExtend getIssueExtend(Issue issue) {
        IssueExtendCriteria criteria = new IssueExtendCriteria();
        criteria.createCriteria().andIssueManageIdEqualTo(Integer.valueOf(issue.getId()));
        List<IssueExtend> list = issueExtendMapper.selectByExample(criteria);
        if (list.size()>0){
            return list.get(0);
        }
        return new IssueExtend();
    }

    /**
     * 新增问题
     * @param issue
     * @param person
     * @return 成功返回id，失败返回0
     */
    @Override
    @Transactional
    public Integer apuAdd(Issue issue,BimsPerson person) {
        issue.setInputTime(new Date());
        issue.setDelflag("1");//1 未删除
        issue.setSubSource("2");//1 pad提交 2 web提交
        //是否去工作台接收任务
        if (issue.getQualityType().equals("B") || issue.getQualityType().equals("E") || issue.getQualityType().equals("S")){
            issue.setProcessStatus("0");//待接收
        }
        else {
            issue.setProcessPerson(String.valueOf(person.getId()));
            issue.setProcessPersonName(person.getName());
            issue.setProcessPersonAccount(person.getAccount());
            issue.setProcessStatus("1");//已接收待处理
        }
        issue.setIsEqr("0");    //初始化状态
        issue.setProcessTime(new Date());
        Integer i = issueMapper.insertSelective(issue);
        Integer id = issue.getId();// i == null
        if(i > 0){//如果插入成功
            id = issue.getId();//i为主键自增id
            if (issue.getIssueExtend()!=null && issue.getIssueExtend()!=""){
                IssueExtend issueExtend =  new IssueExtend();
                issueExtend.setIssueManageId(id);
                issueExtend.setAttribute(issue.getIssueExtend());
                issueExtendMapper.insertSelective(issueExtend);
            }
            //插入处理记录
            DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.SUMITISSUE.getCode()),person);
            dealLog.setIssueId(id);
            dealLogMapper.insert(dealLog);
            return id;
        }
        return 0;
    }

    /*@Override
    public Integer apudel(Issue issue) {
        IssueExtendCriteria criteria = new IssueExtendCriteria();
        criteria.createCriteria().andIssueManageIdEqualTo(issue.getId());
        issueExtendMapper.deleteByExample(criteria);
        return issueMapper.deleteByPrimaryKey(issue.getId());
    }*/

    @Override
    public Integer apudel(Issue issue) {
        issue.setDelflag("2");//设置删除状态
        return issueMapper.updateByPrimaryKeySelective(issue);
    }

    @Override
    public Issue apuDetail(String id) {
        Issue issue = issueMapper.selectByPrimaryKey(Integer.valueOf(id));
        return issue;
    }

    @Override
    public Map<String, Object> getIssueInfo(String id) {
        return issueMapper.selectById(Integer.valueOf(id));
    }

    /**
     * 修正
     * @param issue
     * @param person
     * @return
     */
    @Override
    public Integer apuCorrect(Issue issue, BimsPerson person) {
        issue.setProcessStatus("2");
        issue.setProcessTime(new Date());
        //插入处理记录
        DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.UPDATEISSUE.getCode()),person);
        dealLog.setIssueId(issue.getId());
        dealLogMapper.insert(dealLog);

        if (issue.getIssueExtend()!=null && issue.getIssueExtend()!=""){
            IssueExtendCriteria criteria = new IssueExtendCriteria();
            criteria.createCriteria().andIssueManageIdEqualTo(issue.getId());
            IssueExtend issueExtend =  new IssueExtend();
            issueExtend.setAttribute(issue.getIssueExtend());
            issueExtendMapper.updateByExampleSelective(issueExtend,criteria);
        }
        return issueMapper.updateByPrimaryKeySelective(issue);
    }



    @Override
    public Integer isEqr(Bill bill, BimsPerson person) {

        Issue issue = issueMapper.selectByPrimaryKey(Integer.valueOf(bill.getIssueId()));
        issue.setIsEqr(bill.getIsEqr());
        //插入处理记录
        DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.SELECTEQR.getCode()),person);
        dealLogMapper.insert(dealLog);

        //如果选择了EQR就初始化问题通知单
        if (bill.getIsEqr().equals("1")){
            this.saveNotification(issue);
        }
        return issueMapper.updateByPrimaryKeySelective(issue);
    }

    /**
     * 决定谁处理
     * @param bill
     * @param eqrLeader
     * @param person
     * @return
     */
    @Override
    public Integer isEqrTrue(Bill bill, String eqrLeader, BimsPerson person) {

        Issue issue = issueMapper.selectByPrimaryKey(Integer.valueOf(bill.getIssueId()));
        issue.setIsEqr(bill.getIsEqr());

        //获取选中的eqrLeader
        if(!eqrLeader.equals("none")) {
            PersonCriteria pExample = new PersonCriteria();
            PersonCriteria.Criteria query = pExample.createCriteria();
            query.andAccountEqualTo(eqrLeader);
            List<Person> personList = personMapper.selectByExample(pExample);
            if (personList.size() > 0) {
                //修改处理人 因为该问题转交给leader
                issue.setProcessPerson(String.valueOf(personList.get(0).getId()));
                issue.setProcessPersonAccount(personList.get(0).getAccount());
                issue.setProcessPersonName(personList.get(0).getName());
            }
        }

        //如果选择了EQR就初始化问题通知单
        if (bill.getIsEqr().equals("1")){
            this.saveNotification(issue);
            //插入处理记录
            DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.SELECTEQR.getCode()),person);
            dealLogMapper.insert(dealLog);

            //发送邮件
            String title="BIMS系统通知";
            String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" + issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
            sendEmailService.sendEmail(person.getEmail(),personService.getPerson(issue.getProcessPersonAccount()).getEmail(),title,content);
        }
        return issueMapper.updateByPrimaryKeySelective(issue);
    }

    @Override
    public Integer dealtool(DealTool dealTool, BimsPerson person) {
        Issue issue = issueMapper.selectByPrimaryKey(Integer.valueOf(dealTool.getIssueId()));
        issue.setProcessMethod(dealTool.getProcessTool());
        issue.setProcessStatus("4");
        issueMapper.updateByPrimaryKeySelective(issue);
        //插入处理记录
        DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.SELECTDUTYPERSON.getCode()),person);
        dealLog.setIssueId(Integer.valueOf(dealTool.getIssueId()));
        return dealLogMapper.insert(dealLog);
    }

    @Override
    public Integer receive(Issue issue, BimsPerson person) {
        issue.setProcessStatus("1");
        issue.setProcessTime(new Date());
        issue.setProcessPerson(String.valueOf(person.getId()));
        issue.setProcessPersonName(person.getName());
        issue.setProcessPersonAccount(person.getAccount());
        return issueMapper.updateByPrimaryKeySelective(issue);

    }

    @Override
    public Integer reject(Issue issue, BimsPerson person) {
        issue.setProcessStatus("-1");
        return issueMapper.updateByPrimaryKeySelective(issue);
    }

    @Override
    @Transactional
    public Integer closeIssue(Issue issue,BimsPerson person) {
        //根据issueID查询所有的工具丶单据
        issue.setProcessStatus("7");//设置关闭状态
        issue.setCloseTime(new Date());
        //插入处理记录
        DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.CLOSE.getCode()),person);
        dealLog.setIssueId(issue.getId());
        dealLogMapper.insert(dealLog);
        //关闭tool_person表中的数据 将状态置为 4
        DealToolPersonCriteria dtpExamp = new DealToolPersonCriteria();
        dtpExamp.createCriteria().andIssueIdEqualTo(issue.getId());
        DealToolPerson dealToolPerson = new DealToolPerson();
        dealToolPerson.setIssueId(issue.getId());
        dealToolPerson.setStatus((byte) 4);
        dealToolPersonMapper.updateByExampleSelective(dealToolPerson, dtpExamp);    //关闭
        sevenStepsService.changeScarStep(issue.getId());    //关闭scar
        sevenStepsService.changeSevenStep(issue.getId());   //关闭7 step
        return issueMapper.updateByPrimaryKeySelective(issue);  //关闭问题
    }

    @Override
    @Transactional
    public Integer sendAdvice(Issue issue, BimsPerson person) {
        //插入处理记录
        DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.UPDATEISSUE.getCode()),person);
        dealLog.setIssueId(issue.getId());
        dealLogMapper.insert(dealLog);
        //如果是T区，插入意见表
        if (issue.getQualityType().equals("T")){
            if(issue.getComments()!=null){
                this.addAdvice(issue,person);
                issue.setProcessTime(new Date());
                issue.setProcessStatus("8");
                issue.setComments("");
            }
        }
        /*if (issue.getIssueExtend()!=null && issue.getIssueExtend()!=""){
            IssueExtendCriteria criteria = new IssueExtendCriteria();
            criteria.createCriteria().andIssueManageIdEqualTo(issue.getId());
            IssueExtend issueExtend =  new IssueExtend();
            issueExtend.setAttribute(issue.getIssueExtend());
            issueExtendMapper.updateByExampleSelective(issueExtend,criteria);
        }*/
        return issueMapper.updateByPrimaryKeySelective(issue);
    }


    //初始化通知单数据
    public Integer saveNotification(Issue issue){
        Notification notification = new Notification();
        notification.setIssueId(issue.getId());
        notification.setIssueDesc(issue.getIssueDesc());
        notification.setIssueDate(issue.getInputTime());
        notification.setIssueArea(issue.getArea());
        notification.setStationNo(issue.getIssueStation());
        notification.setEngineType(issue.getEngineType());
        notification.setEngineSerialNo(issue.getEsn());
        notification.setPartNo(issue.getPartNo());
        notification.setPartName(issue.getPartName());
        notification.setSupplierName(issue.getVendorName());
        return notificationMapper.insert(notification);
    }

    //如果是T区插入处理意见
    public Integer addAdvice(Issue issue,BimsPerson person){
        AdviceCriteria criteria = new AdviceCriteria();
        criteria.createCriteria().andResolutionIsNull().andHandlerPersonAccountEqualTo(person.getAccount()).andIssueIdEqualTo(issue.getId());
        Advice advice = new Advice();
        advice.setHandlerDate(new Date());
        advice.setResolution(issue.getComments());

        // 企业微信发送消息
        issue = issueMapper.selectByPrimaryKey(issue.getId());
        SendMsg.sendAdvice(issue, advice);

        return adviceMapper.updateByExampleSelective(advice,criteria);
    }

    /**
    * @Author : wdxu
    * @Date :14:08 2019/7/8
    * @Description: 插入日志
    */
    @Override
    public void addDealLog(DealLog dealLog){
        dealLogMapper.insert(dealLog);
    }

    /**
     * 查询工具表
     * @param list
     * @return
     */
    private Page<IssueParam> setToolList(Page<IssueParam> list) {
        Iterator<IssueParam> iter = list.iterator();
        // 循环查询工具列表
        while(iter.hasNext()) {
            IssueParam iss = iter.next();
            DealToolPersonCriteria dealToolPersonCriteria = new DealToolPersonCriteria();
            DealToolPersonCriteria.Criteria criteria = dealToolPersonCriteria.createCriteria();
            criteria.andIssueIdEqualTo(iss.getId());
            criteria.andTypeEqualTo(Byte.valueOf("1"));
            List<DealToolPerson> toolList = dealToolPersonMapper.selectByExample(dealToolPersonCriteria);
            if (toolList != null && toolList.size() > 0) {
                Set<Byte> statusSet = new HashSet<>(); // 状态
                StringBuffer buffer = new StringBuffer(); // 处理工具责任人
                Iterator<DealToolPerson> tIter = toolList.iterator();
                while(tIter.hasNext()) {
                    DealToolPerson dtp = tIter.next();
                    if (dtp.getStatus() != null) {
                        statusSet.add(dtp.getStatus());
                    }
                    if (dtp.getToolName() != null && !"".equals(dtp.getToolName())) {
                        buffer.append(dtp.getToolName());
                    } else {
                        buffer.append("--");
                    }
                    buffer.append("/");
                    if (dtp.getProcessPersonName() != null && !"".equals(dtp.getProcessPersonName())) {
                        buffer.append(dtp.getProcessPersonName());
                    } else {
                        buffer.append("--");
                    }
                    buffer.append("<br>");
                }
                if (statusSet.size() == 1) {
                    if (statusSet.contains(Byte.valueOf("0"))) {
                        iss.setToolStatus("待跟踪");
                    } else {
                        if(statusSet.contains(Byte.valueOf("4"))) {
                            iss.setToolStatus("已跟踪");
                        } else {
                            iss.setToolStatus("跟踪中");
                        }
                    }
                } else {
                    if (statusSet.size() > 1) {
                        iss.setToolStatus("跟踪中");
                    }
                }
                iss.setTools(buffer.toString());
            }

            BillCriteria billCriteria = new BillCriteria();
            BillCriteria.Criteria query = billCriteria.createCriteria();
            query.andIssueIdEqualTo(String.valueOf(iss.getId()));
            List<Bill> billList = billMapper.selectByExample(billCriteria);
            if (toolList != null && toolList.size() > 0) {
                iss.setBillList(billList);
                Set<Byte> statusSet = new HashSet<>(); // 状态
                StringBuffer buffer = new StringBuffer(); // 编号和名称
                Iterator<Bill> billIterator = billList.iterator();
                while(billIterator.hasNext()) {
                    Bill bill = billIterator.next();
                    if (bill.getMeasureNo() != null && !"".equals(bill.getMeasureNo())) {
                        buffer.append(bill.getMeasureNo());
                    } else {
                        buffer.append("--");
                    }
                    buffer.append("(");
                    if (bill.getBillName() != null && !"".equals(bill.getBillName())) {
                        buffer.append(bill.getBillName()+")");
                    } else {
                        buffer.append("--");
                    }
                    buffer.append("<br>");
                }
                iss.setBills(buffer.toString());
            }
        }
        return list;
    }
}
