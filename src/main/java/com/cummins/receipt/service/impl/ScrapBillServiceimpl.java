package com.cummins.receipt.service.impl;

import com.cummins.receipt.dao.ScrapTicketMapper;
import com.cummins.receipt.model.ScrapTicket;
import com.cummins.receipt.service.ScrapBillService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * /**
 *
 * @program: bims
 * @description: 报废单
 * @author: wdxu
 * @create: 2019-06-19 14:11
 */
@Service
public class ScrapBillServiceimpl implements ScrapBillService {
    @Autowired
    ScrapTicketMapper scrapTicketMapper;

    /**
     * @param id
     *
     * @return 查询报废单
     */
    @Override
    public ScrapTicket queryScrap(Integer id) {
        return scrapTicketMapper.selectByPrimaryKey(id);
    }

    /**
     * @param scrapTicket
     *
     * @return 更新报废单
     */
    @Override
    public void updateScrapById(ScrapTicket scrapTicket) {
        scrapTicketMapper.updateByPrimaryKeySelective(scrapTicket);
    }

    /**
     * @param id
     *
     * @return 查询报废单（状态为2保存的）
     */
    @Override
    public ScrapTicket queryScrappedOrdersOnlyShow(Integer id) {
        return scrapTicketMapper.selectByPrimaryKeyOnlyShow(id);

    }

}
