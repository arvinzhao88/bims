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
	<%--<link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>--%>
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
			<div class="title_left"><h3>售后 问题处理</h3></div>
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
				<h2>处理工具</h2>&nbsp;&nbsp;&nbsp;&nbsp;<font color="#FF0000">说明：如果处理工具选择了“Notification”，则该行不显示“责任人”</font>
                <span style="float:right; font-size:14px; margin-top:10px;">状态：<font style="color:#0099FF; font-weight:bold;">待处理</font></span>
				<div class="clearfix"></div>
				</div>
				
				<div class="x_content">
				<form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                <table width="100%" border="0" cellspacing="0" cellpadding="0" style="border-collapse:separate;border-spacing:15px;">
                  <tr>
                    <td align="right" style="width:10%;">选择工具：</td>
                    <td style="width:18%"><select class="form-control">
                        <option>请选择</option>
                        <option selected= selected>7 Step</option>
                        <option>Scar</option>
                        <option>Car</option>
                        <option>Notification</option>
                        </select>
                    </td>
                    <td align="right" style="width:10%">截至日期：</td>
                    <td style="width:18%"><input type="text" id="" class="form-control" style="font-size:12px" value="日期选择组件"></td>
                    <td align="right" style="width:10%">责任人：</td>
                    <td style="width:18%"><select class="form-control">
							<option>请选择</option>
							<option>XXXX</option>
							<option>XXXX</option>
							</select></td>
                    <td align="right" style="width:16%"><i class="fa fa-plus-circle green"></i> 添加</td>
                  </tr>
                  <tr>
                     <td align="right">选择工具：</td>
                    <td><select class="form-control">
							<option>请选择</option>
							<option>7 Step</option>
							<option selected= selected>Scar</option>
							<option>Car</option>
							<option>Notification</option>
							</select></td>
                    <td align="right">截至日期：</td>
                    <td style="width:18%"><input type="text" id="" class="form-control" style="font-size:12px" value="日期选择组件"></td>
                    <td align="right">责任人：</td>
                    <td><select class="form-control">
							<option>请选择</option>
							<option>XXXX</option>
							<option>XXXX</option>
							</select></td>
                    <td align="right"><i class="fa fa-minus-circle red"></i> 删除</td>
                  </tr>
                  <tr>
                     <td align="right">选择工具：</td>
                    <td><select class="form-control">
							<option>请选择</option>
							<option>7 Step</option>
							<option>Scar</option>
							<option>Car</option>
							<option selected= selected>Notification</option>
							</select></td>
                    <td align="right">截至日期：</td>
                    <td style="width:18%"><input type="text" id="" class="form-control" style="font-size:12px" value="日期选择组件"></td>
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right"><i class="fa fa-minus-circle red"></i> 删除</td>
                  </tr>
                </table>
                <hr></hr>
                <div class="x_title">
				<h2>单据管理</h2>
				&nbsp;&nbsp;&nbsp;&nbsp;<font color="#FF0000">说明：如果“是”则弹出单据选择下拉框，“否“则隐藏。</font>
				<div class="clearfix"></div>
				</div>
                <div class="form-group">
                <table width="100%" border="0" cellspacing="0" cellpadding="0" style="border-collapse:separate;border-spacing:15px;">
                <tr>
                <td align="right" style="width:10%;">附加表单：</td>
                <td style="width:18%;"><input type="radio" class="flat" name="gender" id="genderF" value="F" />&nbsp;&nbsp;否
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" class="flat" name="gender" id="genderM" value="M" checked="" required />&nbsp;&nbsp;是				</td>
                <td style="width:10%;">&nbsp;</td>
                <td align="right" style="width:18%;">&nbsp;</td>
                <td align="right" style="width:10%;">&nbsp;</td>
                <td align="right" style="width:18%;">&nbsp;</td>
                <td align="right" style="width:16%;"><i class="fa fa-plus-circle green"></i> 添加</td>
                </tr>
                <tr><td align="right">选择主表：</td>
                <td align="right"><select name="select" class="form-control">
                  <option>请选择</option>
                  <option>报废单</option>
                  <option>让步接收单</option>
                  <option>返工/返修/筛选单</option>
                  <option>连带报废单</option>
                  <option>待处理品单</option>
                </select></td>
                <td align="right" style="width:10%">选择子表：</td>
                <td align="right"><select name="select" class="form-control">
                  <option>与主表关联</option>
                  <option>XXXXXXX</option>
                  <option>XXXXXX</option>
                  <option>XXXXXXX</option>
                  <option>XXXXXXXXX</option>
                  <option>XXXXXXXXXX</option>
                </select></td>
                <td align="right">责任人：</td>
                <td align="right">
                <select class="form-control">
							<option>请选择</option>
							<option>XXXX</option>
							<option>XXXX</option>
							</select></td>
                <td align="right"><i class="fa fa-minus-circle red"></i> 删除</td>
                </tr>
                </table>

                
                </div>
			 
				  <div class="ln_solid"></div>
			  <div class="form-group">
						<div style="text-align:center">
						<button class="btn" type="button" onClick="javascrtpt:window.location.href='z_sh_eqr.jsp'">取消</button>
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
				<div style="width:51%; float:right">售后工程师 提交问题</div>
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
	
	<div class="modal fade this-true" tabindex="-1" role="dialog" aria-hidden="true" >
		<div class="modal-dialog modal-lg"  style="width:350px;padding-top:200px;">
			<div class="modal-content">
			
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
					<h4 class="modal-title" id="myModalLabel">确定</h4>
				</div>
				<div class="modal-body"><p>确定已完成处理并关闭吗?</p></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="javascrtpt:window.location.href='aftersale_index.jsp'">确定</button>
				</div>
			</div>	
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
                <p>确定通知指定责任人进行处理吗?</p>
				</div>
				<div class="modal-footer">
            <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
            <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="javascrtpt:window.location.href='z_sh_ts1.jsp'">确定</button>
          </div>
			</div>
		</div>
	</div>
<!-- 遮蔽内容结束 -->
<!-- 遮蔽内容结束 -->
<%@include file="/view/static/common/core_js.jsp"%>

  </body>
</html>
