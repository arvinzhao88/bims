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

                <div class="title_left"><h3>EQA 提交问题</h3></div>
                <div class="title_right">
                    <div class="col-md-6 col-sm-5 col-xs-12 form-group pull-right top_search">
                        <div class="input-group">
                            <input name="text" type="text" class="form-control" placeholder="查询">
                            <span class="input-group-btn">
				  <button class="btn btn-default" type="button"><i class="fa fa-search"></i></button></span>
                        </div>
                    </div>
                </div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>内容</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                                <li><a class="close-link"><i class="fa fa-close"></i></a></li>
                            </ul>

                            <div class="clearfix"></div>
                        </div>

                        <div class="x_content">
                            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                <input type="hidden" id="qualityType" name="qualityType" required="required"
                                       class="form-control" value="E">
                                <input type="hidden" id="id" name="id" required="required"
                                       class="form-control" value="${issue.id}">
                                <div class="form-group">
                                    <div class="form-group">
                                        <div class="form-group col-md-5">
                                            <label class="control-label col-md-3" for="plant">工厂： <font color='red'>*</font></label>
                                            <div class="col-md-9"><select name="plant" id="plant" class="form-control" required>
                                                <%--<option value="">请选择</option>
                                                <option value="1">F</option>
                                                <option value="2">X</option>--%>
                                            </select></div>
                                        </div>
                                        <div class="form-group col-md-5">
                                            <label class="control-label col-md-3" for="isCountIndex">是否计入指标： <font color='red'>*</font></label>
                                            <div class="col-md-9"><select id="isCountindex" name="isCountindex"
                                                                          class="form-control" required>
                                                <option value="">选择</option>
                                                <option value="1" <c:if test="${'1' eq issue.isCountindex}">selected</c:if> >YES</option>
                                                <option value="2" <c:if test="${'2' eq issue.isCountindex}">selected</c:if> >NO</option>
                                            </select></div>
                                        </div>
                                    </div>

                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="esn">发动机 ESN： <font color='red'>*</font></label>
                                        <div class="col-md-9"><select id="esn" name="esn" class="form-control" required>
                                            <%--<option value="">请选择 SO带出 接口MES</option>
                                            <option value="1">XXX</option>
                                            <option value="2">XXX</option>
                                            <option value="3">XXX</option>--%>
                                        </select></div>
                                    </div>

                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="so">发动机 SO： <font color='red'>*</font></label>
                                        <div class="col-md-9">
                                            <%--<select id="so" name="so" class="form-control">
                                            <option value="">请选择 接口MES</option>
                                            <option value="1">XXX</option>
                                            <option value="2">XXX</option>
                                            <option value="3">XXX</option>
                                            </select>--%>
                                                <input type="text" id="so" name="so" placeholder="发动机 SO"
                                                       required="required" class="form-control col-md-7"
                                                       value="${issue.so}">
                                        </div>
                                    </div>

                                </div>

                                <div class="form-group">
                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="engineType">机型： <font color='red'>*</font></label>
                                        <div class="col-md-9">
                                            <input type="text" id="engineType" name="engineType" placeholder="机型"
                                                   required="required" class="form-control col-md-7"
                                                   value="${issue.engineType}">
                                            <%--<select id="engineType" name="engineType"
                                                                      class="form-control">
                                            <option value="">请选择 SO带出 接口ERP</option>
                                            <option value="1">XXX</option>
                                            <option value="2">XXX</option>
                                            <option value="3">XXX</option>
                                            </select>--%>
                                        </div>
                                    </div>
                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="isCarry">是否搭载： <font color='red'>*</font></label>
                                        <div class="col-md-9"><select id="isCarry" name="isCarry" class="form-control" required>
                                            <option value="">请选择</option>
                                            <option value="1" <c:if test="${'1' eq issue.isCarry}">selected</c:if> >Yes</option>
                                            <option value="2" <c:if test="${'2' eq issue.isCarry}">selected</c:if> >No</option>
                                        </select></div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="partNo">零件号： <font color='red'>*</font></label>
                                        <div class="col-md-9"><select name="partNo" id="partNo" class="form-control" required>
                                            <%--<option value="">请选择 模糊匹配 接口ERP</option>
                                            <option value="1">XXX</option>
                                            <option value="2">XXX</option>--%>
                                        </select></div>
                                    </div>
                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="partName">零件名称： <font color='red'>*</font></label>
                                        <div class="col-md-9"><input type="text" id="partName" name="partName" placeholder="零件名称"
                                                                     required="required" class="form-control col-md-7"
                                                                     value="${issue.partName}"></div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="vendorCode">供应商代码： <font color='red'>*</font></label>
                                        <div class="col-md-9"><select id="vendorCode" name="vendorCode"
                                                                      class="form-control" required>
                                            <%--<option value="">请选择供应商</option>
                                            <option value="1">XXX</option>
                                            <option value="2">XXX</option>--%>
                                        </select></div>
                                    </div>
                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="vendorName">供应商名称： <font color='red'>*</font></label>
                                        <div class="col-md-9"><input type="text" id="vendorName" name="vendorName" placeholder="供应商名称"
                                                                     required="required" class="form-control col-md-7"
                                                                     value="${issue.vendorName}"></div>
                                    </div>
                                </div>

                                <div class="form-group">

                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="level">级别： <font color='red'>*</font></label>
                                        <div class="col-md-9"><select id="level" name="level" class="form-control" required>
                                            <option value="">请选择</option>
                                            <option value="1" <c:if test="${'1' eq issueExtend.level}">selected</c:if> >A</option>
                                            <option value="2" <c:if test="${'2' eq issueExtend.level}">selected</c:if> >B</option>
                                            <option value="3" <c:if test="${'3' eq issueExtend.level}">selected</c:if> >C</option>
                                        </select></div>
                                    </div>

                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="deduct">扣分： <font color='red'>*</font></label>
                                        <div class="col-md-9"><input type="text" id="deduct" name="deduct" onblur="check(this)" onkeyup="this.value=this.value.replace(/[^0-9.]/g,'')"
                                                                     required="required" class="form-control col-md-7" placeholder="扣分"
                                                                     value="${issueExtend.deduct}"></div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="qty">数量： <font color='red'>*</font></label>
                                        <div class="col-md-9"><input type="text" id="qty" name="qty" required="required" onblur="check(this)" onkeyup="this.value=this.value.replace(/[^0-9.]/g,'')"
                                                                     class="form-control col-md-7" value="${issue.qty}" placeholder="数量"></div>
                                    </div>
                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="attach">照片附件： <font color='red'>*</font></label>
                                        <div class="col-md-9">
                                            <div class="list-img">
                                                <div id="preview" class="clear">
                                                    <li class="fl">
                                                        <img src="${resPath}/view/static/images/icon_upload.png">
                                                        <input id="fileImage" type="file" name="file[]" multiple/>
                                                        <%--<div class="num">0/6</div>--%>
                                                    </li>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="issueDesc">问题描述： <font color='red'>*</font></label>
                                        <div class="col-md-9"><textarea id="issueDesc" name="issueDesc" cols="200" rows="2" required
                                                                        class="form-control" placeholder="具体问题描述">${issue.issueDesc}</textarea></div>
                                    </div>
                                    <div class="form-group col-md-5">
                                        <label class="control-label col-md-3" for="comments">备注： <font color='red'>*</font></label>
                                        <div class="col-md-9"><textarea id="comments" name="comments" cols="200" rows="2" required
                                                                        class="form-control" placeholder="备注">${issue.comments}</textarea></div>
                                    </div>
                                </div>

                                <div class="form-group">

                                </div>

                                <%--<div class="form-group">
                                   <div class="form-group col-md-5">
                                   <label class="control-label col-md-3" for="first-name">是否计入指标：</label>
                                   <div class="col-md-9"><select class="form-control">
                                   <option>选择</option>
                                   <option>YES</option>
                                   <option>NO</option>
                                   </select></div>
                                   </div>
                                   <div class="form-group col-md-5">
                                   <label class="control-label col-md-3" for="first-name">问题结束日期：</label>
                                   <div class="col-md-9"><input type="text" id="first-name" required="required" class="form-control col-md-7" value="系统自动生成"></div>
                                   </div>
                                </div>--%>
                                <%@include file="/view/static/common/img.jsp" %>
                                <input type="hidden" id="attach" name="attach" required="required"
                                       class="form-control col-md-7" value="${issue.attach}">
                                <input type="hidden" id="issueExtend" name="issueExtend" required="required"
                                       class="form-control col-md-7" value="">
                                <div class="ln_solid"></div>
                                <div class="form-group">
                                    <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-5">
                                        <button class="btn btn-success" type="button" data-toggle="modal"
                                                onclick="checkNull()">确认，并开始处理
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
                <h4 class="modal-title" id="myModalLabel">确定</h4>
            </div>
            <div class="modal-body">
                <p>确定并处理该条问题吗?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onClick="process()">确定</button>
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
    $("#menuE").addClass("current-page");

