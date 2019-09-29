package com.cummins.bims.service.impl;

import com.cummins.bims.dao.DealToolPersonMapper;
import com.cummins.bims.dao.IssueMapper;
import com.cummins.bims.dto.*;
import com.cummins.bims.service.DeskService;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Service
public class DeskServiceImpl implements DeskService {
    @Autowired
    private IssueMapper issueMapper;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private DealToolPersonMapper dealToolPersonMapper;

    @Override
    public List<Map> getIssueAmount(SearchParam searchParam) {
        List<Map> maps = issueMapper.getIssueAmount(searchParam);
        return maps;
    }

    /*@Override
    public List<Map> getMyDeskAmount(IssueParam issueParam) {
        return issueMapper.getMyDeskAmount(issueParam);
    }*/
    @Override
    public Map<String, Integer> findBelongArea(String belongArea) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        // 当前登录用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
//        String[] args=belongArea.split(",");
//        for (String s:args) {
        Map<String, String> param = new HashMap<>();
        String plant = "";
        if (belongArea != null) {
            if (belongArea.contains("1X") || belongArea.contains("1F")) {
                if (belongArea.contains("1X") && !belongArea.contains("1F")) {
                    plant = "63";
                }
                if (!belongArea.contains("1X") && belongArea.contains("1F")) {
                    plant = "64";
                }
                param.put("area", "T");
                param.put("isRft", "1");
                param.put("plant", plant);
                Integer count = issueMapper.selectbyrole(param);
                map.put("T", count);
            }
            if (belongArea.contains("2X") || belongArea.contains("2F")) {
                plant = "";
                if (belongArea.contains("2X") && !belongArea.contains("2F")) {
                    plant = "63";
                }
                if (!belongArea.contains("2X") && belongArea.contains("2F")) {
                    plant = "64";
                }
                param.put("area", "M");
                param.put("isRft", null);
                param.put("plant", plant);
                Integer count = issueMapper.selectbyrole(param);
                map.put("M", count);
            }
            if (belongArea.contains("3X") || belongArea.contains("3F")) {
                plant = "";
                if (belongArea.contains("3X") && !belongArea.contains("3F")) {
                    plant = "63";
                }
                if (!belongArea.contains("3X") && belongArea.contains("3F")) {
                    plant = "64";
                }
                param.put("area", "J");
                param.put("isRft", null);
                param.put("plant", plant);
                Integer count = issueMapper.selectbyrole(param);
                map.put("J", count);
            }
            if (belongArea.contains("4X") || belongArea.contains("4F")) {
                plant = "";
                if (belongArea.contains("4X") && !belongArea.contains("4F")) {
                    plant = "63";
                }
                if (!belongArea.contains("4X") && belongArea.contains("4F")) {
                    plant = "64";
                }
                param.put("area", "B");
                param.put("isRft", null);
                param.put("plant", plant);
                Integer count = issueMapper.selectbyrole(param);
                map.put("B", count);
            }
            if (belongArea.contains("5X") || belongArea.contains("5F")) {
                plant = "";
                if (belongArea.contains("5X") && !belongArea.contains("5F")) {
                    plant = "63";
                }
                if (!belongArea.contains("5X") && belongArea.contains("5F")) {
                    plant = "64";
                }
                param.put("area", "E");
                param.put("isRft", null);
                param.put("plant", plant);
                Integer count = issueMapper.selectbyrole(param);
                map.put("E", count);
            }
            if (belongArea.contains("6X") || belongArea.contains("6F")) {
                plant = "";
                if (belongArea.contains("6X") && !belongArea.contains("6F")) {
                    plant = "63";
                }
                if (!belongArea.contains("6X") && belongArea.contains("6F")) {
                    plant = "64";
                }
                param.put("area", "S");
                param.put("isRft", null);
                param.put("plant", plant);
                Integer count = issueMapper.selectbyrole(param);
                map.put("S", count);
            }
            if (belongArea.contains("7X") || belongArea.contains("7F")) {
                plant = "";
                if (belongArea.contains("7X") && !belongArea.contains("7F")) {
                    plant = "63";
                }
                if (!belongArea.contains("7X") && belongArea.contains("7F")) {
                    plant = "64";
                }
                param.put("area", "H");
                param.put("isRft", null);
                param.put("plant", plant);
                Integer count = issueMapper.selectbyrole(param);
                map.put("H", count);
            }
            if (belongArea.contains("8X") || belongArea.contains("8F")) {
                plant = "";
                if (belongArea.contains("8X") && !belongArea.contains("8F")) {
                    plant = "63";
                }
                if (!belongArea.contains("8X") && belongArea.contains("8F")) {
                    plant = "64";
                }
                param.put("area", "A");
                param.put("isRft", null);
                param.put("plant", plant);
                Integer count = issueMapper.selectbyrole(param);
                map.put("A", count);
            }
        }
        return map;
    }

    /**
     * 工作台初始化数据
     * @return
     */
    @Override
    public Map<String, Object> deskInit(SearchParam searchParam) {
        Map<String, Object> result = new HashMap<>();
        // 当前登录用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        if(person != null) {
            // 查询待办数量
            Map<String, Object> map = new HashMap<>();
            map.put("status", 0); // 状态未关闭
            map.put("account", person.getAccount()); // 登录人工号
            //List<IssueParam> unDealList = issueMapper.getIssueListByStatus(map); // 待办列表
            searchParam.setProcessStatus("1,2,3,4,5,6");
            searchParam.setProcessPersonAccount(person.getAccount());
            List<IssueParam> unDealList = issueMapper.getList(searchParam); // 待办列表
            if (unDealList != null) {
//                result.put("unDealList", unDealList.subList(0, 10));
                result.put("unDealNum", unDealList.size()); // 待办数
            } else {
                result.put("unDealNum", 0); //
            }
            // 查询已办数量
            map.put("status", 7);
            searchParam.setProcessStatus("7");
            //List<IssueParam> closeList = issueMapper.getIssueListByStatus(map); // 已办列表
            List<IssueParam> closeList = issueMapper.getList(searchParam); // 待办列表
            if (closeList != null) {
                result.put("closeNum", closeList.size()); // 已办数
            } else {
                result.put("closeNum", 0);
            }
            return result;
        }
        return null;
    }

    /**
     * 查询待办或已办列表
     * @param param
     * @return
     */
    @Override
    @Transactional
    public Page<IssueParam> getDeskListByStatus(SearchParam param) {
        if (param != null) {
            Map<String, Object> map = new HashMap<>();
            //map.put("status", Integer.parseInt(param.getProcessStatus()));
            //map.put("account", param.getProcessPersonAccount());
            PageHelper.startPage(param.getPageNo(), param.getPageSize());
            //Page<IssueParam> list = (Page<IssueParam>) issueMapper.getIssueListByStatus(map);
            Page<IssueParam> list = (Page<IssueParam>) issueMapper.getList(param);
            if (list != null && list.size() > 0) {
//                List<Integer> idList = new ArrayList<>();
//                Iterator<IssueParam> iter = list.iterator();
//                while (iter.hasNext()) {
//                    idList.add(iter.next().getId());
//                }
//                List<DealToolPerson> toolList = dealToolPersonMapper.selectByIssueId(idList);
//                System.out.println(toolList.size());

                return setToolList(list);
//                return list;
            }
        }
        return null;
    }

    /**
     * 查询各区待办列表
     * @param search
     * @return
     */
    @Override
    public Page<IssueParam> getUnListByArea(SearchParam search) {
        PageHelper.startPage(search.getPageNo(), search.getPageSize());
        return (Page<IssueParam>) issueMapper.getIssueListByArea(search);
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
