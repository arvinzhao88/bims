package com.cummins.sevenstepscar.service;

import com.cummins.permission.model.BimsPerson;
import com.cummins.sevenstepscar.model.ToolsSevenSteps;

/**
 * @Author : wdxu
 * @Date :9:27 2019/7/9
 * @Description: 七步接口
 */
public interface SevenStepsService {
    /**
     * @Author : wdxu
     * @Date :9:58 2019/7/9
     * @Description: 根据 工具id 更新数据
     */
    void updateSevenStepsById(ToolsSevenSteps toolsSevenSteps);

    /**
     * @Author : wdxu
     * @Date :11:20 2019/7/9
     * @Description: 通过id 查询 七步数据
     */
    ToolsSevenSteps selectSevenStepsById(String id);

    /**
     * @Author : wdxu
     * @Date :11:48 2019/7/9
     * @Description: 连表查询 第二部
     */
    ToolsSevenSteps selectSevensteptwo(String toolsId, String questionId, BimsPerson person);

    /**
     * @Author : wdxu
     * @Date :18:03 2019/7/9
     * @Description: 连表查询 第三步
     */
    ToolsSevenSteps selectSevenstepthree(String toolsId, String questionId, BimsPerson person);

    /**
     * @Author : wdxu
     * @Date :10:09 2019/7/10
     * @Description: 查询 4-7步
     */
    ToolsSevenSteps selectSevenstepfour(String toolsId, String questionId, BimsPerson person);

    /**
     * @Author : wdxu
     * @Date :10:23 2019/8/9
     * @Description: 审核人查看7.1
     */

    ToolsSevenSteps fillInsevenStep(String toolsId, String questionId, BimsPerson person);

    /**
     * @Author : wdxu
     * @Date :14:11 2019/7/10
     * @Description: 7.1 步骤  审核人审核
     */

    ToolsSevenSteps selectSevenstepfive(String toolsId, String questionId, BimsPerson person);

    /**
     * @Author : wdxu
     * @Date :11:48 2019/7/9
     * @Description: scar查询 第二部
     */
    ToolsSevenSteps selectscartwo(String toolsId, String questionId, BimsPerson person);

    /**
     * @Author : wdxu
     * @Date :18:31 2019/7/11
     * @Description: scar 查询第三步
     */
    ToolsSevenSteps scarthree(String toolsId, String questionId, BimsPerson person);

    /**
     * @Author : wdxu
     * @Date :19:36 2019/7/11
     * @Description: scar 第四步
     */

    ToolsSevenSteps scarfour(String toolsId, String questionId, BimsPerson person);

    /**
     * @Author : wdxu
     * @Date :19:59 2019/7/11
     * @Description: scar 第五步
     */
    ToolsSevenSteps scarfive(String toolsId, String questionId, BimsPerson person);


    /**
     * @Author : wdxu
     * @Date :11:36 2019/8/9
     * @Description: 审核人查看7.1数据
     */
    ToolsSevenSteps view71Data(String toolsId, String questionId, BimsPerson person);

    /**
     * @Author : wdxu
     * @Date :14:10 2019/7/17
     * @Description: scar 审核人查看4-7步数据
     */

    ToolsSevenSteps findFourToSix(String toolsId, String questionId, BimsPerson person);

    /**
     * @Author : wdxu
     * @Date :14:10 2019/7/17
     * @Description: scar 审核人查看4-7步数据
     */

    ToolsSevenSteps fillIn71(String toolsId, String questionId, BimsPerson person);


    /**
     * @Author : wdxu
     * @Date :17:55 2019/7/17
     * @Description: 审核人填写最后一步
     */
    ToolsSevenSteps theReviewerFillsInTheLast(String toolsId, String questionId, BimsPerson person);


    /**
     * @Author : wdxu
     * @Date :16:34 2019/7/19
     * @Description: 七步问题关闭提供接口
     */

    Integer changeSevenStep(Integer questionId);

    /**
     * @Author : wdxu
     * @Date :16:34 2019/7/19
     * @Description: scar关闭提供接口
     */

    Integer changeScarStep(Integer questionId);


    /**
     * @Author : wdxu
     * @Date :15:29 2019/7/24
     * @Description: 删除七步/scar数据
     */

    Integer deleteSevenStepandScar(Integer id);
}
