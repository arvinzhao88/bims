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

                <div class="title_left"><h3>机加</h3></div>
                <div class="title_right"></div>
                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>问题录入</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                                    <%--<li><a class="close-link"><i class="fa fa-close"></i></a></li>--%>
                                </ul>

                                <div class="clearfix"></div>
                            </div>

                            <div class="x_content">
                                <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                           style="border-collapse:separate;border-spacing:15px;">
                                        <input type="hidden" id="qualityType" name="qualityType" required="required"
                                               class="form-control" value="M">
                                        <tr>
                                            <td width="15%" align="right"><strong>Plant/工厂： <font color='red'>*</font></strong></td>
                                            <td width="35%">
                                                <select name="plant" id="plant" class="form-control" required>

                                                </select>
                                            </td>
                                            <%--<td width="15%" align="right"><strong>OP/工序号： <font color='red'>*</font></strong></td>
                                            <td width="35%">
                                                <input type="text" id="issueStation" name="issueStation"
                                                       required="required" class="form-control" value="" placeholder="请输入工序号">
                                            </td>--%>

                                            <td align="right"><strong>Issue Category L1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level1： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="issueCategoryL1" name="issueCategoryL1"
                                                        class="form-control" required>
                                                    <option value="">- 请选择 -</option>
                                                    <option value="1">自制件</option>
                                                    <option value="2">采购件</option>
                                                    <option value="3">在制发动机</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr id="d1">
                                            <td align="right"><strong>S/N/序列号： </strong></td>
                                            <td><input type="text" id="seriesNo" name="seriesNo"
                                                       class="form-control" value=""
                                                       onblur="getCastSupplierName()" placeholder="请输入系列号"></td>
                                            <td align="right"><strong>Failure location/失效位置： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select name="failureLocation" id="failureLocation"
                                                        class="form-control" required>

                                                </select>
                                            </td>
                                        </tr>

                                        <tr id="d2" style="display:none;">
                                            <td align="right"><strong>Batch info/批次号： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="batchInfo" name="batchInfo" required="required" onblur="check(this)" onkeyup="this.value=this.value.replace(/[^0-9.]/g,'')"
                                                       class="form-control" value="" placeholder="批次号"></td>
                                        </tr>
                                        <tr>

                                            <td width="15%" align="right"><strong>Part Number/零件号： <font color='red'>*</font></strong></td>
                                            <td width="35%">
                                                <%--<input type="text" id="partNo" name="partNo"
                                                                   required="required" class="form-control" value="">--%>
                                                <select name="partNo" id="partNo" class="form-control" required>
                                                </select>
                                            </td>
                                            <td align="right"><strong>Part Name/零件名称： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="partName" name="partName"
                                                       class="form-control" value="" placeholder="零件名称" required="required"></td>
                                        </tr>
                                        <tr>
                                            <td align="right"><strong>Casting NO./毛坯号： </strong></td>
                                            <td>
                                                <input type="text" id="castNo" name="castNo" onblur="checkSymbol()"
                                                       class="form-control" value="" placeholder="请输入毛坯号">
                                            </td>
                                            <td align="right"><strong>Casting Supplier/毛坯供应商名称： </strong></td>
                                            <td><input type="text" id="castSupplierName" name="castSupplierName" onblur="checkSymbol()"
                                                       class="form-control" value="" placeholder="毛坯供应商名称"></td>
                                        </tr>
                                        <tr id="d3">
                                            <td align="right"><strong>Semifinishing Supplier Code&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>粗加工供应商代码： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select class="form-control" id="semiSupplierCode" onblur="checkSymbol()"
                                                        name="semiSupplierCode" required>

                                                </select>
                                            </td>
                                            <td align="right"><strong>Semifinishing Supplier&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>粗加工供应商名称： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="semiSupplierName" name="semiSupplierName" onblur="checkSymbol()"
                                                       required="required"
                                                       class="form-control" value="" placeholder="粗加工供应商名称"></td>
                                        </tr>

                                        <tr id="d4" style="display:none;">
                                            <td align="right" style="text-align: right"><strong>Supplier Code/供应商代码 ： <font color='red'>*</font></strong></td>
                                            <td>
                                                <%--<input type="text" id="vendorCode" name="vendorCode" required="required"
                                                       class="form-control col-md-7" value="">--%>
                                                <select <%--name="vendorCode"--%> id="vendorCode" class="form-control col-md-7" required>
                                                    <option value="">- 请选择 -</option>
                                                </select>
                                                <input type="hidden" id="vendorCodeNew" name="vendorCode">
                                            </td>
                                            <td align="right" style="text-align: right"><strong>Supplier Name/供应商名称 ： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="vendorName" name="vendorName" required="required"
                                                       class="form-control col-md-7" placeholder="供应商名称"></td>
                                        </tr>

                                        <tr>
                                            <td width="15%" align="right"><strong>Product Type/产品系列： <font color='red'>*</font></strong></td>
                                            <td width="35%"><input type="text" id="engineSeries" name="engineSeries"
                                                                   required="required"
                                                                   class="form-control" value="" placeholder="请输入产品系列"></td>
                                            <%--<td align="right"><strong>Issue Category L1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level1： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="issueCategoryL1" name="issueCategoryL1"
                                                        class="form-control" required>
                                                    <option value="">- 请选择 -</option>
                                                    <option value="1">自制件</option>
                                                    <option value="2">采购件</option>
                                                    <option value="3">在制发动机</option>
                                                </select>
                                            </td>--%>
                                            <td width="15%" align="right"><strong>OP/工序号： <font color='red'>*</font></strong></td>
                                            <td width="35%">
                                                <input type="text" id="issueStation" name="issueStation"
                                                       required="required" class="form-control" value="" placeholder="请输入工序号">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right"><strong>Issue Category L2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level2： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="issueCategoryL2" name="issueCategoryL2"
                                                        class="form-control" required>
                                                    <%--<option>请选择</option>
                                                    <option>尺寸问题</option>
                                                    <option>外观问题</option>
                                                    <option>原料问题</option>--%>
                                                </select>
                                            </td>
                                            <td align="right"><strong>Issue Category L3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level3： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="issueCategoryL3" name="issueCategoryL3"
                                                        class="form-control" required>
                                                    <option value="">- 请选择 -</option>
                                                    <%--<option>异物</option>
                                                    <option>理化</option>
                                                    <option>颗粒度</option>--%>
                                                </select>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td align="right"><strong>Issue Description/问题描述： <font color='red'>*</font></strong></td>
                                            <td colspan="3"><textarea id="issueDesc" name="issueDesc" cols="200"
                                                                      rows="2" class="form-control"
                                                                      placeholder="请输入问题描述" required></textarea></td>
                                        </tr>

                                        <tr>
                                            <td align="right"><strong>Comments/备注：</strong></td>
                                            <td colspan="3"><textarea id="comments" name="comments" cols="200" rows="2"
                                                                      class="form-control"
                                                                      placeholder="请输入备注"></textarea></td>
                                        </tr>

                                        <tr>
                                            <td align="right"><strong>Failure Qty./数量： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="qty" name="qty" required="required"  onblur="check(this)" onkeyup="this.value=this.value.replace(/[^0-9.]/g,'')"
                                                       class="form-control col-md-7"
                                                       value="" placeholder="请输入数量"></td>
                                            <td align="right"><strong>照片附件： </strong></td>
                                            <%--<td><i class="fa fa-file-image-o"
                                                   style="font-size:35px; padding-right:10px;vertical-align:middle;"></i>&nbsp;上传图片
                                            </td>--%>
                                            <td class="list-img">
                                                <div id="preview" class="clear">
                                                    <li class="fl">
                                                        <img src="${resPath}/view/static/images/icon_upload.png">
                                                        <input id="fileImage" type="file" name="file[]" multiple/>
                                                        <%--<div class="num">0/6</div>--%>
                                                    </li>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>是否批量 ： <font color='red'>*</font></strong></td>
                                            <td><select name="issueCategoryL1Name" id="issueCategoryL1Name" class="form-control" required>
                                                <option value="">- 请选择 -</option>
                                                <option value="1">是</option>
                                                <option value="2">否</option>
                                            </select></td>
                                        </tr>
                                    </table>
                                    <%@include file="/view/static/common/img.jsp" %>
                                    <input type="hidden" id="issueExtend" name="issueExtend" required="required"
                                           class="form-control col-md-7" value="">
                                    <input type="hidden" id="attach" name="attach" required="required"
                                           class="form-control col-md-7" value="${issue.attach}">
                                    <div class="ln_solid"></div>
                                    <div class="form-group">
                                        <div style="text-align:center">
                                            <%--<button class="btn btn-primary" type="button" onClick="checking()">保存
                                            </button>
                                            &nbsp;&nbsp;&nbsp;&nbsp;--%>
                                            <button class="btn btn-primary" type="button" <%--data-toggle="modal"
                                                    data-target=".this-true"--%> onclick="checkNull()">确认
                                            </button>&nbsp;&nbsp;&nbsp;&nbsp;
                                            <button class="btn btn-default" type="button" <%--data-toggle="modal1"
                                                    data-target=".this-true"--%>
                                                    onClick="cancle()">返回
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
<%--<div class="modal fade this-true" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">确认</h4>
            </div>
            <div class="modal-body">
                <p>确认新建该问题吗？</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onClick="checkNull()">确定
                </button>
            </div>
        </div>
    </div>
