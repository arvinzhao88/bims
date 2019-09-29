package com.cummins.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.DeskService;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.cummins.permission.service.PermissionService;
import com.cummins.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("back")
public class BackController {
/*
	@Autowired
	private ISysMenuService sysMenuService;

	@Autowired
	private ISysUserService sysUserService;*/
    @Autowired
    private ApuCheckService  apuCheckService;

    @Value("${qywx_appid}")
    private String appId;

    @Autowired
    PermissionService permissionService;

    @Autowired
    DeskService deskService;

    //进入登录
    @RequestMapping("/login")
    public String cjhd(Model model, @RequestParam(value = "setpId", required = false) Integer setpId) {
//        System.out.println("----------登录------------");
        return "back/login";
    }

    /**
     * @Author : wdxu
     * @Date :9:39 2019/7/4
     * @Description: 登录修改
     */
    @RequestMapping("/dologin")
    @ResponseBody
    public JsonResult dologin(HttpServletRequest request, HttpServletResponse response, Model model,
                              @RequestParam String userName, @RequestParam String password) {
        /**
         * 校验登录
         */
        BimsPerson bimsPerson = new BimsPerson();
        bimsPerson.setLoginName(userName);
        bimsPerson.setPassword(Md5Utils.getMD5Str(password));
        BimsPerson bimsPerson1 = permissionService.check(bimsPerson);
        if (bimsPerson1 != null) {
            request.getSession().setAttribute("person", bimsPerson1);
            //System.out.println(bimsPerson1.getName() + "==============>登录系统");
            return JsonResult.success("success");
        } else {
            return JsonResult.failure("用户名密码错误");
        }
		/*Result<String> result = new Result<String>();
		Subject subject = SecurityUtils.getSubject();
		String md5Str = Md5Utils.getMD5Str(password);
		AuthenticationToken authenticationToken = new UsernamePasswordToken(userName, md5Str);
		//后台查询
		try {
			subject.login(authenticationToken);
			result.setStatus(1);
			result.setResult(userName);
			request.getSession().setAttribute("userName", userName);
			//更新用户表
			sysUserService.updateByName(userName,subject.getSession().getHost());
			//首页左侧树:要根据应用ID查询
			List<SysMenu> treeList = sysMenuService.getTreeByLoginName(userName,appId);
			List<SysMenu> formatTreeList = formatTreeList(treeList);
			request.getSession().setAttribute("treeList", formatTreeList);
			//SysUser sysUserFind = sysUserService.getEntity(sysuser);
		} catch (UnknownAccountException e) {
			result.setStatus(0);
			result.setResult("没有此用户");
		} catch (IncorrectCredentialsException e) {
			result.setStatus(0);
			result.setResult("密码错误");
		} catch (AuthenticationException e) {
			// 认证失败
			e.printStackTrace();
			result.setStatus(0);
			result.setResult("登录失败");
		}
		return result;*/

    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response, Model model) {
		/*Subject subject = SecurityUtils.getSubject();
		subject.logout();*/
        request.getSession().removeAttribute("person");
        return "back/login";
    }

    @RequestMapping("/updPwd")
    @ResponseBody
    public JsonResult updPwd(HttpServletRequest request, HttpServletResponse response, Model model,BimsPerson bimsPerson) {
		/*Subject subject = SecurityUtils.getSubject();
		subject.logout();*/

        bimsPerson.setPassword(Md5Utils.getMD5Str(bimsPerson.getPassword()));
        Integer i = permissionService.updateUserByAccount(bimsPerson);
        if (i>0){
            return JsonResult.success("修改成功");
        }
        return JsonResult.failure("操作失败");
    }

    @RequestMapping("/restPwd")
    @ResponseBody
    public JsonResult restPwd(HttpServletRequest request, HttpServletResponse response, Model model,BimsPerson bimsPerson) {
        BimsPerson person = permissionService.findUserById(bimsPerson.getId());
        person.setPassword(Md5Utils.getMD5Str(bimsPerson.getPassword()));
        Integer i = permissionService.restPwd(person);
        if (i>0){
            return JsonResult.success("修改成功");
        }
        return JsonResult.failure("操作失败");
    }

	/*public List<SysMenu> formatTreeList(List<SysMenu> treeList) {
		List<SysMenu> result=new ArrayList<SysMenu>();
		for (SysMenu sysMenu : treeList) {
			if(0==sysMenu.getParentId()) {
				List<SysMenu> childList=new ArrayList<SysMenu>();
				for (SysMenu childTree : treeList) {
					if(sysMenu.getId().equals(childTree.getParentId())) {
						childList.add(childTree);
					}
				}
				sysMenu.setChildList(childList);
				result.add(sysMenu);
			}
		}
		return result;
	}*/

    @RequestMapping("/index")
    public String index(Model model, HttpServletRequest request, SearchParam searchParam) {
        BimsPerson bimsPerson = (BimsPerson)request.getSession().getAttribute("person");
        model.addAttribute("area",bimsPerson.getBelongArea());
        Map<String,Integer> map= deskService.findBelongArea(bimsPerson.getBelongArea());
        model.addAttribute("map",map);
        model.addAttribute("data", deskService.deskInit(searchParam));
        return "/index";
    }


    @Autowired
    private UrlToMultipartFileUtil utmf;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest request) {
        try {
            JSONObject jsonObject = utmf.urlToMultipartFile("http://pic1.win4000.com/wallpaper/0/5601195554177.jpg");

            System.out.println(jsonObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
