<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="/view/static/images/favicon.ico"
          type="image/ico"/>
    <%--<link rel="stylesheet" type="text/css" href="/view/static/layer/skin/layer.css"/>--%>
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

                <%--<%@include file="/view/static/common/sysinfo.jsp" %>--%>

                <!-- 侧导航开始 -->

                <!-- /测导航结束 -->
            </div>
        </div>

        <!-- 顶部开始 -->

        <!-- 顶部结束 -->

        <!-- 内容区开始 -->
        <%--<div class="right_col" role="main">--%>


        <!-- 内容区开始 -->
        <div class="right_col" role="main">




            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">

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
                                            <!--7 STEP分段附件结束-->

                                            <div role="tabpanel" class="tab-pane fade active in" id="tab_content11" aria-labelledby="home-tab">
                                                <table width="100%" class="table table-hover table-bordered" id="" style="font-size:12px;">
                                                    <tr>
                                                        <td colspan="4">
                                                            <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                                    class="fa fa-file-text"></i> 7 STEP &nbsp;&nbsp;&nbsp;&nbsp;<i
                                                                    class="fa fa-clock-o green"></i> 截至日期：24小时
                                                            </div>
                                                           <%-- <div style="color:#5A738E; float:right;">责任人：材料采购部 胡平</div>--%>
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td colspan="4" bgcolor="#F6F6F6">
                                                            <span style="border-radius:50%;-moz-border-radius:50%;-webkit-border-radius:50%;color:#FFFFFF;padding:4px;background-color:#009688">&nbsp;1&nbsp;</span>
                                                            Identify the problem.识别问题(5W2H)。
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <textarea name="message" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100"></textarea>
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td colspan="4" bgcolor="#F6F6F6">
                                                            <span style="border-radius:50%;-moz-border-radius:50%;-webkit-border-radius:50%;color:#FFFFFF;padding:4px;background-color:#009688">&nbsp;2&nbsp;</span>
                                                            Identify and Rank Assignable Causes.识别和排列必然原因 (FTA, Fishbone, Pareto)。
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <textarea name="message" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100"></textarea>
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td colspan="4" bgcolor="#F6F6F6">
                                                            <span style="border-radius:50%;-moz-border-radius:50%;-webkit-border-radius:50%;color:#FFFFFF;padding:4px;background-color:#009688">&nbsp;3&nbsp;</span>
                                                            Take Short Term Action.采取短期措施。
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <textarea name="message" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100"></textarea>
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td colspan="4">
                                                            <button class="btn btn-primary" type="reset" data-toggle="modal" onclick="submitData()"
                                                                    data-target=".this-go">下一步
                                                            </button>
                                                        </td>
                                                    </tr>
                                                  <%--  <tr>
                                                        <td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：23:15:10</td>
                                                        <td width="20%">Complete Date 完成日期</td>
                                                        <td width="30%">处理中（以完成系统时间为准）</td>
                                                    </tr>--%>
                                                </table>

                                                <!--按钮-->
                                                <%--<div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal"
                                                                data-target=".this-no">驳回
                                                        </button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal"
                                                                data-target=".this-go">下一步
                                                        </button>
                                                    </div>
                                                </div>--%>
                                                <!--按钮完成-->
                                            </div>

                                            <div role="tabpanel" class="tab-pane fade active in" id="tab_content11" aria-labelledby="home-tab">
                                             <%--   <table width="100%" class="table table-hover table-bordered" id="" style="font-size:12px;">
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
                                                        <td colspan="4" bgcolor="#F6F6F6">
                                                            <span style="border-radius:50%;-moz-border-radius:50%;-webkit-border-radius:50%;color:#FFFFFF;padding:4px;background-color:#009688">&nbsp;4&nbsp;</span>
                                                            Determine Assignable Cause(s).确定必然原因(FTA.Fishbone.Pareto)。
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <textarea name="message" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100"></textarea>
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td colspan="4" bgcolor="#F6F6F6">
                                                            <span style="border-radius:50%;-moz-border-radius:50%;-webkit-border-radius:50%;color:#FFFFFF;padding:4px;background-color:#009688">&nbsp;5&nbsp;</span>
                                                            Select and Verify the Solution.选择和验证解决方案。
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <textarea name="message" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100"></textarea>
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td colspan="4" bgcolor="#F6F6F6">
                                                            <span style="border-radius:50%;-moz-border-radius:50%;-webkit-border-radius:50%;color:#FFFFFF;padding:4px;background-color:#009688">&nbsp;6&nbsp;</span>
                                                            Implement Permanent Solution.实施永久解决方案。
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <textarea name="message" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100"></textarea>
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td colspan="4">
                                                            <i class="fa fa-file-text"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm">上传附件
                                                        </button>
                                                        </td>
                                                        &lt;%&ndash;<td colspan="2">
                                                            <i class="fa fa-edit"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm"
                                                                data-toggle="modal" data-target=".this-shenpi">处理审核
                                                        </button>
                                                        </td>&ndash;%&gt;
                                                    </tr>
                                                    <tr>
                                                        <td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：23:15:10</td>
                                                        <td width="20%">Complete Date 完成日期</td>
                                                        <td width="30%">处理中（以完成系统时间为准）</td>
                                                    </tr>
                                                </table>--%>

                                                <!--按钮-->
                                                <%--<div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal"
                                                                data-target=".this-no">驳回
                                                        </button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal"
                                                                data-target=".this-go">下一步
                                                        </button>
                                                    </div>
                                                </div>--%>
                                                <!--按钮完成-->
                                            </div>

                                            <div role="tabpanel" class="tab-pane fade active in" id="tab_content11" aria-labelledby="home-tab">
                                                <%--<table width="100%" class="table table-hover table-bordered" id="" style="font-size:12px;">
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
                                                        <td colspan="4" bgcolor="#F6F6F6">
                                                            <span style="border-radius:50%;-moz-border-radius:50%;-webkit-border-radius:50%;color:#FFFFFF;padding:4px;background-color:#009688">&nbsp;7&nbsp;</span>
                                                            Monitor.Prevent Recurrence.监控，预防再发生（RCA）。
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="4">
                                                            <textarea name="message" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100"></textarea>
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td colspan="4">
                                                            <i class="fa fa-file-text"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm">上传附件
                                                        </button>
                                                        </td>
                                                        &lt;%&ndash;<td colspan="2">
                                                            <i class="fa fa-edit"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm"
                                                                data-toggle="modal" data-target=".this-shenpi">处理审核
                                                        </button>
                                                        </td>&ndash;%&gt;
                                                    </tr>
                                                    <tr>
                                                        <td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：23:15:10</td>
                                                        <td width="20%">Complete Date 完成日期</td>
                                                        <td width="30%">处理中（以完成系统时间为准）</td>
                                                    </tr>
                                                </table>--%>

                                              <%--  <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal"
                                                                data-target=".this-">返回
                                                        </button>
                                                        <button class="btn btn-success" type="reset" data-toggle="modal"
                                                                data-target=".this-go">提交审核
                                                        </button>
                                                    </div>
                                                </div>--%>
                                                <!--按钮完成-->
                                            </div>
                                            <!--7 STEP分段附件结束-->

                                        </div>

                                    </div>
                                </div>
                                <%--</form>--%>
                            </div>
                            <!--卡片工具完成-->
                        </div>


                       <%-- <!--处理记录开始-->
                        <div class="x_panel" style="width:calc(25% - 10px); float:left;">
                            <div class="x_title">
                                <h2>处理记录</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div id="dealLog" class="x_content">

                            </div>
                            <!--处理记录结束-->


                        </div>--%>
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
    <<%--div class="modal fade this-shenpi" tabindex="-1" role="dialog" aria-hidden="true">
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
    </div>--%>
    <%--<div class="modal fade this-go" tabindex="-1" role="dialog" aria-hidden="true">
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
    </div>--%>
    <!-- 遮蔽内容结束 -->


    <!-- 遮蔽内容开始 -->
    <%--<div class="modal fade this-biaodan" tabindex="-1" role="dialog" aria-hidden="true">
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
    </div>--%>
    <!-- 遮蔽内容结束 -->
    <!-- 遮蔽内容开始 -->
   <%-- <div class="modal fade this-no" tabindex="-1" role="dialog" aria-hidden="true">
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
    </div>--%>
    <!-- 遮蔽内容结束 -->
    <%@include file="/view/static/common/core_js.jsp" %>
    <script>


    </script>
</body>
</html>
