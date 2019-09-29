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
    <title>${sysName}</title>
    <%@include file="/view/static/common/global_css.jsp" %>

    <style type="text/css">
        th {
            border-bottom-width: 0px !important;
            text-align: center;
        }

        th, td {
            vertical-align: middle !important;
        }
    </style>
</head>
<script type="text/javascript">
    var ctx = '${webPath}';
</script>
<body class="nav-md">
<div class="container body">
    <div class="main_container">

        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
                <%@include file="/view/static/common/sysinfo.jsp" %>
                <!-- 侧导航开始 -->
                <%@include file="/view/static/common/siderbar.jsp" %>
                <!-- 测导航结束 -->
            </div>
        </div>

        <!-- 顶部开始 -->
        <%@include file="/view/static/common/head.jsp" %>
        <!-- 顶部结束 -->

        <!-- 内容区开始 -->
        <div class="right_col" role="main">
            <div class="page-title">
                <div class="title_left"><h3>问题列表</h3></div>
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
                            <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                   style="border-collapse:separate;border-spacing:15px;">
                                <tr>
                                    <td width="3%" align="right">
                                        <p></p>
                                        <p>区域：</p>
                                    </td>
                                    <td width="10%">
                                        <select id="qualityType" name="qualityType" class="form-control">
                                            <option value="">- 请选择 -</option>
                                            <option value="A">AUP&终检</option>
                                            <option value="T">T区</option>
                                            <option value="M">机加</option>
                                            <option value="J">JOB1</option>
                                            <option value="B">BIS</option>
                                            <option value="E">EQA</option>
                                            <option value="S">SQA</option>
                                            <option value="H">售后</option>
                                        </select>
                                    </td>

                                    <td width="3%" align="right">
                                        <p></p>
                                        <p>厂区：</p>
                                    </td>
                                    <td width="10%">
                                        <select id="plant" name="plant" onchange="getAreaList()" class="form-control">
                                            <option value="">- 请选择 -</option>
                                            <option value="63">X</option>
                                            <option value="64">F</option>
                                        </select>
                                    </td>
                                    <td width="3%" align="right">
                                        <p></p>
                                        <p>录入时间：</p>
                                    </td>
                                    <td width="10%" id="datetimepicker1" class="date-picker input-daterange"
                                        data-date-format="yyyy-mm-dd">
                                        <input id='startDate' name="startDate" type="text" class="form-control" value=""
                                               placeholder="开始日期" style="float:left;width:48%;" autocomplete="off"/>
                                        <input id='endDate' name="endDate" type="text" class="form-control" value=""
                                               placeholder="结束日期" style="float:left;width:48%;margin-left:4%;" autocomplete="off"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td width="3%" align="right">
                                        <p></p>
                                        <p>问题状态：</p>
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
                                        <p>问题编码：</p>
                                    </td>
                                    <td width="10%">
                                        <input id="number" placeholder="请输入问题编码" type="text" class="form-control">
                                    </td>

                                    <td width="3%" align="right">
                                        <p></p>
                                        <p>零件号/ESN：</p>
                                    </td>
                                    <td width="10%">
                                        <input id="partNoOrEsn" placeholder="请输入ESN或零件号" type="text" class="form-control">
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
                                <button id="query" class="btn btn-primary" onclick="dataTablesInit(apucheck)">查询
                                </button>
                                <input id="reset" type="reset" value="重置" onclick="script:location.reload()"
                                       class="btn btn-default">
                            </div>
                            <button type="button" class="btn btn-success"
                                    style="margin-bottom:-4px; float: right; margin-right: 0.5%"
                                    onClick="excel()"> 导出
                            </button>
                            <!--工具条结束-->
                            <div class="clearfix"></div>
                        </div>

                        <div class="x_content">
                            <table width="100%" class="table table-bordered table-hover" id="issue_list"
                                   style="margin-bottom: 0px;border-bottom: 0px; text-align: center; ">
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
                                    <th>修正状态</th>
                                    <th>单据状态</th>
                                    <th>工具状态</th>
                                    <th>处理工具/责任人</th>
                                    <th>是否批量</th>
                                    <th>问题状态</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>
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

<%@include file="/view/static/common/core_js.jsp" %>
<script type="text/javascript">
    var ctx = '${webPath}';
</script>
<script type="text/javascript">
    /**
     * 获取区域列表
     */
    function getAreaList() {
        if ($("#plant").val() != null && $("#plant").val() != "") {
            $.ajax({
                type: "get",
                url: "${webPath}/dict/getSelectList",
                dataType: "json",
                data: {
                    "type": "xf",
                    "pid": Number($("#plant").val())
                },
                success: function (data) {
                    console.info(data);
                    if (data != null && data.success == true) {
                        var list = data.obj;
                        var opts = "<option value=''>- 请选择 -</option>";
                        for (var i in list) {
                            opts += "<option value=" + list[i].id + ">" + list[i].name + "</option>";
                        }
                        $("#area").html(opts);
                    }
                }
            });
        } else {
            $("#area").html("<option value=''>- 请选择 -</option>");
        }
    }

    /**
     * 导出excel
     */
    function excel() {
        var isAll = true;
        var isBacth = $("#issueCategoryL1Name option:selected").val();
        var qType = $("#qualityType option:selected").val();
        var plant = $("#plant option:selected").val();
        // var area = $("#area option:selected").val();
        // var eqr = $("#isEqr option:selected").val();
        var status = $("#processStatus option:selected").val();
        // var processPerson = $("#processPersonName").val();
        var partNoOrEsn = $("#partNoOrEsn").val();
        var startTime = $("#startDate").val();
        var endTime = $("#endDate").val();
        var no = $("#number").val();
        location.href = '${webPath}/excel/exportOther?qualityType=' + qType + '&plant=' + plant + '&processStatus=' + status + '&partNoOrEsn=' + partNoOrEsn+ '&startTime=' + startTime + '&endTime=' + endTime + '&number=' + no + '&issueCategoryL1Name=' + isBacth+ '&isAll='+isAll
    }
</script>
<script type="text/javascript" src="${resPath}/view/report/js/issue_list.js"></script>
</body>
</html>
