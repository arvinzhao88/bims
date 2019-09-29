package com.cummins.bims.service;

import com.cummins.model.SearchParam;

import javax.servlet.http.HttpServletResponse;

/**
 * excel导出
 * @author qx
 */
public interface IExcelExportService {
    /**
     * 导出
     * @param param
     */
    void export(HttpServletResponse response, SearchParam param);

    void exportOther(HttpServletResponse response, SearchParam param);

    void apuExport(HttpServletResponse response, SearchParam param);

    void apuExport1(HttpServletResponse response, SearchParam param);

    void tExport(HttpServletResponse response, SearchParam param);

    void mExport(HttpServletResponse response, SearchParam param);

    void jobExport(HttpServletResponse response, SearchParam param);

    void bisExport(HttpServletResponse response, SearchParam param);

    void eqaExport(HttpServletResponse response, SearchParam param);

    void sqaExport(HttpServletResponse response, SearchParam param);

    void shExport(HttpServletResponse response, SearchParam param);
}
