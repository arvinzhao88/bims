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

			<div class="title_left"><h3>BIS 问题处理</h3></div>
	<div class="title_right">
		<div class="col-md-6 col-sm-5 col-xs-12 form-group pull-right top_search">
			<div class="input-group">
				<input id="content" name="content" type="text" class="form-control" placeholder="输入零件号,供应商代码,ESN,机型,SO,描述查询">
				<span class="input-group-btn">
				  <button id="minSearch" class="btn btn-default" type="button"><i
						  class="fa fa-search"></i></button></span>
			</div>
		</div>
	</div>
			</div>

            <div class="clearfix"></div>

<div class="row">
<div class="col-md-12 col-sm-12 col-xs-12">
<div class="x_panel">
			<div class="x_title">
			<h2>问题列表</h2>
				<%--<ul class="nav navbar-right panel_toolbox">--%>
				  <%--<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>--%>
				  <%--<li><a class="close-link"><i class="fa fa-close"></i></a></li>--%>
				<%--</ul>--%>
			<%--<!--工具条-->--%>
			<%--<label class="control-label" style="width:80px;float:left; padding:8px 0 0 0px; text-align:right;">状态：</label>--%>
				<%--<select class="form-control" style="width:90px; float:left">--%>
				<%--<option>请选择</option>--%>
				<%--<option>处理中</option>--%>
				<%--<option>待处理</option>--%>
				<%--<option>超期</option>--%>
				<%--<option>驳回</option>--%>
				<%--<option>审核中</option>--%>
				<%--<option>关闭</option>--%>
				<%--</select>	--%>
		    <%--<label class="control-label" style="width:50px;float:left; padding:8px 0 0 0px; text-align:right;">类型：</label>--%>
				<%--<select class="form-control" style="width:90px; float:left">--%>
				<%--<option>请选择</option>--%>
				<%--<option>A区</option>--%>
				<%--<option>下线</option>--%>
				<%--<option>T区</option>--%>
				<%--<option>机加</option>--%>
				<%--<option>JOB1</option>--%>
				<%--<option>BIS</option>--%>
				<%--</select>--%>
			<%--<label class="control-label" style="width:50px;float:left; padding:8px 0 0 0px; text-align:right;">索赔：</label>--%>
				<%--<select class="form-control" style="width:90px; float:left">--%>
				<%--<option>请选择</option>--%>
				<%--<option>Yes</option>--%>
				<%--<option>No</option>--%>
				<%--</select>--%>
			<%--<label class="control-label" style="width:50px;float:left; padding:8px 0 0 0px; text-align:right;">指标：</label>--%>
				<%--<select class="form-control" style="width:90px; float:left">--%>
				<%--<option>请选择</option>--%>
				<%--<option>Yes</option>--%>
				<%--<option>No</option>--%>
				<%--</select>--%>
			<%--&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-success" style="margin-bottom:-4px;">确定</button>	--%>
			<%--&lt;%&ndash;&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-primary" style="margin-bottom:-4px;"><i class="fa fa-download"></i> 导入</button>&ndash;%&gt;--%>
			<%--&lt;%&ndash;&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-primary" style="margin-bottom:-4px;"><i class="fa fa-upload"></i> 导出</button>	&ndash;%&gt;--%>
			<%--&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-success" style="margin-bottom:-4px;" onClick="location.href='${webPath}/back/bisAdd'"><i class="fa fa-plus-circle"></i> 提交问题</button>--%>
			<form>
				<table width="100%" border="0" cellspacing="0" cellpadding="0" style="border-collapse:separate;border-spacing:15px;">
					<tr>

						<td width="3%" align="right">
							<p></p>
							<p >工厂：</p>
						</td>
						<td width="10%">
							<select id="plant" name="plant" onchange="getAreaList()" class="form-control">
								<option value="">- 请选择 -</option>
							</select>
						</td>
						<td width="3%" align="right">
							<p></p>
							<p >问题编码：</p>
						</td>
						<td width="10%">
							<input id="number" placeholder="请输入问题编码" type="text" class="form-control">
						</td>
						<td width="3%" align="right">
							<p></p>
							<p >是否EQR：</p>
						</td>
						<td width="10%">
							<select id="isEqr" name="isEqr" class="form-control">
								<option value="">- 请选择 -</option>
								<option value="1">是</option>
								<option value="2">否</option>
							</select>
						</td>
					</tr>

					<!-- 第二个tr dt -->
					<tr>
						<td width="3%" align="right">

							<p></p>
							<p >问题状态：</p>
						</td>
						<td width="10%">
							<select id="processStatus" name="processStatus" class="form-control">
								<option value="">- 请选择 -</option>
								<option value="1">待处理</option>
								<option value="2,3,4,5,6,8">处理中</option>
								<option value="7">关闭</option>
							</select>
						</td>
						<td width="3%" align="right">
							<p></p>
							<p >处理人：</p>
						</td>
						<td width="10%">
							<input id="processPersonName" placeholder="请输入处理人" type="text" class="form-control">
						</td>
						<td width="3%" align="right">

							<p></p>
							<p >时间段：</p>
						</td>
						<td width="10%" id="datetimepicker1" class="date-picker input-daterange" data-date-format="yyyy-mm-dd">
							<input  id='startDate' name="startDate" type="text" class="form-control" value="" placeholder="开始日期" style="float:left;width:48%;"/>
							<input  id='endDate' name="endDate" type="text" class="form-control" value="" placeholder="结束日期" style="float:left;width:48%;margin-left:4%;"/>
						</td>
					</tr>
					<tr>
						<td width="3%" align="right">
							<p></p>
							<p>是否批量：</p>
						</td>
						<td width="10%">
							<select id="issueCategoryL1Name" name="issueCategoryL1Name" class="form-control">
								<option value="">- 请选择 -</option>
								<option value="1">是</option>
								<option value="2">否</option>
							</select>
						</td>
					</tr>
				</table>
				<div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3" style="margin-left: 8.4%;">
					<button id="query" type="button" class="btn btn-primary" onclick="">查询</button>
					<input id="reset" type="reset" value="重置" onclick="" class="btn btn-default">
				</div>
				<c:if test="${fn:contains(person.belongRole, '2') or fn:contains(person.belongRole, '7')}">
					<button type="button" class="btn btn-primary" style="margin-bottom:-4px; float: right; margin-right: 1%" onClick="location.href='${webPath}/back/bisAdd'">新建</button>
				</c:if>
				<button type="button" class="btn btn-success"
						style="margin-bottom:-4px; float: right; margin-right: 0.5%"
						onClick="excel()"> 导出
				</button>
			</form>
			<!--工具条结束-->
			<div class="clearfix"></div>
			</div>
			
            <div class="x_content">
              <table width="100%" class="table table-bordered table-hover" id="example" style="margin-bottom: 0px;border-bottom: 0px;">
                <thead>
                  <tr>
					  <th>序号</th>
					  <th>工厂</th>
					  <th>问题编码</th>
					  <th>问题描述</th>
					  <th>录入时间</th>
					  <th>关闭时间</th>
					  <th>提交人</th>
					  <th>处理人</th>
					  <th>是否EQR</th>
					  <th>单据状态</th>
					  <th>工具状态</th>
					  <th>处理工具/责任人</th>
					  <th>是否批量</th>
					  <th>问题状态</th>
					  <th>操作</th>
                  </tr>
                </thead>
                <tbody>
                  <%--<tr>
                    <td>181105012</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是质量描述的内容用于作为</strong></a></td>
                    <td>CR</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>Yes</td>
                    <td>No</td>
                    <td>张无忌</td>
                    <td>何晓峰</td>
                    <td>张晓明</td>
                    <td>7 Step</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color:#0099FF; font-weight:bold;">待处理</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>
                  <tr>
                    <td>181105013</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是的内容用于作的标题</strong></a></td>
                    <td>BIS</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>Yes</td>
                    <td>No</td>
                    <td>王丙</td>
                    <td>刘海</td>
                    <td>张三</td>
                    <td>Scar</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color:#00CC00; font-weight:bold;">处理中</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>
                  <tr>
                    <td>181105013</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是的内容用于作的标题</strong></a></td>
                    <td>BIS</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>Yes</td>
                    <td>No</td>
                    <td>王丙</td>
                    <td>刘海</td>
                    <td>张三</td>
                    <td>Scar</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color: #FF0000; font-weight:bold;">超期</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>
                  <tr>
                    <td>181105012</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是质量描述的内容用于作为</strong></a></td>
                    <td>REIGECT</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>No</td>
                    <td>Yes</td>
                    <td>张无忌</td>
                    <td>何晓峰</td>
                    <td>张晓明</td>
                    <td>7 Step</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color: #FF0000; font-weight:bold;">驳回</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>
                  <tr>
                    <td>181105013</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是的内容用于作的标题</strong></a></td>
                    <td>BIS</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>Yes</td>
                    <td>Yes</td>
                    <td>王丙</td>
                    <td>刘海</td>
                    <td>张三</td>
                    <td>Scar</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style="color:#FF9900; font-weight:bold;">审核中</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>
                  <tr>
                    <td>181105013</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是的内容用于作的标题</strong></a></td>
                    <td>BIS</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>Yes</td>
                    <td>Yes</td>
                    <td>王丙</td>
                    <td>刘海</td>
                    <td>张三</td>
                    <td>Scar</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color:#666666; font-weight:bold;">关闭</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>--%><%--<tr>
                    <td>181105012</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是质量描述的内容用于作为</strong></a></td>
                    <td>CR</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>Yes</td>
                    <td>No</td>
                    <td>张无忌</td>
                    <td>何晓峰</td>
                    <td>张晓明</td>
                    <td>7 Step</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color:#0099FF; font-weight:bold;">待处理</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>
                  <tr>
                    <td>181105013</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是的内容用于作的标题</strong></a></td>
                    <td>BIS</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>Yes</td>
                    <td>No</td>
                    <td>王丙</td>
                    <td>刘海</td>
                    <td>张三</td>
                    <td>Scar</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color:#00CC00; font-weight:bold;">处理中</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>
                  <tr>
                    <td>181105013</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是的内容用于作的标题</strong></a></td>
                    <td>BIS</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>Yes</td>
                    <td>No</td>
                    <td>王丙</td>
                    <td>刘海</td>
                    <td>张三</td>
                    <td>Scar</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color: #FF0000; font-weight:bold;">超期</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>
                  <tr>
                    <td>181105012</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是质量描述的内容用于作为</strong></a></td>
                    <td>REIGECT</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>No</td>
                    <td>Yes</td>
                    <td>张无忌</td>
                    <td>何晓峰</td>
                    <td>张晓明</td>
                    <td>7 Step</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color: #FF0000; font-weight:bold;">驳回</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>
                  <tr>
                    <td>181105013</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是的内容用于作的标题</strong></a></td>
                    <td>BIS</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>Yes</td>
                    <td>Yes</td>
                    <td>王丙</td>
                    <td>刘海</td>
                    <td>张三</td>
                    <td>Scar</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style="color:#FF9900; font-weight:bold;">审核中</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>
                  <tr>
                    <td>181105013</td>
                    <td><a href="z_b_eqr.jsp"><strong>这里是的内容用于作的标题</strong></a></td>
                    <td>BIS</td>
                    <td>143214 / SO23423</td>
                    <td>21341235</td>
                    <td>134123</td>
                    <td>Yes</td>
                    <td>Yes</td>
                    <td>王丙</td>
                    <td>刘海</td>
                    <td>张三</td>
                    <td>Scar</td>
                    <td><a href="#" data-toggle="modal" data-target=".this-time"><i class="fa fa-clock-o"></i></a> <font style=" color:#666666; font-weight:bold;">关闭</font></td>
                    <td><a href="#" data-toggle="modal" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></td>
                  </tr>--%>
                </tbody>
              </table>
              
              
              <%--<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-bordered" style="background-color:#FFFF99">
                <tr>
                  <td><strong>角色</strong></td>
                  <td><strong>人员</strong></td>
                  <td><strong>操作</strong></td>
                  <td><strong>列表状态</strong></td>
                </tr>
                <tr>
                  <td rowspan="2"><strong>提交人</strong></td>
                  <td>区域质量工程师(后台)</td>
                  <td>新建提交、是否EQR、打开处理工具并指定责任人</td>
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
                  <td>区域质量工程师</td>
                  <td>审核处理工具、表单</td>
                  <td>待处理、关闭（延时待关闭）</td>
                </tr>
                <tr>
                  <td>EQR leader</td>
                  <td>审核处理工具、表单</td>
                  <td>待处理、关闭（延时待关闭）</td>
                </tr>
              </table>--%>
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
				
				
				<%--<div style="padding:20px;">
				<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
				<div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
				<div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
				<div style="width:51%; float:right">录入人 提交问题</div>
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
			    </div>--%>

		
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
            dataTablesInit(bis);

			var pid = 0;
			getSelectlist("#plant", "xf", pid);
        });
