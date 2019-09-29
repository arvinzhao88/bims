package com.cummins.bims.service.impl;

import com.cummins.bims.service.PersonService;
import com.cummins.contact.dao.PersonMapper;
import com.cummins.contact.dto.Person;
import com.cummins.contact.dto.PersonCriteria;
import com.cummins.permission.service.PermissionService;
import com.cummins.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person getPerson(String account) {
        PersonCriteria example = new PersonCriteria();
        PersonCriteria.Criteria query = example.createCriteria();
        if(StringUtil.isNotBlank(account)) {
            query.andAccountEqualTo(account);
        }
        query.andDeletedEqualTo(false);
        query.andFiredEqualTo(false);
        List<Person> peoples = personMapper.selectByExample(example);
        return peoples.get(0);
    }
}
