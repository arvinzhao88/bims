<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>
<%@include file="/view/static/common/core_js.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Nonconforming Containment Form 不合格品遏制单</title>
    <%--<link rel="stylesheet" type="text/css" media="screen" href="${resPath}/view/receipt/css/css.css" />
    <link rel="stylesheet" type="text/css" media="print" href="${resPath}/view/receipt/css/print_a4_1.css" />--%>
    <%@include file="/view/static/common/bill_global_css.jsp"%>
</head>
<body>
<!--startprint-->
<form id="form1" name="form1" method="post">
<table border="0" align="center" cellpadding="0" cellspacing="2" class="tab">
    <input type="hidden" name="id" value="${nonconfigContainment.id}">
    <tr>
        <td style="border-bottom:#000000 2px dashed;">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="25%"><img src="${resPath}/view/receipt/images/biao_logo.png" align="absmiddle"  class="logo"/></td>
                    <td width="75%" align="right"><font class="biao">Nonconforming Containment Form<br />不合格品遏制单</font></td>
                </tr>
            </table></td>
    </tr>
</table>
<table border="0" align="center" cellpadding="0" cellspacing="2" class="tab">
    <tr>
        <td width="14%">Part No.<br />
            零件号：</td>
        <td width="10%"><input type="text" name="partNo" class="input_0" disabled="disabled"  value="${nonconfigContainment.partNo}"/></td>
        <td width="10%">Description<br />
            名称：</td>
        <td width="16%"><input type="text" name="description" class="input_0" disabled="disabled"  value="${nonconfigContainment.description}"/></td>
        <td width="20%">Customer/supplier name<br />
            客户/供应商名称：</td>
        <td width="30%"><input type="text" name="customerSupplier" class="input_0" disabled="disabled"  value="${nonconfigContainment.customerSupplier}"/></td>
    </tr>
    <tr>
        <td>Issue Description<br />
            问题描述：</td>
        <td colspan="5"><textarea name="issueDescription" rows="2" style="width:98%;border:0;border-bottom:1px solid #000;background:#fff; line-height:18px;"  disabled="disabled"  placeholder="">${nonconfigContainment.issueDescription}</textarea></td>
    </tr>
    <tr>
        <td>Spec<br>标准或要求：</td>
        <td colspan="4"><input type="text" name="spec" class="input_0"  disabled="disabled" value="${nonconfigContainment.spec}"/></td>
        <td>是否需要WI：
            <input type="radio" name="wi" value="1"  disabled="disabled"  class="input" <c:if test="${fn:contains(nonconfigContainment.wi,1)}">checked="checked"</c:if> />
            是YES&nbsp;
            <input type="radio" name="wi" value="2" disabled="disabled"  class="input" <c:if test="${fn:contains(nonconfigContainment.wi,2)}">checked="checked"</c:if> />
            否NO</td>
    </tr>
</table>

