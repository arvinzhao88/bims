/**
　　* Copyright  2018 Fascte Co. Ltd.
　　* All right reserved.
　　*/
package com.cummins.bims.service;


import com.cummins.bims.dto.SysMenu;
import com.cummins.bims.dto.SysMenuTree;

import java.util.List;

/**
 * @author zhangql
 * @date: 2018年10月24日
 */
public interface ISysMenuService {

	int deleteByPrimaryKey(Integer id);

	int insert(SysMenu record);

	int updateByPrimaryKey(SysMenu record);

	SysMenu selectByPrimaryKey(Integer id);

	List<SysMenu> selectByExample(String menuName);
	
	List<SysMenu> selectByPId();
	
	List<SysMenuTree> getTree();
	
	List<SysMenu> getTreeByLoginName(String loginName, String appId);

}
