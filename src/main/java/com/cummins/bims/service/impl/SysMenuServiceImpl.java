/**
　　* Copyright  2018 Fascte Co. Ltd.
　　* All right reserved.
　　*/
package com.cummins.bims.service.impl;

import com.cummins.bims.dto.SysMenu;
import com.cummins.bims.dto.SysMenuCriteria;
import com.cummins.bims.dto.SysMenuTree;
import com.cummins.bims.service.ISysMenuService;
import com.cummins.slave.dao.SysMenuMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangql
 * @date: 2018年10月24日
 */
@Service("sysMenuService")
public class SysMenuServiceImpl implements ISysMenuService {

	private static Logger logger = LoggerFactory.getLogger(SysMenuServiceImpl.class);

	@Autowired
	private SysMenuMapper sysMenuMapper;

	@Override
	public List<SysMenu> selectByExample(String menuName) {
		SysMenuCriteria example = new SysMenuCriteria();
		SysMenuCriteria.Criteria query = example.createCriteria();
		if (menuName != null && !"".equals(menuName)) {
			query.andNameLike("%"+menuName+"%");
		}
		example.setOrderByClause("id asc");
		
		return sysMenuMapper.selectByExample(example);
	}

	@Override
	public List<SysMenu> selectByPId() {
		SysMenuCriteria example = new SysMenuCriteria();
		SysMenuCriteria.Criteria query = example.createCriteria();
		query.andParentIdEqualTo(0);
		example.setOrderByClause("id asc");
		
		return sysMenuMapper.selectByExample(example);
	}
	
	

	@Override
	public int deleteByPrimaryKey(Integer id) {

		return sysMenuMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysMenu record) {

		return sysMenuMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysMenu record) {

		return sysMenuMapper.updateByPrimaryKey(record);
	}

	@Override
	public SysMenu selectByPrimaryKey(Integer id) {

		return sysMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysMenuTree> getTree() {

		return sysMenuMapper.getTree();
	}
	
	@Override
	public List<SysMenu> getTreeByLoginName(String loginName, String appId){
		//SysUser sysUser=new SysUser();
		//sysUser.setLoginName(loginName);
		Map<String, Object> query = new HashMap<>();
		query.put("loginName", loginName);
		query.put("appId", appId);
		return sysMenuMapper.getTreeByLoginName(query);
	}
	
}
