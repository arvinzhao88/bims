package com.cummins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


	
	@RequestMapping("/test")	
	//@ResponseBody
    public String index(Model model) {

        System.out.println("-----------------");
        return "test";
		//return areaList;
		/*System.out.println(areaList);
        return "Greetings from Spring Boot!";*/
    }

}
