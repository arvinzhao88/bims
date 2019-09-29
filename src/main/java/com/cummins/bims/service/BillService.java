package com.cummins.bims.service;

import com.cummins.bims.dto.Bill;
import com.cummins.receipt.model.TagstobeProcessed;

import java.util.List;

public interface BillService {
    List<Bill> getBills(Bill bill);

    Bill save(Bill bill);

    List<Bill> saveBatch(Bill bill,String qDocs);

    Integer del(Bill bill);

    //List<TagstobeProcessed> getListByBillType(Bill bill);

    List<Bill> getListByBillType(Bill bill);

    List<Bill> getBillTabs(Bill bill);
}
