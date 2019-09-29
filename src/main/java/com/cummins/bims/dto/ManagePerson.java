package com.cummins.bims.dto;

import java.io.Serializable;
import java.util.Date;

public class ManagePerson implements Serializable {
    private Integer uId;

    private String userName;

    private String account;

    private String accountList;

    private Date createTime;

    private String password;

    private PersonDTO user;

    private static final long serialVersionUID = 1L;

    public String getAccountList() {
        return accountList;
    }

    public void setAccountList(String accountList) {
        this.accountList = accountList;
    }

    public PersonDTO getUser() {
        return user;
    }

    public void setUser(PersonDTO user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}