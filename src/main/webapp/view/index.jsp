<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="${resPaht}/view/static/images/favicon.ico" type="image/ico"/>
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

                <br/>

                <!-- sidebar menu -->
                <%@include file="/view/static/common/siderbar.jsp" %>
                <!-- /sidebar menu -->
            </div>
        </div>

        <!-- top navigation -->
        <%@include file="/view/static/common/head.jsp" %>
        <!-- /top navigation -->

        <!-- 内容区开始 -->
        <div class="right_col" role="main">
            <div class="page-title">
                <%--<input type="hidden" name="subSource" id="subSource" value="1">--%>
                <input type="hidden" name="status" id="status" value="0">
                <input type="hidden" name="processState" id="processState" value="">
                <div id="areaDesk" class="row tile_count"
                     <c:if test="${fn:contains(person.belongRole, '2') == true}">style="display: block;" </c:if>
                     <c:if test="${fn:contains(person.belongRole, '2') != true}">style="display: none;"</c:if>>

                    <input type="hidden" name="" id="area">
                    <input id="isRft" type="hidden">
                    <c:forEach items="${map}" var="m">
                        <c:if test="${m.key=='A'}">
                            <div class="col-md-2" style="width:180px;">
                                <div class="count">
                                    <c:if test="${ empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')" class="green">APU&终检待办（0条）</a>
                                    </span>
                                    </c:if>
                                    <c:if test="${ not empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')" class="green">APU&终检待办（${m.value}条）</a>
                                    </span>
                                    </c:if>

                                </div>
                            </div>
                        </c:if>
                        <c:if test="${m.key=='T'}">
                            <div class="col-md-2" style="width:150px;">
                                <div class="count">
                                    <c:if test="${ empty m.value}">
                                        <span style="font-size:14px;font-weight:bold"><a href="#"
                                                                                         onclick="getListByArea('${m.key}')"
                                                                                         class="green">T区待办（0条）</a></span>

                                    </c:if>
                                    <c:if test="${ not empty m.value}">
                                        <span style="font-size:14px;font-weight:bold"><a href="#"
                                                                                         onclick="getListByArea('${m.key}')"
                                                                                         class="green">T区待办（${m.value}条）</a></span>

                                    </c:if>
                                </div>
                            </div>
                        </c:if>
                        <c:if test="${m.key=='M'}">
                            <div class="col-md-2" style="width:150px;">
                                <div class="count">
                                    <c:if test="${ empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')" class="green">机加待办（0条）</a>
                                    </span>
                                    </c:if>
                                    <c:if test="${ not empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')"
                                           class="green">机加待办（${m.value}条）</a>
                                    </span>
                                    </c:if>

                                </div>
                            </div>
                        </c:if>
                        <%--<c:if test="${m.key=='J'}">
                            <div class="col-md-2" style="width:150px;">
                                <div class="count">
                                    <c:if test="${ empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')" class="green">JOB1待办（0条）</a>
                                    </span>
                                    </c:if>
                                    <c:if test="${ not empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')" class="green">JOB1待办（${m.value}条）</a>
                                    </span>
                                    </c:if>

                                </div>
                            </div>
                        </c:if>--%>
                        <c:if test="${m.key=='B'}">
                            <div class="col-md-2" style="width:150px;">
                                <div class="count">
                                    <c:if test="${ empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')" class="green">BIS待办（0条）</a>
                                    </span>
                                    </c:if>
                                    <c:if test="${ not empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')"
                                           class="green">BIS待办（${m.value}条）</a>
                                    </span>
                                    </c:if>

                                </div>
                            </div>
                        </c:if>
                        <c:if test="${m.key=='E'}">
                            <div class="col-md-2" style="width:150px;">
                                <div class="count">
                                    <c:if test="${ empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')" class="green">EQA待办（0条）</a>
                                    </span>
                                    </c:if>
                                    <c:if test="${ not empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')"
                                           class="green">EQA待办（${m.value}条）</a>
                                    </span>
                                    </c:if>

                                </div>
                            </div>
                        </c:if>
                        <c:if test="${m.key=='S'}">
                            <div class="col-md-2" style="width:150px;">
                                <div class="count">
                                    <c:if test="${ empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')" class="green">SQA待办（0条）</a>
                                    </span>
                                    </c:if>
                                    <c:if test="${ not empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')"
                                           class="green">SQA待办（${m.value}条）</a>
                                    </span>
                                    </c:if>

                                </div>
                            </div>
                        </c:if>
                        <%--<c:if test="${m.key=='H'}">
                            <div class="col-md-2" style="width:150px;">
                                <div class="count">
                                    <c:if test="${ empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')" class="green">售后待办（0条）</a>
                                    </span>
                                    </c:if>
                                    <c:if test="${ not empty m.value}">
                                        <span style="font-size:14px;font-weight:bold">
                                        <a href="#" onclick="getListByArea('${m.key}')"
                                           class="green">售后待办（${m.value}条）</a>
                                    </span>
                                    </c:if>

                                </div>
                            </div>
                        </c:if>--%>
                    </c:forEach>
                    <%-- <<div class="col-md-2" style="width:150px;">
                         <div class="count"><span style="font-size:14px; font-weight:bold"><a href="#" onclick="" class="green">A区待办（0条）</a></span>
                         </div>
                     </div>

                     <div class="col-md-2" style="width:150px;">
                         <div class="count"><span style="font-size:14px;"><a href="javascript:void(0)" onclick="" class="green">T区待办（0条）</a></span>
                         </div>
                     </div>
                     <div class="col-md-2" style="width:150px;">
                         <div class="count"><span style="font-size:14px;"><a href="#" onclick=""
                                                                             class="green">机加待办（0条）</a></span></div>
                     </div>
                     <div class="col-md-2" style="width:150px;">
                         <div class="count"><span style="font-size:14px;"><a href="#" onclick=""
                                                                             class="green">JOB1待办（0条）</a></span></div>
                     </div>
                     <div class="col-md-2" style="width:150px;">
                         <div class="count"><span style="font-size:14px;"><a href="#" onclick="" class="green">BIS待办（0条）</a></span>
                         </div>
                     </div>
                     <div class="col-md-2" style="width:150px;">
                         <div class="count"><span style="font-size:14px;"><a href="#" onclick="" class="green">SQA待办（0条）</a></span>
                         </div>
                     </div>
                     <div class="col-md-2" style="width:150px;">
                         <div class="count"><span style="font-size:14px;"><a href="#" onclick="" class="green">EQA待办（0条）</a></span>
                         </div>
                     </div>----%>
                </div>
                <hr>

                <div id="myDesk" class="row tile_count">
                    <div class="col-md-2 col-sm-4 col-xs-6">
                        <div class="count green">
                            <i class="fa fa-calculator"></i>&nbsp;
                            <a onclick="azoneHandle('1,2,3,4,5,6')" href="#" class="green"><b>我的待办</b>&nbsp;
                                <span style="font-size:32px; font-weight:bold;">
                                    ${data.unDealNum}
                                </span> 条
                            </a>
                        </div>
                    </div>
                    <div class="col-md-2">
                        <div class="count">
                            <span style="font-size:14px; font-weight:bold">
                                <a onclick="azoneHandle('7')" href="#" class="green">
                                    <i class="fa fa-check"></i>&nbsp;我的已办</b>&nbsp;
                                    <span style="font-size:32px; font-weight:bold;">${data.closeNum}</span> 条
                                </a>
                            </span>
                        </div>
                    </div>
                    <%--<div class="col-md-2">
                        <div class="count" style="padding-top:18px;"><span style="font-size:14px; font-weight:bold"><a
                                href="#"><i class="fa fa-external-link"></i>&nbsp;我的提交</a></span></div>
                    </div>--%>
                </div>

                <%--各区待办数据展示--%>
                <div id="areatolist" class="row" style="display: none">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>待办列表</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                                </ul>
                                <div class="clearfix"></div>
                            </div>

                            <div class="x_content">
                                <table width="100%" class="table table-bordered table-hover" id="arealist"
                                       style="margin-bottom: 0px;border-bottom: 0px;">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>工厂</th>
                                        <th>问题编号</th>
                                        <th>问题分类</th>
                                        <th>问题描述</th>
                                        <th>提交人</th>
                                        <th>提交时间</th>
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

                <%--我的待办数据展示--%>
                <div id="mytolist" class="row" style="display: block">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>我的列表</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                                </ul>
                                <div class="clearfix"></div>
                            </div>

                            <div class="x_content">
                                <table width="100%" class="table table-bordered table-hover" id="mytodolist"
                                       style="margin-bottom: 0px;border-bottom: 0px;">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>工厂</th>
                                        <th>问题编号</th>
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
        <input id="processStatus" type="hidden" value="1,2,3,4,5,6,8">
        <!-- 内容区结束 -->


        <!-- footer content -->
        <%@include file="/view/static/common/foot.jsp" %>
        <!-- /footer content -->
    </div>
