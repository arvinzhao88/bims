package com.cummins.receipt.service;

import com.cummins.receipt.model.ScrapTicket;

/** @创建人 wdxu @创建时间 20190619 @描述 报废单 */
public interface ScrapBillService {
    /**
     * 查询报废单
     *
     * @param tagId
     *
     * @return
     */
    ScrapTicket queryScrap(Integer tagId);

    /**
     * 更新报废单
     *
     * @param scrapTicket
     *
     * @return
     */
    void updateScrapById(ScrapTicket scrapTicket);

    /**
     * 查询报废单（状态为2 保存的）
     *
     * @param id
     *
     * @return
     */

    ScrapTicket queryScrappedOrdersOnlyShow(Integer id);
}
