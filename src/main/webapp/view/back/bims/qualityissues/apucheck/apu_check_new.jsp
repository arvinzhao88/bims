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
                <div class="title_right"></div>
                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>问题录入</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                                </ul>

                                <div class="clearfix"></div>
                            </div>

                            <div class="x_content">
                                <form id="demo-form2" data-parsley-validate="validate" class="form-horizontal form-label-left">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                           style="border-collapse:separate;border-spacing:15px;">
                                        <input type="hidden" id="qualityType" name="qualityType"
                                               class="form-control" value="A">
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
                                                       required="required" class="form-control" placeholder="请输入工位">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Area/区域： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select name="area" id="area" class="form-control" required>
                                                    <option value="">- 请选择 -</option>
                                                    <%--<option>2.8A1</option>
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
                                                <input id="seriesNo" name="seriesNo"
                                                       class="form-control" placeholder="请输入序列号" required>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Issue Description/具体问题描述： <font color='red'>*</font></strong></td>
                                            <td colspan="3"><textarea id="issueDesc" name="issueDesc" cols="200"
                                                                      rows="2" class="form-control" required
                                                                      placeholder="请输入具体问题描述"></textarea></td>
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
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Issue Category L1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level1： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="issueCategoryL1" name="issueCategoryL1" required
                                                        class="form-control">
                                                    <option value="">- 请选择 -</option>
                                                    <%--<option value="1">自制件</option>--%>
                                                    <option value="2">采购件</option>
                                                    <option value="3">在制发动机</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr id="d1" style="display:none;">
                                            <td align="right" style="text-align: right"><strong>ESN ： <font color='red'>*</font></strong></td>
                                            <td>
                                                <%--<input id="esn" name="esn" class="form-control" required
                                                       style="width:45%;float:left;">--%>
                                                    <select class="form-control" name="esn" id="esn" required class="form-control">
                                                    </select>
                                                    <%--<input type="text" id="so" name="so" required="required"
                                                           class="form-control" style="width:45%; float:right;"
                                                           placeholder="SO">--%>

                                                <%--<select class="form-control" name="so" id="so" required
                                                        style="width:50%; float:right;">
                                                    <option value="">请选择</option>
                                                    <option value="1">SO17148</option>
                                                    <option value="2">SO17160</option>
                                                </select>--%>
                                            </td>
                                            <td align="right" style="text-align: right"><strong>SO ： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="so" name="so" required="required"
                                                       class="form-control col-md-7"
                                                       placeholder="SO"></td>
                                        </tr>

                                        <tr id="d2" style="display:none;">
                                            <td align="right" style="text-align: right"><strong>Engine Type/机型 ： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="engineType" name="engineType" required="required"
                                                       class="form-control col-md-7"
                                                       placeholder="请输入机型"></td>
                                            <td align="right" style="text-align: right"><strong>VPI Project/项目号： <font color='red'>*</font></strong></td>
                                            <td>
                                                <input type="text" id="projectNo" name="projectNo" required="required"
                                                       class="form-control col-md-7"
                                                       placeholder="项目号">
                                                <%--<select name="projectNo" id="projectNo" class="form-control" required>
                                                    <option value="">请选择</option>
                                                    <option value="1">项目1</option>
                                                    <option value="2">项目2</option>
                                                    <option value="3">项目3</option>
                                                </select>--%>
                                            </td>
                                            <%--<td align="right" style="text-align: right"><strong>发动机系列 ： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="engineSeries" name="engineSeries"
                                                       required="required" class="form-control col-md-7"
                                                       value=""></td>--%>
                                        </tr>
                                        <%--<tr>
                                            <td colspan="4" align="center" style="border-top: #CCCCCC 1px dashed; height:1px;">
                                                说明：质量分类选1零件质量，显示以下内容
                                            </td>
                                        </tr>--%>
                                        <tr id="d3" style="display:none;">
                                            <td align="right" style="text-align: right"><strong>Part Number/零件号 ： <font color='red'>*</font></strong></td>
                                            <td>
                                                <%--<input type="text" id="partNo" name="partNo" required="required"
                                                       class="form-control" value="">--%>
                                                <select name="partNo" id="partNo" class="form-control" required="required">
                                                </select>
                                            </td>
                                            <td align="right" style="text-align: right"><strong>Part Name/零件名称 ： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="partName" name="partName" required="required"
                                                       class="form-control" placeholder="零件名称"></td>
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

                                        <%--<tr>
                                            <td colspan="4" align="right" style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
                                        </tr>--%>

                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Failure Qty./数量 ： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="qty" name="qty" required="required"  onblur="check(this)" onkeyup="this.value=this.value.replace(/[^0-9.]/g,'')"
                                                       class="form-control col-md-7"
                                                       placeholder="请输入数量"></td>
                                            <td align="right" style="text-align: right"><strong>Attach./照片附件 ： </strong></td>
                                            <td class="list-img">
                                                <div id="preview" class="clear">
                                                    <li class="fl" style="margin-left: -1%;">
                                                        <img src="${resPath}/view/static/images/icon_upload.png">
                                                        <input id="fileImage" type="file" name="file[]" multiple/>
                                                       <%-- <div class="num">0/6</div>--%>
                                                    </li>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Issue Category L2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level2 ： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="issueCategoryL2" name="issueCategoryL2" required
                                                        class="form-control">
                                                    <%--<option>请选择</option>
                                                    <option>尺寸问题</option>
                                                    <option>外观问题</option>
                                                    <option>原料问题</option>--%>
                                                </select>
                                            </td>
                                            <td align="right" style="text-align: right"><strong>Issue Category L3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>质量问题分类Level3 ： <font color='red'>*</font></strong></td>
                                            <td>
                                                <select id="issueCategoryL3" name="issueCategoryL3" required
                                                        class="form-control">
                                                    <option value="">- 请选择 -</option>
                                                    <%--<option>异物</option>
                                                    <option>理化</option>
                                                    <option>颗粒度</option>--%>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>RFT ： <font color='red'>*</font></strong></td>
                                            <td><select name="isRft" id="isRft" class="form-control" required>
                                                <option value="">- 请选择 -</option>
                                                <option value="1">是</option>
                                                <option value="2">否</option>
                                            </select></td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>是否批量 ： <font color='red'>*</font></strong></td>
                                            <td><select name="issueCategoryL1Name" id="issueCategoryL1Name" class="form-control" required>
                                                <option value="">- 请选择 -</option>
                                                <option value="1">是</option>
                                                <option value="2">否</option>
                                            </select></td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Comments/备注 ：</strong></td>
                                            <td colspan="3"><textarea id="comments" name="comments" cols="200" rows="2"
                                                                      class="form-control"
                                                                      placeholder="请输入备注"></textarea></td>
                                        </tr>
                                    </table>
                                    <%@include file="/view/static/common/img.jsp" %>
                                    <input type="hidden" id="attach" name="attach" required="required"
                                           class="form-control col-md-7" value="">
                                    <div class="ln_solid"></div>


                                    <div class="form-group">
                                        <div style="text-align:center">
                                            <button class="btn btn-primary" type="button" <%--data-toggle="modal"--%>
                                                    onclick="checkNull()">确认
                                            </button>
                                            <%--&nbsp;&nbsp;&nbsp;&nbsp;
                                            <button class="btn btn-success" type="button" data-toggle="modal"
                                                    data-target=".this-true" onclick="confirm()">
                                                新建完成
                                            </button>--%>
                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                            <button class="btn btn-default" type="button" <%--data-toggle="modal1"--%>
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
<%--<div class="modal fade this-true" tabindex="-1" role="dialog" aria-hidden="true" >
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
            <h4 class="modal-title" id="myModalLabel">确认</h4>
            </div>
            <div class="modal-body">
            <p>确定提交并开始处理吗?</p>
            </div>
            <div class="modal-footer">
        <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
        <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="checkNull()">确定</button>
      </div>
        </div>
    </div>
