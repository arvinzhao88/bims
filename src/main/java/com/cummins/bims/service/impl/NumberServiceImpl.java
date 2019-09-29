package com.cummins.bims.service.impl;

import com.cummins.bims.dao.BillMapper;
import com.cummins.bims.dao.CarMapper;
import com.cummins.bims.dao.IssueMapper;
import com.cummins.bims.service.NumberService;
import com.cummins.util.NumberCreateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.cummins.util.NumberCreateUtil.subStr;


@Service
public class NumberServiceImpl implements NumberService {
    @Autowired
    private IssueMapper issueMapper;

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private BillMapper billMapper;

    /**
     * 问题编号
     * @param areaType
     * @return
     */
    public String selectMaxSn(String areaType) {
        String issueNo = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd"); // 时间字符串产生方式
        String time = format.format(new Date());
        String issue_pfix = areaType.toUpperCase() + time; // 组合流水号前一部分，NO+时间字符串，如：NO20160126
        String sn = issueMapper.selectMaxSn(time);//查询字符串最后五位
        if (sn != null) {
            //String uid_end = sn.substring(10, 15); // 截取字符串最后五位，结果:00001
            int endNum = Integer.parseInt(sn); // 把String类型的00001转化为int类型的1
            int tmpNum = 100000 + endNum + 1; // 结果10002
            issueNo = issue_pfix + subStr("" + tmpNum, 1);// 把10002首位的1去掉，再拼成NO201601260002字符串
        } else {
            issueNo = issue_pfix + "00001";
        }

        return issueNo;
    }

    /**
     * 工具编号
     * @param toolType
     * @return
     */
    public String selectMaxCarNo(String toolType) {
        String issueNo = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMM"); // 时间字符串产生方式
        String time = format.format(new Date());
        String tool_pfix = toolType.toUpperCase() + time; // 组合流水号前一部分，NO+时间字符串，如：NO20160126
        String sn = carMapper.selectMaxCarNo(time);//查询字符串最后五位
        if (sn != null) {
            //String uid_end = sn.substring(10, 15); // 截取字符串最后五位，结果:00001
            int endNum = Integer.parseInt(sn); // 把String类型的00001转化为int类型的1
            int tmpNum = 10000 + endNum + 1; // 结果10002
            issueNo = tool_pfix + subStr("" + tmpNum, 1);// 把10002首位的1去掉，再拼成NO201601260002字符串
        } else {
            issueNo = tool_pfix + "0001";
        }

        return issueNo;
    }


    /**
     * 单据编号
     * @param issueNo
     * @return
     */
    public String selectMaxBillNo(String issueNo) {
        String billNo = null;
        String sn = billMapper.selectMaxBillNo(issueNo);//查询字符串最后2位
        if (sn != null && !sn.equals("")) {
            int endNum = Integer.parseInt(sn); // 把String类型的00001转化为int类型的1
            int tmpNum = 10 + endNum + 1; // 结果10002
            billNo = issueNo + "-0" + subStr("" + tmpNum, 1);// 把10002首位的1去掉，再拼成NO201601260002字符串
        } else {
            billNo = issueNo + "-01";
        }

        return billNo;
    }
    /*public static void main(String[] args) {
        String issueNo = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd"); // 时间字符串产生方式
        String time = format.format(new Date());
        String issue_pfix = "A" + time; // 组合流水号前一部分，NO+时间字符串，如：NO20160126
        String sn = "00001";
        String number = "20190701";
        if (sn != null && number.contains(time)) {
            //String uid_end = sn.substring(10, 5); // 截取字符串最后五位，结果:00001
            int endNum = Integer.parseInt(sn); // 把String类型的00001转化为int类型的1
            int tmpNum = 100000 + endNum + 1; // 结果10002
            issueNo = issue_pfix + subStr("" + tmpNum, 1);// 把10002首位的1去掉，再拼成NO201601260002字符串
            System.out.println(issueNo);
        } else {
            issueNo = issue_pfix + "00001";
            System.out.println(issueNo);
        }

    }*/

    /*public static void main(String[] args) {
        String issueNo = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMM"); // 时间字符串产生方式
        String time = format.format(new Date());
        String issue_pfix = "CAR" + time; // 组合流水号前一部分，NO+时间字符串，如：NO20160126
        String sn = "0001";
        String number = "201907";
        if (sn != null && number.contains(time)) {
            //String uid_end = sn.substring(10, 5); // 截取字符串最后五位，结果:00001
            int endNum = Integer.parseInt(sn); // 把String类型的00001转化为int类型的1
            int tmpNum = 10000 + endNum + 1; // 结果10002
            issueNo = issue_pfix + subStr("" + tmpNum, 1);// 把10002首位的1去掉，再拼成NO201601260002字符串
            System.out.println(issueNo);
        } else {
            issueNo = issue_pfix + "0001";
            System.out.println(issueNo);
        }

    }*/

    /*public static void main(String[] args) {
        String billNo = null;
        String sn = "01";//查询字符串最后2位
        if (sn != null) {
            int endNum = Integer.parseInt(sn); // 把String类型的00001转化为int类型的1
            int tmpNum = 10 + endNum + 1; // 结果10002
            billNo = "0" + subStr("" + tmpNum, 1);// 把10002首位的1去掉，再拼成NO201601260002字符串
        } else {
            billNo = "-01";
        }

        System.out.println(billNo);
    }*/
}
