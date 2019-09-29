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

			<div class="title_left"><h3>提交问题</h3></div><div class="title_right"></div>
            <div class="clearfix"></div>

<div class="row">
<div class="col-md-12 col-sm-12 col-xs-12">
<div class="x_panel">
			<div class="x_title">
			<h2>内容</h2>
				<ul class="nav navbar-right panel_toolbox">
				  <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
				  <li><a class="close-link"><i class="fa fa-close"></i></a></li>
				</ul>
			
			<div class="clearfix"></div>
			</div>
			
            <div class="x_content">
			<form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
			 
			 <div class="form-group">
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">厂区：</label>
				<div class="col-md-9"><select class="form-control">
				<option>请选择</option>
				<option>ISF</option>
				<option>ISG</option>
				</select></div>
				</div>
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">发现工位：</label>
				<div class="col-md-9"><select class="form-control">
				<option>请选择</option>
				<option>XXXX</option>
				<option>XXXX</option>
				</select></div>
				</div>
			 </div>
			 
			 <div class="form-group">
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">发现区域：</label>
				<div class="col-md-9"><select class="form-control">
				<option>请选择</option>
				<option>XXX</option>
				<option>XXX</option>
				</select></div>
				</div>
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">质量分类：</label>
				<div class="col-md-9"><select class="form-control">
				<option>请选择</option>
				<option>1、零件质量</option>
				<option>2、整机缺陷</option>
				<option>3、过程缺陷</option>
				</select></div>
				</div>
			 </div>
			 
			 <div class="form-group">
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">问题分类：</label>
				<div class="col-md-9"><input type="text" id="first-name" required="required" class="form-control col-md-7" value=""></div>
				</div>
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">质量描述：</label>
				<div class="col-md-9"><input type="text" id="first-name" required="required" class="form-control col-md-7" value=""></div>
				</div>
			 </div>
			 
			 <div class="form-group">
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">工位：</label>
				<div class="col-md-9"><select class="form-control">
				<option>请选择</option>
				<option>XXX</option>
				<option>XXX</option>
				</select></div>
				</div>
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">区域：</label>
				<div class="col-md-9"><select class="form-control">
				<option>请选择</option>
				<option>XX</option>
				<option>XX</option>
				<option>XX</option>
				</select></div>
				</div>
			 </div>
			 
			 <div class="form-group">
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">班组：</label>
				<div class="col-md-9"><select class="form-control">
				<option>请选择</option>
				<option>XXX</option>
				<option>XXX</option>
				</select></div>
				</div>
			 </div>
			 <div>注释开始：------------------------------------------------质量分类为：2、整机缺陷、3、过程缺陷，选以下内容--------------------------------------</div><br>
			 <div class="form-group">
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">ESN / SO：</label>
				<div class="col-md-4"><select class="form-control">
				<option>请选择</option>
				<option>XXX</option>
				<option>XXX</option>
				</select>
				</div>
				<div class="col-md-5"><select class="form-control">
				<option>请选择</option>
				<option>XXX</option>
				<option>XXX</option>
				</select></div>
				</div>
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">机型：</label>
				<div class="col-md-9"><input type="text" id="first-name" required="required" class="form-control col-md-7" value=""></div>
				</div>
			 </div>
			 
			 <div class="form-group">
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">项目号：</label>
				<div class="col-md-9"><select class="form-control">
				<option>请选择</option>
				<option>XXX</option>
				<option>XXX</option>
				<option>XXX</option>
				</select></div>
				</div>
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">首台ESN：</label>
				<div class="col-md-9"><input type="text" id="first-name" required="required" class="form-control col-md-7" value=""></div>
				</div>
			  </div>
			  <div>注释结束：---------------------------------------------------------------------------------</div><br>
			 <div>注释开始：-----------------------------------------------质量分类为：1、零件质量，选以下内容-------------------------------------</div><br>
			  <div class="form-group">
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">零件号：</label>
				<div class="col-md-9"><select class="form-control">
				<option>请选择</option>
				<option>XXX</option>
				<option>XXX</option>
				</select></div>
				</div>
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">零件名称：</label>
				<div class="col-md-9"><input type="text" id="first-name" required="required" class="form-control col-md-7" value=""></div>
				</div>
			 </div>
			 
			 <div class="form-group">
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">供应商代码：</label>
				<div class="col-md-9"><select class="form-control">
				<option>请选择</option>
				<option>XXX</option>
				<option>XXX</option>
				</select></div>
				</div>
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">供应商名称：</label>
				<div class="col-md-9"><input type="text" id="first-name" required="required" class="form-control col-md-7" value=""></div>
				</div>
			 </div>
			 <div>注释结束：--------------------------------------------------------------------------------</div><br>
			 <div class="form-group">
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">数量：</label>
				<div class="col-md-9"><input type="text" id="first-name" required="required" class="form-control col-md-7" value=""></div>
				</div>
				<div class="form-group col-md-5">
				<label class="control-label col-md-3" for="first-name">照片附件：</label>
				<div class="col-md-9"><img src="images/ppt.png" width="80" height="60" >&nbsp;点击修改图片</div>
				</div>
			 </div>
			 
			 <div class="ln_solid"></div>
			  <div class="form-group">
				<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
				  <button class="btn btn-success" type="button" data-toggle="modal1" data-target=".this-true" onClick="javascrtpt:window.location.href='z_a_index.jsp'">保存制造部</button>
				   &nbsp;&nbsp;&nbsp;&nbsp;
				  <button class="btn btn-success" type="reset" data-toggle="modal" data-target=".this-true" >提交处理</button>
				</div>
			  </div>
			</form>
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
				<h4 class="modal-title" id="myModalLabel">确认</h4>
				</div>
				<div class="modal-body">
				<p>如果整机和过程，提示：<br>确定将该问题发送至质量部进行处理吗？</p>
				<p>如果零件，提示：<br>确定将该问题发送至SQA进行处理吗？</p>
				</div>
				<div class="modal-footer">
            <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
            <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="javascrtpt:window.location.href='z_a_index.jsp'">确定</button>
          </div>
			</div>
		</div>
	</div>
<!-- 遮蔽内容结束 -->

<%@include file="/view/static/common/core_js.jsp"%>
  </body>
</html>
