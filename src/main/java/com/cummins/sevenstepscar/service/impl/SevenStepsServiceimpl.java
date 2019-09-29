package com.cummins.sevenstepscar.service.impl;


import com.cummins.permission.model.BimsPerson;
import com.cummins.sevenstepscar.dao.ToolsSevenStepsMapper;
import com.cummins.sevenstepscar.model.ToolsSevenSteps;
import com.cummins.sevenstepscar.model.ToolsSevenStepsCriteria;
import com.cummins.sevenstepscar.service.SevenStepsService;
import com.cummins.util.GenerateOrderNoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


/**
 * @program: bims
 * @description: 七步实现
 * @author: wdxu
 * @create: 2019-07-09 09:28
 */
@Service
public class SevenStepsServiceimpl implements SevenStepsService {
    @Autowired
    ToolsSevenStepsMapper toolsSevenStepsMapper;

    /**
     * @Author : wdxu
     * @Date :9:59 2019/7/9
     * @Description: 根据工具id 更新工具
     */
    @Override
    public void updateSevenStepsById(ToolsSevenSteps toolsSevenSteps) {
        toolsSevenStepsMapper.updateByPrimaryKeySelective(toolsSevenSteps);
    }

    /**
     * @Author : wdxu
     * @Date :11:22 2019/7/9
     * @Description:通过id 查询七步
     */
    @Override
    public ToolsSevenSteps selectSevenStepsById(String id) {
        return toolsSevenStepsMapper.selectByPrimaryKey(Integer.parseInt(id));
    }

    /**
     * @Author : wdxu
     * @Date :11:50 2019/7/9
     * @Description: 第二部 查询
     */
    @Override
    public ToolsSevenSteps selectSevensteptwo(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //责任人
        map.put("persontype", 1);
        //七步
        map.put("toolstype", 1);
        //步数 第一步
        map.put("back3", 1);
        //状态 待处理
        map.put("state", 1);

        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }


    /**
     * @Author : wdxu
     * @Date :11:50 2019/7/9
     * @Description: 第三部 查询
     */
    @Override
    public ToolsSevenSteps selectSevenstepthree(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //审核人
        map.put("persontype", 2);
        // 1七步  2scar
        map.put("toolstype", 1);
        //步数 第二步
        map.put("back3", 2);
        //状态 待处理
        map.put("state", 1);

        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }

    /**
     * @Author : wdxu
     * @Date :10:10 2019/7/10
     * @Description: 第四步 -- 7步 查询
     */
    @Override
    public ToolsSevenSteps selectSevenstepfour(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //责任人
        map.put("persontype", 1);
        // 1七步  2scar
        map.put("toolstype", 1);
        //步数 第二步
        map.put("back3", 3);
        //状态 待处理
        map.put("state", 1);
        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }


    /**
     * @Author : wdxu
     * @Date :14:14 2019/7/10
     * @Description: 审核人 审核查询
     */
    @Override
    public ToolsSevenSteps selectSevenstepfive(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //责任人
        map.put("persontype", 2);
        // 1七步  2scar
        map.put("toolstype", 1);
        //步数 第二步
        map.put("back3", 4);
        //状态 待处理
        map.put("state", 1);
        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }

    /**
     * @Author : wdxu
     * @Date :11:50 2019/7/9
     * @Description: 第二部 查询
     */
    @Override
    public ToolsSevenSteps selectscartwo(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //责任人
        map.put("persontype", 1);
        //scar
        map.put("toolstype", 2);
        //步数 第一步
        map.put("back3", 1);
        //状态 待处理
        map.put("state", 1);

        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }


    /**
     * @Author : wdxu
     * @Date :11:50 2019/7/9
     * @Description: 第三部 查询
     */
    @Override
    public ToolsSevenSteps scarthree(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //审核人
        map.put("persontype", 2);
        // 1七步  2scar
        map.put("toolstype", 2);
        //步数 第二步
        map.put("back3", 2);
        //状态 待处理
        map.put("state", 1);

        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }

    /**
     * @Author : wdxu
     * @Date :10:24 2019/8/9
     * @Description: 责任人查看7.1数据 wdx
     */

    @Override
    public ToolsSevenSteps fillInsevenStep(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //责任人
        map.put("persontype", 1);
        // 1七步  2scar
        map.put("toolstype", 1);
        //步数 第二步
        map.put("back3", 5);
        //状态 待处理
        map.put("state", 1);

        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }


