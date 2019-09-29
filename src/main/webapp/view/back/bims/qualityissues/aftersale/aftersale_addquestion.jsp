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

        label.error {
            color: red;
        }
    </style>

    <style>
        .clear::after {
            content: '';
            clear: both;
            display: block;
        }

        .fl {
            float: left;
        }

        .list-img li {
            position: relative;
            margin-right: 10px;
            list-style: none;
        }

        .list-img img {
            display: inline-block;
            width: 50px;
            height: 50px;
        }

        .list-img input {
            position: absolute;
            top: 0;
            left: 0;
            z-index: 10;
            width: 50px;
            height: 50px;
            opacity: 0;
        }

        .list-img i {
            position: absolute;
            top: 0;
            right: 0;
            width: 15px;
            height: 15px;
            background: url(${resPath}/view/static/images/icon_del.png) no-repeat center;
            background-size: 100%;
        }

        .list-img .num {
            position: absolute;
            left: 0;
            bottom: 0;
            width: 100%;
            text-align: center;
            color: #999;
            font-size: 12px;
        }
    </style>
    <script type="text/javascript">
        var ctx = '${webPath}';
        var i = 0;
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
        <div class="right_col" role="main">

            <div class="page-title">

                <div class="title_left"><h3>售后 提交问题</h3></div>
                <div class="title_right"></div>
                <div class="clearfix"></div>

                <div class="row">

                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>内容</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                                </ul>

                                <div class="clearfix"></div>
                            </div>

                            <div class="x_content">

                                <form id="form1" name="form1" method="post">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                           style="border-collapse:separate;border-spacing:15px;">

                                        <input type="hidden" id="qualityType" name="qualityType" required="required"
                                               class="form-control" value="H">
                                        <tr>
                                            <td width="15%" align="right" style="font-size: 20px; text-align: left;">
                                                General information/车辆信息
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="4" align="right"
                                                style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">
                                                Issue Resource/信息来源：<font color='red'>*</font>
                                            </td>
                                            <td width="35%"><select name="informationSource" id="informationSource"
                                                                    style="width:100%; height:35px;padding:2px;"
                                                                    required>
                                                <option value="">请选择</option>
                                                <option value="1">OEM Quality</option>
                                                <option value="2">CS</option>
                                                <option value="3">Reliability</option>
                                                <option value="4">Executive Complaint</option>
                                                <option value="5">Plant Quality</option>
                                            </select></td>
                                            <td width="15%" align="right" style="font-weight:bold;">
                                                OEM Name 整车/设备制造商和客户名称：<font color='red'>*</font>
                                            </td>
                                            <td width="35%"><input type="text" id="oemName" name="vehicleEquipment"
                                                                   style="width:100%; height:35px;padding:5px;" value=""
                                                                   placeholder="整车/设备制造商和客户名称" required></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Vehicle VIN /出厂编号：<font color='red'>*</font>
                                            </td>
                                            <td width="35%"><input name="vehicleVin" type="text" id="vehicleNo"
                                                                   style="width:100%; height:35px; padding:5px;"
                                                                   value=""
                                                                   placeholder="出厂编号" required></td>
                                            <td width="15%" align="right" style="font-weight:bold;">Engine Series/发动机系列：<font color='red'>*</font>
                                            </td>
                                            <td width="35%"><input type="text" id="engineSeries" name="engineSeries"
                                                                   style="width:100%; height:35px; padding:5px;"
                                                                   value=""
                                                                   placeholder="发动机系列" required></td>
                                        </tr>

                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Engine Type/发动机型号：<font color='red'>*</font>
                                            </td>
                                            <td><input name="engineType" type="text" id="engineType"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="发动机型号" required></td>
                                            <td align="right" style="font-weight:bold;">发动机编号/ESN：<font
                                                    color='red'>*</font>
                                            </td>
                                            <td><select name="engineSeriesNo" id="esn"
                                                        style="width:100%; height:35px;padding:2px;" required>
                                                <option value="">请选择</option>
                                            </select></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">SO /Shop Oder：<font
                                                    color='red'>*</font>
                                            </td>
                                            <td>
                                                <input id="so" name="shopOrder" readonly="readonly"
                                                       style="width:100%; height:35px;padding:2px;/" placeholder="SO"
                                                       required></td>
                                            <td align="right" style="font-weight:bold;">Engine Build Date/发动机生产日期：<font color='red'>*</font>
                                            </td>
                                            <td><input class="layui-input" type="text" readonly="readonly"
                                                       id="engineBuildDate" name="engineBuildDate"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="发动机生产日期" required></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Dealer Name/服务站名称：<font color='red'>*</font>
                                            </td>
                                            <td><input type="text" id="dealerName" name="dealerName"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="服务站名称" required></td>
                                            <td align="right" style="font-weight:bold;">Phone/服务站联系人及方式：<font color='red'>*</font>
                                            </td>
                                            <td><input type="text" id="phone" name="dealerContact"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="服务站联系人及方式" required></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Vehicle Build Date/出厂日期：<font color='red'>*</font>
                                            </td>
                                            <td><input readonly type="text" id="vehicleBuildDate"
                                                       name="vehicleBuildDate"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="出厂日期" required></td>
                                            <td align="right" style="font-weight:bold;">Vehicle Sale Date/购车日期：<font color='red'>*</font>
                                            </td>
                                            <td><input readonly type="text" id="vehicleSaleDate" name="vehicleSaleDate"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="购车日期" required></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Failure Date /故障日期：<font color='red'>*</font>
                                            </td>
                                            <td><input readonly type="text" id="failureDate" name="failureDate"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="故障日期" required></td>
                                            <td align="right" style="font-weight:bold;">Mileage/故障里程：<font color='red'>*</font>
                                            </td>
                                            <td><input type="text" id="mileage" name="failureMileage"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="故障里程" required></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Failures/失效数量：<font color='red'>*</font>
                                            </td>
                                            <td><input type="text" id="qty" name="failureNum"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="失效数量" required></td>
                                            <td align="right" style="font-weight:bold;">Repair Location/失效区域：<font color='red'>*</font>
                                            </td>
                                            <td><input type="text" id="failureLocation" name="repairLocation"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="失效区域" required></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Using Condition/使用工况及环境：<font color='red'>*</font>
                                            </td>
                                            <td><input type="text" id="usingCondition" name="usingCondition"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="使用工况及环境" required></td>
                                            <td align="right"></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td colspan="4" align="right"
                                                style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-size: 20px; text-align: left;">
                                                Customer information/客户信息
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="4" align="right"
                                                style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="font-weight:bold;">Customer Name/用户姓名：<font
                                                    color='red'>*</font>
                                            </td>
                                            <td><input required name="customerName" type="text" id="customerName"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="用户姓名"></td>
                                            <td align="right" style="font-weight:bold;">Customer Phone/用户电话：<font
                                                    color='red'>*</font>
                                            </td>
                                            <td><input required name="customerPhone" type="text" id="customerPhone"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="用户电话"></td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="font-weight:bold;">Customer Type/用户类型：<font
                                                    color='red'>*</font>
                                            </td>
                                            <td><input required name="customerType" type="text" id="customerType"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="用户类型"></td>
                                            <td align="right" style="font-weight:bold;"></td>
                                            <td>&nbsp;</td>
                                        </tr>

                                        <tr>
                                            <td colspan="4" align="right"
                                                style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>


                                        <tr>
                                            <td width="15%" align="right" style="font-size: 20px; text-align: left;">
                                                Customer complaint Information/故障信息
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="4" align="right"
                                                style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Fault
                                                description/故障现象：<font color='red'>*</font>
                                            </td>
                                            <td colspan="3"><textarea name="faultDesc" type="text" id="faultDesc"
                                                                      style="width:100%; height:75px; padding:15px;"
                                                                      value="" placeholder="故障现象" required></textarea>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Failure Part/祸首件名称：<font color='red'>*</font>
                                            </td>
                                            <td><input type="text" id="failureMode" name="faultPart"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="祸首件名称" required></td>
                                            <td width="15%" align="right" style="font-weight:bold;">Failure Mode/故障模式：<font color='red'>*</font>
                                            </td>
                                            <td><input type="text" id="partNo" name="failureMode"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="故障模式" required></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Part Number/祸首件图号：<font color='red'>*</font>
                                            </td>
                                            <td><input type="text" id="failurePart" name="faultPartNo"
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="祸首件图号" required></td>
                                        </tr>
                                        <tr>
                                            <td colspan="4" align="right"
                                                style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>

                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Field inspect/现场检查：<font color='red'>*</font>
                                            </td>
                                            <td colspan="3"><textarea name="fieldInspect" type="text" id="fieldInspect"
                                                                      style="width:100%; height:75px; padding:15px;"
                                                                      value="" placeholder="现场检查" required></textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="4" align="right"
                                                style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>

                                        <td align="right" style="font-weight:bold;">Failure analysis and conclusion/故障分析及结论：<font color='red'>*</font>
                                        </td>
                                        <td colspan="3"><textarea name="failureAnalysisConclusion" type="text"
                                                                  id="fieldInspect2"
                                                                  style="width:100%; height:75px; padding:15px;"
                                                                  value="" placeholder="故障分析及结论" required></textarea>
                                        </td>

                                        </tr>
                                        <tr>
                                            <td colspan="4" align="right"
                                                style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>

                                        <td width="15%" align="right" style="font-weight:bold;"> Customer
                                            requirement & Short Term Fix/客户需求及短期维修措施：<font color='red'>*</font>
                                        </td>
                                        <td colspan="3"><textarea name="requireFix" type="text" id="fieldInspect4"
                                                                  style="width:100%; height:75px; padding:15px;"
                                                                  value="" placeholder="客户需求及短期维修措施"
                                                                  required></textarea></td>

                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>是否批量 ： <font color='red'>*</font></strong></td>
                                            <td><select name="issueCategoryL1Name" id="issueCategoryL1Name" class="form-control" required>
                                                <option value="">- 请选择 -</option>
                                                <option value="1">是</option>
                                                <option value="2">否</option>
                                            </select></td>
                                        </tr>
                                        <tr>
                                            <td colspan="4" align="right"
                                                style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>
                                    </table>
                                    <table id="failurePhoto" width="100%" border="0" cellspacing="0" cellpadding="0"
                                           style="border-collapse:separate;border-spacing:15px;">

                                        <%--<tr>
                                            <td width="18%" align="right" style="font-weight:bold;">
                                                Vehicle&Failure Photo<br>车辆及故障照片：
                                            </td>

                                            <td width="32%" align="right" style="font-weight:bold;" class="list-img">
                                                <div id="preview0" class="clear">
                                                    <li class="fl" style="margin-left: -1%;">
                                                        <img src="${resPath}/view/static/images/icon_upload.png">
                                                        <input id="fileImage0" type="file" name="file[]"/>
                                                    </li>
                                                </div>
                                            </td>
                                            <td><input name="" type="text" id=""
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="请输入图片说明"></td>

                                            <td align="center">
                                                <a href="javascript:;" class="addImgInput" id="addImgInput">
                                                    <span class="glyphicon glyphicon-plus"></span> 添加
                                                </a>
                                            </td>
                                        </tr>--%>

                                    </table>
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                           style="border-collapse:separate;border-spacing:15px;">
                                        <tr>
                                            <td colspan="4" align="right"
                                                style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>
                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Research Report/调查报告(附件)：
                                            </td>
                                            <td width="35%" align="right"><input readonly type="hidden" id="report"
                                                                                 name="back2"
                                                                                 style="width:100%; height:35px; padding:5px;"
                                                                                 value=""
                                                                                 placeholder="附件">
                                            </td>
                                            <td width="15%">
                                                <button style="right: auto" id="yyzz" type="button"
                                                        class="btn btn-default btn-sm"
                                                        onclick="$('#YYZZFBSMJ').click();">
                                                    上传附件
                                                </button>
                                                <span id="setp2fileName"></span>
                                                <input type="file" multiple name="YYZZFBSMJ" id="YYZZFBSMJ"
                                                       style="display: none;" onchange="setp2File()">
                                            </td>
                                            <td></td>
                                        </tr>

                                        <tr>
                                            <td colspan="4" align="right"
                                                style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>

                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">Comments/备注：
                                            </td>
                                            <td colspan="3"><textarea name="comments" type="text" id="fieldInspect1"
                                                                      style="width:100%; height:75px; padding:15px;"
                                                                      value="" placeholder="备注"></textarea>
                                            </td>

                                        </tr>
                                        <%--<tr>
                                            <td width="15%" align="right" style="font-weight:bold;">处理人<font
                                                    color='red'>*</font>：
                                                <input type="hidden" name="handlerName" id="handlerName">
                                            </td>
                                            <td><select id="handler" name="handler" required
                                                        class="form-control"></select></td>
                                        </tr>--%>

                                    </table>
                                </form>
                                <%--<%@include file="/view/back/bims/qualityissues/aftersale/img.jsp" %>--%>
                                <div class="ln_solid"></div>
                                <div class="form-group">
                                    <div style="text-align:center">
                                        <button class="btn btn-primary" type="button" data-toggle="modal"
                                                onclick="checkNull()">确认
                                        </button>
                                        &nbsp; &nbsp; &nbsp;
                                        <button class="btn btn-default" type="button" data-toggle="modal"
                                                data-target=".this-save"
                                                onclick="window.location.href = '${webPath}/bims/aftersale/toAfterSale';">
                                            返回
                                        </button>
                                    </div>
                                </div>

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

