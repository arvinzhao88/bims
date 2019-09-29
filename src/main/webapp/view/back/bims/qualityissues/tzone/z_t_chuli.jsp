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
			<div class="title_left"><h3>T区 问题处理</h3></div>
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
			
            <div class="x_content" style="display:no ne;">
			<table width="100%" class="table table-hover table-bordered" id="datatable">
                  <tr>
                    <th width="10%">机型：</th>
                    <td width="23%">ISF2.8</td>
                    <th width="10%">发动机 SO：</th>
                    <td width="23%">SO12341</td>
                    <th width="10%">发动机 ESN：</th>
					<td width="24%">1234134</td>
				  </tr>

                  <tr>
                    <th>台架号：</th>
                    <td>23</td>
                    <th>托盘号：</th>
                    <td>12</td>
                    <th>问题分类：</th>
                    <td>质量 Quality</td>
				  </tr>
				  
                  <tr>
                    <th>所属子类：</th>
                    <td>性能问题 Problem of Performance</td>
                    <th>问题描述：</th>
                    <td>这里是问题的描述</td>
                    <th>测量值/漏液：</th>
                    <td>这里是测量值/漏液的内容</td>
				  </tr>

                  <tr>
                    <th>备注附件：</th>
                    <td colspan="5"><i class="fa fa-file-text" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">附件下载</button></td>
                  </tr>
              </table>
              
              
              
              
              <table width="100%" class="table table-hover table-bordered" id="datatable">
                  <tr>
                    <th width="10%"><strong>处理意见：</strong></th>
                    <td>&nbsp;</td>
                    <td width="24%">2019-01-11 12:30</td>
				  </tr>

                  <tr>
                    <th><strong>处理意见：</strong></th>
                    <td>&nbsp;</td>
                    <td>2019-01-12 14:15</td>
				  </tr>
              </table>
			</div>			
</div>

		<div class="x_panel" style="width:75%;float:left; margin-right:10px;">
            <div class="x_title">
            <h2>选择责任人</h2>
            <span style="float:right; font-size:14px; margin-top:10px;">状态：<font style="color:#0099FF; font-weight:bold;">待处理</font></span>
            <div class="clearfix"></div>
            </div>
            
            <div class="x_content">
            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
            <select class="form-control">
            <option>请选择</option>
            <option>XXXX</option>
            <option>XXXX</option>
            </select>
            <div class="ln_solid"></div>
            <div class="form-group">
            <div style="text-align:center">
            <button class="btn" type="button" onClick="javascrtpt:window.location.href='z_t_new.jsp'">取消</button>
            <button class="btn btn-primary" type="reset" data-toggle="modal" data-target=".this-go">确定</button>
            </div>
            </div>
            </form>
            </div>	
            
            
            
            <div class="x_title">
            <h2>问题处理</h2>
            <span style="float:right; font-size:14px; margin-top:10px;">状态：<font style="color:#0099FF; font-weight:bold;">待处理</font></span>
            <div class="clearfix"></div>
            </div>
            
            <div class="x_content">
            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
            <textarea name="message" rows="4" class="form-control" id="message" required="required" data-parsley-minlength="20" data-parsley-maxlength="100">请输入处理意见</textarea>
            <div class="ln_solid"></div>
            <div class="form-group">
            <div style="text-align:center">
            <button class="btn btn-danger" type="button" data-toggle="modal" data-target=".this-no">驳回</button>
            <button class="btn btn-success" type="reset" data-toggle="modal" data-target=".this-go">问题关闭</button>
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
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
				<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
				<div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
				<div style="width:51%; float:right">工程师 选择EQR</div>
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
				<p>确定将处理意见发送给提交人，并关闭该问题吗？</p>
				</div>
				<div class="modal-footer">
            <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
            <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="javascrtpt:window.location.href='z_t_index.jsp'">确定</button>
          </div>
			</div>
		</div>
	</div>
<!-- 遮蔽内容结束 -->
<!-- 遮蔽内容开始 -->
	<div class="modal fade this-no" tabindex="-1" role="dialog" aria-hidden="true" >
		<div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
			<div class="modal-content">
			
				<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
				<h4 class="modal-title" id="myModalLabel">驳回</h4>
				</div>
				<div class="modal-body">
				<p>请输入驳回原因！</p>
				<textarea name="message" rows="4" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
				</div>
				<div class="modal-footer">
            <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
            <button type="button" class="btn btn-danger" data-dismiss="modal" onClick="javascrtpt:window.location.href='z_t_index.jsp'" >驳回</button>
          </div>
			</div>
		</div>
	</div>
<!-- 遮蔽内容结束 -->
<%@include file="/view/static/common/core_js.jsp"%>
  </body>
</html>
