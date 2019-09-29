package com.cummins.bims.dto;

import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable {
    private Integer id;

    private Integer issueId;

    private String issueDesc;

    private Date issueDate;

    private String issueArea;

    private String stationNo;

    private String engineType;

    private String engineSerialNo;

    private String partNo;

    private String partName;

    private String containmentAction;

    private String supplierName;

    private Integer ailureQty;

    private String cleanPoint;

    private String effectEngineAmout;

    private String effectScope;

    private String effectToDelivery;

    private String issueSensor;

    private String image;

    private String carScar;

    private String dutyPerson;

    private String mailContent;

    private String emailNos;

    public String getEmailNos() {
        return emailNos;
    }

    public void setEmailNos(String emailNos) {
        this.emailNos = emailNos;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

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

    public String getIssueDesc() {
        return issueDesc;
    }

    public void setIssueDesc(String issueDesc) {
        this.issueDesc = issueDesc == null ? null : issueDesc.trim();
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueArea() {
        return issueArea;
    }

    public void setIssueArea(String issueArea) {
        this.issueArea = issueArea == null ? null : issueArea.trim();
    }

    public String getStationNo() {
        return stationNo;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo == null ? null : stationNo.trim();
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType == null ? null : engineType.trim();
    }

    public String getEngineSerialNo() {
        return engineSerialNo;
    }

    public void setEngineSerialNo(String engineSerialNo) {
        this.engineSerialNo = engineSerialNo == null ? null : engineSerialNo.trim();
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo == null ? null : partNo.trim();
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public String getContainmentAction() {
        return containmentAction;
    }

    public void setContainmentAction(String containmentAction) {
        this.containmentAction = containmentAction == null ? null : containmentAction.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Integer getAilureQty() {
        return ailureQty;
    }

    public void setAilureQty(Integer ailureQty) {
        this.ailureQty = ailureQty;
    }

    public String getCleanPoint() {
        return cleanPoint;
    }

    public void setCleanPoint(String cleanPoint) {
        this.cleanPoint = cleanPoint == null ? null : cleanPoint.trim();
    }

    public String getEffectEngineAmout() {
        return effectEngineAmout;
    }

    public void setEffectEngineAmout(String effectEngineAmout) {
        this.effectEngineAmout = effectEngineAmout == null ? null : effectEngineAmout.trim();
    }

    public String getEffectScope() {
        return effectScope;
    }

    public void setEffectScope(String effectScope) {
        this.effectScope = effectScope == null ? null : effectScope.trim();
    }

    public String getEffectToDelivery() {
        return effectToDelivery;
    }

    public void setEffectToDelivery(String effectToDelivery) {
        this.effectToDelivery = effectToDelivery == null ? null : effectToDelivery.trim();
    }

    public String getIssueSensor() {
        return issueSensor;
    }

    public void setIssueSensor(String issueSensor) {
        this.issueSensor = issueSensor == null ? null : issueSensor.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getCarScar() {
        return carScar;
    }

    public void setCarScar(String carScar) {
        this.carScar = carScar == null ? null : carScar.trim();
    }

    public String getDutyPerson() {
        return dutyPerson;
    }

    public void setDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson == null ? null : dutyPerson.trim();
    }
}