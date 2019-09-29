package com.cummins.bims.dao;

import com.cummins.bims.dto.Dict;
import com.cummins.bims.dto.DictCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictMapper {
    long countByExample(DictCriteria example);

    int deleteByExample(DictCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dict record);

    int insertSelective(Dict record);

    List<Dict> selectByExample(DictCriteria example);

    Dict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dict record, @Param("example") DictCriteria example);

    int updateByExample(@Param("record") Dict record, @Param("example") DictCriteria example);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);

    /**
     * 查询供应商名称
     * @Author qx
     * @param pid 父id
     * @param tips
     * @return 供应商对象
     */
    Dict getSupplierNameByTips(Integer pid, String tips);
}