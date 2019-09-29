package com.cummins.erp.dao;

import com.cummins.erp.model.Components;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @创建人 wdxu
 * @创建时间 20190614
 * @描述
 */

@Repository
public interface ComponentsMapper {

    /**
     * @Author : wdxu
     * @Date :13:13 2019/6/14
     * @Description:测试
     */
    List<Components> findComponents();

    /**
     * @Author : wdxu
     * @Date :11:23 2019/6/21
     * @Description:零件号模糊查询；返回零件号集合
     */
    List<String> fuzzyQueryComponents(String partNumber);

    /**
     * @Author : wdxu
     * @Date :13:27 2019/6/21
     * @Description:通过零件号number 带出零件名称；
     */

    Components getPartNameByPartNumber(String partNumber);

}
