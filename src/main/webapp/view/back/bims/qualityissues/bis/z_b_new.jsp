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
                <div class="title_left"><h3>BIS 提交问题</h3></div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>内容</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content">
                            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                       style="border-collapse:separate;border-spacing:15px;">
                                    <input type="hidden" id="qualityType" name="qualityType" required="required"
                                           class="form-control" value="B">
                                    <tr>
                                        <td width="15%" align="right"><strong>Plant/工厂： <font color='red'>*</font></strong></td>
                                        <td width="35%">
                                            <select name="plant" id="plant" class="form-control" required>
                                                <%--<option value="">请选择</option>
                                                <option value="1">F</option>
                                                <option value="2">X</option>--%>
                                            </select>
                                        </td>
                                        <td width="10%" align="right"><strong>Issue Type/问题类型： <font color='red'>*</font></strong></td>
                                        <td width="40%"><select name="issueType" id="issueType" class="form-control" required>
                                            <option value="">请选择</option>
                                            <option value="1">BIS</option>
                                            <option value="2">CR</option>
                                            <option value="3">REIGECT</option>
                                        </select></td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>Failure Date/失效日期： <font color='red'>*</font></strong></td>
                                        <td><input readonly type="text" id="date_info" name="failureDate" required="required"
                                                   class="layui-input" value=""></td>
                                        <td align="right"><strong>Customer/客户名称： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="customer" name="customer" required="required"
                                                   class="form-control" value="" placeholder="客户名称"></td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>OEM/主机厂名称： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="oem" name="oem" required="required"
                                                   class="form-control" value="" placeholder="主机厂名称"></td>
                                        <td align="right"><strong>发动机 ESN：</strong></td>
                                        <td>
                                            <select id="esn" name="esn" class="form-control" required>

                                            </select>
                                        </td>


                                    </tr>
                                    <tr>
                                        <td align="right"><strong>Engine SO/发动机 SO： <font color='red'>*</font></strong></td>
                                        <td>
                                            <%--<select id="so" name="so" class="form-control">
                                            <option value="">请选择</option>
                                            <option value="1">MES</option>
                                            </select>--%>
                                            <input type="text" id="so" name="so" required="required"
                                                   class="form-control" value="" placeholder="发动机SO"></td>
                                        </td>
                                        <td align="right"><strong>Engine Type/机型： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="engineType" name="engineType" required="required"
                                                   class="form-control" value="" placeholder="机型"></td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>Failure Qty./数量： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="qty" name="qty" required="required" onblur="check(this)" onkeyup="this.value=this.value.replace(/[^0-9.]/g,'')"
                                                   class="form-control" value="" placeholder="请输入数字"></td>
                                        <td align="right"><strong>Build Date/生产日期： <font color='red'>*</font></strong></td>
                                        <td>
                                            <%--<input type="text" id="productionDate" name="productionDate"
                                                   required="required" class="form-control" value="">--%>
                                            <input readonly type="text" id="productionDate" name="productionDate" required="required"
                                                   class="layui-input" value="" placeholder="生产日期">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>Part Number/零件号： <font color='red'>*</font></strong></td>
                                        <td>
                                            <select id="partNo" name="partNo" class="form-control" required>

                                            </select>
                                        </td>
                                        <td align="right"><strong>Part Name/零件名称： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="partName" name="partName" required="required"
                                                   class="form-control" value="" placeholder="零件名称"></td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>Supplier Code/供应商代码： <font color='red'>*</font></strong></td>
                                        <td>
                                            <%--<input type="text" id="vendorCode" name="vendorCode" required="required"
                                                   class="form-control" value="">--%>
                                            <select  id="vendorCode" class="form-control col-md-7" required>
                                            </select>
                                            <input type="hidden" id="vendorCodeNew" name="vendorCode">
                                        </td>
                                        <td align="right"><strong>Supplier Name/供应商名称： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="vendorName" name="vendorName" required="required"
                                                   class="form-control" value="" placeholder="供应商名称"></td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>S/N 序列号： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="seriesNo" name="seriesNo" required="required"
                                                   class="form-control" value="" placeholder="序列号"></td>
                                        <td align="right"><strong>问题状态： <font color='red'>*</font></strong></td>
                                        <td><select id="statusColor" name="statusColor" class="form-control" required>
                                            <option value="">选择</option>
                                            <option value="1">Green</option>
                                            <option value="2">Yellow</option>
                                            <option value="3">Red</option>
                                            <option value="4">Blue</option>
                                        </select></td>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>Claim/是否索赔： <font color='red'>*</font></strong></td>
                                        <td><select id="isClaim" name="isClaim" class="form-control" required>
                                            <option value="">选择</option>
                                            <option value="1" selected>NO</option>
                                            <option value="2">YES</option>
                                        </select></td>
                                        <td align="right"><strong>Claim form number/索赔单号： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="claimNumber" name="claimNumber" required="required"
                                                   class="form-control" value="" placeholder="索赔单号"></td>
                                    </tr>
                                    <tr>
                                        <td align="right"><strong>Open Days/开放天数： <font color='red'>*</font></strong></td>
                                        <td><input type="text" id="openDays" name="openDays" required="required"
                                                   class="form-control" value="" placeholder="开放天数"></td>
                                        <td align="right"><strong>Count in PPM/计入指标： <font color='red'>*</font></strong></td>
                                        <td><select id="isCountindex" name="isCountindex" class="form-control" required>
                                            <option value="">选择</option>
                                            <option value="1" selected>YES</option>
                                            <option value="2">NO</option>
                                        </select></td>
                                    </tr>

                                    <tr>
                                        <td align="right"><strong>Comments/备注：</strong></td>
                                        <td colspan="3"><textarea id="comments" name="comments" cols="200" rows="2"
                                                                  class="form-control" placeholder="备注"></textarea>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td align="right"><strong>Issue Description/具体问题描述： <font color='red'>*</font></strong></td>
                                        <td colspan="3"><textarea id="issueDesc" name="issueDesc" cols="200" rows="2"
                                                                  class="form-control" placeholder="具体问题描述" required></textarea>
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
                                <input type="hidden" id="issueExtend" name="issueExtend" required="required"
                                       class="form-control col-md-7" value="">
                                <div class="ln_solid"></div>
                                <div class="form-group">
                                    <div style="text-align:center">
                                        <%--<button class="btn btn-primary" type="button" data-toggle="modal"
                                                data-target=".this-save" onclick="checking()">保存
                                        </button>--%>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <button class="btn btn-primary" type="button" data-toggle="modal"
                                                 onclick="checkNull()">确认
                                        </button>
                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                            <button class="btn btn-default" type="button" data-toggle="modal1"
                                                    data-target=".this-true"
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
<div class="modal fade this-true" tabindex="-1" role="dialog" aria-hidden="true" >
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:400px;">
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
        <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="saveIssue()">确定</button>
      </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->

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
    $("#menuBIS").addClass("current-page");

