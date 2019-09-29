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
                            <h2>处置措施</h2>
                            <div class="clearfix"></div>
                        </div>
                        <div class="form-group">
                            <div id="index-div">

                            </div>

                            <form id="docManage" data-parsley-validate class="form-horizontal form-label-left">
                                <input type="hidden" id="issueId" name="issueId" required="required"
                                       class="form-control" value="${issue.id}">
                                <input type="hidden" id="qualityType" name="" required="required" class="form-control"
                                       value="${issue.qualityType}">
                                <table id="doc" width="100%" border="0" cellspacing="0" cellpadding="0"
                                       style="border-collapse:separate;border-spacing:15px;">
                                    <%--<tr>
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
                                    </tr>--%>
                                    <%--<tr id="delInput">
                                        &lt;%&ndash;<td align="right"><span style="width:10%">单据：</span></td>
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
                                        <td align="right"><i class="fa fa-minus-circle red"></i> 删除</td>&ndash;%&gt;
                                    </tr>--%>

                                </table>
                            </form>
                        </div>

                        <!--单据表开始-->
                        <div class="x_title">
                            <h2>单据管理</h2>
                           <%-- &nbsp;&nbsp;&nbsp;&nbsp;<font color="#FF0000">说明：表单初期为上传，如支持修改，提交后除预览按钮还会保留再次上传按钮。</font>
                            <span style="float:right; font-size:14px; margin-top:10px;">状态：<font
                                    style="color:#00CC00; font-weight:bold;">处理中</font></span>--%>
                            <div class="clearfix"></div>
                        </div>

                        <div class="x_content">
                            <form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">
                                <div class="form-group">
                                    <div class="" role="tabpane2" data-example-id="togglable-tabs">
                                        <ul id="myTab2" class="nav nav-tabs bar_tabs right" role="tablist">

                                            <%--<li role="presentation" class="active"><a href="#tab_content1" onclick="getListByBillType()" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">待处理标签</a></li>
                                            <li role="presentation" class=""><a href="#tab_content2" onclick="getListByBillType()" id="profile-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">报废单</a></li>
                                            <li role="presentation" class=""><a href="#tab_content3" onclick="getListByBillType()" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">让步接收单</a></li>
                                            <li role="presentation" class=""><a href="#tab_content4" onclick="getListByBillType()" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">返工/返修/筛选单</a></li>
                                            <li role="presentation" class=""><a href="#tab_content5" onclick="getListByBillType()" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">连带报废单</a></li>
                                            <li role="presentation" class=""><a href="#tab_content6" onclick="getListByBillType()" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">待处理品单</a></li>
                                            <li role="presentation" class=""><a href="#tab_content7" onclick="getListByBillType()" role="tab" id="profile-tabb" data-toggle="tab" aria-controls="profile" aria-expanded="false">不合格品抑制单</a></li>
                                            --%>
                                        </ul>

                                        <!--附加表单开始-->
                                        <div id="myTabContent2" class="tab-content">

                                            <%--
                                                                            <div role="tabpane2" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">
                                                                                <table id="bill_tab_content1" width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                                                    &lt;%&ndash;<tr>
                                                                                        <td style="width: 80%">
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">1XXXXX表单</button>
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">2XXXXX表单</button>
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">3XXXXX表单</button>
                                                                                        </td>
                                                                                        <td style="width: 20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                                                    </tr>&ndash;%&gt;
                                                                                </table>
                                                                            </div>

                                                                            <div role="tabpane2" class="tab-pane fade" id="tab_content2" aria-labelledby="home-tab">
                                                                                <table id="bill_tab_content2" width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                                                    &lt;%&ndash;<tr><td style="width: 80%">
                                                                                        <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">4XXXXX表单</button>
                                                                                    </td>
                                                                                        <td style="width: 20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                                                    </tr>&ndash;%&gt;
                                                                                </table>
                                                                            </div>

                                                                            <div role="tabpane2" class="tab-pane fade" id="tab_content3" aria-labelledby="home-tab">
                                                                                <table id="bill_tab_content3" width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                                                    &lt;%&ndash;<tr>
                                                                                        <td style="width: 80%">
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">5XXXXX表单</button>
                                                                                        </td>
                                                                                        <td style="width: 20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                                                    </tr>&ndash;%&gt;
                                                                                </table>
                                                                            </div>

                                                                            <div role="tabpane2" class="tab-pane fade" id="tab_content4" aria-labelledby="home-tab">
                                                                                <table id="bill_tab_content4" width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                                                    &lt;%&ndash;<tr>
                                                                                        <td style="width: 80%">
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">6XXXXX表单</button>
                                                                                        </td>
                                                                                        <td style="width: 20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                                                    </tr>&ndash;%&gt;
                                                                                </table>
                                                                            </div>

                                                                            <div role="tabpane2" class="tab-pane fade" id="tab_content5" aria-labelledby="home-tab">
                                                                                <table id="bill_tab_content5" width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                                                    &lt;%&ndash;<tr>
                                                                                        <td style="width: 80%">
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">7XXXXX表单</button>
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">8XXXXX表单</button>
                                                                                        </td>
                                                                                        <td style="width: 20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                                                    </tr>&ndash;%&gt;
                                                                                </table>
                                                                            </div>
                                                                            <div role="tabpane2" class="tab-pane fade" id="tab_content6" aria-labelledby="home-tab">
                                                                                <table id="bill_tab_content6" width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                                                    &lt;%&ndash;<tr>
                                                                                        <td style="width: 80%">
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">7XXXXX表单</button>
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">8XXXXX表单</button>
                                                                                        </td>
                                                                                        <td style="width: 20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                                                    </tr>&ndash;%&gt;
                                                                                </table>
                                                                            </div>

                                                                            <div role="tabpane2" class="tab-pane fade active in" id="tab_content7" aria-labelledby="home-tab">
                                                                                <table id="bill_tab_content7" width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">
                                                                                    &lt;%&ndash;<tr>
                                                                                        <td style="width: 80%">
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">1XXXXX表单</button>
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">2XXXXX表单</button>
                                                                                            <i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">3XXXXX表单</button>
                                                                                        </td>
                                                                                        <td style="width: 20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>
                                                                                    </tr>&ndash;%&gt;
                                                                                </table>
                                                                            </div>--%>
                                        </div>
                                        <!--附加表单结束-->
                                    </div>
                                </div>
                            </form>
                            <!--单据表完成-->
                        </div>


                        <div class="x_title">
                            <h2>问题处理</h2>
                            <%--&nbsp;&nbsp;&nbsp;<font color="#FF0000">说明：默认“是”该问题交由EQR
                            Leader处理，选择“否”后该问题继续由区域质量工程师直接开CAR处理。</font>
                            <span style="float:right; font-size:14px; margin-top:10px;">状态：<font
                                    style="color:#0099FF; font-weight:bold;">待处理</font></span>--%>
                            <div class="clearfix"></div>
                        </div>

                        <div class="x_content">
                            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                <div class="form-group">
                                    <div class="form-group col-md-10">
                                        <label class="control-label col-md-3">是否EQR：</label>
                                        <div class="col-md-5">
                                            <p style="padding-top:8px;">
                                                <input type="radio" class="flat" name="isEqr" id="isEqr1" checked=""
                                                       value="1" required/>&nbsp;&nbsp;是&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                <input type="radio" class="flat" name="isEqr" id="isEqr2" value="2"/>&nbsp;&nbsp;否
                                            </p>
                                        </div>
                                    </div>

                                    <div class="form-group col-md-10">
                                        <label class="control-label col-md-3">处理：</label>
                                        <div class="col-md-9" style="padding-top:8px;">问题发送 EQR Leader 进行下一步处理</div>
                                    </div>
                                </div>
                                <div class="ln_solid"></div>
                                <div class="form-group">
                                    <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                        <button class="btn" type="button" onClick="toApuCorrect(${issue.id})">取消
                                        </button>
                                        <button class="btn btn-primary" type="button" data-toggle="modal"
                                                data-target=".this-go" onclick="confirm(${issue.id})">确定
                                        </button>
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
<%--<div class="modal fade this-go" tabindex="-1" role="dialog" aria-hidden="true" >
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
        <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="javascrtpt:window.location.href='z_a_eqr_leader.jsp'">确定</button>
      </div>
        </div>
    </div>
