<%--
  Created by IntelliJ IDEA.
  User: shangpinyuan03
  Date: 2019/6/25
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <table width="100%" border="0" cellpadding="0" cellspacing="0" background="${resPath}/view/pad/images/di_hei.png">
        <tr>
            <td height="80" align="center"><img src="${resPath}/view/pad/images/logo.png" width="160" height="35"></td>
        </tr>
        <tr>
            <td height="50" align="center">
                <div class="butt">
				<font style="font-size:18px"><label id="label_area">APU&终检 </label></font><br><label id="label_option">问题提交</label>
                </div>
            </td>
        </tr>
        <tr>
            <td height="225" align="center">
                <div id="div_submit" class="ppt1">问题提交</div><br>
                <div id="div_list" class="ppt1">提交列表</div>
            </td>
        </tr>
        <tr>
            <td height="50" align="center" style="font-size:12px; font-weight:normal;">
                录入人：${wx_person_info.name}（${wx_person_info.account}）
            </td>
        </tr>
        <tr>
            <td height="110" align="center" valign="top" style="font-size:10px; font-weight:normal;">
                <div class="home" onclick="javascript:location.href='${webPath}/pad/issue/index','_self'"></div><br><br>
                北京福田康明斯发动机有限公司<br>
                版权所有
            </td>
        </tr>
    </table>