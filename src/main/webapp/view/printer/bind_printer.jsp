<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="${resPath}/view/static/images/favicon.ico" type="image/ico"/>
    <title>${sysName}</title>
    <%@include file="/view/static/common/global_css.jsp"%>
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
            <div clastits="page-title">
                <div class="page-le">
                    <div class="title_left"><h3>打印机管理</h3></div>
                </div>
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>打印机绑定</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <div style="width: 100%; height: 50px; ">
                                    <div style="width: 10%; float: left; text-align: right; padding-top: 0.6%; ">
                                        <label>线边工号：</label>
                                    </div>
                                    <div style="width: 90%; float: left; padding-left: 2%;">
                                        <select id="account" name="account" class="select2_category" style="width: 30%; " onchange="getIpByAccount()">
                                            <c:if test="${not empty account}">
                                                <option id="${account}">${account}</option>
                                            </c:if>
                                        </select>
                                    </div>
                                </div>
                                <div style="width: 100%; height: 50px; ">
                                    <div style="width: 10%; float: left; text-align: right; padding-top: 0.6%;">
                                        <label>打印机IP：</label>
                                    </div>
                                    <div style="width: 90%; float: left; padding-left: 2%;">
                                        <input id="ip" name="ip" class="form-control" style="width: 30%; " placeholder="请输入打印机IP" >
                                    </div>
                                </div>
                                <div style="width: 100%; margin-top: 8px; margin-left: 12%; ">
                                    <button class="btn btn-primary" onclick="submit()">确认</button>
                                    <button class="btn btn-default" onclick="javascript:location.href='${webPath}/printer/toPrinterList'">返回</button>
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

<%@include file="/view/static/common/core_js.jsp"%>
<!-- Custom Theme Scripts -->
<script type="text/javascript">
    $(document).ready(function () {
        /**共用部分 start**/
        $(".side-menu li").each(function(index){
            $(this).removeClass("active");
        });
        $(".child_menu li").each(function(index){
            $(this).removeClass("current-page");
        });
        $(".child_menu").css('display','none');
        /**共用部分 end**/

        /**父菜单*/
        $("#menuUserParent").addClass("active");
        /**父菜单*/
        $("#menuUserChild").css('display','block');
        /**子菜单*/
        $("#menuPrinter").addClass("current-page");

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
                url: "${webPath}/permission/getPersonListByRole",
                dataType: 'json',
                data: function (params) {
                    return {
                        role: "1",
                        account: params.term
                    };
                },
                processResults: function (data) {
                    var options = new Array();
                    $(data).each(function (i, o) {
                        options.push({
                            id: o.account,
                            text: o.account + '<' + o.name + '>',
                        });
                    });
                    return {
                        results: options
                    };
                },
                cache: true
            }
        });

        var account = "${account}";
        if (account != null && account != "") {
            $("#account").trigger("change");
        }
    });

    /**
     * 绑定
     */
    function submit() {
        if ($("#account").val() == "") {
            layer.msg("请输入工号");
        } else {
            if ($("#ip").val().trim() == "") {
                layer.msg("请输入打印机IP");
            } else {
                bindPrinter();
            }
        }
    }

    /**
     * 通过account获取ip
     */
    function getIpByAccount() {
        $.ajax({
            type: "get",
            url: "${webPath}/printer/getPrinterInfoByAccount",
            dataType: "json",
            data: {
                "account": $("#account").val()
            },
            success: function (result) {
                console.info(result);
                if (result.success == true && result.obj != null && result.obj != "") {
                    $("#ip").val(result.obj.printerIp);
                } else {
                    $("#ip").val("");
                }
            }
        });
    }

    /**
     * 绑定打印机
     */
    function bindPrinter() {
        $.ajax({
            type: "post",
            url: "${webPath}/printer/bindPrinter",
            dataType: "json",
            data: {
                "account": $("#account").val(),
                "printerIp": $("#ip").val().trim()
            },
            success: function (result) {
                console.info(result);
                layer.msg(result.msg);
                if (result.success == true) {
                    setTimeout(function () {
                        location.href='${webPath}/printer/toPrinterList'
                    }, 500);
                }
            }
        });
    }
</script>
</body>
</html>