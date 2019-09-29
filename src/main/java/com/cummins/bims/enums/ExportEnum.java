package com.cummins.bims.enums;

public enum ExportEnum {

    /**
     *
     */

    issueL1Name("1", "自制件"),
    issueL2Name("2", "采购件"),
    issueL3Name("3", "在制发动机");

    private String code;

    private String name;

    ExportEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(String code) {
        if (code == null) {
            return "";
        } else {
            for (ExportEnum enumItem : ExportEnum.values()) {
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
