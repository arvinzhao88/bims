package com.cummins.bims.enums;

public enum MeasureEnum {

    /**
     * 处置措施
     */
    Scrap(1, "料废"),
    WorkWaste(2, "工废"),
    ConcessionReception(3, "让步接收"),
    Pending(4, "待处理"),
    EngineeringDeviation(5, "工程偏离"),
    Filter(6, "筛选"),
    Rejection(7, "拒收"),
    Rework(8, "返工");

    private Integer code;

    private String name;

    MeasureEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(Integer code) {
        if (code == null) {
            return "";
        } else {
            for (MeasureEnum enumItem : MeasureEnum.values()) {
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
