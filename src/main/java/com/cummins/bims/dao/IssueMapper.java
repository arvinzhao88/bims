package com.cummins.bims.dao;

import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.IssueCriteria;
import java.util.List;
import java.util.Map;

import com.cummins.bims.dto.IssueParam;
import com.cummins.model.SearchParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueMapper {
    long countByExample(IssueCriteria example);

    int deleteByExample(IssueCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Issue record);

    int insertSelective(Issue record);

    List<Issue> selectByExample(IssueCriteria example);

    List<Issue> selectByPage(@Param("map") Map<String, Object> map);

    Issue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Issue record, @Param("example") IssueCriteria example);

    int updateByExample(@Param("record") Issue record, @Param("example") IssueCriteria example);

    int updateByPrimaryKeySelective(Issue record);

    int updateByPrimaryKey(Issue record);

    Map<String,Object> selectById(Integer id);

    String selectMaxSn(@Param("number") String number);

    List<IssueParam> getList(@Param("searchParam") SearchParam searchParam);

    List<Map> getIssueAmount(@Param("searchParam") SearchParam searchParam);

    List<Map> getMyDeskAmount(@Param("issueParam") IssueParam issueParam);

    Integer selectbyrole(@Param("map") Map<String, String> map);

    /**
     * 工作台列表查询
     * @param map
     * @return
     */
    List<IssueParam> getIssueListByStatus(@Param("map") Map<String, Object> map);

    /**
     * 分区查询列表
     * @param param
     * @return
     */
    List<IssueParam> getIssueListByArea(@Param("param") SearchParam param);

    /**
     * 待处理标签问题查询
     * @param id
     * @return
     */
    Issue getIssueById(@Param("id") Integer id);
}