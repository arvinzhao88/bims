package com.cummins.receipt.controller;

import com.cummins.receipt.model.TagstobeProcessed;
import com.cummins.receipt.service.TagstprocessedService;
import com.cummins.util.DateUtil2;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: bims
 * @description: 待处理标签
 * @author: wdxu
 * @create: 2019-06-17 10:32
 */
@Controller
@RequestMapping("Tagstprocessed")
public class TagstprocessedController {
  @Autowired TagstprocessedService tagstprocessedService;

  /**
   * @program: bims
   * @description: 页面跳转/填充待处理标签页面
   * @author: wdxu
   * @create: 2019-06-17 15:52
   */
  @RequestMapping("jumpPendingForm/{tagId}")
  public String jumpPendingForm(@PathVariable("tagId") Integer tagId, Model model) {
    TagstobeProcessed tagstobeProcessed = tagstprocessedService.queryPendingTags(tagId);
    model.addAttribute("tagstobeProcessed", tagstobeProcessed);
    DateUtil2 dateUtil2 =new DateUtil2();
    model.addAttribute("createtime", dateUtil2.DateToString(tagstobeProcessed.getCreatetime()));
    return "receipt/dclbq";
  }
  /**
   * @program: bims
   * @description: 删除待处理品单
   * @author: wdxu
   * @create: 2019-06-17 17:22
   */
  @RequestMapping("deletePendingOrder/{tagId}")
  @ResponseBody
  public JsonResult deletePendingOrder(@PathVariable("tagId") Integer tagId) {
    tagstprocessedService.deletePendingOrder(tagId);
    return JsonResult.success("删除成功");
  }
}
