package com.cummins.permission.dao;

import com.cummins.permission.model.BimsPerson;
import com.cummins.permission.model.BimsPersonCriteria;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BimsPersonMapper {
    long countByExample(BimsPersonCriteria example);

    int deleteByExample(BimsPersonCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(BimsPerson record);

    int insertSelective(BimsPerson record);

    List<BimsPerson> selectByExampleWithBLOBs(BimsPersonCriteria example);

    List<BimsPerson> selectByExample(BimsPersonCriteria example);

    BimsPerson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BimsPerson record, @Param("example") BimsPersonCriteria example);

    int updateByExampleWithBLOBs(@Param("record") BimsPerson record, @Param("example") BimsPersonCriteria example);

    int updateByExample(@Param("record") BimsPerson record, @Param("example") BimsPersonCriteria example);

    int updateByPrimaryKeySelective(BimsPerson record);

    int updateByPrimaryKeyWithBLOBs(BimsPerson record);

    int updateByPrimaryKey(BimsPerson record);

    /**
    * @Author : wdxu
    * @Date :9:45 2019/7/4
    * @Description: 查询 account 校验
    */
    String queryAccordingToUserAccount(String account);


    String queryLoginName(String loginname);


    /**
    * @Author : wdxu
    * @Date :9:44 2019/7/4
    * @Description: 登录校验
    */
    BimsPerson check( BimsPerson bimsPerson);

    /**
     * 通过角色查询用户列表
     * @param map
     * @return
     */
    List<BimsPerson> getPersonListByRole(@Param("params") Map<String, String> map);
}