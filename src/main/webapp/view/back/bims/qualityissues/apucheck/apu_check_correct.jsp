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
            /*text-align: center;*/
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

        label.error{color: red;}
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

            <div class="page-title">
                <div class="title_left"><h3>APU&终检</h3></div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>问题修正</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                            </ul>

                            <div class="clearfix"></div>
                        </div>

                        <div class="x_content">
                            <div class="x_content">
                                <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                                    <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                           style="border-collapse:separate;border-spacing:15px;">
                                        <input type="hidden" id="qualityType" name="qualityType" required="required"
                                               class="form-control" value="${issue.qualityType}">
                                        <tr>
                                            <td width="15%" align="right" style="text-align: right"><strong>Plant/工厂： <font color='red'>*</font></strong></td>
                                            <td width="35%">
                                                <select name="plant" id="plant" class="form-control" required>
                                                    <%--<option>请选择</option>
                                                    <option>ISF</option>
                                                    <option>ISG</option>--%>
                                                </select>
                                            </td>
                                            <td width="15%" align="right" style="text-align: right"><strong>OP/工位： <font color='red'>*</font></strong></td>
                                            <td width="35%">
                                                <input type="text" id="issueStation" name="issueStation"
                                                       required="required" class="form-control"
                                                       value="${issue.issueStation}" placeholder="请输入工位" required>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Area/区域： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select name="area" id="area" class="form-control" required>
                                                    <%--<option>请选择</option>
                                                    <option>2.8A1</option>
                                                    <option>2.8A2</option>
                                                    <option>2.8A3</option>
                                                    <option>2.8A4</option>
                                                    <option>2.8A5</option>--%>
                                                </select>
                                            </td>
                                            <td align="right" style="text-align: right"><strong>Failure Location/失效位置： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="failureLocation" name="failureLocation"
                                                        class="form-control" required>

                                                </select>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Series No./序列号： <font color='red'>*</font></strong></td>
                                            <td>
                                                <input type="text" id="seriesNo" name="seriesNo"
                                                       required="required" class="form-control"
                                                       value="${issue.seriesNo}" required>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Issue Description/具体问题描述： <font color='red'>*</font></strong></td>
                                            <td colspan="3"><textarea id="issueDesc" name="issueDesc" cols="200"
                                                                      rows="2" class="form-control"
                                                                      placeholder="请输入说明" required>${issue.issueDesc}</textarea>
                                            </td>
                                        </tr>


                                        <%--<tr>
                                            <td align="right">&nbsp;</td>
                                            <td>&nbsp;</td>
                                        </tr>

                                        <tr>
                                            <td colspan="4" align="center" style="border-top: #CCCCCC 1px dashed; height:1px;">
                                                说明：质量分类选2择整机缺陷、3过程缺陷，显示以下内容
                                            </td>
                                        </tr>--%>
                                        <td align="right" style="text-align: right"><strong>Issue Category L1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level1： <font color='red'>*</font></strong></td>
                                        <td>
                                            <select id="issueCategoryL1" name="issueCategoryL1"
                                                    class="form-control" required>
                                                <option value="">请选择</option>
                                                <%--<option value="1"
                                                        <c:if test="${'1' eq issue.issueCategoryL1}">selected</c:if>>
                                                    自制件
                                                </option>--%>
                                                <option value="2"
                                                        <c:if test="${'2' eq issue.issueCategoryL1}">selected</c:if>>
                                                    采购件
                                                </option>
                                                <option value="3"
                                                        <c:if test="${'3' eq issue.issueCategoryL1}">selected</c:if>>
                                                    在制发动机
                                                </option>
                                            </select>
                                        </td>
                                        <tr id="d1" style="display:none;">
                                            <td align="right" style="text-align: right"><strong>ESN ： <font color='red'>*</font></strong></td>
                                            <td>
                                                <%--<input id="esn" name="esn" value="${issue.esn}" class="form-control"
                                                       style="width:45%;float:left;">
                                                <select class="form-control" name="so" id="so"
                                                        style="width:50%; float:right;">
                                                    <option>请选择</option>
                                                    <option
                                                            <c:if test="${'1' eq issue.so}">selected</c:if> >SO1
                                                    </option>
                                                    <option
                                                            <c:if test="${'2' eq issue.so}">selected</c:if> >SO2
                                                    </option>
                                                </select>--%>
                                                    <select class="form-control" name="esn" id="esn" required class="form-control" required>
                                                        <c:if test="${not empty issue.esn}">
                                                            <option value="${issue.esn}">${issue.esn}</option>
                                                        </c:if>
                                                    </select>
                                            </td>

                                            <td align="right" style="text-align: right"><strong>SO ： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="so" name="so" required="required"
                                                       class="form-control col-md-7" value="${issue.so}"
                                                       placeholder="SO"></td>
                                        </tr>

                                        <tr id="d2" style="display:none;">
                                            <td align="right" style="text-align: right"><strong>Engine Type/机型： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="engineType" name="engineType" required="required"
                                                       class="form-control col-md-7"
                                                       value="${issue.engineType}"></td>
                                            <td align="right" style="text-align: right"><strong>VPI Project/项目号： <font color='red'>*</font></strong></td>
                                            <td>
                                                <input type="text" id="projectNo" name="projectNo" required="required"
                                                       class="form-control col-md-7"
                                                       value="${issue.projectNo}">
                                                <%--<select name="projectNo" id="projectNo" class="form-control">
                                                <option>请选择</option>
                                                <option
                                                        <c:if test="${'1' eq issue.projectNo}">selected</c:if> >项目1
                                                </option>
                                                <option
                                                        <c:if test="${'2' eq issue.projectNo}">selected</c:if> >项目2
                                                </option>
                                                <option
                                                        <c:if test="${'3' eq issue.projectNo}">selected</c:if> >项目3
                                                </option>
                                            </select>--%>
                                            </td>
                                            <%--<td align="right"><strong>发动机系列： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="engineSeries" name="engineSeries"
                                                       required="required" class="form-control col-md-7"
                                                       value="${issue.engineSeries}"></td>--%>
                                        </tr>
                                        <%--<tr>
                                            <td colspan="4" align="center" style="border-top: #CCCCCC 1px dashed; height:1px;">
                                                说明：质量分类选1零件质量，显示以下内容
                                            </td>
                                        </tr>--%>
                                        <tr id="d3" style="display:none;">
                                            <td align="right" style="text-align: right"><strong>Part Number/零件号： <font color='red'>*</font></strong></td>
                                            <td>
                                                <%--<input type="text" id="partNo" name="partNo" required="required"
                                                       class="form-control" value="${issue.partName}">--%>
                                                <select name="partNo" id="partNo" class="form-control" required>
                                                    <c:if test="${not empty issue.partNo}">
                                                        <option value="${issue.partNo}">${issue.partNo}</option>
                                                    </c:if>
                                                </select>
                                            </td>
                                            <td align="right" style="text-align: right"><strong>Part Name/零件名称： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="partName" name="partName" required="required"
                                                       class="form-control" value="${issue.partName}"></td>
                                        </tr>

                                        <tr id="d4" style="display:none;">
                                            <td align="right" style="text-align: right"><strong>Supplier Code/供应商代码： <font color='red'>*</font></strong></td>
                                            <td>
                                                <%--<input type="text" id="vendorCode" name="vendorCode" required="required"
                                                       class="form-control col-md-7" value="${issue.vendorCode}">--%>
                                                <select <%--name="vendorCode"--%> id="vendorCode" class="form-control col-md-7" required>
                                                    <c:if test="${not empty issue.vendorCode}">
                                                        <option value="${issue.vendorName}">${issue.vendorCode}</option>
                                                    </c:if>
                                                </select>
                                                    <input type="hidden" id="vendorCodeNew" name="vendorCode" <c:if test="${not empty issue.vendorCode}">value="${issue.vendorCode}"</c:if>>
                                            </td>
                                            <td align="right" style="text-align: right"><strong>Supplier Name/供应商名称： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="vendorName" name="vendorName" required="required"
                                                       class="form-control col-md-7" value="${issue.vendorName}" placeholder="供应商名称"></td>
                                        </tr>

                                        <%--<tr>
                                            <td colspan="4" align="right" style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>--%>

                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Failure Qty./数量： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="qty" name="qty" required="required"  onblur="check(this)" onkeyup="this.value=this.value.replace(/[^0-9.]/g,'')"
                                                       class="form-control col-md-7"
                                                       value="${issue.qty}"></td>
                                            <td align="right" style="text-align: right"><strong>Attach./照片附件： </strong></td>
                                            <td class="list-img">
                                                <ul id="preview" class="clear">
                                                    <li class="fl">
                                                        <img src="${resPath}/view/static/images/icon_upload.png">
                                                        <input id="fileImage" type="file" name="file" multiple/>
                                                        <%--<div class="num">0/6</div>--%>
                                                    </li>
                                                </ul>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Issue Category L2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level2： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="issueCategoryL2" name="issueCategoryL2" required
                                                        class="form-control">
                                                    <%--<option>请选择</option>
                                                    <option>尺寸问题</option>
                                                    <option>外观问题</option>
                                                    <option>原料问题</option>--%>
                                                </select>
                                            </td>
                                            <td align="right" style="text-align: right"><strong>Issue Category L3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level3： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="issueCategoryL3" name="issueCategoryL3" required
                                                        class="form-control">
                                                    <%--<option>请选择</option>
                                                    <option>异物</option>
                                                    <option>理化</option>
                                                    <option>颗粒度</option>--%>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>RFT： <font color='red'>*</font></strong></td>
                                            <td><select name="isRft" id="isRft" class="form-control" required>
                                                <option value="">- 请选择 -</option>
                                                <option value="1" <c:if test="${'1' eq issue.isRft}">selected</c:if>>是
                                                </option>
                                                <option value="2" <c:if test="${'2' eq issue.isRft}">selected</c:if>>否
                                                </option>
                                            </select></td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>是否批量： <font color='red'>*</font></strong></td>
                                            <td><select name="issueCategoryL1Name" id="issueCategoryL1Name" class="form-control" required>
                                                <option value="">- 请选择 -</option>
                                                <option value="1" <c:if test="${'1' eq issue.issueCategoryL1Name}">selected</c:if>>是
                                                </option>
                                                <option value="2" <c:if test="${'2' eq issue.issueCategoryL1Name}">selected</c:if>>否
                                                </option>
                                            </select></td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Comments/备注：</strong></td>
                                            <td colspan="3"><textarea id="comments" name="comments" cols="200" rows="2"
                                                                      class="form-control"
                                                                      placeholder="请输入备注">${issue.comments}</textarea>
                                            </td>
                                        </tr>
                                    </table>
                                    <%@include file="/view/static/common/img.jsp" %>
                                    <input type="hidden" id="attach" name="attach" required="required"
                                           class="form-control col-md-7" value="${issue.attach}">
                                    <div class="ln_solid"></div>
                                    <div class="form-group">
                                        <div style="text-align:center">
                                            <%--<button class="btn btn-success" type="button" data-toggle="modal"
                                                    data-target=".this-true" onclick="updIssue()">保存
                                            </button>--%>
                                            <button class="btn btn-primary" type="button" data-toggle="modal"
                                                    <%--data-target=".this-true"--%> onclick="checkNull()">确认
                                            </button>
                                            <button class="btn btn-default" type="button" data-toggle="modal" data-target=".this-close"
                                                    <%--onclick="closeIssue()"--%>>问题关闭
                                            </button>
                                        </div>
                                    </div>
                                </form>
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
<div class="modal fade this-pic" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:860px;padding-top:20px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">照片预览</h4>
            </div>
            <div class="modal-body"
                 style="width:800px; height:500px; margin:30px;background-color:#EFEFEF; text-align:center;" id="showImg">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade this-true" tabindex="-1" role="dialog" aria-hidden="true" >
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
            <h4 class="modal-title" id="myModalLabe2">确定</h4>
            </div>
            <div class="modal-body">
            <p>确定问题修正完毕，并开始处理吗？</p>
            </div>
            <div class="modal-footer">
        <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
        <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onclick="checkNull()">确定</button>
      </div>
        </div>
    </div>
