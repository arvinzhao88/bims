<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>
<%@include file="/view/static/common/core_js.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <%--<link rel="stylesheet" type="text/css" media="print" href="${resPath}/view/receipt/css/print_style.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="${resPath}/view/receipt/css/css.css" />--%>
    <%@include file="/view/static/common/bill_global_css.jsp"%>
    <title>Scrap Ticket 报废单</title>
</head>

<body>
<form id="form1" name="form1" method="post">
<!--startprint-->
    <input type="hidden" name="id" value="${scrapTicket.id}" />
    <input type="hidden"  value="${scrapTicket.statue}" />
<table border="0" align="center" cellpadding="0" cellspacing="2" class="tab">
    <tr>
        <td height="50" width="calc(100% - 200px)" valign="top" style=" border-bottom:#000000 2px dashed;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="25%" rowspan="2"><img src="${resPath}/view/receipt/images/biao_logo.png" align="absmiddle"  class="logo"/></td>
                <td width="50%" rowspan="2" align="center"><font class="biao">Scrap Ticket 报废单</font></td>
                <td width="25%">
                    <input type="radio" name="inPlantCustomers" value="1" class="input"<c:if test="${fn:contains(scrapTicket.inPlantCustomers,1)}">checked="checked"
                    </c:if>/>Inner Plant 厂内</td>
            </tr>
            <tr>
                <td>
                    <input type="radio" name="inPlantCustomers" value="2" class="input" <c:if test="${fn:contains(scrapTicket.inPlantCustomers,2)}">checked="checked"
                    </c:if>/> Customer 客户</td>
            </tr>
        </table>
        </td>
        <td width="200" rowspan="2"><table width="100%" border="1" cellpadding="0" cellspacing="0" bordercolor="#000000" style="border:#000000 1px solid;">
            <tr>
                <td width="28%" rowspan="2" align="center" style="line-height:16px;">Data<br />
                    日期</td>
                <td width="12%" align="center">Y</td>
                <td width="12%" align="center">Y</td>
                <td width="12%" align="center">M</td>
                <td width="12%" align="center">M</td>
                <td width="12%" align="center">D</td>
                <td width="12%" align="center">D</td>
            </tr>
            <tr>
                <td colspan="6" align="center"><input name="textfield22" class="input_f"  readonly="readonly" value="${date}"  /></td>
            </tr>
            <tr>
                <td align="center" style="line-height:16px;">No.<br />
                    编号</td>
                <td colspan="6" align="center"><input name="number" type="text" readonly="readonly" class="input_f" value="${scrapTicket.number}" maxlength="10" /></td>
            </tr>
        </table></td>
    </tr>
    <tr>
        <td><table width="100%" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td width="8%">Type<br>机型：</td>
                <td width="20%"><input type="text" name="type" class="input_0"  readonly="readonly" value="${scrapTicket.type}"/></td>
                <td width="18%">PartNo./ESN<br>零件/发动机号：</td>
                <td width="20%"><input type="text" name="partsEngineNumber" class="input_0"  value="${scrapTicket.partsEngineNumber}"/></td>
                <td width="14%">SO<br>发动机系列：</td>
                <td width="20%"><input type="text" name="so" class="input_0" readonly="readonly" value="${scrapTicket.so}"/></td>
            </tr>
        </table></td>
    </tr>
