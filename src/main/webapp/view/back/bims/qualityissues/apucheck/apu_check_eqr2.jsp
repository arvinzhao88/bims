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
    <%--<link href="${resPath}/view/static/vendors/select2/dist/css/select2.css" rel="stylesheet">--%>

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
    </style>

    <script type="text/javascript">
        var ctx = '${webPath}';
    </script>
</head>

<body class="nav-md" onload="loadd()">

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
                    <c:if test="${issue.qualityType == 'A'}">
                        <h3>APU&终检 问题处理</h3>
                    </c:if>
                    <c:if test="${issue.qualityType == 'T'}">
                        <h3>T区</h3>
                    </c:if>
                    <c:if test="${issue.qualityType == 'M'}">
                        <h3>机加</h3>
                    </c:if>
                </div>
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
                        <div id="x_content" class="x_content" style="display:none;">
                            <table width="100%" class="table table-hover table-bordered" id="datatable1">
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
                                    <td>${issue.qualityType}</td>
                                    <th>问题分类：</th>
                                    <td>${issue.issueCategoryL1}</td>
                                    <th>问题描述：</th>
                                    <td>${issue.issueDesc}</td>
                                </tr>
                                <tr>
                                    <th>失效位置：</th>
                                    <td>${issue.failureLocation}</td>
                                    <th>区域：</th>
                                    <td>${issue.area}</td>
                                    <th>班组：</th>
                                    <td>${issue.plant}</td>
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
                                    <th>问题编号：</th>
                                    <td>${issue.number}</td>
                                    <th>数量：</th>
                                    <td>${issue.qty}</td>
                                    <th>图片附件：</th>
                                    <%--<td>${issue.attach}</td>--%>
                                    <td>
                                        <c:if test="${not empty issue.attach}">
                                            <c:forEach var="att" items="${fn:split(issue.attach, ',')}">
                                                <img class="img-preview" style="width: 70px ;height: 70px;"
                                                     src="${uploadUrl}${att}" alt="${uploadUrl}${att}">
                                            </c:forEach>
                                        </c:if>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </div>

                    <div class="x_panel" style="width:75%;float:left; margin-right:10px;">
                        <div class="x_title">
                            <h2>处置措施</h2>
                            <div class="clearfix"></div>
                        </div>
                        <div class="form-group">
                            <div id="index-div">

                            </div>

                            <form id="docManage" data-parsley-validate class="form-horizontal form-label-left">
                                <input type="hidden" id="issueId" name="issueId" required="required"
                                       class="form-control" value="${issue.id}">
                                <input type="hidden" id="issueNo" name="issueNo" required="required"
                                       class="form-control" value="${issue.number}">
                                <input type="hidden" id="qualityType" name="" required="required" class="form-control"
                                       value="${issue.qualityType}">
                                <table id="doc" width="100%" border="0" cellspacing="0" cellpadding="0"
                                       style="border-collapse:separate;border-spacing:15px;">
                                    <c:if test="${person.account == issue.processPersonAccount}">
                                    <tr id="tempMeasures">
                                        <td align="right" style="width:10%;">处置措施：</td>
                                        <td style="width:18%;"><select id="measures" name="tempMeasures" class="form-control">
                                            <option value="">--请选择--</option>
                                            <option value="1">料废</option>
                                            <option value="2">工废</option>
                                            <option value="3">让步接收</option>
                                            <option value="4">待处理</option>
                                            <option value="6">筛选—（不合格品抑制单</option>
                                            <option value="7">拒收—无</option>
                                            <option value="8">返工—（返工返修随机卡</option>
                                        </select></td>
                                        <td style="width:10%;">&nbsp;</td>
                                        <td style="width:18%;">&nbsp;</td>
                                        <td align="right" style="width:10%;">&nbsp;</td>
                                        <td align="right" style="width:18%;">&nbsp;</td>
                                        <td align="right" style="width:16%;">
                                            <a href="javascript:;" class="addInputReturn">
                                                <span class="glyphicon glyphicon-plus"></span> 添加单据
                                            </a>
                                        </td>
                                    </tr>
                                    </c:if>
                                </table>
                                <div style="text-align: center;" id="saveBtn"></div>
                            </form>
                        </div>

                        <!--单据表开始-->
                        <div class="x_title">
                            <h2>单据管理</h2>
                            <div class="clearfix"></div>
                        </div>

                        <div class="x_content">
                            <form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">
                                <div class="form-group">
                                    <div class="" role="tabpane2" data-example-id="togglable-tabs">
                                        <ul id="myTab2" class="nav nav-tabs bar_tabs right" role="tablist">

                                        </ul>

                                        <!--附加表单开始-->
                                        <div id="myTabContent2" class="tab-content">
                                        </div>
                                        <!--附加表单结束-->
                                    </div>
                                </div>
                            </form>
                            <!--单据表完成-->
                        </div>

                        <c:if test="${issue.isEqr eq '0'}">
                            <div id="questionDeal" class="x_title">
                                <h2>问题处理</h2>
                                <div class="clearfix"></div>
                            </div>

                            <div class="x_content" id="isEqrStatus">
                                <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                    <div class="form-group">
                                        <div class="form-group col-md-10">
                                            <label class="control-label col-md-3">是否EQR：</label>
                                            <div class="col-md-5">
                                                <p style="padding-top:8px;" id="isEqrp">
                                                    <input type="radio" name="isEqr" class="radio_type" id="isEqr1"
                                                           value="1"/>
                                                    <label for="isEqr1">是&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                                                    <input type="radio" name="isEqr" class="radio_type" id="isEqr2"
                                                           value="2"/>
                                                    <label for="isEqr2">否</label>

                                                </p>
                                            </div>
                                        </div>

                                            <%--<div class="form-group col-md-10">
                                                <label class="control-label col-md-3">处理：</label>
                                                <div class="col-md-9" style="padding-top:8px;">问题发送 EQR Leader 进行下一步处理</div>
                                            </div>--%>
                                    </div>

                                    <div id="eqrState" class="form-group">
                                        <div class="form-group col-md-10">
                                            <label style="margin-left:46px;" class="control-label col-md-3"
                                                   for="eqrLeader">选择EQR
                                                Leader：</label>
                                            <select id="eqrLeader" name="eqrLeader" class="form-control">
                                            </select>
                                        </div>
                                    </div>
                                    <div class="ln_solid" id="isRemove"></div>
                                    <div class="form-group" id="isOk">
                                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                            <button class="btn" type="button" onClick="toApuCorrect(${issue.id})">取消
                                            </button>
                                            <button class="btn btn-primary" type="button" data-toggle="modal"
                                                    data-target=".this-go" onclick="confirm(${issue.id})">确定
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </c:if>
                        <c:if test="${fn:contains(person.belongRole, '4') == true}">
                            <div class="x_content" id="eqrQDiv" style="display: block;">
                                <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                           class="table table-hover table-bordered">
                                        <tr>
                                            <td colspan="6" align="center">EQR Notification Form
                                                突发质量问题通知单
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="22%"><strong>Issue Date 问题发生日期</strong></td>
                                            <td width="28%"><fmt:formatDate value="${issue.inputTime}"
                                                                            pattern="yyyy-MM-dd"/></td>
                                            <td width="50%" colspan="4"><strong>Issue Description 问题描述</strong></td>
                                        </tr>
                                        <tr>
                                            <td><strong>Issue Area 问题发生区域</strong></td>
                                            <td>${issueInfo.plantname}/${issueInfo.areaname}<br>
                                            </td>
                                            <td colspan="4" rowspan="3">
                                            <textarea name="textarea" id="textarea" cols="300" rows="3"
                                                      style="width:100%">${issue.issueDesc}</textarea></td>
                                        </tr>
                                        <tr>
                                            <td><strong>Station No.工位号</strong></td>
                                            <td>${issue.issueStation}</td>
                                        </tr>
                                        <tr>
                                            <td><strong>Engine Type 发动机型号</strong></td>
                                            <td>${issue.engineType}</td>
                                        </tr>
                                        <tr>
                                            <td><strong>ESN 发动机序列号</strong></td>
                                            <td>${issue.esn}/${issue.so}</td>
                                            <td colspan="4"><strong>Containment action 遏制措施</strong></td>
                                        </tr>
                                        <tr>
                                            <td><strong>PN 零件号</strong></td>
                                            <td>${issue.partNo}</td>
                                            <td colspan="4" rowspan="3"><textarea name="containmentAction"
                                                                                  id="containmentAction" cols="100"
                                                                                  rows="3"
                                                                                  style="width:100%"></textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><strong>Part Name 零件名</strong></td>
                                            <td>${issue.partName}</td>
                                        </tr>
                                        <tr>
                                            <td><strong>Supplier Name 供应商名称</strong></td>
                                            <td>${issue.vendorName}</td>
                                        </tr>
                                        <tr>
                                            <td><strong>ailure Qty 失效数量</strong></td>
                                            <td>${issue.qty}</td>
                                            <td colspan="4"><strong>Clean point 断点</strong></td>
                                        </tr>
                                        <tr>
                                            <td><strong>Effect Engine Amout<br>
                                                影响发动机台数</strong></td>
                                            <td><input type="text" id="effectEngineAmout" name="effectEngineAmout"
                                                       required="required" class="form-control" value=""></td>
                                            <td colspan="4" rowspan="3">
                                            <textarea name="cleanPoint" id="cleanPoint" cols="100" rows="3"
                                                      style="width:100%"></textarea>
                                                <br>Attach/上传图片
                                                <%--<i class="fa fa-file-picture-o"--%>
                                                   <%--style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button--%>
                                                    <%--type="button" class="btn btn-default btn-sm">上传图片--%>
                                            <%--</button>--%>
                                            <div class="list-img">
                                                <ul id="preview" class="clear">
                                                    <li class="fl">
                                                        <img src="${resPath}/view/static/images/icon_upload.png">
                                                        <input id="fileImage" type="file" name="file[]" multiple/>
                                                        <%--<div class="num">0/6</div>--%>
                                                    </li>
                                                </ul>
                                            </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><strong>Effect Scope<br>
                                                影响范围</strong></td>
                                            <td><input type="text" id="effectScope" name="effectScope"
                                                       required="required"
                                                       class="form-control" value=""></td>
                                        </tr>
                                        <tr>
                                            <td><strong>Impact to Delivery<br>
                                                是否影响发交</strong></td>
                                            <td><input type="text" id="effectToDelivery" name="effectToDelivery"
                                                       required="required" class="form-control" value=""></td>
                                        </tr>
                                        <tr>
                                            <td><strong>Issue Sensor<br>
                                                问题来源</strong></td>
                                            <td><input type="text" id="issueSensor" name="issueSensor"
                                                       required="required"
                                                       class="form-control" value=""></td>
                                            <td width="15%"><strong>CAR/SCAR 号码</strong></td>
                                            <td width="15%">&nbsp;</td>
                                            <td width="10%"><strong>责任人</strong></td>
                                            <td width="10%">&nbsp;</td>
                                        </tr>
                                    </table>


                                    <h2>邮件接收人</h2>
                                    <select id="sendEmail" name="email" class="form-control" multiple="multiple">
                                    </select>
                                    <!--按钮-->
                                    <div class="ln_solid"></div>
                                    <div class="form-group">
                                        <div class="form-group" style="text-align:center">
                                            <button onclick="send()" class="btn btn-primary" type="button">发送邮件
                                            </button>&nbsp;&nbsp;&nbsp;&nbsp;
                                            <button class="btn btn-success" type="button" data-toggle="modal"
                                                    data-target=".this-opencar" onclick="openCar(${issue.id})">开CAR处理
                                            </button>
                                        </div>
                                    </div>
                                    <!--按钮完成-->
                                    <%@include file="/view/static/common/img.jsp" %>
                                    <input type="hidden" id="attach" name="attach" required="required"
                                           class="form-control col-md-7" value="${issue.attach}">
                                </form>
                            </div>
                        </c:if>

                        <div class="x_panel" id="dealTools"
                             style="width:100%;float:left; margin-right:10px;
                             <c:if test="${issue.isEqr == '0'}">display: none</c:if>
                             <c:if test="${issue.isEqr != '0'}">display: block</c:if>">
                            <div class="x_title">
                                <h2>处理工具</h2>&nbsp;&nbsp;&nbsp;&nbsp;<%--<font color="#FF0000">说明：如果处理工具选择了“Notification”，则该行不显示“责任人”</font>--%>
                                <span style="float:right; font-size:14px; margin-top:10px;">状态：<font
                                        style="color:#0099FF; font-weight:bold;">待处理</font></span>
                                <div class="clearfix"></div>
                            </div>
                            <div class="form-group">
                                <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                    <input type="hidden" id="issueId" name="issueId" required="required"
                                           class="form-control" value="${issue.id}">
                                    <table id="tools" width="100%" border="0" cellpadding="0" cellspacing="0"
                                           style="border-collapse:separate;border-spacing:15px;">
                                        <tbody>
                                            <c:if test="${person.account == issue.processPersonAccount}">
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
                            <div class="x_content">
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
                            <div id="closeQuestion" class="form-group">
                                <div style="text-align:center">
                                    <button class="btn" type="button" onClick="comeBack();">返回</button>
                                    <button class="btn btn-primary" type="button" data-toggle="modal"
                                            data-target=".this-go"
                                            onClick="closeIssue(${issue.id})">问题关闭
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="x_panel" style="width:calc(25% - 10px); float:left;">
                        <div class="x_title">
                            <h2>处理记录</h2>
                            <div class="clearfix"></div>
                        </div>
                        <div id="dealLog" class="x_content">
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
                 style="width:800px; height:500px; margin:30px;background-color:#EFEFEF; text-align:center;" id="showImg">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<%@include file="/view/static/common/core_js.jsp" %>
