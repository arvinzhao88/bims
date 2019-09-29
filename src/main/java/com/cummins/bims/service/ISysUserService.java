package com.cummins.bims.service;


import com.cummins.bims.dto.SysUser;
import com.github.pagehelper.Page;

import java.util.List;

public interface ISysUserService {
	
	 int insert(SysUser sysUser);
	 
	 int update(SysUser sysUser);
	 
	 int updateByName(String loginName, String loginIp);
	 
	 SysUser getByUser(SysUser sysUser);
	 
	 SysUser getById(Integer id);	 
	 
	 List<SysUser> selectUser(SysUser sysUser);
	 
	 Page<SysUser> pageAllUser(SysUser sysUser, int pageNo, int pageSize);
	/**
	 * 根据Account查询
	 * @param account
	 * @return
	 */
	SysUser selectByAccount(String account);
}
