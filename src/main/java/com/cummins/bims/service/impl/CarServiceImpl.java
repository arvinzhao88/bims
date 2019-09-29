package com.cummins.bims.service.impl;

import com.cummins.bims.dao.*;
import com.cummins.bims.dto.*;
import com.cummins.bims.enums.DictEnum;
import com.cummins.bims.enums.RecordStatusEnum;
import com.cummins.bims.service.CarService;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.DealLogUtil;
import com.cummins.util.ShiroUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private IssueMapper issueMapper;

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private DealLogMapper dealLogMapper;

    @Autowired
    private CarExtendMapper carExtendMapper;

    @Autowired
    private CarLogMapper carLogMapper;

    @Autowired
    private DealToolPersonMapper dealToolPersonMapper;

    @Override
    @Transactional
    public Integer updStep1(Car car) {
        car.setCreateDate(new Date());
        carMapper.updateByPrimaryKeySelective(car);
        //组装DealToolPerson对象
        DealToolPerson dealToolPerson = new DealToolPerson();
        dealToolPerson.setStatus((byte) DictEnum.STATUS_WAIT.getCode());
        DealToolPersonCriteria example = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria query = example.createCriteria();
        query.andToolNoEqualTo(String.valueOf(car.getId()));
        query.andTypeEqualTo((byte) DictEnum.TYPE_DUTY.getCode());  //只修改责任人为待办
        int res = dealToolPersonMapper.updateByExampleSelective(dealToolPerson, example);
        return res;
    }

    /**
     * 责任人填写car
     * @param car
     * @return
     */
    @Override
    @Transactional
    public Integer updStep17(Car car) {

        if (null != car.getExt()){
            //删除
            CarExtendCriteria criteria = new CarExtendCriteria();
            criteria.createCriteria().andCarIdEqualTo(car.getId());
            carExtendMapper.deleteByExample(criteria);

            for (CarExtend ext:car.getExt()) {
                if (ext.getId()!=null){
                    ext.setCarId(car.getId());
                    carExtendMapper.insertSelective(ext);
                    //修改
                    //carExtendMapper.updateByPrimaryKeySelective(ext);
                }else {
                    ext.setCarId(car.getId());
                    //新增
                    carExtendMapper.insertSelective(ext);
                }
            }
            DealToolPerson dealToolPerson = new DealToolPerson();
            dealToolPerson.setStatus((byte) 2); //已处理
            dealToolPerson.setToolNo(String.valueOf(car.getId()));
            DealToolPersonCriteria emp = new DealToolPersonCriteria();
            DealToolPersonCriteria.Criteria deaquery = emp.createCriteria();
            deaquery.andToolNoEqualTo(String.valueOf(car.getId()));
            deaquery.andTypeEqualTo((byte) DictEnum.TYPE_DUTY.getCode());   //修改责任人为已处理
            dealToolPersonMapper.updateByExampleSelective(dealToolPerson, emp);
            //修改审核人为待处理
            dealToolPerson = new DealToolPerson();
            dealToolPerson.setStatus((byte) 1); //待处理
            dealToolPerson.setToolNo(String.valueOf(car.getId()));

            emp = new DealToolPersonCriteria();
            deaquery = emp.createCriteria();
            deaquery.andToolNoEqualTo(String.valueOf(car.getId()));
            deaquery.andTypeEqualTo((byte) DictEnum.TYPE_REVIEW.getCode());   //修改审核人为待处理
            dealToolPersonMapper.updateByExampleSelective(dealToolPerson, emp);

        }
        return carMapper.updateByPrimaryKeySelective(car);
    }

    @Override
    public Car getInfo(Integer id) {
        return carMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CarExtend> getExtCar(Car car) {
        CarExtendCriteria criteria = new CarExtendCriteria();
        criteria.createCriteria().andCarIdEqualTo(car.getId());
        return carExtendMapper.selectByExample(criteria);
    }

    @Override
    @Transactional
    public Integer reject(DealLog dealLog,BimsPerson person) {
        //插入处理记录
        /*DealLog log = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.REJECT.getCode()),person);
        log.setIssueId(dealLog.getIssueId());
        dealLogMapper.insert(log);*/

        Car car = new Car();
        car.setReviewStatus(3);
        car.setId(dealLog.getCarId());
        carMapper.updateByPrimaryKeySelective(car);

        //根据工具id 问题id 修改deal_tool_person 状态为驳回 将责任人修改为待处理
        DealToolPerson dealToolPerson1 = new DealToolPerson();
        dealToolPerson1.setStatus((byte) 1); //已关闭
        dealToolPerson1.setToolNo(String.valueOf(dealLog.getCarId()));
        dealToolPerson1.setIssueId(Integer.valueOf(dealLog.getIssueId()));
        dealToolPerson1.setBack2(dealLog.getRemark());

        DealToolPersonCriteria emp = new DealToolPersonCriteria();
        //组装条件 工具ID 问题ID 人员类型
        emp.createCriteria().andToolNoEqualTo(String.valueOf(dealLog.getCarId())).andIssueIdEqualTo(dealLog.getIssueId()).andTypeEqualTo((byte) DictEnum.TYPE_DUTY.getCode());
        dealToolPersonMapper.updateByExampleSelective(dealToolPerson1, emp);

        //根据工具id 问题id 修改deal_tool_person 状态为驳回
        DealToolPerson dealToolPerson2 = new DealToolPerson();
        dealToolPerson2.setStatus((byte) 0); //初始状态
        dealToolPerson2.setToolNo(String.valueOf(dealLog.getCarId()));
        dealToolPerson2.setIssueId(Integer.valueOf(dealLog.getIssueId()));
        dealToolPerson2.setBack2(dealLog.getRemark());
        DealToolPersonCriteria emp1 = new DealToolPersonCriteria();

        List<Byte> query = new ArrayList<>();
        query.add((byte) DictEnum.TYPE_REVIEW.getCode());
        query.add((byte) DictEnum.TYPE_QUALITY_MANAGER.getCode());
        emp1.createCriteria().andToolNoEqualTo(String.valueOf(dealLog.getCarId())).andIssueIdEqualTo(dealLog.getIssueId()).andTypeIn(query);
        int res = dealToolPersonMapper.updateByExampleSelective(dealToolPerson2, emp1);
        return res;
    }

    @Override
    public Integer agree(DealLog dealLog,BimsPerson person) {

        //插入处理记录
       /* DealLog log = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.CLOSE.getCode()),person);
        log.setIssueId(dealLog.getIssueId());
        dealLogMapper.insert(log);*/

        //修改状态为关闭
        DealToolPerson dealToolPerson1 = new DealToolPerson();
        dealToolPerson1.setStatus((byte) 4); //已关闭
        dealToolPerson1.setToolNo(String.valueOf(dealLog.getCarId()));
        dealToolPerson1.setIssueId(Integer.valueOf(dealLog.getIssueId()));
        DealToolPersonCriteria emp = new DealToolPersonCriteria();
        emp.createCriteria().andToolNoEqualTo(String.valueOf(dealLog.getCarId())).andIssueIdEqualTo(dealLog.getIssueId());
        return dealToolPersonMapper.updateByExampleSelective(dealToolPerson1, emp);
    }

    @Override
    public Integer addCarSteplast(CarParam car, BimsPerson person) {

        //根据工具ID查询这个工具下的责任人 审核人等...
        DealToolPersonCriteria emp2 = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria dealQuery1 = emp2.createCriteria();
        dealQuery1.andIssueIdEqualTo(Integer.valueOf(car.getIssueId()));
        dealQuery1.andToolNoEqualTo(String.valueOf(car.getId()));

        List<DealToolPerson> list1 = dealToolPersonMapper.selectByExample(emp2);
        for(DealToolPerson dperson : list1) {
            if(dperson.getType() != DictEnum.TYPE_QUALITY_MANAGER.getCode() && dperson.getProcessPersonAccount().equals(car.getProcessPersonAccount())
                    || dperson.getIntPersonAccount().equals(car.getProcessPersonAccount())) {//如果质量经理是审核人或者发起人
                return -1;
            }
        }

        car.setReviewStatus(2);

        //修改审核人的状态为已处理
        DealToolPerson dealToolPerson1 = new DealToolPerson();
        dealToolPerson1.setStatus((byte) 2); //已处理
        dealToolPerson1.setToolNo(String.valueOf(car.getId()));
        dealToolPerson1.setIssueId(Integer.valueOf(car.getIssueId()));

        DealToolPersonCriteria emp = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria ddquery = emp.createCriteria();
        ddquery.andToolNoEqualTo(String.valueOf(car.getId()));
        ddquery.andTypeEqualTo((byte) DictEnum.TYPE_REVIEW.getCode());
        ddquery.andProcessPersonAccountEqualTo(person.getAccount());
        dealToolPersonMapper.updateByExampleSelective(dealToolPerson1, emp);

        //组装DealToolPerson对象
        DealToolPerson dealToolPerson = new DealToolPerson();
        dealToolPerson.setToolNo(String.valueOf(car.getId()));
        dealToolPerson.setIssueId(car.getIssueId());
        dealToolPerson.setIssueArea(issueMapper.selectByPrimaryKey(car.getIssueId()).getQualityType());
        dealToolPerson.setProcessPersonAccount(car.getProcessPersonAccount());
        dealToolPerson.setProcessPersonName(car.getProcessPersonName());
        dealToolPerson.setInitPersonName(car.getInitPersonName());
        dealToolPerson.setIntPersonAccount(String.valueOf(car.getIntPersonAccount()));
        dealToolPerson.setStatus((byte) DictEnum.STATUS_WAIT.getCode());
        dealToolPerson.setType((byte) 3);
        dealToolPerson.setToolType((byte)1);
        dealToolPerson.setToolName("CAR");
        dealToolPerson.setCreateTime(new Date());
        dealToolPerson.setBack1(car.getCarNo());

        Car car1 = new Car();
        car1.setReviewPersonName(car.getProcessPersonName());
        BeanUtils.copyProperties(car,car1);
        carMapper.updateByPrimaryKeySelective(car1);


        //判断质量经理是否改变
        DealToolPersonCriteria emp1 = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria dealQuery = emp1.createCriteria();
        dealQuery.andIssueIdEqualTo(Integer.valueOf(car.getIssueId()));
        dealQuery.andToolNoEqualTo(String.valueOf(car.getId()));
        dealQuery.andTypeEqualTo((byte) DictEnum.TYPE_QUALITY_MANAGER.getCode());
        List<DealToolPerson> list = dealToolPersonMapper.selectByExample(emp1);

        DealToolPerson dealToolPerson2 = new DealToolPerson();
        dealToolPerson2.setProcessPersonAccount(car.getProcessPersonAccount());
        dealToolPerson2.setProcessPersonName(car.getProcessPersonName());
        dealToolPerson2.setStatus((byte) DictEnum.STATUS_WAIT.getCode());

        if (list.size()>0){
            //修改时新增校验 质量经理不能是审核人或者发起人
            return dealToolPersonMapper.updateByExampleSelective(dealToolPerson2,emp1);

        }else {
            //新增时新增校验 质量经理不能是审核人或者发起人
            return dealToolPersonMapper.insert(dealToolPerson);
        }


    }

    public Integer addCarLog(CarLog carLog, BimsPerson person) {
        carLog.setProcessTime(new Date());
        carLog.setProcessPerson(person.getName());
        carLog.setProcessPersonId(String.valueOf(person.getId()));
        carLog.setProcessPersonAccount(person.getAccount());
        return carLogMapper.insert(carLog);
    }

}