</div>--%>
<!-- 遮蔽内容结束 -->
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

<%@include file="/view/static/common/core_js.jsp" %>
</body>
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
    window.onload = function () {
        var pid = 0;
        getSelectlist("#plant", "xf", pid);
        getSelectlist("#issueCategoryL2", "l2", pid);
        getSelectlist("#failureLocation", "position", pid);
    }
    function checkNull(){
        // $("#demo-form2").validate({
        //     errorClass: "error"
        // })
        // $("#demo-form2").validate();
        if($("#demo-form2").valid()){
            layer.confirm('确定提交问题并开始处理吗？', {icon: 3, title:'系统提示'}, function(index){
                saveIssue();
                layer.close(index);
            });
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
    //根据不同选项显示不同表格
    $(function () {
        $("#issueCategoryL1").change(function () {
            var val = $("#issueCategoryL1").val();
            switch (val) {
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
    })


    //保存
    function saveIssue() {
        // layer.confirm('确定提交并开始处理吗?', {icon: 3, title:'提示'}, function(index){
            var params = $("#demo-form2").serialize();
            $.ajax({
                type: "POST",
                url: "${webPath}/bims/apucheck/add",
                data: params,
                dataType: "json",
                success: function (data) {
                    console.log(data);
                    if (data.success) {
                        var id = data.obj;
                        console.log(data);
                        layer.msg("操作成功");
                        setTimeout(window.location.href = '${webPath}/bims/apucheck/apuEqr?id=' + id, 1000);
                    } else {
                        layer.msg(data.msg);
                    }
                },
                error: function (data) {
                    layer.msg(data.msg);
                }
            });
        // });
    }

    //确认发送
    function confirm() {
        var val = $("#issueCategoryL1").val();
        if (val == 1) {
            layer.confirm('确定将该问题发送至SQA进行处理吗?', {icon: 3, title:'提示'}, function(index){
                checking();
                var partNo = $("#partNo").val();
                if (partNo == null || partNo == '') {
                    layer.msg('请输入零件号！');
                    return;
                }
                layer.close(index);
            });

        } else if (val == 3 || val == 2) {
            layer.confirm('确定将该问题发送至质量部进行处理吗？', {icon: 3, title:'提示'}, function(index){
                checking();
                var esn = $("#esn").val();
                if (esn == null || esn == '') {
                    layer.msg('请输入ESN！');
                    return;
                }

                layer.close(index);
            });
        } else {
            layer.msg('请选择问题分类！');
            return;
        }

    }

    //数据校验
    function checking() {
        //$('#demo-form2').parsley().validate();
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
        var isRft = $("#isRft option:selected").val();
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
            var partName = $("#partName").val();
            if (partName == null || partName == '') {
                layer.msg('请输入零件名称！');
                return;
            }

            var vendorCode = $("#vendorCode option:selected").val();
            if (vendorCode == null || vendorCode == '') {
                layer.msg('请选择供应商代码！');
                return;
            }

            var vendorName = $("#vendorName").val();
            if (vendorName == null || vendorName == '') {
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
/*
            var engineSeries = $("#engineSeries").val();
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
        saveIssue();
    }

    //获取下拉框
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
                    $(subject).html(html);
                } else {
                    $(subject).html("<option selected value='0'>请选择</option>");
                }
            }
        })
    }

    //取消
    function cancle() {
        window.location.href = '${webPath}/back/toApu';
    }

    /**  select2选择框 **/
    //搜索零件号
    jQuery(document).ready(function() {
        //前置库下拉框
        $('#partNo').select2({
            placeholder: "请输入零件号",
            language: "zh-CN",
            minimumInputLength: 1,
            allowClear: true,
            width: '100%',
            escapeMarkup: function (markup) { return markup; }, // 让template的html显示效果，否则输出代码
            ajax: {
                url: function (params) {
                    /*return "${webPath}/Components/fuzzyQueryComponents/"+ params.term;*/
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
            /*url: "${webPath}/Components/getPartNameByPartNumber/"+partNumber,*/
            url: "${webPath}/Supplier/getSupplierByPartNo?partNo="+partNumber,
            data: {},
            dataType: "json",
            success: function (data) {
                console.info(data);
                if(data != null && data.length > 0) {
                    $("#partName").val(data[0].partName);
                    $("#vendorCode").html("<option selected value=''>- 请选择 -</option>");
                    for(var i = 0; i < data.length; i++) {
                        //添加option元素
                        $("#vendorCode").append("<option value='" + data[i].supplierName + "'>" + data[i].supplierCode + "</option>");
                    }
                } else {
                    $("#partName").val("");
                    $("#vendorCode").html("<option selected value=''>- 请选择 -</option>");
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
                    $("#vendorCode").append("<option value='" + data[i] + "'>" + data[i] + "</option>");
                }
            },
            error: function (data) {
            }
        });
    });*/

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
        /*$.ajax({
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
                    /*$(data).each(function(i, o) {
                        alert(o);
                        options.push({　
                            id : o[i],         //取出items中Code赋值给id
                            text : o[i]    //取出items中CodeName赋值给text
                        });
                    });
                    return {
                        results: options        //返回数据
                    };*/
                },
                cache: true
            },

            width: '100%',
            allowClear: true,    //选中之后，可手动点击删除
            placeholder: "请输入ESN",
            escapeMarkup: function (markup) { return markup; }, // 让template的html显示效果，否则输出代码
            minimumInputLength: 1,    //搜索框至少要输入的长度，此处设置后需输入才显示结果
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
                    $("#seriesNo").val(esn); // 如果是在制发动机，序列号和ESN相同
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

    /*function formatTelehoneNumber(item) {
        if (item.loading) return item;
        var markup = '<div> <p class="text-primary">电话号码：' + item.TelephoneNumber + '</p>';
        //markup += '这里可以添加其他选项...';
        markup += ' </div>';
        return markup;
    }


    function formatTelehoneNumberSelection(item) {
        if (item.TelephoneNumber) {
            return item.TelephoneNumber;
        }
        else {
            return "输入号码搜索...";
        }
    }*/
</script>
</html>
