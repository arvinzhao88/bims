package com.cummins.report.service.impl;

import com.cummins.bims.dao.DealToolPersonMapper;
import com.cummins.bims.dao.IssueMapper;
import com.cummins.bims.dto.DealToolPerson;
import com.cummins.bims.dto.DealToolPersonCriteria;
import com.cummins.bims.dto.IssueParam;
import com.cummins.bims.service.DealToolPersonService;
import com.cummins.model.SearchParam;
import com.cummins.report.service.IIssueListService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 问题列表
 * @author qx
 */
@Service
public class IssueListServiceImpl implements IIssueListService {
    @Autowired
    private IssueMapper issueMapper;
    @Autowired
    private DealToolPersonMapper dealToolPersonMapper;

    /**
     * 查询所有问题列表
     * @param param
     * @return
     */
    @Override
    public Page<IssueParam> getAllIssueList(SearchParam param) {
        Page<IssueParam> list = new Page<>();
        PageHelper.startPage(param.getPageNo(), param.getPageSize());
        if (param != null) {
            list = (Page<IssueParam>) issueMapper.getIssueListByArea(param);
            if (list != null && list.size() > 0) {
                return setToolList(list);
            }
        }
        return list;
    }

    /**
     * 查询工具表
     * @param list
     * @return
     */
    private Page<IssueParam> setToolList(Page<IssueParam> list) {
        Iterator<IssueParam> iter = list.iterator();
        // 循环查询工具列表
        while(iter.hasNext()) {
            IssueParam iss = iter.next();
            DealToolPersonCriteria dealToolPersonCriteria = new DealToolPersonCriteria();
            DealToolPersonCriteria.Criteria criteria = dealToolPersonCriteria.createCriteria();
            criteria.andIssueIdEqualTo(iss.getId());
            criteria.andTypeEqualTo(Byte.valueOf("1"));
            List<DealToolPerson> toolList = dealToolPersonMapper.selectByExample(dealToolPersonCriteria);
            if (toolList != null && toolList.size() > 0) {
                Set<Byte> statusSet = new HashSet<>(); // 状态
                StringBuffer buffer = new StringBuffer(); // 处理工具责任人
                Iterator<DealToolPerson> tIter = toolList.iterator();
                while(tIter.hasNext()) {
                    DealToolPerson dtp = tIter.next();
                    if (dtp.getStatus() != null) {
                        statusSet.add(dtp.getStatus());
                    }
                    if (dtp.getToolName() != null && !"".equals(dtp.getToolName())) {
                        buffer.append(dtp.getToolName());
                    } else {
                        buffer.append("--");
                    }
                    buffer.append("/");
                    if (dtp.getProcessPersonName() != null && !"".equals(dtp.getProcessPersonName())) {
                        buffer.append(dtp.getProcessPersonName());
                    } else {
                        buffer.append("--");
                    }
                    buffer.append("<br>");
                }
                if (statusSet.size() == 1) {
                    if (statusSet.contains(Byte.valueOf("0"))) {
                        iss.setToolStatus("待跟踪");
                    } else {
                        if(statusSet.contains(Byte.valueOf("4"))) {
                            iss.setToolStatus("已跟踪");
                        } else {
                            iss.setToolStatus("跟踪中");
                        }
                    }
                } else {
                    if (statusSet.size() > 1) {
                        iss.setToolStatus("跟踪中");
                    }
                }
                iss.setTools(buffer.toString());
            }
        }
        return list;
    }
}
