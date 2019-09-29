package com.cummins.permission.service;

import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.github.pagehelper.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author : wdxu
 * @Date :11:42 2019/7/3
 * @Description:
 */
public interface PermissionService {
    /**
     * @Author : wdxu
     * @Date :11:45 2019/7/3
     * @Description: 添加用户
     */
    void addUser(BimsPerson bimsPerson);

    /**
     * @Author : wdxu
     * @Date :12:10 2019/7/3
     * @Description: 根据用户accounnt 查询用户
     */
    String queryAccordingToUserAccount(String account);


    /**
    * @Author : wdxu
    * @Date :9:38 2019/7/16
    * @Description: 根据用户loginname查询
    */
    String queryLoginName(String account);
    /**
     * @Author : wdxu
     * @Date :15:13 2019/7/3
     * @Description: 获取用户分页数据
     */
    Page<BimsPerson> getList(SearchParam search);

    /**
     * @Author : wdxu
     * @Date :16:11 2019/7/3
     * @Description: 根据id移除数据
     */
    void deleteUserById(Integer id);

    /**
     * @Author : wdxu
     * @Date :16:35 2019/7/3
     * @Description: 查询数据
     */
    BimsPerson findUserById(Integer id);

    /**
     * @Author : wdxu
     * @Date :17:04 2019/7/3
     * @Description: 更新用户
     */
    void updateUserById(BimsPerson bimsPerson);

    /**
    * @Author : wdxu
    * @Date :9:42 2019/7/4
    * @Description: 用户名 密码 校验
    */

    BimsPerson check(BimsPerson bimsPerson);

    /**
     * 通过工号查询用户
     * @Author qx
     * @param acc 工号
     * @return 用户对象
     */
    BimsPerson getPersonByAcc(String acc);


    /**
    * @Author : wdxu
    * @Date :11:12 2019/7/24
    * @Description: 批量导入用户
    */
    Integer fileUpload(MultipartFile file);

    /**
     * 通过角色查询用户列表
     * @param role
     * @return
     */
    List<BimsPerson> getPersonListByRole(String role, String account);

    /**
     * @Author : wdxu
     * @Date :17:04 2019/7/3
     * @Description: 修改密码
     */
    Integer updateUserByAccount(BimsPerson bimsPerson);

    /**
     * 查询所有有效用户列表
     * @return
     */
    List<BimsPerson> getAllBimsPersonList();

    /**
     * 通过工号批量更新用户
     * @param bimsPersonList
     * @return
     */
    int updateListByAccount(List<BimsPerson> bimsPersonList);

    /**
     * 批量添加用户
     * @param bimsPersonList
     * @return
     */
    int insertList(List<BimsPerson> bimsPersonList);

    /**
     * 通过id批量删除用户
     * @param bimsPersonList
     * @return
     */
    int deleteListById(List<BimsPerson> bimsPersonList);

    /**
     * 根据区域查询所有质量工程师
     * @param zone
     * @return
     */
    List<BimsPerson> getAllQeByZone(String zone);

    /**
     * restPwd 重置密码
     */
    Integer restPwd(BimsPerson bimsPerson);
}
