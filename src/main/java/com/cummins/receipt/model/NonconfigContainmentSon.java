package com.cummins.receipt.model;

import java.io.Serializable;

public class NonconfigContainmentSon implements Serializable {
    private Integer ncfId;

    private String location;

    private String qtty;

    private String screendQtty;

    private String nokQtty;

    private String response;

    private String verifier;

    private String completionDate;

    private static final long serialVersionUID = 1L;

    public Integer getNcfId() {
        return ncfId;
    }

    public void setNcfId(Integer ncfId) {
        this.ncfId = ncfId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getQtty() {
        return qtty;
    }

    public void setQtty(String qtty) {
        this.qtty = qtty == null ? null : qtty.trim();
    }

    public String getScreendQtty() {
        return screendQtty;
    }

    public void setScreendQtty(String screendQtty) {
        this.screendQtty = screendQtty == null ? null : screendQtty.trim();
    }

    public String getNokQtty() {
        return nokQtty;
    }

    public void setNokQtty(String nokQtty) {
        this.nokQtty = nokQtty == null ? null : nokQtty.trim();
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier == null ? null : verifier.trim();
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate == null ? null : completionDate.trim();
    }
}