</script>

<script>
    window.onload = function () {
        var pid = 0;
        getSelectlist("#plant", "xf", pid,${issue.plant});
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
    /*下拉选项*/
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
    function process() {
        checking();
        var params = $("#demo-form2").serialize();
        $.ajax({
            type: "POST",
            url: "${webPath}/bims/apucheck/correct",
            data: params,
            dataType: "json",
            success: function (data) {
                if (data.success) {
                    layer.msg("已保存");
                    setTimeout(window.location.href = '${webPath}/bims/apucheck/apuEqr?id='+${issue.id}, 1000);
                } else {
                    layer.msg(data.msg);
                }
            },
            error: function (data) {
                layer.msg(data.msg);
            }
        });
    }
    function checkNull(){
        $("#demo-form2").validate({
            errorClass: "error"
        })
        $("#demo-form2").validate();
        if($("#demo-form2").valid()){
            $(".this-go").modal("show");
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
        var isCountIndex = $("#isCountIndex option:selected").val();
        if (isCountIndex == null || isCountIndex == '') {
            layer.msg('请选择是否计入指标！');
            return;
        }
        var so = $("#so").val();
        if (so == null || so == '') {
            layer.msg('请填写SO！');
            return;
        }
        var esn = $("#esn").val();
        if (esn == null || esn == '') {
            layer.msg('请选择ESN！');
            return;
        }
        var engineType = $("#engineType").val();
        if (engineType == null || engineType == '') {
            layer.msg('请填写机型！');
            return;
        }
        var isCarry = $("#isCarry option:selected").val();
        if (isCarry == null || isCarry == '') {
            layer.msg('请选择是否搭载！');
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
        var level = $("#level").val();
        if(regEn.test(level) || regCn.test(level)) {
            layer.msg("级别不能包含特殊字符.");
            return;
        }
        if (level == null || level == '') {
            layer.msg('请选择级别！');
            return;
        }

        var qty = $("#qty").val();
        if (qty == null || qty == '') {
            layer.msg('请填写数量！');
            return;
        }

        var deduct = $("#deduct").val();
        if(regEn.test(deduct) || regCn.test(deduct)) {
            layer.msg("扣分不能包含特殊字符.");
            return;
        }
        if (deduct == null || deduct == '') {
            layer.msg('请填写扣分！');
            return;
        }
        var issueDesc = $("#issueDesc").val();
        if (issueDesc == null || issueDesc == '') {
            layer.msg('请输入问题描述！');
            return;
        }
        var comments = $("#comments").val();
        if (comments == null || comments == '') {
            layer.msg('请输入备注！');
            return;
        }

        var issueExtend = $("#issueExtend").val();
        var result = '{"deduct":"' + deduct + '","level":"' + level + '"}'
        $("#issueExtend").attr("value", result);
    }

</script>
</body>
</html>
