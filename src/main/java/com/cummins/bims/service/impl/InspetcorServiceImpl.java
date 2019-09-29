package com.cummins.bims.service.impl;

import com.cummins.bims.dao.InspectorMapper;
import com.cummins.bims.dto.Inspector;
import com.cummins.bims.dto.InspectorCriteria;
import com.cummins.bims.service.InspetcorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InspetcorServiceImpl implements InspetcorService {
    @Autowired
    private InspectorMapper inspectorMapper;

    @Override
    public List<Inspector> getInspectors(Inspector inspector) {
        List<Inspector> list = new ArrayList<Inspector>();
        if (inspector.getType()!=null && inspector.getSupplierNo()!=null){
            InspectorCriteria example = new InspectorCriteria();
            InspectorCriteria.Criteria query = example.createCriteria();
            query.andTypeEqualTo(inspector.getType()).andSupplierNoEqualTo(inspector.getSupplierNo());
            example.setOrderByClause("id asc");
            list = inspectorMapper.selectByExample(example);
            return list;
        }
        return list;
    }
}
