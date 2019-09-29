package com.cummins.permission.controller;

import com.cummins.contact.dto.Person;
import com.cummins.model.DatatablesView;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.cummins.permission.model.BimsRole;
import com.cummins.permission.service.PermissionService;
import com.cummins.permission.service.RoleService;
import com.cummins.util.JsonResult;
import com.cummins.util.Md5Utils;
import com.github.pagehelper.Page;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: bims
 * @description: 添加用户
 * @author: wdxu
 * @create: 2019-07-02 11:10
 */
@Controller
@RequestMapping("permission")
public class PermissionController {
    @Autowired
    PermissionService permissionService;
    @Autowired
    RoleService roleService;

    /**
     * @Author : wdxu
     * @Date :11:18 2019/7/2
     * @Description: 跳转添加用户页面
     */
    @RequestMapping("jumpAddUser")
    public String jumpAddUser(Model model) {
        /**
         * 查询所有角色
         */
        List<BimsRole> bimsRole = roleService.queryRole();
        model.addAttribute("bimsRole", bimsRole);
        return "permission/addUser1";
    }

    /**
     * @Author : wdxu
     * @Date :11:19 2019/7/3
     * @Description: 添加用户
     */
    @RequestMapping("addUser")
    @ResponseBody
    public JsonResult addUser(BimsPerson bimsPerson) {
        String account = permissionService.queryAccordingToUserAccount(bimsPerson.getAccount());
        String loginname = permissionService.queryLoginName(bimsPerson.getLoginName());

        if (account != null) {
            return JsonResult.failure("工号已经存在");
        } else if (loginname != null && !"".equals(loginname)) {
            return JsonResult.failure("登录名已存在");
        } else if (account == null) {
            bimsPerson.setCreateTime(new Date());
            bimsPerson.setUpdateTime(new Date()); // 更新时间
            bimsPerson.setPassword(Md5Utils.getMD5Str("123456"));
            bimsPerson.setDeleted(false); // 设置成未删除
            permissionService.addUser(bimsPerson);
            return JsonResult.success("success");
        } else {
            return JsonResult.failure("添加失败");
        }
    }

    /**
     * @Author : wdxu
     * @Date :13:54 2019/7/3
     * @Description: 跳转 查询用户列表
     */
    @RequestMapping("jumpQueryUserList")
    public String jumpQueryUserList(BimsPerson bimsPerson) {
        return "permission/showUser";
    }

    /**
     * @Author : wdxu
     * @Date :15:11 2019/7/3
     * @Description: 获取用户分页数据
     */
    @RequestMapping("getList")
    @ResponseBody
    public DatatablesView<BimsPerson> getList(SearchParam search) {
        Page<BimsPerson> list = permissionService.getList(search);
        DatatablesView<BimsPerson> dataView = new DatatablesView<BimsPerson>();
        dataView.setData(list);
        dataView.setRecordsTotal((int) list.getTotal());
        dataView.setDraw(search.getPageSize());
        return dataView;
    }

    /**
     * @Author : wdxu
     * @Date :16:04 2019/7/3
     * @Description: 移除某一条数据
     */
    @RequestMapping("deleteUserById")
    @ResponseBody
    public JsonResult deleteUserById(Integer id) {
        permissionService.deleteUserById(id);
        return JsonResult.success("success");
    }

    /**
     * @Author : wdxu
     * @Date :16:22 2019/7/3
     * @Description: 跳转更新页面
     */
    @RequestMapping("findUserById/{id}")
    public String findUserById(@PathVariable("id") Integer id, Model model) {
        BimsPerson bimsPerson = permissionService.findUserById(id);
        List<BimsRole> bimsRole = roleService.queryRole();
        model.addAttribute("bimsPerson", bimsPerson);
        model.addAttribute("bimsRole", bimsRole);
        return "permission/editUser1";
    }

    /**
     * @Author : wdxu
     * @Date :16:58 2019/7/3
     * @Description: 更新数据
     */
    @RequestMapping("updateUserById")
    @ResponseBody
    public JsonResult updateUserById(BimsPerson bimsPerson) {
        permissionService.updateUserById(bimsPerson);
        return JsonResult.success("success");
    }


    /**
     * @Author : wdxu
     * @Date :11:10 2019/7/24
     * @Description: 批量导入用户
     */
    @RequestMapping(value = "uploadloadTemplate", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult fileUpload(HttpServletRequest request, MultipartFile file) {
        System.out.println(file.getSize());
        Integer res = permissionService.fileUpload(file);
        return res > 0 ? JsonResult.success("success") : JsonResult.failure("error");
    }

    /**
     * 通过角色查询用户列表
     * @param role
     * @return
     */
    @RequestMapping(value = "/getPersonListByRole", method = RequestMethod.GET)
    @ResponseBody
    public List<BimsPerson> getPersonListByRole(String role, String account) {
        return permissionService.getPersonListByRole(role, account);
    }
}