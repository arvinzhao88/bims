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
    <%--<link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>--%>
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

                        <div class="x_content_issue" style="display:none;">
                            <%@include file="/view/back/bims/qualityissues/common/issuedesc.jsp" %>
                            <%--<table width="100%" class="table table-hover table-bordered" id="">
                                <tr>
                                    <th width="10%">厂区：</th>
                                    <td width="23%">${issue.plant}</td>
                                    <th width="10%">发现工位：</th>
                                    <td width="23%">${issue.issueStation}</td>
                                    <th width="10%">发现区域：</th>
                                    <td width="24%">${issue.area}</td>
                                </tr>

                                <tr>
                                    <th>质量分类：</th>
                                    <td>${issue.issueCategoryL1}</td>
                                    <th>问题分类：</th>
                                    <td>${issue.issueCategoryL2}</td>
                                    <th>问题描述：</th>
                                    <td>${issue.issueDesc}</td>
                                </tr>

                                <tr>
                                    <th>工位：</th>
                                    <td>${issue.issueStation}</td>
                                    <th>区域：</th>
                                    <td>${issue.area}</td>
                                    <th>班组：</th>
                                    <td>${issue.area}</td>
                                </tr>

                                <tr>
                                    <th>ESN / SO：</th>
                                    <td>${issue.esn}/${issue.so}</td>
                                    <th>机型：</th>
                                    <td>${issue.engineType}</td>
                                    <th>项目号：</th>
                                    <td>${issue.projectNo}</td>
                                </tr>

                                <tr>
                                    <th>首台ESN：</th>
                                    <td>${issue.esn}</td>
                                    <th>数量：</th>
                                    <td>${issue.qty}</td>
                                    <th>图片附件：</th>
                                    <td>${issue.attach}</td>
                                </tr>

                            </table>--%>
                        </div>
                    </div>

                    <div class="x_panel" style="width:75%;float:left; margin-right:10px;">
                        <div class="x_title">
                            <h2>问题通知单</h2>
                            <div class="clearfix"></div>
                        </div>

                        <div class="x_content">
                            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                       class="table table-hover table-bordered">
                                    <tr>
                                        <td colspan="6" align="center">EQR Notification Form
                                            突发质量问题通知单（EQRX20190201003）
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="22%"><strong>Issue Date 问题发生日期</strong></td>
                                        <td width="28%"><fmt:formatDate value="${issue.inputTime}" pattern="yyyy-MM-dd"/></td>
                                        <td width="50%" colspan="4"><strong>Issue Description 问题描述</strong></td>
                                    </tr>
                                    <tr>
                                        <td><strong>Issue Area 问题发生区域</strong></td>
                                        <td>${issue.plant} ${issue.area} line<br>
                                        </td>
                                        <td colspan="4" rowspan="3">
                                            <textarea name="textarea" id="textarea" cols="300" rows="3"
                                                      style="width:100%">${issue.issueDesc}</textarea></td>
                                    </tr>
                                    <tr>
                                        <td><strong>Station No.工位号</strong></td>
                                        <td>${issue.issueStation}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Engine Type 发动机型号</strong></td>
                                        <td>${issue.engineType}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>ESN 发动机序列号</strong></td>
                                        <td>${issue.esn}/${issue.so}</td>
                                        <td colspan="4"><strong>Containment action 遏制措施</strong></td>
                                    </tr>
                                    <tr>
                                        <td><strong>PN 零件号</strong></td>
                                        <td>${issue.partNo}</td>
                                        <td colspan="4" rowspan="3"><textarea name="containmentAction" id="containmentAction" cols="100"
                                                                              rows="3" style="width:100%"></textarea>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><strong>Part Name 零件名</strong></td>
                                        <td>${issue.partName}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Supplier Name 供应商名称</strong></td>
                                        <td>${issue.vendorName}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>ailure Qty 失效数量</strong></td>
                                        <td>${issue.qty}</td>
                                        <td colspan="4"><strong>Clean point 断点</strong></td>
                                    </tr>
                                    <tr>
                                        <td><strong>Effect Engine Amout<br>
                                            影响发动机台数</strong></td>
                                        <td><input type="text" id="effectEngineAmout" name="effectEngineAmout"
                                                   required="required" class="form-control" value=""></td>
                                        <td colspan="4" rowspan="3">
                                            <textarea name="cleanPoint" id="cleanPoint" cols="100" rows="3"
                                                      style="width:100%"></textarea>
                                            <br>
                                            <i class="fa fa-file-picture-o"
                                               style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                                type="button" class="btn btn-default btn-sm">上传图片
                                        </button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><strong>Effect Scope<br>
                                            影响范围</strong></td>
                                        <td><input type="text" id="effectScope" name="effectScope" required="required"
                                                   class="form-control" value=""></td>
                                    </tr>
                                    <tr>
                                        <td><strong>Impact to Delivery<br>
                                            是否影响发交</strong></td>
                                        <td><input type="text" id="effectToDelivery" name="effectToDelivery"
                                                   required="required" class="form-control" value=""></td>
                                    </tr>
                                    <tr>
                                        <td><strong>Issue Sensor<br>
                                            问题来源</strong></td>
                                        <td><input type="text" id="issueSensor" name="issueSensor" required="required"
                                                   class="form-control" value=""></td>
                                        <td width="15%"><strong>CAR/SCAR 号码</strong></td>
                                        <td width="15%">&nbsp;</td>
                                        <td width="10%"><strong>责任人</strong></td>
                                        <td width="10%">&nbsp;</td>
                                    </tr>
                                </table>


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
                                        <button class="btn btn-primary" type="button" data-toggle="modal"
                                                data-target=".this-mail">发送邮件
                                        </button>&nbsp;&nbsp;&nbsp;&nbsp;
                                        <button class="btn btn-success" type="button" data-toggle="modal"
                                                data-target=".this-opencar" onclick="openCar(${issue.id})">开CAR处理
                                        </button>
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
<div class="modal fade this-mail" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">确定</h4>
            </div>
            <div class="modal-body">
                <p>确定将编号：EQRX20190201003的《突发质量问题通知单》发送至邮件接收人吗?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal">确定</button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->
<!-- 遮蔽内容开始 -->
<%--<div class="modal fade this-opencar" tabindex="-1" role="dialog" aria-hidden="true" >
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
            <h4 class="modal-title" id="myModalLabel">确定</h4>
            </div>
            <div class="modal-body">
            <p>确定开始处理问题吗？</p>
            </div>
            <div class="modal-footer">
        <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
        <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="sendnotice();">确定</button>
      </div>
        </div>
    </div>
</div>--%>
<!-- 遮蔽内容结束 -->

<%@include file="/view/static/common/core_js.jsp" %>
<script>
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

    //开car处理
    function openCar(id) {
        layer.confirm('确定开始处理问题吗?', {icon: 3, title:'提示'}, function(index){
            var params = $("#demo-form2").serialize();
            //保存问题通知单
            $.ajax({
                url: '${webPath}/bims/notification/upd',
                type: "POST",
                dataType: "json",
                data: params,
                success: function (res) {
                    window.location.href = '${webPath}/bims/apucheck/apuLearder?id=' + id;
                }
            })
            layer.close(index);
        });
    }

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
                    html+='<table width="100%" class="table table-hover table-bordered" id="datatable">'
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
                    $(".x_content_issue").append(html);
                }
            }
        })

    })
</script>
</body>
</html>
