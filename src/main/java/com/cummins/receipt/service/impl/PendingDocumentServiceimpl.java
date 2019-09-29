package com.cummins.receipt.service.impl;

import com.cummins.receipt.dao.DocumentsToBeProcessesMapper;
import com.cummins.receipt.model.DocumentsToBeProcesses;
import com.cummins.receipt.service.PendingDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * /**
 *
 * @program: bims
 * @description: 待处理品单据逻辑
 * @author: wdxu
 * @create: 2019-06-18 09:28
 */
@Service
public class PendingDocumentServiceimpl implements PendingDocumentService {
  @Autowired DocumentsToBeProcessesMapper documentsToBeProcessesMapper;

  /**
   * @param id
   * @return 查询待处理品单据
   */
  @Override
  public DocumentsToBeProcesses queryPendingDocuments(Integer id) {
    return documentsToBeProcessesMapper.selectByPrimaryKey(id);
  }
  /**
   * @param
   * @return 更新待处理品单据
   */
  @Override
  public void updatePendingDocuments(DocumentsToBeProcesses documentsToBeProcesses) {
    documentsToBeProcessesMapper.updateByPrimaryKeySelective(documentsToBeProcesses);
  }

  /**
   * @param
   * @return 删除待处理品单据
   */
  @Override
  public void deletePendingDocuments(Integer tagId){
    documentsToBeProcessesMapper.deleteByPrimaryKey(tagId);
  }
  /**
   * @param
   * @return 查询已经提交的数据
   */
  @Override
  public  DocumentsToBeProcesses queryOnlySubmit(Integer id){
    return documentsToBeProcessesMapper.selectByPrimaryKeyOnlySubmit(id);
  }
}
