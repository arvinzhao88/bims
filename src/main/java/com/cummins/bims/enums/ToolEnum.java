package com.cummins.bims.enums;

public enum ToolEnum {

    /**
     * 处理工具
     */
    CAR(1, "CAR"),
    SCAR(2, "SCAR"),
    STEP7(3, "7STEP"),
    Notification(4, "Notification"),
    PQC(5, "PQC");

    private Integer code;

    private String name;

    ToolEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(Integer code) {
        if (code == null) {
            return "";
        } else {
            for (ToolEnum enumItem : ToolEnum.values()) {
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
