<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>
<%@include file="/view/static/common/core_js.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Hold Tag 待处理品单</title>
    <%--<link rel="stylesheet" type="text/css" media="print" href="${resPath}/view/receipt/css/print_style.css"/>
    <link rel="stylesheet" type="text/css" media="screen" href="${resPath}/view/receipt/css/css.css"/>--%>
    <%@include file="/view/static/common/bill_global_css.jsp"%>
</head>

<body>
<!--startprint-->
<form id="form1" name="form1" method="post">
    <table border="0" align="center" cellpadding="0" cellspacing="2" class="tab">
        <input type="hidden" name="id" value="${documentsToBeProcesses.id}">
        <tr>
            <td height="50" valign="top" width="calc(100% - 200px)" style=" border-bottom:#000000 2px dashed;">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="25%" rowspan="2"><img src="${resPath}/view/receipt/images/biao_logo.png"
                                                         align="absmiddle" class="logo"/></td>
                        <td width="50%" rowspan="2" align="center"><font class="biao">Hold Tag 待处理品单</font></td>
                        <td width="25%">
                            <input type="radio" name="inPlantCustomers2" value="1" disabled="disabled"
                                   class="input"  <c:if test="${fn:contains(documentsToBeProcesses.inPlantCustomers2,'1')}">checked="checked"
                            </c:if>/> Inner
                            Plant 厂内
                        </td>

                    </tr>
                    <tr>
                        <td>
                                <input type="radio" name="inPlantCustomers2" value="2"  class="input"  disabled="disabled" <c:if test="${fn:contains(documentsToBeProcesses.inPlantCustomers2,'2')}">checked="checked"
                                </c:if>/> Customer
                                客户
                        </td>

                    </tr>
                </table>
            </td>
            <td width="200" rowspan="2">
                <table width="100%" border="1" cellpadding="0" cellspacing="0" bordercolor="#000000"
                       style="border:#000000 1px solid;">
                    <tr>
                        <td width="28%" rowspan="2" align="center" style="line-height:16px;">Data<br/>
                            日期
                        </td>
                        <td width="12%" align="center">Y</td>
                        <td width="12%" align="center">Y</td>
                        <td width="12%" align="center">M</td>
                        <td width="12%" align="center">M</td>
                        <td width="12%" align="center">D</td>
                        <td width="12%" align="center">D</td>
                    </tr>
                    <tr>
                        <td colspan="6" align="center"><input name="createdate" readonly="readonly"
                                                              value="${createtime2}"/></td>
                    </tr>
                    <tr>
                        <td align="center" style="line-height:16px;">No.<br/>
                            编号
                        </td>
                        <td colspan="6" align="center"><input name="number" type="text" class="input_f"
                                                              readonly="readonly"
                                                              value="${documentsToBeProcesses.number}" maxlength="10"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>
                <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td width="9%" style="line-height:18px;">Type<br>机型：</td>
                        <td width="20%"><input type="text" name="type" class="input_0" readonly="readonly"
                                               value="${documentsToBeProcesses.type}"/></td>
                        <td width="18%" style="line-height:18px;">PartNo./ESN<br>零件/发动机号：</td>
                        <td width="20%"><input type="text" name="partsEngineNumber" class="input_0" readonly="readonly"
                                               value="${documentsToBeProcesses.partsEngineNumber}"/></td>
                        <td width="13%" style="line-height:18px;">Quantity<br>数量：</td>
                        <td width="20%"><input type="text" name="quantity" class="input_0" readonly="readonly"
                                               value="${num}"/></td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    <table class="tab" align="center" border="0" cellspacing="2" cellpadding="0">
        <tr>
            <td width="10%" height="30" style="line-height:18px;">Part Name<br>
                零件名称：
            </td>
            <td width="28%"><input type="text" name="partName" class="input_0" readonly="readonly"
                                   value="${documentsToBeProcesses.partName}"/></td>
            <td width="13%" style="line-height:18px;">Traceability ID<br>
                追溯号：
            </td>
            <td width="26%"><input type="text" name="traceabilityId" class="input_0" readonly="readonly"
                                   value="${documentsToBeProcesses.traceabilityId}"/></td>
            <c:if test="${fn:contains(documentsToBeProcesses.number,'M')}">
                <td width="7%" style="line-height:18px;"><br>
                    工序号：
                </td>
            </c:if>
            <c:if test="${fn:contains(documentsToBeProcesses.number,'A')}">
                <td width="7%" style="line-height:18px;">Area<br>
                    区域：
                </td>
            </c:if>
            <c:if test="${fn:contains(documentsToBeProcesses.number,'T')}">
                <td width="7%" style="line-height:18px;">Area<br>
                    区域：
                </td>
            </c:if>
            <td width="7%" style="line-height:18px;">Area<br>
                区域：
            </td>
            <td width="26%"><input type="text" name="area" class="input_0" readonly="readonly"
                                   value="${documentsToBeProcesses.area}"/></td>
        </tr>
        <tr>
            <td height="60" colspan="6">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="66%" style="line-height:18px;">Defect Description 缺陷描述：<br>
                            <textarea name="textarea" rows="3"
                                      style="width:98%;border:0;border-bottom:1px solid black;background:#fff; line-height:18px;"
                                      placeholder=""
                                      readonly="readonly"> ${documentsToBeProcesses.defectDescription}</textarea></td>
                        <td width="34%">
                            <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                   style="border:2px #000000 solid;">
                                <tr>
                                    <td width="62%" height="32">&nbsp;Requester 填报人：</td>
                                    <td width="38%"><input type="text" name="createAccount" class="input_0"
                                                           readonly="readonly"
                                                           value="${documentsToBeProcesses.createAccount}"/></td>
                                </tr>
                                <tr>
                                    <td height="32">&nbsp;Date 日期：</td>
                                    <td><input name="date2" readonly="readonly" value="${date}"/></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td height="35" colspan="6" valign="top" style=" border-bottom:#000000 2px dashed;">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="23%">Supplier Code 供应商代码：</td>
                        <td width="27%"><input type="text" name="supplierCode" class="input_0" maxlength="7"
                                               readonly="readonly"
                                               value="${documentsToBeProcesses.supplierCode}"/></td>
                        <td width="23%">Supplier Name 供应商名称：</td>
                        <td width="27%"><input type="text" name="supplierName" class="input_0" readonly="readonly"
                                               value="${documentsToBeProcesses.supplierName}"/></td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    <table class="tab" align="center" border="0" cellspacing="2" cellpadding="0">
        <tr>
            <td width="15%" height="30" style="line-height:18px;">Pre-Judgment<br/>
                零预判断(单选):
            </td>

            <%--<c:if test="${documentsToBeProcesses.back4==1}">
                <td width="30%">BFCEC&nbsp;
                    <input type="radio" name="back4" value="1" checked="checked" class="input"/>
                    &nbsp;&nbsp;Supplier供应商&nbsp;
                    <input type="radio" name="back4" value="2" class="input"/></td>
                <td width="55%" style="line-height:18px;">Confirm hold scope of parts and engine<br>请确认待处理的零件或发动机的范围
                </td>
            </c:if>

            <c:if test="${documentsToBeProcesses.back4==2}">
                <td width="30%">BFCEC&nbsp;
                    <input type="radio" name="back4" value="1" class="input"/>
                    &nbsp;&nbsp;Supplier供应商&nbsp;
                    <input type="radio" name="back4" value="2" checked="checked" class="input"/></td>
                <td width="55%" style="line-height:18px;">Confirm hold scope of parts and engine<br>请确认待处理的零件或发动机的范围
                </td>
            </c:if>--%>

            <td width="30%">BFCEC&nbsp;
                <input type="radio" name="back4" value="1" class="input" disabled="disabled"  <c:if test="${fn:contains(documentsToBeProcesses.back4,'1')}">checked="checked"
                </c:if> />
                &nbsp;&nbsp;Supplier供应商&nbsp;
                <input type="radio" name="back4" value="2" class="input" disabled="disabled" <c:if test="${fn:contains(documentsToBeProcesses.back4,'2')}">checked="checked"
                </c:if> /></td>
            <td width="55%" style="line-height:18px;">Confirm hold scope of parts and engine<br>请确认待处理的零件或发动机的范围</td>
        </tr>
        <tr>
            <td height="45" colspan="3" style="border-top:#000000 1px solid; border-bottom:#000000 1px solid;">
                <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td style="line-height:18px;"><strong>Hold Scope<br>
                            待处理范围(多选)：</strong></td>
                        <td style="border-right:#000000 2px dashed;">&nbsp;By Line Parts<br>
                            &nbsp;线旁零件&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="checkbox" name="holdScope" value="1" class="input" disabled="disabled"
                                   <c:if test="${fn:contains(documentsToBeProcesses.holdScope,'1')}">checked="checked"
                            </c:if>/></td>
                        <td style="border-right:#000000 2px dashed;">&nbsp;Stock Parts<br>&nbsp;库存零件&nbsp;&nbsp;&nbsp;&nbsp;<input
                                type="checkbox" name="holdScope" value="2" class="input" disabled="disabled"
                                <c:if test="${fn:contains(documentsToBeProcesses.holdScope,'2')}">checked="checked"
                        </c:if>/></td>
                        </td>
                        <td style="border-right:#000000 2px dashed;">&nbsp;Work In Process<br>&nbsp;在制发动机&nbsp;&nbsp;&nbsp;&nbsp;<input
                                type="checkbox" name="holdScope" value="3" class="input" disabled="disabled"
                                <c:if test="${fn:contains(documentsToBeProcesses.holdScope,'3')}">checked="checked"
                        </c:if>/></td>
                        </td>
                        <td style="border-right:#000000 2px dashed;">&nbsp;Finished Product<br>&nbsp;成品发动机&nbsp;&nbsp;&nbsp;&nbsp;<input
                                type="checkbox" name="holdScope" value="4" class="input" disabled="disabled"
                                <c:if test="${fn:contains(documentsToBeProcesses.holdScope,'4')}">checked="checked"
                        </c:if>/></td>
                        </td>
                        <td>&nbsp;Customer engines<br>&nbsp;客户处发动机&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox"
                                                                                                 name="holdScope"
                                                                                                 value="5"
                                                                                                 class="input"
                                                                                                 disabled="disabled"
                                                                                                 <c:if test="${fn:contains(documentsToBeProcesses.holdScope,'5')}">checked="checked"
                        </c:if>/></td>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td height="65" colspan="3" valign="top" style=" border-bottom:#000000 2px dashed;">
                <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td width="23%" height="30"><strong>Disposition 处理意见：</strong></td>
                        <td width="27%"><input type="text" name="disposition" class="input_0" readonly="readonly"
                                               value="${documentsToBeProcesses.disposition}"/></td>
                        <%--<td width="23%"><strong>Next Owner 下一处理人：</strong></td>
                        <td width="27%"><input type="text" name="textfield" class="input_0" placeholder="同步通讯录（选择搜索）可选择可下拉" value=""/></td>--%>
                        <td height="30"><strong>Quality engineer 质量工程师：</strong></td>
                        <td><input type="text" name="textfield" class="input_0" readonly="readonly"
                                   value="${documentsToBeProcesses.qualityEngineer}"/></td>
                        <td colspan="2">&nbsp;</td>
                    </tr>
                    <%--<tr>
                        <td height="30"><strong>Quality engineer 质量工程师：</strong></td>
                        <td><input type="text" name="textfield" class="input_0" readonly="readonly" value="${documentsToBeProcesses.qualityEngineer}"/></td>
                        <td colspan="2">&nbsp;</td>
                    </tr>--%>

                </table>
            </td>
        </tr>
        <%-- <tr>
             <td height="32" colspan="3">Scrap to &quot;Next owner&quot;, if nobody deal with these parts in two weeks.两周内无人处理，则零件报废给“下一处理人”</td>
         </tr>--%>
    </table>
