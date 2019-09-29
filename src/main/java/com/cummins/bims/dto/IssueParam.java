package com.cummins.bims.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class IssueParam implements Serializable {
    private Integer id;

    private String number;

    private String issueDesc;

    private String plant;

    private String plantname;

    private String area;

    private String areaname;

    private String issueStation;

    private String seriesNo;

    private String qualityType;

    private String issueCategoryL1Name;

    private String issueCategoryL1;

    private String issueCategoryL2Name;

    private String issueCategoryL2;

    private String issueCategoryL3Name;

    private String issueCategoryL3;

    private String failureLocation;

    private String esn;

    private String so;

    private String projectNo;

    private String engineType;

    private String engineSeries;

    private String issueType;

    private String partNo;

    private String partName;

    private String vendorCode;

    private String vendorName;

    private Integer qty;

    private String comments;

    private String isRft;

    private String isEqr;

    private String isCarry;

    private String isClaim;

    private String isCountindex;
//    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date inputTime;

    private String inputPerson;

    private String inputPresonName;

    private String inputPersonAccount;

    private String delflag;

    private String subSource;

    private String processStatus;

    private String processPerson;

    private String processPersonName;

    private String processPersonAccount;
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date processTime;

    private String processMethod;

    private String reviewPerson;

    private String reviewPersonName;

    private String reviewPersonAccount;
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reviewTime;
//    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date closeTime;

    private String attach;
	
	private String l1name;

	private String locationname;

	private String l2name;

	private String l3name;

	private String shId;

	private String issueExtend;

	private List<DealTool> dealTool;

	private String toolStatus; // 工具状态

    private String tools; // 处理工具责任人

    private List<DealToolPerson> dealToolPerson;//工具-/-责任人

    private List<Bill> billList;//单据

    private String bills;//单据

    public String getBills() {
        return bills;
    }

    public void setBills(String bills) {
        this.bills = bills;
    }

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    private static final long serialVersionUID = 1L;

    public List<DealToolPerson> getDealToolPerson() {
        return dealToolPerson;
    }

    public void setDealToolPerson(List<DealToolPerson> dealToolPerson) {
        this.dealToolPerson = dealToolPerson;
    }

    public String getShId() {
        return shId;
    }

    public void setShId(String shId) {
        this.shId = shId;
    }

    public String getToolStatus() {
        return toolStatus;
    }

    public void setToolStatus(String toolStatus) {
        this.toolStatus = toolStatus;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getPlantname() {
        return plantname;
    }

    public void setPlantname(String plantname) {
        this.plantname = plantname;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getL1name() {
        return l1name;
    }

    public void setL1name(String l1name) {
        this.l1name = l1name;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    public String getL2name() {
        return l2name;
    }

    public void setL2name(String l2name) {
        this.l2name = l2name;
    }

    public String getL3name() {
        return l3name;
    }

    public void setL3name(String l3name) {
        this.l3name = l3name;
    }

    public List<DealTool> getDealTool() {
        return dealTool;
    }

    public void setDealTool(List<DealTool> dealTool) {
        this.dealTool = dealTool;
    }

    public String getIssueExtend() {
        return issueExtend;
    }

    public void setIssueExtend(String issueExtend) {
        this.issueExtend = issueExtend;
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

    public String getIssueDesc() {
        return issueDesc;
    }

    public void setIssueDesc(String issueDesc) {
        this.issueDesc = issueDesc == null ? null : issueDesc.trim();
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant == null ? null : plant.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getIssueStation() {
        return issueStation;
    }

    public void setIssueStation(String issueStation) {
        this.issueStation = issueStation == null ? null : issueStation.trim();
    }

    public String getSeriesNo() {
        return seriesNo;
    }

    public void setSeriesNo(String seriesNo) {
        this.seriesNo = seriesNo == null ? null : seriesNo.trim();
    }

    public String getQualityType() {
        return qualityType;
    }

    public void setQualityType(String qualityType) {
        this.qualityType = qualityType == null ? null : qualityType.trim();
    }

    public String getIssueCategoryL1Name() {
        return issueCategoryL1Name;
    }

    public void setIssueCategoryL1Name(String issueCategoryL1Name) {
        this.issueCategoryL1Name = issueCategoryL1Name == null ? null : issueCategoryL1Name.trim();
    }

    public String getIssueCategoryL1() {
        return issueCategoryL1;
    }

    public void setIssueCategoryL1(String issueCategoryL1) {
        this.issueCategoryL1 = issueCategoryL1 == null ? null : issueCategoryL1.trim();
    }

    public String getIssueCategoryL2Name() {
        return issueCategoryL2Name;
    }

    public void setIssueCategoryL2Name(String issueCategoryL2Name) {
        this.issueCategoryL2Name = issueCategoryL2Name == null ? null : issueCategoryL2Name.trim();
    }

    public String getIssueCategoryL2() {
        return issueCategoryL2;
    }

    public void setIssueCategoryL2(String issueCategoryL2) {
        this.issueCategoryL2 = issueCategoryL2 == null ? null : issueCategoryL2.trim();
    }

    public String getIssueCategoryL3Name() {
        return issueCategoryL3Name;
    }

    public void setIssueCategoryL3Name(String issueCategoryL3Name) {
        this.issueCategoryL3Name = issueCategoryL3Name == null ? null : issueCategoryL3Name.trim();
    }

    public String getIssueCategoryL3() {
        return issueCategoryL3;
    }

    public void setIssueCategoryL3(String issueCategoryL3) {
        this.issueCategoryL3 = issueCategoryL3 == null ? null : issueCategoryL3.trim();
    }

    public String getFailureLocation() {
        return failureLocation;
    }

    public void setFailureLocation(String failureLocation) {
        this.failureLocation = failureLocation == null ? null : failureLocation.trim();
    }

    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn == null ? null : esn.trim();
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so == null ? null : so.trim();
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType == null ? null : engineType.trim();
    }

    public String getEngineSeries() {
        return engineSeries;
    }

    public void setEngineSeries(String engineSeries) {
        this.engineSeries = engineSeries == null ? null : engineSeries.trim();
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType == null ? null : issueType.trim();
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

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode == null ? null : vendorCode.trim();
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getIsRft() {
        return isRft;
    }

    public void setIsRft(String isRft) {
        this.isRft = isRft == null ? null : isRft.trim();
    }

    public String getIsEqr() {
        return isEqr;
    }

    public void setIsEqr(String isEqr) {
        this.isEqr = isEqr == null ? null : isEqr.trim();
    }

    public String getIsCarry() {
        return isCarry;
    }

    public void setIsCarry(String isCarry) {
        this.isCarry = isCarry == null ? null : isCarry.trim();
    }

    public String getIsClaim() {
        return isClaim;
    }

    public void setIsClaim(String isClaim) {
        this.isClaim = isClaim == null ? null : isClaim.trim();
    }

    public String getIsCountindex() {
        return isCountindex;
    }

    public void setIsCountindex(String isCountindex) {
        this.isCountindex = isCountindex == null ? null : isCountindex.trim();
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getInputPerson() {
        return inputPerson;
    }

    public void setInputPerson(String inputPerson) {
        this.inputPerson = inputPerson == null ? null : inputPerson.trim();
    }

    public String getInputPresonName() {
        return inputPresonName;
    }

    public void setInputPresonName(String inputPresonName) {
        this.inputPresonName = inputPresonName == null ? null : inputPresonName.trim();
    }

    public String getInputPersonAccount() {
        return inputPersonAccount;
    }

    public void setInputPersonAccount(String inputPersonAccount) {
        this.inputPersonAccount = inputPersonAccount == null ? null : inputPersonAccount.trim();
    }

    public String getDelflag() {
        return delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag == null ? null : delflag.trim();
    }

    public String getSubSource() {
        return subSource;
    }

    public void setSubSource(String subSource) {
        this.subSource = subSource == null ? null : subSource.trim();
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus == null ? null : processStatus.trim();
    }

    public String getProcessPerson() {
        return processPerson;
    }

    public void setProcessPerson(String processPerson) {
        this.processPerson = processPerson == null ? null : processPerson.trim();
    }

    public String getProcessPersonName() {
        return processPersonName;
    }

    public void setProcessPersonName(String processPersonName) {
        this.processPersonName = processPersonName == null ? null : processPersonName.trim();
    }

    public String getProcessPersonAccount() {
        return processPersonAccount;
    }

    public void setProcessPersonAccount(String processPersonAccount) {
        this.processPersonAccount = processPersonAccount == null ? null : processPersonAccount.trim();
    }

    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    public String getProcessMethod() {
        return processMethod;
    }

    public void setProcessMethod(String processMethod) {
        this.processMethod = processMethod == null ? null : processMethod.trim();
    }

    public String getReviewPerson() {
        return reviewPerson;
    }

    public void setReviewPerson(String reviewPerson) {
        this.reviewPerson = reviewPerson == null ? null : reviewPerson.trim();
    }

    public String getReviewPersonName() {
        return reviewPersonName;
    }

    public void setReviewPersonName(String reviewPersonName) {
        this.reviewPersonName = reviewPersonName == null ? null : reviewPersonName.trim();
    }

    public String getReviewPersonAccount() {
        return reviewPersonAccount;
    }

    public void setReviewPersonAccount(String reviewPersonAccount) {
        this.reviewPersonAccount = reviewPersonAccount == null ? null : reviewPersonAccount.trim();
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }
}