package com.cummins.receipt.service.impl;

import com.cummins.receipt.dao.NonconfigContainmentMapper;
import com.cummins.receipt.dao.NonconfigContainmentSonMapper;
import com.cummins.receipt.model.NonconfigContainment;
import com.cummins.receipt.model.NonconfigContainmentSon;
import com.cummins.receipt.model.NonconfigContainmentSonCriteria;
import com.cummins.receipt.service.NonProductContainmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * /**
 *
 * @program: bims
 * @description: 不合格品遏制单
 * @author: wdxu
 * @create: 2019-06-20 09:37
 */
@Service
public class NonProductContainmentServiceimpl implements NonProductContainmentService {
    @Autowired
    NonconfigContainmentMapper nonconfigContainmentMapper;
    @Autowired
    NonconfigContainmentSonMapper nonconfigContainmentSonMapper;

    /**
     * @param id
     *
     * @return 查询不合格品遏制单
     */
    @Override
    public NonconfigContainment unqualifiedInquiry(Integer id) {
        return nonconfigContainmentMapper.selectByPrimaryKey(id);
    }

    /**
     * @param
     *
     * @return 更新不合格品遏制单
     */
    @Override
    @Transactional
    public void updateProductContainmentOrde(NonconfigContainment nonconfigContainment, String[] location, String[] qtty, String[] screendQtty, String[] nokQtty, String[] response, String[] verifier, String[] completionDate) {
        /**
         * 更新状态为“1”:更新
         */
        nonconfigContainment.setStatue(1);
        nonconfigContainmentMapper.updateByPrimaryKeySelective(nonconfigContainment);
        /**
         * 更新之前删除以前提交的数据
         */
        nonconfigContainmentSonMapper.deleteByQuestionId(nonconfigContainment.getId());
        /**
         * 更新子表数据
         */
        for (int i = 0; i < qtty.length; i++) {
            NonconfigContainmentSon nonconfigContainmentSon = new NonconfigContainmentSon();
            nonconfigContainmentSon.setNcfId(nonconfigContainment.getId());//遏制表Id
            nonconfigContainmentSon.setLocation(location[i]);//区域
            nonconfigContainmentSon.setQtty(qtty[i]);//总数量
            nonconfigContainmentSon.setScreendQtty(screendQtty[i]);//挑选数量
            nonconfigContainmentSon.setNokQtty(nokQtty[i]);//不合格数
            nonconfigContainmentSon.setResponse(response[i]);//负责人
            nonconfigContainmentSon.setVerifier(verifier[i]);//确认人
            nonconfigContainmentSon.setCompletionDate(completionDate[i]);//完成日期
            /**
             * 更新数据
             */
            nonconfigContainmentSonMapper.insert(nonconfigContainmentSon);
        }


    }

    /**
     * @param id
     *
     * @return 查询不合格品遏制单子表 -客户区域(1,2,3,4,5)
     */
    @Override
    public List<NonconfigContainmentSon> queryUnqualifiedCurbList(Integer id) {
        NonconfigContainmentSonCriteria example = new NonconfigContainmentSonCriteria();
        NonconfigContainmentSonCriteria.Criteria query = example.createCriteria();
        query.andNcfIdEqualTo(id);
        List<String> list = new ArrayList<String>();
        for (int i = 1; i < 6; i++) {
            list.add(String.valueOf(i));
        }

        query.andLocationIn(list);
        return nonconfigContainmentSonMapper.selectByExample(example);
    }


    /**
     * @param id
     *
     * @return 查询不合格品遏制单子表 -bfcec( 6→21 )
     */
    @Override
    public List<NonconfigContainmentSon> queryTheBfcecArea(Integer id) {
        NonconfigContainmentSonCriteria example = new NonconfigContainmentSonCriteria();
        NonconfigContainmentSonCriteria.Criteria query = example.createCriteria();
        query.andNcfIdEqualTo(id);
        List<String> list = new ArrayList<>();
        for (int i = 6; i < 22; i++) {
            list.add(String.valueOf(i));
        }

        query.andLocationIn(list);
        return nonconfigContainmentSonMapper.selectByExample(example);
    }

    /**
     * @param id
     *
     * @return 查询不合格品遏制单子表 -bfcec( 22→26 )
     */
    @Override
    public List<NonconfigContainmentSon> querySupplierArea(Integer id) {
        NonconfigContainmentSonCriteria example = new NonconfigContainmentSonCriteria();
        NonconfigContainmentSonCriteria.Criteria query = example.createCriteria();
        query.andNcfIdEqualTo(id);
        List<String> list = new ArrayList<>();
        for (int i = 22; i < 27; i++) {
            list.add(String.valueOf(i));
        }

        query.andLocationIn(list);
        return nonconfigContainmentSonMapper.selectByExample(example);
    }


    /**
     * @param
     *
     * @return 保存不合格品遏制单 --保存之后不允许编辑
     */
    @Override
    @Transactional
    public void saveTheNonconformingProductContainmentOrder(NonconfigContainment nonconfigContainment, String[] location, String[] qtty, String[] screendQtty, String[] nokQtty, String[] response, String[] verifier, String[] completionDate) {
        /**
         * 更新状态为“2”:提交
         */
        nonconfigContainment.setStatue(2);
        nonconfigContainmentMapper.updateByPrimaryKeySelective(nonconfigContainment);
        /**
         * 更新之前删除以前提交的数据
         */
        nonconfigContainmentSonMapper.deleteByQuestionId(nonconfigContainment.getId());
        /**
         * 更新子表数据
         */
        for (int i = 0; i < qtty.length; i++) {
            NonconfigContainmentSon nonconfigContainmentSon = new NonconfigContainmentSon();
            nonconfigContainmentSon.setNcfId(nonconfigContainment.getId());//遏制表Id
            nonconfigContainmentSon.setLocation(location[i]);//区域
            nonconfigContainmentSon.setQtty(qtty[i]);//总数量
            nonconfigContainmentSon.setScreendQtty(screendQtty[i]);//挑选数量
            nonconfigContainmentSon.setNokQtty(nokQtty[i]);//不合格数
            nonconfigContainmentSon.setResponse(response[i]);//负责人
            nonconfigContainmentSon.setVerifier(verifier[i]);//确认人
            nonconfigContainmentSon.setCompletionDate(completionDate[i]);//完成日期
            /**
             * 更新数据
             */
            nonconfigContainmentSonMapper.insert(nonconfigContainmentSon);
        }
    }

    /**
     * @param
     *
     * @return  删除不合格品遏制单主表和子表的数据
     */
    @Override
    @Transactional
    public void deletePrimarySubtableData(Integer id){
        nonconfigContainmentMapper.deleteByPrimaryKey(id);
        nonconfigContainmentSonMapper.deleteByQuestionId(id);
    }


}