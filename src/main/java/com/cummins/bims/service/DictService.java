package com.cummins.bims.service;

import com.cummins.bims.dto.Dict;

import java.util.List;

public interface DictService {

    List<Dict> getDictByType(Dict dict);

    Dict getDictName(Dict dict);

    /**
     * 查询供应商名称
     * @Author qx
     * @param pid
     * @param tips
     * @return
     */
    Dict getSupplierNameByTips(Integer pid, String tips);
}
