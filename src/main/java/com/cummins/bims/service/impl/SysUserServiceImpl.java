package com.cummins.bims.service.impl;

import com.cummins.bims.dto.SysUser;
import com.cummins.bims.dto.SysUserCriteria;
import com.cummins.bims.service.ISysUserService;
import com.cummins.slave.dao.SysUserMapper;
import com.cummins.util.Md5Utils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("sysUserService")
@Transactional(readOnly = true)
public class SysUserServiceImpl implements ISysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	@Transactional
	public int insert(SysUser sysUser) {
		String password = Md5Utils.getMD5Str(sysUser.getPassword());
		sysUser.setPassword(password);
		sysUser.setCreateDate(new Date());
		sysUser.setUpdateDate(new Date());
		sysUser.setDelFlag(false);
		return sysUserMapper.insertSelective(sysUser);
	}

	@Override
	@Transactional
	public int update(SysUser sysUser) {
		sysUser.setUpdateDate(new Date());
		return sysUserMapper.updateByPrimaryKeySelective(sysUser);
	}
	
	@Override
	@Transactional
	public int updateByName(String loginName,String loginIp) {
		SysUserCriteria example=new SysUserCriteria();
		SysUserCriteria.Criteria query = example.createCriteria();
		query.andLoginNameEqualTo(loginName);
		SysUser record=new SysUser();
		record.setUpdateDate(new Date());
		record.setLoginIp(loginIp);
		record.setLoginDate(new Date());
		return sysUserMapper.updateByExampleSelective(record, example);
	}
	
	@Override
	public SysUser getById(Integer id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysUser> selectUser(SysUser sysUser) {
		SysUserCriteria query = new SysUserCriteria();
		query.createCriteria().andLoginNameEqualTo(sysUser.getLoginName());
		List<SysUser> list = sysUserMapper.selectByExample(query);
		return list;
	}

	@Override
	public SysUser getByUser(SysUser sysUser) {
		SysUserCriteria query = new SysUserCriteria();
		query.createCriteria().andLoginNameEqualTo(sysUser.getLoginName());
		List<SysUser> list = sysUserMapper.selectByExample(query);
		if(list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Page<SysUser> pageAllUser(SysUser sysUser, int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		SysUserCriteria example = new SysUserCriteria();
		example.setOrderByClause(" update_date desc");
		SysUserCriteria.Criteria query = example.createCriteria();
		if(sysUser.getLoginName()!=null && sysUser.getLoginName()!="") {
			query.andLoginNameLike("%"+sysUser.getLoginName()+"%");
		}
		Page<SysUser> list = sysUserMapper.pageAllUser(example);
		return list;
	}
	/**
	 * 根据account查询
	 * @param account
	 * @return
	 */
	@Override
	public SysUser selectByAccount(String account) {
		SysUser managePerson = sysUserMapper.selectByAccount(account);
		return managePerson;
	}
	
	

}
