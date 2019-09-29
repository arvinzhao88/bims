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

<body  style="background: white">

<div class="container body">
    <%--<div class="main_container">--%>
        <%--<div class="clearfix">--%>

            <%--<div class="row">--%>
                <%--<div class="col-md-12 col-sm-12 col-xs-12">

                </div>--%>

                <div class="x_panel" style="width:100%;float:left; margin-right:10px;">

                    <!--卡片工具开始-->
                    <div class="x_content">
                        <%--<form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">--%>
                        <div class="form-group">
                            <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                <%--<ul id="myTab1" class="nav nav-tabs bar_tabs right" role="tablist">--%>
                                    <%--<li role="presentation" class="active"><a href="#tab_content11"
                                                                              id="home-tabb" role="tab"
                                                                              data-toggle="tab"
                                                                              aria-controls="home"
                                                                              aria-expanded="true">CAR</a></li>
                                    <li role="presentation" class=""><a href="#tab_content22" role="tab"
                                                                        id="profile-tabb" data-toggle="tab"
                                                                        aria-controls="profile"
                                                                        aria-expanded="false">SCAR</a></li>--%>
                                  <%--  <li role="presentation" class="active"><a href="#tab_content33" id="home-tabb"
                                                                              role="tab" data-toggle="tab"
                                                                              aria-controls="home"
                                                                              aria-expanded="true">7 STEP</a></li>--%>
                                    <%--<li role="presentation" class=""><a href="#tab_content44" role="tab"
                                                                        id="profile-tabb" data-toggle="tab"
                                                                        aria-controls="profile"
                                                                        aria-expanded="false">Notification</a>
                                    </li>--%>
                                </ul>


                                <!--Car表单工具开始-->
                                <div id="myTabContent2" class="tab-content">
                                    <!--7 STEP分段附件结束-->
                                    <form id="form1" name="form1" method="post">
                                        <input type="hidden" name="id" value="${toolsSevenSteps.id}">
                                        <input type="hidden" name="issueId" value="${toolsSevenSteps.issueId}">
                                        <input type="hidden" name="back1" value="${toolsSevenSteps.back1}">
                                        <input type="hidden" name="back2" value="${toolsSevenSteps.back2}">
                                        <table width="100%" class=" table table-hover table-bordered" >
                                            <tr><td colspan="4">
                                                <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> SCAR &nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-clock-o green"></i> 截至日期：24小时</div>
                                               <%-- <div style="color:#5A738E; float:right;">${sessionScope.person.name}</div>--%>
                                            </td></tr>
                                            <tr><td colspan="4">
                                                <div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                    <p style="text-align: left;font-size: 15px"><span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;1&nbsp;</span>&nbsp;
                                                        Identify the problem.识别问题(5W2H).</p>
                                                    <textarea  style="float:left"  name="sevenstepDesc" rows="2" disabled="disabled" class="form-control" id="message" required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100">${toolsSevenSteps.sevenstepDesc}</textarea>
                                                </div>
                                                <div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                    <p style="text-align: left;font-size: 15px">  <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;2&nbsp;</span>&nbsp;
                                                        Identify and Rank Assignable Causes.识别和排列必然原因 (FTA, Fishbone, Pareto)。</p>
                                                </div>
                                                <div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                    <p style="text-align: left;font-size: 15px"><span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;3&nbsp;</span>&nbsp;
                                                        Take Short Term Action.采取短期措施。</p>
                                                </div>
                                            </td></tr>
                                            <tr>
                                                <c:if test="${ not empty toolsSevenSteps.attmentTwo}">
                                                <td colspan="4">
                                                        <%--<i class="fa fa fa-file-text"
                                                           style="font-size:30px;vertical-align:middle;"></i>&nbsp;--%>

                                                    <a href="${uploadUrl}${toolsSevenSteps.attmentTwo}" download target="_blank">下载附件一</a>
                                                        <%-- <button id="yyzz" type="button" class="btn btn-default btn-sm";">
                                                             下载附件
                                                         </button>--%>
                                                        <%--<button id="yyzz" type="button" class="btn btn-default btn-sm" onclick="$('#YYZZFBSMJ').click();">
                                                            上传附件
                                                        </button>--%>
                                                    <input type="hidden"  name="attmentThree" id="setp2file" style="display: none;">
                                                    <input type="file" name="YYZZFBSMJ" id="YYZZFBSMJ" style="display: none;" onchange="fileType()">
                                                    <p id="fileName" ></p >
                                                </td>
                                                </c:if>
                                            <tr><td width="20%">Target Date 目标日期</td>
                                                <td width="30%"></i> <fmt:formatDate value="${toolsSevenSteps.targetdate1}" pattern="yyyy-MM-dd"/></td><td width="20%">Complete Date 完成日期</td>
                                                <c:if test="${empty toolsSevenSteps.completedate1}">
                                                <td width="30%"></td></tr>
                                            </c:if>
                                            <c:if test="${ not empty toolsSevenSteps.completedate1}">
                                                <td width="30%"><fmt:formatDate value="${toolsSevenSteps.completedate1}" pattern="yyyy-MM-dd"/></td></tr>

                                                </td>
                                            </c:if>
                                            </td>

                                            <%-- <td colspan="2">
                                                 <i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>--%>
                                            </tr>
                                            <%--<tr><td width="20%">Target Date 目标日期</td>
                                                <td width="30%"><i class="fa fa-history"></i> 倒计时：23:15:10</td><td width="20%">Complete Date 完成日期</td><td width="30%">处理中（以完成系统时间为准）</td></tr>--%>
                                        </table>

                                        <!--按钮-->
                                        <%--     <div class="form-group">
                                                 <div style="text-align:center;">
                                                     <button class="btn btn-danger" type="reset" data-toggle="modal" data-target=".this-no">驳回</button> &nbsp;&nbsp;
                                                     <button class="btn btn-primary" type="reset"   onclick="submitData()"  data-toggle="modal" data-target=".this-go">下一步</button>
                                                 </div>
                                             </div>--%>

                                        <!--7 STEP分段附件结束-->
                                        <c:if test="${ not empty toolsSevenSteps.targetdate2}">
                                        <table width="100%" class="table table-hover table-bordered" >
                                            <tr><td colspan="4">
                                                <div style="font-size:16px; color:#5A738E; float:left;"><i class="fa fa-file-text"></i> SCAR &nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-clock-o green"></i> 截至日期：30天</div>
                                               <%-- <div style="color:#5A738E; float:right;">${sessionScope.person.name}</div>--%>
                                            </td></tr>
                                            <tr><td colspan="4">
                                                <div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                    <p style="text-align: left;font-size: 15px"> <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;4&nbsp;</span>&nbsp;
                                                        Determine Assignable Cause(s).确定必然原因(FTA.Fishbone.Pareto)。</p>
                                                </div>
                                                <div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                    <p style="text-align: left;font-size: 15px">   <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;5&nbsp;</span>&nbsp;
                                                        Select and Verify the Solution.选择和验证解决方案。</p>
                                                </div>
                                                <div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                    <p style="text-align: left;font-size: 15px">  <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;6&nbsp;</span>&nbsp;
                                                        Implement Permanent Solution.实施永久解决方案。</p>
                                                </div>

                                            </td></tr>
                                            <tr>
                                                <c:if test="${ not empty toolsSevenSteps.attmentThree}">
                                                <td colspan="4">
                                                        <%--<i class="fa fa-file-text" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">上传附件</button>--%>
                                                    <a href="${uploadUrl}${toolsSevenSteps.attmentThree}" download target="_blank">下载附件二</a>
                                                        <%--<i class="fa fa fa-file-text"
                                                           style="font-size:30px;vertical-align:middle;"></i>&nbsp;
                                                        <button id="yyzz" type="button" class="btn btn-default btn-sm" onclick="$('#YYZZFBSMJ').click();">
                                                            上传附件
                                                        </button><input type="hidden"  id="setp2file" style="display: none;">
                                                        <input type="file" name="YYZZFBSMJ" id="YYZZFBSMJ" style="display: none;" onchange="fileType()">
                                                        <p id="fileName2" ></p >--%>

                                                </td>
                                                    <%--<td colspan="2">
                                                        <i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>--%>
                                            </tr>
                                            </c:if>
                                            <tr><td width="20%">Target Date 目标日期</td>
                                                <td width="30%"></i> <fmt:formatDate value="${toolsSevenSteps.targetdate2}" pattern="yyyy-MM-dd"/></td><td width="20%">Complete Date 完成日期</td>
                                                <c:if test="${empty toolsSevenSteps.completedate2}">
                                                <td width="30%"></td></tr>
                                            </c:if>
                                            <c:if test="${ not empty toolsSevenSteps.completedate2}">
                                                <td width="30%"><fmt:formatDate value="${toolsSevenSteps.completedate2}" pattern="yyyy-MM-dd"/></td></tr>

                                                </td>
                                            </c:if>
                                            </td>

                                            <%-- <td colspan="2">
                                                 <i class="fa fa-edit" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target=".this-shenpi">处理审核</button></td>--%>
                                            </tr>
                                                <%--<tr><td width="20%">Target Date 目标日期</td>
                                                    <td width="30%"><i class="fa fa-history"></i> 倒计时：29天 22:15:38</td><td width="20%">Complete Date 完成日期</td><td width="30%">处理中（以完成系统时间为准）</td></tr>--%>
                                        </table>
                                        </c:if>
                                        <c:if test="${ not empty toolsSevenSteps.targetdate3}">
                                        <table width="100%" class="table table-hover table-bordered" >
                                            <tr><td colspan="4">

                                                <div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                    <p style="text-align: left;font-size: 15px">  <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;7.1&nbsp;</span>&nbsp;
                                                        Seven-step report upload 七步法报告上传。&nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-clock-o green"></i> 截至日期：7天</p>
                                                </div>

                                            </td>
                                            </tr>
                                            <c:if test="${not empty toolsSevenSteps.attmentSeven}">
                                           <td colspan="4">
                                            <%--<i class="fa fa-file-text" style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button type="button" class="btn btn-default btn-sm">上传附件</button>--%>
                                            <a href="${uploadUrl}${toolsSevenSteps.attmentSeven}" download target="_blank">下载附件三</a>
                                            <%--<i class="fa fa fa-file-text"
                                               style="font-size:30px;vertical-align:middle;"></i>&nbsp;
                                            <button id="yyzz" type="button" class="btn btn-default btn-sm" onclick="$('#YYZZFBSMJ').click();">
                                                上传附件
                                            </button><input type="hidden"  id="setp2file" style="display: none;">
                                            <input type="file" name="YYZZFBSMJ" id="YYZZFBSMJ" style="display: none;" onchange="fileType()">
                                            <p id="fileName2" ></p >--%>

                                            </td>
                                            </c:if>
                                            <tr>
                                            <tr><td width="20%">Target Date 目标日期</td>
                                                <td width="30%"></i> <fmt:formatDate value="${toolsSevenSteps.targetdate3}" pattern="yyyy-MM-dd"/></td><td width="20%">Complete Date 完成日期</td>
                                                <c:if test="${empty toolsSevenSteps.completedate3}">
                                                <td width="30%"></td></tr>
                                            </c:if>
                                            <c:if test="${ not empty toolsSevenSteps.completedate3}">
                                                <td width="30%"><fmt:formatDate value="${toolsSevenSteps.completedate3}" pattern="yyyy-MM-dd"/></td></tr>

                                                </td>
                                            </c:if>

                                        </table>
                                        </c:if>

                                        <%---------------------------------------------------%>
                                        <c:if test="${ not empty toolsSevenSteps.mqv}" >
                                        <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                               style="border-collapse:separate;border-spacing:15px;">
                                            <tr><td colspan="4">

                                                <div class="form-group" style="font-size:14px;border-bottom:1px #F2F2F2 dashed;">
                                                    <p style="text-align: left;font-size: 15px">  <span style="border-radius:30%;color:#FFFFFF;background-color:#009688;padding:2px;">&nbsp;7.2&nbsp;</span>&nbsp;
                                                        supervisory control   监控。</p>
                                                </div>

                                            </td></tr>
                                            <tr>
                                                <td width="20%" align="right" style="width:17%">检查文件：
                                                </td>
                                                <td colspan="4">

                                                    <input type="checkbox" class="flat" name="checkFile" disabled
                                                           <c:if test="${fn:contains(toolsSevenSteps.checkFile,1)}">checked="checked"</c:if>
                                                           id="genderM" value="1"  required/>&nbsp;PFMEA&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <input type="checkbox" class="flat" name="checkFile" disabled
                                                           <c:if test="${fn:contains(toolsSevenSteps.checkFile,2)}">checked="checked"</c:if>
                                                           id="genderM2" value="2"/>&nbsp;CP 控制计划&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <input type="checkbox" class="flat" name="checkFile" disabled
                                                           <c:if test="${fn:contains(toolsSevenSteps.checkFile,3)}">checked="checked"</c:if>
                                                           id="genderM" value="3"/>&nbsp;WI&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <input type="checkbox" class="flat" name="checkFile" disabled
                                                           <c:if test="${fn:contains(toolsSevenSteps.checkFile,4)}">checked="checked"</c:if>
                                                           id="genderM" value="4"/>&nbsp;TPM
                                                </td>
                                            </tr>
                                            <tr>
                                                <td align="right">ESN From：</td>
                                                <td><input type="text" id="first-name17"
                                                           required="required" class="form-control" name="esnFrom" value="${toolsSevenSteps.esnFrom}" disabled="disabled"
                                                           placeholder="手工输入"></td>
                                                <td width="5%" align="right">TO：</td>
                                                <td><input type="text" id="first-name15"
                                                           required="required" class="form-control" name="to1" value="${toolsSevenSteps.to1}" disabled="disabled"
                                                           placeholder="手工输入"></td>
                                                <td width="10%" align="right">NCM QTY：</td>
                                                <td align="right"><input type="text" id="first-name18" name="numQty" value="${toolsSevenSteps.numQty}" disabled="disabled"
                                                                         required="required"
                                                                         class="form-control"
                                                                         placeholder="手工输入"></td>
                                            </tr>
                                            <tr>
                                                <td align="right">Date From：</td>
                                                <td><input type="text" id="first-name17" name="datefrom"  value="${toolsSevenSteps.datefrom}" disabled="disabled"
                                                           required="required" class="form-control"
                                                           placeholder="手工输入"></td>
                                                <td align="right">TO：</td>
                                                <td><input type="text" id="first-name19" name="to2"  value="${toolsSevenSteps.to2}" disabled="disabled"
                                                           required="required" class="form-control"
                                                           placeholder="手工输入"></td>
                                                <td align="right">NCM QTY：</td>
                                                <td align="right"><input type="text" id="first-name20" name="numQty2" value="${toolsSevenSteps.numQty2}" disabled="disabled"
                                                                         required="required"
                                                                         class="form-control"
                                                                         placeholder="手工输入"></td>
                                            </tr>
                                            <tr>
                                                <td align="right">MQV：</td>
                                                <td colspan="4"><input type="text" id="first-name21" name="mqv" value="${toolsSevenSteps.mqv}" disabled="disabled"
                                                                       required="required"
                                                                       class="form-control"
                                                                       placeholder="手工输入"></td>
                                            </tr>
                                        </table>


                                        </c:if>


                                        <%----------------------------------------------------%>
                                        <form/>
                                        <!--按钮-->

                                      <%--  <div class="form-group">
                                            <div style="text-align:center;">
                                                &lt;%&ndash;<button class="btn btn-danger" type="button" data-toggle="modal" data-target=".this-no">驳回</button>&ndash;%&gt;
                                                &lt;%&ndash;<button class="btn btn-primary"  onclick="submitData()" type="button" data-toggle="modal" data-target=".this-go">处理完成</button>&ndash;%&gt;
                                            </div>
                                        </div>--%>
                                </div>

                            </div>
                        </div>
                        <%--</form>--%>
                    </div>
                    <!--卡片工具完成-->
                </div>


            <%--</div>--%>
        <%--</div>--%>
       <%-- <div class="col-md-3 left_col">
            <div class="left_col scroll-view">

                <%@include file="/view/static/common/sysinfo.jsp" %>

                <!-- 侧导航开始 -->
                <%@include file="/view/static/common/siderbar.jsp" %>
                <!-- /测导航结束 -->
            </div>
        </div>

        <!-- 顶部开始 -->
        <%@include file="/view/static/common/head.jsp" %>--%>
        <!-- 顶部结束 -->

        <!-- 内容区开始 -->
        <%--<div class="right_col" role="main">--%>


     <%--   <!-- 内容区开始 -->
        <div class="right_col" role="main">
           &lt;%&ndash; <div class="page-title">
                <div class="title_left"><h3>A区 问题处理</h3></div>
            </div>&ndash;%&gt;


        </div>--%>

    <%--</div>--%>
        <!-- 内容区结束 -->
    <div class="modal fade this-no" tabindex="-1" role="dialog" aria-hidden="true" >
        <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
            <div class="modal-content">

                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                    <h4 class="modal-title" id="myModalLabel">系统提示</h4>
                </div>
                <div class="modal-body">
                    <p>请输入驳回原因：</p>
                    <textarea name="back4" rows="4" class="form-control"  required="required" data-parsley-trigger="keyup" data-parsley-minlength="20" data-parsley-maxlength="100" placeholder="请输入"></textarea>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger"  onclick="reject()"  data-dismiss="modal">驳回</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>
            </div>
        </div>
    </div>
        <!-- 页脚开始 -->
       <%-- <%@include file="/view/static/common/foot.jsp" %>--%>
        <!-- 页脚结束 -->
    </div>
