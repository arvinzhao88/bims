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

        label.error{color: red;}
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
        <div class="right_col" role="main">
            <div class="page-title">
                <div class="title_left"><h3>JOB1 问题处理</h3></div>
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
                        <%@include file="/view/back/bims/qualityissues/common/issuedesc.jsp" %>
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
                            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                <input type="hidden" name="issueId" value="${issue.id}">
                                <div class="form-group">


                                    <!--7 STEP分段附件结束-->

                                    <table width="100%" class="table table-hover table-bordered" id="datatable1">
                                        <tr>
                                            <td colspan="3">
                                                <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                        class="fa fa-file-text"></i> 处理
                                                </div>
                                                <%--<div style="color:#5A738E; float:right;">责任人：材料采购部 胡平</div>--%>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="30%">
                                                <i class="fa fa-file-image-o"
                                                   style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                    type="button" class="btn btn-default btn-sm" onclick=$("#AAABBB").click();>上传附件</button><span id="attment"></span>
                                                <input type="file" name="AAABBB" id="AAABBB" style="display: none;" onchange="upAtt();">
                                                <input type="hidden" name="attment" id="attmentFile" style="display: none;" value="">
                                            </button>
                                            </td>
                                            <td width="30%">
                                                <i class="fa fa-file-text"
                                                   style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;
                                                <button type="button" class="btn btn-default btn-sm" onclick="$('#YYZZFBSMJ').click();">上传措施
                                                </button><span id="measureAttment"></span>
                                                <input type="file" multiple name="YYZZFBSMJ" id="YYZZFBSMJ" style="display: none;" onchange="upMea();">
                                                <input type="hidden" name="measureAttment" id="measureFile" style="display: none;" value="">
                                                <%--<input type="text" id="measureText" name="measureText" required
                                                       style="width:100%; height:35px; padding:5px;"
                                                       placeholder="输入措施">--%>
                                            </td>
                                            <td width="40%">
                                                <textarea id="measureText" name="measureText"  cols="200" rows="2"
                                                          class="form-control" required placeholder="输入措施">${jobReview.measureText}
                                                </textarea>
                                            </td>
                                        </tr>
                                    </table>

                                    <div class="ln_solid"></div>
                                    <div class="form-group">
                                        <div style="text-align:center;">
                                            <button class="btn btn-primary" type="button" data-toggle="modal" onclick="checkNull()">提交
                                            </button>
                                        </div>
                                    </div>
                                    <!--按钮完成-->
                                    <div class="x_title">
                                        <h2>评审记录</h2>
                                        <div class="clearfix"></div>
                                    </div>

                                    <div class="x_content">

                                        <table class="table table-bordered">
                                            <thead>
                                            <tr>
                                                <th style="width: 5%">序号</th>
                                                <th style="width: 10%">责任部门</th>
                                                <th style="width: 10%">责任人</th>
                                                <th style="width: 10%">措施</th>
                                                <th style="width: 10%">评审结论</th>
                                                <th style="width: 15%">日期</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${jobReviewList}" var="jobReviewList" varStatus="status">
                                                <c:if test="${not empty jobReviewList.conclusion}">
                                                    <tr>
                                                        <th scope="row">${status.count}</th>
                                                        <td>${jobReviewList.handlerDeptName}</td>
                                                        <td>${jobReviewList.handlerPersonName}</td>
                                                        <td>${jobReviewList.measureText}</td>
                                                        <td><c:if test="${jobReviewList.conclusion == '1'}">OK</c:if>
                                                            <c:if test="${jobReviewList.conclusion == '2'}">NOK</c:if></td>
                                                        <td><fmt:formatDate value="${jobReviewList.reviewDate}" pattern="yyyy-MM-dd"/> </td>
                                                    </tr>
                                                </c:if>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>

                                </div>
                            </form>
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
    $("#menuJobOne").addClass("current-page");

</script>
<script>
    $(function () {
        getDealLog();
    })
    //获取处理记录
    function getDealLog(){
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
                            + '<div style="width:51%; float:right">' + logList[i].processPerson + '<'+logList[i].processPersonAccount+'>'+ ' ' + logList[i].actionName + '</div>'
                            + '</div>';
                    }
                }
                $("#dealLog").append(html);
            }
        })
    }
    //提交时验证
    function checkNull(){
        if($("#demo-form2").valid()){
             var params = $("#demo-form2").serialize();
            layer.confirm('确定提交给发起人处理问题吗？', {icon: 3, title: '系统提示',offset: "50%"}, function (index) {
                $.ajax({
                    type: "post",
                    url: "${webPath}/bims/job/jobReviewt1",
                    data: params,
                    dataType: "json",
                    success: function (data) {
                        console.log(data)
                        if (data.success) {
                            console.log(data)
                            layer.msg("已保存");
                            setTimeout(window.location.href = '${webPath}/back/toJobOne', 1000);
                        } else {
                            layer.msg("操作失败");
                        }
                    },
                    error: function (data) {
                        layer.msg("操作失败");
                    }
                });
            });
        }
        return;
    };




    //附件上传
    function upAtt(){
        var formData = new FormData();
        formData.append("file",$("#AAABBB")[0].files[0]);
        console.log($("#AAABBB")[0].files[0])
        $("#attment").text($("#AAABBB")[0].files[0].name);
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
            $("#attmentFile").val(data.imgPath);
        }).error(function () {
            return layer.msg('上传失败');
        });
    }

    //措施附件上传
    function upMea(){
        var formData = new FormData();
        formData.append("file",$('#YYZZFBSMJ')[0].files[0]);
        console.log($('#YYZZFBSMJ')[0].files[0])
        $("#measureAttment").text($('#YYZZFBSMJ')[0].files[0].name);
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
            $("#measureFile").val(data.imgPath);
        }).error(function () {
            return layer.msg('上传失败');
        });
    }
</script>
</body>
</html>