<div class="modal fade this-true" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:250px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">确认</h4>
            </div>
            <div class="modal-body">
                <p>确认新建该问题吗？</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="checkNull()">确定
                </button>
            </div>
        </div>
    </div>
</div>

<%@include file="/view/static/common/core_js.jsp" %>
<script type="text/javascript">
    /**左侧菜单操作**/

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
    /**子菜单*/
    $("#menuAfterSale").addClass("current-page");

</script>
<script>
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        //常规用法
        laydate.render({
            elem: '#vehicleBuildDate',
        });
        laydate.render({
            elem: '#vehicleSaleDate'
        });
        laydate.render({
            elem: '#failureDate'
        });
    });

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
<script>
    function initImg() {
        var html = "";
        html += '<tr>'
            + '<td width="15%" align="right" style="font-weight:bold;">'
            + 'Vehicle&Failure Photo<br>车辆及故障照片：'
            + '</td>'
            + '<td width="35%" align="right" style="font-weight:bold;" class="list-img">'
            + '<div id="preview' + i + '" class="clear">'
            + '<li class="fl" style="margin-left: -1%;">'
            + '<img src="${resPath}/view/static/images/icon_upload.png">'
            + '<input id="fileImage' + i + '" onclick="fileImageClick(' + i + ')" type="file" name="file[]"/>'
            + '</li>'
            + '</div>'
            + ''
            + '</td>'
            + '<td><input  type="hidden" id="attach' + i + '" name="attach" class="form-control col-md-7" value="">'
            + '<input name="desc" type="text" id="desc' + i + '" style="width:100%; height:35px; padding:5px;" value=""placeholder="请输入图片说明"></td>'
            + '<td align="center">'
            + '<a href="javascript:;" class="addImgInput" id="addImgInput">'
            + '<span class="glyphicon glyphicon-plus"></span> 添加</a>'
            + '</td>'
            + '</tr>';
        $("#failurePhoto").append(html);
    }

    $(function () {
        initImg();
    })

    function checkNull() {
        $("#form1").validate({
            errorClass: "error"
        })
        $("#form1").validate();
        if ($("#form1").valid()) {
            var handlerName = $("#handler option:selected").text();
            $("#handlerName").val(handlerName);
            submit();
        }
        return;
    };

    function check(e) {
        var re = /^\d+(?=\.{0,1}\d+$|$)/
        if (e.value != "") {
            if (!re.test(e.value)) {
                e.value = "";
                e.focus();
            }
        }
    }

    function savetData() {
        console.log($('#form1').serialize());
        layer.confirm('确定提交问题并开始处理吗？', {icon: 3, title: '系统提示'}, function (index) {
            $.ajax({
                url: "${resPath}/bims/aftersale/afterSalesProblemSaving",
                type: "post",
                data: $('#form1').serialize(),
                success: function (data) {
                    console.log(data);
                    layer.msg("已保存");
                    window.location.href = '${webPath}/bims/aftersale/toAfterSale'
                }
            });
        })

    }

    function submit() {
        console.log($('#form1').serialize());
        layer.confirm('确定提交问题并开始处理吗？', {icon: 3, title: '系统提示'}, function (index) {
            $.ajax({
                url: "${resPath}/bims/aftersale/afterSalesProblemSaving",
                type: "post",
                data: $('#form1').serialize(),
                success: function (data) {
                    console.log(data);
                    layer.msg("已保存");
                    window.location.href = '${webPath}/bims/aftersale/toAfterSale'
                }
            });
        })

    }


    var esn;
    $(function () {
        esn = $("#esn");
        initSelectEsn();
    });

    function initSelectEsn() {
        esn.select2({
            ajax: {
                url: function (params) {
                    return "${webPath}/Esn/fuzzyQueryEsn/" + params.term;
                },
                dataType: 'json',
                processResults: function (data, params) {
                    var options = new Array();

                    for (var i = 0; i < data.length; i++) {//获取select2个必要的字段，id与text
                        options.push({
                            //取出items中Code赋值给id
                            id: data[i],
                            //取出items中CodeName赋值给text
                            text: data[i],
                        })
                    }
                    return {
                        //返回数据
                        results: options
                    };
                    /*$(data).each(function(i, o) {
                        alert(o);
                        options.push({　
                            id : o[i],         //取出items中Code赋值给id
                            text : o[i]    //取出items中CodeName赋值给text
                        });
                    });
                    return {
                        results: options        //返回数据
                    };*/
                },
                cache: true
            },

            width: '100%',
            allowClear: true,    //选中之后，可手动点击删除
            placeholder: "输入ESN搜索...",
            escapeMarkup: function (markup) {
                return markup;
            }, // 让template的html显示效果，否则输出代码
            minimumInputLength: 2,    //搜索框至少要输入的长度，此处设置后需输入才显示结果
            language: "zh-CN",         //中文
            //templateResult: formatTelehoneNumber, // 自定义下拉选项的样式模板
            //templateSelection: formatTelehoneNumberSelection     // 自定义选中选项的样式模板
        });

        esn.on("select2:select", function (evt) {
            //这里是选中触发的事件
            //evt.params.data 是选中项的信息
            var esn = evt.params.data.text;
            $.ajax({
                type: "POST",
                url: "${webPath}/Esn/queryItemNumberByEsn/" + esn,
                data: {},
                dataType: "json",
                success: function (data) {
                    console.log(data)
                    $("#so").val(data.so);
                    $("#engineBuildDate").val(data.productionDate);
                },
                error: function (data) {
                }
            });
        });

        esn.on("select2:unselect", function (evt) {
            //这里是取消选中触发的事件
            //如配置allowClear: true后，触发
        });
    }

    $(function () {
        $("select[name=handler]").select2({
            placeholder: "-- 输入姓名 --",
            language: "zh-CN",
            minimumInputLength: 1,
            allowClear: true,
            width: '100%',
            escapeMarkup: function (markup) {
                return markup;
            }, // 让template的html显示效果，否则输出代码
            ajax: {
                type: "get",
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
                        options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                            id: o.account,         //取出items中Code赋值给id
                            text: o.name,
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


    $("body").on('click', '.addImgInput', function () {
        i++;
        //添加减号
        var html = "";
        html += '<tr>'
            + '<td align="right" style="font-weight:bold;">'
            + 'Vehicle&Failure Photo<br>车辆及故障照片：'
            + '</td>'
            + '<td align="right" style="font-weight:bold;" class="list-img">'
            + '<div id="preview' + i + '" class="clear">'
            + '<li class="fl" style="margin-left: -1%;">'
            + '<img src="${resPath}/view/static/images/icon_upload.png">'
            + '<input id="fileImage' + i + '" onclick="fileImageClick(' + i + ')" type="file" name="file[]"/>'
            + '</li>'
            + '</div>'
            + ''
            + '</td>'
            + '<td><input  type="hidden" id="attach' + i + '" name="attach" class="form-control col-md-7" value="">'
            + '<input name="desc" type="text" id="desc' + i + '" style="width:100%; height:35px; padding:5px;" value=""placeholder="请输入图片说明"></td>'
            + '<td align="center">'
            + '<a href="javascript:;" class="delImgInput" id="delImgInput">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除</a>'
            + '</td>'
            + '</tr>';
        $("#failurePhoto").append(html);
    });

    /**
     * 删除事件
     */
    $("body").on('click', '.delImgInput', function () {
        var this_ = $(this);
        //获取当前点击的元素的父级的父级进行删除
        this_.parent().parent().remove();
    })

    function setp2File() {
        var formData = new FormData();
        formData.append("file", $('#YYZZFBSMJ')[0].files[0]);
        console.log($('#YYZZFBSMJ')[0].files[0])
        $("#setp2fileName").text($('#YYZZFBSMJ')[0].files[0].name);
        $.ajax({
            type: 'post',
            // //url: "http://test.cncnews.cn/wup/webUploader",
            url: "${webPath}/uploadFile/uploader",
            data: formData,
            dataType: "json",
            cache: false,
            processData: false,
            contentType: false,
        }).success(function (data) {
            console.log(data.imgPath);
            $("#report").val(data.imgPath);
        }).error(function () {
            return layer.msg('上传失败');
        });
    }
</script>

<script type="text/javascript">


    var pageCtrl = {
        imgId: 0, //图片id标志, 方便删除预览图片
        maxNum: 1, //最多上传图片张数
        count: 0,
        //选择图片
        _choosePic: function (upNum) {
            var _self = this;
            $('#fileImage' + upNum + '').change(function () {
                console.log($('#fileImage' + upNum + ''));
                var files = this.files;
                len = $('#preview' + upNum + '').find('.pic').length;
                if (len + files.length > _self.maxNum) {
                    _self._showTip('最多只能上传' + _self.maxNum + '张图片哦~');
                    return;
                }
                for (var i = 0; i < files.length; i++) {
                    var file = files[i];
                    if (file.type.indexOf("image") == 0) {
                        if (file.size >= 1024 * 1024 * 3) {
                            _self._showTip('图片大小过大，应小于3M');
                        } else {
                            _self._showPic(file, upNum); //图片预览
                        }
                    } else {
                        _self._showTip('文件"' + file.name + '"不是图片类型')
                        break;
                    }
                }
                $('#fileImage' + upNum + '').val("");
            });
        },

        //渲染图片
        _showPic: function (file, num) {
            var _self = this,
                html = '',
                $wap = $('#preview' + num + ''),
                reader = new FileReader();
            reader.readAsDataURL(file);
            reader.onload = function (e) {
                var image_base64 = this.result,
                    count = _self.count

                html = '<li class="fl pic" id="imgItem_' + count + '">' +
                    '<span data-toggle="modal" data-target=".this-pic" onclick="showImg(\'' + image_base64 + '\')">' +
                    '<img src="' + image_base64 + '" alt="" />' +
                    '</span>' +
                    '<input id="imgUrl_' + count + '" type="hidden" class="imgUrl">' +
                    '<i onclick="fileImageDelClick(' + num + ')" class="del-img"></i>' +
                    '</li>';
                $wap.append(html);

                $('#fileImage' + num + '').next().text($wap.find('.pic').length + '/' + _self.maxNum);

                //图片压缩上传，大于1.2M压缩图片
                if (file.size / 1024 > 1024 * 1.2) {
                    _self._dealImage(image_base64, {
                        quality: 0.5
                    }, function (base64Codes) {
                        var bl = _self._processData(base64Codes, file.type);
                        _self._uploadPic(bl, count, num);
                    });
                } else {
                    _self._uploadPic(file, count, num);
                }
                count++;
                _self.count = count;
            }
        },


        //图片压缩（利用canvas）
        _dealImage: function (path, obj, callback) {
            var img = new Image();
            img.src = path;
            img.onload = function () {
                var that = this;
                // 默认按比例压缩
                var w = that.width,
                    h = that.height,
                    scale = w / h;
                w = obj.width || w;
                h = obj.height || (w / scale);

                //生成canvas
                var canvas = document.createElement('canvas'),
                    ctx = canvas.getContext('2d');
                canvas.width = w;
                canvas.height = h;
                ctx.drawImage(that, 0, 0, w, h);

                // 默认图片质量为0.7
                var quality = 0.7;
                if (obj.quality && obj.quality <= 1 && obj.quality > 0) {
                    quality = obj.quality;
                }

                // 回调函数返回base64的值
                var base64 = canvas.toDataURL('image/jpeg', quality);
                callback(base64);
            }
        },

        //将以base64的图片url数据转换为Blob
        _processData: function (dataUrl, type) {
            var binaryString = window.atob(dataUrl.split(',')[1]),
                arrayBuffer = new ArrayBuffer(binaryString.length),
                intArray = new Uint8Array(arrayBuffer);
            for (var i = 0, j = binaryString.length; i < j; i++) {
                intArray[i] = binaryString.charCodeAt(i);
            }

            var data = [intArray], blob;

            try {
                blob = new Blob(data);
            } catch (e) {
                window.BlobBuilder = window.BlobBuilder ||
                    window.WebKitBlobBuilder ||
                    window.MozBlobBuilder ||
                    window.MSBlobBuilder;
                if (e.name === 'TypeError' && window.BlobBuilder) {
                    var builder = new BlobBuilder();
                    builder.append(arrayBuffer);
                    blob = builder.getBlob(type);
                } else {
                    _showTip('版本过低，不支持图片压缩上传');
                }
            }
            return blob;
        },

        //上传图片
        _uploadPic: function (file, id, num) {
            var _self = this,
                formData = new FormData();
            formData.append('file', file);
            $.ajax({
                url: '${webPath}/uploadFile/uploader',
                type: 'post',
                dataType: 'json',
                data: formData,
                contentType: false,
                processData: false,
                success: function (res) {
                    /*var result = $('#attach'+num+'').val();
                    result==""?result:result=result+',';*/
                    if (res.imgPath != null) {
                        $('#attach' + num + '').val(res.imgPath);//将地址存储好
                        /*$('#attach'+num+'').val(result+res.imgPath);//将地址存储好
                        ('#imgUrl_' + id).attr('value', res.imgPath);
                        console.log(id)
                        $('#imgItem_' + id).find('.del-img').attr('data-src', res.imgPath);//显示图片
                        var img = $('#attach'+num+'').val();
                        result=img ;
                        $('#attach'+num+'').attr("value",result);
                        console.log(result);*/
                    } else {
                        _self._showTip('文件上传失败！');
                    }
                },
                error: (function (res) {
                    return layer.msg('上传失败');
                })
            });
        },

        //删除图片
        _delPic: function (upNum) {
            var _self = this,
                $wap = $('#preview' + upNum + '');
            $wap.on('click', '.del-img', function () {
                $('#attach' + upNum + '').val("");
                //TODO:从数据库删除图片
                $(this).parent().remove();

                $('#fileImage' + i + '').next().text($wap.find('.pic').length + '/' + _self.maxNum);
                //更新隐藏图片路径
                /*var numArr = new Array();
                $('.imgUrl').each(function(){
                    numArr.push($(this).val());//添加至数组
                    console.log(numArr)
                });
                $('#attach'+upNum+'').val(numArr.toString());*/

                $('#fileImage' + upNum + '').val("");
            });

        },

        _showTip: function (str) {
            //TODO信息提示
            console.log(str);
        },

        /*init: function(upNum) {
            this._choosePic(upNum);
            this._delPic(upNum);
        }*/
    };

    // $(function(){
    //     pageCtrl.init();
    // });

    //展示图片
    function showImg(byteImg) {
        $("#showImg").html("<img style='width: 100%;height: 100%;' src='" + byteImg + "' />");
    }

    function fileImageClick(i) {
        var upNum = i;
        pageCtrl._choosePic(upNum);
    }

    function fileImageDelClick(i) {
        var upNum = i;
        pageCtrl._delPic(upNum);
    }
</script>
</body>
</html>
