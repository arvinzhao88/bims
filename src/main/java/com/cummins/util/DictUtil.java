package com.cummins.util;

public class DictUtil {

  /**
  * @Author : wdxu
  * @Date :14:19 2019/7/8
  * @Description: 工具类型
  */
  public static final int creationTool = 10;


  /*
   * 角色类型
   *
   * 线边 1
   * 质检 2
   * 质量工程师 3
   * */
  public static final int MFG = 1;
  public static final int Inspector = 2;
  public static final int QUA = 3;

  /*
   任务状态：
   待接收 ：0
   维修中：1
   待服务工程师审核：2
   待路测工程师审核：3
   已存档：4
    路试工程师驳回：5
  服务工程师驳回：6
    */
  public static final int PENDIN_GRECEPTION = 0;
  public static final int MAINTA_INING = 1;
  public static final int WAITING_FORSERVICEEN = 2;
  public static final int WAITINGFOR_THEROADTESTEN = 3;
  public static final int ARCHIVED = 4;
  public static final int roadTestEngineerRejected = 5;
  public static final int REJECT = 6;

  /*
  *处理记录操作类型：
   派发任务：0
   接收任务：1
   提交服务工程师审核：2
   提交路试工程师审核：3
   审核通过：4
   通过归档：5
   服务工程师驳回：：6
   * 路试工程师驳回：：7
      */
  public static final int DISPATCH_TASK = 0;
  public static final int RECEIVING_TASK = 1;
  public static final int SERVICEENGINEERRE_VIEW = 2;
  public static final int ROADTESTENGINEERRE_VIEW = 3;
  public static final int EXAMINATIONP_ASSED = 4;
  public static final int APP_ROVED = 5;
  public static final int OVERRULE = 6;
  public static final int roadTestEngineerRejecteds = 7;

  /** 状态 */
  public static final int STATE_ENABLE = 0;

  public static final int STATE_CLOSE = 1;

  /** STATE_MSG：消息 STATE_ANNU：公告 */
  public static final int STATE_MSG = 0;

  public static final int STATE_ANNU = 1;

  /** 是否推荐 YES_RECOM：推荐 NO_RECOM：不推荐 */
  public static final int YES_RECOM = 1;

  public static final int NO_RECOM = 2;

  /** 行为状态 1正常 2已预约 3借出 4归还申请 5归还异常 */
  public static final int STATE_NORMAL = 1;

  public static final int STATE_ALREADY_RESERVED = 2;
  public static final int STATE_LEND = 3;
  public static final int STATE_GIVEBACK_APPLII = 4;
  public static final int STATE_ERROR = 5;
  public static final int STATE_CANCLE = 6;

  /** 消息类型 1 text消息 2 image消息 3 voice消息 4 video消息 5 file消息 6 news消息 7 mpnews消息 */
  public static final int MSG_TEXT = 1;

  public static final int MSG_IMAGE = 2;
  public static final int MSG_VOICE = 3;
  public static final int MSG_VIDEO = 4;
  public static final int MSG_FILE = 5;
  public static final int MSG_NEWS = 6;
  public static final int MSG_MPNEWS = 7;
  public static final int MSG_TEXTCARD = 8;

  /** 发送状态 0待发送 1发送成功 2发送失败 3发送中 */
  public static final int MSG_PENDING = 0;

  public static final int MSG_SEND_SUCCESS = 1;
  public static final int MSG_SEND_FAIL = 2;
  public static final int MSG_SENDDING = 3;

  /** 发送状态 Borrow表 1：已发送 2：未发送 */
  public static final int MSG_SENTED = 1;

  public static final int MSG_UNSENT = 2;
}
