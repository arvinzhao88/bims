<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <%--<meta http-equiv="Content-Security-Policy" content="upgrade-insecure-requests" />
    <meta http-equiv='Content-Security-Policy' content='block-all-mixed-content'>--%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="${resPath}/view/static/images/favicon.ico"
          type="image/ico"/>
    <link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>
    <title>${sysName}</title>
    <%@include file="/view/static/common/global_css.jsp" %>
    <link href="${resPath}/view/static/vendors/select2/dist/css/select2.css" rel="stylesheet">

    <style type="text/css">
        th {
            border-bottom-width: 0px !important;
        }

        th, td {
            /*text-align: center;*/
            vertical-align: middle !important;
        }

        .liinfo {
            list-style: none;
            margin-top: 10px;
            margin-right: 30px;
            width: 100%;
        }

        .spaninfo {
            margin-right: 10px;
        }

        .select2 {
            width: 100% !important;
        }

        /*.select2-selection {
            height: 38px;
        }*/

        .select2-container--default .select2-selection--multiple .select2-selection__choice {
            background-color: white;
        }

        input[type="radio"] + label::before {
            content: "\a0"; /*不换行空格*/
            display: inline-block;
            vertical-align: middle;
            font-size: 18px;
            width: 1em;
            height: 1em;
            margin-right: .4em;
            border-radius: 50%;
            border: 1px solid #01cd78;
            text-indent: .15em;
            line-height: 1;
        }

        input[type="radio"]:checked + label::before {
            background-color: #01cd78;
            background-clip: content-box;
            padding: .2em;
        }

        input[type="radio"] {
            position: absolute;
            clip: rect(0, 0, 0, 0);
        }

        #eqrLeader + span {
            width: 30% !important;
        }

        .point {
            position: absolute;
            top: 0;
            right: -5px;
            width: 6px;
            height: 6px;
            background: red;
            border-radius: 50%;
        }

        label.error {
            color: red;
        }
    </style>

    <script type="text/javascript">
        var ctx = '${webPath}';
    </script>
</head>

<body class="nav-md" onload="loadd()" style="height:100%;">

