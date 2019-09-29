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
	<link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>
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

				<div class="navbar nav_title" style="border: 0;">
					<a href="index.jsp" class="site_title">&nbsp;<img src="/view/static/images/logo1.png" alt="..."  width="33" height="30">&nbsp;
						<img src="/view/static/images/logo2.png" alt="..."  width="120" height="30"></a>
				</div>
				<div class="clearfix"></div>

				<!-- 导航上方用户标示开始 -->
				<div class="profile clearfix">
					<div class="profile_pic"><img src="/view/static/images/img.jpg" alt="..." class="img-circle profile_img"></div>
					<div class="profile_info"><span>生产制造部</span><h2>赵小鸣</h2></div>
				</div>
				<br />
				<!-- 导航上方用户标示结束 -->

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

				<div class="title_left"><h3>A区 问题处理</h3></div>
				<div class="title_right">
					<div class="col-md-6 col-sm-5 col-xs-12 form-group pull-right top_search">
						<div class="input-group">
							<input name="text" type="text" class="form-control" placeholder="查询">
							<span class="input-group-btn">
				  <button class="btn btn-default" type="button"><i class="fa fa-search"></i></button></span>
						</div></div>
				</div>
			</div>

			<div class="clearfix"></div>

			<div class="row">
				<div class="col-md-12 col-sm-12 col-xs-12">
					<div class="x_panel">
						<div class="x_title">
							<h2>列表</h2>
							<ul class="nav navbar-right panel_toolbox">
								<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
							</ul>
							<!--工具条-->
							<label class="control-label" style="width:100px;float:left; padding:8px 0 0 20px; text-align:right;">是否EQR：</label>
							<select class="form-control" style="width:110px; float:left">
								<option>- 请选择 -</option>
								<option>是</option>
								<option>否</option>
							</select>
							<label class="control-label" style="width:100px;float:left; padding:8px 0 0 20px; text-align:right;">处理状态：</label>
							<select class="form-control" style="width:110px; float:left">
								<option>- 请选择 -</option>
								<option>待处理</option>
								<option>处理中</option>
								<option>超期</option>
								<option>驳回</option>
								<option>审核中</option>
								<option>关闭</option>
							</select>
							<label class="control-label" style="width:100px;float:left; padding:8px 0 0 20px; text-align:right;">质量分类：</label>
							<select class="form-control" style="width:110px; float:left">
								<option>- 请选择 -</option>
								<option>过程缺陷</option>
								<option>整机缺陷</option>
							</select>
							&nbsp;&nbsp;<button type="submit" class="btn btn-success" style="margin-bottom:-4px;">确定</button>
							&nbsp;&nbsp;<button type="submit" class="btn btn-primary" style="margin-bottom:-4px;"><i class="fa fa-download"></i> 导入</button>
							&nbsp;&nbsp;<button type="submit" class="btn btn-primary" style="margin-bottom:-4px;"><i class="fa fa-upload"></i> 导出</button>
							&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-success" style="margin-bottom:-4px;" onClick="location.href='${webPath}/back/azoneAdd'"><i class="fa fa-plus-circle"></i> 新建问题</button>
							<!--工具条结束-->
							<div class="clearfix"></div>
						</div>

						<div class="x_content">
							<table width="100%" class="table table-bordered table-hover" id="example" style="margin-bottom: 0px;border-bottom: 0px;">
								<thead>
								<tr>
									<th>编号</th>
									<th>问题标题</th>
									<th>质量分类</th>
									<th>区域</th>
									<th>问题分类</th>
									<th>问题工位</th>
									<th>录入人</th>
									<th>处理人</th>
									<th>EQR</th>
									<th>处理方式/责任人</th>
									<th>状态</th>
									<th>操作</th>
								</tr>
								</thead>
								<tbody>
								<%--<tr>
									<td>181105012</td>
									<td><a href="z_a_correct.jsp"><strong>这里是质量描述的内容用于作为</strong></a></td>
									<td>过程缺陷</td>
									<td>XXX区</td>
									<td>问题分类的具体内容</td>
									<td>A区1123</td>
									<td>张无忌</td>
									<td>张无忌</td>
									<td>是</td>
									<td>---/---</td>
									<td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color:#0099FF; font-weight:bold;">待处理</font></td>
									<td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
								</tr>
								<tr>
									<td>181105012</td>
									<td><a href="z_a_correct.jsp"><strong>这里是质量描述的内容用于作为</strong></a></td>
									<td>过程缺陷</td>
									<td>XXX区</td>
									<td>问题分类的具体内容</td>
									<td>A区1123</td>
									<td>张无忌</td>
									<td>何晓峰</td>
									<td>是</td>
									<td>（<font color="#FF0000">驳回</font>）7STEP / 张晓明<br>
										（<font color="#FF0000">超时</font>）SCAR / 李俊</td>
									<td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color:#0099FF; font-weight:bold;">待处理</font></td>
									<td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
								</tr>
								<tr>
									<td>181105013</td>
									<td><a href="z_a_correct.jsp"><strong>这里是的内容用于作的标题</strong></a></td>
									<td>整机缺陷</td>
									<td>XXX区</td>
									<td>问题分类的具体内容</td>
									<td>A区1123</td>
									<td>王丙</td>
									<td>刘海</td>
									<td>否</td>
									<td>7STEP / 张三<br>SCAR / 李冰<br>Notification</td>
									<td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color:#00CC00; font-weight:bold;">处理中</font></td>
									<td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
								</tr>
								<tr>
									<td>181105013</td>
									<td><a href="z_a_correct.jsp"><strong>这里是的内容用于作的标题</strong></a></td>
									<td>整机缺陷</td>
									<td>XXX区</td>
									<td>问题分类的具体内容</td>
									<td>A区1123</td>
									<td>王丙</td>
									<td>刘海</td>
									<td>否</td>
									<td>7STEP / 张三<br>
										SCAR / 张三</td>
									<td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style="color:#FF9900; font-weight:bold;">审核中</font></td>
									<td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
								</tr>
								<tr>
									<td>181105013</td>
									<td><a href="z_a_correct.jsp"><strong>这里是的内容用于作的标题</strong></a></td>
									<td>整机缺陷</td>
									<td>XXX区</td>
									<td>问题分类的具体内容</td>
									<td>A区1123</td>
									<td>王丙</td>
									<td>刘海</td>
									<td>否</td>
									<td>7STEP / 张晓明<br>
										SCAR / 李俊</td>
									<td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color:#666666; font-weight:bold;">关闭</font></td>
									<td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
								</tr>--%>
								</tbody>
							</table>





							<%--<br><br>
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-bordered" style="background-color:#FFFF99">
								<tr>
									<td><strong>角色</strong></td>
									<td><strong>人员</strong></td>
									<td><strong>操作</strong></td>
									<td><strong>列表状态</strong></td>
								</tr>
								<tr>
									<td rowspan="3"><strong>提交人</strong></td>
									<td>产线工人(手机)</td>
									<td>新建提交</td>
									<td>待处理</td>
								</tr>
								<tr>
									<td>区域质量检验员(后台)</td>
									<td>新建提交、修正手机提交、是否EQR、打开处理工具并指定责任人</td>
									<td>待处理（或责任人驳回或超时）、处理中</td>
								</tr>
								<tr>
									<td>EQR leader</td>
									<td>填写《突发质量问题通知单》并邮件通知、打开处理工具并指定责任人</td>
									<td>待处理（或责任人驳回或超时）、处理中</td>
								</tr>
								<tr>
									<td><strong>责任人</strong></td>
									<td>被指定的各部门具体责任人</td>
									<td>填写处理工具、表单</td>
									<td>待处理（或审核人驳回或超时）、审核中</td>
								</tr>
								<tr>
									<td rowspan="2"><strong>审核人</strong></td>
									<td>区域质量检验员</td>
									<td>审核处理工具、表单</td>
									<td>待处理、关闭（延时待关闭）</td>
								</tr>
								<tr>
									<td>EQR leader</td>
									<td>审核处理工具、表单</td>
									<td>待处理、关闭（延时待关闭）</td>
								</tr>
							</table>

							<br><br>--%>
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
<!-- 遮蔽内容开始 -->
<div class="modal fade this-true" tabindex="-1" role="dialog" aria-hidden="true" >
	<div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
		<div class="modal-content">

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
				<h4 class="modal-title" id="myModalLabel">删除</h4>
			</div>
			<div class="modal-body">
				<p>确定删除该条问题吗?</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
				<button type="button" class="btn btn-primary antoclose2" data-dismiss="modal">确定</button>
			</div>
		</div>
	</div>
