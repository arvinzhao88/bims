<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>
<%@include file="/view/static/common/core_js.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Hold Tag 待处理标签</title>
    <%--<link rel="stylesheet" type="text/css" media="print" href="${resPath}/view/receipt/css/print_style.css"/>
    <link rel="stylesheet" type="text/css" media="screen" href="${resPath}/view/receipt/css/css.css"/>--%>
    <%@include file="/view/static/common/bill_global_css.jsp"%>
</head>

<body>
<!--startprint-->
<table border="0" align="center" cellpadding="0" cellspacing="2" class="tab">
    <tr>
        <td height="50" valign="top" width="calc(100% - 200px)" style=" border-bottom:#000000 2px dashed;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="25%"><img src="${resPath}/view/receipt/images/biao_logo.png" align="absmiddle"  class="logo"/></td>
                <td width="75%" align="center"><font class="biao">Hold Tag 待处理标签</font></td>
            </tr>

        </table>
        </td>
        <td width="200" rowspan="2"><table width="100%" border="1" cellpadding="0" cellspacing="0" bordercolor="#000000" style="border:#000000 1px solid;">
            <tr>
                <td width="28%" rowspan="2" align="center" style="line-height:16px;">Data<br>日期</td>
                <td width="12%" align="center">Y</td>
                <td width="12%" align="center">Y</td>
                <td width="12%" align="center">M</td>
                <td width="12%" align="center">M</td>
                <td width="12%" align="center">D</td>
                <td width="12%" align="center">D</td>
            </tr>
            <tr>
                <td colspan="6" align="center"><input name="textfield2" readonly="readonly" class="input_f" value="${createtime}" /></td>
            </tr>
            <tr>
                <td align="center" style="line-height:16px;">No.<br>编号</td>
                <td colspan="6" align="center">
                    <input name="textfield223" type="text" class="input_f"  readonly="readonly" value="${tagstobeProcessed.numberr}" maxlength="10" /></td>
            </tr>
        </table></td>
    </tr>
    <tr>
        <td>
            <table width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>

                    <td width="9%" style="line-height:18px;">Type<br>机型：</td>
                    <td width="20%"><input type="text" name="textfield" class="input_0"  readonly="readonly" value="${tagstobeProcessed.type}"/></td>
                    <td width="18%" style="line-height:18px;">PartNo./ESN<br>零件/发动机号：</td>
                    <td width="20%" ><input type="text" name="textfield" class="input_0"  readonly="readonly" value="${tagstobeProcessed.partsEngineNumber}"/></td>
                    <td width="13%" style="line-height:18px;">Quantity<br>数量：</td>
                    <td width="20%"><input type="text" name="textfield" class="input_0"   readonly="readonly" value="${tagstobeProcessed.quantity}"/></td>
                </tr>
            </table></td>
    </tr>
</table>
<table class="tab" align="center" border="0" cellspacing="2" cellpadding="0">
    <tr>
        <td width="10%" height="30" style="line-height:18px;">Part Name<br>
            零件名称：</td>
        <td width="28%"><input type="text" name="textfield" class="input_0"  readonly="readonly"  value="${tagstobeProcessed.partName}"/></td>
        <td width="13%" style="line-height:18px;">Traceability ID<br>追溯号：</td>
        <td width="26%"><input type="text" name="textfield" class="input_0"  readonly="readonly"  value="${tagstobeProcessed.traceabilityId}"/></td>
        <td width="7%" style="line-height:18px;">Area<br>区域：</td>
        <td width="26%"><input type="text" name="textfield" class="input_0"  readonly="readonly"  value="${tagstobeProcessed.area}"/></td>
    </tr>
    <tr>
        <td height="60" colspan="6"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td style="line-height:18px;">Defect Description 缺陷描述：
                    <textarea name="textarea" rows="3" style="width:98%;border:0;border-bottom:1px solid black;background:#fff; line-height:18px;"  readonly="readonly">${tagstobeProcessed.defectDescription}</textarea></td>
            </tr>
        </table></td>
    </tr>
    <tr><td height="35" colspan="6" valign="top">

        <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="22%">Supplier Code 供应商代码：</td>
                <td width="28%">
                    <input name="textfield23" type="text" class="input_0" maxlength="7"   readonly="readonly"  value="${tagstobeProcessed.supplierCode}"/></td>
                <td width="22%">Supplier Name 供应商名称：</td>
                <td width="28%"><input type="text" name="textfield" class="input_0"   readonly="readonly" value="${tagstobeProcessed.supplierName}"/></td>
            </tr>
        </table></td>
    </tr>
    <tr>
        <td height="200" colspan="6" valign="top" style="border-bottom:1px solid black;">&nbsp;</td>
    </tr>
</table>
<!--endprint-->
<br>
<table width="650" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td height="50" align="center" bgcolor="#F6F6F6"><input type="button" name="print2" value="预览打印" onclick="preview()" /><br>19cm * 12cm</td>
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