</div>
<%@include file="/view/static/common/core_js.jsp" %>
<script type="text/javascript" src="${resPath}/view/back/bims/js/index.js"></script>
<script type="text/javascript" src="${resPath}/view/back/bims/js/mytodo.js"></script>
<script>
    /*function azoneHandle(status) {
        alert(status);
        $("#areatolist").css("display", "none");
        $("#mytolist").css("display", "block");
        $("#processStatus").val(status);
        // mytodolistInit(mytodo);
    }*/
</script>
<script type="text/javascript">
    $(document).ready(
        function () {
            mytodolistInit(mytodo);
            var roles = "${person.belongRole}";
            if (roles != null && roles.indexOf("2") != -1) {
                areatolistInit(area);
            }
        }
    );
    // $(document).ready(
    //     function () {
    //         areatolistInit(area);
    //     }
    // );

    //页面加载完成，点击加载我的代办数据模拟点击
    // $(function () {
    //     setTimeout(function () {
    //         // IE
    //         if (document.all) {
    //             document.getElementById("mydo").click();
    //         }
    //         // 其它浏览器
    //         else {
    //             var e = document.createEvent("MouseEvents");
    //             e.initEvent("click", true, true);
    //             document.getElementById("mydo").dispatchEvent(e);
    //         }
    //     }, 100);
    // })


    //初始化各区待办数据
    /*  $(function () {
          var tags = new Array("A区待办", "T区待办", "机加待办", "JOB1待办", "BIS待办", "EQA待办", "SQA待办", "售后待办");
          var html = "";
          var count = 1;

          $.ajax({
              type : "POST",
              dataType : "json",
              url : '${webPath}/bims/desk/getDeskByArea',
            data : {
            },
            success : function(result) {*/
    /* if(result.obj.length==0){
         for (var i = 0; i < tags.length; i++) {
             html += '<div class="col-md-2" style="width:150px;">'
                 + '<div class="count"><span style="font-size:14px;"><a href="#" onclick="" class="green">'+tags[i]+'(0)条</a>'
                 + '</div>'
                 + '</div>'
             count++;
         }
         $("#areaDesk").append(html);
     }else {
         for (var i = 0; i < result.obj.length; i++) {
             var type =  result.obj[i].quality_type;
             var person = "${person}";
                        if (type=="A"){
                            html += '<div class="col-md-2" style="width:150px;">'
                                + '<div class="count"><span style="font-size:14px;"><a href="#" onclick=getListByArea("'+type+'")  class="green">A区待办 (' + result.obj[i].counts+ ')条</a>'
                                + '</div>'
                                + '</div>';
                        }
                        if (type=="T"){
                            html += '<div class="col-md-2" style="width:150px;">'
                                + '<div class="count"><span style="font-size:14px;"><a href="#" onclick=getListByArea("'+type+'") class="green">T区待办 (' + result.obj[i].counts+ ')条</a>'
                                + '</div>'
                                + '</div>';
                        }
                        if (type=="M"){
                            html += '<div class="col-md-2" style="width:150px;">'
                                + '<div class="count"><span style="font-size:14px;"><a href="#" onclick=getListByArea("'+type+'") class="green">机加待办 (' + result.obj[i].counts+ ')条</a>'
                                + '</div>'
                                + '</div>';
                        }
                        if (type=="J"){
                            html += '<div class="col-md-2" style="width:150px;">'
                                + '<div class="count"><span style="font-size:14px;"><a href="#" onclick=getListByArea("'+type+'") class="green">JOB1待办 (' + result.obj[i].counts+ ')条</a>'
                                + '</div>'
                                + '</div>';
                        }
                        if (type=="B"){
                            html += '<div class="col-md-2" style="width:150px;">'
                                + '<div class="count"><span style="font-size:14px;"><a href="#" onclick=getListByArea("'+type+'") class="green">BIS待办 (' + result.obj[i].counts+ ')条</a>'
                                + '</div>'
                                + '</div>';
                        }
                        if (type=="E"){
                            html += '<div class="col-md-2" style="width:150px;">'
                                + '<div class="count"><span style="font-size:14px;"><a href="#" onclick=getListByArea("'+type+'") class="green">EQA待办 (' + result.obj[i].counts+ ')条</a>'
                                + '</div>'
                                + '</div>';
                        }
                        if (type=="S"){
                            html += '<div class="col-md-2" style="width:150px;">'
                                + '<div class="count"><span style="font-size:14px;"><a href="#" onclick=getListByArea("'+type+'") class="green">SQA待办 (' + result.obj[i].counts+ ')条</a>'
                                + '</div>'
                                + '</div>';
                        }

                    }
                    $("#areaDesk").append(html);
                }*/

    /* },
     error : function() {
         for (var i = 0; i < tags.length; i++) {
             html += '<div class="col-md-2" style="width:150px;">'
                 + '<div class="count"><span style="font-size:14px;"><a href="#" onclick="" class="green">'+tags[i]+'(0)条</a>'
                 + '</div>'
                 + '</div>'
             count++;
         }
         $("#areaDesk").append(html);
     }*/
    /*  });

  })
*/
    //我的待办数据
   /* $(function getMyDesk() {
        var tags = new Array("我的待办", "我的已办");
        var html = "";
        var count = 1;

        $.ajax({
            type: "POST",
            dataType: "json",
            url: '${webPath}/bims/desk/getMyDesk',
            data: {},
            success: function (result) {*/
                // if (result.obj.length == 0) {
                //     for (var i = 0; i < tags.length; i++) {
                //         html += '<div class="col-md-2 col-sm-4 col-xs-6">'
                //             + '<div class="count green">'
                //             + '<i class="fa fa-external-link"></i>&nbsp;<a href="#"  id="aaaa" class="green"><b>' + tags[i] + '</b>&nbsp;<span id="mydo" style="font-size:32px; font-weight:bold;">0</span> 条</a>'
                //             + '</div>'
                //             + '</div>';
                //         count++;
                //     }
                //     $("#myDesk").append(html);
                // } else {
                //     for (var i = 0; i < result.obj.length; i++) {
                //         // var status =  result.obj[i].process_status;
                //         var status = parseInt(result.obj[i].process_status)
                //         if (status > 0 && status < 8) {
                //             status="1,2,3,4,5,6,7,8"
                //             html += '<div class="col-md-2 col-sm-4 col-xs-6">'
                //                 + '<div class="count green">'
                //                 + '<i class="fa fa-calculator"></i>&nbsp;<a href="#" id="mydo" class="green" onclick=getMyDesk("' + status + '")><b>我的待办</b>&nbsp;<span id="aaa" style="font-size:32px; font-weight:bold;">(' + result.obj[i].counts + ')</span> 条</a>'
                //                 + '</div>'
                //                 + '</div>';
                //         } else if (status > 8) {
                //             html += '<div class="col-md-2 col-sm-4 col-xs-6">'
                //                 + '<div class="count green">'
                //                 + '<i class="fa fa-check"></i>&nbsp;<a href="#" class="green" onclick=getMyDesk("' + status + '")><b>我的已办</b>&nbsp;<span style="font-size:32px; font-weight:bold;">(' + result.obj[i].counts + ')</span> 条</a>'
                //                 + '</div>'
                //                 + '</div>';
                //         }
                //
                //     }
                //     $("#myDesk").append(html);
                // }
           /* },
            error: function () {*/
                /*for (var i = 0; i < tags.length; i++) {
                    html += '<div class="col-md-2 col-sm-4 col-xs-6">'
                        + '<div class="count green">'
                        + '<i class="fa fa-external-link"></i>&nbsp;<a href="#" class="green"><b>' + tags[i] + '</b>&nbsp;<span style="font-size:32px; font-weight:bold;">0</span> 条</a>'
                        + '</div>'
                        + '</div>';
                    count++;
                }
                $("#myDesk").append(html);*/
        /*    }
        });*/

   /* })*/
</script>
</body>
</html>

