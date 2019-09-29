package com.cummins.receipt.service;

import com.cummins.receipt.model.TagstobeProcessed;

import java.util.List;

/**
 * @program: bims
 * @description: 待处理标签
 * @author: wdxu
 * @create: 2019-06-17 15:52
 */
public interface TagstprocessedService {
  /**
   * 查询待处理标签
   *
   * @param id
   * @return
   */
   TagstobeProcessed queryPendingTags(Integer id);
  /**
   * 删除待处理标签
   *
   * @param tagId
   * @return
   */
  void deletePendingOrder(Integer tagId);

}
