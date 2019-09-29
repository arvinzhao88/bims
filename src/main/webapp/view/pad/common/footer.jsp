<%--
  Created by IntelliJ IDEA.
  User: shangpinyuan03
  Date: 2019/7/10
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<footer>
    <div style="float:left;width:37%;" align="center">
        <div id="div_submit" class="ppt1">问题提交</div>
    </div>
    <div style="margin-top:7px;width:26%;float:left;" align="center">
        <div class="butt" onclick="javascript:location.href='${webPath}/pad/issue/index','_self'">
            <font style="font-size:18px"><label id="label_area">APU&终检 </label></font><br><label
                id="label_option">问题提交</label>
        </div>
    </div>
    <div style="float:right;width:37%;" align="center">
        <div id="div_list" class="ppt1">提交列表</div>
    </div>
</footer>
