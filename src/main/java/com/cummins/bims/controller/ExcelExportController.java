package com.cummins.bims.controller;

import com.cummins.bims.service.IExcelExportService;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * excel导出
 * @author qx
 */
@RequestMapping("excel")
@Controller
public class ExcelExportController {
    @Autowired
    private IExcelExportService service;

    /**
     * 导出
     * @param response
     * @param param
     */
    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public void export(HttpServletResponse response, SearchParam param) {
        service.export(response, param);
    }

    @RequestMapping(value = "/exportOther", method = RequestMethod.GET)
    public void exportOther(HttpServletResponse response, HttpServletRequest request, SearchParam param) {
        String isAll = request.getParameter("isAll");
        if (isAll.equals("true")){
            service.exportOther(response, param);
        }else {
            BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
            param.setProcessPersonAccount(person.getAccount());
            service.exportOther(response, param);
        }

    }

    @RequestMapping(value = "/apuExport", method = RequestMethod.GET)
    public void apuExport(HttpServletResponse response, SearchParam param) {
        service.apuExport1(response, param);
    }

    @RequestMapping(value = "/tExport", method = RequestMethod.GET)
    public void tExport(HttpServletResponse response, SearchParam param) {
        service.tExport(response, param);
    }

    @RequestMapping(value = "/mExport", method = RequestMethod.GET)
    public void mExport(HttpServletResponse response, SearchParam param) {
        service.mExport(response, param);
    }

    @RequestMapping(value = "/jobExport", method = RequestMethod.GET)
    public void jobExport(HttpServletResponse response, SearchParam param) {
        service.jobExport(response, param);
    }

    @RequestMapping(value = "/bisExport", method = RequestMethod.GET)
    public void bisExport(HttpServletResponse response, SearchParam param) {
        service.bisExport(response, param);
    }

    @RequestMapping(value = "/eqaExport", method = RequestMethod.GET)
    public void eqaExport(HttpServletResponse response, SearchParam param) {
        service.eqaExport(response, param);
    }

    @RequestMapping(value = "/sqaExport", method = RequestMethod.GET)
    public void sqaExport(HttpServletResponse response, SearchParam param) {
        service.sqaExport(response, param);
    }

    @RequestMapping(value = "/shExport", method = RequestMethod.GET)
    public void shExport(HttpServletResponse response, SearchParam param) {
        service.shExport(response, param);
    }
}