</table>
<table border="0" align="center" cellpadding="0" cellspacing="2" class="tab">
    <tr>
        <td>
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="9%">Part Name<br>零件名称：</td>
                    <td width="16%"><input type="text" name="partName" class="input_0" readonly="readonly" value="${scrapTicket.partName}"/></td>
                    <td width="9%">Quantity<br>数量：</td>
                    <td width="16%"><input type="text" name="quantity" class="input_0"  readonly="readonly" value="${num}"/></td>
                    <td width="11%">Supplier Code<br>供应商代码：</td>
                    <td width="14%"><input type="text" name="supplierCode"  class="input_0"  value="${scrapTicket.supplierCode}" /></td>
                    <td width="10%">Project Code<br>项目号：</td>
                    <td width="15%"><input type="text" name="itemNumber" readonly="readonly" class="input_0" value="${scrapTicket.itemNumber}"/></td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td height="60"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="calc(100% - 200px)" ><table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="25%">Parts Traceability ID 追溯号:</td>
                        <td width="75%"><input type="text" name="traceabilityId" class="input_0" readonly="readonly"  value="${scrapTicket.traceabilityId}"/></td>
                    </tr>
                </table>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td width="25%">工位信息:</td>
                            <td width="75%"><input type="text" name="back2" class="input_0" readonly="readonly"  value="${scrapTicket.back2}"/></td>
                        </tr>
                    </table>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td>Defect Description 缺陷描述：
                                <textarea name="defectDescription" rows="2" style="width:98%;border:0;border-bottom:1px solid black;background:#fff; line-height:18px;"readonly="readonly">${scrapTicket.defectDescription}</textarea></td>
                        </tr>
                    </table></td><td width="200" rowspan="2" valign="top"><table width="100%" border="1" cellpadding="3" cellspacing="0" bordercolor="#000000">
                <tr>
                    <td>Requester 录入人：
                        <input type="text" name="createAccount" class="input_0"  value="${scrapTicket.createAccount}" /></td>
                </tr>
            </table></td>
            </tr>
            <tr>
                <td height="35"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td>Judgment 判定(多选)：</td>
                        <td><input type="checkbox" name="judgment" value="1" class="input" <c:if test="${fn:contains(scrapTicket.judgment,'1')}">checked="checked"</c:if>/>Material Scrap 料废</td>
                        <td><input type="checkbox" name="judgment" value="2" class="input" <c:if test="${fn:contains(scrapTicket.judgment,'2')}">checked="checked"</c:if>/>Work Scrap 工废</td>
                        <td><input type="checkbox" name="judgment" value="3" class="input" <c:if test="${fn:contains(scrapTicket.judgment,'3')}">checked="checked"</c:if>/>Non-work Scrap 非工报废</td>
                    </tr>
                </table></td>
            </tr>
            <tr>
                <td height="50" colspan="2" style="border-bottom:#000000 2px dashed;border-top:#000000 2px dashed;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="15%">Share code<br />
                            分摊代码：</td>
                        <td width="35%"><input type="text" name="shareCode" class="input_0"  placeholder="" value="${scrapTicket.shareCode}" /></td>
                        <td width="20%">Associated Scrap NO.<br />
                            连带报废单号：</td>
                        <td width="30%"><input type="text" name="associatedScrapNo" readonly="readonly" style="width:96%; height:30px;border:0;border-bottom:1px solid black;background:#fff;" value="${scrapTicket.associatedScrapNo}"/></td>
                    </tr>
                    <tr>
                        <td>Quality Engineer<br />
                            质量工程师：</td>
                        <td colspan="2"><input type="text" name="back1" class="input_0"  readonly="readonly" value="${scrapTicket.back1}"/></td>
                        <td>&nbsp;</td>
                    </tr>
                </table></td>
            </tr>
            <tr>
                <td height="50" colspan="2" style="border-bottom:#000000 2px dashed;"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="tab_font">
                    <tr>
                        <td width="25%"><input type="checkbox" name="options" value="1" class="input" <c:if test="${fn:contains(scrapTicket.options,1)}">checked="checked"</c:if>/>
                            MFG scrap 制造工废</td>
                        <td width="25%"><input type="checkbox" name="options" value="2" class="input" <c:if test="${fn:contains(scrapTicket.options,2)}">checked="checked"</c:if> />
                            Inspect Scrap 检验工废</td>
                        <td width="25%"><input type="checkbox" name="options" value="3" class="input" <c:if test="${fn:contains(scrapTicket.options,3)}">checked="checked"</c:if> />
                            Log.Scrap 物流工废</td>
                        <td width="25%"><input type="checkbox" name="options" value="4" class="input" <c:if test="${fn:contains(scrapTicket.options,4)}">checked="checked"</c:if> />
                            Maint.Scrap 设备工废</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" name="options" value="5" class="input"<c:if test="${fn:contains(scrapTicket.options,5)}">checked="checked"</c:if> />
                            Product Scrap 产品工废</td>
                        <td><input type="checkbox" name="options" value="6" class="input"<c:if test="${fn:contains(scrapTicket.options,6)}">checked="checked"</c:if> />
                            ME Scrap 工艺工废</td>
                        <td><input type="checkbox" name="options" value="7" class="input"<c:if test="${fn:contains(scrapTicket.options,7)}">checked="checked"</c:if> />
                            Tool Scrap 工具工废</td>
                        <td><input type="checkbox" name="options" value="8" class="input"<c:if test="${fn:contains(scrapTicket.options,8)}">checked="checked"</c:if> />
                            Cutting Scrap 刀具工废</td>
                    </tr>
                </table></td>
            </tr>
            <tr>
                <td height="50" colspan="2"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="tab_font">
                    <tr>
                        <td width="25%"><input type="checkbox" name="options" value="9" class="input" <c:if test="${fn:contains(scrapTicket.options,9)}">checked="checked"</c:if> />
                            VPI Develop 新品开发</td>
                        <td width="25%"><input type="checkbox" name="options" value="10" class="input" <c:if test="${fn:contains(scrapTicket.options,10)}">checked="checked"</c:if> />
                            Engineering test 产品试验 </td>
                        <td width="25%"><input type="checkbox" name="options" value="11" class="input" <c:if test="${fn:contains(scrapTicket.options,11)}">checked="checked"</c:if> />
                            Manufacture 工艺试验 </td>
                        <td width="25%"><input type="checkbox" name="options" value="12" class="input" <c:if test="${fn:contains(scrapTicket.options,12)}">checked="checked"</c:if> />
                            Debug Scrap 调试报废</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" name="options" value="13" class="input" <c:if test="${fn:contains(scrapTicket.options,13)}">checked="checked"</c:if> />
                            Equip. Acceptance 设备验收 </td>
                        <td><input type="checkbox" name="options" value="14" class="input" <c:if test="${fn:contains(scrapTicket.options,14)}">checked="checked"</c:if> />
                            Product Audit 产品审核 </td>
                        <td colspan="2" valign="top">
                            Other 其他&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="text" name="other"  value="${scrapTicket.other}" style="width:300px;height:30px;border:0;border-bottom:1px solid black;background:#fff;"/></td>
                    </tr>
                </table></td>
            </tr>
        </table>
        </td>
    </tr>
