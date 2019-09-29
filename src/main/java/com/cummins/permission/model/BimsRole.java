package com.cummins.permission.model;

import java.io.Serializable;
import java.util.Date;

public class BimsRole implements Serializable {
    private Integer id;

    private String roleName;

    private String roleDepict;

    private Date roleCareatetime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDepict() {
        return roleDepict;
    }

    public void setRoleDepict(String roleDepict) {
        this.roleDepict = roleDepict == null ? null : roleDepict.trim();
    }

    public Date getRoleCareatetime() {
        return roleCareatetime;
    }

    public void setRoleCareatetime(Date roleCareatetime) {
        this.roleCareatetime = roleCareatetime;
    }
}