</form>
<!--endprint-->
<br>
<table width="650" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <%--<td height="50" align="center" bgcolor="#F6F6F6"><input type="button" name="print2" value="保        存"
                                                                onclick="savetData()"/>
        <td height="50" align="center" bgcolor="#F6F6F6"><input type="button" name="print2" value="提        交"
                                                                onclick="submitData()"/>--%>
        <td height="50" align="center" bgcolor="#F6F6F6"><input type="button" name="print2" value="预览打印(19cm * 12cm)"
                                                                onclick="preview()"/></td>
    </tr>
</table>
<%--<link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>--%>

<script language="javascript">
    
    function  savetData() {
        console.log($('#form1').serialize());
        $.ajax({
            url: "${webPath}/PendingDocument/updatePendingDocuments",
            type: "post",
            data: $('#form1').serialize(),
            success: function (data) {
                window.location.reload();
            }
        });
    }
    
    
    function submitData() {
        console.log($('#form1').serialize());
        $.ajax({
            url: "${webPath}/PendingDocument/submitPendingDocuments",
            type: "post",
            data: $('#form1').serialize(),
            success: function (data) {
                window.location.reload();
            }
        });
    }


    function preview() {
        bdhtml = window.document.body.innerHTML;
        sprnstr = "<!--startprint-->";
        eprnstr = "<!--endprint-->";
        prnhtml = bdhtml.substr(bdhtml.indexOf(sprnstr) + 17);
        prnhtml = prnhtml.substring(0, prnhtml.indexOf(eprnstr));
        window.document.body.innerHTML = prnhtml;
        window.print();
    }
</script>
</body>
</html>