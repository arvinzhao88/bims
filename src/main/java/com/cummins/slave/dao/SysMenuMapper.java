package com.cummins.slave.dao;

import com.cummins.bims.dto.SysMenu;
import com.cummins.bims.dto.SysMenuCriteria;
import com.cummins.bims.dto.SysMenuTree;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SysMenuMapper {
	long countByExample(SysMenuCriteria example);

	int deleteByExample(SysMenuCriteria example);

	int deleteByPrimaryKey(Integer id);

	int insert(SysMenu record);

	int insertSelective(SysMenu record);

	SysMenu selectByPrimaryKey(Integer id);

	List<SysMenu> selectByExample(SysMenuCriteria example);

	List<SysMenuTree> getTree();

	List<SysMenu> getTreeByLoginName(Map<String, Object> query);
	
	int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuCriteria example);

	int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuCriteria example);

	int updateByPrimaryKeySelective(SysMenu record);

	int updateByPrimaryKey(SysMenu record);
}