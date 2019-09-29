package com.cummins.sevenstepscar.service.impl;

import com.cummins.bims.dao.DealToolPersonMapper;
import com.cummins.bims.dto.DealToolPerson;
import com.cummins.sevenstepscar.model.ToolsSevenSteps;
import com.cummins.sevenstepscar.service.ToolsPersonService;
import com.cummins.util.GenerateOrderNoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * @program: bims
 * @description: 工具和人对应关系
 * @author: wdxu
 * @create: 2019-07-08 10:41
 */
@Service
public class ToolsPersonServiceImpl implements ToolsPersonService {
    @Autowired
    DealToolPersonMapper dealToolPersonMapper;

    /**
     * @Author : wdxu
     * @Date :10:25 2019/7/9
     * @Description: 更新人与工具关系
     */
    @Override
    public void updateToolsPersonType(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  →责任人代办
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  待处理
        map.put("status", 1);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 3);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

    }


    /**
     * 更新人/工具 状态  →责任人代办 第二步
     */
    @Override
    @Transactional
    public void updateToolsPersonTypetwo(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  →责任人已经处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  已经处理
        map.put("status", 2);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 3);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         * 更新 审核人状态
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 1);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 3);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);

    }

    /**
     * 更新人/工具 状态  →审核人驳回 第三步
     */
    @Override
    @Transactional
    public void updateToolsPersonTypethree(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  →责任人 待处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  已经处理
        map.put("status", 1);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 3);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());

        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         *  更新人/工具 状态 →审核人  → 沉默状态
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 0);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 3);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);
    }


    /**
     * @Author : wdxu
     * @Date :9:54 2019/7/10
     * @Description: 审核人通过
     */
    @Override
    @Transactional
    public void updateToolsPersonTypethreenext(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  →责任人 待处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  已经处理
        map.put("status", 1);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 3);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         *  更新人/工具 状态 →审核人  → 沉默状态
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 0);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 3);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);

    }

    @Override
    @Transactional
    public void updateToolsPersonTypefour(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  责任人→ 已处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  已经处理
        map.put("status", 2);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 3);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         *  更新人/工具 状态  审核人→ 待处理
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 1);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 3);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);
    }

    @Override
    @Transactional
    public void updateToolsPersonTypefive(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  责任人→ 待处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  待处理
        map.put("status", 1);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 3);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         *  更新人/工具 状态  审核人→ 沉默
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  沉默
        map2.put("status", 0);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 3);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);

    }


    /**
     * @Author : wdxu
     * @Date :20:08 2019/7/11
     * @Description: 驳回
     */

    @Override
    @Transactional
    public void updatesevenStep71(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  责任人→ 待处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态
        map.put("status", 1);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 七步
        map.put("toolstype", 3);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         *  更新人/工具 状态  审核人→ 沉默
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 0);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 3);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);

    }





    @Override
    @Transactional
    public void updateToolsPersonTypefivenext(ToolsSevenSteps toolsSevenSteps) {

        /**
         *  更新人/工具 状态  责任人→ 已完成
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  完成
        map.put("status", 2);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 3);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);
        /**
         *  更新人/工具 状态  审核人→ 待处理
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 1);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 3);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

    }

    @Override
    @Transactional
    public void jumpSevenStepsixupdate(ToolsSevenSteps toolsSevenSteps) {

        /**
         *  更新人/工具 状态 →审核人  → 沉默状态
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  已处理
        map2.put("status", 2);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 3);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);
    }

    @Override
    @Transactional
    public void jumpSevenStependupdate(ToolsSevenSteps toolsSevenSteps) {
        Map<String, Object> map = new HashMap<>();
        //任务状态  完成
        map.put("status", 4);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 3);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);
        /**
         *  更新人/工具 状态  审核人→ 待处理
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 4);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 3);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);


    }


    @Override
    @Transactional
    public void updateSevenstepfour(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  责任人→ 已处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  已经处理
        map.put("status", 2);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 3);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         *  更新人/工具 状态  审核人→ 待处理
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 1);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 3);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);
    }






    /**
     * @Author : wdxu
     * @Date :18:05 2019/7/11
     * @Description: 更新scar 第一步
     */
    @Override
    public void updateToolsPersonTypeScar(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  →责任人代办
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  待处理
        map.put("status", 1);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 2);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

    }


    /**
     * @Author : wdxu
     * @Date :18:24 2019/7/11
     * @Description: scar 数据更新
     */
    @Override
    @Transactional
    public void updateScarTypetwo(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  →责任人已经处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  已经处理
        map.put("status", 2);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 2);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         * 更新 审核人状态
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 1);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 2);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);

    }


    /**
     * @Author : wdxu
     * @Date :18:48 2019/7/11
     * @Description:scar 第三步 驳回
     */

    /**
     * 更新人/工具 状态  →审核人驳回 第三步
     */
    @Override
    @Transactional
    public void updatescarthree(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  →责任人 待处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态
        map.put("status", 1);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 2七步
        map.put("toolstype", 2);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());

        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         *  更新人/工具 状态 →审核人  → 沉默状态
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态
        map2.put("status", 0);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 2);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);
    }
    
    /**
    * @Author : wdxu
    * @Date :18:52 2019/7/11
    * @Description: 责任人待处理
    */
    
    @Override
    @Transactional
    public void updatescarnext(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  →责任人 待处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态
        map.put("status", 1);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 2);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         *  更新人/工具 状态 →审核人  → 沉默状态
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 0);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 2);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);
    }




    @Override
    @Transactional
    public void updatescarfour(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  责任人→ 已处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  已经处理
        map.put("status", 2);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 2);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         *  更新人/工具 状态  审核人→ 待处理
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 1);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 2);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);
    }

    /**
    * @Author : wdxu
    * @Date :20:08 2019/7/11
    * @Description: 驳回
    */

    @Override
    @Transactional
    public void updatescarfive(ToolsSevenSteps toolsSevenSteps) {
        /**
         *  更新人/工具 状态  责任人→ 待处理
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态
        map.put("status", 1);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 scar
        map.put("toolstype", 2);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);

        /**
         *  更新人/工具 状态  审核人→ 沉默
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 0);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 2);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);

    }



    @Override
    @Transactional
    public void updatescarfiveby(ToolsSevenSteps toolsSevenSteps) {

        /**
         *  更新人/工具 状态  责任人→ 已完成
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  完成
        map.put("status", 2);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 3);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);
        /**
         *  更新人/工具 状态  审核人→ 待处理
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 1);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 3);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);

    }



    @Override
    @Transactional
    public void updatescarfivenext(ToolsSevenSteps toolsSevenSteps) {

        /**
         *  更新人/工具 状态  责任人→ 已完成
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  完成
        map.put("status", 2);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型 3七步
        map.put("toolstype", 2);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);
        /**
         *  更新人/工具 状态  审核人→ 待处理
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 1);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 2);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);

    }

    @Override
    @Transactional
    public void scarupdatelast(ToolsSevenSteps toolsSevenSteps) {

        /**
         *  更新人/工具 状态  责任人→ 已完成
         */
        Map<String, Object> map = new HashMap<>();
        //任务状态  完成
        map.put("status", 4);
        //问题id
        map.put("issueid", toolsSevenSteps.getIssueId());
        //责任人account
        map.put("processaccount", toolsSevenSteps.getBack1());
        //工具类型
        map.put("toolstype", 2);
        //工具id
        map.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map);
        /**
         *  更新人/工具 状态  审核人→ 待处理
         */
        Map<String, Object> map2 = new HashMap<>();
        //任务状态  待处理
        map2.put("status", 4);
        //问题id
        map2.put("issueid", toolsSevenSteps.getIssueId());
        //审核人account
        map2.put("processaccount", toolsSevenSteps.getBack2());
        //工具类型 3七步
        map2.put("toolstype", 2);
        //工具id
        map2.put("toolid", toolsSevenSteps.getId());
        dealToolPersonMapper.updateToolsPersonType(map2);



    }



}