<%--
  APU及终检问题列表
  Date: 2019/6/17
  Time: 11:10
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/view/pad/common/base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta charset="utf-8" content="width=device-width, initial-scale=0.87, maximum-scale=0.87, user-scalable=0"
          name="viewport"/>
    <title>${sysName}</title>
    <%@include file="/view/pad/common/global_css.jsp" %>
    <%@include file="/view/pad/common/core_js.jsp" %>
</head>
<body style="background-image:url(${resPath}/view/pad/images/beijing2.jpg);background-size:cover;">
<%@include file="/view/pad/common/header.jsp" %>
<div align="center" style="width: 100%;height: 50px;position: absolute;top: 61px; display: flex;">
    <div style="width: 100%;align-self: center;margin-left: auto; margin-right: 10px;">
        <input type="text" id="searchText" name="searchText" value="" placeholder="输入零件号,ESN查询" style="width: 80%;height: 30px;border-radius: 25px 0px 0px 25px;border: 1px solid rgba(221,226,232,.49);padding-left: 10px;">
        <button id="minSearch" type="button" style="width: 15%; text-align: center;" onclick="search()">查询</button>
    </div>
</div>
<input id="ip" type="hidden" value="${printer.printerIp}">
<div id="main" align="center" style="top: 122px">
    <div class="mycontent">
        <div id="refreshContainer" class="mui-scroll-wrapper" style="width:100%;overflow-y:auto;">
            <div id="pullrefresh" class="mui-scroll">
                <div id="content"></div>
            </div>
        </div>
    </div>