<table border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000" class="tab">
    <tr>
        <td width="26%" align="center"><strong>Location<br />
            区域</strong></td>
        <td width="8%" align="center"><strong>qtty<br />
            总数量</strong></td>
        <td width="12%" align="center"><strong>screened qtty<br />
            挑选数量</strong></td>
        <td width="10%" align="center"><strong>NOK qtty<br />
            不合格数</strong></td>
        <td width="13%" align="center"><strong>Response <br />
            负责人</strong></td>
        <td width="13%" align="center"><strong>Verifier<br />
            确认人</strong></td>
        <td width="18%" align="center"><strong>Completion Date<br />
            完成日期</strong></td>
    </tr>
    <tr>
        <td height="20" colspan="7" align="center">&nbsp;<strong>At Customers' Premises 客户区域（此处IQC不适用）</strong></td>
    </tr>
    <%--如果客户区域无数据--%>
    <c:if test="${empty customerArea}">
        <tr>
            <td align="center">Engine In OEM stock<br />
                客户库存发动机<input type="hidden" name="location" class="input_f"  value="1"/> </td>

            <td width="8%" align="center"><input type="text" disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text" disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text" disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Engine in OEM process<br />
                客户生产过程中的发动机<input type="hidden" disabled="disabled"  name="location" class="input_f"  value="2"/> </td></td>
            <td width="8%" align="center"><input type="text" disabled="disabled"   name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text" disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"disabled="disabled"  name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Engine in OEM EOL Stock<br />
                客户成品库的发动机<input type="hidden" name="location" disabled="disabled"  class="input_f"  value="3"/> </td>
            <td width="8%" align="center"><input type="text"  disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text" disabled="disabled"  name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text" disabled="disabled"  name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"disabled="disabled"  name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Engine on Vehicle out of OEM<br />
                随车出厂的发动机<input type="hidden" name="location" disabled="disabled"  class="input_f"  value="4"/></td>
            <td width="8%" align="center"><input type="text" disabled="disabled"  name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text" disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled"   name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text" disabled="disabled"  name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Others 其他 <input type="hidden" disabled="disabled"  name="location" class="input_f"  value="5"/></td>
            <td width="8%" align="center"><input type="text"  disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text" disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled"  name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text" disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>

    </c:if>
    <%--如果客户区域有数据 数据回显--%>
    <c:if test="${!empty customerArea}">
        <c:forEach items="${customerArea}" var="customer">
    <tr>
        <c:if test="${customer.location=='1'}">
            <td align="center">Engine In OEM stock<br />客户库存发动机<input type="hidden"  disabled="disabled" name="location" class="input_f"  value="1"/></td>
        </c:if>
        <c:if test="${customer.location=='2'}">
            <td align="center">Engine in OEM process<br />客户生产过程中的发动机<input type="hidden" disabled="disabled"  name="location" class="input_f"  value="2"/></td>
        </c:if>
        <c:if test="${customer.location=='3'}">
            <td align="center">Engine in OEM EOL Stock<br />客户成品库的发动机<input type="hidden"disabled="disabled"  name="location" class="input_f"  value="3"/> </td>
        </c:if>
        <c:if test="${customer.location=='4'}">
            <td align="center">Engine on Vehicle out of OEM<br />随车出厂的发动机<input type="hidden" disabled="disabled"  name="location" class="input_f"  value="4"/></td>
        </c:if>
        <c:if test="${customer.location=='5'}">
            <td align="center">Others 其他 <input type="hidden" name="location" class="input_f" disabled="disabled"   value="5"/></td>
        </c:if>
            <td width="8%" align="center"><input type="text"  disabled="disabled" name="qtty" class="input_f"  value="${customer.qtty}"/></td>
            <td width="12%" align="center"><input type="text" disabled="disabled" name="screendQtty" class="input_f"  value="${customer.screendQtty}"/></td>
            <td width="10%" align="center"><input type="text" disabled="disabled" name="nokQtty" class="input_f"  value="${customer.nokQtty}"/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="response" class="input_f"  value="${customer.response}"/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="verifier" class="input_f"  value="${customer.verifier}"/></td>
            <td width="18%" align="center"><input type="text" disabled="disabled" name="completionDate" class="input_f"  value="${customer.completionDate}"/></td>
    </tr>
        </c:forEach>
    </c:if>

</table>