</div>


<div class="modal fade this-time" tabindex="-1" role="dialog" aria-hidden="true" >
	<div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
		<div class="modal-content">

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
				<h4 class="modal-title" id="myModalLabel">处理状态</h4>
			</div>


			<div style="padding:20px;">
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
					<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
					<div style="width:8%; float:left; text-align:center"><img src="/view/static/images/time.png"></div>
					<div style="width:51%; float:right">录入人 提交问题</div>
				</div>
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
					<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
					<div style="width:8%; float:left; text-align:center"><img src="/view/static/images/time.png"></div>
					<div style="width:51%; float:right">工程师 修正更新问题</div>
				</div>
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
					<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
					<div style="width:8%; float:left; text-align:center"><img src="/view/static/images/time.png"></div>
					<div style="width:51%; float:right">工程师 选择EQR</div>
				</div>
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
					<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
					<div style="width:8%; float:left; text-align:center"><img src="/view/static/images/time.png"></div>
					<div style="width:51%; float:right">Leader 选择责任人</div>
				</div>
			</div>


			<div class="modal-footer">
				<button type="button" class="btn btn-primary antoclose2" data-dismiss="modal">确定</button>
			</div>
		</div>
	</div>
</div>
<!-- 遮蔽内容结束 -->

<%@include file="/view/static/common/core_js.jsp"%>
<script type="text/javascript">
	$(document).ready(
			function () {
				dataTablesInit(azone);
			});
</script>
<script type="text/javascript" src="${resPath}/view/back/bims/js/qualityissues/azone/azone.js"></script>
</body>
</html>
