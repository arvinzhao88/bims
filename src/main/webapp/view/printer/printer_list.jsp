<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="${resPath}/view/static/images/favicon.ico" type="image/ico" />
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
    </style>
</head>
<body class="nav-md" style="overflow-x: hidden;">
<div class="container body">
    <div class="main_container">

        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">

                <!-- 导航上方用户标示开始 -->
                <%@include file="/view/static/common/sysinfo.jsp"%>
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
                <div class="page-title">
                    <div class="title_left"><h3>打印机管理</h3></div>
                </div>
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <div style="width: 100%; height: 40px;">
                                    <h2>打印机列表</h2>
                                </div>
                                <div style="width: 100%; margin-bottom: 8px;">
                                    <label style="float: left; padding-top: 0.5%;">线边工号：</label>
                                    <select id="account" name="account" class="select2_category" style="width: 15%; margin-left: 12px; float: left;"></select>
                                    <button class="btn btn-primary" style="margin-left: 12px; margin-top: 0.2%;" onclick="search()">查询</button>
                                    <button class="btn btn-default" style="margin-top: 0.2%;" onclick="javascript:location.reload()">重置</button>
                                    <button class="btn btn-primary" style="float: right;" onclick="javascript:location.href='${webPath}/printer/toBindPrinter'">新建</button>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table id="printer_list" width="100%" class="table table-bordered table-hover" style="margin-bottom: 0px;border-bottom: 0px;">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>工号</th>
                                        <th>姓名</th>
                                        <th>打印机IP</th>
                                        <th>创建时间</th>
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
        <%@include file="/view/static/common/foot.jsp"%>
        <!-- 页脚结束 -->
    </div>
</div>

<%@include file="/view/static/common/core_js.jsp"%>
<!-- Custom Theme Scripts -->
<script type="text/javascript">
    var ctx = '${webPath}';
    $(document).ready(function () {
        $("#account").select2({
            placeholder: "- 请输入工号 -",
            language: "zh-CN",
            minimumInputLength: 1,
            allowClear: true,
            escapeMarkup: function (markup) {
                return markup;
            },
            ajax: {
                type: "get",
                url: "${webPath}/printer/getListByAccount",
                dataType: 'json',
                data: function (params) {
                    return {
                        account: params.term
                    };
                },
                processResults: function (data) {
                    var options = new Array();
                    $(data).each(function (i, o) {
                        options.push({
                            id: o.personAccount,
                            text: o.personAccount + '<' + o.personName + '>',
                        });
                    });
                    return {
                        results: options
                    };
                },
                cache: true
            }
        });
        dataTablesInit(printer);
    });

    /**
     * 查询
     */
    function search() {
        var account = $("#account").val();
        if (account != null && account != "") {
            dataTablesInit(printer);
        }
    }
</script>
<script type="text/javascript" src="${resPath}/view/printer/js/printer_list.js"></script>
</body>
</html>