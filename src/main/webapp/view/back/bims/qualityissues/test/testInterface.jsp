<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@include file="/view/static/common/base.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="images/favicon.ico" type="image/ico" />

    <title>福田康明斯BIMS问题管理系统 (V1.5)</title>

    <!-- Bootstrap -->
    <link href="${resPath}/view/static/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${resPath}/view/static/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${resPath}/view/static/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="${resPath}/view/static/vendors/iCheck/skins/flat/green.css" rel="stylesheet">

    <!-- bootstrap-progressbar -->
    <link href="${resPath}/view/static/vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <!-- JQVMap -->
    <link href="${resPath}/view/static/vendors/jqvmap/dist/jqvmap.min.css" rel="stylesheet"/>
    <!-- bootstrap-daterangepicker -->
    <link href="${resPath}/view/static/vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${resPath}/view/static/build/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">

<div class="container body">
    <div class="main_container">

        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">

                <div class="navbar nav_title" style="border: 0;">
                    <a href="index.html" class="site_title">&nbsp;<img src="/view/static/images/logo1.png" alt="..."  width="33" height="30">&nbsp;
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
                <%--<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                    <div class="menu_section">
                        <h3>系统导航</h3>
                        <ul class="nav side-menu">
                            <li><a><i class="fa fa-home"></i> 系统首页 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li class="current-page"><a href="index.html">工作台</a></li>
                                </ul>
                            </li>

                            <li><a><i class="fa fa-user"></i> 权限管理 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="fbbg.html">添加权限</a></li>
                                    <li><a href="bglb.html">用户列表</a></li>
                                </ul>
                            </li>

                            <li class="active"><a><i class="fa fa-wrench"></i> 质量问题 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu" style="display:block;">
                                    <li class="current-page"><a href="z_a_index.html">A区</a></li>
                                    <li><a href="z_x_index.html">下线</a></li>
                                    <li><a href="z_t_index.html">T区</a></li>
                                    <li><a href="z_j_index.html">机加</a></li>
                                    <li><a href="z_jo_index.html">JOB1</a></li>
                                    <li><a href="z_b_index.html">BIS</a></li>
                                    <li><a href="z_e_index.html">EQA</a></li>
                                    <li><a href="z_s_index.html">SQA</a></li>
                                    <li><a href="z_sh_index.html">售后</a></li>
                                </ul>
                            </li>

                            <li><a><i class="fa fa-times-circle"></i> 停线问题 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="t_stop_index.html">停线</a></li>
                                </ul>
                            </li>

                            <li><a><i class="fa fa-pencil-square-o"></i> 审核问题 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="s_sh_index.html">审核</a></li>
                                </ul>
                            </li>

                            <li><a><i class="fa fa-clipboard"></i> 系统报表 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="sys_index.html">内容列表</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>--%>
                <%@include file="/view/static/common/siderbar.jsp"%>
                <!-- /测导航结束 -->
            </div>
        </div>

        <!-- 顶部开始 -->
        <div class="top_nav">
            <div class="nav_menu">

                <nav>
                    <div class="nav toggle"><span class="btn black"><a id="menu_toggle"><i class="fa fa-bars"></i></a>
			<font style="font-size:22px;color:#5A738E;overflow:hidden;">福田康明斯BIMS问题管理系统 (V1.5)</font></span>
                    </div>

                    <ul class="nav navbar-nav navbar-right">
                        <li class="">
                            <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                <img src="images/img.jpg" alt="">责任人：张晓华（按照工具及表单责任人对应） <span class=" fa fa-angle-down"></span></a>
                            <ul class="dropdown-menu dropdown-usermenu pull-right">
                                <li><a href="javascript:;"><span class="badge bg-red pull-right">50%</span><span>设置</span></a></li>
                                <li><a href="javascript:;">帮助</a></li><li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> 退出</a></li>
                            </ul>
                        </li>

                        <li role="presentation" class="dropdown">
                            <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-envelope-o"></i><span class="badge bg-green">6</span>
                            </a>
                            <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                                <li>
                                    <a><span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                                        <span><span>李斌</span><span class="time">3 分钟前</span></span>
                                        <span class="message">这里是她要显示的内容....</span></a>
                                </li>
                                <li>
                                    <div class="text-center"><a><strong>查看更多</strong> <i class="fa fa-angle-right"></i></a></div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </nav>

            </div>
        </div>
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
                                    <td><a href="z_a_correct.html">这里是质量描述的内容用于作为</a></td>
                                    <th>问题分类：</th>
                                    <td>整机缺陷</td>
                                    <th>问题描述：</th>
                                    <td>A区1123</td>
                                </tr>
                                <tr>
                                    <th>工位：</th>
                                    <td><a href="z_a_correct.html">这里是的内容用于作的标题</a></td>
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
                    <!--
                     <div class="x_panel" style="width:75%;float:left; margin-right:10px;">
                                   <div class="x_title">
                                   <h2>处理工具</h2><span style="float:right; font-size:22px;"><i class="fa fa-history green"></i> <font style="font-size:14px; color:#5A738E">截至日期：30天</font></span>
                                   <div class="clearfix"></div>
                                   </div>

                                   <div class="x_content">
                                   <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                   <!--卡片工具--
                                   <div class="form-group">
                                       <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                         <ul id="myTab1" class="nav nav-tabs bar_tabs right" role="tablist">
                                           <li role="presentation" class="active"><a href="#tab_content1" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">7 Step</a>
                                           </li>
                                           <li role="presentation" class=""><a href="#tab_content2" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">Scar</a>
                                           </li>
                                           <li role="presentation" class=""><a href="#tab_content3" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">Car</a>
                                           </li>
                                           <li role="presentation" class=""><a href="#tab_content4" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">Notification</a>
                                           </li>
                                         </ul>
                                             <div id="myTabContent1" class="tab-content">
                                               <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">
                                               <table width="100%" class="table table-hover table-bordered" id="datatable" style="font-size:12px;">
                                               <tr><td colspan="4">
                                               <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> 7 STEP</div>
                                               <div style="color:#5A738E; float:right;">责任人：材料采购部  胡平</div>
                                               </td></tr>
                                               <tr><td colspan="4" bgcolor="#F6F6F6">
                                               <span style="border-radius:50%;-moz-border-radius:50%;-webkit-border-radius:50%;color:#FFFFFF;padding:4px;background-color:#009688">&nbsp;1&nbsp;</span>
                                               Identify the Problem 识别问题 (5W2H)
                                               </td></tr>
                                               <tr><td colspan="4">
                                               <textarea name="message" rows="2" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
                                               </td></tr>
                                               <tr>
                                               <td width="20%">Target Date 目标日期</td>
                                               <td width="40%">10分钟倒计时</td>
                                               <td width="20%">Complete Date 完成日期</td>
                                               <td width="20%">系统时间</td>
                                               </tr>
                                               </table>

                                               </div>
                                               <div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="profile-tab">
                                               <p>Scar表单</p>
                                               </div>

                                               <div role="tabpanel" class="tab-pane fade" id="tab_content3" aria-labelledby="profile-tab">
                                               <p>Car表单</p>
                                               </div>

                                               <div role="tabpanel" class="tab-pane fade" id="tab_content4" aria-labelledby="profile-tab">
                                               <table width="100%" class="table table-hover table-bordered" id="datatable" style="font-size:12px;">
                                               <tr><td colspan="4">
                                               <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> Notification</div>
                                               <div style="color:#5A738E; float:right;">责任人：材料采购部  胡平</div>
                                               </td></tr>
                                               <tr><td>
                                               <textarea name="message" rows="4" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
                                               </td></tr></table>

                                               <h2>邮件接收人</h2>
                                               <select class="form-control">
                                               <option>请选择</option>
                                               <option>XXXX</option>
                                               <option>XXXX</option>
                                               </select>
                                               </div>

                                             </div>
                                            </div>
                                   </div>

                                   !--卡片工具完成--
                                   !--按钮--
                                   <div class="ln_solid"></div>
                                   <div class="form-group">
                                   <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-5">
                                   <button class="btn" type="button" onClick="javascrtpt:window.location.href='z_a_leader.html'">取消</button>
                                   <button class="btn btn-primary" type="reset" >确定</button>
                                   </div>
                                   </div>
                                   --按钮完成--
                                   </form>
                                   </div>
                           </div>-->


                    <div class="x_panel" style="width:75%;float:left; margin-right:10px;">
                        <%--<div class="x_title">
                            <h2>处理工具</h2><span style="float:right; font-size:14px; margin-top:10px;">状态：<font style="color:#00CC00; font-weight:bold;">处理中</font></span>
                            <div class="clearfix"></div>
                        </div>--%>
                        <!--卡片工具开始-->
                     <%--   <div class="x_content">
                            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                <div class="form-group">
                                    <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                        <ul id="myTab1" class="nav nav-tabs bar_tabs right" role="tablist">
                                            <li role="presentation" class="active"><a href="#tab_content11" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">CAR</a></li>
                                            <li role="presentation" class=""><a href="#tab_content22" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">SCAR</a></li>
                                            <li role="presentation" class=""><a href="#tab_content33" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">7 STEP</a></li>
                                            <li role="presentation" class=""><a href="#tab_content44" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">Notification</a></li>
                                        </ul>



                                        <!--Car表单工具开始-->
                                        <div id="myTabContent2" class="tab-content">
                                            <div role="tabpanel" class="tab-pane fade active in" id="tab_content11" aria-labelledby="home-tab">
                                                <table width="100%" class="table table-hover table-bordered" id="datatable" style="font-size:12px;">
                                                    <tr><td colspan="4">
                                                        <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> CAR（NO:CAR201902003）
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-clock-o green"></i> 截至日期：30天</div>
                                                        <div style="color:#5A738E; float:right;">责任人：XX部门（胡平 FC009494）</div>
                                                    </td></tr>

                                                    <tr><td colspan="4" bgcolor="#F6F6F6">
                                                        <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;1&nbsp;</span>&nbsp;
                                                        Identify the Problem. 识别问题(5W2H)。
                                                    </td></tr>
                                                    <tr><td colspan="4">
                                                        <textarea name="message" rows="2" class="form-control" id="message" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
                                                    </td></tr>
                                                    <tr><td width="20%">Target Date 目标日期</td><td width="30%"><i class="fa fa-history"></i> 时间倒计时（系统预设）</td>
                                                        <td width="20%">Complete Date 完成日期</td><td width="30%">处理中（以完成系统时间为准）</td></tr>
                                                </table>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal" data-target=".this-no">驳回</button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal" data-target=".this-go">下一步</button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->

                                                <table width="100%" class="table table-hover table-bordered" id="datatable" style="font-size:12px;">
                                                    <tr><td colspan="4" bgcolor="#F6F6F6">
                                                        <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;2&nbsp;</span>&nbsp;
                                                        Identify and Rank Assignable Causes. 识别和排列必然原因(FTA, Fishbone, Pareto)。
                                                    </td></tr>
                                                    <tr><td colspan="4">
                                                        <textarea name="message" rows="2" class="form-control" id="message" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
                                                    </td></tr>

                                                    <tr><td colspan="4" bgcolor="#F6F6F6">
                                                        <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;3&nbsp;</span>&nbsp;
                                                        Take Short Term Action. 采取短期措施。
                                                    </td></tr>
                                                    <tr><td colspan="4">
                                                        <textarea name="message" rows="2" class="form-control" id="message" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
                                                    </td></tr>

                                                    <tr><td colspan="4" bgcolor="#F6F6F6">
                                                        <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;4&nbsp;</span>&nbsp;
                                                        Determine Assignable Cause(s). 确定必然原因(Pareto)。
                                                    </td></tr>
                                                    <tr><td colspan="4">
                                                        <textarea name="message" rows="2" class="form-control" id="message" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
                                                    </td></tr>

                                                    <tr><td colspan="4" bgcolor="#F6F6F6">
                                                        <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;5&nbsp;</span>&nbsp;
                                                        Select and Verify the Solution. 选择和验证解决方案。
                                                    </td></tr>
                                                    <tr><td colspan="4">
                                                        <textarea name="message" rows="2" class="form-control" id="message" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
                                                    </td></tr>

                                                    <tr><td colspan="4" bgcolor="#F6F6F6">
                                                        <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;6&nbsp;</span>&nbsp;
                                                        Implement Permanent Solution. 实施永久解决方案。
                                                    </td></tr>
                                                    <tr><td colspan="4">
                                                        <textarea name="message" rows="2" class="form-control" id="message" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
                                                    </td></tr>
                                                    <tr><td colspan="4" bgcolor="#F6F6F6">
                                                        <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;7&nbsp;</span>&nbsp;
                                                        Monitor, Prevent Recurrence. 监控，预防再发生(RCA)。
                                                    </td></tr>
                                                    <tr><td colspan="4">
                                                        <textarea name="message" rows="2" class="form-control" id="message" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
                                                    </td></tr>
                                                    <tr><td width="20%">Target Date 目标日期</td><td width="30%"><i class="fa fa-history"></i> 时间倒计时（系统预设）</td>
                                                        <td width="20%">Complete Date 完成日期</td><td width="30%">处理中（以完成系统时间为准）</td></tr>
                                                </table>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal" data-target=".this-no">驳回</button>
                                                        <button class="btn btn-primary" type="reset">处理完成</button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->
                                            </div>
                                            <!--Car表单工具结束-->

                                            <!--SCAR分段附件开始-->
                                            <div role="tabpanel" class="tab-pane fade" id="tab_content22" aria-labelledby="profile-tab">
                                                <table width="100%" class="table table-hover table-bordered" id="datatable">
                                                    <tr><td colspan="4">
                                                        <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> SCAR （NO:SCAR201902003）&nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-clock-o green"></i> 截至时间：24小时</div>
                                                        <div style="color:#5A738E; float:right;">责任人：材料采购部  胡平</div>
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
                                                        <i class="fa fa-file-text" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">上传附件</button></td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                    </tr>
                                                    <tr><td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：23:15:10</td><td width="20%">Complete Date 完成日期</td><td width="30%">处理中（以完成系统时间为准）</td></tr>
                                                </table>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal" data-target=".this-no">驳回</button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal" data-target=".this-go">下一步</button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->

                                                <table width="100%" class="table table-hover table-bordered" id="datatable">
                                                    <tr><td colspan="4">
                                                        <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> SCAR（NO:SCAR201902003） &nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-clock-o green"></i> 截至时间：30天</div>
                                                        <div style="color:#5A738E; float:right;">责任人：材料采购部  胡平</div>
                                                    </td></tr>
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
                                                        <i class="fa fa-file-text" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">上传附件</button></td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                    </tr>
                                                    <tr><td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：29天 22:15:38</td><td width="20%">Complete Date 完成日期</td><td width="30%">处理中（以完成系统时间为准）</td></tr>
                                                </table>

                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal" data-target=".this-no">驳回</button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal" data-target=".this-go">处理完成</button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->

                                                <table width="100%" class="table table-hover table-bordered" id="datatable">
                                                    <tr><td colspan="4">
                                                        <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> SCAR（NO:SCAR201902003） &nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-clock-o green"></i> 截至时间：7天</div>
                                                        <div style="color:#5A738E; float:right;">责任人：材料采购部  胡平</div>
                                                    </td></tr>
                                                    <tr><td colspan="4">

                                                        <div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                            <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;7&nbsp;</span>&nbsp;
                                                            Monitor.Prevent Recurrence.监控，预防再发生（RCA）。
                                                        </div>
                                                    </td></tr>
                                                    <tr><td colspan="2">
                                                        <i class="fa fa-file-text" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">上传附件</button></td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                    </tr>
                                                    <tr><td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：6天 22:15:38</td><td width="20%">Complete Date 完成日期</td><td width="30%">处理中（以完成系统时间为准）</td></tr>
                                                </table>

                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal" data-target=".this-no">驳回</button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal" data-target=".this-go">处理完成</button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->

                                            </div>
                                            <!--SCAR分段附件结束-->

                                            <!--7 STEP分段附件结束-->
                                            <div role="tabpanel" class="tab-pane fade" id="tab_content33" aria-labelledby="profile-tab">
                                                <table width="100%" class="table table-hover table-bordered" id="datatable">
                                                    <tr><td colspan="4">
                                                        <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> 7 STEP &nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-clock-o green"></i> 截至日期：24小时</div>
                                                        <div style="color:#5A738E; float:right;">责任人：材料采购部  胡平</div>
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
                                                        <i class="fa fa-file-text" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">上传附件</button></td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                    </tr>
                                                    <tr><td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：23:15:10</td><td width="20%">Complete Date 完成日期</td><td width="30%">处理中（以完成系统时间为准）</td></tr>
                                                </table>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal" data-target=".this-no">驳回</button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal" data-target=".this-go">下一步</button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->

                                                <table width="100%" class="table table-hover table-bordered" id="datatable">
                                                    <tr><td colspan="4">
                                                        <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> 7 STEP &nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-clock-o green"></i> 截至日期：30天</div>
                                                        <div style="color:#5A738E; float:right;">责任人：材料采购部  胡平</div>
                                                    </td></tr>
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
                                                        <i class="fa fa-file-text" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">上传附件</button></td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                    </tr>
                                                    <tr><td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：29天 22:15:38</td><td width="20%">Complete Date 完成日期</td><td width="30%">处理中（以完成系统时间为准）</td></tr>
                                                </table>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal" data-target=".this-no">驳回</button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal" data-target=".this-go">下一步</button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->

                                                <table width="100%" class="table table-hover table-bordered" id="datatable">
                                                    <tr><td colspan="4">
                                                        <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> 7 STEP &nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-clock-o green"></i> 截至日期：7 天</div>
                                                        <div style="color:#5A738E; float:right;">责任人：材料采购部  胡平</div>
                                                    </td></tr>
                                                    <tr><td colspan="4">
                                                        <div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                            <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;7&nbsp;</span>&nbsp;
                                                            Monitor.Prevent Recurrence.监控，预防再发生（RCA）。
                                                        </div>
                                                    </td></tr>
                                                    <tr><td colspan="2">
                                                        <i class="fa fa-file-text" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">上传附件</button></td>
                                                        <td colspan="2">
                                                            <i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                    </tr>
                                                    <tr><td width="20%">Target Date 目标日期</td>
                                                        <td width="30%"><i class="fa fa-history"></i> 倒计时：6 天 22:15:38</td><td width="20%">Complete Date 完成日期</td><td width="30%">处理中（以完成系统时间为准）</td></tr>
                                                </table>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div style="text-align:center;">
                                                        <button class="btn btn-danger" type="reset" data-toggle="modal" data-target=".this-no">驳回</button>
                                                        <button class="btn btn-primary" type="reset" data-toggle="modal" data-target=".this-go">处理完成</button>
                                                    </div>
                                                </div>

                                            </div>
                                            <!--7 STEP分段附件结束-->

                                            <!--Notification开始-->
                                            <div role="tabpanel" class="tab-pane fade" id="tab_content44" aria-labelledby="profile-tab">
                                                <table width="100%" class="table table-hover table-bordered" id="datatable" style="font-size:12px;">
                                                    <tr><td colspan="4">
                                                        <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> Notification</div>
                                                        <div style="color:#5A738E; float:right;">责任人：售后质量工程师 胡平</div>

                                                    </td></tr>
                                                    <tr><td>
                                                        <textarea name="message" rows="4" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100">请输入</textarea>
                                                    </td></tr></table>
                                                <h2>邮件接收人</h2>
                                                <select class="form-control">
                                                    <option>请选择</option>
                                                    <option>XXXX</option>
                                                    <option>XXXX</option>
                                                </select>
                                                <!--按钮-->
                                                <div class="ln_solid"></div>
                                                <div class="form-group">
                                                    <div class="form-group" style="text-align:center">
                                                        <!--<button class="btn" type="button" onClick="javascrtpt:window.location.href='z_a_leader.html'">取消</button>-->
                                                        <button class="btn btn-success" type="reset" data-toggle="modal" data-target=".this-true">问题关闭</button>
                                                    </div>
                                                </div>
                                                <!--按钮完成-->
                                                <!--Notification结束-->
                                            </div>
                                        </div>
                                        <!--Notification直接附件结束-->

                                    </div>
                                </div>
                            </form>
                        </div>--%>
                        <!--卡片工具完成-->

                        <!--单据表开始-->
                        <div class="x_title">
                            <h2>单据管理</h2>&nbsp;&nbsp;&nbsp;&nbsp;<font color="#FF0000">说明：表单初期为上传，如支持修改，提交后除预览按钮还会保留再次上传按钮。</font>
                            <span style="float:right; font-size:14px; margin-top:10px;">状态：<font style="color:#00CC00; font-weight:bold;">处理中</font></span>
                            <div class="clearfix"></div>
                        </div>

                        <div class="x_content">
                            <form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">
                                <div class="form-group">
                                    <div class="" role="tabpane2" data-example-id="togglable-tabs">
                                        <ul id="myTab2" class="nav nav-tabs bar_tabs right" role="tablist">
                                            <li role="presentation" class="active"><a href="#tab_content1" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">报废单</a></li>
                                            <li role="presentation" class=""><a href="#tab_content2" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">让步接收单</a></li>
                                            <li role="presentation" class=""><a href="#tab_content3" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="home" aria-expanded="true">返工/返修/筛选单</a></li>
                                            <li role="presentation" class=""><a href="#tab_content4" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">连带报废单</a></li>
                                            <li role="presentation" class=""><a href="#tab_content5" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">待处理品单</a></li>
                                        </ul>

                                        <!--附加表单开始-->
                                        <div id="myTabContent2" class="tab-content">
                                            <div role="tabpane2" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                    <tr>
                                                        <td style="80%">
                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">1XXXXX表单</button>
                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">2XXXXX表单</button>
                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">3XXXXX表单</button>
                                                        </td>
                                                        <td style="20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                    </tr>
                                                </table>
                                            </div>

                                            <div role="tabpane2" class="tab-pane fade" id="tab_content2" aria-labelledby="home-tab">
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                    <tr><td style="80%">
                                                        <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">4XXXXX表单</button>
                                                    </td>
                                                        <td style="20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                    </tr>
                                                </table>
                                            </div>

                                            <div role="tabpane2" class="tab-pane fade" id="tab_content3" aria-labelledby="home-tab">
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                    <tr>
                                                        <td style="80%">
                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">5XXXXX表单</button>
                                                        </td>
                                                        <td style="20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                    </tr>
                                                </table>
                                            </div>

                                            <div role="tabpane2" class="tab-pane fade" id="tab_content4" aria-labelledby="home-tab">
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                    <tr>
                                                        <td style="80%">
                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">6XXXXX表单</button>
                                                        </td>
                                                        <td style="20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                    </tr>
                                                </table>
                                            </div>

                                            <div role="tabpane2" class="tab-pane fade" id="tab_content5" aria-labelledby="home-tab">
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                    <tr>
                                                        <td style="80%">
                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">7XXXXX表单</button>
                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">8XXXXX表单</button>
                                                        </td>
                                                        <td style="20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                        <!--附加表单结束-->
                                    </div>
                                </div>
                            </form>
                            <!--单据表完成-->
                        </div>


                    </div>




                    <!--处理记录开始-->
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
                        </div>
                        <!--处理记录结束-->


                    </div>
                </div>
            </div>
        </div>
        <!-- 内容区结束 -->

        <!-- 页脚开始 -->
        <footer>
            <div class="pull-right">北京福田康明斯发动机有限公司版权所有 2018-2023</div>
            <div class="clearfix"></div>
        </footer>
        <!-- 页脚结束 -->
    </div>
