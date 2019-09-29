package com.cummins.bims.enums;

public enum RecordStatusEnum {

    /**
     * 操作的动作
     */
    SUMITISSUE(1, "提交问题"),
    UPDATEISSUE(2, "修正更新问题"),
    UPDATE(8, "修改问题"),
    SELECTEQR(3, "选择EQR"),
    SELECTDUTYPERSON(4, "选择责任人"),
    STARTDEAL(5, "开始处理"),
    REJECT(6, "驳回"),
    CLOSE(7, "关闭问题"),
    ADDRECEIPT(9, "添加单据"),
    DELRECEIPT(10, "删除单据");

    private Integer code;

    private String name;

    RecordStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(Integer code) {
        if (code == null) {
            return "";
        } else {
            for (RecordStatusEnum enumItem : RecordStatusEnum.values()) {
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
