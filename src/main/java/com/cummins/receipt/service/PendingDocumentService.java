package com.cummins.receipt.service;

import com.cummins.receipt.model.DocumentsToBeProcesses;

/** @创建人 wdxu @创建时间 20190618 @描述 */
public interface PendingDocumentService {
  /**
   * @param id
   * @return 查询待处理品单据
   */
  DocumentsToBeProcesses queryPendingDocuments(Integer id);
  /**
   * @param
   * @return 更新待处理品单据(date;;createtime2除外)
   */
  void updatePendingDocuments(DocumentsToBeProcesses documentsToBeProcesses);

  /**
   * @param
   * @return 删除待处理品单据
   */
  void deletePendingDocuments(Integer tagId);

  /**
   * @param
   * @return 查询已经提交的数据
   */
  DocumentsToBeProcesses queryOnlySubmit(Integer id);
}
