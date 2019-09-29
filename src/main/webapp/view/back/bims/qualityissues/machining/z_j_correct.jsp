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
                            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
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

                                            <td align="right"><strong>Issue Category L1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level1： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="issueCategoryL1" name="issueCategoryL1" required
                                                        class="form-control">
                                                    <option value="">请选择</option>
                                                    <option value="1"
                                                            <c:if test="${'1' eq issue.issueCategoryL1}">selected</c:if>>
                                                        自制件
                                                    </option>
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

                                        </tr>
                                        <tr id="d1">
                                            <td align="right"><strong>S/N/序列号： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="seriesNo" name="seriesNo"
                                                       class="form-control" value="${issue.seriesNo}"
                                                       onblur="getCastSupplierName()"></td>
                                            <td align="right"><strong>Failure location/失效位置： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select name="failureLocation" id="failureLocation" required
                                                        class="form-control">

                                                </select>
                                            </td>

                                        </tr>

                                        <tr id="d2" style="display:none;">
                                            <td align="right"><strong>Batch info/批次号： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="batchInfo" name="batchInfo" required="required" onblur="check(this)" onkeyup="this.value=this.value.replace(/[^0-9.]/g,'')"
                                                       class="form-control" value="" placeholder="批次号"></td>
                                        </tr>
                                        <tr>

                                            <td width="12%" align="right"><strong>Part Number/零件号： <font color='red'>*</font></strong></td>
                                            <td width="38%">
                                                <%--<input type="text" id="partNo" name="partNo"
                                                                   required="required" class="form-control" value="">--%>
                                                <select name="partNo" id="partNo" class="form-control" required>
                                                    <c:if test="${not empty issue.partNo}">
                                                        <option value="${issue.partNo}">${issue.partNo}</option>
                                                    </c:if>
                                                </select>
                                            </td>
                                            <td align="right"><strong>Part Name/零件名称： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="partName" name="partName" required="required"
                                                       class="form-control" value="${issue.partName}"></td>
                                        </tr>

                                        <tr>
                                            <td align="right"><strong>Casting NO./毛坯号： </strong></td>
                                            <td><input type="text" id="castNo" name="castNo"  onblur="checkSymbol()"
                                                       class="form-control" value="${issueExtend.castNo}"></td>
                                            <td align="right"><strong>Casting Supplier毛坯供应商名称： </strong></td>
                                            <td><input type="text" id="castSupplierName" name="castSupplierName"  onblur="checkSymbol()"
                                                       class="form-control" value="${issueExtend.castSupplierName}"></td>
                                        </tr>
                                        <tr id="d3">
                                            <td align="right"><strong>Semifinishing Supplier Code&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>粗加工供应商代码： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select class="form-control" id="semiSupplierCode"  onblur="checkSymbol()" required
                                                        name="semiSupplierCode">
                                                    <%--<option value="">请选择</option>--%>
                                                    <%--<option value="SDL0238" <c:if test="${'SDL0238' eq issueExtend.semiSupplierCode}">selected</c:if>>SDL0021</option>
                                                    <option value="SDL0021" <c:if test="${'SDL0021' eq issueExtend.semiSupplierCode}">selected</c:if>>SDL0021</option>--%>
                                                </select>
                                            </td>
                                            <td align="right"><strong>Semifinishing Supplier&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>粗加工供应商名称： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="semiSupplierName" name="semiSupplierName"  onblur="checkSymbol()"
                                                       required="required"
                                                       class="form-control" value="${issueExtend.semiSupplierName}"></td>
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
                                            <td width="12%" align="right"><strong>Product Type/产品系列： <font color='red'>*</font></strong></td>
                                            <td width="38%"><input type="text" id="engineSeries" name="engineSeries"
                                                                   required="required"
                                                                   class="form-control" value="${issue.engineSeries}"></td>
                                            <td width="15%" align="right"><strong>OP/工序号： <font color='red'>*</font></strong></td>
                                            <td width="35%">
                                                <input type="text" id="issueStation" name="issueStation"
                                                       required="required" class="form-control" value="${issue.issueStation}">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right"><strong>Issue Category L2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level2： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="issueCategoryL2" name="issueCategoryL2" required
                                                        class="form-control">
                                                    <%--<option>请选择</option>
                                                    <option>尺寸问题</option>
                                                    <option>外观问题</option>
                                                    <option>原料问题</option>--%>
                                                </select>
                                            </td>
                                            <td align="right"><strong>Issue Category L3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level3： <font color='red'>*</font></strong></td>
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
                                            <td align="right"><strong>Issue Description/问题描述： <font color='red'>*</font></strong></td>
                                            <td colspan="3"><textarea id="issueDesc" name="issueDesc" cols="200" required
                                                                      rows="2" class="form-control"
                                                                      placeholder="具体问题描述">${issue.issueDesc}</textarea></td>
                                        </tr>

                                        <tr>
                                            <td align="right"><strong>Comments/备注：</strong></td>
                                            <td colspan="3"><textarea id="comments" name="comments" cols="200" rows="2"
                                                                      class="form-control"
                                                                      placeholder="请输入备注">${issue.comments}</textarea></td>
                                        </tr>

                                        <tr>
                                            <td align="right"><strong>Failure Qty./数量： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="qty" name="qty" required="required"
                                                       class="form-control col-md-7"  onblur="check(this)" onkeyup="this.value=this.value.replace(/[^0-9.]/g,'')"
                                                       value="${issue.qty}"></td>
                                            <td align="right"><strong>Attach./照片附件： </strong></td>
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
                                            <td align="right" style="text-align: right"><strong>是否批量： <font color='red'>*</font></strong></td>
                                            <td><select name="issueCategoryL1Name" id="issueCategoryL1Name" class="form-control" required>
                                                <option value="">- 请选择 -</option>
                                                <option value="1" <c:if test="${'1' eq issue.issueCategoryL1Name}">selected</c:if>>是
                                                </option>
                                                <option value="2" <c:if test="${'2' eq issue.issueCategoryL1Name}">selected</c:if>>否
                                                </option>
                                            </select></td>
                                        </tr>
                                    </table>
                                    <%@include file="/view/static/common/img.jsp" %>
                                    <input type="hidden" id="issueExtend" name="issueExtend" required="required"
                                           class="form-control col-md-7" value="">
                                    <input type="hidden" id="attach" name="attach" required="required"
                                           class="form-control col-md-7" value="${issue.attach}">
                                </form>

                                <div class="ln_solid"></div>
                                <div class="form-group">
                                    <div style="text-align:center">
                                        <button class="btn btn-success" type="button" data-toggle="modal"
                                                <%--data-target=".this-go"--%> onclick="checkNull()">确认
                                        </button>&nbsp;&nbsp;&nbsp;&nbsp;
                                        <button class="btn btn-default" type="button" data-toggle="modal1"
                                                data-target=".this-close">问题关闭
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
<%--<div class="modal fade this-go" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">确定</h4>
            </div>
            <div class="modal-body">
                <p>确定问题修正完毕，并开始处理吗？</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onClick="checkNull(${issue.id})">确定
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
<!-- 关闭原因 -->
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
                    <button type="button" class="btn btn-primary antoclose2" onclick="closeIssue()">提交</button>
                    <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                </div>
            </div>
        </div>
    </div>