</div>--%>
<!-- 遮蔽内容结束 -->
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
<%@include file="/view/static/common/core_js.jsp" %>
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
    $("#menuMachine").addClass("current-page");



</script>
<script>
    window.onload = function () {
        var pid = 0;
        getSelectlist("#plant", "xf", pid);
        getSelectlist("#issueCategoryL2", "l2", pid);
        getSelectlist("#failureLocation", "position", pid);
        getSemiSupplierCode("#semiSupplierCode", "supplier", 127);

    }

    function checkNull(){
        /*$("#demo-form2").validate({
            errorClass: "error"
        })
        $("#demo-form2").validate();*/
        if($("#demo-form2").valid()){
            saveIssue();
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
    function checkSymbol(){
        var regEn = /[`~!@#$%^&*()_+<>?:"{},.\/;'[\]]/im,
            regCn = /[·！#￥（——）：；“”‘、，|《。》？、【】[\]]/im;
        var castNo = $("#castNo").val();
        if(regEn.test(castNo) || regCn.test(castNo)) {
            layer.msg("毛坯号不能包含特殊字符.");
            return;
        }
        var castSupplierName = $("#castSupplierName").val();
        if(regEn.test(castSupplierName) || regCn.test(castSupplierName)) {
            layer.msg("毛坯供应商不能包含特殊字符.");
            return;
        }
        var semiSupplierCode = $("#semiSupplierCode").val();
        if(regEn.test(semiSupplierCode) || regCn.test(semiSupplierCode)) {
            layer.msg("粗加工供应商代码不能包含特殊字符.");
            return;
        }
        var semiSupplierName = $("#semiSupplierName").val();
        if(regEn.test(semiSupplierName) || regCn.test(semiSupplierName)) {
            layer.msg("粗加工供应商名称不能包含特殊字符.");
            return;
        }
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

    //取消
    function cancle() {
        window.location.href = '${webPath}/back/toMachine';
    }

    //粗加工供应商代码
    function getSemiSupplierCode(dom, type, pid, selectId) {
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
                            + ajaxJson.obj[i].tips + "</option>";
                        //$("subject option:eq('" + selectId + "')").attr('selected', 'selected');
                    }
                    $(subject).append(html);
                } else {
                    $(subject).append("<option selected value='0'>- 请选择 -</option>");
                }
            }
        })
    }
    //获取问题分类下拉
    function getSelectlist(dom, type, pid) {
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
                    var html = '<option selected value="">- 请选择 -</option>';
                    //添加select第一个option
                    //$("#wWareId").append("<option selected value='0'>---请选择---</option>");
                    for (var i = 0; i < ajaxJson.obj.length; i++) {
                        var checked = "";
                        //添加option元素
                        html += ("<option value='" + ajaxJson.obj[i].id + "'>" + ajaxJson.obj[i].name + "</option>");
                        //如果id等于value，则选中
                        if (ajaxJson.obj[i].id == pid) {
                            checked = "selected=\"selected\"";
                        }
                        /*html += "  <option "+checked+" class='remove' value='" + ajaxJson.obj[i].id + "'>"
                            + ajaxJson.obj[i].name + "</option>";*/
                        //$("wWareId option:eq('" + ${wareId} + "')").attr('selected', 'selected');
                    }
                    $(subject).append(html);
                } else {
                    $(subject).append("<option selected value='0'>- 请选择 -</option>");
                }
            }
        })
    }

    //数据校验
    function checking() {
        var regEn = /[`~!@#$%^&*()_+<>?:"{},.\/;'[\]]/im,
            regCn = /[·！#￥（——）：；“”‘、，|《。》？、【】[\]]/im;

        var plant = $("#plant option:selected").val();
        if (plant == null || plant == '') {
            layer.msg('请选择厂区！');
            return;
        }
        var issueStation = $("#issueStation").val();
        if (issueStation == null || issueStation == '') {
            layer.msg('请填写问题工位！');
            return;
        }
        var engineSeries = $("#engineSeries").val();
        if (engineSeries == null || engineSeries == '') {
            layer.msg('请输入产品系列！');
            return;
        }

        /*var seriesNo = $("#seriesNo").val();
        if (seriesNo == null || seriesNo == '') {
            layer.msg('请输入序列号！');
            return;
        }*/
        var partNo = $("#partNo").val();
        if (partNo == null || partNo == '') {
            layer.msg('请输入零件号！');
            return;
        }
        var partName = $("#partName").val();
        if (partName == null || partName == '') {
            layer.msg('请输入零件名称！');
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

        var issueDesc = $("#issueDesc").val();
        if (issueDesc == null || issueDesc == '') {
            layer.msg('请输入问题描述！');
            return;
        }

        var castNo = $("#castNo").val();
        if(regEn.test(castNo) || regCn.test(castNo)) {
            layer.msg("毛坯号不能包含特殊字符.");
            return;
        }
        if (castNo == null || castNo == '') {
            layer.msg('请输入毛坯号！');
            return;
        }

        var castSupplierName = $("#castSupplierName").val();
        if(regEn.test(castSupplierName) || regCn.test(castSupplierName)) {
            layer.msg("毛坯供应商不能包含特殊字符.");
            return;
        }
        if (castSupplierName == null || castSupplierName == '') {
            layer.msg('请输入毛坯供应商！');
            return;
        }

        var semiSupplierCode = $("#semiSupplierCode").val();
        if(regEn.test(semiSupplierCode) || regCn.test(semiSupplierCode)) {
            layer.msg("粗加工供应商代码不能包含特殊字符.");
            return;
        }
        if (semiSupplierCode == null || semiSupplierCode == '') {
            layer.msg('请输入粗加工供应商代码！');
            return;
        }

        var semiSupplierName = $("#semiSupplierName").val();
        if(regEn.test(semiSupplierName) || regCn.test(semiSupplierName)) {
            layer.msg("粗加工供应商名称不能包含特殊字符.");
            return;
        }
        if (semiSupplierName == null || semiSupplierName == '') {
            layer.msg('请输入粗加工供应商名称！');
            return;
        }
        var failureLocation = $("#failureLocation option:selected").val();
        if (failureLocation == null || failureLocation == '') {
            layer.msg('请选择失效位置！');
            return;
        }

        var issueCategoryL1 = $("#issueCategoryL1 option:selected").val();
        if (issueCategoryL1 == null || issueCategoryL1 == '') {
            layer.msg('请选择问题质量分类1！');
            return;
        }

        var comments = $("#comments").val();
        if (comments == null || comments == '') {
            layer.msg('请输入备注！');
            return;
        }

        var qty = $("#qty").val();
        if (qty == null || qty == '') {
            layer.msg('请输入数量！');
            return;
        }
        var issueExtend = $("#issueExtend").val();
        var result = '{"castNo":"' + castNo + '","castSupplierName":"' + castSupplierName + '","semiSupplierCode":"' + semiSupplierCode + '","semiSupplierName":"' + semiSupplierName + '"}'
        $("#issueExtend").attr("value", result);
        // saveIssue();
    }

    //保存
    function saveIssue() {
        var result = '{"castNo":"' + $("#castNo").val() + '","castSupplierName":"'
            + $("#castSupplierName").val() + '","semiSupplierCode":"'
            + $("#semiSupplierCode").val() + '","semiSupplierName":"' + $("#semiSupplierName").val() + '"}'
        $("#issueExtend").attr("value", result);
        // checking();
        layer.confirm('确定提交问题并开始处理吗?', {icon: 3, title:'提示'}, function(index){
        var params = $("#demo-form2").serialize();
        $.ajax({
            type: "POST",
            url: "${webPath}/bims/apucheck/add",
            data: params,
            dataType: "json",
            success: function (data) {
                console.log(data)
                if (data.success) {
                    console.log(data)
                    // layer.msg("已保存");
                    var id = data.obj;
                    setTimeout(window.location.href = '${webPath}/bims/apucheck/apuEqr?id=' + id, 1000);
                } else {
                    layer.msg(data.msg);
                }
            },
            error: function (data) {
                layer.msg(data.msg);
            }
        });
        })
    }

    /**  select2选择框 **/
    //搜索零件号
    jQuery(document).ready(function () {
        //前置库下拉框
        $('#partNo').select2({
            placeholder: "输入零件号",
            language: "zh-CN",
            minimumInputLength: 0,
            allowClear: true,
            width: '100%',
            escapeMarkup: function (markup) {
                return markup;
            }, // 让template的html显示效果，否则输出代码
            ajax: {
                url: function (params) {
                    return "${webPath}/Supplier/partNumberlike?partNo=" + params.term;
                },
                dataType: 'json',
                processResults: function (data, params) {
                    var options = new Array();
                    for (var i = 0; i < data.length; i++) {//获取select2个必要的字段，id与text
                        options.push({
                            //取出items中Code赋值给id
                            id: data[i],
                            //取出items中CodeName赋值给text
                            text: data[i],
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
            url: "${webPath}/Supplier/getSupplierByPartNo?partNo=" + partNumber,
            data: {},
            dataType: "json",
            success: function (data) {
                $("#partName").val(data[0].partName);
                $("#vendorCode").html("<option selected value=''>- 请选择 -</option>");
                for(var i = 0; i < data.length; i++) {
                    //添加option元素
                    $("#vendorCode").append("<option value='" + data[i].supplierName + "'>" + data[i].supplierCode + "</option>");
                }
            },
            error: function (data) {
                $("#partName").val("");
                $("#vendorCode").html("<option selected value=''>- 请选择 -</option>");
            }
        });
    });
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
    });
    /**
     * 获取毛坯供应商名称
     */
    function getCastSupplierName() {
        var serialNo = $("#seriesNo").val().trim();
        var name = getSupplierNameByTips(126, serialNo);
        if (name != null && name != "") {
            $("#castSupplierName").val(name);
        } else {
            $("#castSupplierName").val("");
        }
    }

    /**
     * 获取粗加工供应商名称
     */
    $("#semiSupplierCode").change(function () {
        var semiSupplierCode = $('#semiSupplierCode option:selected').val();//选中的值
        var semiSupplierText = $('#semiSupplierCode option:selected').text();//选中的值
        var name = getSupplierNameByTips(127, semiSupplierText);
        if (name != null && name != "") {
            $("#semiSupplierName").val(name);
        } else {
            $("#semiSupplierName").val("");
        }
    });

    /**
     * 获取供应商名称
     * @param pid
     * @param tips
     * @param id
     */
    function getSupplierNameByTips(pid, tips) {
        var data;
        $.ajax({
            type: "get",
            url: "${webPath}/dict/getSupplierNameByTips",
            async: false,
            dataType: "json",
            data: {
                "pid": Number(pid),
                "tips": tips
            },
            success: function (result) {
                data = result.name;
            }
        });
        return data;
    }

    /**
     * 采购件时录入批次号，供应商代码，供应商名称
     */
    $(function showInput() {
        /*var val = $("#issueCategoryL1 option:selected").val();
        switch (val) {
            case '2':
                $('#seriesNo,#s_supplier').hide();
                $('#batchInfo,#supplier').show();
                break;
            default:
                $('#seriesNo,#s_supplier').show();
                $('#batchInfo,#supplier').hide();
                break;
        }*/
        //显示批次号,供应商
        $("#issueCategoryL1").change(function (){
            var val = $("#issueCategoryL1 option:selected").val();
            switch (val) {
                case '2':
                    $('#d1,#d3').hide();
                    $('#d2,#d4').show();
                    break;
                default:
                    $('#d1,#d4').show();
                    $('#d2,#d3').hide();
                    break;
            }
        })
    })
</script>
</body>
</html>
