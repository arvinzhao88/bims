package com.cummins.receipt.service;

import com.cummins.receipt.model.NonconfigContainment;
import com.cummins.receipt.model.NonconfigContainmentSon;

import java.util.List;

/**
 * @创建人 wdxu
 * @创建时间 20190620
 * @描述 不合格品遏制单
 */

public interface NonProductContainmentService {
    /**
     * @param id
     *
     * @return 查询不合格遏制单
     */
    NonconfigContainment unqualifiedInquiry(Integer id);

    /**
     * @param
     *
     * @return 更新不合格遏制单
     */
    void updateProductContainmentOrde(NonconfigContainment nonconfigContainment, String[] location, String[] qtty, String[] screendQtty, String[] nokQtty, String[] response, String[] verifier, String[] completionDate);

    /**
     * @param
     *
     * @return 查询不合格遏制单 子表 -客户区域
     */
    List<NonconfigContainmentSon> queryUnqualifiedCurbList(Integer id);

    /**
     * @param
     *
     * @return 查询不合格遏制单 子表 -bfcec区域
     */
    List<NonconfigContainmentSon> queryTheBfcecArea(Integer id);

    /**
     * @param
     *
     * @return 查询不合格遏制单 子表 -bfcec区域
     */
    List<NonconfigContainmentSon> querySupplierArea(Integer id);


    /**
     * @param
     *
     * @return 保存不合格遏制单 --保存之后不允许修改
     */
    void saveTheNonconformingProductContainmentOrder(NonconfigContainment nonconfigContainment, String[] location, String[] qtty, String[] screendQtty, String[] nokQtty, String[] response, String[] verifier, String[] completionDate);


    /**
     * @param
     *
     * @return 删除不合格品遏制单主表和子表数据
     */
    void deletePrimarySubtableData(Integer id);

}