<div class="container body">
    <div class="main_container">

        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">

                <%@include file="/view/static/common/sysinfo.jsp" %>

                <!-- 侧导航开始 -->
                <%@include file="/view/static/common/siderbar.jsp" %>
                <!-- /测导航结束 -->
            </div>
        </div>

        <!-- 顶部开始 -->
        <%@include file="/view/static/common/head.jsp" %>
        <!-- 顶部结束 -->

        <!-- 内容区开始 -->
        <div class="right_col" role="main">
            <div class="page-title">
            <div class="title_left">
                <%--<h3>售后</h3>--%>
            </div>
        </div>

            <div class="clearfix"></div>
            <div class="x_panel" style="width:99%"; margin-right:10px;>

                <div class="x_title">
                    <h2>问题描述</h2>
                    <ul class="nav navbar-right panel_toolbox">
                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content" style="display:block;">
                    <table width="100%" class="table table-hover table-bordered">
                        <tr>
                            <th>信息来源：</th>
                            <c:if test="${afterSaleIssue.informationSource==1}">
                                <td>OEM Quality</td>
                            </c:if>
                            <c:if test="${afterSaleIssue.informationSource==2}">
                                <td>CS</td>
                            </c:if>
                            <c:if test="${afterSaleIssue.informationSource==3}">
                                <td>Reliability Quality</td>
                            </c:if>
                            <c:if test="${afterSaleIssue.informationSource==4}">
                                <td>Executive Complaint</td>
                            </c:if>
                            <c:if test="${afterSaleIssue.informationSource==5}">
                                <td>Plant Quality</td>
                            </c:if>
                            <th>整车/设备制造商和客户名称：</th>
                            <td>${afterSaleIssue.vehicleEquipment}</td>
                            <th>出厂编号：</th>
                            <td>${afterSaleIssue.vehicleVin}</td>
                        </tr>

                        <tr>
                            <th>发动机系列：</th>
                            <td>${afterSaleIssue.engineSeries}</td>
                            <th>发动机型号：</th>
                            <td>${afterSaleIssue.engineType}</td>
                            <th>发动机 ESN：</th>
                            <td>${afterSaleIssue.engineSeriesNo}</td>
                        </tr>

                        <tr>
                            <th>发动机 SO：</th>
                            <td>${afterSaleIssue.shopOrder}</td>
                            <th>发动机生产日期：</th>
                            <td>${afterSaleIssue.engineBuildDate}</td>
                            <th>服务站名称：</th>
                            <td>${afterSaleIssue.dealerName}</td>
                        </tr>

                        <tr>
                            <th>服务站联系人及方式：</th>
                            <td>${afterSaleIssue.dealerContact}</td>
                            <th>出厂日期：</th>
                            <td>${afterSaleIssue.vehicleBuildDate}</td>
                            <th>购车日期：</th>
                            <td>${afterSaleIssue.vehicleSaleDate}</td>
                        </tr>

                        <tr>
                            <th>故障日期：</th>
                            <td>${afterSaleIssue.failureDate}</td>
                            <th>故障里程：</th>
                            <td>${afterSaleIssue.failureMileage}</td>
                            <th>失效数量：</th>
                            <td>${afterSaleIssue.failureNum}</td>
                        </tr>

                        <tr>
                            <th>失效区域：</th>
                            <td>${afterSaleIssue.repairLocation}</td>
                            <th>使用工况及环境：</th>
                            <td colspan="3">${afterSaleIssue.usingCondition}</td>
                        </tr>

                        <tr>
                            <td colspan="6"></td>
                        </tr>

                        <tr>
                            <th>用户姓名：</th>
                            <td>${afterSaleIssue.customerName}</td>
                            <th>用户电话：</th>
                            <td>${afterSaleIssue.customerPhone}</td>
                            <th>用户类型：</th>
                            <td>${afterSaleIssue.customerType}</td>
                        </tr>
                        <tr>
                            <td colspan="6"></td>
                        </tr>
                        <tr>
                            <th>故障现象：</th>
                            <td>${afterSaleIssue.faultDesc}</td>
                            <th>祸首件名称：</th>
                            <td>${afterSaleIssue.faultPart}</td>
                            <th>故障模式：</th>
                            <td>${afterSaleIssue.faultDesc}</td>
                        </tr>

                        <tr>
                            <th>祸首件图号：</th>
                            <td colspan="5">${afterSaleIssue.faultPartNo}</td>
                        </tr>
                        <tr>
                            <td colspan="6"></td>
                        </tr>
                        <tr>
                            <th>现场检查：</th>
                            <td colspan="5">${afterSaleIssue.fieldInspect}</td>
                        </tr>
                        <tr>

                            <td colspan="6"></td>
                        </tr>
                        <tr>
                            <th>故障分析及结论:</th>
                            <td colspan="5">${afterSaleIssue.failureAnalysisConclusion}</td>
                        </tr>
                        <td colspan="6"></td>
                        </tr>
                        <tr>
                            <th>客户需求及短期维修措施：</th>
                            <td colspan="5">${afterSaleIssue.requireFix}</td>
                        </tr>

                        <td colspan="6"></td>
                        </tr>
                        <tr>
                            <th>车辆及故障照片：</th>
                            <td colspan="5">
                                <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                       class="table table-bordered">
                                    <tr>
                                        <c:forEach items="${shExtList}" var="shExt" varStatus="status">
                                        <c:if test="${status.index%3==0}">
                                    </tr>
                                    <tr>
                                        </c:if>
                                        <td width="33%">
                                            <div style="width:50px; height:40px; background-color: #CCCCCC; float:left"
                                                 data-toggle="modal" data-target=".this-pic"
                                                 onclick="showImg('${uploadUrl}${shExt.imgPath}')">
                                                <img class="img-preview"
                                                     style="width:50px; height:40px; background-color: #CCCCCC; float:left"
                                                     src="${uploadUrl}${shExt.imgPath}"
                                                     alt="${uploadUrl}${shExt.imgPath}">
                                            </div>&nbsp;${shExt.imgDesc}</td>
                                        </c:forEach>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </div>

            </div>
            <div class="row">
                <div class="col-md-9 col-sm-12 col-xs-12">
                    <%--<div class="x_panel">

                        <div class="x_title">
                            <h2>问题描述</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a></li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <%@include file="/view/back/bims/qualityissues/common/issuedesc.jsp" %>

                    </div>--%>

                    <%--<div class="x_panel" style="width:100%;float:left; margin-right:10px;">--%>
                        <%--<div class="x_title">--%>
                            <%--<h2>处置措施</h2>--%>
                            <%--<ul class="nav navbar-right panel_toolbox">--%>
                                <%--<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>--%>
                            <%--</ul>--%>
                            <%--<div class="clearfix"></div>--%>
                        <%--</div>--%>
                        <%--<div class="x_content">--%>
                            <%--<div class="form-group">--%>
                                <%--<div id="index-div">--%>

                                <%--</div>--%>

                                <%--<form id="docManage" data-parsley-validate class="form-horizontal form-label-left">--%>
                                    <%--<input type="hidden" id="issueId" name="issueId" required="required"--%>
                                           <%--class="form-control" value="${issue.id}">--%>
                                    <%--<input type="hidden" id="issueNo" name="issueNo" required="required"--%>
                                           <%--class="form-control" value="${issue.number}">--%>
                                    <%--<input type="hidden" id="qualityType" name="" required="required"--%>
                                           <%--class="form-control"--%>
                                           <%--value="${issue.qualityType}">--%>
                                    <%--<table class="doc" id="doc" width="100%" border="0" cellspacing="0" cellpadding="0"--%>
                                           <%--style="border-collapse:separate;border-spacing:15px;">--%>
                                        <%--<c:if test="${person.account == issue.processPersonAccount && issue.processStatus!='7'}">--%>
                                            <%--<tr id="tempMeasures">--%>
                                                <%--<td align="right" style="width:10%;">处置措施：</td>--%>
                                                <%--<td style="width:18%;"><select id="measures" name="tempMeasures"--%>
                                                                               <%--class="form-control" required>--%>
                                                    <%--<option value="">--请选择--</option>--%>
                                                    <%--<option value="1"--%>
                                                            <%--<c:if test="${measures == 1}">selected="selected"</c:if>>料废--%>
                                                    <%--</option>--%>
                                                    <%--<option value="2"--%>
                                                            <%--<c:if test="${measures == 2}">selected="selected"</c:if>>工废--%>
                                                    <%--</option>--%>
                                                    <%--<option value="3"--%>
                                                            <%--<c:if test="${measures == 3}">selected="selected"</c:if>>--%>
                                                        <%--让步接收--%>
                                                    <%--</option>--%>
                                                    <%--<option value="4"--%>
                                                            <%--<c:if test="${measures == 4}">selected="selected"</c:if>>待处理--%>
                                                    <%--</option>--%>
                                                    <%--<option value="6"--%>
                                                            <%--<c:if test="${measures == 6}">selected="selected"</c:if>>筛选--%>
                                                    <%--</option>--%>
                                                    <%--<option value="7"--%>
                                                            <%--<c:if test="${measures == 7}">selected="selected"</c:if>>拒收--%>
                                                    <%--</option>--%>
                                                    <%--<option value="8"--%>
                                                            <%--<c:if test="${measures == 8}">selected="selected"</c:if>>返工--%>
                                                    <%--</option>--%>
                                                <%--</select></td>--%>
                                                <%--<td style="width:10%;">&nbsp;</td>--%>
                                                <%--<td style="width:18%;">&nbsp;</td>--%>
                                                <%--<td align="right" style="width:10%;">&nbsp;</td>--%>
                                                <%--<td align="right" style="width:18%;">&nbsp;</td>--%>
                                                <%--<td align="right" style="width:16%;">--%>
                                                    <%--<a href="javascript:;" class="addInputReturn">--%>
                                                        <%--<span class="glyphicon glyphicon-plus"></span> 添加单据--%>
                                                    <%--</a>--%>
                                                <%--</td>--%>
                                            <%--</tr>--%>
                                        <%--</c:if>--%>
                                    <%--</table>--%>
                                    <%--<div style="text-align: center;" id="saveBtn"></div>--%>
                                <%--</form>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<!--单据表开始-->--%>
                        <%--<div class="x_title">--%>
                            <%--<h2>单据管理</h2>--%>
                            <%--<div class="clearfix"></div>--%>
                        <%--</div>--%>

                        <%--<div class="x_content">--%>
                            <%--<form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">--%>
                                <%--<div class="form-group">--%>
                                    <%--<div class="" role="tabpane2" data-example-id="togglable-tabs">--%>
                                        <%--<ul id="myTab2" class="nav nav-tabs bar_tabs right" role="tablist">--%>

                                        <%--</ul>--%>

                                        <%--<!--附加表单开始-->--%>
                                        <%--<div id="myTabContent2" class="tab-content">--%>
                                        <%--</div>--%>
                                        <%--<!--附加表单结束-->--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</form>--%>
                            <%--<!--单据表完成-->--%>
                        <%--</div>--%>

                        <%--<c:if test="${issue.isEqr eq '0'}">--%>
                            <%--<div id="questionDeal" class="x_title">--%>
                                <%--<h2>问题处理</h2>--%>
                                <%--<ul class="nav navbar-right panel_toolbox">--%>
                                    <%--<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>--%>
                                <%--</ul>--%>
                                <%--<div class="clearfix"></div>--%>
                            <%--</div>--%>

                            <%--<div class="x_content" id="isEqrStatus">--%>
                                <%--<form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">--%>
                                    <%--<div class="form-group">--%>
                                        <%--<div class="form-group col-md-10">--%>
                                            <%--<label class="control-label col-md-3">是否EQR：</label>--%>
                                            <%--<div class="col-md-5">--%>
                                                <%--<p style="padding-top:8px;" id="isEqrp">--%>
                                                    <%--<input type="radio" name="isEqr" class="radio_type" id="isEqr1"--%>
                                                           <%--value="1"/>--%>
                                                    <%--<label for="isEqr1">是&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>--%>
                                                    <%--<input type="radio" name="isEqr" class="radio_type" id="isEqr2"--%>
                                                           <%--value="2"/>--%>
                                                    <%--<label for="isEqr2">否</label>--%>

                                                <%--</p>--%>
                                            <%--</div>--%>
                                        <%--</div>--%>

                                            <%--&lt;%&ndash;<div class="form-group col-md-10">--%>
                                                <%--<label class="control-label col-md-3">处理：</label>--%>
                                                <%--<div class="col-md-9" style="padding-top:8px;">问题发送 EQR Leader 进行下一步处理</div>--%>
                                            <%--</div>&ndash;%&gt;--%>
                                    <%--</div>--%>

                                    <%--<div id="eqrState" class="form-group">--%>
                                        <%--<div class="form-group col-md-10">--%>
                                            <%--<label style="margin-left:46px;" class="control-label col-md-3"--%>
                                                   <%--for="eqrLeader">选择EQR--%>
                                                <%--Leader：</label>--%>
                                            <%--<select id="eqrLeader" name="eqrLeader" class="form-control">--%>
                                            <%--</select>--%>
                                        <%--</div>--%>
                                    <%--</div>--%>
                                    <%--<div class="ln_solid" id="isRemove"></div>--%>
                                    <%--<div class="form-group" id="isOk">--%>
                                        <%--<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">--%>
                                            <%--<button class="btn btn-primary" type="button" &lt;%&ndash;data-toggle="modal"--%>
                                                    <%--data-target=".this-go"&ndash;%&gt; onclick="confirm(${issue.id})">确认--%>
                                            <%--</button>--%>
                                            <%--<button class="btn btn-default" type="button"--%>
                                                    <%--onClick="toApuCorrect(${issue.id})">返回--%>
                                            <%--</button>--%>
                                        <%--</div>--%>
                                    <%--</div>--%>
                                <%--</form>--%>
                            <%--</div>--%>
                        <%--</c:if>--%>
                        <%--<c:if test="${fn:contains(person.belongRole, '4') == true && issue.isEqr=='1'}">--%>
                            <%--<div class="x_content" id="eqrQDiv" style="display: block;">--%>
                                <%--<form id="demo-formEqr" data-parsley-validate class="form-horizontal form-label-left">--%>
                                    <%--<input type="hidden" name="id">--%>
                                    <%--<input type="hidden" name="issueId" value="${issue.id}">--%>
                                    <%--<table width="100%" border="0" cellspacing="0" cellpadding="0"--%>
                                           <%--class="table table-hover table-bordered">--%>
                                        <%--<tr>--%>
                                            <%--<td colspan="6" align="center">EQR Notification Form--%>
                                                <%--突发质量问题通知单--%>
                                            <%--</td>--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td width="22%"><strong>Issue Date 问题发生日期</strong></td>--%>
                                            <%--<td width="28%"><fmt:formatDate value="${issue.inputTime}"--%>
                                                                            <%--pattern="yyyy-MM-dd"/></td>--%>
                                            <%--<input type="hidden" name="issueDate" value="${issue.inputTime}">--%>
                                            <%--<td width="50%" colspan="4"><strong>Issue Description 问题描述</strong></td>--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>Issue Area 问题发生区域</strong></td>--%>
                                            <%--<td>${issueInfo.plantname}/${issueInfo.areaname}<br>--%>
                                                <%--<input type="hidden" name="issueArea"--%>
                                                       <%--value="${issueInfo.plantname}/${issueInfo.areaname}">--%>
                                            <%--</td>--%>
                                            <%--<td colspan="4" rowspan="3">--%>
                                            <%--<textarea name="issueDesc" id="issueDesc" cols="300" rows="3"--%>
                                                      <%--style="width:100%">${issue.issueDesc}</textarea></td>--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>Station No.工位号</strong></td>--%>
                                            <%--<td>${issue.issueStation}</td>--%>
                                            <%--<input type="hidden" name="stationNo" value="${issue.issueStation}">--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>Engine Type 发动机型号</strong></td>--%>
                                            <%--<td>${issue.engineType}</td>--%>
                                            <%--<input type="hidden" name="engineType" value="${issue.engineType}">--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>ESN 发动机序列号</strong></td>--%>
                                            <%--<td>${issue.esn}/${issue.so}</td>--%>
                                            <%--<input type="hidden" name="engineSerialNo" value="${issue.esn}/${issue.so}">--%>
                                            <%--<td colspan="4"><strong>Containment action 遏制措施</strong></td>--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>PN 零件号</strong></td>--%>
                                            <%--<td>${issue.partNo}</td>--%>
                                            <%--<input type="hidden" name="partNo" value="${issue.partNo}">--%>
                                            <%--<td colspan="4" rowspan="3"><textarea name="containmentAction"--%>
                                                                                  <%--id="containmentAction" cols="100"--%>
                                                                                  <%--rows="3"--%>
                                                                                  <%--style="width:100%"--%>
                                                                                  <%--required>${notification.containmentAction}</textarea>--%>
                                            <%--</td>--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>Part Name 零件名</strong></td>--%>
                                            <%--<td>${issue.partName}</td>--%>
                                            <%--<input type="hidden" name="partName" value="${issue.partName}">--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>Supplier Name 供应商名称</strong></td>--%>
                                            <%--<td>${issue.vendorName}</td>--%>
                                            <%--<input type="hidden" name="supplierName" value="${issue.vendorName}">--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>ailure Qty 失效数量</strong></td>--%>
                                            <%--<td>${issue.qty}</td>--%>
                                            <%--<input type="hidden" name="ailureQty" value="${issue.qty}">--%>
                                            <%--<td colspan="4"><strong>Clean point 断点</strong></td>--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>Effect Engine Amout<br>--%>
                                                <%--影响发动机台数</strong></td>--%>
                                            <%--<td><input type="text" id="effectEngineAmout" name="effectEngineAmout"--%>
                                                       <%--onblur="check(this)"--%>
                                                       <%--onkeyup="this.value=this.value.replace(/[^0-9.]/g,'')"--%>
                                                       <%--required="required" class="form-control"--%>
                                                       <%--value="${notification.effectEngineAmout}" placeholder="请输入数字">--%>
                                            <%--</td>--%>
                                            <%--<td colspan="4" rowspan="4">--%>
                                            <%--<textarea name="cleanPoint" id="cleanPoint" cols="100" rows="3"--%>
                                                      <%--style="width:100%" required>${notification.cleanPoint}</textarea>--%>
                                                    <%--&lt;%&ndash;<br>Attach/上传图片&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;<i class="fa fa-file-picture-o"&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;type="button" class="btn btn-default btn-sm">上传图片&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;</button>&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;<div class="list-img">&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;<ul id="preview" class="clear">&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;<li class="fl">&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;<img src="${resPath}/view/static/images/icon_upload.png">&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;<input id="fileImage" type="file" name="file[]" multiple/>&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;<div class="num">0/6</div>&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;</li>&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
                                                    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                            <%--</td>--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>Effect Scope<br>--%>
                                                <%--影响范围</strong></td>--%>
                                            <%--<td><input type="text" id="effectScope" name="effectScope"--%>
                                                       <%--required="required"--%>
                                                       <%--class="form-control" value="${notification.effectScope}"></td>--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>Impact to Delivery<br>--%>
                                                <%--是否影响发交</strong></td>--%>
                                            <%--<td><input type="text" id="effectToDelivery" name="effectToDelivery"--%>
                                                       <%--required="required" class="form-control"--%>
                                                       <%--value="${notification.effectToDelivery}"></td>--%>
                                        <%--</tr>--%>
                                        <%--<tr>--%>
                                            <%--<td><strong>Issue Sensor<br>--%>
                                                <%--问题来源</strong></td>--%>
                                            <%--<td><input type="text" id="issueSensor" name="issueSensor"--%>
                                                       <%--required="required"--%>
                                                       <%--class="form-control" value="${notification.issueSensor}"></td>--%>
                                                <%--&lt;%&ndash;<td width="15%"><strong>CAR/SCAR 号码</strong></td>--%>
                                                <%--<td width="15%">&nbsp;</td>--%>
                                                <%--<td width="10%"><strong>责任人</strong></td>--%>
                                                <%--<td width="10%">&nbsp;</td>&ndash;%&gt;--%>
                                        <%--</tr>--%>
                                    <%--</table>--%>


                                    <%--<h2>邮件接收人</h2>--%>
                                    <%--<select id="sendEmail" name="email" class="form-control" multiple="multiple"--%>
                                            <%--required>--%>
                                    <%--</select>--%>
                                    <%--<!--按钮-->--%>
                                    <%--<div class="ln_solid"></div>--%>
                                    <%--<div class="form-group">--%>
                                        <%--<div class="form-group" style="text-align:center">--%>
                                            <%--<button onclick="send()" class="btn btn-primary" type="button">发送邮件--%>
                                            <%--</button>&nbsp;&nbsp;&nbsp;&nbsp;--%>
                                                <%--&lt;%&ndash;<button class="btn btn-success" type="button" data-toggle="modal"--%>
                                                        <%--data-target=".this-opencar" onclick="openCar(${issue.id})">保存--%>
                                                <%--</button>&ndash;%&gt;--%>
                                        <%--</div>--%>
                                    <%--</div>--%>
                                    <%--<!--按钮完成-->--%>
                                    <%--<%@include file="/view/static/common/img.jsp" %>--%>
                                    <%--<input type="hidden" id="attach" name="attach" required="required"--%>
                                           <%--class="form-control col-md-7" value="${issue.attach}">--%>
                                    <%--<input type="hidden" name="emailNos" id="emailNos" value="">--%>
                                <%--</form>--%>
                            <%--</div>--%>
                        <%--</c:if>--%>

                        <%--<div class="x_panel" id="dealTools"--%>
                             <%--style="width:100%;float:left; margin-right:10px;--%>
                             <%--<c:if test="${issue.isEqr == '0'}">display: none</c:if>--%>
                             <%--<c:if test="${issue.isEqr != '0'}">display: block</c:if>">--%>
                            <%--<div class="x_title">--%>
                                <%--<h2>处理工具</h2>--%>
                                <%--<ul class="nav navbar-right panel_toolbox">--%>
                                    <%--<li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a></li>--%>
                                <%--</ul>--%>
                                <%--<div class="clearfix"></div>--%>
                            <%--</div>--%>
                            <%--<div class="x_content">--%>
                                <%--<form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">--%>
                                    <%--<input type="hidden" id="issueId" name="issueId" required="required"--%>
                                           <%--class="form-control" value="${issue.id}">--%>
                                    <%--<table id="tools" width="100%" border="0" cellpadding="0" cellspacing="0"--%>
                                           <%--style="border-collapse:separate;border-spacing:15px;">--%>
                                        <%--<tbody>--%>
                                            <%--<c:if test="${person.account == issue.processPersonAccount}">--%>
                                                <%--<tr>--%>
                                                    <%--<td align="right" width="10%">添加工具：</td>--%>
                                                    <%--<td>--%>
                                                    <%--</td>--%>
                                                    <%--<td align="right"></td>--%>
                                                    <%--<td>--%>
                                                    <%--</td>--%>
                                                    <%--<td align="right"></td>--%>
                                                    <%--<td>--%>
                                                    <%--</td>--%>
                                                    <%--<td align="right"></td>--%>
                                                    <%--<td>--%>
                                                    <%--</td>--%>
                                                    <%--<td align="right">--%>
                                                        <%--<a href="javascript:;" class="addInputReturn1" id="addDeal">--%>
                                                            <%--<span class="glyphicon glyphicon-plus"></span> 添加<input--%>
                                                                <%--type="hidden" required="required" class="count">--%>
                                                        <%--</a>--%>
                                                    <%--</td>--%>
                                                    <%--<td align="right">--%>
                                                    <%--</td>--%>
                                                <%--</tr>--%>
                                            <%--</c:if>--%>
                                        <%--</tbody>--%>
                                    <%--</table>--%>
                                    <%--<div style="text-align: center;" id="saveBtnTools"></div>--%>
                                <%--</form>--%>
                            <%--</div>--%>

                            <%--<div class="clearfix"></div>--%>

                            <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;<div class="" role="tabpane2" data-example-id="togglable-tabs">&ndash;%&gt;--%>
                                            <%--&lt;%&ndash;<ul id="myToolsList" class="nav nav-tabs bar_tabs right" role="tablist">&ndash;%&gt;--%>
                                            <%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
                                            <%--&lt;%&ndash;<div id="myAppendTools" class="tab-content">&ndash;%&gt;--%>
                                            <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;</div>&ndash;%&gt;--%>

                                    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</form>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<!--单据表完成-->&ndash;%&gt;--%>
                            <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                            <%--<div class="ln_solid"></div>--%>

                            <%--<c:if test="${person.account == issue.processPersonAccount and issue.processStatus != '7'}">--%>
                                <%--<div id="closeQuestion" class="form-group">--%>
                                    <%--<div style="text-align:center">--%>
                                        <%--<button class="btn btn-primary" type="button"--%>
                                                <%--onClick="closeIssue(${issue.id})">问题关闭--%>
                                        <%--</button>--%>
                                        <%--<button class="btn btn-default" type="button" onClick="comeBack();">返回</button>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</c:if>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <div class="x_panel" id="dealTools"
                         style="width:100%;float:left; margin-right:10px;
                         <c:if test="${issue.isEqr == '0'}">display: block</c:if>
                         <c:if test="${issue.isEqr != '0'}">display: block</c:if>">
                        <div class="x_title">
                            <h2>处理工具</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content">
                            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                <input type="hidden" id="issueId" name="issueId" required="required"
                                       class="form-control" value="${issue.id}">
                                <input type="hidden" id="qualityType" name="qualityType" required="required"
                                       class="form-control" value="${issue.qualityType}">
                                <table id="tools" width="100%" border="0" cellpadding="0" cellspacing="0"
                                       style="border-collapse:separate;border-spacing:15px;">
                                    <tbody>
                                    <c:if test="${person.account == issue.processPersonAccount &&issue.processStatus!='7'}">
                                        <tr>
                                            <td align="right" width="10%">添加工具：</td>
                                            <td>
                                            </td>
                                            <td align="right"></td>
                                            <td>
                                            </td>
                                            <td align="right"></td>
                                            <td>
                                            </td>
                                            <td align="right"></td>
                                            <td>
                                            </td>
                                            <td align="right">
                                                <a href="javascript:;" class="addInputReturn1" id="addDeal">
                                                    <span class="glyphicon glyphicon-plus"></span> 添加<input
                                                        type="hidden" required="required" class="count">
                                                </a>
                                            </td>
                                            <td align="right">
                                            </td>
                                        </tr>
                                    </c:if>
                                    </tbody>
                                </table>
                                <div style="text-align: center;" id="saveBtnTools"></div>
                            </form>
                        </div>

                        <div class="clearfix"></div>

                        <div class="form-group">
                            <form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">
                                <div class="form-group">
                                    <div class="" role="tabpane2" data-example-id="togglable-tabs">
                                        <ul id="myToolsList" class="nav nav-tabs bar_tabs right" role="tablist">
                                        </ul>
                                        <div id="myAppendTools" class="tab-content">
                                        </div>
                                    </div>

                                </div>
                            </form>
                            <!--单据表完成-->
                        </div>
                        <div class="ln_solid"></div>

                        <c:if test="${person.account == issue.processPersonAccount and issue.processStatus != '7'}">
                            <div id="closeQuestion" class="form-group">
                                <div style="text-align:center">
                                    <button class="btn btn-primary" type="button" data-toggle="modal" data-target=".this-close">问题关闭
                                    </button>
                                    <button class="btn btn-default" type="button" onClick="comeBack();">返回</button>
                                </div>
                            </div>
                        </c:if>
                    </div>
                    <%--<div class="x_panel" style="width:calc(25% - 10px); float:left;">

                            <div class="x_title">
                            <h2>问题处理记录</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                    </li>
                                </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div id="dealLog" class="x_content"  style="height: 130px; width: 100%;bottom: 5px; overflow: auto">
                        </div>
                    </div>--%>
                    <%--<div class="x_panel" style="width:calc(25% - 10px); float:left;">
                        <div class="x_title">
                            <h2>工具处理记录</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                    </li>
                                </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div id="toolLog" class="x_content" style="height: 130px; width: 100%;bottom: 5px; overflow: auto">
                        </div>
                    </div>
                    <div class="x_panel" style="width:calc(25% - 10px); float:left;height: auto">
                        <div class="x_title">
                            <h2>工具处理记录</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                </li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div id="dealLog" class="x_content">
                        </div>
                    </div>--%>
                </div>

                <div class="col-md-3 col-sm-6 col-xs-12" style="width:calc(25% - 10px); float:left;">
                    <div class="x_panel" style="width: 98%">
                        <div class="x_title">
                            <h2>问题处理记录</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                </li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div id="dealLog" class="x_content">
                        </div>
                    </div>

                    <div class="x_panel" style="width: 98%">
                        <div class="x_title">
                            <h2>工具处理记录</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                </li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div id="toolLog" class="x_content">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- 内容区结束 -->

    <!-- 页脚开始 -->
    <%@include file="/view/static/common/foot.jsp" %>
    <!-- 页脚结束 -->
