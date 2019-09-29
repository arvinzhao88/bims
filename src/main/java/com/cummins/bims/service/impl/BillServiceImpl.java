package com.cummins.bims.service.impl;

import com.cummins.bims.dao.BillMapper;
import com.cummins.bims.dao.DictMapper;
import com.cummins.bims.dao.IssueMapper;
import com.cummins.bims.dto.Bill;
import com.cummins.bims.dto.BillCriteria;
import com.cummins.bims.dto.Issue;
import com.cummins.bims.enums.BillEnum;
import com.cummins.bims.service.BillService;
import com.cummins.bims.service.NumberService;
import com.cummins.receipt.dao.DocumentsToBeProcessesMapper;
import com.cummins.receipt.dao.NonconfigContainmentMapper;
import com.cummins.receipt.dao.ScrapTicketMapper;
import com.cummins.receipt.dao.TagstobeProcessedMapper;
import com.cummins.receipt.model.*;
import com.cummins.util.StringUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private NumberService numberService;

    @Autowired
    private DictMapper dictMapper;

    @Autowired
    private BillMapper billMapper;

    @Autowired
    private IssueMapper issueMapper;

    @Autowired
    private ScrapTicketMapper scrapTicketMapper;

    @Autowired
    private TagstobeProcessedMapper tobeProcessedMapper;

    @Autowired
    private NonconfigContainmentMapper nonconfigContainmentMapper;

    @Autowired
    private DocumentsToBeProcessesMapper documentsToBeProcessesMapper;

    @Override
    public List<Bill> getBills(Bill bill) {
        BillCriteria example = new BillCriteria();
        BillCriteria.Criteria query = example.createCriteria();
        query.andIssueIdEqualTo(bill.getIssueId());
        return billMapper.selectByExample(example);
    }

    @Override
    public Bill save(Bill bill) {
        billMapper.insertSelective(bill);
        Integer id = bill.getId();// i == null
        Bill b = billMapper.selectByPrimaryKey(id);
        //初始化待处理标签数据返回单据id
        Integer tagsId = this.addTags(bill);

        //设置单据id
        b.setReceiptId(tagsId);
        b.setBillName(BillEnum.getNameByCode(Integer.valueOf(bill.getBillType())));
        b.setTempMeasures(BillEnum.getNameByCode(Integer.valueOf(bill.getTempMeasures())));
        billMapper.updateByPrimaryKeySelective(b);
        return b;
    }

    @Override
    public List<Bill> saveBatch(Bill bill, String qDocs) {
        List<Bill> listBill = new ArrayList<>();
        if(StringUtil.isNotBlank(qDocs)) {
            String[] split = qDocs.split(",");
            for(int i=0;i<split.length;i++) {

                Bill bill1 = new Bill();
                //拷贝javabean
                BeanUtils.copyProperties(bill, bill1);
                bill1.setBillType(split[i]);
                bill1.setBillName(BillEnum.getNameByCode(Integer.valueOf(split[i])));
                bill1.setMeasureNo(numberService.selectMaxBillNo(bill.getMeasureNo()));
                //初始化待处理标签数据返回单据id
                Integer tagsId = this.addTags(bill1);//  循环调用插入tags表 返回ID值
                bill1.setReceiptId(tagsId);
                billMapper.insertSelective(bill1);
                listBill.add(bill1);
            }
//            int i = billMapper.saveBatch(listBill);
        }
        return listBill;
    }

    @Override
    public Integer del(Bill bill) {
        billMapper.deleteByPrimaryKey(bill.getId());
        return tobeProcessedMapper.deleteByPrimaryKey(bill.getReceiptId());
    }

    @Override
    public List<Bill> getListByBillType(Bill bill) {
        BillCriteria example = new BillCriteria();
        BillCriteria.Criteria query = example.createCriteria();
        query.andIssueIdEqualTo(bill.getIssueId());
        query.andBillTypeEqualTo(bill.getBillType());
        return billMapper.selectByExample(example);
    }

    @Override
    public List<Bill> getBillTabs(Bill bill) {
        return billMapper.getBillTabs(bill);
    }

