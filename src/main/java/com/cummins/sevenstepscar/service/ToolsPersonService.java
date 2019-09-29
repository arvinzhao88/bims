package com.cummins.sevenstepscar.service;


import com.cummins.sevenstepscar.model.ToolsSevenSteps;

/**
* @Author : wdxu
* @Date :10:40 2019/7/8
* @Description: 工具和人对应关系
*/
public interface ToolsPersonService {
    /**
    * @Author : wdxu
    * @Date :10:24 2019/7/9
    * @Description: 更新人与工具关系
    */
    void updateToolsPersonType(ToolsSevenSteps toolsSevenSteps);

    /**
    * @Author : wdxu
    * @Date :15:44 2019/7/9
    * @Description: 更新人与工具关系
    */
    void updateToolsPersonTypetwo (ToolsSevenSteps toolsSevenSteps);

    /**
    * @Author : wdxu
    * @Date :18:38 2019/7/9
    * @Description: 更新人与工具关系 驳回
    */
    void updateToolsPersonTypethree(ToolsSevenSteps toolsSevenSteps);
    /**
    * @Author : wdxu
    * @Date :9:48 2019/7/10
    * @Description:更新人与工具关系 通过
    */

    void updateToolsPersonTypethreenext(ToolsSevenSteps toolsSevenSteps);


    /**
    * @Author : wdxu
    * @Date :13:33 2019/7/10
    * @Description: 责任人填写第4步
    */
    void updateToolsPersonTypefour(ToolsSevenSteps toolsSevenSteps);

    /**
    * @Author : wdxu
    * @Date :14:56 2019/7/10
    * @Description: 审核人处理第五步 驳回
    */
    void updateToolsPersonTypefive(ToolsSevenSteps toolsSevenSteps);



    void updatesevenStep71(ToolsSevenSteps toolsSevenSteps);
    /**
    * @Author : wdxu
    * @Date :15:17 2019/7/10
    * @Description: 审核人处理第五步 --通过
    */
    void updateToolsPersonTypefivenext(ToolsSevenSteps toolsSevenSteps);

    /**
    * @Author : wdxu
    * @Date :13:57 2019/7/11
    * @Description: 最后一步
    */
    void jumpSevenStepsixupdate(ToolsSevenSteps toolsSevenSteps);



    void  jumpSevenStependupdate(ToolsSevenSteps toolsSevenSteps);

    
    /**
    * @Author : wdxu
    * @Date :11:06 2019/8/9
    * @Description: 审核人提交7.1数据
    */
    void updateSevenstepfour(ToolsSevenSteps toolsSevenSteps);
    
    
    /**
    * @Author : wdxu
    * @Date :18:04 2019/7/11
    * @Description: 更新scar
    */

    void  updateToolsPersonTypeScar(ToolsSevenSteps toolsSevenSteps);


    /**
    * @Author : wdxu
    * @Date :18:23 2019/7/11
    * @Description: 第二部 更新数据
    */

    void updateScarTypetwo(ToolsSevenSteps toolsSevenSteps);


    /**
    * @Author : wdxu
    * @Date :18:47 2019/7/11
    * @Description: 更新数据
    */
     void updatescarthree(ToolsSevenSteps toolsSevenSteps);


     /**
     * @Author : wdxu
     * @Date :18:50 2019/7/11
     * @Description:
     */
    void updatescarnext(ToolsSevenSteps toolsSevenSteps);


    /**
    * @Author : wdxu
    * @Date :19:43 2019/7/11
    * @Description: 责任人 提交 4-7
    */
    void updatescarfour(ToolsSevenSteps toolsSevenSteps);

    /**
    * @Author : wdxu
    * @Date :20:05 2019/7/11
    * @Description: 审核人驳回
    */

    void updatescarfive(ToolsSevenSteps toolsSevenSteps);




    void  updatescarfiveby(ToolsSevenSteps toolsSevenSteps);
    /**
    * @Author : wdxu
    * @Date :20:07 2019/7/11
    * @Description: 审核人 通过
    */

    void  updatescarfivenext(ToolsSevenSteps toolsSevenSteps);

    /**
    * @Author : wdxu
    * @Date :13:11 2019/7/12
    * @Description: 最后一步
    */

    void  scarupdatelast(ToolsSevenSteps toolsSevenSteps);
}
