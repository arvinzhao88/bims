package com.cummins.bims.enums;

public enum BillEnum {

    /**
     * 问题单据
     */
    HoldTag(1, "待处理标签"),
    ScrapTicket(2, "报废单"),
    WaiverRequestAndAssessmentForm(3, "让步接收单"),
    PendingList(4, "待处理品单"),
    AssociatedScrapList(5, "连带报废单"),
    NonconformingContainmentForm(6, "不合格品抑制单"),
    ScrapAndAssociated(7, "报废单&连带报废单"),
    Reworkchecklist(8, "返工返修筛选单");

    private Integer code;

    private String name;

    BillEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(Integer code) {
        if (code == null) {
            return "";
        } else {
            for (BillEnum enumItem : BillEnum.values()) {
                if (enumItem.getCode().equals(code)) {
                    return enumItem.getName();
                }
            }
            return "";
        }
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
