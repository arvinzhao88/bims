package com.cummins.bims.controller;

import com.cummins.contact.dao.PersonMapper;
import com.cummins.contact.dto.Person;
import com.cummins.contact.dto.PersonCriteria;
import com.cummins.contact.service.IPersonService;
import com.cummins.permission.dao.BimsPersonMapper;
import com.cummins.permission.model.BimsPerson;
import com.cummins.permission.model.BimsPersonCriteria;
import com.cummins.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * person表数据查询接口
 */
@Controller
@RequestMapping("back/person")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private BimsPersonMapper bimsPersonMapper;



    /**
     * 根据条件查询person
     * @param account
     * @return
     */
    @RequestMapping("queryByAccountOnly/{account}")
    @ResponseBody
    public List<Person> queryByAccountOnly(@PathVariable("account") String account) {

        PersonCriteria example = new PersonCriteria();
        PersonCriteria.Criteria query = example.createCriteria();
        if(StringUtil.isNotBlank(account)) {
            query.andAccountLike("%"+account+"%");
        }
        query.andDeletedEqualTo(false);
        query.andFiredEqualTo(false);
        List<Person> peoples = personMapper.selectByExample(example);
        return peoples;
    }





    /**
     * 根据条件查询person
     * @param userName
     * @return
     */
    @GetMapping("queryByName")
    @ResponseBody
    public List<Person> queryByNameOrAccount(String userName) {

        PersonCriteria example = new PersonCriteria();
        PersonCriteria.Criteria query = example.createCriteria();
        if(StringUtil.isNotBlank(userName)) {
            query.andNameLike("%"+userName+"%");
        }
        query.andDeletedEqualTo(false);
        query.andFiredEqualTo(false);
        List<Person> peoples = personMapper.selectByExample(example);
        return peoples;
    }


    /**
     * 根据条件查询person
     * @param account
     * @return
     */
    @GetMapping("queryByAccount")
    @ResponseBody
    public List<Person> queryByAccount(String account) {

        PersonCriteria example = new PersonCriteria();
        PersonCriteria.Criteria query = example.createCriteria();
        if(StringUtil.isNotBlank(account)) {
            query.andAccountLike("%"+account+"%");
        }
        query.andDeletedEqualTo(false);
        query.andFiredEqualTo(false);
        List<Person> peoples = personMapper.selectByExample(example);
        return peoples;
    }


    /**
     * 根据条件查询并且排除自己
     */
    @GetMapping("queryByNameNotSelf")
    @ResponseBody
    public List<Person> queryByNameNotSelf(String userName, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        PersonCriteria example = new PersonCriteria();
        PersonCriteria.Criteria query = example.createCriteria();
        if(StringUtil.isNotBlank(userName)) {
            query.andNameLike("%"+userName+"%");
        }
        query.andAccountNotEqualTo(person.getAccount());
        query.andFiredEqualTo(false); // 未离职
        query.andDeletedEqualTo(false); // 未离职
        List<Person> peoples = personMapper.selectByExample(example);
        return peoples;
    }

    /**
     * 根据条件查询EQR Leader 数据源为bims_person
     * @param userName
     * @return
     */
    @GetMapping("queryByNameToBims")
    @ResponseBody
    public List<BimsPerson> queryByNameToBims(String userName) {

        BimsPersonCriteria example = new BimsPersonCriteria();
        BimsPersonCriteria.Criteria query = example.createCriteria();
        if(StringUtil.isNotBlank(userName)) {
            query.andNameLike("%"+userName+"%");
        }
        query.andDeletedEqualTo(false);
        List<BimsPerson> peoples = bimsPersonMapper.selectByExample(example);
        List<BimsPerson> newPeoples = new ArrayList<>();
        for(BimsPerson person : peoples) {
            String perm = person.getBelongRole();
            if(StringUtil.isNotBlank(perm)) {
                String[] split = perm.split(",");
                List<String> perms = Arrays.asList(split);
                if(perms.contains("4")) {   //EQR Leader
                    newPeoples.add(person);
                }
            }
        }
        return newPeoples;
    }
}