</div>
<%@include file="/view/pad/common/footer.jsp" %>
<script type="text/javascript">
    var page = 0; // 开始数据条数
    var size = 12; // 每页显示条数
    var isOver = false;

    $(document).ready(function () {
        // 设置菜单栏内容
        var temp = "${temp}";
        if (temp == "A" || temp == "a") {
            $("#label_area")[0].innerHTML = "APU&终检";
            $("#div_submit").attr("onclick", "javascript:location.href='${webPath}/pad/issue/a','_self'");
        }
        if (temp == "T" || temp == "t") {
            $("#label_area")[0].innerHTML = "T 区";
            $("#div_submit").attr("onclick", "javascript:location.href='${webPath}/pad/issue/t','_self'");
        }
        if (temp == "M" || temp == "m") {
            $("#label_area")[0].innerHTML = "机加";
            $("#div_submit").attr("onclick", "javascript:location.href='${webPath}/pad/issue/m','_self'");
        }
        $("#label_option")[0].innerHTML = "提交列表";
        $("#div_list").attr("class", "ppt1_on");

        /**
         * 下拉刷新，上拉加载
         */
        mui.init({
            pullRefresh: {
                container: '#refreshContainer', // 待刷新区域标识，querySelector能定位的css选择器均可，比如：id、.class等
                down: {
                    height: 50,//可选,默认50.触发下拉刷新拖动距离,
                    auto: false,//可选,默认false.首次加载自动下拉刷新一次
                    contentdown: "",//可选，在下拉可刷新状态时，下拉刷新控件上显示的标题内容
                    contentover: "释放立即刷新",//可选，在释放可刷新状态时，下拉刷新控件上显示的标题内容
                    contentrefresh: "正在刷新...",//可选，正在刷新状态时，下拉刷新控件上显示的标题内容
                    callback: pullDown //必选，刷新函数，根据具体业务来编写，比如通过ajax从服务器获取新数据；
                },
                up: {
                    height: 50,//可选.默认50.触发上拉加载拖动距离
                    auto: true,//可选,默认false.自动上拉加载一次
                    contentrefresh: "正在加载...",//可选，正在加载状态时，上拉加载控件上显示的标题内容
                    contentnomore: '没有更多数据了',//可选，请求完毕若没有更多数据时显示的提醒内容；
                    callback: pullUp //必选，刷新函数，根据具体业务来编写，比如通过ajax从服务器获取新数据；
                }
            }
        });
    });

    /**
     * 点击搜索
     */
    function search() {
        // var searchText = $("#searchText").val();
        // alert(searchText)
        $("#content").children().remove();
        page = 0;
        loadData();
        mui('#refreshContainer').pullRefresh().endPulldownToRefresh();
        mui('#refreshContainer').pullRefresh().enablePullupToRefresh();
    }

    /**
     * 下拉
     */
    function pullDown() {
        $("#content").children().remove();
        page = 0;
        loadData();
        mui('#refreshContainer').pullRefresh().endPulldownToRefresh();
        mui('#refreshContainer').pullRefresh().enablePullupToRefresh();
    }

    /**
     * 上拉加载回调
     */
    function pullUp() {
        setTimeout(function () {
            mui('#refreshContainer').pullRefresh().endPullupToRefresh((isOver)); // 参数为true代表没有更多数据了。
            loadData(); // ajax
        }, 500);
    }

    /**
     * 加载数据
     */
    function loadData() {
        $.ajax({
            type: "get",
            url: "${webPath}/pad/issue/listPage",
            dataType: "json",
            data: {
                "temp": "${temp}",
                "searchText": $("#searchText").val(),
                "page": page,
                "size": size
            },
            success: function (list) {
                console.info(list);
                var html = "";
                for (var i in list) {
                    if (list.length < size) {
                        isOver = true;
                    } else {
                        isOver = false;
                    }
                    var issue = list[i];
                    // 问题描述
                    if (issue.issueDesc != null && issue.issueDesc != "") {
                        var desc = issue.issueDesc;
                    } else {
                        if (issue.issueCategoryL3 != null && issue.issueCategoryL3 != "") {
                            var desc = issue.issueCategoryL3;
                        }
                    }

                    // 状态
                    if (issue.qualityType == "T") { // T区
                        if (issue.processStatus >= "0" && issue.processStatus <= "6") {
                            var statusStr = "<font color=\"#33CCFF\">处理中</font>";
                        }
                        if (issue.processStatus == "8") {
                            var statusStr = "<font color=\"#FF5450\">待处理</font>";
                        }
                    } else { // APU 机加
                        if (issue.processStatus == "0") {
                            var statusStr = "<font color=\"#FF5450\">待处理</font>";
                        }
                        if (issue.processStatus >= "1" && issue.processStatus <= "6") {
                            var statusStr = "<font color=\"#33CCFF\">处理中</font>";
                        }
                    }
                    if (issue.processStatus == "7") {
                        var statusStr = "<font color=\"#01F155\">关闭</font>";
                    }
                    if (issue.processStatus == "" || issue.processStatus =="-1") {
                        var statusStr = "<font color=\"#01F155\">不规范</font>";
                    }
                    html += "<div id='" + issue.id + "' style='width:94%;height:100px;border-bottom:#666666 1px dashed;'><div style='width:70%; height:40px;float:left;line-height:40px;text-align:left;'>编码：" + issue.number + "</div>" +
                        "<div style='width:30%; float:right;text-align:right;line-height:40px'>状态：" + statusStr + "</div>" +
                        "<div style='width: 78%; height: 60px; float: left; text-align: left'>" +
                        "<div style='width:100%; height:30px;float:right; text-align:left;font-size:14px;overflow:hidden; text-overflow:ellipsis; white-space:nowrap;'>描述：" + desc + "</div>" +
                        "<div style='width:100%; height:25px;float:right; text-align:left;font-size:14px;'>提交时间：" + issue.inputTime + "</div></div>" +
                        "<div class='ok1' style='width:18%;float:right;text-align:center; margin-top: 10px;'>打印</div></div>";
                }
                $("#content").append(html);
            }
        });
        page++;
    }

    /**
     * 点击事件
     */
    mui("#content").on("tap", "div", function () {
        var id = $(this).attr("id"); // 问题id
        // 跳转详情页
        if ($(this).attr("class") != "ok1") {
            location.href = "${webPath}/pad/issue/toEdit?temp=${temp}&id=" + id;
        } else { // 打印
            var id = $(this).parent().attr("id"); // 问题id
            // 查询工号是否绑定打印机
            if ($("#ip").val() != null && $("#ip").val() != "") { // 已绑定打印机
                console.info($("#ip").val());
                printHoldTag(id);
            } else { // 未绑定打印机
                mui.toast("请联系管理员绑定打印机后重试");

                /*mui.prompt('请绑定打印机','请输入打印机IP','系统提示',null,function (e) {
                    if (e.index == 1) {
                        bindPrinter(e.value);
                    }
                },'div');*/
            }
            return false;
        }
    });

    /**
     * 打印待处理标签
     */
    function printHoldTag(id) {
        var index = layer.load(1, {
            shade: [0.1,'#fff'] // 0.1透明度的白色背景
        });
        $.ajax({
            type: "get",
            url: "${webPath}/printer/printHoldTag",
            dataType: "json",
            data: {
                "issueId": id,
                "printerIp": $("#ip").val()
            },
            success: function (result) {
                layer.close(index);
                console.info(result);
                mui.toast(result.msg);
            },
            error: function () {
                layer.close(index);
                mui.toast("打印失败");
            }
        });
    }
</script>
</body>
</html>

