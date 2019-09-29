<%--
  Created by IntelliJ IDEA.
  User: shangpinyuan03
  Date: 2019/7/10
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
    <div style="float:left;width:30%" align="left">
        <img src="${resPath}/view/pad/images/logo.png" width="160" height="35" style="margin:12px 0 0 15px;">
    </div>
    <div style="margin-top:17px;width:40%;float:left; text-align:right;">
        录入人：${wx_person_info.name}（${wx_person_info.account}）
    </div>
    <div style="width:30%;float:right;margin-top:5px;">
        <div class="home" onclick="javascript:location.href='${webPath}/pad/issue/index','_self'"></div>
    </div>
</header>
