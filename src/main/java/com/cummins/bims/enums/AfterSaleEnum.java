package com.cummins.bims.enums;

public enum AfterSaleEnum {

    /**
     *
     */

    OEM_Quality("1", "OEM Quality"),
    CS("2", "CS"),
    Reliability("3", "Reliability"),
    Executive_Complaint("4", "Executive Complaint"),
    Plant_Quality("5", "Plant Quality");

    private String code;

    private String name;

    AfterSaleEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(String code) {
        if (code == null) {
            return "";
        } else {
            for (AfterSaleEnum enumItem : AfterSaleEnum.values()) {
                if (enumItem.getCode().equals(code)) {
                    return enumItem.getName();
                }
            }
            return "";
        }
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
