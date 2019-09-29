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
                <div class="title_left"><h3>SQA 问题处理</h3></div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>提交问题</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                                <li><a class="close-link"><i class="fa fa-close"></i></a></li>
                            </ul>

                            <div class="clearfix"></div>
                        </div>

                        <div class="x_content">
                            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                       style="border-collapse:separate;border-spacing:15px;">
                                    <input type="hidden" id="qualityType" name="qualityType" required="required"
                                           class="form-control" value="S">
                                    <input type="hidden" id="id" name="id" required="required"
                                           class="form-control" value="${issue.id}">
                                    <tr>
                                        <td width="10%" align="right"><strong>厂区： <font color='red'>*</font></strong></td>
                                        <td width="40%"><select name="plant" id="plant" class="form-control" required>
                                            <%--<option value="">请选择</option>
                                            <option value="1">F</option>
                                            <option value="2">X</option>--%>
                                        </select></td>
                                        <td width="10%" align="right"><strong>生产线： <font color='red'>*</font></strong></td>
                                        <td width="40%"><select name="line" id="line" class="form-control" required>
                                            <%--<option value="">请选择</option>
                                            <option value="1">2.8L</option>
                                            <option value="2">3.8L</option>
                                            <option value="3">X</option>--%>
                                        </select></td>

                                    </tr>

                                    <tr>
                                        <td align="right"><strong>零件号： <font color='red'>*</font></strong></td>
                                        <td>
                                            <%--<input type="text" id="partNo" name="partNo" required="required"
                                                   class="form-control" value="扫描+手输 ERP接口验证数据">--%>
                                            <select name="partNo" id="partNo" class="form-control" required></select>
                                        </td>
                                        <td align="right"><strong>零件名称： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="partName" name="partName" required="required"
                                                   class="form-control" value="${issue.partName}" placeholder="零件名称"></td>
                                    </tr>

                                    <tr>
                                        <td align="right"><strong>供应商代码： <font color='red'>*</font></strong></td>
                                        <td>
                                            <%--<input type="text" id="vendorCode" name="vendorCode" required="required"
                                                   class="form-control" value="ERP接口验证数据">--%>
                                            <select id="vendorCode" name="vendorCode"
                                                    class="form-control" required></select>
                                        </td>
                                        <td align="right"><strong>供应商名称： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="vendorName" name="vendorName" required="required" placeholder="供应商名称"
                                                   class="form-control" value="${issue.vendorName}"></td>
                                    </tr>

                                    <tr>
                                        <td width="10%" align="right"><strong>PPAP： <font color='red'>*</font></strong></td>
                                        <td width="40%">
                                            <%--<select id="ppap" name="ppap" class="form-control">
                                            <option value="">请选择---接口ERP</option>
                                            <option value="1">Yes</option>
                                            <option value="2">No</option>
                                            </select>--%>
                                            <input type="text" id="ppap" name="ppap" required="required" placeholder="PPAP"
                                                   class="form-control" value="${issueExtend.ppap}">
                                        </td>

                                        <td align="right"><strong>发动机 ESN： </strong></td>
                                        <td>
                                            <select id="esn" name="esn" class="form-control">

                                            </select>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td align="right"><strong>发动机 SO： </strong></td>
                                        <td>
                                            <%--<select id="so" name="so" class="form-control">
                                            <option value="">请选择</option>
                                            <option value="1">MES</option>
                                            </select>--%>
                                            <input type="text" id="so" name="so" placeholder="发动机SO"
                                                   class="form-control" value="${issue.so}"></td>
                                        </td>
                                        <td align="right"><strong>项目号： </strong></td>
                                        <td><input type="text" id="projectNo" name="projectNo" placeholder="项目号"
                                                   class="form-control" value="${issue.projectNo}"></td>
                                    </tr>


                                    <tr>
                                        <td align="right"><strong>SQI： <font color='red'>*</font></strong></td>
                                        <td>
                                            <%--<input type="text" id="sqi" name="sqi" required="required"
                                                   class="form-control" value="">--%>
                                            <select id="sqi" name="sqi" class="form-control" required>

                                            </select>
                                        </td>
                                        <td align="right"><strong>失效数量： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="qty" name="qty" required="required" placeholder="失效数量"
                                                   class="form-control" value="${issue.qty}"></td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>失效比例： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="failureRatio" name="failureRatio" required="required"
                                                   class="form-control" value="${issueExtend.failureRatio}" placeholder="失效比例"></td>
                                        <td align="right"><strong>Batch info/批次号： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="batchInfo" name="batchInfo" required="required"
                                                   class="form-control" value="${issueExtend.batchInfo}" placeholder="批次号"></td>
                                    </tr>

                                    <tr>
                                        <td align="right"><strong>来源： <font color='red'>*</font></strong></td>
                                        <td><select disabled id="foundSite" name="foundSite" class="form-control" required>
                                            <option value="">请选择</option>
                                            <option value="1" <c:if test="${'1' eq issueExtend.foundSite}">selected</c:if> >IQC</option>
                                            <option value="2" <c:if test="${'2' eq issueExtend.foundSite}">selected</c:if> >On line</option>
                                        </select></td>
                                        <td align="right"><strong>质量追溯码： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="seriesNo" name="seriesNo" required="required"
                                                   class="form-control" value="${issue.seriesNo}" placeholder="质量追溯码"></td>
                                    </tr>

                                    <tr>
                                        <td align="right"><strong>检验员Inspector： <font color='red'>*</font></strong></td>
                                        <td>
                                            <%--<input type="text" id="inspector" name="inspector" required="required"
                                                   class="form-control" value="${issueExtend.inspector}">--%>
                                                <select id="inspector" name="inspector" required="required"
                                                        class="form-control">
                                                </select>
                                        </td>
                                        <td align="right"><strong>问题照片： </strong></td>
                                        <%--<td>
                                            <i class="fa fa-file-image-o" style="font-size:35px; padding-right:10px;vertical-align:middle;"></i>&nbsp;上传图片
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
                                        <td align="right" style="text-align: right"><strong>重复问题： <font color='red'>*</font></strong></td>
                                        <td><select name="issueCategoryL1Name" id="issueCategoryL1Name" class="form-control" required>
                                            <option value="">- 请选择 -</option>
                                            <option value="1" <c:if test="${'1' eq issue.issueCategoryL1Name}">selected</c:if>>是
                                            </option>
                                            <option value="2" <c:if test="${'2' eq issue.issueCategoryL1Name}">selected</c:if>>否
                                            </option>
                                        </select></td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>具体问题描述： <font color='red'>*</font></strong></td>
                                        <td colspan="3"><textarea id="issueDesc" name="issueDesc" cols="200" rows="2"
                                                                  class="form-control" placeholder="具体问题描述" required>${issue.issueDesc}</textarea>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td align="right"><strong>严重程度： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="severity" name="severity" required="required"
                                                   class="form-control" value="${issueExtend.severity}" placeholder="严重程度"></td>
                                        <td align="right"><strong>发生频次： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="occurRate" name="occurRate" required="required"
                                                   class="form-control" value="${issueExtend.occurRate}" placeholder="发生频次"></td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>探测度： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="detection" name="detection" required="required"
                                                   class="form-control" value="${issueExtend.detection}" placeholder="探测度"></td>
                                        <td align="right"><strong>RPN： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="rpn" name="rpn" required="required"
                                                   class="form-control" value="${issueExtend.rpn}" placeholder="RPN"></td>
                                    </tr>

                                    <tr>

                                        <td align="right"><strong>质量问题分类Level1： <font color='red'>*</font></strong></td>
                                        <td>
                                            <select id="issueCategoryL1" name="issueCategoryL1" class="form-control" required>
                                                <option value="">请选择</option>
                                                <option value="1" <c:if test="${'1' eq issue.issueCategoryL1}">selected</c:if> >自制件</option>
                                                <option value="2" <c:if test="${'2' eq issue.issueCategoryL1}">selected</c:if> >采购件</option>
                                                <option value="3" <c:if test="${'3' eq issue.issueCategoryL1}">selected</c:if> >在制发动机</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>质量问题分类Level2： <font color='red'>*</font></strong></td>
                                        <td>
                                            <select id="issueCategoryL2" name="issueCategoryL2" class="form-control" required>
                                                <%--<option>请选择</option>
                                                <option>尺寸问题</option>
                                                <option>外观问题</option>
                                                <option>原料问题</option>--%>
                                            </select>
                                        </td>
                                        <td align="right"><strong>质量问题分类Level3： <font color='red'>*</font></strong></td>
                                        <td>
                                            <select id="issueCategoryL3" name="issueCategoryL3" class="form-control" required>
                                                <%--<option>请选择</option>
                                                <option>异物</option>
                                                <option>理化</option>
                                                <option>颗粒度</option>--%>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>备注：</strong></td>
                                        <td colspan="3"><textarea id="comments" name="comments" cols="200" rows="2"
                                                                  class="form-control" placeholder="请输入备注">${issue.comments}</textarea>
                                        </td>
                                    </tr>
                                </table>
                                <%@include file="/view/static/common/img.jsp" %>
                                <input type="hidden" id="attach" name="attach" required="required"
                                       class="form-control col-md-7" value="${issue.attach}">
                                <input type="hidden" id="issueExtend" name="issueExtend" required="required"
                                       class="form-control col-md-7" value="">
                                <div class="ln_solid"></div>
                                <div class="form-group">
                                    <div style="text-align:center;">
                                        <button class="btn btn-success" type="button" data-toggle="modal"
                                                onclick="checkNull()">提交
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
<div class="modal fade this-go" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">确认</h4>
            </div>
            <div class="modal-body">
                <p>确定将该问题发送至质量部进行处理吗？</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onClick="process(${issue.id});">确定
                </button>
            </div>
        </div>
    </div>
