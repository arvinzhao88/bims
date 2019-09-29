package com.cummins.receipt.model;

import java.io.Serializable;
import java.util.Date;

public class ScrapTicket implements Serializable {
    private Integer id;

    private Integer questiondId;

    private Integer inPlantCustomers;

    private String number;

    private String type;

    private String partsEngineNumber;

    private String so;

    private Double quantity;

    private String partName;

    private String supplierCode;

    private String traceabilityId;

    private String defectDescription;

    private String itemNumber;

    private Integer requester;

    private String judgment;

    private String shareCode;

    private String associatedScrapNo;

    private Integer qualityEngineer;

    private String options;

    private String other;

    private String belongArea;

    private String createAccount;

    private String updateAccount;

    private Integer statue;

    private Date updatetime;

    private Date createtime;

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

    public Integer getQuestiondId() {
        return questiondId;
    }

    public void setQuestiondId(Integer questiondId) {
        this.questiondId = questiondId;
    }

    public Integer getInPlantCustomers() {
        return inPlantCustomers;
    }

    public void setInPlantCustomers(Integer inPlantCustomers) {
        this.inPlantCustomers = inPlantCustomers;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPartsEngineNumber() {
        return partsEngineNumber;
    }

    public void setPartsEngineNumber(String partsEngineNumber) {
        this.partsEngineNumber = partsEngineNumber == null ? null : partsEngineNumber.trim();
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so == null ? null : so.trim();
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public String getTraceabilityId() {
        return traceabilityId;
    }

    public void setTraceabilityId(String traceabilityId) {
        this.traceabilityId = traceabilityId == null ? null : traceabilityId.trim();
    }

    public String getDefectDescription() {
        return defectDescription;
    }

    public void setDefectDescription(String defectDescription) {
        this.defectDescription = defectDescription == null ? null : defectDescription.trim();
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber == null ? null : itemNumber.trim();
    }

    public Integer getRequester() {
        return requester;
    }

    public void setRequester(Integer requester) {
        this.requester = requester;
    }

    public String getJudgment() {
        return judgment;
    }

    public void setJudgment(String judgment) {
        this.judgment = judgment == null ? null : judgment.trim();
    }

    public String getShareCode() {
        return shareCode;
    }

    public void setShareCode(String shareCode) {
        this.shareCode = shareCode == null ? null : shareCode.trim();
    }

    public String getAssociatedScrapNo() {
        return associatedScrapNo;
    }

    public void setAssociatedScrapNo(String associatedScrapNo) {
        this.associatedScrapNo = associatedScrapNo == null ? null : associatedScrapNo.trim();
    }

    public Integer getQualityEngineer() {
        return qualityEngineer;
    }

    public void setQualityEngineer(Integer qualityEngineer) {
        this.qualityEngineer = qualityEngineer;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
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

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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