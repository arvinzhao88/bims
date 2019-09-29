package com.cummins.permission.service.impl;

import com.cummins.bims.service.SendEmailService;
import com.cummins.contact.dao.PersonMapper;
import com.cummins.contact.dto.Person;
import com.cummins.contact.dto.PersonCriteria;
import com.cummins.permission.model.BimsPerson;
import com.cummins.permission.service.PermissionService;
import com.cummins.util.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 同步person表数据导bimsperson
 * @author qx
 */
@Component
@Configuration
@EnableScheduling
public class PersonSyncTask {
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private PermissionService bimsPersonService;
    @Autowired
    private SendEmailService emailService;

    /**
     * 用户同步，每天凌晨1点同步
     */
    @Scheduled(cron = "0 0 1 * * ?")
    private void sync() {
        long start = System.currentTimeMillis(); // 开始时间戳
        // 查询person表
        PersonCriteria personCriteria = new PersonCriteria();
        PersonCriteria.Criteria criteria = personCriteria.createCriteria();
        criteria.andFiredEqualTo(false); // 未离职
        criteria.andDeletedEqualTo(false); // 未删除
        criteria.andAccountIsNotNull(); // 工号不为空
        List<Person> personList = personMapper.selectByExample(personCriteria);
        // 查询bimsperson表
        List<BimsPerson> bimsPersonList = bimsPersonService.getAllBimsPersonList();
        List<BimsPerson> updateList = new ArrayList<>(); // 更新数据
        List<BimsPerson> insertList = new ArrayList<>(); // 插入数据
        Iterator<Person> iter = personList.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            BimsPerson bimsPerson = new BimsPerson();
            bimsPerson.setAccount(person.getAccount()); // 工号
            bimsPerson.setName(person.getName()); // 姓名
            bimsPerson.setMobile(person.getMobile()); // 手机号
            bimsPerson.setEmail(person.getEmail()); // 邮箱
            bimsPerson.setUpdateTime(new Date()); // 更新时间

            if (bimsPersonList.contains(bimsPerson)) { // 如果用户存在，更新
                updateList.add(bimsPerson);
            } else { // 如果用户不存在，新增
                bimsPerson.setLoginName(person.getAccount()); // 登录名
                bimsPerson.setPassword(Md5Utils.getMD5Str("123456")); // 默认密码
                bimsPerson.setCreateTime(new Date()); // 创建时间
                bimsPerson.setBelongRole("3,6"); // 角色
                bimsPerson.setDeleted(false); // 未删除
                insertList.add(bimsPerson);
            }
        }

        List<BimsPerson> deleteList = new ArrayList<>();
        Iterator<BimsPerson> bimsIter = bimsPersonList.iterator();
        while(bimsIter.hasNext()) {
            BimsPerson bimsPerson = bimsIter.next();
            // 如果用户不在person表中，删除
            if (!personList.contains(bimsPerson) && bimsPerson.getAccount().startsWith("FC")) {
//            if (!personList.contains(bimsPerson) && !"admin".equals(bimsPerson.getLoginName())) {
                bimsPerson.setUpdateTime(new Date());
                bimsPerson.setDeleted(true); // 删除
                deleteList.add(bimsPerson);
            }
        }

        // 插入数据
        int insertCount = 0;
        if (insertList != null && insertList.size() > 0) {
            insertCount = bimsPersonService.insertList(insertList);
        }
        // 更新数据
        int updateCount = 0; // 更新条数
        if (updateList != null && updateList.size() > 0) {
            updateCount = bimsPersonService.updateListByAccount(updateList);
        }
        // 删除数据
        int deleteCount = 0; // 删除条数
        if (deleteList != null && deleteList.size() > 0) {
            deleteCount = bimsPersonService.deleteListById(deleteList);
        }

        System.out.println("用户同步: 新增" + insertCount + "条; 修改" + updateCount + "条; 删除" + deleteCount + "条, " +
                "总耗时: " + (System.currentTimeMillis() - start) );

        /*emailService.sendEmail("CS_Admin@cummins.com", "xuewei.yang@cummins.com;qixioa@qq.com;", "BIMS系统通知",
                "<br><strong>BIMS系统通知</strong><br><br>用户同步：新增"
                + insertCount + "条；修改" + updateCount + "条；删除" + deleteCount + "条， " + "总耗时：" + (System.currentTimeMillis() - start));*/
    }
}
