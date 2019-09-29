package com.cummins.util;

import com.cummins.bims.dto.Advice;
import com.cummins.bims.dto.Bill;
import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.MsgPerson;
import com.cummins.bims.enums.BillEnum;
import com.cummins.bims.enums.MeasureEnum;
import com.cummins.wx.dto.WxAccessToken;
import com.cummins.wx.request.message.TextCard;
import com.cummins.wx.request.message.TextCardRequest;
import com.cummins.wx.service.IWxAccessTokenService;
import com.cummins.wx.util.QySendMsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @ClassName SendMsg
 * @Author shangpinyuan06
 * @Date 2019/5/24 15:08
 * 发送消息通知，微信公众号
 **/
@Component
public class SendMsg {
    private static String url;

    @Value("${wx_sendMsg_url}")
    public void setUrl(String url) {
        this.url = url;
    }

    private static String qywxAppid;

    @Value("${qywx_appid}")
    public void setQywxAppid(String qywxAppid) {
        this.qywxAppid = qywxAppid;
    }

    private static String qywxCorpsecret;

    @Value("${qywx_corpsecret}")
    public void setQywxCorpsecret(String qywxCorpsecret) {
        this.qywxCorpsecret = qywxCorpsecret;
    }

    private static IWxAccessTokenService wxAccessTokenService;

    @Autowired
    @Qualifier("wxAccessTokenService")
    public void setWxAccessTokenService(IWxAccessTokenService wxAccessTokenService) {
        this.wxAccessTokenService = wxAccessTokenService;
    }

    /**
     * 企业微信消息推送
     *
     * @param personId 用户id
     * @param title    标题
     * @param content  内容
     */
    public static void qyWxMsg(String personId, String title, String content, String details) {
        SendMsg.get();
        TextCard textCard = new TextCard();
        textCard.setTitle(title);
        textCard.setDescription(content);
//        textCard.setUrl(url+details);
//        textCard.setBtntxt("点击查看详情");
        TextCardRequest textCardRequest = new TextCardRequest();
        textCardRequest.setTextcard(textCard);
        textCardRequest.setTouser(personId);
            textCardRequest.setMsgtype("textcard");
        textCardRequest.setAgentid(1000075);
        WxAccessToken accessToken = wxAccessTokenService.getAccessToken("8Bfa7fk0Zgv4aW_9AoBPFGiNKOA4_qPCUwu_mYwR8l8",
                "1000075");
        QySendMsgUtil.sendTxtCardMsg(textCardRequest, accessToken.getAccessToken());
    }

    /**
     * 处理意见
     * @param issue
     * @param advice
     */
    public static void sendAdvice(Issue issue, Advice advice) {
        SendMsg.get();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        StringBuffer buffer = new StringBuffer();
        buffer.append("问题编码: ");
        buffer.append(issue.getNumber());
        buffer.append("\n问题描述: ");
        buffer.append(issue.getIssueCategoryL3());
        buffer.append("\n处理意见: ");
        buffer.append(advice.getResolution());
        buffer.append("\n处理人: ");
        buffer.append(issue.getProcessPersonName());
        buffer.append("\n处理日期: ");
        buffer.append(format.format(advice.getHandlerDate() == null ? "" : advice.getHandlerDate()));
        qyWxMsg(issue.getInputPersonAccount(), "问题通知", buffer.toString(), "toEdit?temp=t&id=" + issue.getId());
    }

    /**
     * 通知物流和SQI
     * @param issue
     * @param msgPerson
     */
    public static void sendNoticeSQI(Issue issue, MsgPerson msgPerson, List<Bill> bills) {
        SendMsg.get();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        StringBuffer buffer = new StringBuffer();
        buffer.append("问题编码: ");
        buffer.append(issue.getNumber());
        if ("T".equals(issue.getQualityType())){
            buffer.append("\nESN: ");
            buffer.append(issue.getEsn());
            buffer.append("\nSO: ");
            buffer.append(issue.getSo());
        }else {
            buffer.append("\n零件号: ");
            buffer.append(issue.getPartNo());
            buffer.append("\n数量: ");
            buffer.append(issue.getQty());
            buffer.append("\n区域: ");
            buffer.append(issue.getQualityType());
            buffer.append("\n工位: ");
            buffer.append(issue.getIssueStation());
            buffer.append("\n供应商代码: ");
            buffer.append(issue.getVendorCode());
        }
        if (bills.size()>0){
            buffer.append("\n处理措施: ");
            buffer.append(MeasureEnum.getNameByCode(Integer.valueOf(bills.get(0).getTempMeasures()))+";");
            buffer.append("\n处理单编号: ");
            for (Bill bill: bills) {
                String s = bill.getMeasureNo()+"("+bill.getBillName()+")"+";\n";
                buffer.append(s);
            }
        }
        qyWxMsg(msgPerson.getPersonAccount(), "问题处置措施", buffer.toString(),"list?temp=a");
    }

    public static void main(String[] args) {
        /*TextCard textCard = new TextCard();
        textCard.setTitle("test");
        textCard.setDescription("eee");
        textCard.setUrl("www.baidu.com");
        textCard.setBtntxt("点击查看详情");
        TextCardRequest textCardRequest = new TextCardRequest();
        textCardRequest.setTextcard(textCard);
        textCardRequest.setTouser("aa000051");
        textCardRequest.setMsgtype("textcard");
        textCardRequest.setAgentid(1000075);
       *//* WxAccessToken accessToken = wxAccessTokenService.getAccessToken("8Bfa7fk0Zgv4aW_9AoBPFGiNKOA4_qPCUwu_mYwR8l8",
                "1000075");*//*
        QySendMsgUtil.sendTxtCardMsg(textCardRequest, );*/
    }

    //查看是否注入
    public static void get() {
        System.out.println("=====url====="+url);
        System.out.println("=====qywxAppid====="+qywxAppid);
        System.out.println("=====qywxCorpsecret====="+qywxCorpsecret);
    }
}