</div>
</div>
<!-- 问题关闭原因 -->
<form id="form_close">
    <div id="modal_close" class="modal fade this-close" tabindex="-1" role="dialog" aria-hidden="true" >
        <div class="modal-dialog modal-lg" style="width:400px;padding-top:200px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                    <h4 class="modal-title" id="myModalLabe3">系统提示</h4>
                </div>
                <div class="modal-body">
                    <label>关闭原因：</label>
                    <input id="cause" type="text" class="form-control" placeholder="请输入关闭原因" required="required"/>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary antoclose2" onclick="closeIssue(${issue.id})">提交</button>
                    <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                </div>
            </div>
        </div>
    </div>
</form>
<div class="modal fade this-pic" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:860px;padding-top:20px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">照片预览</h4>
            </div>
            <div class="modal-body"
                 style="width:800px; height:500px; margin:30px;background-color:#EFEFEF; text-align:center;"
                 id="showImg">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<%@include file="/view/static/common/core_js.jsp" %>
<%--<script type="text/javascript" src="${resPath}/view/static/vendors/select2/dist/js/select2.min.js"></script>--%>
<%--<script type="text/javascript" src="${resPath}/view/static/vendors/select2/dist/js/i18n/zh-CN.js"></script>--%>
<script>var account = '${person.account}', personName = '${person.name}';</script>
<script src="${resPath}/view/back/bims/js/qualityissues/apuCheckEqr/dealTools.js"></script>
<script type="text/javascript">
    /**左侧菜单操作**/

    /**共用部分 start**/
    $(".side-menu li").each(function(index){
        $(this).removeClass("active");
    });
    $(".child_menu li").each(function(index){
        $(this).removeClass("current-page");
    });
    $(".child_menu").css('display','none');
    /**共用部分 end**/

    /**父菜单*/
    $("#menuIssusParent").addClass("active");
    /**父菜单*/
    $("#menuIssusChild").css('display','block');
    //$("#menuIssusParent").show();
    /**子菜单*/
    $("#menuSQA").addClass("current-page");

