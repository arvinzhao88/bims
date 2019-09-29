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
                            <h2>处理工具</h2>
                            <%--<span style="float:right; font-size:14px; margin-top:10px;">状态：<font
                                style="color:#00CC00; font-weight:bold;">处理中</font></span>--%>
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
                                                                            aria-expanded="false">SCAR</a></li>
                                        <li role="presentation" class=""><a href="#tab_content33" id="home-tabb"
                                                                            role="tab" data-toggle="tab"
                                                                            aria-controls="home"
                                                                            aria-expanded="true">7 STEP</a></li>--%>
                                        <li role="presentation" class="active"><a href="#tab_content4" role="tab"
                                                                            id="profile-tab" data-toggle="tab"
                                                                            aria-controls="profile"
                                                                            aria-expanded="false">Notification</a>
                                        </li>
                                    </ul>


                                    <!--Car表单工具开始-->
                                    <div id="myTabContent2" class="tab-content">

                                        <!--Notification开始-->
                                        <div role="tabpanel" class="tab-pane fade active in" id="tab_content4"
                                             aria-labelledby="profile-tab">
                                            <table width="100%" class="table table-hover table-bordered"
                                                   id="notification" style="font-size:12px;">
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
                                                                      data-parsley-maxlength="100"
                                                                      placeholder="请输入通知内容"
                                                            ></textarea>
                                                    </td>
                                                </tr>
                                            </table>
                                            <h2>邮件接收人</h2>
                                            <select id="sendEmail" name="email" class="form-control"  multiple="multiple">
                                            </select>
                                            <!--按钮-->
                                            <div class="ln_solid"></div>
                                            <div class="form-group">
                                                <div class="form-group" style="text-align:center">
                                                    <button class="btn" type="button" onClick="javascrtpt:window.location.href='${webPath}/bims/apucheck/apuLearder?id='+${issue.id}">返回</button>
                                                    <button class="btn btn-primary" type="button" data-toggle="modal"
                                                            data-target=".this-close">问题关闭
                                                    </button>
                                                    <button class="btn btn-success" type="button" data-toggle="modal"
                                                            data-target=".this-send">发送邮件
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

<div class="modal fade this-close" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="">确定</h4>
            </div>
            <div class="modal-body">
                <p>确定关闭问题吗?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onclick="closeIssue()">确定
                </button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade this-send" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="">确定</h4>
            </div>
            <div class="modal-body">
                <p>确定发送邮件吗?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onclick="send()">确定
                </button>
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
    /*$(function getDealLog() {
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
    })*/

    //发送邮件
    function send() {
        var msg = $("#message").val();
        var emails = $("#sendEmail").val();
        var str = emails.toString();
        $.ajax({
            url: '${webPath}/sendEmail/send',
            type: "POST",
            dataType: "json",
            data: {
                notificationInfo: msg,
                back1: str,
            },
            success: function (res) {
                alert("邮件已发送");
            }
        })
    }
    //关闭问题
    function closeIssue() {
        alert("问题已关闭");
        /*$.ajax({
            url: '${webPath}/car/addStep1',
            type: "POST",
            dataType: "json",
            data: params,
            success: function (res) {
                window.location.href = '${webPath}/bims/apucheck/toCarStepAll?carId=' + carId + '&issueId=' + issueId;
            }
        })*/
    }

    /** 邮件接收人 **/
    /*$("#sendEmail").select2({
        placeholder: "--输入姓名--",
        language: "zh-CN",
        minimumInputLength: 0,
        allowClear: true,
        ajax : {
            url : ctx+"back/person/queryByName",
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
                        text : o.name    //取出items中CodeName赋值给text
                    });
                });
                return {
                    results: options        //返回数据
                };
            },
            cache : true
        }
    });*/

    jQuery(document).ready(function() {
        //前置库下拉框
        $('#sendEmail').select2({
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
                        var email="";
                        if (o.email==null || o.email=="") {
                            email = '';
                        }else {
                            email = '('+o.email+')';
                        }
                        options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                            id : o.email,         //取出items中Code赋值给id
                            text : o.name+email,
                        });
                    });
                    return {
                        results: options        //返回数据
                    };
                },
                cache : true
            }
        });
    });
</script>
</body>
</html>
