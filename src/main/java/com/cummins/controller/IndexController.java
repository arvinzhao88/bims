package com.cummins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")	
	//@ResponseBody
    public String index(Model model) {
		
		
		return "forward:web/index";
		//return areaList;
		/*System.out.println(areaList);
        return "Greetings from Spring Boot!";*/
    }
	

}
