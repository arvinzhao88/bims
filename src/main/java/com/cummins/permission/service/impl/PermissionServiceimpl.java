package com.cummins.permission.service.impl;

import com.cummins.bims.dto.AfterSaleIssue;
import com.cummins.bims.dto.AfterSaleIssueCriteria;
import com.cummins.contact.dao.PersonMapper;
import com.cummins.contact.dto.Person;
import com.cummins.contact.service.IPersonService;
import com.cummins.contact.util.StringUtil;
import com.cummins.model.RefPartExcel;
import com.cummins.model.SearchParam;
import com.cummins.permission.dao.BimsPersonMapper;
import com.cummins.permission.model.BimsPerson;
import com.cummins.permission.model.BimsPersonCriteria;
import com.cummins.permission.service.PermissionService;
import com.cummins.util.ExcelUtil;
import com.cummins.util.Md5Utils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

/**
 * /**
 *
 * @program: bims
 * @description:
 * @author: wdxu
 * @create: 2019-07-03 11:42
 */
@Service
public class PermissionServiceimpl implements PermissionService {
    @Autowired
    BimsPersonMapper bimsPersonMapper;
    @Autowired
    IPersonService iPersonService;

    /**
     * @Author : wdxu
     * @Date :11:58 2019/7/3
     * @Description: 添加用户
     */
    @Override
    public void addUser(BimsPerson bimsPerson) {
        bimsPersonMapper.insertSelective(bimsPerson);
    }

    /**
     * @Author : wdxu
     * @Date :12:12 2019/7/3
     * @Description: 根据用户account 查询
     */
    @Override
    public String queryAccordingToUserAccount(String account) {
        return bimsPersonMapper.queryAccordingToUserAccount(account);
    }

    /**
     * @Author : wdxu
     * @Date :9:39 2019/7/16
     * @Description: 根据用户loginname查询
     */

    @Override
    public String queryLoginName(String account) {
        return bimsPersonMapper.queryLoginName(account);
    }


    /**
     * @Author : wdxu
     * @Date :15:14 2019/7/3
     * @Description: 获取分页数据
     */
    @Override
    public Page<BimsPerson> getList(SearchParam search) {
        Page<BimsPerson> list = null;
        PageHelper.startPage(search.getPageNo(), search.getPageSize());
        BimsPersonCriteria criteria = new BimsPersonCriteria();
        BimsPersonCriteria.Criteria query = criteria.createCriteria();
        if (StringUtil.isNotBlank(search.getsearchText())) {
            String searchText = search.getsearchText();
            searchText = searchText.replace("%", "\\%");
            searchText = searchText.replace("_", "\\_");
            query.andAccountLike("%" + searchText + "%");
        }
        if (StringUtil.isNotBlank(search.getProcessPersonName())) {
            String userName = search.getProcessPersonName();
            userName = userName.replace("%", "\\%");
            userName = userName.replace("_", "\\_");
            query.andNameLike("%" + userName + "%");
        }
        query.andDeletedEqualTo(false); // 只查询未删除
        criteria.setOrderByClause("create_time desc");
        list = (Page<BimsPerson>) bimsPersonMapper.selectByExample(criteria);
        return list;
    }

    /**
     * @Author : wdxu
     * @Date :16:12 2019/7/3
     * @Description: 移除用户
     */
    @Override
    public void deleteUserById(Integer id) {
        BimsPerson bimsPerson = new BimsPerson();
        bimsPerson.setId(id);
        bimsPerson.setDeleted(true);
        bimsPerson.setUpdateTime(new Date()); // 删除时间
        bimsPersonMapper.updateByPrimaryKeySelective(bimsPerson);
    }

    /**
     * @Author : wdxu
     * @Date :16:36 2019/7/3
     * @Description: 查询用户id
     */
    @Override
    public BimsPerson findUserById(Integer id) {
        return bimsPersonMapper.selectByPrimaryKey(id);
    }

    /**
     * @Author : wdxu
     * @Date :17:05 2019/7/3
     * @Description: 更新数据id
     */
    @Override
    public void updateUserById(BimsPerson bimsPerson) {
        BimsPerson bimsPerson1 = bimsPersonMapper.selectByPrimaryKey(bimsPerson.getId());
        bimsPerson1.setCreateTime(new Date());
        bimsPerson1.setUpdateTime(new Date());
        bimsPerson1.setBelongArea(bimsPerson.getBelongArea());
        bimsPerson1.setBelongRole(bimsPerson.getBelongRole());
        bimsPersonMapper.updateByPrimaryKey(bimsPerson1);
    }


