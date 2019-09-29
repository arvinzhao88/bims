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
			<div class="title_left"><h3>A区 问题处理</h3></div>
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
			<table width="100%" class="table table-hover table-bordered" id="datatable">
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
                    <td>整机缺陷</td>
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
				<h2>单据管理</h2>
				<div class="clearfix"></div>
				</div>
                <div class="form-group">
                <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                <table width="100%" border="0" cellspacing="0" cellpadding="0" style="border-collapse:separate;border-spacing:15px;">
                <tr>
                <td align="right" style="width:10%;">临时措施：</td>
                <td style="width:18%;"><select name="select2" class="form-control">
                  <option>--请选择--</option>
                  <option>料废</option>
                  <option>工废</option>
                  <option>让步接收</option>
                  <option>工程偏离</option>
                  <option>返工</option>
                  <option>筛选</option>
                  <option>拒收</option>
                </select></td>
                <td style="width:10%;">&nbsp;</td>
                <td style="width:18%;">&nbsp;</td>
                <td align="right" style="width:10%;">&nbsp;</td>
                <td align="right" style="width:18%;">&nbsp;</td>
                <td align="right" style="width:16%;"><i class="fa fa-plus-circle green"></i> 添加</td>
                </tr>
                <tr><td align="right"><span style="width:10%">单据：</span></td>
                  <td colspan="3" align="right"><select name="select" class="form-control">
                    <option>无</option>
                    <option>转报废单</option>
                    <option>让步接收单（有审批流）</option>
                    <option>不合格品抑制单</option>
                  </select></td>
                  <td align="right">责任人：</td>
                <td align="right"><select name="select3" class="form-control">
                  <option>请选择</option>
                  <option>XXXX</option>
                  <option>XXXX</option>
                </select></td>
                <td align="right"><i class="fa fa-minus-circle red"></i> 删除</td>
                </tr>
                </table>
                </form>
                </div>
                <hr></hr>
                
				<div class="x_title">
				<h2>处理工具</h2>&nbsp;&nbsp;&nbsp;&nbsp;<font color="#FF0000">说明：如果处理工具选择了“Notification”，则该行不显示“责任人”</font>
                <span style="float:right; font-size:14px; margin-top:10px;">状态：<font style="color:#0099FF; font-weight:bold;">待处理</font></span>
				<div class="clearfix"></div>
				</div>
                <div class="form-group">
				<form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                <table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">
                  <tr>
                    <td align="right" width="10%">选择工具：</td>
                    <td><select class="form-control">
                        <option>请选择</option>
                        <option selected= selected>7 Step</option>
                        <option>Scar</option>
                        <option>Car</option>
                        <option>Notification</option>
                        </select></td>
                    <td align="right">责任人：</td>
                    <td><select class="form-control">
							<option>请选择</option>
							<option>XXXX</option>
							<option>XXXX</option>
							</select></td>
                    <td align="right"><i class="fa fa-plus-circle green"></i> 添加</td>
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
                    <td align="right" style="width:10%">责任人：</td>
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
                    <td align="right" style="width:10%">&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right"><i class="fa fa-minus-circle red"></i> 删除</td>
                  </tr>
                </table>
                </form>
                </div>
                   <div class="ln_solid"></div>
                    <div class="form-group">
                        <div style="text-align:center">
                        <button class="btn" type="button" onClick="javascrtpt:window.location.href='z_a_eqr.jsp'">取消</button>
                        <button class="btn btn-primary" type="reset" data-toggle="modal" data-target=".this-go">确定</button>
                        </div>
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
                <p>确定通知指定责任人进行处理吗?</p>
                <hr></hr>
                
				<p>工具编号：CAR20190902112已创建。<br>将被置入编号EQRX20190201003的《突发质量问题通知单》发送至邮件接收人。</p>
                <font color="#FF0000" style="font-size:12px;">所有开的CAR\SCAR,无论开几个，都有自己的编号，并且全部记录在突发质量问题通知单中</font>
                <P>邮件接收人<P>
                <select class="form-control">
                <option>请选择</option>
                <option>XXXX</option>
                <option>XXXX</option>
                </select>
				</div>
				<div class="modal-footer">
            <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
            <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="javascrtpt:window.location.href='z_a_ts1.jsp'">确定</button>
          </div>
			</div>
		</div>
	</div>
<!-- 遮蔽内容结束 -->

<%@include file="/view/static/common/core_js.jsp"%>
  </body>
</html>