</script>
<script>
    /**
     * 针对具有相同名称的元素的验证的处理
     */
    $(function () {
        if ($.validator) {
            $.validator.prototype.elements = function () {
                var validator = this,
                    rulesCache = {};

                // select all valid inputs inside the form (no submit or reset buttons)
                return $(this.currentForm)
                    .find("input, select, textarea")
                    .not(":submit, :reset, :image, [disabled]")
                    .not(this.settings.ignore)
                    .filter(function () {
                        if (!this.name && validator.settings.debug && window.console) {
                            console.error("%o has no name assigned", this);
                        }
                        //注释这行代码
                        // select only the first element for each name, and only those with rules specified
                        //if ( this.name in rulesCache || !validator.objectLength($(this).rules()) ) {
                        //    return false;
                        //}
                        rulesCache[this.name] = true;
                        return true;
                    });
            }
        }
    });
</script>
<script type="text/javascript">

    function comeBack() {
        window.location.href = "${webPath}/back/toSqa";
    }

    //关闭问题
    function closeIssue(issueId) {
        if ($("#form_close").valid()) {
            $('#modal_close').modal('hide');
            $.post("${webPath}/bims/apucheck/closeIssue", {"id": issueId,"issueCategoryL3Name": $("#cause").val()}, function (data) {
                console.log(data);
                if (data.success) {
                    layer.msg("问题已关闭！");
                    setTimeout(function () {
                        window.location.href = "${webPath}/back/toSqa";
                    }, 1000);
                } else if (data.success == false) {
                    layer.msg("操作失败！");
                    return;
                }
            })
        }
    }

    /** 选择EQRleader **/

    jQuery(document).ready(function () {
        $('#eqrLeader').select2({
            placeholder: "--输入姓名--",
            language: "zh-CN",
            minimumInputLength: 1,
            allowClear: true,
            ajax: {
                url: "${webPath}/back/person/queryByNameToBims",
                dataType: 'json',
                data: function (params) {
                    return {
                        userName: params.term, // search term
                    };
                },
                processResults: function (data) {
                    var options = new Array();
                    $(data).each(function (i, o) {
                        options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                            id: o.account,         //取出items中Code赋值给id
                            text: o.name + "<" + o.account + ">"    //取出items中CodeName赋值给text
                        });
                    });
                    return {
                        results: options        //返回数据
                    };
                },
                cache: true
            }
        });
    })
    /** 选择EQRleader **/
    /**左侧菜单操作**/
    $(function () {
        var qualityType = "${issue.qualityType}";
        /**共用部分 start**/
        $(".side-menu li").each(function (index) {
            $(this).removeClass("active");
        });
        $(".child_menu li").each(function (index) {
            $(this).removeClass("current-page");
        });
        $(".child_menu").css('display', 'none');
        /**共用部分 end**/

        /**父菜单*/
        $("#menuIssusParent").addClass("active");
        /**父菜单*/
        $("#menuIssusChild").css('display', 'block');
        //$("#menuIssusParent").show();
        if (qualityType == 'A') {
            /**子菜单*/
            $("#menuA").addClass("current-page");
        } else if (qualityType == 'T') {
            /**子菜单*/
            $("#menuT").addClass("current-page");
        } else if (qualityType == 'M') {
            /**子菜单*/
            $("#menuMachine").addClass("current-page");
        }
    })

