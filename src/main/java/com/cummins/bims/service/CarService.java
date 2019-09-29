package com.cummins.bims.service;

import com.cummins.bims.dto.*;
import com.cummins.permission.model.BimsPerson;

import java.util.List;

public interface CarService {
    Integer updStep1(Car car);

    Integer updStep17(Car car);

    Car getInfo(Integer id);

    List<CarExtend> getExtCar(Car car);

    Integer reject(DealLog dealLog,BimsPerson person);

    Integer agree(DealLog dealLog,BimsPerson person);

    Integer addCarSteplast(CarParam car, BimsPerson person);
}
