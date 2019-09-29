package com.cummins.bims.service.impl;

import com.cummins.bims.dao.DictMapper;
import com.cummins.bims.dto.Dict;
import com.cummins.bims.dto.DictCriteria;
import com.cummins.bims.service.DictService;
import org.omg.CosNaming.NamingContextPackage.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DictServiceImpl implements DictService {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public List<Dict> getDictByType(Dict dict) {
        List<Dict> list = new ArrayList<Dict>();
        if (dict.getType()!=null && dict.getPid()!=null){
            DictCriteria example = new DictCriteria();
            DictCriteria.Criteria query = example.createCriteria();
            query.andTypeEqualTo(dict.getType()).andPidEqualTo(dict.getPid());
            example.setOrderByClause("id asc");
            list = dictMapper.selectByExample(example);
            return list;
        }
        return list;
    }

    @Override
    public Dict getDictName(Dict dict) {
        return dictMapper.selectByPrimaryKey(dict.getId());
    }

    /**
     * 查询供应商名称
     * @Author qx
     * @param pid
     * @param tips
     * @return
     */
    @Override
    public Dict getSupplierNameByTips(Integer pid, String tips) {
        if (pid != null && !"".equals(pid) && tips != null && !"".equals(tips)) {
            DictCriteria dictCriteria = new DictCriteria();
            DictCriteria.Criteria criteria = dictCriteria.createCriteria();
            criteria.andTypeEqualTo("supplier");
            criteria.andPidEqualTo(pid);
            // 毛坯供应商
            if (pid.equals(126)) {
                criteria.andTipsEqualTo(tips.substring(tips.length() - 1));
            }
            // 粗加工供应商
            if (pid.equals(127)) {
                criteria.andTipsEqualTo(tips);
            }
            List<Dict> dictList = dictMapper.selectByExample(dictCriteria);
            if (dictList != null && dictList.size() > 0) {
                return dictList.get(0);
            }
        }
        return null;
    }
}
