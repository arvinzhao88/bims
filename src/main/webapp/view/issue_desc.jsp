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

        label.error{color: red;}
    </style>

    <script type="text/javascript">
        var ctx = '${webPath}';
    </script>
</head>

<body class="nav-md" style="height:100%;">

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
            <%--<div class="page-title">
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
                    <c:if test="${issue.qualityType == 'J'}">
                        <h3>JOB1</h3>
                    </c:if>
                    <c:if test="${issue.qualityType == 'B'}">
                        <h3>BIS</h3>
                    </c:if>
                    <c:if test="${issue.qualityType == 'E'}">
                        <h3>EQA</h3>
                    </c:if>
                    <c:if test="${issue.qualityType == 'S'}">
                        <h3>SQA</h3>
                    </c:if>
                </div>
            </div>--%>

            <div class="clearfix"></div>
            <div class="x_panel">

                <div class="x_title">
                    <h2>问题描述</h2>
                    <ul class="nav navbar-right panel_toolbox">
                        <%--<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>--%>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <%@include file="/view/back/bims/qualityissues/common/issuedesc.jsp" %>
                <!--按钮-->
                <%--<div class="ln_solid"></div>--%>
                <div class="form-group">
                    <div id="btn1" style="text-align:center;">
                        <button class="btn btn-danger" type="button" data-toggle="modal" onclick="reject(${issue.id})">打回重填
                        </button>
                        <button class="btn btn-primary" type="button" data-toggle="modal" onclick="receive(${issue.id})">确认接收
                        </button>
                    </div>
                </div>
                <!--按钮完成-->
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
    $("#menuHomeParent").addClass("active");
    /**父菜单*/
    $("#menuHomeHomeChild").css('display','block');
    //$("#menuIssusParent").show();
    /**子菜单*/
    $("#menu").addClass("current-page");

</script>
<script>
    //点击显示图片
    function showImg(url) {
        $("#show").html("<img src='" + url + "' />");
    }

    /** 展示图片 **/
    function showImg(byteImg) {
        $("#showImg").html("<img style='width: 100%;height: 100%;' src='"+byteImg+"' />");
    }

    //接收
    function receive(id) {
        layer.confirm('确定接收问题吗？', {icon: 3, title:'系统提示'}, function(index){
            $.ajax({
                type : "POST",
                dataType : "json",
                url : ctx+'/bims/desk/receive',
                data : {
                    id: id,
                },
                success : function(result) {
                    if(result.success) {
                        layer.msg('已接收');
                        window.location.href = '${webPath}/back/index';
                    }
                    if(result.success==false) {
                        layer.msg('无权操作该数据');
                    }
                    perEloancn.table.grid.ajax.reload();
                },
                error : function() {
                    layer.msg('失败');
                }
            });
            layer.close(index);
        });
    }
    //驳回
    function reject(id) {
        layer.confirm('确定驳回给录入人吗？', {icon: 3, title:'系统提示'}, function(index){
            $.ajax({
                type : "POST",
                dataType : "json",
                url : ctx+'/bims/desk/reject',
                data : {
                    id: id,
                },
                success : function(result) {
                    if(result.success) {
                        layer.msg('已驳回');
                        window.location.href = '${webPath}/back/index';
                    }
                    if(result.success==false) {
                        layer.msg('无权操作该数据');
                    }
                    perEloancn.table.grid.ajax.reload();
                },
                error : function() {
                    layer.msg('失败');
                }
            });
            layer.close(index);
        });
    }
</script>
</body>
</html>
