package com.cummins.bims.service.impl;

import com.cummins.bims.dao.DealLogMapper;
import com.cummins.bims.dao.IssueExtendMapper;
import com.cummins.bims.dao.IssueJobReviewMapper;
import com.cummins.bims.dao.IssueMapper;
import com.cummins.bims.dto.*;
import com.cummins.bims.enums.RecordStatusEnum;
import com.cummins.bims.service.JobService;
import com.cummins.contact.dao.ConnPersonDepartMapper;
import com.cummins.contact.dao.PersonMapper;
import com.cummins.contact.dto.ConnPersonDepart;
import com.cummins.contact.dto.ConnPersonDepartCriteria;
import com.cummins.contact.dto.Person;
import com.cummins.contact.dto.PersonCriteria;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.DealLogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private ConnPersonDepartMapper connPersonDepartMapper;

    @Autowired
    private IssueJobReviewMapper jobReviewMapper;

    @Autowired
    private IssueMapper issueMapper;

    @Autowired
    private DealLogMapper dealLogMapper;

    @Autowired
    private IssueExtendMapper issueExtendMapper;

    @Override
    public Integer add(IssueJobReview issueJobReview,BimsPerson person) {
        jobReviewMapper.insertSelective(issueJobReview);
        Issue issue = new Issue();
        issue.setId(issueJobReview.getIssueId());
        issue.setProcessStatus("3");//责任人处理

        //插入处理记录
        DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.STARTDEAL.getCode()),person);
        dealLog.setIssueId(issueJobReview.getIssueId());
        dealLogMapper.insert(dealLog);
        return issueMapper.updateByPrimaryKeySelective(issue);
    }

    @Override
    public List<IssueJobReview> getReviewList(String issueId) {
        IssueJobReviewCriteria criteria = new IssueJobReviewCriteria();
        IssueJobReviewCriteria.Criteria example = criteria.createCriteria();
        example.andIssueIdEqualTo(Integer.valueOf(issueId));
        criteria.setOrderByClause("id desc");
        return jobReviewMapper.selectByExample(criteria);
    }

    @Override
    public IssueJobReview getReview(String issueId) {
        IssueJobReviewCriteria criteria = new IssueJobReviewCriteria();
        IssueJobReviewCriteria.Criteria example = criteria.createCriteria();
        example.andIssueIdEqualTo(Integer.valueOf(issueId));
        criteria.setOrderByClause("id desc");
        List<IssueJobReview> issueJobReviews = jobReviewMapper.selectByExample(criteria);
        if (issueJobReviews.size()>0){
            return issueJobReviews.get(0);
        }
        return new IssueJobReview();
    }

    @Override
    public Integer job1Close(IssueJobReview issueJobReview, BimsPerson person) {
        //根据责任人account查询责任人所属部门
        PersonCriteria pExample = new PersonCriteria();
        PersonCriteria.Criteria pQuery = pExample.createCriteria();
        pQuery.andAccountEqualTo(issueJobReview.getHandlerPersonAccount());
        List<Person> personList = personMapper.selectByExample(pExample);
        if(personList.size()>0) {
            ConnPersonDepartCriteria cpExample = new ConnPersonDepartCriteria();
            ConnPersonDepartCriteria.Criteria cpcriteria = cpExample.createCriteria();
            cpcriteria.andPersonIdEqualTo(personList.get(0).getId());
            List<ConnPersonDepart> connPersonDeparts = connPersonDepartMapper.selectByExample(cpExample);
            if (connPersonDeparts.size()>0) {
                issueJobReview.setHandlerDeptName(connPersonDeparts.get(0).getDepartName());
                issueJobReview.setHandlerDeptId(connPersonDeparts.get(0).getDepartId());
            }
        }

        jobReviewMapper.updateByPrimaryKeySelective(issueJobReview);
        Issue issue = new Issue();
        issue.setIssueCategoryL3Name(issueJobReview.getReason());//问题关闭原因
        issue.setId(issueJobReview.getIssueId());
        issue.setCloseTime(new Date());
        issue.setProcessStatus("7");//关闭问题
        issue.setIsClaim("1");//评审状态OK
        //插入处理记录
        DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.CLOSE.getCode()),person);
        dealLog.setIssueId(issueJobReview.getIssueId());
        dealLogMapper.insert(dealLog);
        return issueMapper.updateByPrimaryKeySelective(issue);
    }

    @Override
    public Integer job1Reject(IssueJobReview issueJobReview, BimsPerson person) {
        //根据责任人account查询责任人所属部门
        PersonCriteria pExample = new PersonCriteria();
        PersonCriteria.Criteria pQuery = pExample.createCriteria();
        pQuery.andAccountEqualTo(issueJobReview.getHandlerPersonAccount());
        pQuery.andDeletedEqualTo(false);
        pQuery.andFiredEqualTo(false);
        List<Person> personList = personMapper.selectByExample(pExample);
        if(personList.size()>0) {
            ConnPersonDepartCriteria cpExample = new ConnPersonDepartCriteria();
            ConnPersonDepartCriteria.Criteria cpcriteria = cpExample.createCriteria();
            cpcriteria.andPersonIdEqualTo(personList.get(0).getId());
            List<ConnPersonDepart> connPersonDeparts = connPersonDepartMapper.selectByExample(cpExample);
            if (connPersonDeparts.size()>0) {
                issueJobReview.setHandlerDeptName(connPersonDeparts.get(0).getDepartName());
                issueJobReview.setHandlerDeptId(connPersonDeparts.get(0).getDepartId());
            }
        }

        jobReviewMapper.updateByPrimaryKeySelective(issueJobReview);
        Issue issue = new Issue();
        issue.setId(issueJobReview.getIssueId());
        issue.setProcessStatus("1");//问题初始状态

        //插入处理记录
        DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.REJECT.getCode()),person);
        dealLog.setIssueId(issueJobReview.getIssueId());
        dealLogMapper.insert(dealLog);
        return issueMapper.updateByPrimaryKeySelective(issue);
    }

    @Override
    public List<Issue> selectBySo(Issue issue) {
        IssueCriteria criteria = new IssueCriteria();
        criteria.createCriteria().andQualityTypeLike(issue.getQualityType());
        return issueMapper.selectByExample(criteria);
    }

    /**
     * 新增问题
     * @param issue
     * @param person
     * @return 成功返回id，失败返回0
     */
    @Override
    @Transactional
    public Integer apuAdd(Issue issue,BimsPerson person) {
        issue.setInputTime(new Date());
        issue.setDelflag("1");//1 未删除
        issue.setSubSource("2");//1 pad提交 2 web提交
        issue.setProcessStatus("1");//已接收待处理
        issue.setIsEqr("0");    //初始化状态
        issue.setProcessTime(new Date());
        Integer i = issueMapper.insertSelective(issue);
        Integer id = issue.getId();// i == null
        if(i > 0){//如果插入成功
            id = issue.getId();//i为主键自增id
            if (issue.getIssueExtend()!=null && issue.getIssueExtend()!=""){
                IssueExtend issueExtend =  new IssueExtend();
                issueExtend.setIssueManageId(id);
                issueExtend.setAttribute(issue.getIssueExtend());
                issueExtendMapper.insertSelective(issueExtend);
            }
            //插入处理记录
            DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.SUMITISSUE.getCode()),person);
            dealLog.setIssueId(id);
            dealLogMapper.insert(dealLog);
            return id;
        }
        return 0;
    }
}
