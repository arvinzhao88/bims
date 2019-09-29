package com.cummins.bims.service;

public interface  NumberService {
    String selectMaxSn(String areaType);

    String selectMaxCarNo(String toolType);

    String selectMaxBillNo(String areaType);
}
