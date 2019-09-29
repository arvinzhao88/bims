package com.cummins.erp.dao;


import com.cummins.erp.model.Engine;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : wdxu
 * @Date :15:48 2019/6/21
 * @Description:esn相关
 */
@Repository
public interface EngineMapper {

    /**
     * @Author : wdxu
     * @Date :15:49 2019/6/21
     * @Description:esn模糊查询
     */
    List<String> fuzzyQueryEsn(String esn);

    /**
    * @Author : wdxu
    * @Date :16:54 2019/6/21
    * @Description:通过esn 查询so;项目号
    */
    Engine queryItemNumberByEsn(String esn);

}
