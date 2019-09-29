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
    <link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>
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
                                                <input type="hidden" value="${car.carNo}" name="carNo">
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                                       class="table table-hover table-bordered">

                                                    <div class="ln_solid"></div>
                                                    <div class="x_title">
                                                        <h2>Step1：</h2>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <tr>
                                                        <td width="23%" align="right">纠正措施报告编号：</td>
                                                        <td width="29%"><input readonly type="text" id="carNo"
                                                                               name="carNo"
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
                                                        <td><input readonly type="text" id="sponsorName"
                                                                   name="sponsorName"
                                                                   required="required"
                                                                   class="form-control"
                                                                   value="${car.sponsorName}"></td>
                                                        <td align="right">责任部门：</td>
                                                        <td><input readonly type="text" id="dutyDept" name="dutyDept"
                                                                   required="required"
                                                                   class="form-control" value="${car.dutyDept}"></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="right">责任人：</td>
                                                        <td><input readonly type="text" id="dutyPersonName"
                                                                   name="dutyPersonName" required="required"
                                                                   class="form-control" value="${car.dutyPersonName}">
                                                        </td>
                                                        <td align="right">CAR类型：</td>
                                                        <td><select disabled name="carType" class="form-control">
                                                            <option value="">请选择</option>
                                                            <option value="1"
                                                                    <c:if test="${car.carType eq '1' }">selected</c:if>>
                                                                CAR
                                                            </option>
                                                            <option value="2"
                                                                    <c:if test="${car.carType eq '2' }">selected</c:if>>
                                                                SCAR
                                                            </option>
                                                            <option value="3"
                                                                    <c:if test="${car.carType eq '3' }">selected</c:if>>
                                                                7STEP
                                                            </option>
                                                            <option value="4"
                                                                    <c:if test="${car.carType eq '4' }">selected</c:if>>
                                                                Notifiction
                                                            </option>
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
                                                            <input disabled type="radio" class="flat" name="happenArea"
                                                                   id="ISF Plant"
                                                                   value="1"
                                                                   <c:if test="${car.happenArea eq '1' }">checked</c:if>/>&nbsp;ISF
                                                            Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input disabled type="radio" class="flat" name="happenArea"
                                                                   id="X Plant"
                                                                   value="2"
                                                                   <c:if test="${car.happenArea eq '2' }">checked</c:if>/>&nbsp;X
                                                            Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input disabled type="radio" class="flat" name="happenArea"
                                                                   id="OEM"
                                                                   value="3"
                                                                   <c:if test="${car.happenArea eq '3' }">checked</c:if>/>&nbsp;OEM&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input disabled type="radio" class="flat" name="happenArea"
                                                                   id="IPTV"
                                                                   value="4"
                                                                   <c:if test="${car.happenArea eq '4' }">checked</c:if>/>&nbsp;IPTV&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input disabled type="radio" class="flat" name="happenArea"
                                                                   id="Warranty"
                                                                   value="5"
                                                                   <c:if test="${car.happenArea eq '5' }">checked</c:if>/>&nbsp;Warranty
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td align="right">Step1 识别问题：</td>
                                                        <td colspan="3"><input readonly type="text" id="stepOne"
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
                                                        <td><input readonly type="text" id="amount" name="amount"
                                                                   required="required"
                                                                   class="form-control" value="${car.amount}"></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="right">邮件通知：</td>
                                                        <td><input readonly type="text" id="notice" name="notice"
                                                                   required="required"
                                                                   class="form-control" value=""></td>
                                                        <td align="right">目标关闭日期：</td>
                                                        <td><input readonly type="date" id="aimCloseDate"
                                                                   name="aimCloseDate"
                                                                   required="required"
                                                                   class="form-control"
                                                                   value="<fmt:formatDate value="${car.aimCloseDate}" pattern="yyyy-MM-dd"/>">
                                                        </td>
                                                    </tr>
                                                </table>

                                                <div class="ln_solid"></div>
                                                <div class="x_title">
                                                    <h2>Step2识别和排列必然因素：</h2>
                                                    <div class="clearfix"></div>
                                                </div>

                                                <div class="form-group">
                                                    <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                                           style="border-collapse:separate;border-spacing:15px;">
                                                        <tr>
                                                            <td align="right" style="width:17%">必然因素：</td>
                                                            <td><input type="text" id="stepTwo" name="stepTwo"
                                                                       required="required" class="form-control"
                                                                       value="${car.stepTwo}"></td>
                                                            <td width="8%" align="right">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">附件上传：</td>

                                                            <td><i class="fa fa fa-file-text"
                                                                   style="font-size:30px;vertical-align:middle;"></i>&nbsp;
                                                                <button id="yyzz" type="button" class="btn btn-default btn-sm" onclick="$('#YYZZFBSMJ').click();">
                                                                上传附件
                                                                </button>
                                                                <input type="file" name="YYZZFBSMJ" id="YYZZFBSMJ" style="display: none;" onchange="setp2File()">
                                                                <input type="hidden" name="" id="setp2file" style="display: none;">
                                                            </td>
                                                            <td align="right"><p id="setp2fileName"></p></td>
                                                        </tr>
                                                    </table>
                                                </div>

                                                <div class="ln_solid"></div>
                                                <div class="x_title">
                                                    <h2>Step3 采取短期措施</h2>
                                                    <div class="clearfix"></div>
                                                </div>
                                                <div id="step3" class="form-group">

                                                </div>
                                                <div class="form-group">
                                                    <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                                           style="border-collapse:separate;border-spacing:15px;">
                                                        <tr>
                                                            <td align="right" style="width:17%">断点：</td>
                                                            <td><input type="text" id="breakpoint" name="breakpoint"
                                                                       required="required" class="form-control"
                                                                       value="${car.breakpoint}"></td>
                                                            <td width="8%" align="right">&nbsp;</td>
                                                        </tr>
                                                    </table>
                                                </div>

                                                <div class="ln_solid"></div>
                                                <div class="x_title">
                                                    <h2>Step4 确定必然因素</h2>
                                                    <div class="clearfix"></div>
                                                </div>
                                                <div id="step4" class="form-group">

                                                </div>


                                                <div class="ln_solid"></div>
                                                <div class="x_title">
                                                    <h2>Step5 选择和验证解决方案</h2>
                                                    <div class="clearfix"></div>
                                                </div>

                                                <div class="ln_solid"></div>

                                                <div id="step5" class="form-group">

                                                </div>


                                                <div class="ln_solid"></div>
                                                <div class="x_title">
                                                    <h2>Step6 实施永久解决方案</h2>
                                                    <div class="clearfix"></div>
                                                </div>

                                                <div id="step6" class="form-group">

                                                </div>
                                                <div id="step6addfile" class="form-group">
                                                    <tr>
                                                        <td width="20%" align="right" style="width:17%">文件名：
                                                        </td>
                                                        <td colspan="5">
                                                            <p id="setp6fileName"></p>
                                                        </td>
                                                    </tr>
                                                </div>
                                                <div class="form-group">
                                                    <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                                           style="border-collapse:separate;border-spacing:15px;">
                                                        <tr>
                                                            <td width="20%" align="right" style="width:17%">改进过程：
                                                            </td>
                                                            <td colspan="5">
                                                                <input type="radio" class="flat" name="improve"
                                                                       id="ER" value="ER" checked="" required/>&nbsp;ER&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                <input type="radio" class="flat" name="improve"
                                                                       id="MCR" value="MCR"/>&nbsp;MCR&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                <input type="radio" class="flat" name="improve"
                                                                       id="SCR" value="SCR"/>&nbsp;SCR&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">断点：</td>
                                                            <td><input name="breakpoint" type="text" id="breakpoint"
                                                                       required="required" class="form-control"
                                                                       value="${car.breakpoint}"></td>
                                                            <td align="right">更新文件：</td>
                                                            <td><input name="updateFile" type="text" id="updateFile"
                                                                       required="required" class="form-control"
                                                                       value="${car.updateFile}"></td>
                                                            <td align="right"></td>
                                                        </tr>
                                                    </table>
                                                </div>
                                                <div class="ln_solid"></div>
                                                <%--<div class="form-group">
                                                    <div style="text-align:center">
                                                        <button class="btn" type="button"
                                                                onClick="javascrtpt:window.location.href='z_a_eqr.html'">
                                                            取消
                                                        </button>
                                                        <button class="btn btn-primary" type="button" data-toggle="modal"
                                                                data-target=".this-go">保存
                                                        </button>
                                                    </div>
                                                </div>--%>


                                                <div class="x_title">
                                                    <h2>Step7.1 防止再发生</h2>
                                                    <div class="clearfix"></div>
                                                </div>
                                                <div class="form-group">
                                                    <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                                           style="border-collapse:separate;border-spacing:15px;">
                                                        <tr>
                                                            <td align="right" style="width:17%">RCA：</td>
                                                            <td><input name="rac" type="text" id="rac"
                                                                       required="required" class="form-control"
                                                                       value="${car.rac}"></td>
                                                            <td align="right">7步法报告上传：</td>
                                                            <td><i class="fa fa fa-file-text"
                                                                   style="font-size:30px;vertical-align:middle;"></i>&nbsp;
                                                                <button type="button" class="btn btn-default btn-sm" onclick="$('#SSTTEEPP7').click();">
                                                                    上传附件
                                                                </button>
                                                                <input type="file" name="SSTTEEPP7" id="SSTTEEPP7" style="display: none;" onchange="step7File()">
                                                                <input type="hidden" name="" id="setp7file" style="display: none;">
                                                            </td>
                                                            <td align="right"><p id="setp7fileName"></p></td>
                                                        </tr>

                                                    </table>
                                                </div>
                                            </form>

                                            <div class="ln_solid"></div>
                                            <div id="carbtn" class="form-group">
                                                <div style="text-align:center">
                                                    <%--<button class="btn" type="button"
                                                            onClick="">
                                                        取消
                                                    </button>--%>
                                                    <button class="btn btn-primary" type="button" data-toggle="modal"
                                                            data-target=".this-go">保存
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
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onclick="checkNull(${car.id},${issue.id})">确定
                </button>
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
    $(document).ready(function () {
        getDutyPerson();
    });
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
    $(function () {
        $('input:radio:first').attr('checked', 'checked');
    })

    function checkNull(carId, issueId){
        $("#demo-form2").validate();
        if($("#demo-form2").valid()){
            submit(carId, issueId);
        }
        return;
    };

    //提交
    function submit(carId, issueId) {

        var carNo = '${car.carNo}';
        var stepTwo = $("#stepTwo").val();
        var breakpoint = $("#breakpoint").val();
        var improve = $("#improve").val();
        var updateFile = $("#updateFile").val();
        var rac = $("#rac").val();
        var arr = new Array();

        //step2附件
        var setp2filePath = $("#setp2file").val();
        arr.push({
            carStep: "2",
            attachName: "" + setp2filePath + "",
        })

        //step6附件
        var setp6filePath = $("#step6file").val();


        //step7.1附件
        var setp7filePath = $("#setp7file").val();
        arr.push({
            carStep: "7",
            reportName: "" + setp7filePath + "",
        })

        let step3 = $('#step3').find("table");
        for (let i = 0; i < step3.length; i++) {
            let measure = step3.eq(i).find('input[name="measure"]').val();
            let thirdDutyPerson = step3.eq(i).find('input[name="thirdDutyPerson"]').val();
            let thirdExecuteDate = step3.eq(i).find('input[name="thirdExecuteDate"]').val();
            arr.push({
                carStep: "3",
                measure: "" + measure + "",
                thirdDutyPerson: "" + thirdDutyPerson + "",
                thirdExecuteDate: "" + thirdExecuteDate + ""
            })
        }
        ;

        let step4 = $('#step4').find("table");
        for (let i = 0; i < step4.length; i++) {
            let reason = step4.eq(i).find('input[name="reason"]').val();
            let method = step4.eq(i).find('input[name="method"]').val();
            let fourthDutyPerson = step4.eq(i).find('input[name="fourthDutyPerson"]').val();
            let fourthDate = step4.eq(i).find('input[name="fourthDate"]').val();
            let conclusion = step4.eq(i).find('input[name="conclusion"]').val();
            arr.push({
                carStep: "4",
                reason: "" + reason + "",
                method: "" + method + "",
                fourthDutyPerson: "" + fourthDutyPerson + "",
                fourthDate: "" + fourthDate + "",
                conclusion: "" + conclusion + ""
            })
        }
        ;

        let step5 = $('#step5').find("table");
        for (let i = 0; i < step5.length; i++) {
            let scheme = step5.eq(i).find('input[name="scheme"]').val();
            let schemeResult = step5.eq(i).find('input[name="schemeResult"]').val();
            let fifthDate = step5.eq(i).find('input[name="fifthDate"]').val();
            let action = step5.eq(i).find('input[name="action"]').val();
            arr.push({
                carStep: "5",
                carId: "" + carId + "",
                scheme: "" + scheme + "",
                schemeResult: "" + schemeResult + "",
                fifthDate: "" + fifthDate + "",
                action: "" + action + ""
            })
        }
        ;

        let step6 = $('#step6').find("table");
        for (let i = 0; i < step6.length; i++) {
            let lastScheme = step6.eq(i).find('input[name="lastScheme"]').val();
            let sixthDutyPerson = step6.eq(i).find('input[name="sixthDutyPerson"]').val();
            let sixthDate = step6.eq(i).find('input[name="sixthDate"]').val();
            let sixthExecuteDate = step6.eq(i).find('input[name="sixthExecuteDate"]').val();
            /*let sixthAttach = step6.eq(i).find('input[name="sixthAttach"]').val();
            let sixthAttachName = step6.eq(i).find('input[name="sixthAttachName"]').val();
            let sixthAttachDesc = step6.eq(i).find('input[name="sixthAttachDesc"]').val();*/
            arr.push({
                carStep: "6",
                lastScheme: "" + lastScheme + "",
                sixthDutyPerson: "" + sixthDutyPerson + "",
                sixthDate: "" + sixthDate + "",
                sixthExecuteDate: "" + sixthExecuteDate + "",
                sixthAttach: "" + setp6filePath + "",
                /*sixthAttach: "" + sixthAttach + "",
                sixthAttachName: "" + sixthAttachName + "",
                sixthAttachDesc: "" + sixthAttachDesc + ""*/
            })
        }
        ;
        var params = {
            "id": "" + carId + "",
            "carNo": "" + carNo + "",
            "stepTwo": "" + stepTwo + "",
            "breakpoint": "" + breakpoint + "",
            "improve": "" + improve + "",
            "updateFile": "" + updateFile + "",
            "rac": "" + rac + "",
            "ext": arr
        };
        console.log(JSON.stringify(params))
        $.ajax({
            url: '${webPath}/car/updStep',
            type: "POST",
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(params),
            success: function (res) {
                $("#carbtn").hide();
                $(":input").attr("disabled","disabled");
                $(":checkbox").attr("disabled","disabled");
                $(":selected").attr("disabled","disabled");
                $(":button").attr("disabled","disabled");
                <%--window.location.href = '${webPath}/bims/apucheck/toCarStep27detail?carId=' + carId + '&issueId=' + issueId;--%>
            }
        })
    }

    //加载step3
    $(function () {
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">短期措施：</td>'
            + '<td colspan="3"><input name="measure" type="text" id="measure" required="required" class="form-control" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="addInputReturn3">'
            + '<span class="glyphicon glyphicon-plus"></span> 添加'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">责任人：</td>'
            + '<td><select  name="thirdDutyPerson" type="text" id="thirdDutyPerson" required="required" class="form-control" value=""></select></td>'
            + '<td align="right">执行日期：</td>'
            + '<td><input name="thirdExecuteDate" type="date" id="thirdExecuteDate" required="required" class="form-control" value=""></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step3").append(html);
        getDutyPerson('thirdDutyPerson');
    })

    //加载step4
    $(function () {
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">潜在原因：</td>'
            + '<td colspan="3"><input name="reason" type="text" id="reason" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="addInputReturn4">'
            + '<span class="glyphicon glyphicon-plus"></span> 添加'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">验证方法：</td>'
            + '<td><input name="method" type="text" id="method" required="required" class="form-control" value=""></td>'
            + '<td align="right">责任人：</td>'
            + '<td><select name="fourthDutyPerson" type="text" id="fourthDutyPerson" required="required" class="form-control" value=""></select></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="fourthDate" type="date" id="fourthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">结论 Y/N：</td>'
            + '<td><select name="conclusion" type="text" id="conclusion" required="required" class="form-control" value="">'
            + '<option value=""></option>'
            + '<option value="YES">YES</option>'
            + '<option value="NO">NO</option>'
            + '</select>'
            + '</td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step4").append(html);
        getDutyPerson('fourthDutyPerson');
    })

    //加载step5
    $(function () {
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">解决潜在原因方案：</td>'
            + '<td colspan="3"><input name="scheme" type="text" id="scheme" required="required" class="form-control" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="addInputReturn5">'
            + '<span class="glyphicon glyphicon-plus"></span> 添加'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">验证结果：</td>'
            + '<td><input name="schemeResult" type="text" id="schemeResult" required="required" class="form-control" value=""></td>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="fifthDate" type="date" id="fifthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">关键行动：</td>'
            + '<td><input name="action" type="text" id="action" required="required" class="form-control" value=""></td>'
            + '<td align="right">&nbsp;</td>'
            + '<td>&nbsp;</td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step5").append(html);
    })

    //加载step6
    $(function () {
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">永久解决方案：</td>'
            + '<td colspan="3"><input name="lastScheme" type="text" id="lastScheme" required="required" class="form-control" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="addInputReturn6">'
            + '<span class="glyphicon glyphicon-plus"></span> 添加'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">责任人：</td>'
            + '<td><select name="sixthDutyPerson" type="text" id="sixthDutyPerson" required="required" class="form-control" value=""></select></td>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="sixthDate" type="date" id="sixthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">执行日期：</td>'
            + '<td><input name="sixthExecuteDate" type="date" id="sixthExecuteDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '<td>&nbsp;</td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step6").append(html);
        getDutyPerson('sixthDutyPerson');
    })

    //setp6添加附件
    $(function () {
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">添加附件：</td>'
            + '<td colspan="3"><i class="fa fa fa-file-text" style="font-size:30px;vertical-align:middle;"></i>&nbsp;'
            + '<button type="button" class="btn btn-default btn-sm" onclick=$("#AAABBB").click();>上传附件</button>'
            + '<input type="file" name="AAABBB" id="AAABBB" style="display: none;" onchange=step6File()>'
            + '<input type="hidden" name="" id="step6file" style="display: none;">'
            + '<td align="right">'
            // + '<a href="javascript:;" class="addStep6addfile">'
            // + '<span class="glyphicon glyphicon-plus"></span> 添加'
            // + '</a>'
            + '</td>'
            + '</tr>'
            + '</table>';
        $("#step6addfile").append(html);
    })


    $("body").on('click', '.addInputReturn3', function () {
        //step3添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">短期措施：</td>'
            + '<td colspan="3"><input name="measure" type="text" id="measure" required="required" class="form-control" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput3">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">责任人：</td>'
            + '<td><select  name="thirdDutyPerson" type="text" id="thirdDutyPerson" required="required" class="form-control" value=""></select></td>'
            + '<td align="right">执行日期：</td>'
            + '<td><input name="thirdExecuteDate" type="date" id="thirdExecuteDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step3").append(html);
        getDutyPerson('thirdDutyPerson');
    })

    $("body").on('click', '.addInputReturn4', function () {
        //step4添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">潜在原因：</td>'
            + '<td colspan="3"><input name="reason" type="text" id="reason" required="required" class="form-control" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput4">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">验证方法：</td>'
            + '<td><input name="method" type="text" id="method" required="required" class="form-control" value=""></td>'
            + '<td align="right">责任人：</td>'
            + '<td><select name="fourthDutyPerson" type="text" id="fourthDutyPerson" required="required" class="form-control" value=""></select></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="fourthDate" type="date" id="fourthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">结论 Y/N：</td>'
            + '<td><select name="conclusion" type="text" id="conclusion" required="required" class="form-control" value="">'
            + '<option value=""></option>'
            + '<option value="YES">YES</option>'
            + '<option value="NO">NO</option>'
            + '</select>'
            + '</td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step4").append(html);
        getDutyPerson('fourthDutyPerson');
    })

    $("body").on('click', '.addInputReturn5', function () {
        //step5添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">解决潜在原因方案：</td>'
            + '<td colspan="3"><input name="scheme" type="text" id="scheme" required="required" class="form-control" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput5">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">验证结果：</td>'
            + '<td><input name="schemeResult" type="text" id="schemeResult" required="required" class="form-control" value=""></td>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="fifthDate" type="date" id="fifthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">关键行动：</td>'
            + '<td><input name="action" type="text" id="action" required="required" class="form-control" value=""></td>'
            + '<td align="right">&nbsp;</td>'
            + '<td>&nbsp;</td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step5").append(html);
    })

    $("body").on('click', '.addInputReturn6', function () {
        //step6添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">永久解决方案：</td>'
            + '<td colspan="3"><input name="lastScheme" type="text" id="lastScheme" required="required" class="form-control" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput6">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">责任人：</td>'
            + '<td><select name="sixthDutyPerson" type="text" id="sixthDutyPerson" required="required" class="form-control" value=""></select></td>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="sixthDate" type="date" id="sixthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">执行日期：</td>'
            + '<td><input name="sixthExecuteDate" type="date" id="sixthExecuteDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '<td>&nbsp;</td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step6").append(html);
        getDutyPerson('sixthDutyPerson');
    })


    $("body").on('click', '.addStep6addfile', function () {
        //step6addfile添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">添加附件：</td>'
            + '<td colspan="3"><i class="fa fa fa-file-text" style="font-size:30px;vertical-align:middle;"></i>&nbsp;'
            + '<button type="button" class="btn btn-default btn-sm" onclick=$("#AAABBB").click();>上传附件</button>'
            + '<input type="file" name="AAABBB" id="AAABBB" style="display: none;" onchange=step6File()>'
            + '<input type="hidden" name="" id="step6file" style="display: none;">'
            + '<td align="right">'
            + '<a href="javascript:;" class="delStep6addfile">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '</table>';
        $("#step6addfile").append(html);
    })

    /**
     * 删除事件
     */
    $("body").on('click', '.delInput3', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().remove();
    })
    $("body").on('click', '.delInput4', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().remove();
    })
    $("body").on('click', '.delInput5', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().remove();
    })
    $("body").on('click', '.delInput6', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().remove();
    })
    $("body").on('click', '.delStep6addfile', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().remove();
    })
