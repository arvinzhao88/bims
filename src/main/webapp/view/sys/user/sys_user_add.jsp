<%--
  添加用户
  Date: 2019/6/17
  Time: 10:23
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="${resPath}/view/static/images/favicon.ico" type="image/ico"/>
    <title>用户管理</title>
    <%@include file="/view/static/common/global_css.jsp" %>
    <style type="text/css">
        th {
            border-bottom-width: 0px !important;
        }
        th, td {
            text-align: center;
            vertical-align: middle !important;
        }
    </style>
</head>
<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
                <%@include file="/view/static/common/sysinfo.jsp" %>
                <!-- 侧导航开始 -->
                <%@include file="/view/static/common/siderbar.jsp" %>
                <!-- 侧导航结束 -->
            </div>
        </div>
        <!-- 顶部开始 -->
        <%@include file="/view/static/common/head.jsp" %>
        <!-- 顶部结束 -->
        <!-- 内容区开始 -->
        <div class="right_col" role="main">
            <div class="page-title">
                <div class="title_left"><h3>添加用户</h3></div>
                <div class="title_right">
                    <div class="col-md-6 col-sm-5 col-xs-12 form-group pull-right top_search">
                        <div class="input-group">
                            <input id="search" name="text" type="text" class="form-control" placeholder="查询">
                            <span class="input-group-btn">
				                <button class="btn btn-default" type="button"><i class="fa fa-search"></i></button>
                            </span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clearfix"></div>
            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">


                        </div>

                        <div class="x_content">


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
<%@include file="/view/static/common/core_js.jsp" %>
<script type="text/javascript">

</script>
</body>
</html>
