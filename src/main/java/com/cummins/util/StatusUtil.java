package com.cummins.util;

public class StatusUtil {
    // 线边提交，PC端未接收
    public static String ISSUE_MFG_SUBMIT = "0";
    // T区指定处理人发送完处理意见，返回给线边
    public static String ISSUE_DEA_SEND_MESSAGE = "1";
    // 质量工程师提交（--，待处理）
    public static String ISSUE_QUA_SUBMIT = "2";
    // 质量工程师接收（未修正，待处理）
    public static String ISSUE_QUA_RECEIVE = "3";
    // 质量工程师修正（已修正，处理中）
    public static String ISSUE_QUA_AMEND = "4";
}
