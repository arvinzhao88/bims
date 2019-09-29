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
      <h2>问题描述</h2>
      <ul class="nav navbar-right panel_toolbox">
        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
        <li><a class="close-link"><i class="fa fa-close"></i></a></li>
      </ul>
      <div class="clearfix"></div>
    </div>
    <div class="x_content">
      <table width="100%" class="table table-hover table-bordered" id="datatable" style="font-size:12px;">
        <tr>
          <th width="10%">厂区：</th>
          <td width="23%">问题标题</td>
          <th width="10%">发现工位：</th>
          <td width="23%">区域</td>
          <th width="10%">发现区域：</th>
          <td width="24%">问题工位</td>
        </tr>
        <tr>
          <th>质量分类：</th>
          <td><a href="z_a_correct.jsp">这里是质量描述的内容用于作为</a></td>
          <th>问题分类：</th>
          <td>A区</td>
          <th>问题描述：</th>
          <td>A区1123</td>
        </tr>
        <tr>
          <th>工位：</th>
          <td><a href="z_a_correct.jsp">这里是的内容用于作的标题</a></td>
          <th>区域：</th>
          <td>A区</td>
          <th>班组：</th>
          <td>A区1123</td>
        </tr>
        <tr>
          <th>ESN / SO：</th>
          <td>&nbsp;</td>
          <th>机型：</th>
          <td>2.8</td>
          <th>项目号：</th>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <th>首台ESN：</th>
          <td>&nbsp;</td>
          <th>数量：</th>
          <td>&nbsp;</td>
          <th>图片附件：</th>
          <td>&nbsp;</td>
        </tr>
      </table>
    </div>
  </div>
  <div class="x_panel" style="width:75%;float:left; margin-right:10px;">
				<div class="x_title">
				<h2>处理工具</h2><span style="float:right; font-size:22px;"><i class="fa fa-history green"></i> <font style="font-size:14px; color:#5A738E">截至日期：30天</font></span>
				<div class="clearfix"></div>
				</div>
				
				<div class="x_content">
				<form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
				<!--卡片工具-->
				<div class="form-group">
                    <div class="" role="tabpanel" data-example-id="togglable-tabs">
						  <ul id="myTab1" class="nav nav-tabs bar_tabs right" role="tablist">
							<li role="presentation" class="active"><a href="#tab_content11" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">7 Step</a>
							</li>
							<li role="presentation" class=""><a href="#tab_content22" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">Scar</a>
							</li>
						  </ul>
						  <div id="myTabContent2" class="tab-content">
							<div role="tabpanel" class="tab-pane fade active in" id="tab_content11" aria-labelledby="home-tab">
							<table width="100%" class="table table-hover table-bordered" id="datatable" style="font-size:12px;">
							  <tr>
								<td colspan="4">
								<div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> 7 STEP</div>
								<div style="color:#5A738E; float:right;">责任人：材料采购部  胡平</div>
								</td>
							  </tr>
							  <tr>
								<td colspan="4" bgcolor="#F6F6F6">
						<span style="border-radius:50%;-moz-border-radius:50%;-webkit-border-radius:50%;color:#FFFFFF;padding:4px;background-color:#009688">&nbsp;4&nbsp;</span>
						Determine Assignable Cause(s).确定必然原因。 (FTA, Fishbone, Pareto)
								</td>
							  </tr>
							  <tr>
								<td colspan="4">
								<textarea name="message" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
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
								<textarea name="message" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
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
							<textarea name="message" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
							</td>
							</tr>
							  <tr>
								<td width="20%">Target Date 目标日期</td>
								<td width="40%">10分钟倒计时</td>
								<td width="20%">Complete Date 完成日期</td>
								<td width="20%">系统时间</td>
							  </tr>
							</table>

							</div>
							<div role="tabpanel" class="tab-pane fade" id="tab_content22" aria-labelledby="profile-tab">
							<p>Car 表单</p>
							</div>
						  </div>
                    </div>
			    </div>
				<!--卡片工具完成-->	
				<!--按钮-->
				<div class="ln_solid"></div>
				<div class="form-group">
				<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-5">
				<button class="btn" type="button" onClick="javascrtpt:window.location.href='z_a_ts23.jsp'">上一步</button>
				<button class="btn btn-primary" type="reset" onClick="javascrtpt:window.location.href='z_a_ts7.jsp'">下一步</button>
				</div>
				</div>
				<!--按钮完成-->
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
				<div style="width:51%; float:right">工程师 修正更新问题</div>
				</div>
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
				<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
				<div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
				<div style="width:51%; float:right">工程师 选择EQR</div>
				</div>
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
				<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
				<div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
				<div style="width:51%; float:right">Leader 选择责任人</div>
				</div>
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
				<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
				<div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
				<div style="width:51%; float:right">责任人 处理中</div>
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

<%@include file="/view/static/common/core_js.jsp"%>
  </body>
</html>
