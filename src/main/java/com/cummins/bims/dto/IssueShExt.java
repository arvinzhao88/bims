package com.cummins.bims.dto;

import java.io.Serializable;

public class IssueShExt implements Serializable {
    private Integer id;

    private String issueShId;

    private String imgDesc;

    private String imgPath;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssueShId() {
        return issueShId;
    }

    public void setIssueShId(String issueShId) {
        this.issueShId = issueShId == null ? null : issueShId.trim();
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc == null ? null : imgDesc.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }
}