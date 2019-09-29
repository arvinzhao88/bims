package com.cummins.bims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("testInterface")
public class TestContorller {

    /**
     * 对接接口测试
     * @return
     */
    @RequestMapping("test")
    public String test() {

        return "back/bims/qualityissues/test/testInterface";
    }

}
