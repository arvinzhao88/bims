package com.cummins.erp.dao;

import com.cummins.erp.model.SqI;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @创建人 wdxu
 * @创建时间 20190626
 * @描述 SQI 接口
 */

@Repository
public interface SqIMapper {

    List<SqI> querySqI(String SupplierCode);
}
