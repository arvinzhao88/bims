package com.cummins.permission.dao;

import com.cummins.permission.model.BimsRole;
import com.cummins.permission.model.BimsRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BimsRoleMapper {
    long countByExample(BimsRoleCriteria example);

    int deleteByExample(BimsRoleCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(BimsRole record);

    int insertSelective(BimsRole record);

    List<BimsRole> selectByExample(BimsRoleCriteria example);

    BimsRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BimsRole record, @Param("example") BimsRoleCriteria example);

    int updateByExample(@Param("record") BimsRole record, @Param("example") BimsRoleCriteria example);

    int updateByPrimaryKeySelective(BimsRole record);

    int updateByPrimaryKey(BimsRole record);

    List<BimsRole> queryRole();
}