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
            <div class="title_left"><h3>SQA 问题处理</h3></div>
            </div>

            <div class="clearfix"></div>

<div class="row">
<div class="col-md-12 col-sm-12 col-xs-12">
<div class="x_panel">
			<div class="x_title">
			<h2>问题描述</h2>
				<ul class="nav navbar-right panel_toolbox">
				  <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
				</ul>
			<div class="clearfix"></div>
			</div>
			
            <div class="x_content">
			<table width="100%" class="table table-hover table-bordered" id="datatable">
                  <tr>
                    <th width="10%">厂区：</th>
                    <td width="23%">厂区位置</td>
                    <th width="10%"><strong>PPAP：</strong></th>
                    <td width="23%">内容</td>
                    <th width="10%"><strong>生产线</strong>：</th>
					<td width="24%">生产线名称</td>
				  </tr>

                  <tr>
                    <th><strong>项目号</strong>：</th>
                    <td>项目号码</td>
                    <th><strong>零件号</strong>：</th>
                    <td>零件号码</td>
                    <th>零件描述：</th>
                    <td>描述内容</td>
				  </tr>
				  
                  <tr>
                    <th>供应商代码：</th>
                    <td>1243244</td>
                    <th><strong>供应商名称</strong>：</th>
                    <td>名称</td>
                    <th><strong>SQI</strong>：</th>
                    <td>143212</td>
				  </tr>
				  
                  <tr>
                    <th><strong>失效数量</strong>：</th>
                    <td>2</td>
                    <th>失效比例：</th>
                    <td>20%</td>
                    <th>Batch info：</th>
                    <td>内容</td>
                  </tr>
				  
                  <tr>
                    <th>Found site：</th>
                    <td>123412</td>
                    <th>质量追溯码：</th>
                    <td>354534</td>
                    <th>Inspector：</th>
                    <td>45645</td>
                  </tr>
                  <tr>
                    <th>问题描述：</th>
                    <td>内容</td>
                    <th>问题重复：</th>
                    <td>234234</td>
                    <th>问题照片：</th>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <th><strong>要求标准</strong>：</th>
                    <td>XXXXXX</td>
                    <th>添加图片：</th>
                    <td>&nbsp;</td>
                    <th>严重程度：</th>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <th>发生频次：</th>
                    <td>&nbsp;</td>
                    <th>探测度：</th>
                    <td>&nbsp;</td>
                    <th>RPN：</th>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <th>一级问题：</th>
                    <td>&nbsp;</td>
                    <th>二级问题：</th>
                    <td>&nbsp;</td>
                    <th>备注：</th>
                    <td>&nbsp;</td>
                  </tr>
              </table>
			</div>			
</div>

		<div class="x_panel" style="width:75%;float:left; margin-right:10px;">
				<div class="x_title">
				<h2>问题处理</h2>
				&nbsp;&nbsp;&nbsp;<font color="#FF0000">说明：默认“是”该问题交由EQR Leader处理，选择“否”后该问题继续由区域质量工程师直接开CAR处理。</font>
                <span style="float:right; font-size:14px; margin-top:10px;">状态：<font style="color:#0099FF; font-weight:bold;">待处理</font></span>
				<div class="clearfix"></div>
				</div>
				
				<div class="x_content">
				<form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
				        <div class="form-group">
						<div class="form-group col-md-10">
						<label class="control-label col-md-3" for="first-name">是否EQR：</label>
						<div class="col-md-5">
						<p style="padding-top:8px;">
						<input type="radio" class="flat" name="gender" id="genderM" value="M" checked="" required />&nbsp;&nbsp;是&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="radio" class="flat" name="gender" id="genderF" value="F" />&nbsp;&nbsp;否
                        </p>
						</div>
						</div>
						
						<div class="form-group col-md-10">
						<label class="control-label col-md-3" for="first-name">处理：</label>
						<div class="col-md-9" style="padding-top:8px;">问题发送 EQR Leader 进行下一步处理</div>
						</div>
						</div>
						<div class="ln_solid"></div>
						<div class="form-group">
						<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
						<button class="btn" type="button" onClick="javascrtpt:window.location.href='z_a_correct.jsp'">取消</button>
						<button class="btn btn-primary" type="reset" data-toggle="modal" data-target=".this-go">确定</button>
						</div>
						</div>
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
	<div class="modal fade this-go" tabindex="-1" role="dialog" aria-hidden="true" >
		<div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
			<div class="modal-content">
			
				<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
				<h4 class="modal-title" id="myModalLabel">确定</h4>
				</div>
				<div class="modal-body">
				<p>确定将该问题发送至EQR Leader处理吗?</p>
				</div>
				<div class="modal-footer">
            <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
            <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="javascrtpt:window.location.href='z_s_eqr_leader.jsp'">确定</button>
          </div>
			</div>
		</div>
	</div>
<!-- 遮蔽内容结束 -->


<%@include file="/view/static/common/core_js.jsp"%>
	
  </body>
</html>