    /**
     * @Author : wdxu
     * @Date :9:43 2019/7/4
     * @Description: 登录校验
     */

    @Override
    public BimsPerson check(BimsPerson bimsPerson) {
        return bimsPersonMapper.check(bimsPerson);
    }

    /**
     * 通过工号查询用户
     * @param acc 工号
     * @return 用户对象
     * @Author qx
     */
    @Override
    public BimsPerson getPersonByAcc(String acc) {
        if (acc != null && !"".equals(acc)) {
            BimsPersonCriteria bimsPersonCriteria = new BimsPersonCriteria();
            BimsPersonCriteria.Criteria criteria = bimsPersonCriteria.createCriteria();
            criteria.andAccountEqualTo(acc);
            criteria.andDeletedEqualTo(false); // 未删除
            List<BimsPerson> personList = bimsPersonMapper.selectByExample(bimsPersonCriteria);
            if (personList != null && personList.size() > 0) {
                return personList.get(0);
            }
        }
        return null;
    }


    /**
     * @Author : wdxu
     * @Date :11:17 2019/7/24
     * @Description: 批量导入用户
     */
    @Override
    @Transactional
    public Integer fileUpload(MultipartFile file) {
        int res = 0;
        if (!StringUtils.isEmpty(file)) {
            try {
                List<RefPartExcel> list = ExcelUtil.readExcel(file, RefPartExcel.class);
                for (RefPartExcel partExcel : list) {
                    /**
                     * 查询是否有重复的用户
                     */
                    BimsPerson bimsPerson = getPersonByAcc(partExcel.getBimsAccount());
                    /**
                     * 查询 person 表中的account
                     */
                    Person person = iPersonService.getByAccount(1, partExcel.getBimsAccount());
                    /**
                     * 当bimsperson 表中没用户 && person表中有用户时
                     */
                    if (bimsPerson == null && person != null) {
                        String beLongRoles = "";
                        String[] beLongRole = partExcel.getBimsRole().split("/");
                        for (String s : beLongRole) {
                            if (s.equals("线边工人")) {
                                beLongRoles = "1,";
                            } else if (s.equals("质量工程师")) {
                                beLongRoles += "2,";
                            } else if (s.equals("责任人")) {
                                beLongRoles += "3,";
                            } else if (s.equals("EQRleader")) {
                                beLongRoles += "4,";
                            } else if (s.equals("质量经理")) {
                                beLongRoles += "5,";
                            } else if (s.equals("处理人")) {
                                beLongRoles += "6,";
                            } else if (s.equals("质检")) {
                                beLongRoles += "7,";
                            } else if (s.equals("用户管理")) {
                                beLongRoles += "8";
                            }
                        }

                        String beLongAreas = "";
                        String[] beLongArea = partExcel.getBelongArea().split("/");
                        for (String area : beLongArea) {
                            if (area.equals("APU&终检X")) {
                                beLongAreas = "8X,";
                            } else if (area.equals("APU&终检Y")) {
                                beLongAreas += "8Y,";
                            } else if (area.equals("T区X")) {
                                beLongAreas += "1X,";
                            } else if (area.equals("T区Y")) {
                                beLongAreas += "1Y,";
                            } else if (area.equals("机加X")) {
                                beLongAreas += "2X,";
                            } else if (area.equals("机加Y")) {
                                beLongAreas += "2Y,";
                            } else if (area.equals("JOB1X")) {
                                beLongAreas += "3X,";
                            } else if (area.equals("JOB1Y")) {
                                beLongAreas += "3Y,";
                            } else if (area.equals("BISX")) {
                                beLongAreas += "4X,";
                            } else if (area.equals("BISY")) {
                                beLongAreas += "4Y,";
                            } else if (area.equals("EQAX")) {
                                beLongAreas += "5X,";
                            } else if (area.equals("EQAY")) {
                                beLongAreas += "5Y,";
                            } else if (area.equals("SQAX")) {
                                beLongAreas += "6X,";
                            } else if (area.equals("SQAY")) {
                                beLongAreas += "6Y,";
                            } else if (area.equals("售后X")) {
                                beLongAreas += "7X,";
                            } else if (area.equals("售后Y")) {
                                beLongAreas += "7Y,";
                            }
                        }
                        if (beLongRoles != "" && beLongAreas != "") {
                            BimsPerson bimsPerson1 = new BimsPerson();
                            bimsPerson1.setAccount(person.getAccount());
                            bimsPerson1.setLoginName(person.getAccount());
                            bimsPerson1.setEmail(person.getEmail());
                            bimsPerson1.setName(person.getName());
                            bimsPerson1.setCreateTime(new Date());
                            bimsPerson1.setUpdateTime(new Date()); // 更新时间
                            bimsPerson1.setPassword(Md5Utils.getMD5Str("123456"));
                            bimsPerson1.setBelongRole(beLongRoles);
                            bimsPerson1.setBelongArea(beLongAreas);
                            bimsPerson1.setDeleted(false); // 未删除
                            bimsPersonMapper.insertSelective(bimsPerson1);
                            res = 1;
                        }

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        return res;
    }

    /**
     * 通过角色查询员工列表
     * @param role
     * @return
     */
    @Override
    public List<BimsPerson> getPersonListByRole(String role, String account) {
        if(role != null && !"".equals(role)) {
            Map<String, String> map = new HashMap<>();
            map.put("role", role);
            map.put("account", account);
            return bimsPersonMapper.getPersonListByRole(map);
        }
        return null;
    }

    @Override
    public Integer updateUserByAccount(BimsPerson bimsPerson) {
        BimsPersonCriteria bimsPersonCriteria = new BimsPersonCriteria();
        BimsPersonCriteria.Criteria criteria = bimsPersonCriteria.createCriteria();
        criteria.andAccountEqualTo(bimsPerson.getAccount());
        return bimsPersonMapper.updateByExampleSelective(bimsPerson,bimsPersonCriteria);
    }

    /**
     * 查询所有有效用户
     * @return
     */
    @Override
    public List<BimsPerson> getAllBimsPersonList() {
        BimsPersonCriteria bimsPersonCriteria = new BimsPersonCriteria();
        BimsPersonCriteria.Criteria criteria = bimsPersonCriteria.createCriteria();
        criteria.andDeletedEqualTo(false); // 未删除
        return bimsPersonMapper.selectByExample(bimsPersonCriteria);
    }

    /**
     * 根据id更新用户信息
     * @param bimsPersonList
     * @return
     */
    @Override
    public int updateListByAccount(List<BimsPerson> bimsPersonList) {
        if (bimsPersonList != null) {
            int count = 0; // 更新条数
            Iterator<BimsPerson> iter = bimsPersonList.iterator();
            while(iter.hasNext()) {
                BimsPerson bimsPerson = iter.next();
                BimsPersonCriteria bimsPersonCriteria = new BimsPersonCriteria();
                BimsPersonCriteria.Criteria criteria = bimsPersonCriteria.createCriteria();
                criteria.andAccountEqualTo(bimsPerson.getAccount());
                count += bimsPersonMapper.updateByExampleSelective(bimsPerson, bimsPersonCriteria);
            }
            return count;
        }
        return 0;
    }

    /**
     * 批量添加用户
     * @param bimsPersonList
     * @return
     */
    @Override
    public int insertList(List<BimsPerson> bimsPersonList) {
        if (bimsPersonList != null) {
            int count = 0; // 新增条数
            Iterator<BimsPerson> iter = bimsPersonList.iterator();
            while(iter.hasNext()) {
                BimsPerson bimsPerson = iter.next();
                count += bimsPersonMapper.insertSelective(bimsPerson);
            }
            return count;
        }
        return 0;
    }

    /**
     * 批量删除
     * @param bimsPersonList
     * @return
     */
    @Override
    public int deleteListById(List<BimsPerson> bimsPersonList) {
        if (bimsPersonList != null) {
            int count = 0; // 删除条数
            Iterator<BimsPerson> iter = bimsPersonList.iterator();
            while(iter.hasNext()) {
                BimsPerson bimsPerson = iter.next();
                count += bimsPersonMapper.updateByPrimaryKeySelective(bimsPerson);
            }
            return count;
        }
        return 0;
    }

    /**
     * 通过区域查询质量工程师
     * @param zone
     * @return
     */
    @Override
    public List<BimsPerson> getAllQeByZone(String zone) {
        if (zone != null && !"".equals(zone)) {
            BimsPersonCriteria bimsPersonCriteria = new BimsPersonCriteria();
            BimsPersonCriteria.Criteria criteria = bimsPersonCriteria.createCriteria();
            criteria.andDeletedEqualTo(false); // 未删除
            criteria.andBelongAreaLike("%" + zone + "%"); // 区域
            criteria.andBelongRoleLike("%2%"); // 质量工程师
            return bimsPersonMapper.selectByExample(bimsPersonCriteria);
        }
        return null;
    }

    @Override
    public Integer restPwd(BimsPerson bimsPerson) {
        return bimsPersonMapper.updateByPrimaryKeySelective(bimsPerson);
    }
}