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
                                        <%--<li role="presentation" class="active"><a href="#tab_content11"
                                                                                  id="home-tabb" role="tab"
                                                                                  data-toggle="tab"
                                                                                  aria-controls="home"
                                                                                  aria-expanded="true">CAR</a></li>
                                        <li role="presentation" class=""><a href="#tab_content22" role="tab"
                                                                            id="profile-tabb" data-toggle="tab"
                                                                            aria-controls="profile"
                                                                            aria-expanded="false">SCAR</a></li>--%>
                                        <li role="presentation" class="active"><a href="#tab_content33" id="home-tabb"
                                                                                  role="tab" data-toggle="tab"
                                                                                  aria-controls="home"
                                                                                  aria-expanded="true">7 STEP</a></li>
                                        <%--<li role="presentation" class=""><a href="#tab_content44" role="tab"
                                                                            id="profile-tabb" data-toggle="tab"
                                                                            aria-controls="profile"
                                                                            aria-expanded="false">Notification</a>
                                        </li>--%>
                                    </ul>


                                    <!--Car表单工具开始-->

                                    <div id="myTabContent2" class="tab-content">
                                        <div role="tabpanel" class="tab-pane fade active in" id="tab_content11"
                                             aria-labelledby="home-tab">
                                            <table width="100%" class="table table-bordered" id="" style="font-size:12px;">
                                                <tr>
                                                    <td colspan="5">
                                                        <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                                class="fa fa-file-text"></i> 7 STEP
                                                        </div>
                                                        <div style="color:#5A738E; float:right;">责任人：材料采购部 胡平</div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="50%">
                                                        <table width="100%" class="table table-bordered" style="margin-bottom:0px;">
                                                            <tr>
                                                                <td colspan="2" bgcolor="#F6F6F6">
                                                                    <span style=" background:url(images/no_di.png) no-repeat ;padding:2px;text-align:center; color:#FFFFFF;">&nbsp;1&nbsp; </span>
                                                                    Identify the Problem<br>识别问题 (5W2H)
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td height="162" colspan="2" valign="top"></td>
                                                            </tr>
                                                            <tr>
                                                                <td width="50%">Target Date 目标日期：<br>2018-09-11 12:22</td>
                                                                <td width="50%">Complete Date 完成日期：<br>2018-09-11 12:22</td>
                                                            </tr>
                                                            <tr>
                                                                <td colspan="2" bgcolor="#F6F6F6">
                                                                    <span style=" background:url(images/no_di.png) no-repeat ;padding:2px;text-align:center; color:#FFFFFF;">&nbsp;2&nbsp; </span>
                                                                    Identify and Rank Assignable Causes.<br>识别和排列必然原因。(FTA,
                                                                    Fishbone, Pareto)
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td height="80" colspan="2" valign="top"></td>
                                                            </tr>
                                                            <tr>
                                                                <td colspan="2" bgcolor="#F6F6F6">
                                                                    <span style=" background:url(images/no_di.png) no-repeat ;padding:2px;text-align:center; color:#FFFFFF;">&nbsp;3&nbsp; </span>
                                                                    Take Short Term Action.<br>采取短期措施。
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td height="80" colspan="2" valign="top"></td>
                                                            </tr>
                                                            <tr>
                                                                <td>Target Date 目标日期：<br>2018-09-11 12:22</td>
                                                                <td>Complete Date 完成日期：<br>2018-09-11 12:22</td>
                                                            </tr>
                                                        </table>
                                                    </td>
                                                    <td width="50%">
                                                        <table width="100%" class="table table-bordered" style="margin-bottom:0px;">
                                                            <tr>
                                                                <td colspan="2" bgcolor="#F6F6F6">
                                                                    <span style=" background:url(images/no_di.png) no-repeat ;padding:2px;text-align:center; color:#FFFFFF;">&nbsp;4&nbsp; </span>
                                                                    Determine Assignable Cause(s).<br>确定必然原因。(FTA, Fishbone, Pareto)
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td height="60" colspan="2" valign="top"></td>
                                                            </tr>

                                                            <tr>
                                                                <td colspan="2" bgcolor="#F6F6F6">
                                                                    <span style=" background:url(images/no_di.png) no-repeat ;padding:2px;text-align:center; color:#FFFFFF;">&nbsp;5&nbsp; </span>
                                                                    Select and Verify the Solution.<br>选择和验证解决方案。
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td height="60" colspan="2" valign="top"></td>
                                                            </tr>
                                                            <tr>
                                                                <td colspan="2" bgcolor="#F6F6F6">
                                                                    <span style=" background:url(images/no_di.png) no-repeat ;padding:2px;text-align:center; color:#FFFFFF;">&nbsp;6&nbsp; </span>
                                                                    Implement Permanent Solution.<br>实施永久解决方案。
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td height="60" colspan="2" valign="top"></td>
                                                            </tr>
                                                            <tr>
                                                                <td>Target Date 目标日期：<br>
                                                                    2018-09-11 12:22
                                                                </td>
                                                                <td>Complete Date 完成日期：<br>
                                                                    2018-09-11 12:22
                                                                </td>
                                                            </tr>

                                                            <tr>
                                                                <td colspan="2" bgcolor="#F6F6F6">
                                                                    <span style=" background:url(images/no_di.png) no-repeat ;padding:2px;text-align:center; color:#FFFFFF;">&nbsp;7&nbsp; </span>
                                                                    Monitor.Prevent Recurrence.<br>监控，预防再发生。（RCA）
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td height="80" colspan="2" valign="top"></td>
                                                            </tr>
                                                            <tr>
                                                                <td>Target Date 目标日期：<br>
                                                                    2018-09-11 12:22
                                                                </td>
                                                                <td>Complete Date 完成日期：<br>
                                                                    2018-09-11 12:22
                                                                </td>
                                                            </tr>
                                                        </table>
                                                    </td>
                                                </tr>
                                            </table>

                                            <h2>关联附件</h2>
                                            <i class="fa fa-file-archive-o"></i>&nbsp;&nbsp;附件表单

                                            <hr></hr>

                                            <h2>驳回原因</h2>
                                            <i class="fa fa-exclamation-circle" style="color:red"></i> 这里显示的是上一次提交时被驳回的原因。
                                        </div>
                                        <!--按钮-->
                                        <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div style="text-align:center;">
                                                <button class="btn btn-danger" type="button" data-toggle="modal"
                                                        data-target=".this-no">驳回
                                                </button>
                                                <button class="btn btn-primary" type="button" data-toggle="modal"
                                                        data-target=".this-go">确定关闭
                                                </button>
                                            </div>
                                        </div>
                                        <!--按钮完成-->

                                        <div role="tabpanel" class="tab-pane fade" id="tab_content22" aria-labelledby="profile-tab">
                                            <p>Car 表单</p>
                                        </div>
                                    </div>

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
                        onClick="submit(${car.id},${issue.id})">确定
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
                <p>确定提交质量经理吗?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onclick="submit(${car.id},${issue.id})">确定
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


    //提交
    function submit(carId, issueId) {

        alert("已关闭")
        /*var params = $("#demo-form10").serialize();
        $.ajax({
            url: '${webPath}/car/addStep1',
            type: "POST",
            dataType: "json",
            data: params,
            success: function (res) {
                window.location.href = '${webPath}/bims/apucheck/toCarStepAll?carId=' + carId + '&issueId=' + issueId;
            }
        })*/
    }

</script>
</body>
</html>
