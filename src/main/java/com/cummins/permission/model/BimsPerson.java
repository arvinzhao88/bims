package com.cummins.permission.model;

import com.cummins.contact.dto.Person;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class BimsPerson implements Serializable {
    private Integer id;

    private String loginName;

    private String password;

    private String name;

    private Integer gender;

    private String logo;

    private String job;

    private String mobile;

    private String email;

    private String pinyin;

    private String pinyinFirstLetter;

    private Integer companyId;

    private Boolean bound;

    private String qrCode;

    private String account;

    private Date birthday;

    private Date lunarBirthday;

    private Integer notifyType;

    private Date employed;

    private Boolean fired;

    private Date firedTime;

    private Date topTime;

    private Integer status;

    private String wechatId;

    private String permission;

    private Boolean deleted;

    private String creator;

    private Date boundTime;
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;

    private String syncFlag;

    private String isInitYear;

    private Date birthSendTime;

    private String address;

    private Boolean hidden;

    private String belongArea;

    private String belongRole;

    private String extension;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BimsPerson) {
            BimsPerson bimsPerson = (BimsPerson) obj;
            return account.equals(bimsPerson.getAccount());
        } else {
            if (obj instanceof Person) {
                Person person = (Person) obj;
                return account.equals(person.getAccount());
            }
        }
        return super.equals(obj);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public String getPinyinFirstLetter() {
        return pinyinFirstLetter;
    }

    public void setPinyinFirstLetter(String pinyinFirstLetter) {
        this.pinyinFirstLetter = pinyinFirstLetter == null ? null : pinyinFirstLetter.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Boolean getBound() {
        return bound;
    }

    public void setBound(Boolean bound) {
        this.bound = bound;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getLunarBirthday() {
        return lunarBirthday;
    }

    public void setLunarBirthday(Date lunarBirthday) {
        this.lunarBirthday = lunarBirthday;
    }

    public Integer getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(Integer notifyType) {
        this.notifyType = notifyType;
    }

    public Date getEmployed() {
        return employed;
    }

    public void setEmployed(Date employed) {
        this.employed = employed;
    }

    public Boolean getFired() {
        return fired;
    }

    public void setFired(Boolean fired) {
        this.fired = fired;
    }

    public Date getFiredTime() {
        return firedTime;
    }

    public void setFiredTime(Date firedTime) {
        this.firedTime = firedTime;
    }

    public Date getTopTime() {
        return topTime;
    }

    public void setTopTime(Date topTime) {
        this.topTime = topTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getBoundTime() {
        return boundTime;
    }

    public void setBoundTime(Date boundTime) {
        this.boundTime = boundTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSyncFlag() {
        return syncFlag;
    }

    public void setSyncFlag(String syncFlag) {
        this.syncFlag = syncFlag == null ? null : syncFlag.trim();
    }

    public String getIsInitYear() {
        return isInitYear;
    }

    public void setIsInitYear(String isInitYear) {
        this.isInitYear = isInitYear == null ? null : isInitYear.trim();
    }

    public Date getBirthSendTime() {
        return birthSendTime;
    }

    public void setBirthSendTime(Date birthSendTime) {
        this.birthSendTime = birthSendTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getBelongArea() {
        return belongArea;
    }

    public void setBelongArea(String belongArea) {
        this.belongArea = belongArea == null ? null : belongArea.trim();
    }

    public String getBelongRole() {
        return belongRole;
    }

    public void setBelongRole(String belongRole) {
        this.belongRole = belongRole == null ? null : belongRole.trim();
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }
}