package com.cummins.receipt.service.impl;

import com.cummins.receipt.dao.TagstobeProcessedMapper;
import com.cummins.receipt.model.TagstobeProcessed;
import com.cummins.receipt.service.TagstprocessedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: bims
 * @description: 待处理标签
 * @author: wdxu
 * @create: 2019-06-17 11:14
 */
@Service
public class TagstprocessedServiceimpl implements TagstprocessedService {
  @Autowired TagstobeProcessedMapper tagstobeProcessedMapper;
  /**
   * @param id
   * @return 查询待处理标签
   */
  @Override
  public TagstobeProcessed queryPendingTags(Integer id) {
    return tagstobeProcessedMapper.selectByPrimaryKey(id);
  }

  /**
   * @param id
   * @return 删除待处理标签
   */
  @Override
  public void deletePendingOrder(Integer id) {
    tagstobeProcessedMapper.deleteByPrimaryKey(id);
  }
}
