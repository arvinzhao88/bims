<%--
  pad主页
  Date: 2019/6/17
  Time: 11:10
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/view/pad/common/base.jsp" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="utf-8" content="width=device-width, initial-scale=0.87, maximum-scale=0.87, user-scalable=0" name="viewport" />
    <title>${sysName}</title>
    <%--<link rel="stylesheet" href="${resPath}/view/pad/css/css.css" />--%>
    <%@include file="/view/pad/common/global_css.jsp"%>
</head>
<body style="background-image:url(${resPath}/view/pad/images/beijing.jpg);background-size:cover;">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td height="100"><img src="${resPath}/view/pad/images/logo.png" width="160" height="35" align="right" style="margin-right:50px;"></td>
  </tr>
    <tr>
        <td height="400" align="right"><table border="0" cellpadding="0" cellspacing="0" bgcolor="#435255">
            <tr>
                <td width="80" height="90"><img src="${resPath}/view/pad/images/ti_tou.png" width="60" height="76" /></td>
                <td width="400" class="name">BIMS 问题管理系统（V1.0）<br><font style="font-size:20px;">BFCEC ISSUE MANAGEMENT SYSTEM</font></td>
            </tr>
        </table></td>
  </tr>
    <tr>
        <td height="200">&nbsp;</td>
  </tr>
    <tr>
        <td height="100" align="center" background="${resPath}/view/pad/images/di_hei.png">
            <div style="float:left">
            <c:if test="${fn:contains(wx_person_info.belongArea, '2')}">
            <div class="butt" onClick="javascript:location.href='${webPath}/pad/issue/m','_self'"><font style="font-size:16px">机加</font><br>问题提交</div>
            </c:if>
            </div>
            <c:if test="${fn:contains(wx_person_info.belongArea, '1')}">
            <div class="butt" onClick="javascript:location.href='${webPath}/pad/issue/t','_self'"><font style="font-size:16px">T 区</font><br>问题提交</div>
            </c:if>
            <c:if test="${fn:contains(wx_person_info.belongArea, '8')}">
           <div class="butt" onClick="javascript:location.href='${webPath}/pad/issue/a','_self'"><font style="font-size:16px">APU&终检</font><br>问题提交</div>
            </c:if>
          
        </td>
    </tr>
    <tr>
        <td height="80" align="center" style="font-size:12px; font-weight:normal;">北京福田康明斯发动机有限公司 版权所有</td>
    </tr>
</table>
</body>
</html>