</div>
<!-- 问题关闭原因 -->
<form id="form_close">
<div id="modal_close" class="modal fade this-close" tabindex="-1" role="dialog" aria-hidden="true" >
    <div class="modal-dialog modal-lg" style="width:400px;padding-top:200px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabe3">系统提示</h4>
            </div>
            <div class="modal-body">
                <label>关闭原因：</label>
                <input id="cause" type="text" class="form-control" placeholder="请输入关闭原因" required="required"/>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary antoclose2" <%--data-dismiss="modal" --%>onclick="closeIssue()">提交</button>
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
</form>
<!-- 遮蔽内容结束 -->

<%@include file="/view/static/common/core_js.jsp" %>
</body>
<%--
<script type="text/javascript">
    /*$(document).ready(function () {
        $("#menuA").attr("class","current-page");
        $("#menuParent1").attr("class","active");
        $("#menu").attr("style","display: block");

    });*/


</script>
--%>


<script type="text/javascript">
	/**左侧菜单操作**/
	
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
	$("#menuIssusParent").addClass("active");
	/**父菜单*/
	$("#menuIssusChild").css('display','block'); 
	//$("#menuIssusParent").show();
	/**子菜单*/
	$("#menuA").addClass("current-page");

</script>

<script>
    $(function () {
        var pid = 0;
        getSelectlist("#plant", "xf", pid, '${issue.plant}');
        getSelectlist("#area", "xf", '${issue.plant}', '${issue.area}');

        getSelectlist("#issueCategoryL2", "l2", pid, '${issue.issueCategoryL2}');
        getSelectlist("#failureLocation", "position", pid, '${issue.failureLocation}');

        getSelectlist("#issueCategoryL3", "l2", '${issue.issueCategoryL2}', '${issue.issueCategoryL3}')

        initTable();
        _showPic();

    })
    function checkNull(){
       /* $("#demo-form2").validate({
            errorClass: "error"
        })
        $("#demo-form2").validate();*/
        if($("#demo-form2").valid()){
            layer.confirm("确定修正问题并开始处理吗？", {
                icon: 3,
                title: "系统提示"
            }, function () {
                saveIssue();
            });
        }
       /* return;*/
    };
    function check(e) {
        var re = /^\d+(?=\.{0,1}\d+$|$)/
        if (e.value != "") {
            if (!re.test(e.value)) {
                e.value = "";
                e.focus();
            }
        }
    }
    $("#issueCategoryL1").change(function () {
        var val = $("#issueCategoryL1").val();
        switch (val) {
            case '1':
                $('#d3,#d4').hide();
                $('#d1,#d2').hide();
                break;
            case '2':
                $('#d1,#d2').hide();
                $('#d3,#d4').show();
                break;
            case '3':
                $('#d1,#d2').show();
                $('#d3,#d4').hide();
                break;

            default:
                $('#d3,#d4').hide();
                $('#d1,#d2').hide();
                break;
        }
    })
    function initTable() {
        var val = $("#issueCategoryL1").val();
        switch (val) {
            case '1':
                $('#d3,#d4').hide();
                $('#d1,#d2').hide();
                break;
            case '2':
                $('#d1,#d2').hide();
                $('#d3,#d4').show();
                break;
            case '3':
                $('#d1,#d2').show();
                $('#d3,#d4').hide();
                break;

            default:
                $('#d3,#d4').hide();
                $('#d1,#d2').hide();
                break;
        }

    }

    function initChildSel() {
        var type = "";
        var pid = 0;
        $("#issueCategoryL3").empty();
        var val = $("#issueCategoryL2").val();
        type = "l2";
        pid = val;
        getSelectlist("#issueCategoryL3", type, pid);


        /*$("#area").empty();
        var val = $("#plant").val();
        type="xf";
        pid=val;
        getSelectlist("#area",type,pid);*/
    }

    //根据不同选项获取下拉框
    $(function () {
        var type = "";
        var pid = 0;
        $("#issueCategoryL2").change(function () {
            $("#issueCategoryL3").empty();
            var val = $("#issueCategoryL2").val();
            type = "l2";
            pid = val;
            getSelectlist("#issueCategoryL3", type, pid);
        })
        $("#plant").change(function () {
            $("#area").empty();
            var val = $("#plant").val();
            type = "xf";
            pid = val;
            getSelectlist("#area", type, pid);
        })
    })

    //保存
    function updIssue() {
        var params = $("#demo-form2").serialize();
        $.ajax({
            type: "POST",
            url: "${webPath}/bims/apucheck/correct?id=" +${issue.id},
            data: params,
            dataType: "json",
            success: function (data) {
                console.log(data)
                var id = data.obj.id;
                if (data.success) {
                    console.log(data)
                    layer.msg("已保存");
                    setTimeout(window.location.href = '${webPath}/back/toApu', 1000);
                } else {
                    layer.msg("已保存");
                }
            },
            error: function (data) {
                layer.msg("操作失败");
            }
        });
    }

    //关闭
    function closeIssue() {
        if ($("#form_close").valid()) {
            $('#modal_close').modal('hide');
        // layer.confirm('确定关闭问题吗?', {icon: 3, title:'提示'}, function(index){
            $.ajax({
                type: "POST",
                url: "${webPath}/bims/apucheck/closeIssue?id=" +${issue.id},
                data: {
                    "issueCategoryL3Name": $("#cause").val()
                },
                dataType: "json",
                success: function (data) {
                    console.log(data);
                    // var id = data.obj.id;
                    if (data.success) {
                        console.log(data);
                        layer.msg("已关闭");
                        setTimeout(window.location.href = '${webPath}/back/toApu', 1000);
                    } else {
                        layer.msg("已关闭");
                    }

                },
                error: function (data) {
                    layer.msg("操作失败");
                }
            });
        }

            // layer.close(index);
        // });
    }

    //确认并开始处理
    function saveIssue() {
        // checking();
        var params = $("#demo-form2").serialize();
        // layer.confirm('确定问题修正完毕，并开始处理吗?', {icon: 3, title:'提示'}, function(index){
            $.ajax({
                type: "POST",
                url: "${webPath}/bims/apucheck/correct?id=" +${issue.id},
                data: params,
                dataType: "json",
                success: function (data) {
                    console.log(data);
                    var id = data.obj.id;
                    if (data.success) {
                        console.log(data);
                        // layer.msg("已保存");
                        <%--setTimeout(window.location.href = '${webPath}/bims/apucheck/apuEqr?id=' +${issue.id}, 1000);--%>
                        window.location.href = '${webPath}/bims/apucheck/apuEqr?id=' +${issue.id};
                    } else {
                        layer.msg(data.msg);
                    }

                },
                error: function (data) {
                    layer.msg(data.msg);
                }
            });

            layer.close(index);
        // });

    }

    //确认发送
    function confirm() {
        var val = $("#issueCategoryL1").val();
        if (val == 1) {
            layer.confirm('确定将该问题发送至SQA进行处理吗?', {icon: 3, title:'提示'}, function(index){
                checking();

                layer.close(index);
            });

        } else if (val == 3 || val == 2) {
            layer.confirm('确定将该问题发送至质量部进行处理吗?', {icon: 3, title:'提示'}, function(index){
                checking();

                layer.close(index);
            });
        } else {
            layer.msg('请选择问题分类！');
            return;
        }

    }

    //数据校验
    function checking() {
        var plant = $("#plant option:selected").val();
        if (plant == null || plant == '') {
            layer.msg('请选择厂区！');
            return;
        }
        var issueStation = $("#issueStation").val();
        if (issueStation == null || issueStation == '') {
            layer.msg('请填写工位！');
            return;
        }
        var area = $("#area option:selected").val();
        if (area == null || area == '') {
            layer.msg('请选择区域！');
            return;
        }
        var issueCategoryL1 = $("#issueCategoryL1 option:selected").val();
        if (issueCategoryL1 == null || issueCategoryL1 == '') {
            layer.msg('请选择问题质量分类1！');
            return;
        }

        var seriesNo = $("#seriesNo").val();
        if (seriesNo == null || seriesNo == '') {
            layer.msg('请输入追溯号！');
            return;
        }

        var issueCategoryL2 = $("#issueCategoryL2 option:selected").val();
        if (issueCategoryL2 == null || issueCategoryL2 == '') {
            layer.msg('请选择问题质量分类2！');
            return;
        }
        var issueCategoryL3 = $("#issueCategoryL3 option:selected").val();
        if (issueCategoryL3 == null || issueCategoryL3 == '') {
            layer.msg('请选择问题质量分类3！');
            return;
        }
        var isRft = $("#isRft").val();
        if (isRft == null || isRft == '') {
            layer.msg('请选择是否RFT！');
            return;
        }
        var failureLocation = $("#failureLocation option:selected").val();
        if (failureLocation == null || failureLocation == '') {
            layer.msg('请选择失效位置！');
            return;
        }
        var qty = $("#qty").val();
        if (qty == null || qty == '') {
            layer.msg('请填写数量！');
            return;
        }
        var issueDesc = $("#issueDesc").val();
        if (issueDesc == null || issueDesc == '') {
            layer.msg('请输入问题描述！');
            return;
        }
        if (issueCategoryL1 == 2) {
            var partNo = $("#partNo").val();
            if (partNo == null || partNo == '') {
                layer.msg('请输入零件号！');
                return;
            }
            var partNanme = $("#partNanme").val();
            if (partNanme == null || partNanme == '') {
                layer.msg('请输入零件名称！');
                return;
            }

            var vendorCode = $("#vendorCode option:selected").val();
            if (vendorCode == null || vendorCode == '') {
                layer.msg('请选择供应商代码！');
                return;
            }

            var vendorNanme = $("#vendorNanme").val();
            if (vendorNanme == null || vendorNanme == '') {
                layer.msg('请输入供应商名称！');
                return;
            }
        } else if (issueCategoryL1 == 3) {
            var esn = $("#esn option:selected").val();
            if (esn == null || esn == '') {
                layer.msg('请输入ESN！');
                return;
            }

            var so = $("#so").val();
            if (so == null || so == '') {
                layer.msg('请输入SO！');
                return;
            }

            var engineType = $("#engineType").val();
            if (engineType == null || engineType == '') {
                layer.msg('请输入机型！');
                return;
            }

            var projectNo = $("#projectNo").val();
            if (projectNo == null || projectNo == '') {
                layer.msg('请输入项目号！');
                return;
            }

         /*   var engineSeries = $("#engineSeries").val();
            if (engineSeries == null || engineSeries == '') {
                layer.msg('请输入发动机系列！');
                return;
            }*/
        }

        var comments = $("#comments").val();
        if (comments == null || comments == '') {
            layer.msg('请输入备注！');
            return;
        }
    }


    function getSelectlist(dom, type, pid, selectId) {
        var subject = $(dom);//元素
        $.ajax({
            url: "${webPath}/dict/getSelectList",
            type: "POST",
            dataType: "json",
            data: {
                type: type,
                pid: pid
            },
            success: function (ajaxJson) {
                if (ajaxJson.success) {
                    //添加select第一个option
                    var html = '<option selected value="">- 请选择 -</option>';//$("#wWareId").append("<option selected value='0'>---请选择---</option>");
                    for (var i = 0; i < ajaxJson.obj.length; i++) {
                        var checked = "";
                        //添加option元素
                        //$(subject).append("<option value='" + ajaxJson.obj[i].id + "'>" + ajaxJson.obj[i].name + "</option>");
                        //如果id等于value，则选中
                        if (ajaxJson.obj[i].id == selectId) {
                            checked = "selected=\"selected\"";
                        }
                        html += "  <option " + checked + " class='remove' value='" + ajaxJson.obj[i].id + "'>"
                            + ajaxJson.obj[i].name + "</option>";
                        //$("subject option:eq('" + selectId + "')").attr('selected', 'selected');
                    }
                    $(subject).append(html);
                } else {
                    $(subject).append("<option selected value='0'>- 请选择 -</option>");
                }
            }
        })
    }

    /* 渲染图片 */
    function _showPic() {
        var _self = this;
        imgId = _self.imgId;
        var result = $("#attach").val();
        var img = result.split(",");
        html = '';
        $wap = $('#preview');
        if (result == "") {
            $wap.append(html);
        } else {
            for (var i = 0; i < img.length; i++) {
                <!-- html拼接的代码 data-toggle="modal" data-target=".this-pic" onclick="showImg(\''+image_base64+'\')" ====重点 -->
                /*html = '<li data-toggle="modal" data-target=".this-pic" onclick="showImg(\''+image_base64+'\')" class="fl pic" id="imgItem_' + count + '">' +
                    '<img src="' + image_base64 + '" alt="">' +
                    '<input id="imgUrl_' + count + '" type="hidden" class="imgUrl">' +
                    '<i class="del-img"></i>' +
                    '</li>';*/
                html = '<li class="fl pic" id="imgItem_' + imgId + '">' +
                    '<span data-toggle="modal" data-target=".this-pic" onclick="showImg(\'${uploadUrl}'+img[i]+'\')" >'+
                    '<img src="${uploadUrl}' + img[i] + '" alt="">' +
                    '<input id="imgUrl" type="hidden" value=' + img[i] + ' class="imgUrl">' +
                    '</span>'+
                    '<i class="del-img"></i>' +
                    '</li>';
                $wap.append(html);
            }
        }
    }

    /** 展示图片 **/
    function showImg(byteImg) {
        $("#showImg").html("<img style='width: 100%;height: 100%;' src='"+byteImg+"' />");
    }
    //修正问题并开始处理
    function startDeal() {

    }

    /**  select2选择框 **/
    //搜索零件号
    jQuery(document).ready(function() {
        //前置库下拉框
        $('#partNo').select2({
            placeholder: "-- 输入零件号 --",
            language: "zh-CN",
            minimumInputLength: 0,
            allowClear: true,
            width: '100%',
            escapeMarkup: function (markup) { return markup; }, // 让template的html显示效果，否则输出代码
            ajax: {
                url: function (params) {
                    return "${webPath}/Supplier/partNumberlike?partNo="+ params.term;
                },
                dataType: 'json',
                processResults: function (data, params) {
                    var options = new Array();
                    for (var i = 0; i < data.length; i++) {//获取select2个必要的字段，id与text
                        options.push({
                            //取出items中Code赋值给id
                            id : data[i],
                            //取出items中CodeName赋值给text
                            text : data[i],
                        })
                    }
                    return {
                        //返回数据
                        results: options
                    };
                },
                cache: true
            },
        });
    });

    //这里是选中零件触发的事件
    $("#partNo").on("select2:select", function (evt) {
        //这里是选中触发的事件
        //evt.params.data 是选中项的信息
        var partNumber = evt.params.data.text;
        $.ajax({
            type: "get",
            url: "${webPath}/Supplier/getSupplierByPartNo?partNo="+partNumber,
            data: {},
            dataType: "json",
            success: function (data) {
                console.info(data);
                if (data != null && data.length > 0) {
                    $("#partName").val(data[0].partName);
                    $("#vendorCodeNew").val("");
                    $("#vendorName").val("");
                    $("#vendorCode").html("<option selected value=''>- 请选择 -</option>");
                    for (var i = 0; i < data.length; i++) {
                        //添加option元素
                        $("#vendorCode").append("<option value='" + data[i].supplierName + "'>" + data[i].supplierCode + "</option>");
                    }
                }
            },
            error: function (data) {
            }
        });
    });

    /*$("#partNo").on("select2:select", function (evt) {
        //这里是选中触发的事件
        //evt.params.data 是选中项的信息
        var partNumber = evt.params.data.text;
        $.ajax({
            type: "POST",
            url: "${webPath}/Components/queryVendorCodeByPartNumber/"+partNumber,
            data: {},
            dataType: "json",
            success: function (data) {
                console.log(data)
                //添加select第一个option
                $("#vendorCode").html("<option selected value=''>- 请选择 -</option>");
                for(var i = 0; i < data.length; i++) {
                    //添加option元素
                    $("#vendorCode").html("<option value='" + data[i] + "'>" + data[i] + "</option>");
                }
            },
            error: function (data) {
            }
        });
    });*/
    //
    $("#vendorCode").change(function(){
        var vendorCode = $("#vendorCode option:selected").text();
        var vendorName = $("#vendorCode option:selected").val();
        if (vendorCode != null && vendorCode != "") {
            $("#vendorCodeNew").val(vendorCode);
            $("#vendorName").val(vendorName);
        } else {
            $("#vendorCodeNew").val("");
            $("#vendorName").val("");
        }

        /*var vendorCode = $(this).val();
        $.ajax({
            type: "POST",
            url: "${webPath}/Supplier/getSupplierNameBycode/"+vendorCode,
            data: {},
            dataType: "json",
            success: function (data) {
                console.log(data)
                $("#vendorName").val(data.supplierName);
            },
            error: function (data) {
            }
        });*/
    });


    var esn;
    $(function () {
        esn = $("#esn");
        initSelectEsn();
    });

    function initSelectEsn() {
        esn.select2({
            ajax: {
                url: function (params) {
                    return "${webPath}/Esn/fuzzyQueryEsn/"+ params.term;
                },
                dataType: 'json',
                processResults: function (data, params) {
                    var options = new Array();
                    $(data).each(function(i, o) {
                        options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                            id : o[i],         //取出items中Code赋值给id
                            text : o    //取出items中CodeName赋值给text
                        });
                    });
                    return {
                        results: options        //返回数据
                    };
                },
                cache: true
            },

            width: '100%',
            allowClear: true,    //选中之后，可手动点击删除
            placeholder: "输入ESN搜索...",
            escapeMarkup: function (markup) { return markup; }, // 让template的html显示效果，否则输出代码
            minimumInputLength: 0,    //搜索框至少要输入的长度，此处设置后需输入才显示结果
            language: "zh-CN",         //中文
            //templateResult: formatTelehoneNumber, // 自定义下拉选项的样式模板
            //templateSelection: formatTelehoneNumberSelection     // 自定义选中选项的样式模板
        });

        esn.on("select2:select", function (evt) {
            //这里是选中触发的事件
            //evt.params.data 是选中项的信息
            var esn = evt.params.data.text;
            $.ajax({
                type: "POST",
                url: "${webPath}/Esn/queryItemNumberByEsn/"+esn,
                data: {},
                dataType: "json",
                success: function (data) {
                    console.log(data)
                    $("#so").val(data.so);
                    $("#projectNo").val(data.prjectName);
                },
                error: function (data) {
                }
            });
        });

        esn.on("select2:unselect", function (evt) {
            //这里是取消选中触发的事件
            //如配置allowClear: true后，触发
        });
    }

    /*$(function () {
        var type = ${issue.issueCategoryL1};
        if (type == 1){

        }
        if (type == 2){
            echoPartNoSelect2();
            echoVendorCodeSelect2();
        }
        if (type == 3){
            echoEsnSelect2();
        }
    })*/
    //回显数据
    function echoPartNoSelect2(){
        var dom = $("#partNo");
        var partNo = '${issue.partNo}'
        $.ajax({
            url: "${webPath}/Components/fuzzyQueryComponents/"+partNo ,
            type: "POST",
            dataType: "json",
            data: {},
            success: function (ajaxJson) {
                console.log(ajaxJson)
                var value = ajaxJson
                $.each(value, function (index, partNo) {
                    if (value == partNo) {
                        $(dom).append(new Option(value, value, false, true));
                    }
                });
                $(dom).trigger("change");
            }
        })
    }
    function echoVendorCodeSelect2(){
        var dom = $("#vendorCode");
        var partNo = '${issue.partNo}';
        var vendorCode = '${issue.vendorCode}';
        $.ajax({
            url: "${webPath}/Components/queryVendorCodeByPartNumber/"+partNo ,
            type: "POST",
            dataType: "json",
            data: {},
            success: function (ajaxJson) {
                console.log(ajaxJson)
                var value = ajaxJson
                $.each(value, function (index, vendorCode) {
                    if (value[index] == vendorCode) {
                        $(dom).append(new Option(vendorCode, vendorCode, false, true));
                    }
                });
                $(dom).trigger("change");
            }
        })
    }
    function echoEsnSelect2(){
        var dom = $("#esn");
        var esn = '${issue.esn}'
        $.ajax({
            url: "${webPath}/Esn/fuzzyQueryEsn/"+esn ,
            type: "POST",
            dataType: "json",
            data: {},
            success: function (ajaxJson) {
                console.log(ajaxJson)
                var value = ajaxJson
                $.each(value, function (index, partNo) {
                    if (value == esn) {
                        $(dom).append(new Option(value, value, false, true));
                    }
                });
                $(dom).trigger("change");
            }
        })
    }


</script>
</html>
