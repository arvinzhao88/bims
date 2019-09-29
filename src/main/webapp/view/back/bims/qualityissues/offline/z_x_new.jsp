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
	<link rel="stylesheet" type="text/css" href="${resPath}/view/static/static/layer/skin/layer.css"/>
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
			<a href="index.jsp" class="site_title">&nbsp;<img src="images/logo1.png" alt="..."  width="33" height="30">&nbsp;
			<img src="images/logo2.png" alt="..."  width="120" height="30"></a>
			</div>
			<div class="clearfix"></div>

<!-- 导航上方用户标示开始 -->
			<div class="profile clearfix">
			<div class="profile_pic"><img src="images/img.jpg" alt="..." class="img-circle profile_img"></div>
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

			<div class="title_left"><h3>下线 新建问题</h3></div><div class="title_right"></div>
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
			 
			<table width="100%" border="0" cellspacing="0" cellpadding="0" style="border-collapse:separate;border-spacing:15px;">
                <tr>
                <td width="10%" align="right"><strong>问题工位：</strong></td>
                <td width="40%"><select class="form-control">
				<option>系统自动带出</option>
				<option>XXXX</option>
				<option>XXXX</option>
				</select></td>
                <td width="10%" align="right"><strong>发现区域：</strong></td>
                <td width="40%"><select class="form-control">
				<option>请选择</option>
				<option>2.8</option>
				<option>3.8</option>
				<option>4.5</option>
				<option>X终检</option>
				</select></td>
                </tr>
                <tr>
                <td align="right"><strong>发动机 SO：</strong></td>
                <td><input type="text" id="first-name" required="required" class="form-control" value="由ESN关联生成"></td>
                <td align="right"><strong>发动机 ESN：</strong></td>
                <td><input type="text" id="first-name" required="required" class="form-control" value="模糊匹配+手工录入/支持扫描"></td>
                </tr>
                <tr>
                <td align="right"><strong>机型：</strong></td>
                <td><input type="text" id="first-name" required="required" class="form-control" value="系统带出，由SO关联带出，接口-ERP"></td>
                <td align="right"><strong>数量：</strong></td>
                <td><input type="text" id="first-name" required="required" class="form-control" value="手工输入"></td>
                </tr>
                <tr>
                <td align="right"><strong>问题分类：</strong></td>
                <td><select class="form-control">
				<option>请选择一级问题</option>
				<option>XX</option>
				<option>XX</option>
				<option>XX</option>
				</select></td>
                <td align="right"><strong>所属子类：</strong></td>
                <td><select class="form-control">
				<option>请选择二级问题</option>
				<option>XX</option>
				<option>XX</option>
				<option>XX</option>
				</select></td>
                </tr>
                <tr>
                <td align="right"><strong>具体问题：</strong></td>
                <td><select class="form-control">
				<option>请选择三级问题</option>
				<option>XX</option>
				<option>XX</option>
				<option>XX</option>
				</select></td>
                <td align="right">&nbsp;</td>
                <td>&nbsp;</td>
                </tr>
                <tr>
                <td align="right"><strong>问题描述：</strong></td>
                <td><input type="text" id="first-name" required="required" class="form-control" value="手工输入"></td>
                <td align="right"><strong>照片附件：</strong></td>
                <td><i class="fa fa-file-image-o" style="font-size:35px; padding-right:10px;vertical-align:middle;"></i>&nbsp;上传图片</td>
                </tr>
                </table>
			 
			 <div class="ln_solid"></div>
			  <div class="form-group">
				<div style="text-align:center">
				  <button class="btn btn-primary" type="button" data-toggle="modal" data-target=".this-save">保存</button>  
				   &nbsp;&nbsp;&nbsp;&nbsp;
				  <button class="btn btn-success" type="reset" data-toggle="modal" data-target=".this-true" >新建完成</button>
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
				<p>确认新建该问题吗？</p>
				</div>
				<div class="modal-footer">
            <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
            <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="javascrtpt:window.location.href='z_x_index.jsp'">确定</button>
          </div>
			</div>
		</div>
	</div>
<!-- 遮蔽内容结束 -->

<%@include file="/view/static/common/core_js.jsp"%>
	
  </body>
</html>
