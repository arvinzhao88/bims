package com.cummins.bims.service.impl;

import com.cummins.bims.dao.CarMapper;
import com.cummins.bims.dao.DealLogMapper;
import com.cummins.bims.dao.DealToolMapper;
import com.cummins.bims.dao.IssueMapper;
import com.cummins.bims.dto.*;
import com.cummins.bims.enums.ToolEnum;
import com.cummins.bims.service.DealToolService;
import com.cummins.bims.enums.RecordStatusEnum;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.DealLogUtil;
import com.cummins.util.ShiroUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DealToolServiceImpl implements DealToolService {
    @Autowired
    private DealToolMapper dealToolMapper;

    @Autowired
    private IssueMapper issueMapper;

    @Autowired
    private DealLogMapper dealLogMapper;

    @Autowired
    private CarMapper carMapper;

    @Override
    public List<DealTool> getTools(DealTool dealTool) {
        DealToolCriteria example = new DealToolCriteria();
        DealToolCriteria.Criteria query = example.createCriteria();
        query.andIssueIdEqualTo(dealTool.getIssueId());
        return dealToolMapper.selectByExample(example);
    }

    @Override
    public List<Car> getListByToolType(DealTool dealTool) {
        CarCriteria example = new CarCriteria();
        CarCriteria.Criteria query = example.createCriteria();
        query.andIssueIdEqualTo(dealTool.getIssueId());
        //query.andCarTypeEqualTo(dealTool.getProcessTool());
        return carMapper.selectByExample(example);
    }

    @Override
    public DealTool addTool(DealTool dealTool, BimsPerson person) {
        //获取当前当前登录人
        Issue issue = issueMapper.selectByPrimaryKey(Integer.valueOf(dealTool.getIssueId()));

        //问题表更新处理工具
        /*issue.setProcessMethod(dealTool.getProcessTool());
        issueMapper.updateByPrimaryKeySelective(issue);*/

        //插入处理记录
        DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.SELECTDUTYPERSON.getCode()),person);
        dealLog.setIssueId(Integer.valueOf(dealTool.getIssueId()));
        dealLogMapper.insert(dealLog);
        //保存处理工具
        dealTool.setToolNo(issue.getNumber());
        dealTool.setIssueArea(issue.getQualityType());
        dealTool.setApplyPerson(String.valueOf(person.getId()));
        dealTool.setApplyPersonName(person.getName());
        dealTool.setProcessToolName(ToolEnum.getNameByCode(Integer.valueOf(dealTool.getProcessTool())));
        dealToolMapper.insert(dealTool);


        Integer id = dealTool.getId();
        return dealToolMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量新增 弃用
     * @param jsonArr
     * @return
     */
    @Override
    @Transactional
    public List<DealTool> addToolBatch(String jsonArr, BimsPerson person) {
        Gson gson = new Gson();
        List<DealTool> dealTools = gson.fromJson(jsonArr, new TypeToken<List<DealTool>>() {}.getType());
        for(DealTool dealTool : dealTools) {
            if(null != person) {
                dealTool.setApplyPerson(person.getAccount());
                dealTool.setApplyPersonName(person.getName());
            }
            dealTool.setProcessToolName(ToolEnum.getNameByCode(Integer.valueOf(dealTool.getProcessTool())));
            //插入处理记录
            DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.SELECTDUTYPERSON.getCode()),person);
            dealLog.setIssueId(Integer.valueOf(dealTool.getIssueId()));
            dealLogMapper.insert(dealLog);

            //添加step1数据
            this.addStep1(dealTool);
        }
        dealToolMapper.insertBatch(dealTools);
        return dealTools;
    }

    @Override
    public Integer delTool(DealTool dealTool) {
        return dealToolMapper.deleteByPrimaryKey(dealTool.getId());
    }

    @Override
    public List<DealTool> getToolTabs(DealTool dealTool) {
        return dealToolMapper.getToolTabs(dealTool);
    }

    public Integer addStep1(DealTool dealTool) {
        Car car = new Car();
        if (dealTool.getProcessTool().equals("4")){
            car.setIssueId(dealTool.getIssueId());
            car.setToolId(dealTool.getId());
            car.setIssueTitle(issueMapper.selectByPrimaryKey(dealTool.getIssueId()).getIssueDesc());
            car.setCarNo(dealTool.getToolNo());
            car.setCarType(dealTool.getProcessTool());
            return carMapper.insert(car);
        }
        car.setIssueId(dealTool.getIssueId());
        car.setToolId(dealTool.getId());
        car.setIssueTitle(issueMapper.selectByPrimaryKey(dealTool.getIssueId()).getIssueDesc());
        car.setCarNo(dealTool.getToolNo());
        car.setCarType(dealTool.getProcessTool());
        car.setSponsorName(dealTool.getApplyPersonName());
        car.setSponsor(dealTool.getApplyPerson());
        car.setDutyPerson(dealTool.getToolDutyPerson());
        car.setDutyPersonName(dealTool.getToolDutyPersonName());
        return carMapper.insert(car);
    }
}