</script>
<script>

    var processStatus = '${issue.processStatus}';

    var nowAccount = '${person.account}';
    var dataAccount = '${issue.processPersonAccount}';
    /*window.onload = function(){
        loadd();
    }*/
    //setInterval("loadd()", 200);
    //页面数据加载完成后执行
    function loadd() {
        //判断该数据是否是当前登录用户 如果不是则隐藏所有的删除添加按钮
        if (nowAccount != dataAccount) {
            $(".delInput").each(function () {
                $(this).remove();
            });
            $(".addInputReturn").each(function () {
                $(this).remove();
            });
            $(".addInputReturn1").each(function () {
                $(this).remove();
            });
            $(".tab-content").each(function () {
                $(this).find("button").attr("disabled", true);
            });
            $("#closeQuestion").each(function () {
                $(this).find("button").remove();
            });

        }
    }

    //默认选中第一个
    $(function () {

        getHadSaveBillTabs();
        getHadSaveBillInput();
        getDealLog();
        //$("input[value='1']").attr('checked', 'true');

        $("input:radio[name='isEqr']").change(function () {
            var isEqr = $('input:radio:checked').val();  //获取选中的radio的值
            if (isEqr == "2") {
                /*$("#eqrState").hide();
                $("#dealTools").css("display", "block");
                $("#isOk").hide();
                $("#isRemove").hide();*/
                $("#eqrState").hide();
            } else {
                $("#eqrState").show();
                /*$("#dealTools").css("display", "none");
                $("#isOk").show();
                $("#isRemove").show();*/
            }
        });

    });

    //加载已经保存的单据标签
    function getHadSaveBillTabs() {
        var count = 1;
        $.ajax({
            url: "${webPath}/bill/getBillTabs",
            type: "POST",
            dataType: "json",
            data: {
                issueId: ${issue.id},
            },
            success: function (res) {
                var html = "";
                if (res.success) {
                    var billlist = res.obj;
                    for (var i = 0; i < billlist.length; i++) {
                        if (i == (billlist.length - 1)) {
                            getListByBillType(billlist[i].billType);
                            html += '<li role="presentation" class="active">'
                                + '<a href="#tab_content' + i + '" onclick="getListByBillType(' + billlist[i].billType + ')" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">' + billlist[i].billName + '</a>'
                                + '</li>';
                            continue;
                        }
                        html += '<li role="presentation">'
                            + '<a href="#tab_content' + i + '" onclick="getListByBillType(' + billlist[i].billType + ')" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">' + billlist[i].billName + '</a>'
                            + '</li>';
                        count++;
                    }
                    $("#myTab2").html(html);
                }
            }
        })
    }

    //加载已经保存的单据input
    function getHadSaveBillInput() {
        $.ajax({
            url: "${webPath}/bill/getBills",
            type: "POST",
            dataType: "json",
            data: {
                issueId: ${issue.id},
            },
            success: function (res) {
                var html = "";
                if (res.success) {
                    var toollist = res.obj;
                    for (var i = 0; i < toollist.length; i++) {
                        var isDel = '<a href="javascript:;" class="delInput" data-id="' + toollist[i].id + '" data-num="' + toollist[i].receiptId + '">'
                            + '<span class="glyphicon glyphicon-minus"></span> 删除'
                            + '</a>';
                        if (nowAccount != dataAccount || ${issue.processStatus=='7'}) {
                            isDel = "";
                        }
                        html += '<tr id="delInput' + i + '">&lt;%&ndash;'
                            + '<td align="right" style="width:10%"><span>问题单据：</span></td>'
                            + '<td style="width:18%;" align="right"><input name="billType" disabled value="' + toollist[i].billName + '" class="form-control"></td>'
                            + '<td style="width:10%;">&nbsp;</td>'
                            + '<td style="width:18%;">&nbsp;</td>'
                            + '<td align="right" style="width:10%;">&nbsp;</td>'
                            + '<td align="right" style="width:18%;">&nbsp;</td>'
                            + '<td align="right" style="width:16%;">'
                            + isDel
                            + '</td>&ndash;%&gt;'
                            + '</tr>';
                    }
                    $("#doc").append(html);
                }
            }
        })
    }


    var numTime = 0;
    $("body").on('click', '.addInputReturn', function () {
        //添加减号
        var html = '';
        html += '<tr id="delInputA' + numTime + '">'
            + '<input name="billId" type="hidden" id="billId' + numTime + '" required="required">'
            + '<input name="receiptId" type="hidden" id="receiptId' + numTime + '" required="required">'
            + '<td align="right"><span style="width:10%">问题单据：</span></td>'
            + '<td colspan="2" align="right">'
            + '<select id="billType' + numTime + '" name="billType" type="billType" class="form-control" required>'
            + '<option value="">请选择</option>'
            /*+ '<option value="1">待处理标签</option>'*/
            + '<option value="2">报废单</option>'
            // + '<option value="3">让步接收单</option>'
            + '<option value="4">待处理品单</option>'
            // + '<option value="5">连带报废单</option>'
            + '<option value="6">不合格品抑制单</option>'
            // + '<option value="7">报废单&连带报废单</option>'
            // + '<option value="8">返工/返修/筛选单</option>'

            + '</select></td>'
            // + '<td align="right">责任人：</td>'
            // + '<td align="right"><select id="dutyPerson' + i + '" name="dutyPerson" class="form-control">'
            // + '<option value="">请选择</option>'
            // + '<option value="1">城管并</option>'
            // + '<option value="2">刘伶凯</option>'
            // + '</select></td>'
            + '<td id="saveInput' + numTime + '" align="right">'
            // + '<a href="javascript:;" class="saveInput" >'
            // + '<span class="glyphicon glyphicon-saved"></span> 保存<input type="hidden" id="count' + i + '" required="required" class="count" value=' + i + '>'
            // + '</a>'
            + '</td>'
            + '<td style="width:10%;">&nbsp;</td>'
            + '<td style="width:18%;">&nbsp;</td>'
            + '<td id="shanchu' + numTime + '" align="right">'
            + '<a href="javascript:;" class="delInput" >'
            + '<span class="glyphicon glyphicon-minus"></span> 删除<input type="hidden" id="count' + numTime + '" required="required" class="count" value=' + numTime + '>'
            + '</a>'
            + '</td>'
            + '</tr>';
        $("#doc").append(html);
        numTime++;
        $("#saveBtn").html("<button class=\"btn btn-primary\" id=\"saveQuestionDoc\" type=\"button\" data-toggle=\"modal\"\n" +
            "data-target=\".this-go\">保存\n" +
            "</button>");
    });


    /** 保存问题单据 --批量 **/
    $("body").on('click', '#saveQuestionDoc', function () {
        if ($("#docManage").valid()) {

            var qDocs = $("select[name='billType']");
            var dealStep = $("#measures").val();    //处置措施
            /*if (null == dealStep || "" == dealStep) {
                layer.msg("请选择处置措施");
                return;
            }*/
            var qDocsData = new Array();    //问题单据
            for (var i = 0; i < qDocs.length; i++) {
                var qDoc = $("#billType" + (numTime - i - 1) + "").val();
                /*if (null == qDoc || "" == qDoc) {
                    layer.msg("请选择第" + (numTime - i - 1) + "个问题单据");
                    return;
                }*/
                qDocsData.push(qDoc);
            }
            var qualityType = $("#qualityType").val();
            var measureNo = '${issue.number}';
            $.post("${webPath}/bill/saveBill", {
                qDocs: qDocsData.toString(),
                issueId: ${issue.id},
                issueArea: qualityType,
                measureNo: measureNo,
                tempMeasures: dealStep
            }, function (data) {
                if (data.success) {
                    var list = data.obj;
                    if (list.length > 0) {
                        for (var i = 0; i < list.length; i++) {
                            $("#delInputA" + (numTime - i - 1) + "").remove();
                            $("#doc").children().append('<tr id="delInput' + i + '">&lt;%&ndash;'
                                + '<td align="right"><span style="width:10%">问题单据：</span></td>'
                                + '<td colspan="2" align="right"><input  name="billType" disabled value="' + list[i].billName + '" class="form-control"></td>'
                                + '<td id="saveInput' + i + '" align="right">'
                                + '</td>'
                                + '<td style="width:10%;">&nbsp;</td>'
                                + '<td style="width:18%;">&nbsp;</td>'
                                + '<td align="right">'
                                + '<a href="javascript:;" class="delInput" data-id="' + list[i].id + '" data-num="' + list[i].receiptId + '" >'
                                + '<span class="glyphicon glyphicon-minus"></span> 删除'
                                + '</a>'
                                + '</td>&ndash;%&gt;'
                                + '</tr>');
                        }
                        window.location.href = "${webPath}/bims/apucheck/apuEqr?id=${issue.id}&measures=" + $("#measures option:selected").val();
                    }
                }
            });
        }

    });

    /**
     * 删除事件
     */
    $("body").on('click', '.delInput', function () {
        var num = $(this).find("input").val();
        //删除处理措施
        var billId = $(this).attr("data-id");
        var receiptId = $(this).attr("data-num");
        var this_ = $(this);
        if (billId == null || billId == "") {
            getHadSaveBillTabs();
            //获取当前点击的元素的父级的父级进行删除
            this_.parent().parent().remove();
            numTime--;
        } else {
            layer.confirm('确定删除这个单据吗?', {icon: 3, title: '系统提示'}, function (index) {
                $.ajax({
                    url: "${webPath}/bill/delBill",
                    type: "POST",
                    dataType: "json",
                    data: {
                        id: billId,
                        receiptId: receiptId,
                        issueId: ${issue.id},
                    },
                    success: function (res) {
                        var html = "";
                        if (res.success) {
                            getHadSaveBillTabs();
                            //获取当前点击的元素的父级的父级进行删除
                            this_.parent().parent().remove();
                            numTime--;
                            window.location.reload();
                        }
                    }
                });
                layer.close(index);
            });
        }

        var html = "";
        if ($("#billType" + num + "").val() == 3) {
            $("#bill_tab_content6").remove(html);
        }

    })

    //点击取消到确认页
    function toApuCorrect(id) {
        window.location.href = '${webPath}/back/toApu';
    }

    //是否EQR
    function confirm(id) {
        var isEqr = $('input:radio:checked').val();  //获取选中的radio的值
        var params = $("#docManage").serialize();
        if (isEqr == 1) {
            var eqrLeader = $("#eqrLeader").val();
            var eqrLeaderName = $("#eqrLeader option:checked").text();   //EQR Leader姓名
            if (null == eqrLeader || "" == eqrLeader) {
                layer.msg("请选择EQR Leader");
                return;
            }
            layer.confirm('确定将该问题交由EQR Leader进行处理吗？', {icon: 3, title: '系统提示'}, function (index) {
                $.ajax({
                    url: '${webPath}/bims/apucheck/isEqr/' + isEqr + '/' + eqrLeader,
                    type: "POST",
                    dataType: "json",
                    data: params,
                    success: function (res) {
                        var qualityType = $("#qualityType").val();
                        //隐藏按钮DIV
                        //$("#isEqrStatus").hide();
                        //显示
                        //$("#eqrQDiv").show();
                        if (qualityType == 'A') {
                            /**子菜单*/
                            window.location.href = '${webPath}/back/toApu';
                        } else if (qualityType == 'T') {
                            /**子菜单*/
                            window.location.href = '${webPath}/back/toTzone';
                        } else if (qualityType == 'M') {
                            /**子菜单*/
                            window.location.href = '${webPath}/back/toMachine';
                        }
                    }
                })
                layer.close(index);
            });
        } else if (isEqr == 2) {
            layer.confirm('确定直接选择处理工具吗？', {icon: 3, title: '系统提示'}, function (index) {
                $.ajax({
                    url: '${webPath}/bims/apucheck/isEqr/' + isEqr + '/' + 'none',
                    type: "POST",
                    dataType: "json",
                    data: params,
                    success: function (res) {
                        //window.location.href = '${webPath}/bims/apucheck/apuLearder?id=' + id;
                        //显示处理工具
                        $("#dealTools").show();
                        $("#questionDeal").hide();
                        $("#isEqrStatus").hide();
                    }
                })
                layer.close(index);
            });
            $("#isEqr2").prop("checked", true).trigger('change');
        } else {
            layer.msg("请选择是否EQR！");
        }

    }

    //获取处理记录
    function getDealLog() {
        $.ajax({
            url: "${webPath}/dealLog/getLog",
            type: "get",
            dataType: "json",
            data: {
                issueId: ${issue.id},
            },
            success: function (res) {
                var html = "";
                if (res.success) {
                    var logList = res.obj;
                    for (var i = 0; i < logList.length; i++) {
                        html += '<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">'
                            + '<div style="width:41%; float:left; text-align:right">' + logList[i].processTime + '</div>'
                            + '<div style="width:8%; float:left; text-align:center"><img src="${resPath}/view/static/images/time.png"></div>'
                            + '<div style="width:51%; float:right">' + logList[i].processPerson + '<' + logList[i].processPersonAccount + '>' + ' ' + logList[i].actionName + '</div>'
                            + '</div>';
                    }
                }
                $("#dealLog").append(html);
            }
        })
    }


    //获取工具日志
    function getToolLog(isuseId, toolNo, toolType) {
        $.ajax({
            url: "${webPath}/toolLog/getLog",
            type: "get",
            dataType: "json",
            data: {
                issueId: isuseId,
                toolId: toolNo,
                type: toolType,
            },
            success: function (res) {
                var html = "";
                if (res.success) {
                    var logList = res.obj;
                    for (var i = 0; i < logList.length; i++) {
                        html += '<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">'
                            + '<div style="width:41%; float:left; text-align:right">' + logList[i].processTime + '</div>'
                            + '<div style="width:8%; float:left; text-align:center"><img src="${resPath}/view/static/images/time.png"></div>'
                            + '<div style="width:51%; float:right"> ' + logList[i].action + '</div>'
                            + '</div>';
                    }
                }
                $("#toolLog").html(html);
            }
        })
    }


    //获取待处理标签单据
    function getListByBillType(type) {
        $.ajax({
            url: "${webPath}/bill/getListByBillType",
            type: "POST",
            dataType: "json",
            data: {
                issueId: ${issue.id},
                billType: type,
            },
            success: function (res) {
                var html = "<div role=\"tabpane2\" class=\"tab-pane fade active in\" id=\"tab_content1\" aria-labelledby=\"home-tab\">\n" +
                    "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"table table-hover table-bordered\">\n" +
                    "<tr>\n" +
                    "<td style=\"80%\">";
                if (res.success) {
                    var billlist = res.obj;
                    if (nowAccount != dataAccount) {
                        for (var i = 0; i < billlist.length; i++) {
                            html += "<i class=\"fa fa-table\" style=\"font-size:30px;padding:10px;vertical-align:middle;\"></i>&nbsp;" +
                                "<button type=\"button\" onclick=\"getTagsById(" + billlist[i].receiptId + "," + type + ")\" class=\"btn btn-default btn-sm\" data-toggle=\"modal\" data-target=\".this-biaodan\">" + billlist[i].measureNo + "</button>\n";
                        }
                    } else {
                        for (var i = 0; i < billlist.length; i++) {
                            html += "<i class=\"fa fa-table\" style=\"font-size:30px;padding:10px;vertical-align:middle;\"></i>&nbsp;" +
                                "<button type=\"button\" onclick=\"getTagsById(" + billlist[i].receiptId + "," + type + ")\" class=\"btn btn-default btn-sm\" data-toggle=\"modal\" data-target=\".this-biaodan\">" + billlist[i].measureNo + "</button>\n";
                        }
                    }
                }
                html += "</td>\n" +
                    /*"<td style=\"20%\"><i class=\"fa fa-edit\" style=\"font-size:30px;padding:10px;vertical-align:middle;\"></i>&nbsp;<button type=\"button\" class=\"btn btn-default btn-sm\" data-toggle=\"modal\" data-target=\".this-shenpi\">处理审核</button></td>\n" +*/
                    "</tr>\n" +
                    "</table>\n" +
                    "</div>";
                $("#myTabContent2").html(html);
            }
        })
    }

    function getTagsById(id, type) {
        if (type == 1) {
            window.open('${webPath}/Tagstprocessed/jumpPendingForm/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px,overflow=auto')
        }
        if (type == 2) {
            window.open('${webPath}/ScrapBill/queryScrapForUpdate/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px,overflow=auto')
        }
        if (type == 3) {
            layer.msg("暂无数据")
            return;
        }
        if (type == 4) {
            window.open('${webPath}/PendingDocument/queryPendingDocuments/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px,overflow=auto')
        }
        if (type == 5) {
            layer.msg("暂无数据")
            return;
        }
        if (type == 6) {
            window.open('${webPath}/NonProductContainment/queryNonconformingProductContainmentOrder/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px,overflow=auto')
        }
        if (type == 7) {
            layer.msg("暂无数据")
            return;
        }
        if (type == 8) {
            layer.msg("暂无数据")
            return;
        }
    }

    function getTagstprocessed(id) {
        window.open('${webPath}/Tagstprocessed/jumpPendingForm/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px,overflow=auto')
        //window.location.href='${webPath}/Tagstprocessed/jumpPendingForm/'+id;
    }

    //级联删除单据
    /*function delBill(id, receiptId) {
        $.ajax({
            url: "${webPath}/bill/delBill",
            type: "POST",
            dataType: "json",
            data: {
                id: id,
                receiptId: receiptId,
            },
            success: function (res) {
                if (res.success) {
                    //获取当前点击的元素的父级的父级进行删除
                    //$(this).parent().parent().remove();
                    window.location.reload();
                }
            }
        });
    }*/

    //根据id删除单据
    function deletePendingOrder(id) {
        $.ajax({
            url: '${webPath}/Tagstprocessed/deletePendingOrder/' + id,
            type: "POST",
            dataType: "json",
            data: {},
            success: function (res) {
                if (res.success) {
                    layer.alert("删除成功")
                }
            }
        })
    }

    //点击显示图片
    function showImg(url) {
        $("#show").html("<img src='" + url + "' />");
    }

    //数字校验
    function check(e) {
        var re = /^\d+(?=\.{0,1}\d+$|$)/
        if (e.value != "") {
            if (!re.test(e.value)) {
                e.value = "";
                e.focus();
            }
        }
    }

    //发送邮件
    function send() {
        var params = $("#demo-formEqr").serialize();
        openCar(${issue.id});
        if ($("#demo-formEqr").valid()) {
            var emails = $("#sendEmail").val();
            if (emails == null || emails == "") {
                layer.msg("请选择邮件接收人！");
            }
            var str = emails.toString();
            $("#emailNos").val(str);
            layer.confirm('确定保存并发送邮件吗?', {icon: 3, title: '提示'}, function (index) {
                $.ajax({
                    url: '${webPath}/sendEmail/sendEQR',
                    type: "POST",
                    dataType: "json",
                    data: params,
                    success: function (res) {
                        layer.msg("邮件已发送");
                    },
                    error: function (res) {
                        return;
                    }
                });
                layer.close(index);
            });
        }
    }

    jQuery(document).ready(function () {
        $('#sendEmail').select2({
            placeholder: "-- 输入姓名 --",
            language: "zh-CN",
            minimumInputLength: 1,
            allowClear: true,
            width: '100%',
            escapeMarkup: function (markup) {
                return markup;
            }, // 让template的html显示效果，否则输出代码
            ajax: {
                url: "${webPath}/back/person/queryByName",
                dataType: 'json',
                data: function (params) {
                    return {
                        userName: params.term, // search term
                    };
                },
                processResults: function (data) {
                    var options = new Array();
                    $(data).each(function (i, o) {
                        var email = "";
                        if (o.email == null || o.email == "") {
                            email = '';
                        } else {
                            email = '(' + o.email + ')';
                        }
                        options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                            id: o.email,         //取出items中Code赋值给id
                            text: o.name + email,
                        });
                    });
                    return {
                        results: options        //返回数据
                    };
                },
                cache: true
            }
        });
    });

    //开car处理
    function openCar(id) {
        // layer.confirm('确定保存问题通知单吗?', {icon: 3, title: '系统提示'}, function (index) {
        var params = $("#demo-formEqr").serialize();
        //保存问题通知单
        $.ajax({
            url: '${webPath}/bims/notification/upd',
            type: "POST",
            dataType: "json",
            data: params,
            success: function (res) {
                // layer.msg("保存成功");
                //window.location.href = '${webPath}/bims/apucheck/apuLearder?id=' + id;
            }
        })
        // layer.close(index);
        // });
    }

    /** 展示图片 **/
    function showImg(byteImg) {
        $("#showImg").html("<img style='width: 100%;height: 100%;' src='" + byteImg + "' />");
    }
</script>
</body>
</html>