</div>


<!-- 遮蔽内容结束 -->
<%@include file="/view/static/common/core_js.jsp" %>
<script>


    function  reject() {
        console.log($('#form1').serialize());
        $.ajax({
            url: "${resPath}/toolsSevenSteps/updateSevenStepfive",
            type: "post",
            data: $('#form1').serialize(),
            success: function (data) {
                console.log(data)
                window.parent.close();
            }
        });


    }

   function  submitData() {
        console.log($('#form1').serialize());
        $.ajax({
            url: "${resPath}/toolsSevenSteps/jumpSevenStepsixupdate",
            type: "post",
            data: $('#form1').serialize(),
            success: function (data) {
                window.location.href="${webPath}/toolsSevenSteps/last/"+data.obj;
            }
        });
    }


    layui.use('upload', function() {
        var $ = layui.jquery ,
            upload = layui.upload;
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test1'
            , url: '${upUrl}'
            , accept: 'file' //普通文件
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $("#fileName").text(file.name);
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                console.log(res)
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                $("#apprDoc").val(res.imgPath);
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
    });


    //附件上传
    function fileType(file){
        var formData = new FormData();
        formData.append("file",$('#YYZZFBSMJ')[0].files[0]);
        console.log($('#YYZZFBSMJ')[0].files[0])
        $.ajax({
            type: 'post',
            //url: "http://test.cncnews.cn/wup/webUploader?myPath=bims",
            url: "${webPath}/uploadFile/uploader",
            data: formData,
            dataType: "json",
            cache: false,
            processData: false,
            contentType: false,
        }).success(function (data) {
            console.log(data.imgPath);
            $("#setp2file").val(data.imgPath);
            $("#fileName2").text($('#YYZZFBSMJ')[0].files[0].name);
        }).error(function () {
            return layer.msg('上传失败');
        });
    }
</script>
</body>
</html>
