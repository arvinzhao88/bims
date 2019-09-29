package com.cummins.receipt.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class DocumentsToBeProcesses implements Serializable {
    private Integer id;

    private Integer questionId;

    private String number;

    private Integer inPlantCustomers2;

    private String type;

    private String partsEngineNumber;

    private Double quantity;

    private String partName;

    private String traceabilityId;

    private String area;

    private String defectDescription;

    private Integer requester;

    private Date date;

    private String supplierCode;

    private String supplierName;

    private String holdScope;

    private String disposition;

    private String nextOwner;

    private Integer qualityEngineer;

    private String belongArea;

    private String updateAccount;

    private Integer statue;

    private Date updatetime;

    private String createAccount;

    private Date createtime2;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getInPlantCustomers2() {
        return inPlantCustomers2;
    }

    public void setInPlantCustomers2(Integer inPlantCustomers2) {
        this.inPlantCustomers2 = inPlantCustomers2;
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

    public String getTraceabilityId() {
        return traceabilityId;
    }

    public void setTraceabilityId(String traceabilityId) {
        this.traceabilityId = traceabilityId == null ? null : traceabilityId.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getDefectDescription() {
        return defectDescription;
    }

    public void setDefectDescription(String defectDescription) {
        this.defectDescription = defectDescription == null ? null : defectDescription.trim();
    }

    public Integer getRequester() {
        return requester;
    }

    public void setRequester(Integer requester) {
        this.requester = requester;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getHoldScope() {
        return holdScope;
    }

    public void setHoldScope(String holdScope) {
        this.holdScope = holdScope == null ? null : holdScope.trim();
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition == null ? null : disposition.trim();
    }

    public String getNextOwner() {
        return nextOwner;
    }

    public void setNextOwner(String nextOwner) {
        this.nextOwner = nextOwner == null ? null : nextOwner.trim();
    }

    public Integer getQualityEngineer() {
        return qualityEngineer;
    }

    public void setQualityEngineer(Integer qualityEngineer) {
        this.qualityEngineer = qualityEngineer;
    }

    public String getBelongArea() {
        return belongArea;
    }

    public void setBelongArea(String belongArea) {
        this.belongArea = belongArea == null ? null : belongArea.trim();
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

    public String getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(String createAccount) {
        this.createAccount = createAccount == null ? null : createAccount.trim();
    }

    public Date getCreatetime2() {
        return createtime2;
    }

    public void setCreatetime2(Date createtime2) {
        this.createtime2 = createtime2;
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