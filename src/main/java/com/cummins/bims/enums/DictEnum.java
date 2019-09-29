package com.cummins.bims.enums;

public enum DictEnum {

    /** deal_tool_person表的status **/
    STATUS_INIT(0,"初始状态"),
    STATUS_WAIT(1,"待处理"),
    STATUS_OVER(2,"已处理"),

    /** deal_tool_person表的type **/
    QUALITY_ENGINEER(0, "质量工程师"),
    TYPE_DUTY(1, "责任人"),
    TYPE_REVIEW(2, "审核人"),
    TYPE_QUALITY_MANAGER(3, "质量经理"),

    /** toDoStatus标识 **/
    TO_DO(0, "待办"),
    ALREADY_DONE(1, "已办")
    ;


    private int code;
    private String name;

    DictEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
