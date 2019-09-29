package com.cummins.sevenstepscar.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ToolsSevenSteps implements Serializable {
    private Integer id;

    private Integer issueId;

    private String issueNumber;

    private String sevenstepDesc;

    private String attmentTwo;

    private String attmentThree;

    private String attmentSeven;

    private String checkFile;

    private String esnFrom;

    private String to1;

    private String to2;

    private String numQty;

    private String numQty2;

    private String datefrom;

    private String mqv;

    private Date createTime;

    private Integer type;

    private Date overTime;

    private Date targetdate1;

    private Date completedate1;

    private Date targetdate2;

    private Date completedate2;

    private Date targetdate3;

    private Date completedate3;
    private String back1;

    private String back2;

    private String back3;

    private String back4;

    private String back5;

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

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber == null ? null : issueNumber.trim();
    }

    public String getSevenstepDesc() {
        return sevenstepDesc;
    }

    public void setSevenstepDesc(String sevenstepDesc) {
        this.sevenstepDesc = sevenstepDesc == null ? null : sevenstepDesc.trim();
    }

    public String getAttmentTwo() {
        return attmentTwo;
    }

    public void setAttmentTwo(String attmentTwo) {
        this.attmentTwo = attmentTwo == null ? null : attmentTwo.trim();
    }

    public String getAttmentThree() {
        return attmentThree;
    }

    public void setAttmentThree(String attmentThree) {
        this.attmentThree = attmentThree == null ? null : attmentThree.trim();
    }

    public String getAttmentSeven() {
        return attmentSeven;
    }

    public void setAttmentSeven(String attmentSeven) {
        this.attmentSeven = attmentSeven == null ? null : attmentSeven.trim();
    }

    public String getCheckFile() {
        return checkFile;
    }

    public void setCheckFile(String checkFile) {
        this.checkFile = checkFile == null ? null : checkFile.trim();
    }

    public String getEsnFrom() {
        return esnFrom;
    }

    public void setEsnFrom(String esnFrom) {
        this.esnFrom = esnFrom == null ? null : esnFrom.trim();
    }

    public String getTo1() {
        return to1;
    }

    public void setTo1(String to1) {
        this.to1 = to1 == null ? null : to1.trim();
    }

    public String getNumQty() {
        return numQty;
    }

    public void setNumQty(String numQty) {
        this.numQty = numQty == null ? null : numQty.trim();
    }

    public String getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(String datefrom) {
        this.datefrom = datefrom == null ? null : datefrom.trim();
    }

    public String getMqv() {
        return mqv;
    }

    public void setMqv(String mqv) {
        this.mqv = mqv == null ? null : mqv.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getOverTime() {
        return overTime;
    }

    public void setOverTime(Date overTime) {
        this.overTime = overTime;
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