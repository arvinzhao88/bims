package com.cummins.printer.model;

import java.io.Serializable;
import java.util.Date;

/**
 * r_person_printer
 * @author 
 */
public class Printer implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 员工id
     */
    private Integer personId;

    /**
     * 员工工号
     */
    private String personAccount;

    /**
     * 员工姓名
     */
    private String personName;

    /**
     * 打印机ip
     */
    private String printerIp;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建人id
     */
    private Integer createPersonId;

    /**
     * 创建人工号
     */
    private String createPersonAccount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人id
     */
    private Integer modifyPersonId;

    /**
     * 修改人工号
     */
    private String modifyPersonAccount;

    /**
     * 修改时间
     */
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonAccount() {
        return personAccount;
    }

    public void setPersonAccount(String personAccount) {
        this.personAccount = personAccount;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPrinterIp() {
        return printerIp;
    }

    public void setPrinterIp(String printerIp) {
        this.printerIp = printerIp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreatePersonId() {
        return createPersonId;
    }

    public void setCreatePersonId(Integer createPersonId) {
        this.createPersonId = createPersonId;
    }

    public String getCreatePersonAccount() {
        return createPersonAccount;
    }

    public void setCreatePersonAccount(String createPersonAccount) {
        this.createPersonAccount = createPersonAccount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getModifyPersonId() {
        return modifyPersonId;
    }

    public void setModifyPersonId(Integer modifyPersonId) {
        this.modifyPersonId = modifyPersonId;
    }

    public String getModifyPersonAccount() {
        return modifyPersonAccount;
    }

    public void setModifyPersonAccount(String modifyPersonAccount) {
        this.modifyPersonAccount = modifyPersonAccount;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Printer other = (Printer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPersonId() == null ? other.getPersonId() == null : this.getPersonId().equals(other.getPersonId()))
            && (this.getPersonAccount() == null ? other.getPersonAccount() == null : this.getPersonAccount().equals(other.getPersonAccount()))
            && (this.getPersonName() == null ? other.getPersonName() == null : this.getPersonName().equals(other.getPersonName()))
            && (this.getPrinterIp() == null ? other.getPrinterIp() == null : this.getPrinterIp().equals(other.getPrinterIp()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreatePersonId() == null ? other.getCreatePersonId() == null : this.getCreatePersonId().equals(other.getCreatePersonId()))
            && (this.getCreatePersonAccount() == null ? other.getCreatePersonAccount() == null : this.getCreatePersonAccount().equals(other.getCreatePersonAccount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPersonId() == null ? other.getModifyPersonId() == null : this.getModifyPersonId().equals(other.getModifyPersonId()))
            && (this.getModifyPersonAccount() == null ? other.getModifyPersonAccount() == null : this.getModifyPersonAccount().equals(other.getModifyPersonAccount()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPersonId() == null) ? 0 : getPersonId().hashCode());
        result = prime * result + ((getPersonAccount() == null) ? 0 : getPersonAccount().hashCode());
        result = prime * result + ((getPersonName() == null) ? 0 : getPersonName().hashCode());
        result = prime * result + ((getPrinterIp() == null) ? 0 : getPrinterIp().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreatePersonId() == null) ? 0 : getCreatePersonId().hashCode());
        result = prime * result + ((getCreatePersonAccount() == null) ? 0 : getCreatePersonAccount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPersonId() == null) ? 0 : getModifyPersonId().hashCode());
        result = prime * result + ((getModifyPersonAccount() == null) ? 0 : getModifyPersonAccount().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", personId=").append(personId);
        sb.append(", personAccount=").append(personAccount);
        sb.append(", personName=").append(personName);
        sb.append(", printerIp=").append(printerIp);
        sb.append(", status=").append(status);
        sb.append(", createPersonId=").append(createPersonId);
        sb.append(", createPersonAccount=").append(createPersonAccount);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyPersonId=").append(modifyPersonId);
        sb.append(", modifyPersonAccount=").append(modifyPersonAccount);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}