<%--<script type="text/javascript" src="${resPath}/view/static/vendors/select2/dist/js/select2.min.js"></script>
<script type="text/javascript" src="${resPath}/view/static/vendors/select2/dist/js/i18n/zh-CN.js"></script>--%>
<script>var account = '${person.account}', personName = '${person.name}';</script>
<script src="${resPath}/view/back/bims/js/qualityissues/apuCheckEqr/dealTools.js"></script>

<script type="text/javascript">

    function comeBack() {
        window.location.href = "${webPath}/back/toApu";
    }

    //关闭问题
    function closeIssue(issueId) {
        layer.confirm('确定要关闭这个问题吗？', {icon: 3, title: '提示'}, function (index) {
            //do something
            $.post("${webPath}/bims/apucheck/closeIssue", {"id": issueId}, function (data) {
                console.log(data);
                if (data.success) {
                    layer.alert(data.msg, function () {
                        window.location.href = "${webPath}/back/toApu";
                    });
                }
            })
            layer.close(index);
        });

    }

    /** 选择EQRleader **/
    $('#eqrLeader').select2({
        placeholder: "--输入姓名--",
        language: "zh-CN",
        minimumInputLength: 1,
        allowClear: true,
        ajax: {
            url: ctx + "back/person/queryByNameToBims",
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

        getBillTabs();
        
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

    //加载单据标签
    function getBillTabs() {
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
                        if (i == 0) {
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

    $(function () {
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
                        var isDel = '<a href="javascript:;" class="delInput" data-id="'+toollist[i].id+'" data-num="'+toollist[i].receiptId+'">'
                            + '<span class="glyphicon glyphicon-minus"></span> 删除'
                            + '</a>';
                        if(nowAccount != dataAccount) {
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
    })


    var numTime = 0;
    $("body").on('click', '.addInputReturn', function () {
        //添加减号
        var html = '';
        html += '<tr id="delInputA' + numTime + '">'
            + '<input name="billId" type="hidden" id="billId' + numTime + '" required="required">'
            + '<input name="receiptId" type="hidden" id="receiptId' + numTime + '" required="required">'
            + '<td align="right"><span style="width:10%">问题单据：</span></td>'
            + '<td colspan="2" align="right">'
            + '<select id="billType' + numTime + '" name="billType" class="form-control">'
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
        var qDocs = $("select[name='billType']");
        var dealStep = $("#measures").val();    //处置措施
        if (null == dealStep || "" == dealStep) {
            layer.msg("请选择处置措施");
            return;
        }
        var qDocsData = new Array();    //问题单据
        for (var i = 0; i < qDocs.length; i++) {
            var qDoc = $("#billType" + (numTime - i - 1) + "").val();
            if (null == qDoc || "" == qDoc) {
                layer.msg("请选择第" + (numTime - i - 1) + "个问题单据");
                return;
            }
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
                            + '<a href="javascript:;" class="delInput" data-id="'+list[i].id+'" data-num="'+list[i].receiptId+'" >'
                            + '<span class="glyphicon glyphicon-minus"></span> 删除'
                            + '</a>'
                            + '</td>&ndash;%&gt;'
                            + '</tr>');
                    }
                    window.location.reload();
                }
            }
        });
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
        layer.confirm('确定要删除这个工具吗?', {icon: 3, title:'提示'}, function(index) {
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
                        //window.location.reload();
                        getBillTabs();
                        //获取当前点击的元素的父级的父级进行删除
                        this_.parent().parent().remove();
                        numTime--;
                    }
                }
            });
            layer.close(index);
        });
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
            layer.confirm('确定将该问题交由EQR Leader进行处理吗？', {icon: 3, title: '提示'}, function (index) {
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
            layer.confirm('确定直接选择处理工具吗？', {icon: 3, title: '提示'}, function (index) {
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
        }

    }

    //获取处理记录

    $(function getDealLog() {
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
                            + '<div style="width:51%; float:right">' + logList[i].processPerson + ' ' + logList[i].actionName + '</div>'
                            + '</div>';
                    }
                }
                $("#dealLog").append(html);
            }
        })
    })

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
                    if(nowAccount != dataAccount) {
                        for (var i = 0; i < billlist.length; i++) {
                            html += "<i class=\"fa fa-table\" style=\"font-size:30px;padding:10px;vertical-align:middle;\"></i>&nbsp;" +
                                "<button disabled type=\"button\" onclick=\"getTagsById(" + billlist[i].receiptId + "," + type + ")\" class=\"btn btn-default btn-sm\" data-toggle=\"modal\" data-target=\".this-biaodan\">" + billlist[i].measureNo + "</button>\n";
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
            window.open('${webPath}/Tagstprocessed/jumpPendingForm/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px')
        }
        if (type == 2) {
            window.open('${webPath}/ScrapBill/queryScrapForUpdate/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px')
        }
        if (type == 3) {
            layer.msg("暂无数据")
            return;
        }
        if (type == 4) {
            window.open('${webPath}/PendingDocument/queryPendingDocuments/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px')
        }
        if (type == 5) {
            layer.msg("暂无数据")
            return;
        }
        if (type == 6) {
            window.open('${webPath}/NonProductContainment/queryNonconformingProductContainmentOrder/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px')
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
        window.open('${webPath}/Tagstprocessed/jumpPendingForm/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px')
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

    //发送邮件
    function send() {
        var msg = $("#textarea").val();
        var emails = $("#sendEmail").val();
        if (emails==null || emails==""){
            layer.msg("请选择邮件接收人！");
        }
        var str = emails.toString();
        layer.confirm('确定发送邮件吗?', {icon: 3, title: '提示'}, function (index) {
            $.ajax({
                url: '${webPath}/sendEmail/send',
                type: "POST",
                dataType: "json",
                data: {
                    notificationInfo: msg,
                    back1: str,
                },
                success: function (res) {
                    layer.alert("邮件已发送");
                }
            });
            layer.close(index);
        });
    }

    jQuery(document).ready(function () {
        //前置库下拉框
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
        layer.confirm('确定开始处理问题吗?', {icon: 3, title: '提示'}, function (index) {
            var params = $("#demo-form2").serialize();
            //保存问题通知单
            $.ajax({
                url: '${webPath}/bims/notification/upd',
                type: "POST",
                dataType: "json",
                data: params,
                success: function (res) {
                    // layer.msg("已发送");
                    //window.location.href = '${webPath}/bims/apucheck/apuLearder?id=' + id;
                }
            })
            layer.close(index);
        });
    }
</script>
</body>
</html>
