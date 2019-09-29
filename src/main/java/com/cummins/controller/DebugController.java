package com.cummins.controller;

import javax.servlet.http.HttpServletRequest;

import com.cummins.permission.model.BimsPerson;
import com.cummins.permission.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cummins.contact.dto.Person;
import com.cummins.contact.service.IPersonService;
import com.cummins.contact.util.JsonResult;

@Controller
@RequestMapping("debug")
public class DebugController {

	@Autowired
	private IPersonService personService;

	@Autowired
	private PermissionService permissionService;
	
	//根据员工ID,状态 获取所有的报告
	@RequestMapping("/init")
	@ResponseBody
	public JsonResult initDebug(HttpServletRequest request,
			@RequestParam(value = "personId", required = false) Integer personId) {

//		Person person = personService.getByPersonId(1, personId);
		BimsPerson person = permissionService.findUserById(personId);

		if(person!=null && person.getBelongRole().contains("1")) {
			request.getSession().setAttribute("wx_person_info", person);
			return JsonResult.success("debug success", person);
		}else {
			return JsonResult.failure("debug fail 用户不存在");
		}

	}
}