</div>--%>
<!-- 遮蔽内容结束 -->

<%@include file="/view/static/common/core_js.jsp" %>
<script>

    //加载单据标签
    $(function () {
        var tags = new Array("待处理标签", "报废单", "让步接收单", "待处理品单", "连带报废单", "不合格品抑制单", "报废单&连带报废单", "返工/返修/筛选单");
        var html = "";
        var count = 1;
        for (var i = 0; i < tags.length; i++) {
            html += '<li role="presentation" class="">'
                + '<a href="#tab_content' + i + '" onclick="getListByBillType(' + count + ')" id="" role="tab" data-toggle="tab" aria-controls="" aria-expanded="true">' + tags[i] + '</a>'
                + '</li>'
            count++;
        }
        $("#myTab2").append(html);

    })

    window.onload = function () {
        //问题描述
        var html = "";
        html += '<tr id="tempMeasures">'
            + '<td align="right" style="width:10%;">处置措施：</td>'
            + '<td style="width:18%;"><select id="measures" name="tempMeasures" class="form-control">'
            + '<option value="">--请选择--</option>'
            + '<option value="1">料废</option>'
            + '<option value="2">工废</option>'
            + '<option value="3">让步接收</option>'
            + '<option value="4">待处理</option>'
            + '<option value="5">工程偏离(暂时不做)</option>'
            + '<option value="6">筛选—（不合格品抑制单</option>'
            + '<option value="7">拒收—无</option>'
            + '<option value="8">返工—（返工返修随机卡</option>'
            + '</select></td>'
            + '<td style="width:10%;">&nbsp;</td>'
            + '<td style="width:18%;">&nbsp;</td>'
            + '<td align="right" style="width:10%;">&nbsp;</td>'
            + '<td align="right" style="width:18%;">&nbsp;</td>'
            + '<td align="right" style="width:16%;">'
            + '<a href="javascript:;" class="addInputReturn">'
            + '<span class="glyphicon glyphicon-plus"></span> 添加'
            + '</a>'
            + '</td>'
            + '</tr>';
        $("#doc").html(html);

        $.ajax({
            url: "${webPath}/bill/getBills",
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
                        html += '<tr id="delInput">&lt;%&ndash;'
                            + '<td align="right"><span style="width:10%">单据：</span></td>'
                            + '<td colspan="2" align="right"><input  name="billName" disabled value="' + toollist[i].billType + '" class="form-control"></td>'
                            + '<td align="right">责任人：</td>'
                            + '<td align="right"><input value="' + toollist[i].dutyPerson + '" name="dutyPerson" disabled class="form-control"></td>'
                            + '<td align="right">'
                            + '<a href="javascript:;" class="delInput" onclick="delBill(' + toollist[i].id + ',' + toollist[i].receiptId + ')" >'
                            + '<span class="glyphicon glyphicon-minus"></span> 删除'
                            + '</a>'
                            + '</td>&ndash;%&gt;'
                            + '</tr>';
                    }
                    $("#doc").append(html);
                }
            }
        })
    }


    var i = 0;
    $("body").on('click', '.addInputReturn', function () {
        //添加减号
        var html = '';
        html += '<tr id="delInput' + i + '">'
            + '<input name="billId" type="hidden" id="billId' + i + '" required="required">'
            + '<input name="receiptId" type="hidden" id="receiptId' + i + '" required="required">'
            + '<td align="right"><span style="width:10%">问题单据：</span></td>'
            + '<td colspan="2" align="right">'
            + '<select id="billName' + i + '" name="billName" class="form-control">'
            + '<option value="">请选择</option>'
            + '<option value="1">待处理标签</option>'
            + '<option value="2">报废单</option>'
            + '<option value="3">让步接收单</option>'
            + '<option value="4">待处理品单</option>'
            + '<option value="5">连带报废单</option>'
            + '<option value="6">不合格品抑制单</option>'
            + '<option value="7">报废单&连带报废单</option>'
            + '<option value="8">返工/返修/筛选单</option>'

            + '</select></td>'
            + '<td align="right">责任人：</td>'
            + '<td align="right"><select id="dutyPerson' + i + '" name="dutyPerson" class="form-control">'
            + '<option value="">请选择</option>'
            + '<option value="1">城管并</option>'
            + '<option value="2">刘伶凯</option>'
            + '</select></td>'
            + '<td id="saveInput' + i + '" align="right">'
            + '<a href="javascript:;" class="saveInput" >'
            + '<span class="glyphicon glyphicon-saved"></span> 保存<input type="hidden" id="count' + i + '" required="required" class="count" value=' + i + '>'
            + '</a>'
            + '</td>'
            + '<td id="shanchu' + i + '" align="right">'
            + '<a href="javascript:;" class="delInput" >'
            + '<span class="glyphicon glyphicon-minus"></span> 删除<input type="hidden" id="count' + i + '" required="required" class="count" value=' + i + '>'
            + '</a>'
            + '</td>'
            + '</tr>';
        $("#doc").append(html);
        i++;
    })

    /**
     * 删除事件
     */
    $("body").on('click', '.delInput', function () {
        var num = $(this).find("input").val();
        //删除处理措施
        var billId = $("#billId" + num + "").val();
        var receiptId = $("#receiptId" + num + "").val();
        //alert(receiptId)
        $.ajax({
            url: "${webPath}/bill/delBill",
            type: "POST",
            dataType: "json",
            data: {
                id: billId,
                receiptId: receiptId,
            },
            success: function (res) {
                var html = "";
                if (res.success) {
                    window.location.reload();
                }
            }
        });
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().remove();
        var html = "";
        if ($("#billName" + num + "").val() == 3) {
            $("#bill_tab_content6").remove(html);
        }


    })

    /**
     * 保存事件
     */
    $("body").on('click', '.saveInput', function () {
        var num = $(this).find("input").val();
        console.log(num)
        var tempMeasures = $("#measures").val();
        if (tempMeasures == "") {
            layer.msg("请选择处置措施！")
            return;
        }
        //删除保存按钮
        $("#saveInput" + num + "").remove();
        //删除删除按钮
        //$("#shanchu"+num+"").remove();
        var html = "";
        //设置当前选择款禁用
        $("#billName" + num + "").prop("disabled", true);
        $("#dutyPerson" + num + "").prop("disabled", true);


        var type = $("#billName" + num + "").val();
        var dutyPerson = $("#dutyPerson" + num + "").val();
        var qualityType = $("#qualityType").val();
        var measureNo = '${issue.number}';


        //保存处理措施

        $.ajax({
            url: "${webPath}/bill/saveBill",
            type: "POST",
            dataType: "json",
            data: {
                billName: type,
                dutyPerson: dutyPerson,
                issueId: ${issue.id},
                issueArea: qualityType,
                measureNo: measureNo,
                tempMeasures: tempMeasures,
            },
            success: function (res) {
                console.log(res)
                var id = res.obj.id;
                var receiptId = res.obj.receiptId;
                if (res.success) {
                    $('#billId' + num + '').val(id);
                    $('#receiptId' + num + '').val(receiptId);
                }
            }
        });
    })


    //点击取消到确认页
    function toApuCorrect(id) {
        window.location.href = '${webPath}/bims/apucheck/apuCorrect?id=' + id;
    }

    //是否EQR
    function confirm(id) {
        var isEqr = $('input:radio:checked').val();  //获取选中的radio的值
        var params = $("#docManage").serialize();
        if (isEqr == 1) {
            layer.confirm('确定将该问题交由EQR Leader进行处理吗？', {icon: 3, title:'提示'}, function(index){
                $.ajax({
                    url: '${webPath}/bims/apucheck/isEqr/' + isEqr + '',
                    type: "POST",
                    dataType: "json",
                    data: params,
                    success: function (res) {
                        window.location.href = '${webPath}/bims/apucheck/apuEqrLearder?id=' + id;
                    }
                })
                layer.close(index);
            });
        } else if (isEqr == 2) {
            layer.confirm('确定直接开CAR进行处理吗?', {icon: 3, title:'提示'}, function(index){
                $.ajax({
                    url: '${webPath}/bims/apucheck/isEqr/' + isEqr + '',
                    type: "POST",
                    dataType: "json",
                    data: params,
                    success: function (res) {
                        window.location.href = '${webPath}/bims/apucheck/apuLearder?id=' + id;

                    }
                })
                layer.close(index);
            });
            $("#isEqr2").prop("checked", true);
        }

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

    //获取待处理标签单据
    function getListByBillType(type) {
        $.ajax({
            url: "${webPath}/bill/getListByBillType",
            type: "POST",
            dataType: "json",
            data: {
                issueId: ${issue.id},
                billName: type,
            },
            success: function (res) {
                var html = "";
                if (res.success) {
                    var billlist = res.obj;
                    for (var i = 0; i < billlist.length; i++) {
                        html += '<div role="tabpane2" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">'
                            + '<table id="bill_tab_content' + type + '" width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-hover table-bordered">'
                            + '<tr>'
                            + '<td style="width: 80%">'
                            + '<i class="fa fa-table" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;'
                            + '<button type="button" onclick="getTagsById(' + billlist[i].receiptId + ',' + type + ')" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-biaodan">' + billlist[i].measureNo + '</button>'
                            + '</td>'
                            + '<td style="width: 20%"><i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;'
                            + '<button onclick="getTagsById(' + billlist[i].receiptId + ',' + type + ')" type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理</button>'
                            + '</td>'
                            + '</tr>'
                            + '</table>'
                            + '</div>'
                    }
                }
                $("#myTabContent2").html(html);
            }
        })
    }

    function getTagsById(id, type) {
        if (type == 1) {
            window.open('${webPath}/Tagstprocessed/jumpPendingForm/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px')
        }
        if (type == 2) {
            window.open('${webPath}/ScrapBill/queryScrapForUpdate/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px')
        }
        if (type == 3) {
            layer.msg("暂无数据")
            return;
        }
        if (type == 4) {
            window.open('${webPath}/PendingDocument/queryPendingDocuments/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px')
        }
        if (type == 5) {
            layer.msg("暂无数据")
            return;
        }
        if (type == 6) {
            window.open('${webPath}/NonProductContainment/queryNonconformingProductContainmentOrder/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px')
        }
        if (type == 7) {
            layer.msg("暂无数据")
            return;
        }
        if (type == 8) {
            layer.msg("暂无数据")
            return;
        }
    }

    function getTagstprocessed(id) {
        window.open('${webPath}/Tagstprocessed/jumpPendingForm/' + id, '_blank', 'width=1200,height=800,top=100px,left=400px')
        //window.location.href='${webPath}/Tagstprocessed/jumpPendingForm/'+id;
    }

    //级联删除单据
    function delBill(id, receiptId) {
        $.ajax({
            url: "${webPath}/bill/delBill",
            type: "POST",
            dataType: "json",
            data: {
                id: id,
                receiptId: receiptId,
            },
            success: function (res) {
                if (res.success) {

                }
            }
        });
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().remove();
    }

    //根据id删除单据
    function deletePendingOrder(id) {
        $.ajax({
            url: '${webPath}/Tagstprocessed/deletePendingOrder/' + id,
            type: "POST",
            dataType: "json",
            data: {},
            success: function (res) {
                console.log(res)
                if (res.success) {
                    layer.alert("删除成功")
                }
            }
        })
    }

</script>
</body>
</html>
