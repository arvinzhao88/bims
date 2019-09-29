<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="${resPath}/view/static/images/favicon.ico"
          type="image/ico"/>
    <link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>
    <title>${sysName}</title>
    <%@include file="/view/static/common/global_css.jsp" %>

    <style type="text/css">
        th {
            border-bottom-width: 0px !important;
        }

        th, td {
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
        var ctx = '${webPath}';
    </script>
</head>

<body class="nav-md">

<div class="container body">
    <div class="main_container">

        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">

                <%@include file="/view/static/common/sysinfo.jsp" %>

                <!-- 侧导航开始 -->

                <%@include file="/view/static/common/siderbar.jsp" %>
                <!-- /测导航结束 -->
            </div>
        </div>

        <!-- 顶部开始 -->

        <%@include file="/view/static/common/head.jsp" %>
        <!-- 顶部结束 -->

        <!-- 内容区开始 -->
        <div class="right_col" role="main">
            <%@include file="/view/back/bims/qualityissues/common/area_type.jsp" %>

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
                        <%@include file="/view/back/bims/qualityissues/common/issuedesc.jsp" %>
                        <%--<div id="x_content_issue" class="x_content" style="display:none;">
                            <c:choose>
                                <c:when test="${issue.qualityType eq 'A'}">
                                    <table width="100%" class="table table-hover table-bordered" id="datatable">'
                                        <tr>
                                            <th width="10%">厂区：</th>
                                            <td width="23%">${issueInfo.plantname}</td>
                                            <th width="10%">发现工位：</th>
                                            <td width="23%">${issueInfo.issue_station}</td>
                                            <th width="10%">发现区域：</th>
                                            <td width="24%">${issueInfo.areaname}</td>
                                        </tr>
                                        <tr>
                                            <th>质量分类：</th>
                                            <td>${issueInfo.l2name}</td>
                                            <th>问题分类：</th>
                                            <td>${issueInfo.l3name}</td>
                                            <th>问题描述：</th>
                                            <td>${issueInfo.issue_desc}</td>
                                        </tr>
                                        <tr>
                                            <th>失效位置：</th>
                                            <td>${issueInfo.locationname}</td>
                                            <th>区域：</th>
                                            <td>${issueInfo.areaname}</td>
                                            <th>班组：</th>
                                            <td>${issueInfo.plantname}</td>
                                        </tr>
                                        <tr>
                                            <th>ESN / SO：</th>
                                            <td>${issueInfo.esn}/${issueInfo.so}</td>
                                            <th>机型：</th>
                                            <td>${issue.engine_type}</td>
                                            <th>项目号：</th>
                                            <td>${issueInfo.project_no}</td>
                                        </tr>
                                        <tr>
                                            <th>问题编号：</th>
                                            <td>${issue.number}</td>
                                            <th>数量：</th>
                                            <td>${issueInfo.qty}</td>
                                            <th>图片附件：</th>
                                            <td>${issueInfo.attach}</td>
                                        </tr>
                                    </table>
                                </c:when>
                                <c:when test="${issue.qualityType eq 'T'}">
                                    <table width="100%" class="table table-hover table-bordered" id="">
                                        <tr>
                                            <th width="10%">机型：</th>
                                            <td width="23%">${issue.engineType}</td>
                                            <th width="10%">发动机 SO：</th>
                                            <td width="23%">${issue.so}</td>
                                            <th width="10%">发动机 ESN：</th>
                                            <td width="24%">${issue.esn}</td>
                                        </tr>
                                        <tr>
                                            <th>台架号：</th>
                                            <td>${issueExtend.bench}</td>
                                            <th>托盘号：</th>
                                            <td>${issueExtend.tray}</td>
                                            <th>问题分类：</th>
                                            <td>${issue.issueCategoryL1Name}</td>
                                        </tr>
                                        <tr>
                                            <th>所属子类：</th>
                                            <td>${issue.issueCategoryL2Name}</td>
                                            <th>问题描述：</th>
                                            <td>${issue.issueDesc}</td>
                                            <th>测量值/漏液：</th>
                                            <td>${issueExtend.leakage}</td>
                                        </tr>
                                        <tr>
                                            <th>备注附件：</th>
                                            <td colspan="5"><i class="fa fa-file-text"
                                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;
                                                <button type="button" class="btn btn-default btn-sm">附件下载</button>
                                            </td>
                                        </tr>
                                    </table>
                                    <table width="100%" class="table table-hover table-bordered" id="datatable2">

                                        <c:forEach items="${adviceList}" var="advice">
                                            <tr>
                                                <th width="10%"><strong>处理意见：</strong></th>
                                                <td>${advice.resolution}</td>
                                                <td width="24%"><p>质量工程师：${advice.handlerPersonName}
                                                    &nbsp;&nbsp;<fmt:formatDate
                                                            value="${advice.handlerDate}"
                                                            pattern="yyyy-MM-dd HH:mm:ss"/></p>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </table>
                                </c:when>
                            </c:choose>
                        </div>--%>
                    </div>

                    <div class="x_panel" style="width:75%;float:left; margin-right:10px;">

                        <div class="x_title">
                            <h2>处理工具</h2>
                            <%--&nbsp;&nbsp;&nbsp;&nbsp;<font color="#FF0000">说明：如果处理工具选择了“Notification”，则该行不显示“责任人”</font>
                            <span style="float:right; font-size:14px; margin-top:10px;">状态：<font
                                    style="color:#0099FF; font-weight:bold;">待处理</font></span>--%>
                            <div class="clearfix"></div>
                        </div>
                        <div class="form-group">
                            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                <input type="hidden" id="issueId" name="issueId" required="required"
                                       class="form-control" value="${issue.id}">
                                <table id="tools" width="100%" border="0" cellpadding="0" cellspacing="0"
                                       style="border-collapse:separate;border-spacing:15px;">
                                    <%--<tr>
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
                                    </tr>--%>
                                </table>
                            </form>
                        </div>


                        <div class="x_content">
                            <form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">
                                <div class="form-group">
                                    <div class="" role="tabpane2" data-example-id="togglable-tabs">
                                        <ul id="myTab2" class="nav nav-tabs bar_tabs right" role="tablist">
                                            <%--<li role="presentation" class="active"><a href="#tab_content1"
                                                                                      onclick="getListByToolType(1)"
                                                                                      id="home-tabb" role="tab"
                                                                                      data-toggle="tab"
                                                                                      aria-controls="home"
                                                                                      aria-expanded="true">CAR</a></li>
                                            <li role="presentation" class=""><a href="#tab_content2"
                                                                                onclick="getListByToolType(2)" role="tab"
                                                                                id="profile-tabb" data-toggle="tab"
                                                                                aria-controls="profile"
                                                                                aria-expanded="false">SCAR</a></li>
                                            <li role="presentation" class=""><a href="#tab_content3"
                                                                                onclick="getListByToolType(3)" role="tab"
                                                                                id="profile-tabb" data-toggle="tab"
                                                                                aria-controls="profile"
                                                                                aria-expanded="false">7STEP</a></li>
                                            <li role="presentation" class=""><a href="#tab_content4"
                                                                                onclick="getListByToolType(4)" role="tab"
                                                                                id="profile-tabb" data-toggle="tab"
                                                                                aria-controls="profile"
                                                                                aria-expanded="false">Notification</a>
                                            </li>--%>
                                        </ul>

                                        <!--附加表单开始-->
                                        <div id="myTabContent2" class="tab-content">
                                            <%--<div role="tabpane2" class="tab-pane fade active in" id="tab_content1"
                                                 aria-labelledby="home-tab">
                                                <table id="bill_tab_content1" width="100%" border="0" cellspacing="0"
                                                       cellpadding="0" class="table table-hover table-bordered">
                                                </table>
                                            </div>

                                            <div role="tabpane2" class="tab-pane fade" id="tab_content2"
                                                 aria-labelledby="home-tab">
                                                <table id="bill_tab_content2" width="100%" border="0" cellspacing="0"
                                                       cellpadding="0" class="table table-hover table-bordered">
                                                </table>
                                            </div>

                                            <div role="tabpane2" class="tab-pane fade" id="tab_content3"
                                                 aria-labelledby="home-tab">
                                                <table id="bill_tab_content3" width="100%" border="0" cellspacing="0"
                                                       cellpadding="0" class="table table-hover table-bordered">
                                                </table>
                                            </div>

                                            <div role="tabpane2" class="tab-pane fade" id="tab_content4"
                                                 aria-labelledby="home-tab">
                                                <table id="bill_tab_content4" width="100%" border="0" cellspacing="0"
                                                       cellpadding="0" class="table table-hover table-bordered">
                                                </table>
                                            </div>--%>
                                        </div>
                                        <!--附加表单结束-->
                                    </div>
                                </div>
                            </form>
                            <!--单据表完成-->
                        </div>


                        <div class="ln_solid"></div>
                        <div class="form-group">
                            <div style="text-align:center">
                                <button class="btn" type="button" onClick="preStep(${issue.id});">取消</button>
                                <button class="btn btn-primary" type="button" data-toggle="modal" data-target=".this-go"
                                        onClick="">确定
                                </button>
                            </div>
                        </div>
                    </div>


                    <div class="x_panel" style="width:calc(25% - 10px); float:left;">
                        <div class="x_title">
                            <h2>处理记录</h2>
                            <div class="clearfix"></div>
                        </div>

                        <div id="dealLog" class="x_content">

                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
    <!-- 内容区结束 -->

    <!-- 页脚开始 -->
    <%@include file="/view/static/common/foot.jsp" %>
    <!-- 页脚结束 -->
</div>
</div>
<!-- 遮蔽内容开始 -->
<div class="modal fade this-go" tabindex="-1" role="dialog" aria-hidden="true">
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
                <P>邮件接收人
                <P>
                    <select class="form-control">
                        <option>请选择</option>
                        <option>XXXX</option>
                        <option>XXXX</option>
                    </select>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="sendnotice();">
                    确定
                </button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->

<%@include file="/view/static/common/core_js.jsp" %>
<script>
    //加载工具标签
    $(function () {
        var tags=new Array("CAR","SCAR","7STEP","Notification");
        var html = "";
        var count = 1;
        for(var i = 0; i < tags.length; i++) {
            html += '<li role="presentation" class="">'
                + '<a href="#tab_content'+i+'" onclick="getListByToolType('+count+')" id="" role="tab" data-toggle="tab" aria-controls="" aria-expanded="true">'+tags[i]+'</a>'
                + '</li>'
            count++;
        }
        $("#myTab2").append(html);

    })

    $(function issueInfo() {
        var html = "";
        $.ajax({
            url: '${webPath}/bims/apucheck/getIssueInfo',
            type: "POST",
            dataType: "json",
            data: {
                id:${issue.id},
            },
            success: function(res) {
                console.log(res)
                if(res.success) {
                    html+='<table width="100%" class="table table-hover table-bordered" id="">'
                        +'<tr>'
                        +'<th width="10%">厂区：</th>'
                        +'<td width="23%">'+res.obj.plantname+'</td>'
                        +'<th width="10%">发现工位：</th>'
                        +'<td width="23%">'+res.obj.issue_station+'</td>'
                        +'<th width="10%">发现区域：</th>'
                        +'<td width="24%">'+res.obj.areaname+'</td>'
                        +'</tr>'
                        +'<tr>'
                        +'<th>质量分类：</th>'
                        +'<td>'+res.obj.l2name+'</td>'
                        +'<th>问题分类：</th>'
                        +'<td>'+res.obj.l3name+'</td>'
                        +'<th>问题描述：</th>'
                        +'<td>'+res.obj.issue_desc+'</td>'
                        +'</tr>'
                        +'<tr>'
                        +'<th>失效位置：</th>'
                        +'<td>'+res.obj.locationname+'</td>'
                        +'<th>区域：</th>'
                        +'<td>'+res.obj.areaname+'</td>'
                        +'<th>班组：</th>'
                        +'<td>'+res.obj.plantname+'</td>'
                        +'</tr>'
                        +'<tr>'
                        +'<th>ESN / SO：</th>'
                        +'<td>'+res.obj.esn+'/'+res.obj.so+'</td>'
                        +'<th>机型：</th>'
                        +'<td>'+res.obj.engine_type+'</td>'
                        +'<th>项目号：</th>'
                        +'<td>'+res.obj.project_no+'</td>'
                        +'</tr>'
                        +'<tr>'
                        +'<th>问题编号：</th>'
                        +'<td>'+res.obj.number+'</td>'
                        +'<th>数量：</th>'
                        +'<td>'+res.obj.qty+'</td>'
                        +'<th>图片附件：</th>'
                        +'<td>'+res.obj.attach+'</td>'
                        +'</tr>'
                        +'</table>';
                    $(".x_content_issue").html(html);
                }
            }
        })

    })
    var i = 0;
    window.onload = function () {
        var html = "";
        html += '<tr>'
            + '<td align="right" width="10%">添加工具：</td>'
            + '<td>'
            // + '<select id="processTool'+i+'" name="processTool" class="form-control">'
            // + '<option value="">--请选择--</option>'
            // + '<option value="1">7 Step</option>'
            // + '<option value="2">Scar</option>'
            // + '<option value="3">Car</option>'
            // + '<option value="4">Notification</option>'
            // + '</select>'
            + '</td>'
            + '<td align="right"></td>'
            + '<td>'
            // + '<select id="toolDutyPerson'+i+'" name="toolDutyPerson" class="form-control">'
            // + '<option value="">请选择</option>'
            // + '<option value="1">XXXX</option>'
            // + '<option value="2">XXXX</option>'
            // +'</select>'
            + '</td>'
            + '<td align="right"></td>'
            + '<td>'
            // + '<select id="reviewPerson'+i+'" name="reviewPerson" class="form-control">'
            // + '<option value="">请选择</option>'
            // + '<option value="1">XXXX</option>'
            // + '<option value="2">XXXX</option>'
            // +'</select>'
            + '</td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="addInputReturn">'
            + '<span class="glyphicon glyphicon-plus"></span> 添加<input type="hidden" id="count' + i + '" required="required" class="count" value=' + i + '>'
            + '</a>'
            + '</td>'
            + '<td id="saveInput' + i + '" align="right">'
            // +'<a href="javascript:;" class="saveInput" >'
            // +'<span class="glyphicon glyphicon-saved"></span> 保存<input type="hidden" id="count'+i+'" required="required" class="count" value='+i+'>'
            // +'</a>'
            + '</td>'
            + '</tr>';
        $("#tools").append(html);
        i++;

        $.ajax({
            url: "${webPath}/dealtool/getTools",
            type: "POST",
            dataType: "json",
            data: {
                issueId: ${issue.id},
            },
            success: function (res) {
                var html = "";
                if (res.success) {
                    var toollist = res.obj;
                    for (var i = 0; i < toollist.length; i++) {
                        /*html += '<tr class="tool">'
                            +'<input type="hidden" id="count'+i+'" required="required" class="count" value='+i+'>'
                            +'<input name="toolId" type="hidden" id="toolId'+i+'" required="required">'
                            +'<input name="carId" type="hidden" id="carId'+i+'" required="required">'
                            + '<td align="right" width="10%">选择工具：</td>'
                            + '<td><select id="processTool'+i+'" name="processTool" class="form-control">'
                            + '<option value="">--请选择--</option>'
                            + '<option value="1">7 Step</option>'
                            + '<option value="2">Scar</option>'
                            + '<option value="3">Car</option>'
                            + '<option value="4">Notification</option>'
                            + '</select></td>'
                            + '<td align="right">责任人：</td>'
                            + '<td><select id="toolDutyPerson'+i+'" name="toolDutyPerson" class="form-control">'
                            + '<option value="" >请选择</option>'
                            + '<option value="1">XXXX</option>'
                            + '<option value="2">XXXX</option>'
                            +'</select></td>'
                            + '<td align="right">审核人：</td>'
                            + '<td><select id="reviewPerson'+i+'" name="reviewPerson" class="form-control">'
                            + '<option value="" >请选择</option>'
                            + '<option value="1">XXXX</option>'
                            + '<option value="2">XXXX</option>'
                            +'</select></td>'
                            +'<td id="shanchu'+i+'" align="right">'
                            + '<a href="javascript:;" class="delInput">'
                            + '<span class="glyphicon glyphicon-minus"></span> 删除<input type="hidden" id="count'+i+'" required="required" class="count" value='+i+'>'
                            + '</a>'
                            + '</td>'
                            +'<td id="saveInput'+i+'" align="right">'
                            +'<a href="javascript:;" class="saveInput" >'
                            +'<span class="glyphicon glyphicon-saved"></span> 保存<input type="hidden" id="count'+i+'" required="required" class="count" value='+i+'>'
                            +'</a>'
                            +'</td>'
                            + '</tr>';
                        $("#tools").append(html);*/

                        html += '<tr id="delInput">&lt;%&ndash;'
                            + '<td align="right"><span style="width:10%">选择工具：</span></td>'
                            + '<td colspan="2" align="right"><input  name="processTool" disabled value="' + toollist[i].processToolName + '" class="form-control"></td>'
                            + '<td align="right">责任人：</td>'
                            + '<td align="right"><input value="' + toollist[i].toolDutyPersonName+ '" name="toolDutyPerson" disabled class="form-control"></td>'
                            + '<td align="right">审核人：</td>'
                            + '<td align="right"><input value="' + toollist[i].reviewPersonName+ '" name="reviewPerson" disabled class="form-control"></td>'
                            + '<td align="right">'
                            + '<a href="javascript:;" class="delInput" onclick="delTool(' + toollist[i].id + ',' + toollist[i].receiptId + ')" >'
                            + '<span class="glyphicon glyphicon-minus"></span> 删除'
                            + '</a>'
                            + '</td>&ndash;%&gt;'
                            + '</tr>';
                    }
                    $("#tools").append(html);
                }
            }
        })
    }

    $("body").on('click', '.addInputReturn', function () {
        //添加减号
        var html = "";
        html += '<tr class="tool">'
            + '<input type="hidden" id="count' + i + '" required="required" class="count" value=' + i + '>'
            + '<input name="toolId" type="hidden" id="toolId' + i + '" required="required">'
            + '<input name="carId" type="hidden" id="carId' + i + '" required="required">'
            + '<td align="right" width="10%">选择工具：</td>'
            + '<td><select id="processTool' + i + '" name="processTool" class="form-control">'
            + '<option value="">--请选择--</option>'
            + '<option value="1">Car</option>'
            + '<option value="2">Scar</option>'
            + '<option value="3">7 Step</option>'
            + '<option value="4">Notification</option>'
            + '</select></td>'
            + '<td align="right">责任人：</td>'
            + '<td><select id="toolDutyPerson' + i + '" name="toolDutyPerson" class="form-control">'
            + '<option value="" >请选择</option>'
            + '<option value="1">XXXX</option>'
            + '<option value="2">XXXX</option>'
            + '</select></td>'
            + '<td align="right">审核人：</td>'
            + '<td><select id="reviewPerson' + i + '" name="reviewPerson" class="form-control">'
            + '<option value="" >请选择</option>'
            + '<option value="1">XXXX</option>'
            + '<option value="2">XXXX</option>'
            + '</select></td>'
            + '<td id="shanchu' + i + '" align="right">'
            + '<a href="javascript:;" class="delInput">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除<input type="hidden" id="count' + i + '" required="required" class="count" value=' + i + '>'
            + '</a>'
            + '</td>'
            + '<td id="saveInput' + i + '" align="right">'
            + '<a href="javascript:;" class="saveInput" >'
            + '<span class="glyphicon glyphicon-saved"></span> 保存<input type="hidden" id="count' + i + '" required="required" class="count" value=' + i + '>'
            + '</a>'
            + '</td>'
            + '</tr>';
        $("#tools").append(html);

        i++;
    })
    $("body").on('click', '.tool', function () {
        var num = $(this).find("input").val();
        //检测处理工具下拉事件
        $('#processTool' + num + '').change(function () {
            var processTool = $(this).children('option:selected').val();
            if (processTool == 4) {
                $('#toolDutyPerson' + num + '').prop("disabled", true);
                $('#reviewPerson' + num + '').prop("disabled", true);
                // $('#toolDutyPerson'+num+'').remove();
                // $('#reviewPerson'+num+'').remove();
            }
        });
    })
    /**
     * 删除事件
     */
    $("body").on('click', '.delInput', function () {
        //删除处理措施
        var num = $(this).find("input").val();
        var toolId = $("#toolId" + num + "").val();
        //alert(receiptId)
        $.ajax({
            url: "${webPath}/dealtool/delTool",
            type: "POST",
            dataType: "json",
            data: {
                id: toolId,
            },
            success: function (res) {
                var html = "";
                if (res.success) {
                    //window.location.reload();
                }
            }
        });
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().remove();
        var html = "";
        if ($("#processTool" + num + "").val() == 1) {
            $("#bill_tab_content1").remove(html);
        }
    })

    /**
     * 保存事件
     */
    $("body").on('click', '.saveInput', function () {
        var num = $(this).find("input").val();
        console.log(num)

        //删除保存按钮
        $("#saveInput" + num + "").remove();
        //删除删除按钮
        //$("#shanchu"+num+"").remove();
        var html = "";
        //设置当前选择款禁用
        $("#processTool" + num + "").prop("disabled", true);
        $("#toolDutyPerson" + num + "").prop("disabled", true);
        $("#reviewPerson" + num + "").prop("disabled", true);


        var processTool = $("#processTool" + num + "").val();
        var toolDutyPerson = $("#toolDutyPerson" + num + "").val();
        var reviewPerson = $("#reviewPerson" + num + "").val();

        //保存处理工具
        $.ajax({
            url: "${webPath}/dealtool/addTool",
            type: "POST",
            dataType: "json",
            data: {
                processTool: processTool,
                toolDutyPerson: toolDutyPerson,
                issueId: ${issue.id},
                reviewPerson: reviewPerson
            },
            success: function (res) {
                console.log(res)
                var id = res.obj.id;
                if (res.success) {
                    $('#toolId' + num + '').val(id);
                }
            }
        });
    })

    //取消
    function preStep(id) {
        //window.location.href='${webPath}/bims/apucheck/apuEqr?id='+id;
        window.location.href = '${webPath}/back/toApu';
    }

    //确认并通知责任人
    function sendnotice() {
        var params = $("#demo-form2").serialize();
        //提交处理工具
        $.ajax({
            url: '${webPath}/bims/apucheck/dealtool',
            type: "POST",
            dataType: "json",
            data: params,
            success: function (res) {
                window.location.href = '${webPath}/back/toApu';
            }
        })
    }

    //获取处理记录

    $(function getDealLog() {
        $.ajax({
            url: "${webPath}/dealLog/getLog",
            type: "POST",
            dataType: "json",
            data: {
                issueId: ${issue.id},
            },
            success: function (res) {
                var html = "";
                if (res.success) {
                    var logList = res.obj;
                    for (var i = 0; i < logList.length; i++) {
                        html += '<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">'
                            + '<div style="width:41%; float:left; text-align:right">' + logList[i].processTime + '</div>'
                            + '<div style="width:8%; float:left; text-align:center"><img src="/view/static/images/time.png"></div>'
                            + '<div style="width:51%; float:right">' + logList[i].processPerson + ' ' + logList[i].actionName + '</div>'
                            + '</div>';
                    }
                }
                $("#dealLog").append(html);
            }
        })
    })

    //级联删除工具
    function delTool(id) {
        $.ajax({
            url: "${webPath}/dealtool/delTool",
            type: "POST",
            dataType: "json",
            data: {
                id: id
            },
            success: function (res) {
                if (res.success) {

                }
            }
        });
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().remove();
    }

    //获取Car
    function getListByToolType(type) {
        $.ajax({
            url: "${webPath}/dealtool/getListByToolType",
            type: "POST",
            dataType: "json",
            data: {
                issueId: ${issue.id},
                processTool: type,
            },
            success: function (res) {
                var html = "";
                if (res.success) {
                    var billlist = res.obj;
                    for (var i = 0; i < billlist.length; i++) {
                        html += '<div role="tabpane2" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">'
                                    +'<table id="bill_tab_content'+type+'" width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">'
                                    + '<tr>'
                                    + '<td style="width: 80%">'
                                    + '<i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;'
                                    + '<button type="button" onclick="getCarInfo(' + billlist[i].issueId + ',' + billlist[i].id + ',' + type + ')" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">' + billlist[i].carNo + '</button>'
                                    + '</td>'
                                    + '<td style="width: 20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;'
                                    + '<button onclick="getCarInfo(' + billlist[i].issueId + ',' + billlist[i].id + ',' + type+ ')" type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理</button>'
                                    + '</td>'
                                    + '</tr>'
                                    +'</table>'
                                    +'</div>'
                    }
                }
                $("#myTabContent2").html(html);
            }
        })
    }

    function getCarInfo(id,carId,type) {
        alert(type)
        if(type==1){
            window.location.href='${webPath}/car/toCarStep1Edit?id='+id+'&carId='+carId;
        }
        if(type==2){
            window.location.href='${webPath}/car/toScarStep1Edit?id='+id+'&carId='+carId;
        }
        if(type==3){
            window.location.href='${webPath}/car/to7Step1Edit?id='+id+'&carId='+carId;
        }
        if(type==4){
            window.location.href='${webPath}/car/toNotification?id='+id+'&carId='+carId;
        }
    }
</script>
</body>
</html>
