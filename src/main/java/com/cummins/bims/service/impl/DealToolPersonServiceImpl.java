package com.cummins.bims.service.impl;

import com.cummins.bims.dao.*;
import com.cummins.bims.dto.*;
import com.cummins.bims.enums.DictEnum;
import com.cummins.bims.enums.RecordStatusEnum;
import com.cummins.bims.enums.ToolEnum;
import com.cummins.bims.service.DealLogService;
import com.cummins.bims.service.DealToolPersonService;
import com.cummins.bims.service.NotificationService;
import com.cummins.bims.service.NumberService;
import com.cummins.contact.dao.ConnPersonDepartMapper;
import com.cummins.contact.dao.PersonMapper;
import com.cummins.contact.dto.ConnPersonDepart;
import com.cummins.contact.dto.ConnPersonDepartCriteria;
import com.cummins.contact.dto.Person;
import com.cummins.contact.dto.PersonCriteria;
import com.cummins.permission.model.BimsPerson;
import com.cummins.sevenstepscar.dao.ToolsSevenStepsMapper;
import com.cummins.sevenstepscar.model.ToolsSevenSteps;
import com.cummins.util.DealLogUtil;
import com.cummins.util.StringUtil;
import com.cummins.util.ToolLogUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DealToolPersonServiceImpl implements DealToolPersonService {

    @Autowired
    private DealToolPersonMapper dealToolPersonMapper;

    @Autowired
    private DealLogMapper dealLogMapper;

    @Autowired
    private IssueMapper issueMapper;

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private PQCToolMapper pqcToolMapper;

    @Autowired
    private ConnPersonDepartMapper connPersonDepartMapper;

    @Autowired
    private ToolNotificationMapper toolNotificationMapper;

    @Autowired
    private ToolsSevenStepsMapper toolsSevenStepsMapper;

    @Autowired
    private ToolLogMapper toolLogMapper;

    @Autowired
    private NumberService numberService;

    /**
     * 批量新增
     * @param jsonArr
     * @return
     */
    @Override
    @Transactional
    public List<DealToolPerson> addToolBatch(String jsonArr, BimsPerson person) {
        Gson gson = new Gson();
        //解析jsonArr
        List<DealToolPerson> dealTools = gson.fromJson(jsonArr, new TypeToken<List<DealToolPerson>>() {}.getType());
        List<DealToolPerson> insertTools = new ArrayList<>();
        for(DealToolPerson dealTool : dealTools) {
            //把一个对象拆成两个 存储
            DealToolPerson dealToolPerson = new DealToolPerson();
            BeanUtils.copyProperties(dealTool, dealToolPerson); //拷贝对象
            dealToolPerson.setProcessPersonAccount(dealTool.getReviewPersonAccount());  //设置主对象中的信息到副对象
            dealToolPerson.setProcessPersonName(dealTool.getReviewPersonName());//设置主对象中的信息到副对象
            //置空主对象中不需要的属性
            //dealTool.setReviewPersonAccount(null);
            //dealTool.setReviewPersonName(null);
            if(null != person) {
                dealTool.setIntPersonAccount(person.getAccount());  //发起人account
                dealTool.setInitPersonName(person.getName());   //发起人
                dealToolPerson.setIntPersonAccount(person.getAccount());  //发起人account
                dealToolPerson.setInitPersonName(person.getName());   //发起人
            }
            dealTool.setCreateTime(new Date()); //发起时间
            dealToolPerson.setCreateTime(new Date()); //发起时间
            dealTool.setType((byte) 1); //类型 1负责人
            dealToolPerson.setType((byte) 2); //类型 2审核人

            //插入
            Integer toolId = this.addStep1(dealTool);
            //将工具的ID返回并且加入到dealTool中
            dealTool.setToolNo(String.valueOf(toolId)); //工具ID
            dealToolPerson.setToolNo(String.valueOf(toolId)); //工具ID

            dealTool.setToolName(ToolEnum.getNameByCode(Integer.valueOf(dealTool.getToolType())));  //工具的名称
            dealToolPerson.setToolName(ToolEnum.getNameByCode(Integer.valueOf(dealTool.getToolType())));  //工具的名称
            //初始状态都设置为0
            dealTool.setStatus((byte) DictEnum.STATUS_INIT.getCode());
            dealToolPerson.setStatus((byte) DictEnum.STATUS_INIT.getCode());
            insertTools.add(dealTool);
            insertTools.add(dealToolPerson);
            //插入处理记录
            DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.SELECTDUTYPERSON.getCode()),person);
            dealLog.setIssueId(Integer.valueOf(dealTool.getIssueId()));
            dealLogMapper.insert(dealLog);
            //插入工具日志
            ToolLog toolLog = ToolLogUtil.getDealLog(person);
            toolLog.setToolId(toolId);
            toolLog.setAction("创建工具");
            toolLogMapper.insert(toolLog);

        }
        dealToolPersonMapper.insertBatch(insertTools);
        return dealTools;
    }

    public Integer addStep1(DealToolPerson dealTool) {
        //7 Step
        if (dealTool.getToolType() == 3){
            //组装7 Step对象
            ToolsSevenSteps toolsSevenSteps = new ToolsSevenSteps();
            toolsSevenSteps.setIssueNumber(numberService.selectMaxCarNo("7STEP"));
            toolsSevenSteps.setIssueId(dealTool.getIssueId());
            toolsSevenSteps.setCreateTime(new Date());
            toolsSevenSteps.setType(1); //7 step
            toolsSevenSteps.setBack3("0");    //步数 初始化第0步
            toolsSevenSteps.setBack1(dealTool.getProcessPersonAccount());
            toolsSevenSteps.setBack2(dealTool.getReviewPersonAccount());
            toolsSevenSteps.setBack5(dealTool.getIntPersonAccount());
            toolsSevenStepsMapper.insert(toolsSevenSteps);
            return toolsSevenSteps.getId();
        //Notification
        } else if(dealTool.getToolType() == 4) {
            ToolNotification toolNotification = new ToolNotification();
            toolNotification.setCreateTime(new Date());
            toolNotificationMapper.insert(toolNotification);
            return toolNotification.getId();
        //Scar
        } else if (dealTool.getToolType() == 5){
            PQCTool pqcTool = new PQCTool();
            pqcTool.setCreateDate(new Date());
            pqcTool.setTargetDate(new Date());
            pqcTool.setIssueId(String.valueOf(dealTool.getIssueId()));
            pqcTool.setStatus("1");
            pqcToolMapper.insert(pqcTool);
            return pqcTool.getId();
        }else if(dealTool.getToolType() == 2) {
            //组装7 Step对象
            ToolsSevenSteps toolsSevenSteps = new ToolsSevenSteps();
            toolsSevenSteps.setIssueNumber(numberService.selectMaxCarNo("SCAR"));
            toolsSevenSteps.setIssueId(dealTool.getIssueId());
            toolsSevenSteps.setCreateTime(new Date());
            toolsSevenSteps.setType(2); //scar

            toolsSevenSteps.setBack3("0");    //步数 初始化第0步
            toolsSevenSteps.setBack1(dealTool.getProcessPersonAccount());
            toolsSevenSteps.setBack2(dealTool.getReviewPersonAccount());
            toolsSevenSteps.setBack5(dealTool.getIntPersonAccount());
            toolsSevenStepsMapper.insert(toolsSevenSteps);
            return toolsSevenSteps.getId();
        //Car
        } else if(dealTool.getToolType() == 1) {
            Car car = new Car();
            car.setIssueId(dealTool.getIssueId());
            car.setToolId(dealTool.getId());
            car.setIssueTitle(issueMapper.selectByPrimaryKey(dealTool.getIssueId()).getIssueDesc());
            car.setCarNo(numberService.selectMaxCarNo("CAR"));
            car.setCarType(String.valueOf(dealTool.getToolType()));
            car.setSponsorName(dealTool.getInitPersonName());
            car.setSponsor(dealTool.getIntPersonAccount());
            car.setDutyPerson(dealTool.getProcessPersonAccount());
            car.setDutyPersonName(dealTool.getProcessPersonName());
            car.setConfirmPerson(dealTool.getReviewPersonAccount());
            car.setConfirmPersonName(dealTool.getReviewPersonName());
            car.setCreateDate(new Date());
            //查询number
//            Issue issue = issueMapper.selectByPrimaryKey(dealTool.getIssueId());
            //责任部门查询并存入car对象
            //根据责任人account查询责任人所属部门
            PersonCriteria pExample = new PersonCriteria();
            PersonCriteria.Criteria pQuery = pExample.createCriteria();
            pQuery.andAccountEqualTo(dealTool.getProcessPersonAccount());
            pQuery.andDeletedEqualTo(false);
            pQuery.andFiredEqualTo(false);
            List<Person> personList = personMapper.selectByExample(pExample);
            if(personList != null && personList.size()>0) {
                ConnPersonDepartCriteria cpExample = new ConnPersonDepartCriteria();
                ConnPersonDepartCriteria.Criteria cpcriteria = cpExample.createCriteria();
                cpcriteria.andPersonIdEqualTo(personList.get(0).getId());
                List<ConnPersonDepart> connPersonDeparts = connPersonDepartMapper.selectByExample(cpExample);
                if (connPersonDeparts != null && connPersonDeparts.size()>0) {
                    car.setDutyDept(connPersonDeparts.get(0).getDepartName());
                }
            }
            carMapper.insert(car);
            //返回carID
            return car.getId();
        }
        return 0;
    }

    @Override
    public Integer delTool(DealToolPerson dealTool) {
        DealToolPersonCriteria example = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria criteria = example.createCriteria();
        criteria.andToolNoEqualTo(dealTool.getToolNo());
        return dealToolPersonMapper.deleteByExample(example);
    }

    @Override
    public List<DealToolPerson> getToolTabs(DealToolPerson dealTool,BimsPerson person) {
        List<DealToolPerson> toolTabs = dealToolPersonMapper.getToolTabs(dealTool);
        String account = person.getAccount();
        List<DealToolPerson> newToolTabs = new ArrayList<>();
        List<DealToolPerson> list1 = new ArrayList<>();
        List<DealToolPerson> list2 = new ArrayList<>();
        for(DealToolPerson toolPerson : toolTabs) {
            //如果该工具的发起人是当前的登录用户，则显示全部的工具
            if(toolPerson.getIntPersonAccount().equals(account)) {
                if(toolPerson.getType() == DictEnum.TYPE_DUTY.getCode()) {  //责任人
                    list1.add(toolPerson);
                    continue;
                } else if(toolPerson.getType() == DictEnum.TYPE_REVIEW.getCode()) { //审核人
                    list2.add(toolPerson);
                    continue;
                } else {
                    continue;
                }
                //newToolTabs = list1;
                //break;
            //如果当前工具的申请人等于当前登录用户 则显示当前工具
            } else if(null != toolPerson.getProcessPersonAccount() && toolPerson.getProcessPersonAccount().equals(account)){
                //首先判断是什么角色，在根据角色判断是否是待办 如果是待办则设置toDoStatus为0 否则设置为1
                byte type = toolPerson.getType();
                switch(type) {
                    case 1: //责任人
                        if(toolPerson.getStatus() == DictEnum.STATUS_WAIT.getCode()) {  //责任人的待办 status=1
                            toolPerson.setToDoStatus(DictEnum.TO_DO.getCode());
                        }
                        newToolTabs.add(toolPerson);
                        continue;
                    case 2: //审核人
                        if(toolPerson.getStatus() == DictEnum.STATUS_WAIT.getCode()) {  //责任人的待办 status=1
                            toolPerson.setToDoStatus(DictEnum.TO_DO.getCode());
                        }
                        newToolTabs.add(toolPerson);
                        continue;
                    case 3: //质量经理
                        if(toolPerson.getStatus() == DictEnum.STATUS_WAIT.getCode()) {  //责任人的待办 status=1
                            toolPerson.setToDoStatus(DictEnum.TO_DO.getCode());
                        }
                        newToolTabs.add(toolPerson);
                        continue;
                    default:
                        continue;
                }
            }
        }
        for(DealToolPerson toolPerson1 : list1) {
            for(DealToolPerson toolPerson2 : list2) {
                if(toolPerson1.getToolNo().equals(toolPerson2.getToolNo())) {   //责任人 审核人合并为一条数据
                    if(toolPerson1.getStatus() == DictEnum.STATUS_INIT.getCode()) {
                        toolPerson1.setToDoStatus(DictEnum.TO_DO.getCode());
                    }
                    if ("".equals(toolPerson1.getProcessPersonAccount()) || toolPerson1.getProcessPersonAccount()==null){
                        toolPerson1.setToDoStatus(DictEnum.TO_DO.getCode());
                        newToolTabs.add(toolPerson1);
                        continue;
                    }else{
                        if(toolPerson1.getProcessPersonAccount().equals(person.getAccount()) && toolPerson1.getStatus() == DictEnum.STATUS_WAIT.getCode()) {
                            toolPerson1.setToDoStatus(DictEnum.TO_DO.getCode());
                        }
                        if(toolPerson2.getProcessPersonAccount().equals(person.getAccount()) && toolPerson2.getStatus() == DictEnum.STATUS_WAIT.getCode()) {
                            toolPerson1.setToDoStatus(DictEnum.TO_DO.getCode());
                        }
                        toolPerson1.setReviewPersonAccount(toolPerson2.getReviewPersonAccount());
                        toolPerson1.setReviewPersonName(toolPerson2.getProcessPersonName());
                        newToolTabs.add(toolPerson1);
                        continue;
                    }
                }
            }
        }
        return newToolTabs;
    }

    @Override
    public List<DealToolPerson> getTools(DealToolPerson dealTool) {
        DealToolPersonCriteria example = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria query = example.createCriteria();
        query.andIssueIdEqualTo(dealTool.getIssueId());
        example.setOrderByClause("tool_no desc");
        List<DealToolPerson> dealToolPersonList = dealToolPersonMapper.selectByExample(example);
        List<DealToolPerson> dealToolPersons1 = new ArrayList<>();
        List<DealToolPerson> dealToolPersons2 = new ArrayList<>();
        //先把他们根据type拆成两个List
        for(DealToolPerson dealToolPerson:dealToolPersonList) {
            if(dealToolPerson.getType() == 2) {
                dealToolPersons2.add(dealToolPerson);
            } else if(dealToolPerson.getType() == 1){
                dealToolPersons1.add(dealToolPerson);
            }
        }
        //循环判断
        for(DealToolPerson dealToolPerson1 : dealToolPersons1) {
            for(DealToolPerson dealToolPerson2 : dealToolPersons2) {
                //如果toolNo相同 则将2的人放入到1中
                if(dealToolPerson1.getToolNo().equals(dealToolPerson2.getToolNo())) {
                    dealToolPerson1.setReviewPersonName(dealToolPerson2.getProcessPersonName());
                }
            }
        }
        return dealToolPersons1;
    }

    /**
     * 查询List列表
     */
    @Override
    public List<DealToolPerson> selectList(DealToolPerson dealTool) {
        DealToolPersonCriteria emp = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria query = emp.createCriteria();
        if(StringUtil.isNotBlank(dealTool.getToolNo())) {
            query.andToolNoEqualTo(dealTool.getToolNo());
        }
        List<DealToolPerson> dealToolPersonList = dealToolPersonMapper.selectByExample(emp);
        return dealToolPersonList;
    }

    @Override
    public DealToolPerson getDealToolPerson(DealToolPerson dealTool,BimsPerson person) {
        DealToolPersonCriteria example = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria query = example.createCriteria();
        query.andIssueIdEqualTo(dealTool.getIssueId()).andToolNoEqualTo(dealTool.getToolNo());
        List<DealToolPerson> dealToolPeople = dealToolPersonMapper.selectByExample(example);
        for (DealToolPerson toolPerson: dealToolPeople) {
            //如果查看问题的人是当前登录人并且是责任人
            if(person.getAccount().equals(toolPerson.getProcessPersonAccount()) && toolPerson.getType()==1){
                return toolPerson;
            }
            //如果查看问题的人是当前登录人并且是审核人
            else if(person.getAccount().equals(toolPerson.getProcessPersonAccount()) && toolPerson.getType()==2){
                return toolPerson;
            }
            //如果查看问题的人是当前登录人并且是质量经理
            else if(person.getAccount().equals(toolPerson.getProcessPersonAccount()) && toolPerson.getType()==3){
                return toolPerson;
            }
            //如果查看问题的人是当前登录人并且是发起人
            else if(person.getAccount().equals(toolPerson.getProcessPersonAccount()) && toolPerson.getType()==4){
                return toolPerson;
            }
            //如果不满足上述条件则判断发起人是否填写第一步 即判断是否是责任人，并且status为初始状态
            //如果是责任人的初始状态 则说明是发起人的第一步未填写
            else if(person.getAccount().equals(toolPerson.getProcessPersonAccount()) && toolPerson.getType()==1 && toolPerson.getStatus()==0) {
                return toolPerson;
            }
            //如果是责任人的初始状态 则说明是发起人的第一步已填写
            else if(person.getAccount().equals(toolPerson.getProcessPersonAccount()) && toolPerson.getType()==1 && toolPerson.getStatus()==1) {
                return toolPerson;
            }
		/*else if (person.getAccount().equals(toolPerson.getIntPersonAccount())){
			return toolPerson;
		}*/
        }
        for (DealToolPerson toolPerson: dealToolPeople) {
            //如果为责任人且status为初始状态 则说明是发起人的待办 组装对象 type为0 status为1 业务层与model层约定
            if(toolPerson.getType()==DictEnum.TYPE_DUTY.getCode() && toolPerson.getStatus()==DictEnum.STATUS_INIT.getCode()){
                DealToolPerson dealToolPerson = new DealToolPerson();
                dealToolPerson.setProcessPersonAccount(person.getAccount());
                dealToolPerson.setStatus((byte) DictEnum.STATUS_WAIT.getCode());
                dealToolPerson.setType((byte) DictEnum.QUALITY_ENGINEER.getCode());
                dealToolPerson.setIntPersonAccount(person.getAccount());
                return dealToolPerson;
            }
        }


        return null;
    }

    /**
     * 根据issueID查询
     */
    @Override
    public DealToolPerson selectByIssueId(Integer id) {
        return null;
    }

    /**
     * 查询角色类型为 责任人的角色
     * @param dealTool
     * @return
     */
    @Override
    public DealToolPerson selectByToolId(DealToolPerson dealTool) {
        DealToolPersonCriteria emp = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria criteria = emp.createCriteria();
        criteria.andToolNoEqualTo(dealTool.getToolNo());
        criteria.andTypeEqualTo((byte) 1);
        List<DealToolPerson> dealToolPersonList = dealToolPersonMapper.selectByExample(emp);
        if(dealToolPersonList.size()>0) {
            return dealToolPersonList.get(0);
        }
        return null;
    }

    @Override
    public DealToolPerson selectNextPerson(DealToolPerson dealTool) {
        DealToolPersonCriteria emp = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria criteria = emp.createCriteria();
        criteria.andToolNoEqualTo(dealTool.getToolNo());
        criteria.andToolTypeEqualTo((byte) 1);
        criteria.andIssueIdEqualTo(dealTool.getIssueId());
        criteria.andStatusEqualTo((byte) 1);
        List<DealToolPerson> dealToolPersonList = dealToolPersonMapper.selectByExample(emp);
        if(dealToolPersonList.size()>0) {
            return dealToolPersonList.get(0);
        }
        return null;
    }

    /**
     * 查询是否都已处理
     * @param
     * @return
     */
    @Override
    public Boolean getStatus(Integer id) {
        DealToolPersonCriteria emp = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria criteria = emp.createCriteria();
        criteria.andIssueIdEqualTo(id);
        List<DealToolPerson> list = dealToolPersonMapper.selectByExample(emp);
        for (DealToolPerson dealToolPerson: list) {
            if (dealToolPerson.getStatus()==4){
                return true;
            }else{
                return false;//还有未完成的工具
            }
        }

        return false;
    }
}