<table border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000" class="tab">
    <tr>
        <td height="20" colspan="7" align="center">&nbsp;<strong>In BFCEC  BFCEC 区域</strong></td>
    </tr>
    <%--如果In BFCEC  BFCEC 区域区域无数据--%>
    <c:if test="${empty bfcec}">
        <tr>
            <td width="26%" align="center">Inventory Parts<br />
                库存零件 <input type="hidden" name="location"  disabled="disabled" class="input_f"  value="6"/></td>
            <td width="8%" align="center"><input type="text" disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text" disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text" disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text" disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Pending storage<br />
                待入库(HOLD库 外检待入）<input type="hidden"disabled="disabled"  name="location" class="input_f"  value="7"/></td>
            <td width="8%" align="center"><input type="text"  disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text" disabled="disabled"  name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text" disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text" disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">In inspection Part<br />在检零件 <input type="hidden"  disabled="disabled" name="location" class="input_f"  value="8"/></td>
            <td width="8%" align="center"><input type="text" name="qtty"   disabled="disabled" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text" disabled="disabled"  name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled"  name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled"  name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Line Side stock Parts<br />线边库零件 <input type="hidden"  disabled="disabled"  name="location" class="input_f"  value="9"/></td>
            <td width="8%" align="center"><input type="text"  disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Machining on line<br />在制品 <input type="hidden"  disabled="disabled" name="location" class="input_f"  value="10"/></td>
            <td width="8%" align="center"><input type="text"   disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Finish Machining<br />机加成品 <input type="hidden"  disabled="disabled"  name="location" class="input_f"  value="11"/></td>
            <td width="8%" align="center"><input type="text" disabled="disabled"  name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled"  name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text" disabled="disabled"  name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">APU engines<br />在制发动机 <input type="hidden"  disabled="disabled" name="location" class="input_f"  value="12"/></td>
            <td width="8%" align="center"><input type="text"   disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled"   name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled"  name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Test engines<br />测试发动机 <input type="hidden"   disabled="disabled" name="location" class="input_f"  value="13"/></td>
            <td width="8%" align="center"><input type="text"  disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Rework engines<br />返修发动机 <input type="hidden" disabled="disabled"  name="location" class="input_f"  value="14"/></td>
            <td width="8%" align="center"><input type="text" disabled="disabled"  name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled"  name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">EOL engines<br />成品发动机 <input type="hidden"  disabled="disabled"  name="location" class="input_f"  value="15"/></td>
            <td width="8%" align="center"><input type="text"  disabled="disabled"  name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"   disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled"  name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Line Side Engine Stock<br />生产现场的存货 <input  disabled="disabled"  type="hidden" name="location" class="input_f"  value="16"/></td>
            <td width="8%" align="center"><input type="text"  disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled"  name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text" disabled="disabled"  name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Engine in Qualified Warehouses<br />合格品库 <input type="hidden"  disabled="disabled"  name="location" class="input_f"  value="17"/></td>
            <td width="8%" align="center"><input type="text"  disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text" disabled="disabled"  name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text" disabled="disabled"  name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Engine in Third Party Stock<br />三方库发动机<input   disabled="disabled" type="hidden" name="location" class="input_f"  value="18"/></td>
            <td width="8%" align="center"><input type="text"  disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Engine In BFCEC stock<br />成品库 <input type="hidden"  disabled="disabled"  name="location" class="input_f"  value="19"/></td>
            <td width="8%" align="center"><input type="text"   disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"   disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"   disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"   disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"   disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">In transportation to customer<br />运输给客户的产品 <input type="hidden"  disabled="disabled"  name="location" class="input_f"  value="20"/></td>
            <td width="8%" align="center"><input type="text"  disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"   disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Others<br />其他（备件库、排序区）<input type="hidden"  disabled="disabled"  name="location" class="input_f"  value="21"/></td>
            <td width="8%" align="center"><input type="text"   disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled"  name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled"  name="completionDate" class="input_f"  value=""/></td>
        </tr>

    </c:if>
    <%--如果In BFCEC  BFCEC 区域有数据--%>
   <c:if test="${!empty bfcec}">
        <c:forEach items="${bfcec}" var="bfce">
        <tr>
            <c:if test="${bfce.location=='6'}">
            <td width="26%" align="center">Inventory Parts<br />库存零件 <input type="hidden" name="location" class="input_f"  value="6"/></td>
            </c:if>
            <c:if test="${bfce.location=='7'}">
                <td align="center">Pending storage<br />待入库(HOLD库 外检待入）<input type="hidden" name="location" class="input_f"  value="7"/></td>
            </c:if>
            <c:if test="${bfce.location=='8'}">
                <td align="center">In inspection Part<br />在检零件 <input type="hidden" name="location" class="input_f"  value="8"/></td>
            </c:if>
            <c:if test="${bfce.location=='9'}">
                <td align="center">Line Side stock Parts<br />线边库零件 <input type="hidden" name="location" class="input_f"  value="9"/></td>
            </c:if>
            <c:if test="${bfce.location=='10'}">
                <td align="center">Machining on line<br />在制品 <input type="hidden" name="location" class="input_f"  value="10"/></td>
            </c:if>
            <c:if test="${bfce.location=='11'}">
                <td align="center">Finish Machining<br />机加成品 <input type="hidden" name="location" class="input_f"  value="11"/></td>
            </c:if>
            <c:if test="${bfce.location=='12'}">
                <td align="center">APU engines<br />在制发动机 <input type="hidden" name="location" class="input_f"  value="12"/></td>
            </c:if>
            <c:if test="${bfce.location=='13'}">
                <td align="center">Test engines<br />测试发动机 <input type="hidden" name="location" class="input_f"  value="13"/></td>
            </c:if>
            <c:if test="${bfce.location=='14'}">
                <td align="center">Rework engines<br />返修发动机 <input type="hidden" name="location" class="input_f"  value="14"/></td>
            </c:if>
            <c:if test="${bfce.location=='15'}">
                <td align="center">EOL engines<br />成品发动机 <input type="hidden" name="location" class="input_f"  value="15"/></td>
            </c:if>
            <c:if test="${bfce.location=='16'}">
                <td align="center">Line Side Engine Stock<br />生产现场的存货 <input type="hidden" name="location" class="input_f"  value="16"/></td>
            </c:if>
            <c:if test="${bfce.location=='17'}">
                <td align="center">Engine in Qualified Warehouses<br />合格品库 <input type="hidden" name="location" class="input_f"  value="17"/></td>
            </c:if>
            <c:if test="${bfce.location=='18'}">
                <td align="center">Engine in Third Party Stock<br />三方库发动机<input type="hidden" name="location" class="input_f"  value="18"/></td>
            </c:if>
            <c:if test="${bfce.location=='19'}">
                <td align="center">Engine In BFCEC stock<br />成品库 <input type="hidden" name="location" class="input_f"  value="19"/></td>
            </c:if>
            <c:if test="${bfce.location=='20'}">
                <td align="center">In transportation to customer<br />运输给客户的产品 <input type="hidden" name="location" class="input_f"  value="20"/></td>
            </c:if>
            <c:if test="${bfce.location=='21'}">
                <td align="center">Others<br />其他（备件库、排序区）<input type="hidden" name="location" class="input_f"  value="21"/></td>
            </c:if>

            <td width="8%" align="center"><input type="text" name="qtty"   disabled="disabled" class="input_f"  value="${bfce.qtty}"/></td>
            <td width="12%" align="center"><input type="text" name="screendQtty"  disabled="disabled" class="input_f"  value="${bfce.screendQtty}"/></td>
            <td width="10%" align="center"><input type="text" name="nokQtty"  disabled="disabled" class="input_f"  value="${bfce.nokQtty}"/></td>
            <td width="13%" align="center"><input type="text" name="response"  disabled="disabled"  class="input_f"  value="${bfce.response}"/></td>
            <td width="13%" align="center"><input type="text" name="verifier"  disabled="disabled"  class="input_f"  value="${bfce.verifier}"/></td>
            <td width="18%" align="center"><input type="text" name="completionDate"  disabled="disabled"  class="input_f"  value="${bfce.completionDate}"/></td>
        </tr>
        </c:forEach>
    </c:if>

</table>

<table border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000" class="tab">
    <tr>
        <td height="25" colspan="7" align="center">&nbsp;<strong>At Supplier's Premises 供应商区域</strong></td>
    </tr>
    <%--如果At Supplier's Premises 供应商区域 无数据--%>
    <c:if test="${empty supplierArea}">
        <tr>
            <td width="26%" align="center">In stock<br />成品库 <input type="hidden" name="location" class="input_f"  value="22"/></td>
            <td width="8%" align="center"><input type="text" disabled="disabled"  name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled"  name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled"  name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"   disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"   disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"   disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">In process<br />生产过程中的产品 <input type="hidden" name="location" class="input_f"  value="23"/></td>
            <td width="8%" align="center"><input type="text"   disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled"  name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"   disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled"  name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"   disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">In transportation to BFCEC<br />在途的产品 <input type="hidden" name="location" class="input_f"  value="24"/></td>
            <td width="8%" align="center"><input type="text"  disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text" disabled="disabled"  name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Supplier external Stock<br />供应商外库 <input type="hidden" name="location" class="input_f"  value="25"/></td>
            <td width="8%" align="center"><input type="text"   disabled="disabled" name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>
        <tr>
            <td align="center">Others 其他 <input type="hidden" name="location" class="input_f"  value="26"/></td>
            <td width="8%" align="center"><input type="text"  disabled="disabled"  name="qtty" class="input_f"  value=""/></td>
            <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value=""/></td>
            <td width="10%" align="center"><input type="text"  disabled="disabled" name="nokQtty" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="response" class="input_f"  value=""/></td>
            <td width="13%" align="center"><input type="text"  disabled="disabled" name="verifier" class="input_f"  value=""/></td>
            <td width="18%" align="center"><input type="text"  disabled="disabled" name="completionDate" class="input_f"  value=""/></td>
        </tr>

    </c:if>

    <c:if test="${!empty supplierArea}">
        <c:forEach items="${supplierArea}" var="supp">
            <tr>
                <c:if test="${supp.location=='22'}">
                    <td width="26%" align="center">In stock<br />成品库 <input type="hidden" name="location" class="input_f"  value="22"/></td>
                </c:if>
                <c:if test="${supp.location=='23'}">
                    <td align="center">In process<br />生产过程中的产品 <input type="hidden" name="location" class="input_f"  value="23"/></td>
                </c:if>
                <c:if test="${supp.location=='24'}">
                    <td align="center">In transportation to BFCEC<br />在途的产品 <input type="hidden" name="location" class="input_f"  value="24"/></td>
                </c:if>
                <c:if test="${supp.location=='25'}">
                    <td align="center">Supplier external Stock<br />供应商外库 <input type="hidden" name="location" class="input_f"  value="25"/></td>
                </c:if>
                <c:if test="${supp.location=='26'}">
                    <td align="center">Others 其他 <input type="hidden" name="location" class="input_f"  value="26"/></td>
                </c:if>

                <td width="8%" align="center"><input type="text"   disabled="disabled" name="qtty" class="input_f"  value="${supp.qtty}"/></td>
                <td width="12%" align="center"><input type="text"  disabled="disabled" name="screendQtty" class="input_f"  value="${supp.screendQtty}"/></td>
                <td width="10%" align="center"><input type="text"   disabled="disabled" name="nokQtty" class="input_f"  value="${supp.nokQtty}"/></td>
                <td width="13%" align="center"><input type="text"   disabled="disabled" name="response" class="input_f"  value="${supp.response}"/></td>
                <td width="13%" align="center"><input type="text"  disabled="disabled"  name="verifier" class="input_f"  value="${supp.verifier}"/></td>
                <td width="18%" align="center"><input type="text"   disabled="disabled" name="completionDate" class="input_f"  value="${supp.completionDate}"/></td>
            </tr>

        </c:forEach>
    </c:if>

</table>

</form>
<!--endprint-->
<br>
<table width="650" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td height="50" align="center" bgcolor="#F6F6F6"><input type="button" name="print2" value="预览打印(A4)" onclick="preview()" /></td>
    </tr>
</table>
<%--<link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>--%>
<script language="javascript">


    function preview() {
        bdhtml=window.document.body.innerHTML;
        sprnstr="<!--startprint-->";
        eprnstr="<!--endprint-->";
        prnhtml=bdhtml.substr(bdhtml.indexOf(sprnstr)+17);
        prnhtml=prnhtml.substring(0,prnhtml.indexOf(eprnstr));
        window.document.body.innerHTML=prnhtml;
        window.print();
    }
</script>
</body>
</html>