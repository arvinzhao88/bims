<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@include file="/view/static/common/base.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" href="${resPath}/view/static/images/favicon.ico"
		  type="image/ico" />
	<title>${sysName}</title>
	<%@include file="/view/static/common/global_css.jsp"%>

	<style type="text/css">
		th{
			border-bottom-width: 0px !important;
		}
		th,td{
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
		var ctx='${webPath}';
	</script>
</head>

<body class="nav-md">

<div class="container body">
<div class="main_container">

<div class="col-md-3 left_col">
<div class="left_col scroll-view">

	<%@include file="/view/static/common/sysinfo.jsp"%>

<!-- 侧导航开始 -->
	<%@include file="/view/static/common/siderbar.jsp"%>
<!-- /测导航结束 -->
</div>
</div>

<!-- 顶部开始 -->
	<%@include file="/view/static/common/head.jsp"%>
<!-- 顶部结束 -->

        <!-- 内容区开始 -->
<div class="right_col" role="main">

<div class="page-title">

	<div class="page-title">
		<div class="title_left"><h3>用户管理</h3></div>
	</div>
	<div class="row">
		<div class="col-md-12 col-sm-12 col-xs-12">
			<div class="x_panel">
				<div class="x_title">
					<div style="width: 100%; height: 40px;">
						<h2>用户列表</h2>
					</div>
					<div style="width: 100%; margin-bottom: 8px;">
						<label style="float: left; padding-top: 0.5%;">工号：</label>
						<input id="searchText" name="text" class="form-control" style="width: 15%; float: left; margin-left: 12px;" placeholder="请输入工号" >
						<label style="float: left; padding-top: 0.5%; margin-left: 2%;">用户名：</label>
						<input id="user_name" name="user_name" class="form-control" style="width: 15%; float: left; margin-left: 12px;" placeholder="请输入用户名" >
						<button id="search" class="btn btn-primary" style="margin-left: 2%;">查询</button>
						<button class="btn btn-default" onclick="javascript:location.reload()">重置</button>
						<%--<button class="btn btn-primary" style="float: right;" onclick="javascript:location.href='${webPath}/permission/jumpAddUser'">新建</button>
					--%></div>
					<div class="clearfix"></div>
				</div>
            <div class="x_content">
			  <table width="100%" class="table table-bordered table-hover" id="example" style="margin-bottom: 0px;border-bottom: 0px;">
                <thead>
                  <tr>
                    <th>序号</th>
                    <th>工号</th>
                    <th>用户名</th>
                    <th>登录名</th>
                    <th>手机号</th>
                    <th>邮箱</th>
					<th>对应区域</th>
				  	<th>创建时间</th>
				 	<th>操作</th>
                  </tr>
                </thead>
                <tbody>

                </tbody>
              </table>
            </div>

</div>
</div>
</div>
</div>
</div>
        <!-- 内容区结束 -->

        <!-- 页脚开始 -->
	<%@include file="/view/static/common/foot.jsp"%>
        <!-- 页脚结束 -->
</div>
</div>


	<%@include file="/view/static/common/core_js.jsp"%>
<%--<link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>--%>
<div class="modal fade this-restPwd" tabindex="-1" role="dialog" aria-hidden="true" >
	<div class="modal-dialog modal-lg" style="width:400px;padding-top:200px;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
				<h4 class="modal-title" id="myModalLabel">密码修改</h4>
			</div>
			<div class="modal-body">
				<label>新密码：</label>
				<input id="pwd" type="text" class="form-control" placeholder="密码的格式为6-12位,只能是字母、数字和下划线" required/>
				<input id="userId" type="hidden" class="form-control" value="" placeholder="" required/>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onclick="savePwd()">保存</button>
				<button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
			</div>
		</div>
	</div>
</div>
</body>
<script type="text/javascript">
	$(document).ready(
			function () {
				dataTablesInit(apucheck);
			});
</script>
<script type="text/javascript" src="${resPath}/view/permission/js/showUser.js"></script>
<script type="text/javascript">
	function resetPwd(id) {
		$(".this-restPwd").modal("show");
		$("#userId").val(id);
	}
	function savePwd() {
		var id = $("#userId").val();
		var password = $("#pwd").val();
		var reg = /^[A-Za-z0-9]{6,16}$/;
		var flagnewPwd = reg.test(password);
		if (password == null || password == ""){
			layer.msg("请输入新密码!");
			return;
		}
		if(flagnewPwd == false){
			layer.msg("密码必须由 6-16位字母、数字组成");
			return;
		}
		$.ajax({
			type : "POST",
			async: false,
			url : "${webPath}/back/restPwd",
			dataType : "json",
			data :{
				id: id,
				password: password,
			},
			success : function(data) {
				if(data.success){
					layer.msg("重置密码成功!");
				}else{
					alert(data.msg);
				}
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				layer.msg("重置密码失败!");
			}
		});
	}
</script>
</html>