//    @Override
//    public List<TagstobeProcessed> getListByBillType(Bill bill) {
//        TagstobeProcessedCriteria criteria = new TagstobeProcessedCriteria();
//        criteria.createCriteria().andQuestionIdEqualTo(Integer.valueOf(bill.getIssueId()));
//        return tobeProcessedMapper.selectByExample(criteria);
//    }


    //初始化待处理标签数据
    public Integer addTags(Bill bill) {
        //根据问题id获得问题具体数据
        Issue issue = issueMapper.selectByPrimaryKey(Integer.valueOf(bill.getIssueId()));
        if (bill.getBillType().equals("1")){
            TagstobeProcessed tobeProcessed = new TagstobeProcessed();
            tobeProcessed.setQuestionId(Integer.valueOf(bill.getIssueId()));
            tobeProcessed.setNumberr(bill.getMeasureNo());
            tobeProcessed.setType(issue.getEngineType());
            tobeProcessed.setPartsEngineNumber((issue.getPartNo() == null ? "" : issue.getPartNo()) + (issue.getEsn() == null ? "" : issue.getEsn()));
            tobeProcessed.setQuantity(Double.valueOf(issue.getQty()==null?0:issue.getQty()));
            tobeProcessed.setPartName(issue.getPartName());
            tobeProcessed.setTraceabilityId(issue.getSeriesNo());
            if (issue != null && issue.getArea() != null) {
                tobeProcessed.setArea(dictMapper.selectByPrimaryKey(Integer.valueOf(issue.getArea())).getName());
            }
            tobeProcessed.setDefectDescription(issue.getIssueDesc());
            tobeProcessed.setSupplierCode(issue.getVendorCode());
            tobeProcessed.setSupplierName(issue.getVendorName());
            tobeProcessed.setBelongArea(issue.getArea());
            tobeProcessed.setCreateAccount(issue.getInputPresonName());
            tobeProcessed.setUpdateAccount(issue.getProcessPersonName());
            tobeProcessed.setCreatetime(issue.getInputTime());
            tobeProcessed.setUpdatetime(issue.getProcessTime());
            tobeProcessed.setStatue(1);
            //插入单据
            tobeProcessedMapper.insert(tobeProcessed);
            //获取单据id
            Integer id = tobeProcessed.getId();
            return id;
        }
        if (bill.getBillType().equals("2")){
            ScrapTicket scrapTicket = new ScrapTicket();
            scrapTicket.setBack2(issue.getIssueStation());//工位信息
            scrapTicket.setQuestiondId(Integer.valueOf(bill.getIssueId()));
            scrapTicket.setNumber(bill.getMeasureNo());
            if ("M".equals(issue.getQualityType())){
                scrapTicket.setType(issue.getEngineSeries());
            }else {
                scrapTicket.setType(issue.getEngineType());
            }
            scrapTicket.setPartsEngineNumber((issue.getPartNo() == null ? "" : issue.getPartNo()) + (issue.getEsn() == null ? "" : issue.getEsn()));
            scrapTicket.setSo(issue.getSo());
            scrapTicket.setQuantity(Double.valueOf(issue.getQty()==null?0:issue.getQty()));
            scrapTicket.setPartName(issue.getPartName());
            scrapTicket.setTraceabilityId(issue.getSeriesNo());
            scrapTicket.setDefectDescription(issue.getIssueDesc());
            scrapTicket.setItemNumber(issue.getProjectNo());
            scrapTicket.setSupplierCode(issue.getVendorCode());
            if (issue != null && issue.getArea() != null) {
                scrapTicket.setBelongArea(dictMapper.selectByPrimaryKey(Integer.valueOf(issue.getArea())).getName());
            }
//            scrapTicket.setBelongArea(issue.getArea());
            scrapTicket.setCreateAccount(issue.getInputPresonName());
            scrapTicket.setUpdateAccount(issue.getProcessPersonName());
            scrapTicket.setCreatetime(issue.getInputTime());
            scrapTicket.setUpdatetime(issue.getProcessTime());
            scrapTicket.setStatue(1);
            scrapTicket.setBack1(issue.getProcessPersonAccount()+issue.getProcessPersonName());
            //插入单据
            scrapTicketMapper.insert(scrapTicket);
            //获取单据id
            Integer id = scrapTicket.getId();
            return id;
        }
        if (bill.getBillType().equals("4")){
            DocumentsToBeProcesses documentsToBeProcesses = new DocumentsToBeProcesses();
            documentsToBeProcesses.setQuestionId(Integer.valueOf(bill.getIssueId()));
            documentsToBeProcesses.setNumber(bill.getMeasureNo());
            if ("M".equals(issue.getQualityType())){
                documentsToBeProcesses.setType(issue.getEngineSeries());
            }else {
                documentsToBeProcesses.setType(issue.getEngineType());
            }
            documentsToBeProcesses.setPartsEngineNumber((issue.getPartNo() == null ? "" : issue.getPartNo()) + (issue.getEsn() == null ? "" : issue.getEsn()));
            documentsToBeProcesses.setQuantity(Double.valueOf(issue.getQty()==null?0:issue.getQty()));
            documentsToBeProcesses.setPartName(issue.getPartName());
            documentsToBeProcesses.setTraceabilityId(issue.getSeriesNo());
//            documentsToBeProcesses.setArea(issue.getArea());
            if (issue != null && issue.getArea() != null) {
                if ("M".equals(issue.getQualityType())){
                    documentsToBeProcesses.setArea(issue.getIssueStation());
                }else {
                    documentsToBeProcesses.setArea(dictMapper.selectByPrimaryKey(Integer.valueOf(issue.getArea())).getName());
                }
            }
            documentsToBeProcesses.setDefectDescription(issue.getIssueDesc());
            documentsToBeProcesses.setDate(new Date());
            documentsToBeProcesses.setSupplierCode(issue.getVendorCode());
            documentsToBeProcesses.setSupplierName(issue.getVendorName());
            documentsToBeProcesses.setBelongArea(issue.getArea());
            documentsToBeProcesses.setCreateAccount(issue.getInputPresonName());
            documentsToBeProcesses.setUpdateAccount(issue.getProcessPersonName());
            documentsToBeProcesses.setCreatetime2(new Date());
            documentsToBeProcesses.setUpdatetime(issue.getProcessTime());
            documentsToBeProcesses.setStatue(1);
            //插入单据
            documentsToBeProcessesMapper.insert(documentsToBeProcesses);
            //获取单据id
            Integer id = documentsToBeProcesses.getId();
            return id;
        }
        if (bill.getBillType().equals("6")){
            NonconfigContainment nonconfigContainment = new NonconfigContainment();
            nonconfigContainment.setQuestionId(Integer.valueOf(bill.getIssueId()));
            nonconfigContainment.setPartNo(issue.getPartNo());
            nonconfigContainment.setDescription(issue.getPartName());
            nonconfigContainment.setIssueDescription(issue.getIssueDesc());
//            nonconfigContainment.setBelongArea(issue.getArea());
            if (issue != null && issue.getArea() != null) {
                nonconfigContainment.setBelongArea(dictMapper.selectByPrimaryKey(Integer.valueOf(issue.getArea())).getName());
            }
            nonconfigContainment.setCustomerSupplier(issue.getVendorName());
            nonconfigContainment.setCreateAccount(issue.getInputPresonName());
            nonconfigContainment.setUpdateAccount(issue.getProcessPersonName());
            nonconfigContainment.setUpdatetime(issue.getProcessTime());
            nonconfigContainment.setStatue(1);
            //插入单据
            nonconfigContainmentMapper.insert(nonconfigContainment);
            //获取单据id
            Integer id = nonconfigContainment.getId();
            return id;
        }
        return 0;

    }

}
