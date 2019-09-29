package com.cummins.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 常用的搜索 搜索和分页分不开，页面也页面数量都放在这里
 * 搜索常用的功能：时间段(startTime,endTime,不应该属于任何POJO属性值)，标题和内容搜索(比较常用)
 * 
 * @author bwl
 *
 */
@Data
public class SearchParam implements Serializable {
	private static final long serialVersionUID = 4165027379976046208L;
	private int pageNo;// 当前页码
	private int pageSize;// 每页大小
	private String startTime;// 搜索条件起始时间
	private String endTime;// 搜索条件结束时间
	private String title;// 标题 service一般也是like查询
	private String content;// 内容service like查询
	private String module;// 模块名称
	private String area;// 哪个区
	private String isEqr;//是否EQR
	private String isClaim;//评审结论
	private String processStatus;//处理状态
	private String processPerson;//处理人
	private String processPersonAccount;//处理人工号
	private String processPersonName; // 处理人姓名
	private String issueCategoryL1;//质量分类
	private String subSource;//来源
	private String searchText;//搜索框内容
	private String plant; // 厂区
	private String number; // 问题编码
	private String isRft; // T区是否合格
	private String qualityType; // 区
	private String account; // 当前登录人工号
	private String partNoOrEsn; // ESN或零件号
	private String issueCategoryL1Name; // 是否批量

	public String getIssueCategoryL1Name() {
		return issueCategoryL1Name;
	}

	public void setIssueCategoryL1Name(String issueCategoryL1Name) {
		this.issueCategoryL1Name = issueCategoryL1Name;
	}

	public String getPartNoOrEsn() {
		return partNoOrEsn;
	}

	public void setPartNoOrEsn(String partNoOrEsn) {
		this.partNoOrEsn = partNoOrEsn;
	}

	public String getProcessPersonAccount() {
		return processPersonAccount;
	}

	public void setProcessPersonAccount(String processPersonAccount) {
		this.processPersonAccount = processPersonAccount;
	}

	public String getProcessPerson() {
		return processPerson;
	}

	public void setProcessPerson(String processPerson) {
		this.processPerson = processPerson;
	}

	public String getSubSource() {
		return subSource;
	}

	public void setSubSource(String subSource) {
		this.subSource = subSource;
	}

	public String getIsEqr() {
		return isEqr;
	}

	public void setIsEqr(String isEqr) {
		this.isEqr = isEqr;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getIssueCategoryL1() {
		return issueCategoryL1;
	}

	public void setIssueCategoryL1(String issueCategoryL1) {
		this.issueCategoryL1 = issueCategoryL1;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getsearchText() {
		return searchText;
	}

	public void setsearchText(String searchText) {
		this.searchText = searchText;
	}
}
