package com.cummins.pad.model;

import java.io.Serializable;
import java.util.Date;

/**
 * t_hold_tag_log
 * @author 
 */
public class HoldTagLog implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 问题id
     */
    private Integer issueId;

    /**
     * 员工id
     */
    private Integer personId;

    /**
     * 员工工号
     */
    private String personAccount;

    /**
     * 打印机ip
     */
    private String printerIp;

    /**
     * 打印内容json
     */
    private String printContent;

    /**
     * 打印时间
     */
    private Date printTime;

    /**
     * 状态
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
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

    public String getPrinterIp() {
        return printerIp;
    }

    public void setPrinterIp(String printerIp) {
        this.printerIp = printerIp;
    }

    public String getPrintContent() {
        return printContent;
    }

    public void setPrintContent(String printContent) {
        this.printContent = printContent;
    }

    public Date getPrintTime() {
        return printTime;
    }

    public void setPrintTime(Date printTime) {
        this.printTime = printTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        HoldTagLog other = (HoldTagLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIssueId() == null ? other.getIssueId() == null : this.getIssueId().equals(other.getIssueId()))
            && (this.getPersonId() == null ? other.getPersonId() == null : this.getPersonId().equals(other.getPersonId()))
            && (this.getPersonAccount() == null ? other.getPersonAccount() == null : this.getPersonAccount().equals(other.getPersonAccount()))
            && (this.getPrinterIp() == null ? other.getPrinterIp() == null : this.getPrinterIp().equals(other.getPrinterIp()))
            && (this.getPrintContent() == null ? other.getPrintContent() == null : this.getPrintContent().equals(other.getPrintContent()))
            && (this.getPrintTime() == null ? other.getPrintTime() == null : this.getPrintTime().equals(other.getPrintTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIssueId() == null) ? 0 : getIssueId().hashCode());
        result = prime * result + ((getPersonId() == null) ? 0 : getPersonId().hashCode());
        result = prime * result + ((getPersonAccount() == null) ? 0 : getPersonAccount().hashCode());
        result = prime * result + ((getPrinterIp() == null) ? 0 : getPrinterIp().hashCode());
        result = prime * result + ((getPrintContent() == null) ? 0 : getPrintContent().hashCode());
        result = prime * result + ((getPrintTime() == null) ? 0 : getPrintTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", issueId=").append(issueId);
        sb.append(", personId=").append(personId);
        sb.append(", personAccount=").append(personAccount);
        sb.append(", printerIp=").append(printerIp);
        sb.append(", printContent=").append(printContent);
        sb.append(", printTime=").append(printTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}