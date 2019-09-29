package com.cummins.bims.dto;

import java.io.Serializable;

public class PersonDTO implements Serializable {

    /** ID **/
    private int id;
    /** 姓名 **/
    private String name;
    /** 性别 **/
    private int gender;
    /** 头像 **/
    private String logo;
    /** 微信ID **/
    private String account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