    /**
    * @Author : wdxu
    * @Date :11:34 2019/8/9
    * @Description: 审核人查看7.1数据
    */
    @Override
    public ToolsSevenSteps view71Data(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //审核人
        map.put("persontype", 2);
        // 1七步  2scar
        map.put("toolstype", 1);
        //步数 第二步
        map.put("back3", 6);
        //状态 待处理
        map.put("state", 1);
        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }


    /**
     * @Author : wdxu
     * @Date :19:37 2019/7/11
     * @Description: scar 第四步
     */
    @Override
    public ToolsSevenSteps scarfour(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //责任人
        map.put("persontype", 1);
        // 1七步  2scar
        map.put("toolstype", 2);
        //步数 第二步
        map.put("back3", 3);
        //状态 待处理
        map.put("state", 1);
        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }


    /**
     * @Author : wdxu
     * @Date :14:14 2019/7/10
     * @Description: 审核人 审核查询
     */
    @Override
    public ToolsSevenSteps scarfive(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //责任人
        map.put("persontype", 2);
        // 1七步  2scar
        map.put("toolstype", 2);
        //步数 第二步
        map.put("back3", 6);
        //状态 待处理
        map.put("state", 1);
        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }


    /**
     * @Author : wdxu
     * @Date :14:11 2019/7/17
     * @Description: 查询审核人 4-7步 审核数据
     */
    @Override
    public ToolsSevenSteps findFourToSix(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //责任人
        map.put("persontype", 2);
        // 1七步  2scar
        map.put("toolstype", 2);
        //步数
        map.put("back3", 4);
        //状态 待处理
        map.put("state", 1);
        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }


    /**
     * @Author : wdxu
     * @Date :15:46 2019/7/17
     * @Description: 责任人填写
     */
    @Override
    public ToolsSevenSteps fillIn71(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //责任人
        map.put("persontype", 1);
        // 1七步  2scar
        map.put("toolstype", 2);
        //步数
        map.put("back3", 5);
        //状态 待处理
        map.put("state", 1);
        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }


    /**
     * @Author : wdxu
     * @Date :17:55 2019/7/17
     * @Description: 审核人填写最后一步
     */
    @Override
    public ToolsSevenSteps theReviewerFillsInTheLast(String toolsId, String questionId, BimsPerson person) {
        Map<String, Object> map = new HashMap<>();
        map.put("toolsId", toolsId);
        map.put("questionId", questionId);
        map.put("account", person.getAccount());
        //责任人
        map.put("persontype", 2);
        // 1七步  2scar
        map.put("toolstype", 2);
        //步数
        map.put("back3", 7);
        //状态 待处理
        map.put("state", 1);


        return toolsSevenStepsMapper.selectSevensteptwo(map);
    }

    /**
     * @Author : wdxu
     * @Date :16:36 2019/7/19
     * @Description: 七步问题关闭提供接口
     */
    @Override
    public Integer changeSevenStep(Integer questionId) {
        ToolsSevenSteps toolsSevenSteps = new ToolsSevenSteps();
        toolsSevenSteps.setBack3("6");

        ToolsSevenStepsCriteria toolsSevenStepsCriteria = new ToolsSevenStepsCriteria();
        ToolsSevenStepsCriteria.Criteria criteria = toolsSevenStepsCriteria.createCriteria();
        criteria.andIssueIdEqualTo(questionId);
        criteria.andTypeEqualTo(1);

        return toolsSevenStepsMapper.updateByExampleSelective(toolsSevenSteps, toolsSevenStepsCriteria);
    }

    /**
     * @Author : wdxu
     * @Date :16:36 2019/7/19
     * @Description: scar问题关闭提供接口
     */

    @Override
    public Integer changeScarStep(Integer questionId) {
        ToolsSevenSteps toolsSevenSteps = new ToolsSevenSteps();
        toolsSevenSteps.setBack3("7");
        ToolsSevenStepsCriteria toolsSevenStepsCriteria = new ToolsSevenStepsCriteria();
        ToolsSevenStepsCriteria.Criteria criteria = toolsSevenStepsCriteria.createCriteria();
        criteria.andIssueIdEqualTo(questionId);
        criteria.andTypeEqualTo(2);

        return toolsSevenStepsMapper.updateByExampleSelective(toolsSevenSteps, toolsSevenStepsCriteria);
    }


    /**
     * @Author : wdxu
     * @Date :15:32 2019/7/24
     * @Description: 删除数据
     */
    @Override
    public Integer deleteSevenStepandScar(Integer id) {
        return toolsSevenStepsMapper.deleteByPrimaryKey(id);
    }

}