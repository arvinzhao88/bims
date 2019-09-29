package com.cummins.permission.service.impl;

import com.cummins.permission.dao.BimsRoleMapper;
import com.cummins.permission.model.BimsRole;
import com.cummins.permission.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * /**
 *
 * @program: bims
 * @description: 角色
 * @author: wdxu
 * @create: 2019-07-04 16:38
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    BimsRoleMapper bimsRoleMapper;
    /**
     * @Author : wdxu
     * @Date :16:38 2019/7/4
     * @Description: 查询角色
     */
    @Override
    public List<BimsRole> queryRole() {
        return bimsRoleMapper.queryRole();
    }


}