</div>

<!-- 遮蔽内容开始 -->
<div class="modal fade this-shenpi" tabindex="-1" role="dialog" aria-hidden="true" >
    <div class="modal-dialog modal-lg" style="width:900px;padding-top:50px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">处理工具审批</h4>
            </div>
            <div class="modal-body">
                <br><br><br><br>
                <p>此处为审批流程处理内容区</p>
                <br><br><br><br>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="javascrtpt:window.location.href='z_a_ts1.html'">确定</button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->


<!-- 遮蔽内容开始 -->
<div class="modal fade this-biaodan" tabindex="-1" role="dialog" aria-hidden="true" >
    <div class="modal-dialog modal-lg" style="width:900px;padding-top:50px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">这里是问题附加表单的名称</h4>
            </div>
            <div class="modal-body">
                <br><br><br><br>
                <p>此处为处理附加表单的内容区</p>
                <br><br><br><br>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="javascrtpt:window.location.href='z_a_ts1.html'">确定</button>
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
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-danger" data-dismiss="modal">驳回</button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->
<!-- jQuery -->
<script src="${resPath}/view/static/vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="${resPath}/view/static/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="${resPath}/view/static/vendors/fastclick/lib/fastclick.js"></script>
<!-- NProgress -->
<script src="${resPath}/view/static/vendors/nprogress/nprogress.js"></script>
<!-- Chart.js -->
<script src="${resPath}/view/static/vendors/Chart.js/dist/Chart.min.js"></script>
<!-- gauge.js -->
<script src="${resPath}/view/static/vendors/gauge.js/dist/gauge.min.js"></script>
<!-- bootstrap-progressbar -->
<script src="${resPath}/view/static/vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
<!-- iCheck -->
<script src="${resPath}/view/static/vendors/iCheck/icheck.min.js"></script>
<!-- Skycons -->
<script src="${resPath}/view/static/vendors/skycons/skycons.js"></script>
<!-- Flot -->
<script src="${resPath}/view/static/vendors/Flot/jquery.flot.js"></script>
<script src="${resPath}/view/static/vendors/Flot/jquery.flot.pie.js"></script>
<script src="${resPath}/view/static/vendors/Flot/jquery.flot.time.js"></script>
<script src="${resPath}/view/static/vendors/Flot/jquery.flot.stack.js"></script>
<script src="${resPath}/view/static/vendors/Flot/jquery.flot.resize.js"></script>
<!-- Flot plugins -->
<script src="${resPath}/view/static/vendors/flot.orderbars/js/jquery.flot.orderBars.js"></script>
<script src="${resPath}/view/static/vendors/flot-spline/js/jquery.flot.spline.min.js"></script>
<script src="${resPath}/view/static/vendors/flot.curvedlines/curvedLines.js"></script>
<!-- DateJS -->
<script src="${resPath}/view/static/vendors/DateJS/build/date.js"></script>
<!-- JQVMap -->
<script src="${resPath}/view/static/vendors/jqvmap/dist/jquery.vmap.js"></script>
<script src="${resPath}/view/static/vendors/jqvmap/dist/maps/jquery.vmap.world.js"></script>
<script src="${resPath}/view/static/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
<!-- bootstrap-daterangepicker -->
<script src="${resPath}/view/static/vendors/moment/min/moment.min.js"></script>
<script src="${resPath}/view/static/vendors/bootstrap-daterangepicker/daterangepicker.js"></script>

<!-- Custom Theme Scripts -->
<script src="${resPath}/view/static/build/js/custom.min.js"></script>

</body>
</html>
