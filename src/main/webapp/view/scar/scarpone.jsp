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

<body style="background: white">

<div>
    <div class="x_panel" style="width:100%;float:left; margin-right:200px;">
        <%--<div class="x_title">
            <h2>处理工具</h2><span style="float:right; font-size:14px; margin-top:10px;">状态：<font
                style="color:#00CC00; font-weight:bold;">处理中</font></span>
            <div class="clearfix"></div>
        </div>--%>
        <!--卡片工具开始-->
        <div class="x_content">
            <%--<form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">--%>
            <div class="form-group">
                <div class="" role="tabpanel" data-example-id="togglable-tabs">
                    <%--<ul id="myTab1" class="nav nav-tabs bar_tabs right" role="tablist">--%>
                        <%--<li role="presentation" class="active"><a href="#tab_content11"
                                                                  id="home-tabb" role="tab"
                                                                  data-toggle="tab"
                                                                  aria-controls="home"
                                                                  aria-expanded="true">CAR</a></li>
                        <li role="presentation" class=""><a href="#tab_content22" role="tab"
                                                            id="profile-tabb" data-toggle="tab"
                                                            aria-controls="profile"
                                                            aria-expanded="false">SCAR</a></li>--%>
                        <%--<li role="presentation" class="active"><a href="#tab_content33" id="home-tabb"
                                                                  role="tab" data-toggle="tab"
                                                                  aria-controls="home"
                                                                  aria-expanded="true">7 STEP</a></li>--%>
                        <%--<li role="presentation" class=""><a href="#tab_content44" role="tab"
                                                            id="profile-tabb" data-toggle="tab"
                                                            aria-controls="profile"
                                                            aria-expanded="false">Notification</a>
                        </li>--%>
                    </ul>


                    <!--Car表单工具开始-->
                    <div id="myTabContent2" class="tab-content">
                        <!--7 STEP分段附件结束-->
                        <form id="form1" name="form1" method="post">
                            <input type="hidden"  name="issueId" value="${issue.id}">
                            <input type="hidden"  name="id" value="${toolsId}">
                            <input type="hidden" name="back1" value="${leadaccount}">
                            <input type="hidden" name="back2" value="${checkaccouunt}">
                            <div role="tabpanel" class="tab-pane fade active in" id="tab_content13" aria-labelledby="home-tab">
                                <table width="100%" class="table table-hover table-bordered" id="" style="font-size:12px;">
                                    <tr>
                                        <td colspan="4">
                                            <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                    class="fa fa-file-text"></i> SCAR &nbsp;&nbsp;&nbsp;&nbsp;<i
                                                    class="fa fa-clock-o green"></i> 截至日期：24小时
                                            </div>

                                        </td>
                                    </tr>

                                    <tr>
                                        <td colspan="4" bgcolor="#F6F6F6">
                                            <p style="text-align: left;font-size: 15px"><span style="border-radius:50%;-moz-border-radius:50%;-webkit-border-radius:50%;color:#FFFFFF;padding:4px;background-color:#009688">&nbsp;1&nbsp;</span>
                                                Identify the problem.识别问题(5W2H)。</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="4">
                                            <textarea  style="float:left" id="text1"    name="sevenstepDesc" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100">${issue.issueDesc}</textarea>
                                        </td>

                                </table>
                                <form/>

                            </div>

                            <div role="tabpanel" class="tab-pane fade active in" id="tab_content12" aria-labelledby="home-tab">


                                <!--按钮-->
                                <div class="ln_solid"></div>
                                <div class="form-group">
                                    <div style="text-align:center;">
                                        <%--  <button class="btn btn-danger" type="reset" data-toggle="modal"
                                                  data-target=".this-no">驳回
                                          </button>--%>
                                        <button class="btn btn-primary" type="button" data-toggle="modal" onclick="submitData()"
                                                data-target=".this-go">下一步
                                        </button>
                                    </div>
                                </div>
                                <!--按钮完成-->
                            </div>

                            <div role="tabpanel" class="tab-pane fade active in" id="tab_content11" aria-labelledby="home-tab">

                            </div>
                            <!--7 STEP分段附件结束-->

                            <%--  </div>--%>

                    </div>
                </div>
                <%--</form>--%>
            </div>
            <!--卡片工具完成-->
        </div>


    </div>

<%-- <div class="main_container">--%>

        <%--<div class="col-md-3 left_col">
            <div class="left_col scroll-view">

               &lt;%&ndash; <%@include file="/view/static/common/sysinfo.jsp" %>&ndash;%&gt;

                <!-- 侧导航开始 -->
              &lt;%&ndash;  <%@include file="/view/static/common/siderbar.jsp" %>&ndash;%&gt;
                <!-- /测导航结束 -->
            </div>
        </div>--%>

        <!-- 顶部开始 -->
        <%--<%@include file="/view/static/common/head.jsp" %>--%>
        <!-- 顶部结束 -->

        <!-- 内容区开始 -->
        <%--<div class="right_col" role="main">--%>


        <!-- 内容区开始 -->
<%--        <div class="right_col" role="main">--%>
<%--           &lt;%&ndash; <div class="page-title">--%>
<%--                <div class="title_left"><h3>A区 问题处理</h3></div>--%>
<%--            </div>&ndash;%&gt;--%>

<%--            <div class="clearfix"></div>--%>

<%--            <div class="row">--%>
<%--                <div class="col-md-12 col-sm-12 col-xs-12">--%>

<%--                    </div>--%>

<%--            </div>--%>
<%--        </div>--%>
        <!-- 内容区结束 -->

        <!-- 页脚开始 -->
<%--        <%@include file="/view/static/common/foot.jsp" %>--%>
        <!-- 页脚结束 -->
    </div>
</div>


<!-- 遮蔽内容结束 -->
<%@include file="/view/static/common/core_js.jsp" %>
<script>
    function  submitData() {
        var text= $("#text1").val();

        if(text == "" || text == null || text == undefined){
            layer.msg("请填写数据");
           return false

        }
        console.log($('#form1').serialize());


        layer.confirm('确定提交给责任人处理吗？', {
            // btn: ['确定','取消'] //按钮
            title: "系统提示",
            icon: 3
        }, function(){
            $.ajax({
                url: "${resPath}/Scar/updatesevenstep",
                type: "post",
                data: $('#form1').serialize(),
                success: function (data) {
                    console.log(data)
                    window.location.href="${webPath}/Scar/showSevenStep/"+data.obj;
                    // layer.alert("已提交给责任人处理");
                }
            });
        }, function(){
        });



        /*$.ajax({
            url: "${resPath}/Scar/updatesevenstep",
            type: "post",
            data: $('#form1').serialize(),
            success: function (data) {
                console.log(data)
                window.location.href="${webPath}/Scar/showSevenStep/"+data.obj;
               // layer.alert("已提交给责任人处理");
            }
        });*/
    }



</script>
</body>
</html>