</script>

<script>
    layui.use('laydate', function() {
        var laydate = layui.laydate;

        //常规用法
        laydate.render({
            elem: '#date_info',
        });
        laydate.render({
            elem: '#productionDate'
        });
    });
    window.onload = function () {
        var pid = 0;
        getSelectlist("#plant", "xf", pid);
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
                    var html = '<option selected value="">请选择</option>';
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
                    $(subject).append("<option selected value='0'>请选择</option>");
                }
            }
        })
    }

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
                    <%--return "${webPath}/Components/fuzzyQueryComponents/"+ params.term;--%>
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
            <%--url: "${webPath}/Components/getPartNameByPartNumber/"+partNumber,--%>
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
                $("#vendorCode").append("<option selected value=''>---请选择---</option>");
                for(var i = 0; i < data.length; i++) {
                    //添加option元素
                    $("#vendorCode").append("<option value='" + data[i] + "'>" + data[i] + "</option>");
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
    })


    $(document).ready(function () {
        var time = new Date();
        var day = ("0" + time.getDate()).slice(-2);
        var month = ("0" + (time.getMonth() + 1)).slice(-2);
        var today = time.getFullYear() + "-" + (month) + "-" + (day);
        $('#date_info').val(today);
        $('#productionDate').val(today);
    })

    //返回
    function cancle() {
        window.location.href = '${webPath}/back/toBis';
    }
    //保存
    function saveIssue() {
        layer.confirm('确定提交问题并开始处理吗？', {icon: 3, title: '系统提示'}, function (index) {
            var params = $("#demo-form2").serialize();
            $.ajax({
                type: "POST",
                url: "${webPath}/bims/apucheck/add",
                data: params,
                dataType: "json",
                success: function (data) {
                    console.log(data)
                    var id = data.obj.id;
                    if (data.success) {
                        console.log(data)
                        layer.msg("已保存");
                        setTimeout(window.location.href = '${webPath}/back/toBis', 1000);
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

    function checkNull(){
        $("#demo-form2").validate({
            errorClass: "error"
        })
        $("#demo-form2").validate();
        if($("#demo-form2").valid()){
            //$(".this-true").modal("show");
            checking();
        }
        return;
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
    //数据校验
    function checking() {
        var regEn = /[`~!@#$%^&*()_+<>?:"{},.\/;'[\]]/im,
            regCn = /[·！#￥（——）：；“”‘、，|《。》？、【】[\]]/im;

        var plant = $("#plant option:selected").val();
        if (plant == null || plant == '') {
            layer.msg('请选择厂区！');
            return;
        }
        var issueType = $("#issueType option:selected").val();
        if (issueType == null || issueType == '') {
            layer.msg('请选择问题类型！');
            return;
        }

        var oem = $("#oem").val();
        if(regEn.test(oem) || regCn.test(oem)) {
            layer.msg("oem不能包含特殊字符.");
            return;
        }
        if (oem == null || oem == '') {
            layer.msg('请输入主机厂名称！');
            return;
        }

        var esn = $("#esn").val();
        if (esn == null || esn == '') {
            layer.msg('请填写ESN！');
            return;
        }
        var so = $("#so").val();
        if (so == null || so == '') {
            layer.msg('请填写SO！');
            return;
        }
        var engineType = $("#engineType").val();
        if (engineType == null || engineType == '') {
            layer.msg('请输入机型！');
            return;
        }

        var qty = $("#qty").val();
        if (qty == null || qty == '') {
            layer.msg('请输入数量！');
            return;
        }
        var issueDesc = $("#issueDesc").val();
        if (issueDesc == null || issueDesc == '') {
            layer.msg('请输入问题描述！');
            return;
        }
        var customer = $("#customer").val();
        if(regEn.test(customer) || regCn.test(customer)) {
            layer.msg("客户名称不能包含特殊字符.");
            return;
        }
        if (customer == null || customer == '') {
            layer.msg('请输入客户！');
            return;
        }

        var failureDate = $("#date_info").val();
        if (failureDate == null || failureDate == '') {
            layer.msg('请输入失效日期！');
            return;
        }

        var productionDate = $("#productionDate").val();
        if (productionDate == null || productionDate == '') {
            layer.msg('请输入生产日期！');
            return;
        }
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
        var seriesNo = $("#seriesNo").val();
        if (seriesNo == null || seriesNo == '') {
            layer.msg('请填序列号！');
            return;
        }

        var statusColor = $("#statusColor").val();
        if (statusColor == null || statusColor == '') {
            layer.msg('请选择问提状态！');
            return;
        }


        var isClaim = $("#isClaim").val();
        if (isClaim == null || isClaim == '') {
            layer.msg('请选择是否索赔！');
            return;
        }
        var claimNumber = $("#claimNumber").val();
        if (claimNumber == null || claimNumber == '') {
            layer.msg('请填写索赔单号！');
            return;
        }

        var isCountIndex = $("#isCountindex option:selected").val();
        if (isCountIndex == null || isCountIndex == '') {
            layer.msg('请选择是否计入指标！');
            return;
        }

        var openDays = $("#openDays").val();
        if(regEn.test(openDays) || regCn.test(openDays)) {
            layer.msg("开放天数包含特殊字符.");
            return;
        }
        if (openDays == null || openDays == '') {
            layer.msg('请输入开放天数！');
            return;
        }

        var comments = $("#comments").val();
        if (comments == null || comments == '') {
            layer.msg('请输入备注！');
            return;
        }
        var issueExtend = $("#issueExtend").val();
        var result = '{"failureDate":"' + failureDate + '","oem":"' + oem + '","customer":"' + customer + '","productionDate":"' + productionDate + '","failureDate":"' + failureDate + '","statusColor":"' + statusColor + '","claimNumber":"' + claimNumber + '","openDays":"' + openDays + '"}'
        $("#issueExtend").attr("value", result);
        saveIssue();
    }
</script>
</body>
</html>