/*
    $(function getCarExtList() {
        var id = ${car.id};
        $.ajax({
            url: "${webPath}/car/getExtCar",
            type: "POST",
            dataType: "json",
            data: {
                id: id,
            },
            success: function (res) {
                console.log(res)
                var id = res.obj.id;
                if (res.success) {
                    for (let i = 0; i <res.obj.length ; i++) {
                        if (res.obj[i].carStep =="3"){
                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">短期措施：</td>'
                                + '<td colspan="3"><input name="measure" type="text" id="measure" required="required" class="form-control" value="'+res.obj[i].measure+'"></td>'
                                + '<td align="right">'
                                + '<a href="javascript:;" class="addInputReturn3">'
                                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                + '</a>'
                                + '</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">责任人：</td>'
                                + '<td><input name="thirdDutyPerson" type="text" id="thirdDutyPerson" required="required" class="form-control" value="'+res.obj[i].thirdDutyPerson+'"></td>'
                                + '<td align="right">执行日期：</td>'
                                + '<td><input name="thirdExecuteDate" type="date" id="thirdExecuteDate" required="required" class="form-control" value="'+res.obj[i].thirdExecuteDate+'"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '</table>';
                            $("#step3").append(html);
                        }
                        if (res.obj[i].carStep=="4"){
                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">潜在原因：</td>'
                                + '<td colspan="3"><input name="reason" type="text" id="reason" required="required" class="form-control" value="'+res.obj[i].reason+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">'
                                + '<a href="javascript:;" class="addInputReturn4">'
                                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                + '</a>'
                                + '</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">验证方法：</td>'
                                + '<td><input name="method" type="text" id="method" required="required" class="form-control" value="'+res.obj[i].method+'"></td>'
                                + '<td align="right">责任人：</td>'
                                + '<td><input name="fourthDutyPerson" type="text" id="fourthDutyPerson" required="required" class="form-control" value="'+res.obj[i].fourthDutyPerson+'"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">目标日期：</td>'
                                + '<td><input name="fourthDate" type="date" id="fourthDate" required="required" class="form-control" value="'+res.obj[i].fourthDate+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">结论 Y/N：</td>'
                                + '<td><input name="conclusion" type="text" id="conclusion" required="required" class="form-control" value="'+res.obj[i].conclusion+'"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '</table>';
                            $("#step4").append(html);
                        }
                        if (res.obj[i].carStep=="5"){
                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">解决潜在原因方案：</td>'
                                + '<td colspan="3"><input name="scheme" type="text" id="scheme" required="required" class="form-control" value="'+res.obj[i].scheme+'"></td>'
                                + '<td align="right">'
                                + '<a href="javascript:;" class="addInputReturn5">'
                                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                + '</a>'
                                + '</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">验证结果：</td>'
                                + '<td><input name="schemeResult" type="text" id="schemeResult" required="required" class="form-control" value="'+res.obj[i].schemeResult+'"></td>'
                                + '<td align="right">目标日期：</td>'
                                + '<td><input name="fifthDate" type="date" id="fifthDate" required="required" class="form-control" value="'+res.obj[i].fifthDate+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">关键行动：</td>'
                                + '<td><input name="action" type="text" id="action" required="required" class="form-control" value="'+res.obj[i].action+'"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '<td>&nbsp;</td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '</table>';
                            $("#step5").append(html);
                        }
                        if (res.obj[i].carStep=="6"){
                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">永久解决方案：</td>'
                                + '<td colspan="3"><input name="lastScheme" type="text" id="lastScheme" required="required" class="form-control" value="'+res.obj[i].lastScheme+'"></td>'
                                + '<td align="right">'
                                + '<a href="javascript:;" class="addInputReturn6">'
                                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                + '</a>'
                                + '</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">责任人：</td>'
                                + '<td><input name="sixthDutyPerson" type="text" id="sixthDutyPerson" required="required" class="form-control" value="'+res.obj[i].sixthDutyPerson+'"></td>'
                                + '<td align="right">目标日期：</td>'
                                + '<td><input name="sixthDate" type="date" id="sixthDate" required="required" class="form-control" value="'+res.obj[i].sixthDate+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">执行日期：</td>'
                                + '<td><input name="sixthExecuteDate" type="date" id="sixthExecuteDate" required="required" class="form-control" value="'+res.obj[i].sixthExecuteDate+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '<td>&nbsp;</td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '</table>';
                            $("#step6").append(html);
                        }
                    }

                }
            }
        });
    })*/

    //step2附件上传
    function setp2File(){
        var formData = new FormData();
        formData.append("file",$('#YYZZFBSMJ')[0].files[0]);
        console.log($('#YYZZFBSMJ')[0].files[0])
        $("#setp2fileName").text($('#YYZZFBSMJ')[0].files[0].name);
        $.ajax({
            type: 'post',
            //url: "http://test.cncnews.cn/wup/webUploader",
            url: "${webPath}/uploadFile/uploader",
            data: formData,
            dataType: "json",
            cache: false,
            processData: false,
            contentType: false,
        }).success(function (data) {
            console.log(data.imgPath);
            $("#setp2file").val(data.imgPath);
        }).error(function () {
            return layer.msg('上传失败');
        });
    }

    //step6附件上传
    function step6File(){
        var formData = new FormData();
        formData.append("file",$("#AAABBB")[0].files[0]);
        console.log($("#AAABBB")[0].files[0])
        $("#setp6fileName").text($("#AAABBB")[0].files[0].name);
        $.ajax({
            type: 'post',
            //url: "http://test.cncnews.cn/wup/webUploader",
            url: "${webPath}/uploadFile/uploader",
            data: formData,
            dataType: "json",
            cache: false,
            processData: false,
            contentType: false,
        }).success(function (data) {
            console.log(data.imgPath);
            $("#step6file").val(data.imgPath);
        }).error(function () {
            return layer.msg('上传失败');
        });
    }

    //step7附件上传
    function step7File(){
        var formData = new FormData();
        formData.append("file",$("#SSTTEEPP7")[0].files[0]);
        console.log($("#SSTTEEPP7")[0].files[0])
        $("#setp7fileName").text($("#SSTTEEPP7")[0].files[0].name);
        $.ajax({
            type: 'post',
            //url: "http://test.cncnews.cn/wup/webUploader",
            url: "${webPath}/uploadFile/uploader",
            data: formData,
            dataType: "json",
            cache: false,
            processData: false,
            contentType: false,
        }).success(function (data) {
            console.log(data.imgPath);
            $("#setp7file").val(data.imgPath);
        }).error(function () {
            return layer.msg('上传失败');
        });
    }

    //选择责任人
    function getDutyPerson(name) {
        //前置库下拉框
        $(function() {
            $("select[name="+name+"]").select2({
                placeholder: "-- 输入姓名 --",
                language: "zh-CN",
                minimumInputLength: 0,
                allowClear: true,
                width: '100%',
                escapeMarkup: function (markup) { return markup; }, // 让template的html显示效果，否则输出代码
                ajax : {
                    url : "${webPath}/back/person/queryByName",
                    dataType: 'json',
                    data: function (params) {
                        return {
                            userName: params.term, // search term
                        };
                    },
                    processResults: function (data) {
                        var options = new Array();
                        $(data).each(function(i, o) {
                            options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                                id : o.account,         //取出items中Code赋值给id
                                text : o.name,
                            });
                        });
                        return {
                            results: options        //返回数据
                        };
                    },
                    cache : true
                }
            });
        })
    };

</script>
</body>
</html>