package com.cummins.receipt.dao;

import com.cummins.receipt.model.DocumentsToBeProcesses;
import com.cummins.receipt.model.DocumentsToBeProcessesCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentsToBeProcessesMapper {
    long countByExample(DocumentsToBeProcessesCriteria example);

    int deleteByExample(DocumentsToBeProcessesCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DocumentsToBeProcesses record);

    int insertSelective(DocumentsToBeProcesses record);

    List<DocumentsToBeProcesses> selectByExample(DocumentsToBeProcessesCriteria example);

    DocumentsToBeProcesses selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DocumentsToBeProcesses record, @Param("example") DocumentsToBeProcessesCriteria example);

    int updateByExample(@Param("record") DocumentsToBeProcesses record, @Param("example") DocumentsToBeProcessesCriteria example);

    int updateByPrimaryKeySelective(DocumentsToBeProcesses record);

    int updateByPrimaryKey(DocumentsToBeProcesses record);

    DocumentsToBeProcesses selectByPrimaryKeyOnlySubmit(Integer id);
}