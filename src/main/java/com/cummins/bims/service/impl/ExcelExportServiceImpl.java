package com.cummins.bims.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cummins.bims.dto.AfterSaleIssue;
import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.IssueExtend;
import com.cummins.bims.dto.IssueParam;
import com.cummins.bims.enums.AfterSaleEnum;
import com.cummins.bims.enums.ExportEnum;
import com.cummins.bims.service.AfterSaleService;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.IExcelExportService;
import com.cummins.model.SearchParam;
import com.cummins.util.ExportimgExcel;
import com.cummins.util.JsonUtil;
import com.google.gson.JsonObject;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * excel导出
 * @author qx
 */
@Service
public class ExcelExportServiceImpl implements IExcelExportService {
    @Autowired
    private ApuCheckService apuService;

    @Autowired
    private AfterSaleService saleService;

    @Value("${imgPreUri}")
    private String imgPreUri;
    /**
     * 导出
     * @param param
     */
    @Override
    public void export(HttpServletResponse response, SearchParam param) {
        String fileName = "问题列表";
        String[] headers = {"工厂", "问题编码", "问题描述", "问题工位", "录入时间", "关闭时间", "提交人",
                "处理人", "是否EQR", "修正状态", "单据状态", "工具状态", "处理工具/责任人", "问题状态"};

        // 查询问题列表
        List<IssueParam> list = null;
        if (param == null) {
            param = new SearchParam();
        }
        param.setPageNo(1);
        param.setPageSize(65535);
        list = apuService.getList(param);

        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet();
        // 设置表头
        Row hRow = sheet.createRow(0);
        for (int i=0; i<headers.length; i++) {
            Cell hCell = hRow.createCell(i);
            hCell.setCellValue(headers[i]);
        }
        // 设置内容
        if (list != null && list.size() > 0) {
            for (int i=0; i<list.size(); i++) {
                IssueParam issue = list.get(i);
                Row tRow = sheet.createRow(i + 1);
                Cell cell0 = tRow.createCell(0); // 工厂
                cell0.setCellValue(issue.getPlantname());
                Cell cell1 = tRow.createCell(1); // 问题编码
                cell1.setCellValue(issue.getNumber());
                Cell cell2 = tRow.createCell(2); // 问题描述
                cell2.setCellValue(issue.getIssueDesc());
                Cell cell3= tRow.createCell(3); // 问题工位
                cell3.setCellValue((issue.getIssueStation()));
                Cell cell4 = tRow.createCell(4); // 录入时间
                cell4.setCellValue(getFormatDate(issue.getInputTime()));
                Cell cell5 = tRow.createCell(5); // 关闭时间
                cell5.setCellValue(getFormatDate(issue.getCloseTime()));
                Cell cell6 = tRow.createCell(6); // 提交人
                cell6.setCellValue(issue.getInputPresonName());
                Cell cell7 = tRow.createCell(7); // 处理人
                cell7.setCellValue(issue.getProcessPersonName());
                Cell cell8 = tRow.createCell(8); // 是否eqr
                if (issue.getIsEqr() != null) {
                    String eqr = "";
                    if ("1".equals(issue.getIsEqr())) {
                        eqr = "是";
                    } else {
                        if ("2".equals(issue.getIsEqr())) {
                            eqr = "否";
                        }
                    }
                    cell8.setCellValue(eqr);
                }
                Cell cell9 = tRow.createCell(9); // 修正状态
                if (issue.getSubSource() != null && "1".equals(issue.getSubSource())) {
                    String amend = "";
                    if ("1".equals(issue.getProcessStatus())) {
                        amend = "未修正";
                    } else {
                        if (Integer.valueOf(issue.getProcessStatus()) > 1) {
                            amend = "已修正";
                        }
                    }
                    cell9.setCellValue(amend);
                }
                Cell cell10 = tRow.createCell(10); // 单据状态
                if (issue.getBills() != null) {
                    String bills = issue.getBills().replaceAll("<br>", "; ");
                    cell10.setCellValue(bills);
                }
                Cell cell11 = tRow.createCell(11); // 工具状态
                cell11.setCellValue(issue.getToolStatus());
                Cell cell12 = tRow.createCell(12); // 处理工具/责任人
                if (issue.getTools() != null) {
                    String tools = issue.getTools().replaceAll("<br>", "; ");
                    cell12.setCellValue(tools);
                }
                Cell cell13 = tRow.createCell(13); // 问题状态
                if (issue.getProcessStatus() != null && "7".equals(issue.getProcessStatus())) {
                    cell13.setCellValue("关闭");
                } else {
                    cell13.setCellValue("处理中");
                }
            }
        }
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode(fileName + ".xlsx", "utf-8"));
            OutputStream out = response.getOutputStream();
            wb.write(out);
            out.flush();
            out.close();
            wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 时间格式化
     * @param date
     * @return
     */
    private String getFormatDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (date != null) {
            return format.format(date);
        }
        return "";
    }

    public void exportOther(HttpServletResponse response, SearchParam param) {
        String fileName = "问题列表";
        String[] headers = {"工厂", "问题编码", "问题描述", "问题工位", "录入时间", "关闭时间", "提交人",
                "处理人", "是否EQR", "修正状态", "单据状态", "工具状态", "处理工具/责任人", "问题状态"};

        // 查询问题列表
        List<IssueParam> list = null;
        if (param == null) {
            param = new SearchParam();
        }
        param.setPageNo(1);
        param.setPageSize(65535);
        list = apuService.getList1(param);

        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet();
        // 设置表头
        Row hRow = sheet.createRow(0);
        for (int i=0; i<headers.length; i++) {
            Cell hCell = hRow.createCell(i);
            hCell.setCellValue(headers[i]);
        }
        // 设置内容
        if (list != null && list.size() > 0) {
            for (int i=0; i<list.size(); i++) {
                IssueParam issue = list.get(i);
                Row tRow = sheet.createRow(i + 1);
                Cell cell0 = tRow.createCell(0); // 工厂
                cell0.setCellValue(issue.getPlantname());
                Cell cell1 = tRow.createCell(1); // 问题编码
                cell1.setCellValue(issue.getNumber());
                Cell cell2 = tRow.createCell(2); // 问题描述
                cell2.setCellValue(issue.getIssueDesc());
                Cell cell3= tRow.createCell(3); // 问题工位
                cell3.setCellValue((issue.getIssueStation()));
                Cell cell4 = tRow.createCell(4); // 录入时间
                cell4.setCellValue(getFormatDate(issue.getInputTime()));
                Cell cell5 = tRow.createCell(5); // 关闭时间
                cell5.setCellValue(getFormatDate(issue.getCloseTime()));
                Cell cell6 = tRow.createCell(6); // 提交人
                cell6.setCellValue(issue.getInputPresonName());
                Cell cell7 = tRow.createCell(7); // 处理人
                cell7.setCellValue(issue.getProcessPersonName());
                Cell cell8 = tRow.createCell(8); // 是否eqr
                if (issue.getIsEqr() != null) {
                    String eqr = "";
                    if ("1".equals(issue.getIsEqr())) {
                        eqr = "是";
                    } else {
                        if ("2".equals(issue.getIsEqr())) {
                            eqr = "否";
                        }
                    }
                    cell8.setCellValue(eqr);
                }
                Cell cell9 = tRow.createCell(9); // 修正状态
                if (issue.getSubSource() != null && "1".equals(issue.getSubSource())) {
                    String amend = "";
                    if ("1".equals(issue.getProcessStatus())) {
                        amend = "未修正";
                    } else {
                        if (Integer.valueOf(issue.getProcessStatus()) > 1) {
                            amend = "已修正";
                        }
                    }
                    cell9.setCellValue(amend);
                }
                Cell cell10 = tRow.createCell(10); // 单据状态
                if (issue.getBills() != null) {
                    String bills = issue.getBills().replaceAll("<br>", "; ");
                    cell10.setCellValue(bills);
                }
                Cell cell11 = tRow.createCell(11); // 工具状态
                cell11.setCellValue(issue.getToolStatus());
                Cell cell12 = tRow.createCell(12); // 处理工具/责任人
                if (issue.getTools() != null) {
                    String tools = issue.getTools().replaceAll("<br>", "; ");
                    cell12.setCellValue(tools);
                }
                Cell cell13 = tRow.createCell(13); // 问题状态
                if (issue.getProcessStatus() != null && "7".equals(issue.getProcessStatus())) {
                    cell13.setCellValue("关闭");
                } else {
                    cell13.setCellValue("处理中");
                }
            }
        }
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode(fileName + ".xlsx", "utf-8"));
            OutputStream out = response.getOutputStream();
            wb.write(out);
            out.flush();
            out.close();
            wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void apuExport(HttpServletResponse response, SearchParam param) {
        String fileName = "问题列表";
        String[] headers = {"工厂", "问题编码", "问题描述", "问题工位", "区域", "失效位置", "序列号",
                "质量问题分类Level1", "零件号", "零件名称","供应商代码", "供应商名称", "ESN", "SO","机型", "VPI项目号",
                "质量问题分类Level2", "质量问题分类Level3","数量", "RFT"};

        // 查询问题列表
        List<IssueParam> list = null;
        if (param == null) {
            param = new SearchParam();
        }
        param.setPageNo(1);
        param.setPageSize(65535);
        list = apuService.getList1(param);

        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet();
        // 设置表头
        Row hRow = sheet.createRow(0);
        for (int i=0; i<headers.length; i++) {
            Cell hCell = hRow.createCell(i);
            hCell.setCellValue(headers[i]);
        }
        // 设置内容
        if (list != null && list.size() > 0) {
            for (int i=0; i<list.size(); i++) {
                IssueParam issue = list.get(i);
                Row tRow = sheet.createRow(i + 1);
                Cell cell0 = tRow.createCell(0); // 工厂
                cell0.setCellValue(issue.getPlantname());
                Cell cell1 = tRow.createCell(1); // 问题编码
                cell1.setCellValue(issue.getNumber());
                Cell cell2 = tRow.createCell(2); // 问题描述
                cell2.setCellValue(issue.getIssueDesc());
                Cell cell3= tRow.createCell(3); // 问题工位
                cell3.setCellValue((issue.getIssueStation()));
                Cell cell4 = tRow.createCell(4); // 区域
                cell4.setCellValue(getFormatDate(issue.getInputTime()));
                Cell cell5 = tRow.createCell(5); // 失效位置
                cell5.setCellValue(getFormatDate(issue.getCloseTime()));
                Cell cell6 = tRow.createCell(6); // 序列号
                cell6.setCellValue(issue.getInputPresonName());
                Cell cell7 = tRow.createCell(7); // 质量问题分类Level1
                cell7.setCellValue(issue.getProcessPersonName());
                Cell cell8 = tRow.createCell(8); // 零件号
                if (issue.getIsEqr() != null) {
                    String eqr = "";
                    if ("1".equals(issue.getIsEqr())) {
                        eqr = "是";
                    } else {
                        if ("2".equals(issue.getIsEqr())) {
                            eqr = "否";
                        }
                    }
                    cell8.setCellValue(eqr);
                }
                Cell cell9 = tRow.createCell(9); // 零件名称
                if (issue.getSubSource() != null && "1".equals(issue.getSubSource())) {
                    String amend = "";
                    if ("1".equals(issue.getProcessStatus())) {
                        amend = "未修正";
                    } else {
                        if (Integer.valueOf(issue.getProcessStatus()) > 1) {
                            amend = "已修正";
                        }
                    }
                    cell9.setCellValue(amend);
                }
                Cell cell10 = tRow.createCell(10); // 供应商代码
                if (issue.getBills() != null) {
                    String bills = issue.getBills().replaceAll("<br>", "; ");
                    cell10.setCellValue(bills);
                }
                Cell cell11 = tRow.createCell(11); // 供应商名称
                cell11.setCellValue(issue.getToolStatus());
                Cell cell12 = tRow.createCell(12); // ESN
                if (issue.getTools() != null) {
                    String tools = issue.getTools().replaceAll("<br>", "; ");
                    cell12.setCellValue(tools);
                }
                Cell cell13 = tRow.createCell(13); // SO
                if (issue.getProcessStatus() != null && "7".equals(issue.getProcessStatus())) {
                    cell13.setCellValue("关闭");
                } else {
                    cell13.setCellValue("处理中");
                }

                Cell cell14 = tRow.createCell(14); // 质量问题分类Level1
                cell14.setCellValue(issue.getProcessPersonName());

                Cell cell15 = tRow.createCell(15); // 质量问题分类Level1
                cell15.setCellValue(issue.getProcessPersonName());

                Cell cell16 = tRow.createCell(16); // 质量问题分类Level1
                cell16.setCellValue(issue.getProcessPersonName());

                Cell cell17 = tRow.createCell(17); // 质量问题分类Level1
                cell17.setCellValue(issue.getProcessPersonName());

                Cell cell18 = tRow.createCell(18); // 质量问题分类Level1
                cell18.setCellValue(issue.getProcessPersonName());
            }
        }
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode(fileName + ".xlsx", "utf-8"));
            OutputStream out = response.getOutputStream();
            wb.write(out);
            out.flush();
            out.close();
            wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void apuExport1(HttpServletResponse response, SearchParam param) {
        String fileName = "问题列表";
        String[] headers = {"工厂", "问题编码", "录入人", "录入日期","问题描述", "问题工位", "区域", "失效位置", "序列号",
                "质量问题分类Level1", "零件号", "零件名称","供应商代码", "供应商名称", "ESN", "SO","机型", "项目号",
                "质量问题分类Level2", "质量问题分类Level3","数量","备注","RFT","关闭原因","关闭日期"};
        String[] col = {"palnt", "number","inputperson","inputdate","desc", "station", "area", "location", "seriesno", "level1", "partno", "partname",
                "vendorcode", "vendorname", "esn", "so", "enginetype","projectno", "level2", "level3", "num","comments","rft","reason","closedate"};
        // 查询问题列表
        List<IssueParam> list = null;
        if (param == null) {
            param = new SearchParam();
        }
        list = apuService.getList1(param);

        try {
            //1. 导出Excel的路径
            response.addHeader("content-disposition", "attachment; filename=" + java.net.URLEncoder.encode("/问题列表.xls", "UTF-8"));
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/x-xls");
            ServletOutputStream outputStream = response.getOutputStream();

            Collection collection = new ArrayList();
            Map<String, Object> map = new HashMap();
            for (IssueParam issueParam : list) {
                map = new HashMap();
                //String urlStr = issueParam.getAttach().replaceAll("\\\\", "/");
                //URL url = new URL(imgPreUri + urlStr);
                map.put("palnt", issueParam.getPlantname());//工厂
                map.put("number", issueParam.getNumber());//问题编码
                map.put("inputperson", issueParam.getInputPresonName());//录入人
                map.put("inputdate", issueParam.getInputTime());//录入日期
                map.put("desc", issueParam.getIssueDesc());//问题描述
                map.put("station", issueParam.getIssueStation());//问题工位
                map.put("area", issueParam.getAreaname());//区域
                map.put("location", issueParam.getLocationname());//失效位置
                map.put("seriesno", issueParam.getSeriesNo());//序列号
                map.put("level1", ExportEnum.getNameByCode(issueParam.getIssueCategoryL1()));//质量问题分类Level1
                map.put("partno", issueParam.getPartNo());//零件号
                map.put("partname", issueParam.getPartName());//零件名称
                map.put("vendorcode", issueParam.getVendorCode());//供应商代码
                map.put("vendorname", issueParam.getVendorName());//供应商名称
                map.put("esn", issueParam.getEsn());//ESN
                map.put("so", issueParam.getSo());//SO
                map.put("enginetype", issueParam.getEngineType());//机型
                map.put("projectno", issueParam.getEngineType());//项目号
                map.put("reason", issueParam.getIssueCategoryL3Name());//关闭原因
                map.put("level2", issueParam.getL2name());//质量问题分类Level2
                map.put("level3", issueParam.getL3name());//质量问题分类Level3
                map.put("num", issueParam.getQty());//数量
                map.put("comments", issueParam.getComments());//备注
                //map.put("img", url);//图片
                map.put("rft", issueParam.getIsRft()=="1"?"是":"否");//RFT
                map.put("closedate", issueParam.getCloseTime());//关闭日期

                collection.add(map);
            }
            ExportimgExcel exportExcel = new ExportimgExcel();

            exportExcel.exportXSExcelByColumn(fileName, headers, col, collection, outputStream, "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tExport(HttpServletResponse response, SearchParam param) {
        String fileName = "问题列表";
        String[] headers = {"工厂", "问题编码", "录入人", "录入日期","问题描述","ESN", "SO","机型","台架号","托盘号",
                "质量问题分类Level1", "质量问题分类Level2", "质量问题分类Level3","处理方案","备注","关闭原因","关闭日期"};
        String[] col = {"palnt", "number","inputperson","inputdate","desc", "esn", "so", "enginetype", "palno", "trayno","level1","level2", "level3","measures","comments","reason","closedate"};
        // 查询问题列表
        List<IssueParam> list = null;
        if (param == null) {
            param = new SearchParam();
        }
        list = apuService.getList1(param);

        try {
            //1. 导出Excel的路径
            response.addHeader("content-disposition", "attachment; filename=" + java.net.URLEncoder.encode("/问题列表.xls", "UTF-8"));
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/x-xls");
            ServletOutputStream outputStream = response.getOutputStream();

            Collection collection = new ArrayList();
            Map<String, Object> map = new HashMap();
            for (IssueParam issueParam : list) {

                map = new HashMap();
                //String urlStr = issueParam.getAttach().replaceAll("\\\\", "/");
                //URL url = new URL(imgPreUri + urlStr);
                map.put("palnt", issueParam.getPlantname());//工厂
                map.put("number", issueParam.getNumber());//问题编码
                map.put("inputperson", issueParam.getInputPresonName());//录入人
                map.put("inputdate", issueParam.getInputTime());//录入日期
                map.put("desc", issueParam.getIssueDesc());//问题描述
                //map.put("img", url);//图片
                map.put("level1", issueParam.getL1name());//质量问题分类Level1
                map.put("level2", issueParam.getL2name());//质量问题分类Level2
                map.put("level3", issueParam.getIssueCategoryL3());//质量问题分类Level3
                map.put("measures", issueParam.getBills());//处理方案
                map.put("esn", issueParam.getEsn());//ESN
                map.put("so", issueParam.getSo());//SO
                map.put("enginetype", issueParam.getEngineType());//机型
                map.put("palno", covert(issueParam.getId()).get("palNo"));//台架号
                map.put("trayno", covert(issueParam.getId()).get("trayNo"));//托盘号
                map.put("comments", issueParam.getComments());//备注
                map.put("reason", issueParam.getIssueCategoryL3Name());//关闭原因
                map.put("closedate", issueParam.getCloseTime());//关闭日期

                collection.add(map);
            }
            ExportimgExcel exportExcel = new ExportimgExcel();

            exportExcel.exportXSExcelByColumn(fileName, headers, col, collection, outputStream, "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mExport(HttpServletResponse response, SearchParam param) {
        String fileName = "问题列表";
        String[] headers = {"工厂", "问题编码", "录入人", "录入日期","问题描述", "问题工位", "失效位置", "序列号",
                "质量问题分类Level1", "零件号", "零件名称","供应商代码", "供应商名称", "ESN", "SO","机型", "项目号",
                "质量问题分类Level2", "质量问题分类Level3","数量","粗加工供应商代码", "粗加工供应商名称","毛坯供应商名称", "毛坯号","备注","关闭原因","关闭日期"};
        String[] col = {"palnt", "number","inputperson","inputdate","desc", "station", "location", "seriesno", "level1", "partno", "partname",
                "vendorcode", "vendorname", "esn", "so", "enginetype","projectno", "level2", "level3", "num","semiSupplierCode", "semiSupplierName", "castSupplierName", "castNo",
                "comments","reason","closedate"};
        // 查询问题列表
        List<IssueParam> list = null;
        if (param == null) {
            param = new SearchParam();
        }
        list = apuService.getList1(param);

        try {
            //1. 导出Excel的路径
            response.addHeader("content-disposition", "attachment; filename=" + java.net.URLEncoder.encode("/问题列表.xls", "UTF-8"));
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/x-xls");
            ServletOutputStream outputStream = response.getOutputStream();

            Collection collection = new ArrayList();
            Map<String, Object> map = new HashMap();
            for (IssueParam issueParam : list) {
                Map map1 = covert(issueParam.getId());
                map = new HashMap();
                //String urlStr = issueParam.getAttach().replaceAll("\\\\", "/");
                //URL url = new URL(imgPreUri + urlStr);
                map.put("palnt", issueParam.getPlantname());//工厂
                map.put("number", issueParam.getNumber());//问题编码
                map.put("inputperson", issueParam.getInputPresonName());//录入人
                map.put("inputdate", issueParam.getInputTime());//录入日期
                map.put("desc", issueParam.getIssueDesc());//问题描述

                map.put("station", issueParam.getIssueStation());//问题工位
                map.put("location", issueParam.getLocationname());//失效位置
                map.put("seriesno", issueParam.getSeriesNo());//序列号
                map.put("level1", ExportEnum.getNameByCode(issueParam.getIssueCategoryL1()));//质量问题分类Level1
                map.put("partno", issueParam.getPartNo());//零件号
                map.put("partname", issueParam.getPartName());//零件名称
                map.put("vendorcode", issueParam.getVendorCode());//供应商代码
                map.put("vendorname", issueParam.getVendorName());//供应商名称
                map.put("esn", issueParam.getEsn());//ESN
                map.put("so", issueParam.getSo());//SO
                map.put("enginetype", issueParam.getEngineType());//机型
                map.put("projectno", issueParam.getEngineType());//项目号

                map.put("level2", issueParam.getL2name());//质量问题分类Level2
                map.put("level3", issueParam.getL3name());//质量问题分类Level3
                map.put("num", issueParam.getQty());//数量
                map.put("semiSupplierCode", map1==null?"":map1.get("semiSupplierCode"));//粗加工供应商代码
                map.put("semiSupplierName", map1==null?"":map1.get("semiSupplierName"));//粗加工供应商名称
                map.put("castSupplierName", map1==null?"":map1.get("castSupplierName"));//毛坯供应商名称
                map.put("castNo", map1==null?"":map1.get("castNo"));//毛坯号
                map.put("comments", issueParam.getComments());//备注
                //map.put("img", url);//图片
                map.put("reason", issueParam.getIssueCategoryL3Name());//关闭原因
                map.put("closedate", issueParam.getCloseTime());//关闭日期

                collection.add(map);
            }
            ExportimgExcel exportExcel = new ExportimgExcel();

            exportExcel.exportXSExcelByColumn(fileName, headers, col, collection, outputStream, "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void jobExport(HttpServletResponse response, SearchParam param) {
        String fileName = "问题列表";
        String[] headers = {"工厂", "问题编码", "录入人", "录入日期","问题描述","ESN", "SO","评审日期","Job1评审结论","评审人员","备注","关闭原因","关闭日期"};
        String[] col = {"palnt", "number","inputperson","inputdate","desc", "esn", "so", "reviewDate", "reviewers", "reviewersAccount","comments","reason","closedate"};
        // 查询问题列表
        List<IssueParam> list = null;
        if (param == null) {
            param = new SearchParam();
        }
        list = apuService.getList1(param);

        try {
            //1. 导出Excel的路径
            response.addHeader("content-disposition", "attachment; filename=" + java.net.URLEncoder.encode("/问题列表.xls", "UTF-8"));
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/x-xls");
            ServletOutputStream outputStream = response.getOutputStream();

            Collection collection = new ArrayList();
            Map<String, Object> map = new HashMap();
            for (IssueParam issueParam : list) {
                map = new HashMap();
                //String urlStr = issueParam.getAttach().replaceAll("\\\\", "/");
                //URL url = new URL(imgPreUri + urlStr);
                map.put("palnt", issueParam.getPlantname());//工厂
                map.put("number", issueParam.getNumber());//问题编码
                map.put("inputperson", issueParam.getInputPresonName());//录入人
                map.put("inputdate", issueParam.getInputTime());//录入日期
                map.put("desc", issueParam.getIssueDesc());//问题描述
                //map.put("img", url);//图片
                map.put("esn", issueParam.getEsn());//ESN
                map.put("so", issueParam.getSo());//SO
                map.put("reviewDate", covert(issueParam.getId()).get("reviewDate"));//评审日期
                map.put("reviewers", issueParam.getIsClaim()=="1"?"是":"否");//Job1评审结论
                map.put("reviewersAccount", covert(issueParam.getId()).get("reviewersAccount"));//评审人员
                map.put("comments", issueParam.getComments());//备注
                map.put("reason", issueParam.getIssueCategoryL3Name());//关闭原因
                map.put("closedate", issueParam.getCloseTime());//关闭日期

                collection.add(map);
            }
            ExportimgExcel exportExcel = new ExportimgExcel();

            exportExcel.exportXSExcelByColumn(fileName, headers, col, collection, outputStream, "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bisExport(HttpServletResponse response, SearchParam param) {
        String fileName = "问题列表";
        String[] headers = {"工厂", "问题编码", "录入人", "录入日期","问题描述", "问题类型", "失效日期", "客户名称", "主机厂名称",
                "ESN", "SO","机型", "生产日期","零件号", "零件名称","供应商代码", "供应商名称",
                "序列号","数量","是否索赔", "索赔单号","开放天数", "计入指标","备注","关闭原因","关闭日期"};
        String[] col = {"palnt", "number","inputperson","inputdate","desc", "type", "failureDate", "customer", "oem", "esn", "so","enginetype", "productionDate",
                "partno", "partname","vendorcode", "vendorname",
                "seriesno","num", "isclaim", "claimNumber","openDays", "PPM", "comments","reason","closedate"};
        // 查询问题列表
        List<IssueParam> list = null;
        if (param == null) {
            param = new SearchParam();
        }
        list = apuService.getList1(param);

        try {
            //1. 导出Excel的路径
            response.addHeader("content-disposition", "attachment; filename=" + java.net.URLEncoder.encode("/问题列表.xls", "UTF-8"));
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/x-xls");
            ServletOutputStream outputStream = response.getOutputStream();

            Collection collection = new ArrayList();
            Map<String, Object> map = new HashMap();
            for (IssueParam issueParam : list) {
                map = new HashMap();
                //String urlStr = issueParam.getAttach().replaceAll("\\\\", "/");
                //URL url = new URL(imgPreUri + urlStr);
                map.put("palnt", issueParam.getPlantname());//工厂
                map.put("number", issueParam.getNumber());//问题编码
                map.put("inputperson", issueParam.getInputPresonName());//录入人
                map.put("inputdate", issueParam.getInputTime());//录入日期
                //map.put("img", url);//图片
                map.put("desc", issueParam.getIssueDesc());//问题描述

                map.put("type", issueParam.getIssueType());//问题类型
                map.put("failureDate", covert(issueParam.getId()).get("failureDate"));//失效日期
                map.put("customer", covert(issueParam.getId()).get("customer"));//客户名称
                map.put("oem", covert(issueParam.getId()).get("oem"));//主机厂名称
                map.put("esn", issueParam.getEsn());//ESN
                map.put("so", issueParam.getSo());//SO
                map.put("enginetype", issueParam.getEngineType());//机型
                map.put("productionDate", covert(issueParam.getId()).get("productionDate"));//生产日期
                map.put("partno", issueParam.getPartNo());//零件号
                map.put("partname", issueParam.getPartName());//零件名称
                map.put("vendorcode", issueParam.getVendorCode());//供应商代码
                map.put("vendorname", issueParam.getVendorName());//供应商名称
                map.put("seriesno", issueParam.getSeriesNo());//序列号
                //map.put("statusColor", covert(issueParam.getId()).get("statusColor"));//问题状态
                map.put("num", issueParam.getQty());//数量
                map.put("isclaim", issueParam.getIsClaim()=="1"?"是":"否");//是否索赔
                map.put("claimNumber", covert(issueParam.getId()).get("claimNumber"));//索赔单号
                map.put("openDays", covert(issueParam.getId()).get("openDays"));//开放天数
                map.put("PPM", issueParam.getIsCountindex()=="1"?"是":"否");//是否计入指标

                map.put("comments", issueParam.getComments());//备注
                map.put("reason", issueParam.getIssueCategoryL3Name());//关闭原因
                map.put("closedate", issueParam.getCloseTime());//关闭日期

                collection.add(map);
            }
            ExportimgExcel exportExcel = new ExportimgExcel();

            exportExcel.exportXSExcelByColumn(fileName, headers, col, collection, outputStream, "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eqaExport(HttpServletResponse response, SearchParam param) {
        String fileName = "问题列表";
        String[] headers = {"工厂", "问题编码", "录入人", "录入日期","问题描述", "ESN", "SO","机型", "是否搭载","零件号", "零件名称","供应商代码", "供应商名称",
                "缺陷级别", "扣分", "备注","关闭原因","关闭日期"};
        String[] col = {"palnt", "number","inputperson","inputdate","desc",  "esn", "so", "enginetype","isCarry", "partno", "partname",
                "vendorcode", "vendorname", "level", "deduct","comments","reason","closedate"};
        // 查询问题列表
        List<IssueParam> list = null;
        if (param == null) {
            param = new SearchParam();
        }
        list = apuService.getList1(param);

        try {
            //1. 导出Excel的路径
            response.addHeader("content-disposition", "attachment; filename=" + java.net.URLEncoder.encode("/问题列表.xls", "UTF-8"));
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/x-xls");
            ServletOutputStream outputStream = response.getOutputStream();

            Collection collection = new ArrayList();
            Map<String, Object> map = new HashMap();
            for (IssueParam issueParam : list) {
                map = new HashMap();
                //String urlStr = issueParam.getAttach().replaceAll("\\\\", "/");
                //URL url = new URL(imgPreUri + urlStr);
                map.put("palnt", issueParam.getPlantname());//工厂
                map.put("number", issueParam.getNumber());//问题编码
                map.put("inputperson", issueParam.getInputPresonName());//录入人
                map.put("inputdate", issueParam.getInputTime());//录入日期
                //map.put("img", url);//图片
                map.put("desc", issueParam.getIssueDesc());//问题描述

                map.put("esn", issueParam.getEsn());//ESN
                map.put("so", issueParam.getSo());//SO
                map.put("enginetype", issueParam.getEngineType());//机型
                map.put("isCarry", issueParam.getIsCarry()=="1"?"是":"否");//是否搭载
                map.put("partno", issueParam.getPartNo());//零件号
                map.put("partname", issueParam.getPartName());//零件名称
                map.put("vendorcode", issueParam.getVendorCode());//供应商代码
                map.put("vendorname", issueParam.getVendorName());//供应商名称

                map.put("level", covert(issueParam.getId()).get("level"));//缺陷级别
                map.put("deduct", covert(issueParam.getId()).get("deduct"));//扣分

                map.put("comments", issueParam.getComments());//备注
                map.put("reason", issueParam.getIssueCategoryL3Name());//关闭原因
                map.put("closedate", issueParam.getCloseTime());//关闭日期

                collection.add(map);
            }
            ExportimgExcel exportExcel = new ExportimgExcel();

            exportExcel.exportXSExcelByColumn(fileName, headers, col, collection, outputStream, "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void sqaExport(HttpServletResponse response, SearchParam param) {
        String fileName = "问题列表";
        String[] headers = {"工厂", "问题编码", "录入人", "录入日期","问题描述", "产线", "项目号", "零件号", "零件名称","供应商代码", "供应商名称",
                "PPAP", "SQI","失效数量", "失效比例","批次号", "来源","检验员","严重程度", "发生频次","探测度","RPN",
                "质量问题分类Level1","质量问题分类Level2","质量问题分类Level3","备注","关闭原因","关闭日期"};
        String[] col = {"palnt", "number","inputperson","inputdate","desc", "line", "projectno", "partno", "partname","vendorcode", "vendorname",
                "ppap","sqi","num", "failureRatio", "batchInfo","foundSite","inspector","severity","occurRate","detection", "rpn",
                "level1","level2", "level3", "comments","reason","closedate"};
        // 查询问题列表
        List<IssueParam> list = null;
        if (param == null) {
            param = new SearchParam();
        }
        list = apuService.getList1(param);

        try {
            //1. 导出Excel的路径
            response.addHeader("content-disposition", "attachment; filename=" + java.net.URLEncoder.encode("/问题列表.xls", "UTF-8"));
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/x-xls");
            ServletOutputStream outputStream = response.getOutputStream();

            Collection collection = new ArrayList();
            Map<String, Object> map = new HashMap();
            for (IssueParam issueParam : list) {
                map = new HashMap();
                //String urlStr = issueParam.getAttach().replaceAll("\\\\", "/");
                //URL url = new URL(imgPreUri + urlStr);
                map.put("palnt", issueParam.getPlantname());//工厂
                map.put("number", issueParam.getNumber());//问题编码
                map.put("inputperson", issueParam.getInputPresonName());//录入人
                map.put("inputdate", issueParam.getInputTime());//录入日期
                //map.put("img", url);//图片
                map.put("desc", issueParam.getIssueDesc());//问题描述

                map.put("line", covert(issueParam.getId()).get("line"));//产线
                map.put("projectno", issueParam.getProjectNo());//项目号
                map.put("partno", issueParam.getPartNo());//零件号
                map.put("partname", issueParam.getPartName());//零件名称
                map.put("vendorcode", issueParam.getVendorCode());//供应商代码
                map.put("vendorname", issueParam.getVendorName());//供应商名称
                map.put("ppap", covert(issueParam.getId()).get("ppap"));//PPAP
                map.put("sqi", covert(issueParam.getId()).get("sqi"));//SQI
                map.put("num", issueParam.getQty());//失效数量
                map.put("failureRatio", covert(issueParam.getId()).get("failureRatio"));//失效比例
                map.put("batchInfo", covert(issueParam.getId()).get("batchInfo"));//批次号
                map.put("foundSite", covert(issueParam.getId()).get("foundSite")=="1"?"IQC":"ONline");//来源
                map.put("inspector", covert(issueParam.getId()).get("inspector"));//检验员
                map.put("severity", covert(issueParam.getId()).get("severity"));//严重程度
                map.put("occurRate", covert(issueParam.getId()).get("occurRate"));//发生频次
                map.put("detection", covert(issueParam.getId()).get("detection"));//探测度
                map.put("rpn", covert(issueParam.getId()).get("rpn"));//RPN
                map.put("level1", issueParam.getL1name());//质量问题分类Level1
                map.put("level2", issueParam.getL2name());//质量问题分类Level2
                map.put("level3", issueParam.getL3name());//质量问题分类Level3

                map.put("comments", issueParam.getComments());//备注
                map.put("reason", issueParam.getIssueCategoryL3Name());//关闭原因
                map.put("closedate", issueParam.getCloseTime());//关闭日期

                collection.add(map);
            }
            ExportimgExcel exportExcel = new ExportimgExcel();

            exportExcel.exportXSExcelByColumn(fileName, headers, col, collection, outputStream, "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void shExport(HttpServletResponse response, SearchParam param) {
        String fileName = "问题列表";
        String[] headers = {"问题编码", "录入人", "录入日期","信息来源","整车/设备制造商&客户名称","出厂编号","发动机系列","发动机型号",
                "ESN","SO","发动机生产日期","服务站名称","服务站联系人及方式",
                "出厂日期","购车日期","故障日期","故障里程","失效数量",
                "失效区域","使用工况及环境","用户姓名","用户电话","用户类型",
                "故障现象","祸首件名称","故障模式","祸首件图号","现场检查",
                "故障分析及结论","客户需求及短期修理措施","备注","关闭原因","关闭日期"};
        String[] col = {"number","inputperson","inputdate","infoSource","vehicleEquipment","vehicleVin","engineSeries","engineType",
                "esn","so","engineBuildDate","dealerName","dealerContact",
                "vehicleBuildDate","vehicleSaleDate","failureDate","failureMileage","failureNum",
                "repairLocation","usingCondition","customerName","customerPhone","customerType",
                "faultDesc","faultPart","failureMode","faultPartNo","fieldInspect",
                "failureAnalysisConclusion","requireFix","comments","reason","closedate"};
        // 查询问题列表
        List<AfterSaleIssue> list = null;
        if (param == null) {
            param = new SearchParam();
        }
        //list = apuService.getList1(param);
        list = saleService.getList(param);

        try {
            //1. 导出Excel的路径
            response.addHeader("content-disposition", "attachment; filename=" + java.net.URLEncoder.encode("/问题列表.xls", "UTF-8"));
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/x-xls");
            ServletOutputStream outputStream = response.getOutputStream();

            Collection collection = new ArrayList();
            Map<String, Object> map = new HashMap();
            for (AfterSaleIssue saleIssue : list) {
                map = new HashMap();
                map.put("number", saleIssue.getNumber());//问题编码
                map.put("inputperson", saleIssue.getInputPersonName());//录入人
                map.put("inputdate", saleIssue.getInputTime());//录入日期

                map.put("infoSource", AfterSaleEnum.getNameByCode(saleIssue.getInformationSource()));//信息来源
                map.put("vehicleEquipment", saleIssue.getVehicleEquipment());//整车/设备制造商&客户名称
                map.put("vehicleVin", saleIssue.getVehicleVin());//出厂编号
                map.put("engineSeries", saleIssue.getEngineSeries());//发动机系列
                map.put("engineType", saleIssue.getEngineType());//发动机型号
                map.put("esn", saleIssue.getEngineSeriesNo());//ESN
                map.put("so", saleIssue.getShopOrder());//SO
                map.put("engineBuildDate", saleIssue.getEngineBuildDate());//发动机生产日期
                map.put("dealerName", saleIssue.getDealerName());//服务站名称
                map.put("dealerContact", saleIssue.getDealerContact());//服务站联系人及方式
                map.put("vehicleBuildDate", saleIssue.getVehicleBuildDate());//出厂日期
                map.put("vehicleSaleDate", saleIssue.getVehicleSaleDate());//购车日期
                map.put("failureDate", saleIssue.getFailureDate());//故障日期
                map.put("failureMileage", saleIssue.getFailureMileage());//故障里程
                map.put("failureNum", saleIssue.getFailureNum());//失效数量
                map.put("repairLocation", saleIssue.getRepairLocation());//失效区域
                map.put("usingCondition", saleIssue.getUsingCondition());//使用工况及环境
                map.put("customerName", saleIssue.getCustomerName());//用户姓名
                map.put("customerPhone", saleIssue.getCustomerPhone());//用户电话
                map.put("customerType", saleIssue.getCustomerType());//用户类型
                map.put("faultDesc", saleIssue.getFaultDesc());//故障现象
                map.put("faultPart", saleIssue.getFaultPart());//祸首件名称
                map.put("failureMode", saleIssue.getFailureMode());//故障模式
                map.put("faultPartNo", saleIssue.getFaultPartNo());//祸首件图号
                map.put("fieldInspect", saleIssue.getFieldInspect());//现场检查
                map.put("failureAnalysisConclusion", saleIssue.getFailureAnalysisConclusion());//故障分析及结论
                map.put("requireFix", saleIssue.getRequireFix());//客户需求及短期修理措施

                map.put("comments", saleIssue.getComments());//备注
                map.put("closedate", saleIssue.getCloseDate());//关闭日期

                collection.add(map);
            }
            ExportimgExcel exportExcel = new ExportimgExcel();

            exportExcel.exportXSExcelByColumn(fileName, headers, col, collection, outputStream, "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, Object> covert(Integer issueId){
        String str = "{\"0\":\"zhangsan\",\"1\":\"lisi\",\"2\":\"wangwu\",\"3\":\"maliu\"}";
        Issue issue = new Issue();
        issue.setId(issueId);
        IssueExtend issueExtend = apuService.getIssueExtend(issue);
        if (issueExtend!=null){
            Map object = JSONObject.parseObject(issueExtend.getAttribute(),Map.class);
            return object;
        }else {
            return null;
        }

    }

}