</script>
<script type="text/javascript" src="${resPath}/view/back/bims/js/qualityissues/bis/bis.js"></script>
<script>
	//获取下拉框
	function getSelectlist(dom, type, pid) {
		var subject = $(dom);//元素
		$.ajax({
			url: "${webPath}/dict/getSelectList",
			type: "POST",
			dataType: "json",
			data: {
				type: type,
				pid: pid
			},
			success: function (ajaxJson) {
				if (ajaxJson.success) {
					var html = '<option selected value="">- 请选择 -</option>';
					//添加select第一个option
					//$("#wWareId").append("<option selected value='0'>---请选择---</option>");
					for (var i = 0; i < ajaxJson.obj.length; i++) {
						var checked = "";
						//添加option元素
						html += ("<option value='" + ajaxJson.obj[i].id + "'>" + ajaxJson.obj[i].name + "</option>");
						//如果id等于value，则选中
						if (ajaxJson.obj[i].id == pid) {
							checked = "selected=\"selected\"";
						}
						/*html += "  <option "+checked+" class='remove' value='" + ajaxJson.obj[i].id + "'>"
                            + ajaxJson.obj[i].name + "</option>";*/
						//$("wWareId option:eq('" + ${wareId} + "')").attr('selected', 'selected');
					}
					$(subject).html(html);
				} else {
					$(subject).html("<option selected value='0'>请选择</option>");
				}
			}
		})
	}
	/**
	 * 导出excel
	 */
	function excel() {
		var qType = "B";
		var isAll = false;
		var isBacth = $("#issueCategoryL1Name option:selected").val();
		var plant = $("#plant option:selected").val();
		var eqr = $("#isEqr option:selected").val();
		var status = $("#processStatus option:selected").val();
		var processPerson = $("#processPersonName").val();
		var startTime = $("#startDate").val();
		var endTime = $("#endDate").val();
		var no = $("#number").val();
		location.href = '${webPath}/excel/bisExport?qualityType=' + qType + '&plant=' + plant +'&isEqr=' + eqr + '&processStatus=' + status + '&processPersonName=' + processPerson+ '&startTime=' + startTime + '&endTime=' + endTime + '&number=' + no + '&issueCategoryL1Name=' + isBacth+ '&isAll='+isAll

	}
</script>
  </body>
</html>
