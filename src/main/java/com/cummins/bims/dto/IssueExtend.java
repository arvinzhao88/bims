package com.cummins.bims.dto;

import java.io.Serializable;

public class IssueExtend extends Issue implements Serializable {
    private Integer id;

    private Integer issueManageId;

    private String attribute;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIssueManageId() {
        return issueManageId;
    }

    public void setIssueManageId(Integer issueManageId) {
        this.issueManageId = issueManageId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }
}