</table>
<!--endprint-->
<br>
</form>
<table width="650" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td height="50" align="center" bgcolor="#F6F6F6"><input type="button" name="print2" value="保      存" onclick="savetData()" /></td>
        <td height="50" align="center" bgcolor="#F6F6F6"><input type="button" name="print2" value="提      交" onclick="submitData()" /></td>
        <td height="50" align="center" bgcolor="#F6F6F6"><input type="button" name="print2" value="预览打印(19cm * 12cm)" onclick="preview()" /></td>
    </tr>
</table>
<%--<link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>--%>
<script language="javascript">

    function  savetData() {
        if (${scrapTicket.statue==2}){
            layer.msg("您已提交，请勿重复操作");
            setTimeout(function(){ window.location.reload(); }, 1000);
            return false;
        }
        console.log($('#form1').serialize());
        $.ajax({
            url: "${webPath}/ScrapBill/updateScrap",
            type: "post",
            data: $('#form1').serialize(),
            success: function (data) {
                layer.msg("保存成功");
                setTimeout(function(){ window.location.reload(); }, 1000);
            }
        });
    }
    function submitData() {
        if (${scrapTicket.statue==2}){
            layer.msg("您已提交，请勿重复操作");
            setTimeout(function(){ window.location.reload(); }, 1000);
            return false;
        }
        console.log($('#form1').serialize());
        $.ajax({
            url: "${webPath}/ScrapBill/submitScrap",
            type: "post",
            data: $('#form1').serialize(),
            success: function (data) {
                layer.msg("提交成功");
                setTimeout(function(){ window.location.reload(); }, 1000);
            }
        });
    }

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
