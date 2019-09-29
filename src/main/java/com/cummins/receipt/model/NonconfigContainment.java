package com.cummins.receipt.model;

import java.io.Serializable;
import java.util.Date;

public class NonconfigContainment implements Serializable {
    private Integer id;

    private Integer questionId;

    private String partNo;

    private String description;

    private String customerSupplier;

    private String issueDescription;

    private String spec;

    private Integer wi;

    private String belongArea;

    private String createAccount;

    private String updateAccount;

    private Integer statue;

    private Date createtime;

    private Date updatetime;

    private String back1;

    private String back2;

    private String back3;

    private Integer back4;

    private Integer back5;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo == null ? null : partNo.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCustomerSupplier() {
        return customerSupplier;
    }

    public void setCustomerSupplier(String customerSupplier) {
        this.customerSupplier = customerSupplier == null ? null : customerSupplier.trim();
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription == null ? null : issueDescription.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public Integer getWi() {
        return wi;
    }

    public void setWi(Integer wi) {
        this.wi = wi;
    }

    public String getBelongArea() {
        return belongArea;
    }

    public void setBelongArea(String belongArea) {
        this.belongArea = belongArea == null ? null : belongArea.trim();
    }

    public String getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(String createAccount) {
        this.createAccount = createAccount == null ? null : createAccount.trim();
    }

    public String getUpdateAccount() {
        return updateAccount;
    }

    public void setUpdateAccount(String updateAccount) {
        this.updateAccount = updateAccount == null ? null : updateAccount.trim();
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getBack1() {
        return back1;
    }

    public void setBack1(String back1) {
        this.back1 = back1 == null ? null : back1.trim();
    }

    public String getBack2() {
        return back2;
    }

    public void setBack2(String back2) {
        this.back2 = back2 == null ? null : back2.trim();
    }

    public String getBack3() {
        return back3;
    }

    public void setBack3(String back3) {
        this.back3 = back3 == null ? null : back3.trim();
    }

    public Integer getBack4() {
        return back4;
    }

    public void setBack4(Integer back4) {
        this.back4 = back4;
    }

    public Integer getBack5() {
        return back5;
    }

    public void setBack5(Integer back5) {
        this.back5 = back5;
    }
}