</form>
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
        getSelectlist("#plant", "xf", pid, ${issue.plant});
        getSelectlist("#issueCategoryL2", "l2", pid, ${issue.issueCategoryL2});
        getSelectlist("#failureLocation", "position", pid, '${issue.failureLocation}');
        getSelectlist("#issueCategoryL3", "l2", '${issue.issueCategoryL2}', '${issue.issueCategoryL3}')
        getSemiSupplierCode("#semiSupplierCode", "supplier",127, '${issueExtend.semiSupplierCode}');

        _showPic();
    };

    function checkNull(){
        // $("#demo-form2").validate({
        //     errorClass: "error"
        // })
        // $("#demo-form2").validate();
        if($("#demo-form2").valid()){
            process(${issue.id});
        }
        // return;
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

    });

    //取消
    function cancle() {
        window.location.href = '${webPath}/back/toMachine';
    }
    //关闭
    function closeIssue() {
        /*layer.confirm('确定关闭问题吗?', {icon: 3, title:'提示'}, function(index){*/
        if ($("#form_close").valid()) {
            $('#modal_close').modal('hide');
            $.ajax({
                type: "POST",
                url: "${webPath}/bims/apucheck/closeIssue?id=" +${issue.id},
                data: {},
                dataType: "json",
                success: function (data) {
                    console.log(data);
                    var id = data.obj.id;
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

        /*    layer.close(index);
        });*/
    }
    //获取问题分类下拉
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
                    var html = '<option selected value="">请选择</option>';//$("#wWareId").append("<option selected value='0'>---请选择---</option>");
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
                    $(subject).append("<option selected value='0'>请选择</option>");
                }
            }
        })
    }

    //获取问题分类下拉
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
                    var html = '<option selected value="">请选择</option>';//$("#wWareId").append("<option selected value='0'>---请选择---</option>");
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
                    $(subject).append("<option selected value='0'>请选择</option>");
                }
            }
        })
    }

    //数据校验
    function checking(id) {
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

    }

    /**  select2选择框 **/
    //搜索零件号
    jQuery(document).ready(function () {
        //前置库下拉框
        $('#partNo').select2({
            placeholder: "-- 输入零件号 --",
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
    //回显数据
/*    $(function echoPartNoSelect2(){
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
    })*/
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
                $("#vendorCodeNew").val("");
                $("#vendorName").val("");
                $("#vendorCode").html("<option selected value=''>- 请选择 -</option>");
                for (var i = 0; i < data.length; i++) {
                    //添加option元素
                    $("#vendorCode").append("<option value='" + data[i].supplierName + "'>" + data[i].supplierCode + "</option>");
                }
            },
            error: function (data) {
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

    //确定开始处理
    function process(id) {
        // checking();
        var result = '{"castNo":"' + $("#castNo").val() + '","castSupplierName":"'
            + $("#castSupplierName").val() + '","semiSupplierCode":"'
            + $("#semiSupplierCode").val() + '","semiSupplierName":"' + $("#semiSupplierName").val() + '"}'
        $("#issueExtend").attr("value", result);
        var params = $("#demo-form2").serialize();
        layer.confirm('确定修正问题并开始处理吗?', {icon: 3, title:'提示'}, function(){
        $.ajax({
            type: "POST",
            url: "${webPath}/bims/apucheck/correct?id="+id,
            data: params,
            dataType: "json",
            success: function (data) {
                console.log(data)
                if (data.success) {
                    console.log(data)
                    // layer.msg("已保存");
                    setTimeout(window.location.href = '${webPath}/bims/apucheck/apuEqr?id='+id, 1000);
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
