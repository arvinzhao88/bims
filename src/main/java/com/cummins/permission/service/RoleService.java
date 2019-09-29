package com.cummins.permission.service;

import com.cummins.permission.model.BimsRole;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : wdxu
 * @Date :16:36 2019/7/4
 * @Description: 角色逻辑
 */

public interface RoleService {
    /**
     * @Author : wdxu
     * @Date :16:36 2019/7/4
     * @Description: 查询角色
     */
    List<BimsRole> queryRole();
}
