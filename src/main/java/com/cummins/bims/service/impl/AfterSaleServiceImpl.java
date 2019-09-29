package com.cummins.bims.service.impl;

import com.cummins.bims.dao.AfterSaleIssueMapper;
import com.cummins.bims.dao.DealLogMapper;
import com.cummins.bims.dao.IssueMapper;
import com.cummins.bims.dao.IssueShExtMapper;
import com.cummins.bims.dto.*;
import com.cummins.bims.enums.RecordStatusEnum;
import com.cummins.bims.service.AfterSaleService;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.DealLogUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * /**
 *
 * @program: bims
 * @description: 售后问题业务实现
 * @author: wdxu
 * @create: 2019-06-28 09:29
 */
@Service
public class AfterSaleServiceImpl implements AfterSaleService {
    @Autowired
    AfterSaleIssueMapper afterSaleIssueMapper;
    @Autowired
    IssueShExtMapper issueShExtMapper;

    @Autowired
    IssueMapper issueMapper;


    @Autowired
    private DealLogMapper dealLogMapper;


    /**
     * @Author : wdxu
     * @Date :11:20 2019/6/28
     * @Description: 售后问题 新增
     */
    @Override
    @Transactional
    public void addAfterSaleIssue(AfterSaleIssue afterSaleIssue, Issue issue, BimsPerson person) {

        issue.setPartName(afterSaleIssue.getFaultPart());//故障件名称
        issue.setIssueDesc(afterSaleIssue.getFaultDesc());
        issue.setQualityType("H");
        issue.setInputTime(new Date());
        issue.setDelflag("1");//1 未删除
        issue.setSubSource("2");//1 pad提交 2 web提交
        issue.setProcessStatus("1");//已接收待处理
        issue.setIsEqr("0");    //初始化状态
        issue.setProcessTime(new Date());
        Integer count = issueMapper.insertSelective(issue);
        Integer id = null;// i == null
        if(count > 0){//如果插入成功
            id = issue.getId();//i为主键自增id
            afterSaleIssue.setBack1(String.valueOf(id));
            afterSaleIssueMapper.insert(afterSaleIssue);//插入售后表
            List<String> attach = afterSaleIssue.getAttach();
            List<String> desc = afterSaleIssue.getDesc();
            IssueShExt issueShExt = new IssueShExt();
            if (attach.size()>0)
            for (int i = 0; i < desc.size(); i++) {
                if (!"".equals(attach.get(i))){
                    issueShExt.setIssueShId(String.valueOf(afterSaleIssue.getId()));
                    issueShExt.setImgPath(attach.get(i));
                    issueShExt.setImgDesc(desc.get(i));
                    issueShExtMapper.insertSelective(issueShExt);
                }

            }
            //插入处理记录
            DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.SUMITISSUE.getCode()),person);
            dealLog.setIssueId(id);
            dealLogMapper.insert(dealLog);
        }
        return;
    }

    /**
     * @Author : wdxu
     * @Date :14:47 2019/6/28
     * @Description: 售后列表数据查询
     */
    @Override
    public Page<AfterSaleIssue> getList(SearchParam search) {
        Page<AfterSaleIssue> list = null;
        PageHelper.startPage(search.getPageNo(), search.getPageSize());
        AfterSaleIssueCriteria criteria = new AfterSaleIssueCriteria();
        AfterSaleIssueCriteria.Criteria query = criteria.createCriteria();
        list = (Page<AfterSaleIssue>) afterSaleIssueMapper.selectByExample(criteria);
        return list;
    }

    /**
     * @Author : wdxu
     * @Date :17:15 2019/6/28
     * @Description: 删除售后数据
     */
    @Override
    public void deleteAfterSalesData(Integer id) {
        afterSaleIssueMapper.deleteByPrimaryKey(id);
    }

    /**
     * @Author : wdxu
     * @Date :15:21 2019/7/1
     * @Description: 通过id查询售后数据
     */
    @Override
    public AfterSaleIssue queryAfterSaleById(Integer id) {

        return afterSaleIssueMapper.selectByPrimaryKey(id);
    }

    @Override
    public AfterSaleIssue selectByIssueId(String id) {
        return afterSaleIssueMapper.selectByIssueId(id);
    }

    /**
     * @Author : wdxu
     * @Date :17:12 2019/7/1
     * @Description: 跟新售后数据
     */
    @Override
    public void updateAfterSalesData(AfterSaleIssue afterSaleIssue) {
        afterSaleIssueMapper.updateByPrimaryKeySelective(afterSaleIssue);
    }

    @Override
    public List<IssueShExt> getShExt(String id) {
        if (id!=null){
            IssueShExtCriteria criteria = new IssueShExtCriteria();
            IssueShExtCriteria.Criteria query = criteria.createCriteria().andIssueShIdEqualTo(id);
            List<IssueShExt> shExtList = issueShExtMapper.selectByExample(criteria);
            return shExtList;
        }
        return new ArrayList<IssueShExt>();
    }
}