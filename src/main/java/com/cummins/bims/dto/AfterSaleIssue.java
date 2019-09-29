package com.cummins.bims.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AfterSaleIssue implements Serializable {
    private Integer id;

    private String number;

    private String inputPersonName;

    private String inputPerson;

    private Date inputTime;

    private String informationSource;

    private String vehicleEquipment;

    private String vehicleVin;

    private String engineSeries;

    private String engineType;

    private String engineSeriesNo;

    private String shopOrder;

    private String engineBuildDate;

    private String dealerName;

    private String dealerContact;

    private String vehicleBuildDate;

    private String vehicleSaleDate;

    private String failureDate;

    private String failureMileage;

    private String failureNum;

    private String repairLocation;

    private String usingCondition;

    private String customerName;

    private String customerPhone;

    private String customerType;

    private String faultDesc;

    private String faultPart;

    private String failureMode;

    private String faultPartNo;

    private String fieldInspect;

    private String failureAnalysisConclusion;

    private String requireFix;

    private String comments;

    private Integer type;

    private String factory;

    private Date closeDate;

    private String handler;

    private String handlerName;

    private String processingTools;

    private Integer questionType;

    private Integer toolsType;

    private List<String> attach;

    private List<String> desc;

    private List<IssueShExt> shExtList;

    private String back1;

    private String back2;

    private String back3;

    private String back4;

    private String back5;

    private static final long serialVersionUID = 1L;

    public List<IssueShExt> getShExtList() {
        return shExtList;
    }

    public void setShExtList(List<IssueShExt> shExtList) {
        this.shExtList = shExtList;
    }

    public List<String> getAttach() {
        return attach;
    }

    public void setAttach(List<String> attach) {
        this.attach = attach;
    }

    public List<String> getDesc() {
        return desc;
    }

    public void setDesc(List<String> desc) {
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getInputPersonName() {
        return inputPersonName;
    }

    public void setInputPersonName(String inputPersonName) {
        this.inputPersonName = inputPersonName == null ? null : inputPersonName.trim();
    }

    public String getInputPerson() {
        return inputPerson;
    }

    public void setInputPerson(String inputPerson) {
        this.inputPerson = inputPerson == null ? null : inputPerson.trim();
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getInformationSource() {
        return informationSource;
    }

    public void setInformationSource(String informationSource) {
        this.informationSource = informationSource == null ? null : informationSource.trim();
    }

    public String getVehicleEquipment() {
        return vehicleEquipment;
    }

    public void setVehicleEquipment(String vehicleEquipment) {
        this.vehicleEquipment = vehicleEquipment == null ? null : vehicleEquipment.trim();
    }

    public String getVehicleVin() {
        return vehicleVin;
    }

    public void setVehicleVin(String vehicleVin) {
        this.vehicleVin = vehicleVin == null ? null : vehicleVin.trim();
    }

    public String getEngineSeries() {
        return engineSeries;
    }

    public void setEngineSeries(String engineSeries) {
        this.engineSeries = engineSeries == null ? null : engineSeries.trim();
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType == null ? null : engineType.trim();
    }

    public String getEngineSeriesNo() {
        return engineSeriesNo;
    }

    public void setEngineSeriesNo(String engineSeriesNo) {
        this.engineSeriesNo = engineSeriesNo == null ? null : engineSeriesNo.trim();
    }

    public String getShopOrder() {
        return shopOrder;
    }

    public void setShopOrder(String shopOrder) {
        this.shopOrder = shopOrder == null ? null : shopOrder.trim();
    }

    public String getEngineBuildDate() {
        return engineBuildDate;
    }

    public void setEngineBuildDate(String engineBuildDate) {
        this.engineBuildDate = engineBuildDate == null ? null : engineBuildDate.trim();
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName == null ? null : dealerName.trim();
    }

    public String getDealerContact() {
        return dealerContact;
    }

    public void setDealerContact(String dealerContact) {
        this.dealerContact = dealerContact == null ? null : dealerContact.trim();
    }

    public String getVehicleBuildDate() {
        return vehicleBuildDate;
    }

    public void setVehicleBuildDate(String vehicleBuildDate) {
        this.vehicleBuildDate = vehicleBuildDate == null ? null : vehicleBuildDate.trim();
    }

    public String getVehicleSaleDate() {
        return vehicleSaleDate;
    }

    public void setVehicleSaleDate(String vehicleSaleDate) {
        this.vehicleSaleDate = vehicleSaleDate == null ? null : vehicleSaleDate.trim();
    }

    public String getFailureDate() {
        return failureDate;
    }

    public void setFailureDate(String failureDate) {
        this.failureDate = failureDate == null ? null : failureDate.trim();
    }

    public String getFailureMileage() {
        return failureMileage;
    }

    public void setFailureMileage(String failureMileage) {
        this.failureMileage = failureMileage == null ? null : failureMileage.trim();
    }

    public String getFailureNum() {
        return failureNum;
    }

    public void setFailureNum(String failureNum) {
        this.failureNum = failureNum == null ? null : failureNum.trim();
    }

    public String getRepairLocation() {
        return repairLocation;
    }

    public void setRepairLocation(String repairLocation) {
        this.repairLocation = repairLocation == null ? null : repairLocation.trim();
    }

    public String getUsingCondition() {
        return usingCondition;
    }

    public void setUsingCondition(String usingCondition) {
        this.usingCondition = usingCondition == null ? null : usingCondition.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public String getFaultDesc() {
        return faultDesc;
    }

    public void setFaultDesc(String faultDesc) {
        this.faultDesc = faultDesc == null ? null : faultDesc.trim();
    }

    public String getFaultPart() {
        return faultPart;
    }

    public void setFaultPart(String faultPart) {
        this.faultPart = faultPart == null ? null : faultPart.trim();
    }

    public String getFailureMode() {
        return failureMode;
    }

    public void setFailureMode(String failureMode) {
        this.failureMode = failureMode == null ? null : failureMode.trim();
    }

    public String getFaultPartNo() {
        return faultPartNo;
    }

    public void setFaultPartNo(String faultPartNo) {
        this.faultPartNo = faultPartNo == null ? null : faultPartNo.trim();
    }

    public String getFieldInspect() {
        return fieldInspect;
    }

    public void setFieldInspect(String fieldInspect) {
        this.fieldInspect = fieldInspect == null ? null : fieldInspect.trim();
    }

    public String getFailureAnalysisConclusion() {
        return failureAnalysisConclusion;
    }

    public void setFailureAnalysisConclusion(String failureAnalysisConclusion) {
        this.failureAnalysisConclusion = failureAnalysisConclusion == null ? null : failureAnalysisConclusion.trim();
    }

    public String getRequireFix() {
        return requireFix;
    }

    public void setRequireFix(String requireFix) {
        this.requireFix = requireFix == null ? null : requireFix.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory == null ? null : factory.trim();
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName == null ? null : handlerName.trim();
    }

    public String getProcessingTools() {
        return processingTools;
    }

    public void setProcessingTools(String processingTools) {
        this.processingTools = processingTools == null ? null : processingTools.trim();
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public Integer getToolsType() {
        return toolsType;
    }

    public void setToolsType(Integer toolsType) {
        this.toolsType = toolsType;
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

    public String getBack4() {
        return back4;
    }

    public void setBack4(String back4) {
        this.back4 = back4 == null ? null : back4.trim();
    }

    public String getBack5() {
        return back5;
    }

    public void setBack5(String back5) {
        this.back5 = back5 == null ? null : back5.trim();
    }
}