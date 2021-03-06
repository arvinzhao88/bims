<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="${resPath}/view/static/images/favicon.ico"
          type="image/ico"/>
    <%--<link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>--%>
    <title>${sysName}</title>
    <%@include file="/view/static/common/global_css.jsp" %>

    <style type="text/css">
        th {
            border-bottom-width: 0px !important;
        }

        th, td {
            text-align: center;
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
    </style>

    <script type="text/javascript">
        var ctx = '${webPath}';
    </script>
</head>

<body class="nav-md">

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
        <%--<div class="right_col" role="main">--%>


        <!-- 内容区开始 -->
        <div class="right_col" role="main">
            <div class="page-title">
                <div class="title_left"><h3>A区 问题处理</h3></div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>问题描述</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a></li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content" style="display:none;">
                            <table width="100%" class="table table-hover table-bordered" id="">
                                <tr>
                                    <th width="10%">厂区：</th>
                                    <td width="23%">${issue.plant}</td>
                                    <th width="10%">发现工位：</th>
                                    <td width="23%">${issue.issueStation}</td>
                                    <th width="10%">发现区域：</th>
                                    <td width="24%">${issue.area}</td>
                                </tr>

                                <tr>
                                    <th>质量分类：</th>
                                    <td>${issue.issueCategoryL1}</td>
                                    <th>问题分类：</th>
                                    <td>${issue.issueCategoryL2}</td>
                                    <th>问题描述：</th>
                                    <td>${issue.issueDesc}</td>
                                </tr>

                                <tr>
                                    <th>工位：</th>
                                    <td>${issue.issueStation}</td>
                                    <th>区域：</th>
                                    <td>${issue.area}</td>
                                    <th>班组：</th>
                                    <td>${issue.area}</td>
                                </tr>

                                <tr>
                                    <th>ESN / SO：</th>
                                    <td>${issue.esn}/${issue.so}</td>
                                    <th>机型：</th>
                                    <td>${issue.engineType}</td>
                                    <th>项目号：</th>
                                    <td>${issue.projectNo}</td>
                                </tr>

                                <tr>
                                    <th>首台ESN：</th>
                                    <td>${issue.esn}</td>
                                    <th>数量：</th>
                                    <td>${issue.qty}</td>
                                    <th>图片附件：</th>
                                    <td>${issue.attach}</td>
                                </tr>

                            </table>
                        </div>
                    </div>

                    <div class="x_panel" style="width:75%;float:left; margin-right:10px;">
                        <div class="x_title">
                            <h2>处理工具</h2><span style="float:right; font-size:14px; margin-top:10px;">状态：<font
                                style="color:#00CC00; font-weight:bold;">处理中</font></span>
                            <div class="clearfix"></div>
                        </div>
                        <!--卡片工具开始-->
                        <div class="x_content">
                            <%--<form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">--%>
                                <div class="form-group">
                                    <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                        <ul id="myTab1" class="nav nav-tabs bar_tabs right" role="tablist">
                                            <li role="presentation" class="active"><a href="#tab_content11"
                                                                                      id="home-tabb" role="tab"
                                                                                      data-toggle="tab"
                                                                                      aria-controls="home"
                                                                                      aria-expanded="true">CAR</a></li>
                                            <li role="presentation" class=""><a href="#tab_content22" role="tab"
                                                                                id="profile-tabb" data-toggle="tab"
                                                                                aria-controls="profile"
                                                                                aria-expanded="false">SCAR</a></li>
                                            <li role="presentation" class=""><a href="#tab_content33" id="home-tabb"
                                                                                role="tab" data-toggle="tab"
                                                                                aria-controls="home"
                                                                                aria-expanded="true">7 STEP</a></li>
                                            <li role="presentation" class=""><a href="#tab_content44" role="tab"
                                                                                id="profile-tabb" data-toggle="tab"
                                                                                aria-controls="profile"
                                                                                aria-expanded="false">Notification</a>
                                            </li>
                                        </ul>


                                        <!--Car表单工具开始-->
                                        <div id="myTabContent2" class="tab-content">
                                            <div role="tabpanel" class="tab-pane fade active in" id="tab_content11"
                                                 aria-labelledby="home-tab">
                                                <!--Car开始-->
                                                <form id="demo-form2" data-parsley-validate
                                                      class="form-horizontal form-label-left">
                                                    <input type="hidden" value="${car.id}" name="id">
                                                    <table id="step1" width="100%" border="0" cellspacing="0" cellpadding="0"
                                                           class="table table-hover table-bordered">
                                                        <tr>
                                                            <td width="23%" align="right">纠正措施报告编号：</td>
                                                            <td width="29%"><input readonly type="text" id="carNo" name="carNo"
                                                                                   required="required"
                                                                                   class="form-control"
                                                                                   value="${car.carNo}"></td>
                                                            <td width="19%" align="right">填写日期：</td>
                                                            <td width="29%"><input readonly type="text" id="createDate"
                                                                                   name="createDate"
                                                                                   required="required"
                                                                                   class="form-control"
                                                                                   value="<fmt:formatDate value="${car.createDate}" pattern="yyyy-MM-dd"/>">
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">发出者：</td>
                                                            <td><input readonly type="text" id="sponsorName" name="sponsorName"
                                                                       required="required"
                                                                       class="form-control"
                                                                       value="${car.sponsorName}"></td>
                                                            <td align="right">责任部门：</td>
                                                            <td><input type="text" id="dutyDept" name="dutyDept"
                                                                       required="required"
                                                                       class="form-control" value="${car.dutyDept}"></td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">责任人：</td>
                                                            <td><input type="text" id="dutyPersonName"
                                                                       name="dutyPersonName" required="required"
                                                                       class="form-control" value="${car.dutyPersonName}"></td>
                                                            <td align="right">CAR类型：</td>
                                                            <td><select disabled name="carType" class="form-control">
                                                                <option value="" >请选择</option>
                                                                <option value="1" <c:if test="${car.carType eq '1' }">selected</c:if>>CAR</option>
                                                                <option value="2" <c:if test="${car.carType eq '2' }">selected</c:if>>SCAR</option>
                                                                <option value="3" <c:if test="${car.carType eq '3' }">selected</c:if>>7STEP</option>
                                                                <option value="4" <c:if test="${car.carType eq '4' }">selected</c:if>>Notifiction</option>
                                                            </select></td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">问题标题：</td>
                                                            <td colspan="3"><input readonly type="text" id="issueTitle"
                                                                                   name="issueTitle"
                                                                                   required="required"
                                                                                   class="form-control"
                                                                                   value="${car.issueTitle}"></td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">发生区域：</td>
                                                            <td colspan="3">
                                                                <input type="radio" class="flat" name="happenArea"
                                                                       id="ISF Plant"
                                                                       value="1" <c:if test="${car.happenArea eq '1' }">checked</c:if>/>&nbsp;ISF Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                <input type="radio" class="flat" name="happenArea"
                                                                       id="X Plant"
                                                                       value="2" <c:if test="${car.happenArea eq '2' }">checked</c:if>/>&nbsp;X Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                <input type="radio" class="flat" name="happenArea"
                                                                       id="OEM"
                                                                       value="3" <c:if test="${car.happenArea eq '3' }">checked</c:if>/>&nbsp;OEM&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                <input type="radio" class="flat" name="happenArea"
                                                                       id="IPTV"
                                                                       value="4" <c:if test="${car.happenArea eq '4' }">checked</c:if>/>&nbsp;IPTV&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                <input type="radio" class="flat" name="happenArea"
                                                                       id="Warranty"
                                                                       value="5" <c:if test="${car.happenArea eq '5' }">checked</c:if>/>&nbsp;Warranty
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">Step1 识别问题：</td>
                                                            <td colspan="3"><input type="text" id="stepOne"
                                                                                   name="stepOne"
                                                                                   required="required"
                                                                                   class="form-control"
                                                                                   value="${car.stepOne}"></td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">上传图片：</td>
                                                            <td><i class="fa fa-file-picture-o"
                                                                   style="font-size:30px;vertical-align:middle;"></i>&nbsp;<button
                                                                    type="button" class="btn btn-default btn-sm">上传图片
                                                            </button>
                                                            </td>
                                                            <td align="right">潜在影响范围/数量：</td>
                                                            <td><input type="text" id="amount" name="amount"
                                                                       required="required"
                                                                       class="form-control" value="${car.amount}"></td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">邮件通知：</td>
                                                            <td><input type="text" id="notice" name="notice"
                                                                       required="required"
                                                                       class="form-control" value=""></td>
                                                            <td align="right">目标关闭日期：</td>
                                                            <td><input type="date" id="aimCloseDate" name="aimCloseDate"
                                                                       required="required" value="<fmt:formatDate value="${car.aimCloseDate}" pattern="yyyy-MM-dd"/>"
                                                                       class="form-control" pattern="yyyy-MM-dd HH:mm:ss"></td>
                                                        </tr>
                                                    </table>
                                                </form>
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center">
                                                        <button class="btn" type="button"
                                                                onClick="javascrtpt:window.location.href='${webPath}/back/toApu'">
                                                            取消
                                                        </button>
                                                        <%--<button class="btn btn-primary" type="button" data-toggle="modal"
                                                                data-target=".this-go">保存
                                                        </button>--%>
                                                        <button class="btn btn-success" type="button" data-toggle="modal"
                                                                data-target=".this-go">提交
                                                        </button>
                                                    </div>
                                                </div>


                                                <!--Car结束-->
                                            </div>
                                            <!--Car表单工具结束-->


                                            <!--SCAR分段附件开始-->
                                            <div role="tabpanel" class="tab-pane fade" id="tab_content22"
                                                 aria-labelledby="profile-tab">
                                                <table width="100%" class="table table-hover table-bordered"
                                                       id="">
                                                    <tr>
                                                        <td colspan="4">
                                                            <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                                    class="fa fa-file-text"></i> SCAR （NO:SCAR201902003）&nbsp;&nbsp;&nbsp;&nbsp;<i
                                                                    class="fa fa-clock-o green"></i> 截至时间：24小时
                                                            </div>
                                                            <div style="color:#5A738E; float:right;">责任人：材料采购部 胡平</div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;1&nbsp;</span>&nbsp;
                                                                Identify the problem.识别问题(5W2H)。
                                                            </div>
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;2&nbsp;</span>&nbsp;
                                                                Identify and Rank Assignable Causes.识别和排列必然原因 (FTA,
                                                                Fishbone, Pareto)。
                                                            </div>
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;3&nbsp;</span>&nbsp;
                                                                Take Short Term Action.采取短期措施。
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
                                                            <i class="fa fa-file-text"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm">上传附件
                                                        </button>
                                                        </td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm"
                                                                data-toggle="modal" data-target=".this-shenpi">处理审核
                                                        </button>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：23:15:10</td>
                                                        <td width="20%">Complete Date 完成日期</td>
                                                        <td width="30%">处理中（以完成系统时间为准）</td>
                                                    </tr>
                                                </table>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal"
                                                                data-target=".this-no">驳回
                                                        </button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal"
                                                                data-target=".this-go">下一步
                                                        </button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->

                                                <table width="100%" class="table table-hover table-bordered"
                                                       id="">
                                                    <tr>
                                                        <td colspan="4">
                                                            <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                                    class="fa fa-file-text"></i> SCAR（NO:SCAR201902003）
                                                                &nbsp;&nbsp;&nbsp;&nbsp;<i
                                                                        class="fa fa-clock-o green"></i> 截至时间：30天
                                                            </div>
                                                            <div style="color:#5A738E; float:right;">责任人：材料采购部 胡平</div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;4&nbsp;</span>&nbsp;
                                                                Determine Assignable
                                                                Cause(s).确定必然原因(FTA.Fishbone.Pareto)。
                                                            </div>
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;5&nbsp;</span>&nbsp;
                                                                Select and Verify the Solution.选择和验证解决方案。
                                                            </div>
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;6&nbsp;</span>&nbsp;
                                                                Implement Permanent Solution.实施永久解决方案。
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
                                                            <i class="fa fa-file-text"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm">上传附件
                                                        </button>
                                                        </td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm"
                                                                data-toggle="modal" data-target=".this-shenpi">处理审核
                                                        </button>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：29天 22:15:38
                                                        </td>
                                                        <td width="20%">Complete Date 完成日期</td>
                                                        <td width="30%">处理中（以完成系统时间为准）</td>
                                                    </tr>
                                                </table>

                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal"
                                                                data-target=".this-no">驳回
                                                        </button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal"
                                                                data-target=".this-go">处理完成
                                                        </button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->

                                                <table width="100%" class="table table-hover table-bordered"
                                                       id="">
                                                    <tr>
                                                        <td colspan="4">
                                                            <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                                    class="fa fa-file-text"></i> SCAR（NO:SCAR201902003）
                                                                &nbsp;&nbsp;&nbsp;&nbsp;<i
                                                                        class="fa fa-clock-o green"></i> 截至时间：7天
                                                            </div>
                                                            <div style="color:#5A738E; float:right;">责任人：材料采购部 胡平</div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">

                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;7&nbsp;</span>&nbsp;
                                                                Monitor.Prevent Recurrence.监控，预防再发生（RCA）。
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
                                                            <i class="fa fa-file-text"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm">上传附件
                                                        </button>
                                                        </td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm"
                                                                data-toggle="modal" data-target=".this-shenpi">处理审核
                                                        </button>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：6天 22:15:38
                                                        </td>
                                                        <td width="20%">Complete Date 完成日期</td>
                                                        <td width="30%">处理中（以完成系统时间为准）</td>
                                                    </tr>
                                                </table>

                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal"
                                                                data-target=".this-no">驳回
                                                        </button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal"
                                                                data-target=".this-go">处理完成
                                                        </button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->

                                            </div>
                                            <!--SCAR分段附件结束-->

                                            <!--7 STEP分段附件结束-->
                                            <div role="tabpanel" class="tab-pane fade" id="tab_content33"
                                                 aria-labelledby="profile-tab">
                                                <table width="100%" class="table table-hover table-bordered"
                                                       id="">
                                                    <tr>
                                                        <td colspan="4">
                                                            <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                                    class="fa fa-file-text"></i> 7 STEP &nbsp;&nbsp;&nbsp;&nbsp;<i
                                                                    class="fa fa-clock-o green"></i> 截至日期：24小时
                                                            </div>
                                                            <div style="color:#5A738E; float:right;">责任人：材料采购部 胡平</div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;1&nbsp;</span>&nbsp;
                                                                Identify the problem.识别问题(5W2H)。
                                                            </div>
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;2&nbsp;</span>&nbsp;
                                                                Identify and Rank Assignable Causes.识别和排列必然原因 (FTA,
                                                                Fishbone, Pareto)。
                                                            </div>
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;3&nbsp;</span>&nbsp;
                                                                Take Short Term Action.采取短期措施。
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
                                                            <i class="fa fa-file-text"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm">上传附件
                                                        </button>
                                                        </td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm"
                                                                data-toggle="modal" data-target=".this-shenpi">处理审核
                                                        </button>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：23:15:10</td>
                                                        <td width="20%">Complete Date 完成日期</td>
                                                        <td width="30%">处理中（以完成系统时间为准）</td>
                                                    </tr>
                                                </table>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal"
                                                                data-target=".this-no">驳回
                                                        </button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal"
                                                                data-target=".this-go">下一步
                                                        </button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->

                                                <table width="100%" class="table table-hover table-bordered"
                                                       id="">
                                                    <tr>
                                                        <td colspan="4">
                                                            <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                                    class="fa fa-file-text"></i> 7 STEP &nbsp;&nbsp;&nbsp;&nbsp;<i
                                                                    class="fa fa-clock-o green"></i> 截至日期：30天
                                                            </div>
                                                            <div style="color:#5A738E; float:right;">责任人：材料采购部 胡平</div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;4&nbsp;</span>&nbsp;
                                                                Determine Assignable
                                                                Cause(s).确定必然原因(FTA.Fishbone.Pareto)。
                                                            </div>
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;5&nbsp;</span>&nbsp;
                                                                Select and Verify the Solution.选择和验证解决方案。
                                                            </div>
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;6&nbsp;</span>&nbsp;
                                                                Implement Permanent Solution.实施永久解决方案。
                                                            </div>

                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
                                                            <i class="fa fa-file-text"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm">上传附件
                                                        </button>
                                                        </td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm"
                                                                data-toggle="modal" data-target=".this-shenpi">处理审核
                                                        </button>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：29天 22:15:38
                                                        </td>
                                                        <td width="20%">Complete Date 完成日期</td>
                                                        <td width="30%">处理中（以完成系统时间为准）</td>
                                                    </tr>
                                                </table>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal"
                                                                data-target=".this-no">驳回
                                                        </button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal"
                                                                data-target=".this-go">下一步
                                                        </button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->

                                                <table width="100%" class="table table-hover table-bordered"
                                                       id="">
                                                    <tr>
                                                        <td colspan="4">
                                                            <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                                    class="fa fa-file-text"></i> 7 STEP &nbsp;&nbsp;&nbsp;&nbsp;<i
                                                                    class="fa fa-clock-o green"></i> 截至日期：7 天
                                                            </div>
                                                            <div style="color:#5A738E; float:right;">责任人：材料采购部 胡平</div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <div class="form-group"
                                                                 style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                                <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;7&nbsp;</span>&nbsp;
                                                                Monitor.Prevent Recurrence.监控，预防再发生（RCA）。
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
                                                            <i class="fa fa-file-text"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm">上传附件
                                                        </button>
                                                        </td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm"
                                                                data-toggle="modal" data-target=".this-shenpi">处理审核
                                                        </button>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：6 天 22:15:38
                                                        </td>
                                                        <td width="20%">Complete Date 完成日期</td>
                                                        <td width="30%">处理中（以完成系统时间为准）</td>
                                                    </tr>
                                                </table>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal"
                                                                data-target=".this-no">驳回
                                                        </button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal"
                                                                data-target=".this-go">处理完成
                                                        </button>
                                                    </div>
                                                </div>

                                            </div>
                                            <!--7 STEP分段附件结束-->

                                            <!--Notification开始-->
                                            <div role="tabpanel" class="tab-pane fade" id="tab_content44"
                                                 aria-labelledby="profile-tab">
                                                <table width="100%" class="table table-hover table-bordered"
                                                       id="" style="font-size:12px;">
                                                    <tr>
                                                        <td colspan="4">
                                                            <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                                    class="fa fa-file-text"></i> Notification
                                                            </div>
                                                            <div style="color:#5A738E; float:right;">责任人：售后质量工程师 胡平
                                                            </div>

                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td>
                                                            <textarea name="message" rows="4" class="form-control"
                                                                      id="message" required="required"
                                                                      data-parsley-trigger="keyup"
                                                                      data-parsley-minlength="20"
                                                                      data-parsley-maxlength="100">请输入</textarea>
                                                        </td>
                                                    </tr>
                                                </table>
                                                <h2>邮件接收人</h2>
                                                <select class="form-control">
                                                    <option>请选择</option>
                                                    <option>XXXX</option>
                                                    <option>XXXX</option>
                                                </select>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div class="form-group" style="text-align:center">
                                                        <!--<button class="btn" type="button" onClick="javascrtpt:window.location.href='z_a_leader.html'">取消</button>-->
                                                        <button class="btn btn-success" type="reset" data-toggle="modal"
                                                                data-target=".this-true">问题关闭
                                                        </button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->
                                                <!--Notification结束-->
                                            </div>
                                        </div>
                                        <!--Notification直接附件结束-->

                                    </div>
                                </div>
                            <%--</form>--%>
                        </div>
                        <!--卡片工具完成-->
                    </div>

                    <!--处理记录开始-->
                    <div class="x_panel" style="width:calc(25% - 10px); float:left;">
                        <div class="x_title">
                            <h2>处理记录</h2>
                            <div class="clearfix"></div>
                        </div>
                        <div id="dealLog" class="x_content">

                        </div>
                        <!--处理记录结束-->
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

<!-- 遮蔽内容开始 -->
<div class="modal fade this-shenpi" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:900px;padding-top:50px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">处理工具审批</h4>
            </div>
            <div class="modal-body">
                <br><br><br><br>
                <p>此处为审批流程处理内容区</p>
                <br><br><br><br>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onClick="javascrtpt:window.location.href='z_a_ts1.html'">确定
                </button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade this-go" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel1">确定</h4>
            </div>
            <div class="modal-body">
                <p>确定提交吗?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onclick="submit(${car.id},${car.issueId})">确定</button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->


<!-- 遮蔽内容开始 -->
<div class="modal fade this-biaodan" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:900px;padding-top:50px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">这里是问题附加表单的名称</h4>
            </div>
            <div class="modal-body">
                <br><br><br><br>
                <p>此处为处理附加表单的内容区</p>
                <br><br><br><br>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onClick="javascrtpt:window.location.href='z_a_ts1.html'">确定
                </button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->
<!-- 遮蔽内容开始 -->
<div class="modal fade this-no" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">驳回</h4>
            </div>
            <div class="modal-body">
                <p>请输入驳回原因！</p>
                <textarea name="message" rows="4" class="form-control" id="message" required="required"
                          data-parsley-trigger="keyup" data-parsley-minlength="20"
                          data-parsley-maxlength="100">请输入</textarea>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-danger" data-dismiss="modal">驳回</button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->
<%@include file="/view/static/common/core_js.jsp" %>
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
    $("#menuA").addClass("current-page");

</script>
<script>
    //获取处理记录
    $(function getDealLog() {
        $.ajax({
            url: "${webPath}/dealLog/getLog",
            type: "POST",
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
                            + '<div style="width:8%; float:left; text-align:center"><img src="/view/static/images/time.png"></div>'
                            + '<div style="width:51%; float:right">' + logList[i].processPerson + ' ' + logList[i].actionName + '</div>'
                            + '</div>';
                    }
                }
                ;
                $("#dealLog").append(html);
            }
        })
    })

    //默认选中第一个
    /*$(function () {
        $('input:radio:first').attr('checked', 'checked');
    })*/


    //提交
    function submit(carId,issueId) {
        var params = $("#demo-form2").serialize();
        $.ajax({
            url: '${webPath}/car/addStep1',
            type: "POST",
            dataType: "json",
            data: params,
            success: function(res) {
                window.location.href='${webPath}/bims/apucheck/toCarStep27?carId='+carId+'&issueId='+issueId;
            }
        })

    }
</script>
</body>
</html>