</div>
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
    $("#menuSQA").addClass("current-page");

</script>
<script>
    $('#isIQC input').bind('input propertychange', function() {
        var severity = $("#severity").val();
        var occurRate = $("#occurRate").val();
        var detection = $("#detection").val();
        var rpn = severity*occurRate*detection;
        $("#rpn").val(rpn);
    });
    window.onload = function () {
        var pid = 0;
        getSelectlist("#plant", "xf", pid,'${issue.plant}');
        getSelectlist("#line", "line", '${issue.plant}','${issueExtend.line}');
        getSelectlist("#issueCategoryL2", "l2", pid, '${issue.issueCategoryL2}');
        getSelectlist("#failureLocation", "position", pid, '${issue.failureLocation}');
        getSelectlist("#issueCategoryL3", "l2", '${issue.issueCategoryL2}', '${issue.issueCategoryL3}')

        _showPic();

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
        $("#plant").change(function () {
            $("#line").empty();
            var val = $("#plant").val();
            type = "line";
            pid = val;
            getSelectlist("#line", type, pid);
        })
    })
    //根据不同选项显示不同表格
    /*$(function () {
        $("#issueCategoryL1").change(function () {
            var val = $("#issueCategoryL1").val();
            switch (val) {
                case '1':
                    $('#d3,#d4').show();
                    $('#d1,#d2').hide();
                    break;
                case '2':
                    $('#d1,#d2').show();
                    $('#d3,#d4').hide();
                    break;
                case '3':
                    $('#d1,#d2').show();
                    $('#d3,#d4').hide();
                    break;
            }
        })
    })*/
    var esn;
    $(function () {
        esn = $("#esn");
        initSelectEsn();
    });

    function initSelectEsn() {
        esn.select2({
            ajax: {
                url: function (params) {
                    return "${webPath}/Esn/fuzzyQueryEsn/" + params.term;
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
            placeholder: "输入ESN搜索...",
            escapeMarkup: function (markup) {
                return markup;
            }, // 让template的html显示效果，否则输出代码
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
                url: "${webPath}/Esn/queryItemNumberByEsn/" + esn,
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
                    <%--return "${webPath}/Components/fuzzyQueryComponents/" + params.term;--%>
                    return "${webPath}/Supplier/partNumberlike?partNo="+ params.term;
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
            url: "${webPath}/Components/getPartNameByPartNumber/" + partNumber,
            data: {},
            dataType: "json",
            success: function (data) {
                $("#partName").val(data.partName);
            },
            error: function (data) {
            }
        });
    });

    $("#partNo").on("select2:select", function (evt) {
        //这里是选中触发的事件
        //evt.params.data 是选中项的信息
        var partNumber = evt.params.data.text;
        $.ajax({
            type: "POST",
            url: "${webPath}/Components/queryVendorCodeByPartNumber/" + partNumber,
            data: {},
            dataType: "json",
            success: function (data) {
                console.log(data)
                //添加select第一个option
                $("#vendorCode").append("<option selected value=''>---请选择---</option>");
                for (var i = 0; i < data.length; i++) {
                    //添加option元素
                    $("#vendorCode").append("<option value='" + data[i] + "'>" + data[i] + "</option>");
                }
            },
            error: function (data) {
            }
        });
    });*/
    //
    $("#vendorCode").change(function () {
        // var vendorCode = $(this).val();
        var vendorCode = $("#vendorCode option:selected").text();
        $.ajax({
            type: "POST",
            url: "${webPath}/Supplier/getSupplierNameBycode/" + vendorCode,
            data: {},
            dataType: "json",
            success: function (data) {
                console.log(data)
                $("#vendorName").val(data.supplierName);
            },
            error: function (data) {
            }
        });

        var partNo = '${issue.partNo}';
        $.ajax({
            type: "POST",
            url: "${webPath}/Supplier/partNumberSupplierCodeBringsOutPpap/" + partNo + "/" + vendorCode,
            data: {},
            dataType: "",
            success: function (data) {
                $("#ppap").val(data);
            },
            error: function (data) {
            }
        });

        $.ajax({
            type: "POST",
            url: "${webPath}/SqI/querySqI/" + vendorCode,
            data: {},
            dataType: "json",
            success: function (data) {
                for (var i = 0; i < data.length; i++) {
                    $("#sqi").append("<option value='" + data[i].sqieNumber + "'>" + data[i].sqieName + "</option>");
                }
            },
            error: function (data) {
            }
        });
    })
    //选择质检员
    $("#vendorCode").change(function () {
        getInspectors();

        /*var vendorCode = $("#vendorCode option:selected").val();
        var plant = $("#plant option:selected").val();
        var plantType = "";
        plant == "1"? plantType = "X" : plantType = "F";
        $.ajax({
            type: "POST",
            url: "${webPath}/inspector/getInspectors",
            data: {
                supplierNo: vendorCode,
                type: plantType,
            },
            dataType: "json",
            success: function (data) {
                //添加select第一个option
                var html = '<option selected value="">请选择</option>';
                var list = data.obj;
                for(var i = 0; i < list.length; i++) {
                    //添加option元素
                    html+=("<option value='" + list[i].inspectorName + "'>" + list[i].inspectorName + "</option>");
                }
                $("#inspector").html(html)
            },
            error: function (data) {
            }
        });*/
    })
    //回显数据
    $(function echoPartNoSelect2(){
        var dom = $("#partNo");
        var partNo = '${issue.partNo}'
        $.ajax({
            <%--url: "${webPath}/Components/fuzzyQueryComponents/"+partNo ,--%>
            url: "${webPath}/Supplier/partNumberlike?partNo="+partNo ,
            type: "get",
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
    })
    $(function echoVendorCodeSelect2(){
        var dom = $("#vendorCode");
        var partNo = '${issue.partNo}'
        var vendorCode = '${issue.vendorCode}'
        $.ajax({
            url: "${webPath}/Components/queryVendorCodeByPartNumber/"+partNo ,
            type: "POST",
            dataType: "json",
            data: {},
            success: function (ajaxJson) {
                console.log(ajaxJson)
                var value = ajaxJson
                $.each(value, function (index, vendorCode) {
                    if (value == vendorCode) {
                        $(dom).append(new Option(value, value, false, true));
                    }
                });
                $(dom).trigger("change");
            }
        })
    })
    $(function echoEsnSelect2(){
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
    })

    //保存
    function process(id) {
        var params = $("#demo-form2").serialize();
        $.ajax({
            type: "POST",
            url: "${webPath}/bims/apucheck/correct",
            data: params,
            dataType: "json",
            success: function (data) {
                if (data.success) {
                    layer.msg("已保存");
                    setTimeout(window.location.href = '${webPath}/back/toSqa', 1000);
                } else {
                    layer.msg(data.msg);
                }
            },
            error: function (data) {
                layer.msg(data.msg);
            }
        });
    }

    //确认发送
    /*function confirm() {
        var val = $("#issueCategoryL1").val();
        if (val == 1) {
            layer.confirm('确定将该问题发送至SQA进行处理吗？', {
                btn: ['确定', '取消'] //按钮
            }, function () {
                var partNo = $("#partNo").val();
                if (partNo == null || partNo == '') {
                    layer.msg('请输入零件号！');
                    return;
                }
                checking();

            });
        } else if (val == 3 || val == 2) {
            layer.confirm('确定将该问题发送至质量部进行处理吗？', {
                btn: ['确定', '取消'] //按钮
            }, function () {
                var esn = $("#esn").val();
                if (esn == null || esn == '') {
                    layer.msg('请输入ESN！');
                    return;
                }
                checking();
            });
        } else {
            layer.msg('请选择问题分类！');
            return;
        }

    }*/

    function checkNull(){
        $("#demo-form2").validate({
            errorClass: "error"
        })
        $("#demo-form2").validate();
        if($("#demo-form2").valid()){
            // $(".this-go").modal("show");
            checking();
        }
        return;
    };
    function check(e) {
        var re = /^\d{1,10}$/;
        if (e.value != "") {
            if (!re.test(e.value)) {
                e.value = "";
                e.focus();
            }
        }
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
        var line = $("#line option:selected").val();
        if (line == null || line == '') {
            layer.msg('请选择产线！');
            return;
        }
        var ppap = $("#ppap").val();
        if (ppap == null || ppap == '') {
            layer.msg('请选择是否PPAP！');
            return;
        }

        /*var esn = $("#esn option:selected").val();
        if (esn == null || esn == '') {
            layer.msg('请输入ESN！');
            return;
        }*/

        /*var so = $("#so").val();
        if (so == null || so == '') {
            layer.msg('请输入SO！');
            return;
        }*/
        var partNo = $("#partNo").val();
        if (partNo == null || partNo == '') {
            layer.msg('请填写零件号！');
            return;
        }
        var vendorCode = $("#vendorCode").val();
        if (vendorCode == null || vendorCode == '') {
            layer.msg('请填写供应商代码！');
            return;
        }

        /*var projectNo = $("#projectNo").val();
        if (projectNo == null || projectNo == '') {
            layer.msg('请输入项目号！');
            return;
        }*/
        var issueCategoryL1 = $("#issueCategoryL1 option:selected").val();
        if (issueCategoryL1 == null || issueCategoryL1 == '') {
            layer.msg('请选择问题质量分类1！');
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
        var sqi = $("#sqi").val();
        if(regEn.test(sqi) || regCn.test(sqi)) {
            layer.msg("SQI不能包含特殊字符.");
            return;
        }
        if (sqi == null || sqi == '') {
            layer.msg('请填写SQI！');
            return;
        }
        var failureRatio = $("#failureRatio").val();
        if(regEn.test(failureRatio) || regCn.test(failureRatio)) {
            layer.msg("失效比例不能包含特殊字符.");
            return;
        }
        if (failureRatio == null || failureRatio == '') {
            layer.msg('请填写失效比例！');
            return;
        }
        var qty = $("#qty").val();
        if (qty == null || qty == '') {
            layer.msg('请填写失效数量！');
            return;
        }

        var batchInfo = $("#batchInfo").val();
        if(regEn.test(batchInfo) || regCn.test(batchInfo)) {
            layer.msg("批次号不能包含特殊字符.");
            return;
        }
        if (batchInfo == null || batchInfo == '') {
            layer.msg('请填写批次号！');
            return;
        }
        var foundSite = $("#foundSite").val();
        if(regEn.test(foundSite) || regCn.test(foundSite)) {
            layer.msg("来源不能包含特殊字符.");
            return;
        }
        if (foundSite == null || foundSite == '') {
            layer.msg('请选择来源！');
            return;
        }
        var seriesNo = $("#seriesNo").val();
        if (seriesNo == null || seriesNo == '') {
            layer.msg('请填写质量追溯码！');
            return;
        }
        var inspector = $("#inspector").val();
        if (inspector == null || inspector == '') {
            layer.msg('请填写检验员！');
            return;
        }
        var severity = $("#severity").val();
        if(regEn.test(severity) || regCn.test(severity)) {
            layer.msg("严重程度不能包含特殊字符.");
            return;
        }
        if (severity == null || severity == '') {
            layer.msg('请填写严重程度！');
            return;
        }
        var occurRate = $("#occurRate").val();
        if(regEn.test(occurRate) || regCn.test(occurRate)) {
            layer.msg("发生频次不能包含特殊字符.");
            return;
        }
        if (occurRate == null || occurRate == '') {
            layer.msg('请填写发生频次！');
            return;
        }
        var detection = $("#detection").val();
        if(regEn.test(detection) || regCn.test(detection)) {
            layer.msg("探测度不能包含特殊字符.");
            return;
        }
        if (detection == null || detection == '') {
            layer.msg('请填写探测度！');
            return;
        }
        var rpn = $("#rpn").val();
        if(regEn.test(rpn) || regCn.test(rpn)) {
            layer.msg("RPN不能包含特殊字符.");
            return;
        }
        if (rpn == null || rpn == '') {
            layer.msg('请填写RPN！');
            return;
        }

        var issueExtend = $("#issueExtend").val();
        var result = '{"line":"' + line + '","ppap":"' + ppap + '","sqi":"' + sqi + '","failureRatio":"' + failureRatio + '","batchInfo":"' + batchInfo + '","foundSite":"' + foundSite + '","inspector":"' + inspector + '","severity":"' + severity + '","occurRate":"' + occurRate + '","detection":"' + detection + '","rpn":"' + rpn + '"}'
        $("#issueExtend").attr("value", result);

        process('${issue.id}');
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

    function getInspectors(dom, type, pid, selectId) {
        var selectId = '${issueExtend.inspector}';
        var subject = $("#inspector");//元素
        var vendorCode = $("#vendorCode option:selected").val();
        var plant = $("#plant option:selected").val();
        var plantType = "";
        plant == "1"? plantType = "X" : plantType = "F";
        $.ajax({
            type: "POST",
            url: "${webPath}/inspector/getInspectors",
            data: {
                supplierNo: vendorCode,
                type: plantType,
            },
            dataType: "json",
            success: function (data) {
                //添加select第一个option
                var html = '';
                var list = data.obj;
                for(var i = 0; i < list.length; i++) {
                    var checked = "";
                    if (list[i].inspectorName == selectId) {
                        checked = "selected=\"selected\"";
                    }
                    //添加option元素
                    html+="<option " + checked + "  value='" + list[i].inspectorName + "'>" + list[i].inspectorName + "</option>";
                }
                subject.append(html)
            },
            error: function (data) {
            }
        });
        /*$.ajax({
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
                    var html = '<option selected value=0>请选择</option>';//$("#wWareId").append("<option selected value='0'>---请选择---</option>");
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
        })*/
    }

    //取消
    function cancle() {
        window.location.href = '${webPath}/back/toApu';
    }

</script>
</body>
</html>
