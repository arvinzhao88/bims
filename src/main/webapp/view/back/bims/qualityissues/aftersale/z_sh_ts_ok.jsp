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
			<div class="title_left"><h3>问题处理</h3></div>
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
     <table width="100%" class="table table-hover table-bordered">
                  <tr>
                    <th>信息来源：</th>
                    <td>OEM Quality</td>
                    <th>整车/设备制造商和客户名称：</th>
                    <td>天津福冈汽车制造有限公司</td>
                    <th>出厂编号：</th>
					<td>QC48282994-12</td>
				  </tr>

                  <tr>
                    <th>发动机系列：</th>
                    <td><a href="z_a_correct.jsp">IFX</a></td>
                    <th>发动机型号：</th>
                    <td>3.8</td>
                    <th>发动机 ESN：</th>
                    <td>45123321</td>
				  </tr>
				  
                  <tr>
                    <th>发动机 SO：</th>
                    <td>555343</td>
                    <th>发动机生产日期：</th>
                    <td>2014.02.04</td>
                    <th>服务站名称：</th>
                    <td>河南天河汽车销售有限公司</td>
				  </tr>
				  
                  <tr>
                    <th>服务站联系人及方式：</th>
                    <td>张晓华  13888888888</td>
                    <th>出厂日期：</th>
                    <td>2015.02.22</td>
                    <th>购车日期：</th>
                    <td>2015.04.13</td>
                  </tr>
				  
                  <tr>
                    <th>故障日期：</th>
                    <td>2015.07.13</td>
                    <th>故障里程：</th>
                    <td>123514 公里</td>
                    <th>失效数量：</th>
                    <td>2</td>
                  </tr>
				 
				  <tr>
                    <th>失效区域：</th>
                    <td>发动机传动齿轮组</td>
                    <th>使用工况及环境：</th>
                    <td colspan="3">这里是使用工况及环境的具体内容</td>
                  </tr>
				  
			<tr>
			<td colspan="6"></td>
			</tr>
				  
                  <tr>
                    <th>用户姓名：</th>
                    <td>黄大报</td>
                    <th>用户电话：</th>
                    <td>13898989888</td>
                    <th>用户类型：</th>
                    <td>运输公司货运司机</td>
                  </tr>
			<tr>
			<td colspan="6"></td>
			</tr>
				  <tr>
                    <th>故障现象：</th>
                    <td>这里显示发动机故障现象的具体描述</td>
                    <th>祸首件名称：</th>
                    <td>皮带紧涨轮</td>
                    <th>故障模式：</th>
                    <td>这里显示故障模式的详细内容</td>
                  </tr>
				  
                  <tr>
                    <th>祸首件图号：</th>
                    <td colspan="5">0028991333</td>
                  </tr>
			<tr>
			<td colspan="6"></td>
			</tr>
			      <tr>
                    <th>现场检查：</th>
                    <td colspan="5">这里显示现场检查的具体描述</td>
                  </tr>
			<tr>
			
			<td colspan="6"></td>
			</tr>
			      <tr>
                    <th>故障分析及结论:</th>
                    <td colspan="5">这里显示故障分析及结论具体描述</td>
                  </tr>	  
			<td colspan="6"></td>
			</tr>
			      <tr>
                    <th>客户需求及短期维修措施：</th>
                    <td colspan="5">这里显示客户需求及短期维修措施的具体描述</td>
                  </tr>
				  
		    <td colspan="6"></td>
			</tr>
			      <tr>
                    <th>车辆及故障照片：</th>
                    <td colspan="5">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-bordered">
							<tr>
							<td width="33%"><div style="width:50px; height:40px; background-color: #CCCCCC; float:left" data-toggle="modal" data-target=".this-pic"></div>
							 &nbsp;这里是照片照片1的描述</td>
							<td width="34%"><div style="width:50px; height:40px; background-color: #CCCCCC; float:left" data-toggle="modal" data-target=".this-pic"></div>
							 &nbsp;这里是照片照片2的描述</td>
							<td width="33%">
							<div style="width:50px; height:40px; background-color: #CCCCCC; float:left" data-toggle="modal" data-target=".this-pic"></div>
							 &nbsp;这里是照片照片3的描述</td>
							</tr>
							<tr>
							<td><div style="width:50px; height:40px; background-color: #CCCCCC; float:left" data-toggle="modal" data-target=".this-pic"></div>
							 &nbsp;这里是照片照片4的描述</td>
							<td>
							<div style="width:50px; height:40px; background-color: #CCCCCC; float:left" data-toggle="modal" data-target=".this-pic"></div>
							 &nbsp;这里是照片照片5的描述</td>
							<td><div style="width:50px; height:40px; background-color: #CCCCCC; float:left" data-toggle="modal" data-target=".this-pic"></div>
							 &nbsp;这里是照片照片6的描述</td>
							</tr>
							<tr>
							<td><div style="width:50px; height:40px; background-color: #CCCCCC; float:left" data-toggle="modal" data-target=".this-pic"></div>
							 &nbsp;这里是照片照片7的描述</td>
							<td><div style="width:50px; height:40px; background-color: #CCCCCC; float:left" data-toggle="modal" data-target=".this-pic"></div>
							 &nbsp;这里是照片照片8的描述</td>
							<td>&nbsp;</td>
							</tr>
							</table>
					</td>
                  </tr>
              </table>
    </div>
  </div>
  <div class="x_panel" style="width:75%;float:left; margin-right:10px;">
				<div class="x_title">
				<h2>处理工具</h2><span style="float:right; font-size:14px; margin-top:10px;">状态：<font style="color:#999999; font-weight:bold;">关闭</font></span>
				<div class="clearfix"></div>
				</div>
				<div class="x_content">
				<form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
				<!--卡片工具-->
	<div class="form-group">
         <div class="" role="tabpanel" data-example-id="togglable-tabs">
					<ul id="myTab1" class="nav nav-tabs bar_tabs right" role="tablist">
						<li role="presentation" class="active"><a href="#tab_content11" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">CAR</a></li>
						<li role="presentation" class=""><a href="#tab_content22" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">SCAR</a></li>
						<li role="presentation" class=""><a href="#tab_content33" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">7 STEP</a></li>
						<li role="presentation" class=""><a href="#tab_content44" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">PQC</a></li>
					</ul>
					
			 <div id="myTabContent2" class="tab-content">
			 <!--Car表单工具开始-->
				<div role="tabpanel" class="tab-pane fade active in" id="tab_content11" aria-labelledby="home-tab">
			<table width="100%" class="table table-hover table-bordered" id="datatable">
					<tr><td colspan="4">
					<div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> CAR</div>
					<div style="color:#5A738E; float:right;">责任人：XX部门（胡平 FC009494）</div>
					</td></tr>
						
					<tr><td colspan="4" bgcolor="#F6F6F6">
					<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;1&nbsp;</span>&nbsp;
					Identify the Problem. 识别问题(5W2H)。     
					</td></tr>
					<tr><td colspan="4">
					这里是识别问题的具体内容，这里是识别问题的具体内容，这里是识别问题的具体内容。
					</td></tr>
					<tr><td width="20%">Target Date 目标日期</td><td width="30%">2019-03-10 12:22</td>
					<td width="20%">Complete Date 完成日期</td><td width="30%">2019-03-10 12:22</td></tr>
			</table>
					
			<table width="100%" class="table table-hover table-bordered" id="datatable">
					<tr><td colspan="4" bgcolor="#F6F6F6">
					<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;2&nbsp;</span>&nbsp;
					Identify and Rank Assignable Causes. 识别和排列必然原因(FTA, Fishbone, Pareto)。
					</td></tr>
					<tr><td colspan="4">
					这里是识别和排列必然原因的具体内容，这里是识别和排列必然原因的具体内容，这里是识别和排列必然原因的具体内容。
					</td></tr>
						
					<tr><td colspan="4" bgcolor="#F6F6F6">
					<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;3&nbsp;</span>&nbsp;
					Take Short Term Action. 采取短期措施。
					</td></tr>
					<tr><td colspan="4">
					这里是采取短期措施的具体内容，这里是采取短期措施的具体内容，这里是采取短期措施的具体内容，这里是采取短期措施的具体内容，这里是采取短期措施的具体内容。
					</td></tr>
					
					<tr><td colspan="4" bgcolor="#F6F6F6">
					<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;4&nbsp;</span>&nbsp;
					Determine Assignable Cause(s). 确定必然原因(Pareto)。
					</td></tr>
					<tr><td colspan="4">
					这里是确定必然原因的具体内容，这里是确定必然原因的具体内容，这里是确定必然原因的具体内容。
					</td></tr>
					
					<tr><td colspan="4" bgcolor="#F6F6F6">
					<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;5&nbsp;</span>&nbsp;
					Select and Verify the Solution. 选择和验证解决方案。
					</td></tr>
					<tr><td colspan="4">
					这里是选择和验证解决方案的具体内容，这里是选择和验证解决方案的具体内容。
					</td></tr>
					
					<tr><td colspan="4" bgcolor="#F6F6F6">
					<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;6&nbsp;</span>&nbsp;
					Implement Permanent Solution. 实施永久解决方案。
					</td></tr>
					<tr><td colspan="4">
					这里是实施永久解决方案的具体内容，这里是实施永久解决方案的具体内容。
					</td></tr>
					<tr><td width="20%">Target Date 目标日期</td><td width="30%">2019-03-10 12:22</td>
					<td width="20%">Complete Date 完成日期</td><td width="30%">2019-03-10 12:22</td></tr>
			</table>
				
			<table width="100%" class="table table-hover table-bordered" id="datatable">
					<tr><td colspan="4" bgcolor="#F6F6F6">
					<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;7&nbsp;</span>&nbsp;
					Monitor, Prevent Recurrence. 监控，预防再发生(RCA)。
					</td></tr>
					<tr><td colspan="4">
					这里是监控，预防再发生的具体内容。
					</td></tr>
					<tr><td colspan="4" valign="middle">
					附件下载：<i class="fa fa-file-text" style="font-size:40px; padding:10px;vertical-align:middle;"></i>&nbsp;
					<button type="button" class="btn btn-default btn-sm">CAR_2019-01-12-12-11</button>
					</td>
					</tr>
					<tr><td width="20%">Target Date 目标日期</td><td width="30%">2019-03-10 12:22</td>
					<td width="20%">Complete Date 完成日期</td><td width="30%">2019-03-10 12:22</td></tr>
			</table>
					
                </div>
				 <!--Car表单工具结束-->
				 
				 <!--SCAR分段附件开始-->
				<div role="tabpanel" class="tab-pane fade" id="tab_content22" aria-labelledby="profile-tab">
						<table width="100%" class="table table-hover table-bordered" id="datatable">
						<tr><td colspan="4">
							<div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> SCAR</div>
							<div style="color:#5A738E; float:right;">责任人：XX部门（胡平 FC009494）</div>
						</td></tr>
						<tr><td colspan="4">
						    <div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;1&nbsp;</span>&nbsp;
						    Problem Description.问题描述。
							</div>
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;2&nbsp;</span>&nbsp;
						    Containment (Parts already produced and in the Supply Chain).遏制措施（产品已生产并进入供应链）。
							</div>
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;3&nbsp;</span>&nbsp;
						    Short Term Action (Parts to be made until Long Term is Implemented).短期措施（长期措施实施前的产品生产）。
							</div>
						</td></tr>
						<tr><td colspan="2">
				附件下载：<i class="fa fa-file-text" style="font-size:40px; padding:10px;vertical-align:middle;"></i>&nbsp;
					<button type="button" class="btn btn-default btn-sm">SCAR1-3_2019-01-12-12-11</button></td>
						<td colspan="2">
				处理审核：<i class="fa fa-edit" style="font-size:40px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">查阅</button></td>
						</tr>
						<tr><td width="20%">Target Date 目标日期</td><td width="30%">2019-04-13</td><td width="20%">Complete Date 完成日期</td><td width="30%">2019-02-12 13:21</td></tr>
						</table>
						
						<table width="100%" class="table table-hover table-bordered" id="datatable">
						<tr><td colspan="4">
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;4&nbsp;</span>&nbsp;
						    Determine Assignable Cause(s).确定必然原因(FTA.Fishbone.Pareto)。
							</div>
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;5&nbsp;</span>&nbsp;
						    Select and Verify the Solution.选择和验证解决方案。
							</div>
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;6&nbsp;</span>&nbsp;
						    Implement Permanent Solution.实施永久解决方案。
							</div>
						</td></tr>
						<tr><td colspan="2">
				附件下载：<i class="fa fa-file-text" style="font-size:40px; padding:10px;vertical-align:middle;"></i>&nbsp;
					<button type="button" class="btn btn-default btn-sm">SCAR4-6_2019-01-12-12-11</button></td>
						<td colspan="2">
				处理审核：<i class="fa fa-edit" style="font-size:40px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">查阅</button></td>
						</tr>
						<tr><td width="20%">Target Date 目标日期</td><td width="30%">2019-04-13</td><td width="20%">Complete Date 完成日期</td><td width="30%">2019-02-12 13:21</td></tr>
						</table>
						
						
						
						<table width="100%" class="table table-hover table-bordered" id="datatable">
						<tr><td colspan="4">
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;7&nbsp;</span>&nbsp;
						    Monitor.Prevent Recurrence.监控，预防再发生（RCA）。
							</div>
						</td></tr>
						<tr><td colspan="2">
				附件下载：<i class="fa fa-file-text" style="font-size:40px; padding:10px;vertical-align:middle;"></i>&nbsp;
					<button type="button" class="btn btn-default btn-sm">SCAR7_2019-01-12-12-11</button></td>
						<td colspan="2">
				处理审核：<i class="fa fa-edit" style="font-size:40px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">查阅</button></td>
						</tr>
						<tr><td width="20%">Target Date 目标日期</td><td width="30%">2019-04-13</td><td width="20%">Complete Date 完成日期</td><td width="30%">2019-02-12 13:21</td></tr>
						</table>
						
						
						
						
				</div>
				<!--SCAR分段附件结束-->
				
				<!--7 STEP分段附件结束-->
				<div role="tabpanel" class="tab-pane fade" id="tab_content33" aria-labelledby="profile-tab">
						<table width="100%" class="table table-hover table-bordered" id="datatable">
						<tr><td colspan="4">
							<div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> 7 STEP</div>
							<div style="color:#5A738E; float:right;">责任人：XX部门（胡平 FC009494）</div>
						</td></tr>
						<tr><td colspan="4">
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;1&nbsp;</span>&nbsp;
						    Identify the problem.识别问题(5W2H)。
							</div>
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;2&nbsp;</span>&nbsp;
						    Identify and Rank Assignable Causes.识别和排列必然原因 (FTA, Fishbone, Pareto)。
							</div>
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;3&nbsp;</span>&nbsp;
						    Take Short Term Action.采取短期措施。
							</div>
						</td></tr>
						<tr><td colspan="2">
				附件下载：<i class="fa fa-file-text" style="font-size:40px; padding:10px;vertical-align:middle;"></i>&nbsp;
					<button type="button" class="btn btn-default btn-sm">7step1-3_2019-01-12-12-11</button></td>
						<td colspan="2">
				处理审核：<i class="fa fa-edit" style="font-size:40px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">查阅</button></td>
						</tr>
						<tr><td width="20%">Target Date 目标日期</td><td width="30%">2019-04-13</td><td width="20%">Complete Date 完成日期</td><td width="30%">2019-02-12 13:21</td></tr>
						</table>
						
						
						
						
						<table width="100%" class="table table-hover table-bordered" id="datatable">
						<tr><td colspan="4">
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;4&nbsp;</span>&nbsp;
						    Determine Assignable Cause(s).确定必然原因(FTA.Fishbone.Pareto)。
							</div>
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;5&nbsp;</span>&nbsp;
						    Select and Verify the Solution.选择和验证解决方案。
							</div>
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;6&nbsp;</span>&nbsp;
						    Implement Permanent Solution.实施永久解决方案。
							</div>
						</td></tr>
						<tr><td colspan="2">
				附件下载：<i class="fa fa-file-text" style="font-size:40px; padding:10px;vertical-align:middle;"></i>&nbsp;
					<button type="button" class="btn btn-default btn-sm">7step4-6_2019-01-12-12-11</button></td>
						<td colspan="2">
				处理审核：<i class="fa fa-edit" style="font-size:40px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">查阅</button></td>
						</tr>
						<tr><td width="20%">Target Date 目标日期</td><td width="30%">2019-04-13</td><td width="20%">Complete Date 完成日期</td><td width="30%">2019-02-12 13:21</td></tr>
						</table>
						
						<table width="100%" class="table table-hover table-bordered" id="datatable">
						<tr><td colspan="4">
							<div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
							<span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;7&nbsp;</span>&nbsp;
						    Monitor.Prevent Recurrence.监控，预防再发生（RCA）。
							</div>
						</td></tr>
						<tr><td colspan="2">
				附件下载：<i class="fa fa-file-text" style="font-size:40px; padding:10px;vertical-align:middle;"></i>&nbsp;
					<button type="button" class="btn btn-default btn-sm">7setp7_2019-01-12-12-11</button></td>
						<td colspan="2">
				处理审核：<i class="fa fa-edit" style="font-size:40px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">查阅</button></td>
						</tr>
						<tr><td width="20%">Target Date 目标日期</td><td width="30%">2019-04-13</td><td width="20%">Complete Date 完成日期</td><td width="30%">2019-02-12 13:21</td></tr>
						</table>
						
						<!--按钮-->
						<div class="ln_solid"></div>
						<div class="form-group">
						<div style="text-align:center;">
						<button class="btn btn-success" type="reset">处理完成</button>
						</div>
						</div>
						<!--按钮完成-->
				</div>
				<!--7 STEP分段附件结束-->
				
				<!--PQC直接附件开始-->
				<div role="tabpanel" class="tab-pane fade" id="tab_content44" aria-labelledby="profile-tab">
						<table width="100%" class="table table-hover table-bordered" id="datatable">
						<tr><td colspan="4">
							<div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> PQC</div>
							<div style="color:#5A738E; float:right;">责任人：XX部门（胡平 FC009494）</div>
						</td></tr>
						<tr><td colspan="2">
				附件下载：<i class="fa fa-file-text" style="font-size:40px; padding:10px;vertical-align:middle;"></i>&nbsp;
					<button type="button" class="btn btn-default btn-sm">PQC_2019-01-12-12-11</button></td>
						<td colspan="2">
				处理审核：<i class="fa fa-edit" style="font-size:40px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">查阅</button></td>
						</tr>
						<tr><td width="20%">Target Date 目标日期</td><td width="30%">2019-04-13</td><td width="20%">Complete Date 完成日期</td><td width="30%">2019-02-12 13:21</td></tr>
						</table>
						
				</div>
				<!--PQC直接附件结束-->	
						  </div>
                    </div>
			    </div>
				<!--卡片工具完成-->	
				
				</form>
				</div>			
		</div>
		<div class="x_panel" style="width:calc(25% - 10px); float:left;">
			<div class="x_title">
			<h2>处理记录</h2>
			<div class="clearfix"></div>
			</div>
			
			<div class="x_content">
			
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
				<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
				<div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
				<div style="width:51%; float:right">提交人 提交问题</div>
				</div>
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
				<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
				<div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
				<div style="width:51%; float:right">责任人 处理问题</div>
				</div>
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
				<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
				<div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
				<div style="width:51%; float:right">责任人 PQC完成</div>
				</div>
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
				<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
				<div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
				<div style="width:51%; float:right">责任人 7 STEP完成</div>
				</div>
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
				<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
				<div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
				<div style="width:51%; float:right">责任人 CAR完成</div>
				</div>
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
				<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
				<div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
				<div style="width:51%; float:right">审核人 审核关闭</div>
				</div>
						
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
	<div class="modal fade this-pic" tabindex="-1" role="dialog" aria-hidden="true" >
		<div class="modal-dialog modal-lg" style="width:860px;padding-top:20px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
					<h4 class="modal-title" id="myModalLabel">照片预览</h4>
				</div>
				<div class="modal-body" style="width:800px; height:500px; margin:30px;background-color:#EFEFEF; text-align:center;">这里是照片</div>
				<div class="modal-footer">
                    <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal">关闭</button>
                </div>
			</div>
		</div>
	</div>
	
<!-- 遮蔽内容结束 -->
<%@include file="/view/static/common/core_js.jsp"%>
  </body>
</html>
