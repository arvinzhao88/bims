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

                <div class="title_left"><h3>T区</h3></div>
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
                                <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                           style="border-collapse:separate;border-spacing:15px;">
                                        <input type="hidden" id="qualityType" name="qualityType"
                                               class="form-control" value="T">
                                        <tr>
                                            <td width="15%" align="right" style="text-align: right"><strong>Plant/工厂： <font color='red'>*</font></strong></td>
                                            <td width="35%">
                                                <select name="plant" id="plant" class="form-control" required>
                                                    <%--<option>请选择</option>
                                                    <option>ISF</option>
                                                    <option>ISG</option>--%>
                                                </select>
                                            </td>

                                            <td align="right" width="15%" style="text-align: right"><strong>ESN： <font color='red'>*</font></strong></td>
                                            <td width="35%">
                                                <%--<input id="esn" name="esn" class="form-control"
                                                       style="width:45%;float:left;">
                                                <select class="form-control" name="so" id="so"
                                                        style="width:50%; float:right;">
                                                    <option value="">请选择</option>
                                                    <option value="1">SO17148</option>
                                                    <option value="2">SO17160</option>
                                                </select>--%>
                                                <select class="form-control" name="esn" id="esn" required
                                                        style="width:45%;float:left;">
                                                </select>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>SO： <font color='red'>*</font></strong></td>
                                            <td>
                                                <%--<input id="esn" name="esn" class="form-control"
                                                       style="width:45%;float:left;">
                                                <select class="form-control" name="so" id="so"
                                                        style="width:50%; float:right;">
                                                    <option value="">请选择</option>
                                                    <option value="1">SO17148</option>
                                                    <option value="2">SO17160</option>
                                                </select>--%>
                                                <%--<select class="form-control" name="esn" id="esn" required
                                                        style="width:45%;float:left;">
                                                </select>--%>
                                                <input type="text" id="so" name="so" required="required"
                                                       class="form-control"
                                                       placeholder="SO">
                                            </td>
                                            <td align="right" style="text-align: right"><strong>Engine Type/机型： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="engineType" name="engineType" required="required"
                                                       class="form-control col-md-7"
                                                       placeholder="请输入机型"></td>
                                        </tr>

                                        <%--<tr>
                                            <td align="right"><strong>项目号： <font color='red'>*</font></strong></td>
                                            <td>
                                                &lt;%&ndash;<select name="projectNo" id="projectNo" class="form-control">
                                                <option value="">请选择</option>
                                                <option value="1">项目1</option>
                                                <option value="2">项目2</option>
                                                <option value="3">项目3</option>
                                            </select>&ndash;%&gt;
                                                <input type="text" id="projectNo" name="projectNo" required="required"
                                                       class="form-control col-md-7"
                                                       value="">
                                            </td>
                                            <td align="right"><strong>发动机系列： <font color='red'>*</font></strong></td>
                                            <td><input type="text" id="engineSeries" name="engineSeries"
                                                       required="required" class="form-control col-md-7"
                                                       value=""></td>
                                        </tr>--%>
                                        <tr>
                                            <td align="right" style="text-align: right;"><strong>PAL No./台架号： </strong></td>
                                            <td><input type="text" id="palNo" name="palNo"  onblur="check(this)"
                                                       class="form-control col-md-7" value="" placeholder="请输入台架号"></td>
                                            <td align="right" style="text-align: right"><strong>Tray No./托盘号： </strong></td>
                                            <td><input type="text" id="trayNo" name="trayNo"  onblur="check(this)"
                                                       class="form-control col-md-7" value="" placeholder="请输入托盘号"></td>
                                        </tr>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>Issue Category L1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>问题类型Level1： <font color='red'>*</font></strong></td>
                                            <td><select id="issueCategoryL1" name="issueCategoryL1" required
                                                        class="form-control">
                                                <%--<option>请选择问题分类</option>
                                                <option>质量 Quality</option>
                                                <option>设备 Equipment</option>
                                                <option>工艺 Process</option>
                                                <option>操作 Operation</option>
                                                <option>记录 Track Record</option>--%>
                                            </select></td>
                                            <td align="right" style="text-align: right"><strong>Issue Category L2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>问题类型Level2： <font color='red'>*</font></strong></td>
                                            <td><select id="issueCategoryL2" name="issueCategoryL2" required
                                                        class="form-control">
                                                <option value="">- 请选择 -</option>
                                                <%--<option>质量 Quality</option>--%>
                                                <%--<option>设备 Equipment</option>--%>
                                                <%--<option>工艺 Process</option>--%>
                                                <%--<option>操作 Operation</option>--%>
                                                <%--<option>记录 Track Record</option>--%>
                                            </select></td>
                                            <%--<td align="right"><strong>Issue Category L3/问题描述Level3：</strong></td>
                                            <td><select id="issueCategoryL2" name="issueCategoryL2"
                                                        class="form-control">
                                                &lt;%&ndash;<option>请选择问题子类</option>
                                                <option>性能问题 Problem of Performance</option>
                                                <option>黑光泄漏 Leakage</option>
                                                <option>零部件质量问题 Part issue</option>
                                                <option>未清缺陷 Outstanding defects</option>
                                                <option>装配问题 Assembly issue</option>&ndash;%&gt;
                                            </select></td>--%>
                                        </tr>
                                       <%-- <tr>
                                            <td align="right" style="text-align: right"><strong>Series No./序列号： <font color='red'>*</font></strong></td>
                                            <td>--%>
                                                <input type="hidden" id="seriesNo" name="seriesNo" required
                                                       class="form-control" placeholder="请输入序列号" required>
                                       <%--     </td>
                                        </tr>--%>
                                        <tr>
                                            <td align="right" style="text-align: right"><strong>是否批量 ： <font color='red'>*</font></strong></td>
                                            <td><select name="issueCategoryL1Name" id="issueCategoryL1Name" class="form-control" required>
                                                <option value="">- 请选择 -</option>
                                                <option value="1">是</option>
                                                <option value="2">否</option>
                                            </select></td>
                                        </tr>
                                        <tr>
                                            <td align="right"><strong>Issue Category L3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>问题描述Level3： <font color='red'>*</font></strong></td>
                                            <td colspan="3"><textarea id="issueDesc" name="issueDesc" cols="200"
                                                                      rows="2" class="form-control" required
                                                                      placeholder="请输入问题描述Level3"></textarea></td>
                                        </tr>
                                        <tr>
                                            <%--<td align="right"><strong>测量值/漏液：</strong></td>
                                            <td><input type="text" id="leakage" name="leakage" required="required"
                                                       class="form-control col-md-7" value=""></td>--%>
                                            <td align="right"><strong>Attach./照片附件： </strong></td>
                                            <%--<td>
                                                <i class="fa fa-file-text" style="font-size:30px;vertical-align:middle; padding-right:10px;"></i>&nbsp;
                                                <button onclick="selectFile()" type="button" class="btn btn-default btn-sm">上传附件</button>

                                            </td>--%>
                                            <td class="list-img">
                                                <div id="preview" class="clear">
                                                    <li class="fl" style="margin-left: -1%">
                                                        <img src="${resPath}/view/static/images/icon_upload.png">
                                                        <input id="fileImage" type="file" name="file[]" multiple/>
                                                        <%--<div class="num">0/6</div>--%>
                                                    </li>
                                                </div>
                                            </td>
                                        </tr>
                                        <%--<tr>
                                            <td align="right"><strong>Resolution/处理意见： <font color='red'>*</font></strong></td>
                                            <td colspan="3"><textarea id="comments" name="comments" cols="200"
                                                                      rows="2" class="form-control"
                                                                      placeholder="处理意见"></textarea></td>
                                        </tr>--%>
                                    </table>
                                    <%@include file="/view/static/common/img.jsp" %>
                                    <input type="hidden" id="attach" name="attach"
                                           class="form-control col-md-7" value="">
                                    <input type="hidden" id="issueExtend" name="issueExtend"
                                           class="form-control col-md-7" value="">
                                    <div class="ln_solid"></div>
                                    <%--<div class="form-group">
                                        <div style="text-align:center">
                                            <button class="btn btn-success" type="button" data-toggle="modal"
                                                    data-target=".this-save" onclick="">保存
                                            </button>
                                        </div>
                                    </div>--%>

                                    <div class="form-group">
                                        <div style="text-align:center">
                                            <button class="btn btn-primary" type="button" <%--data-toggle="modal1"--%>
                                                    onclick="checkNull()" >确认
                                            </button>
                                            <%--&nbsp;&nbsp;&nbsp;&nbsp;
                                            <button class="btn btn-success" type="button" data-toggle="modal"
                                                    data-target=".this-true" onclick="confirm()">
                                                新建完成
                                            </button>--%>
                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                            <button class="btn btn-default" type="button" <%--data-toggle="modal1"--%>
                                                    <%--data-target=".this-true"--%>
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
<div class="modal fade this-save" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">确认</h4>
            </div>
            <div class="modal-body">
                <p>问题录入完毕,确认保存？</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onClick="checkNull()">确定
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
    $("#menuT").addClass("current-page");

</script>
<script>
    window.onload = function () {
        var pid = 0;
        getSelectlist("#plant", "xf", pid);
        getSelectlist("#issueCategoryL1", "level", pid);
    }
    function checkNull(){
        // $("#demo-form2").validate({
        //     errorClass: "error"
        // })
        // $("#demo-form2").validate();
        if($("#demo-form2").valid()){
            saveIssue();
        }
        // return;
    };

    function check(e) {
        var regEn = /[`~!@#$%^&*()_+<>?:"{},.\/;'[\]]/im,
            regCn = /[·！#￥（——）：；“”‘、，|《。》？、【】[\]]/im;
        var re = /^\d+(?=\.{0,1}\d+$|$)/

        var palNo = $("#palNo").val();
        if(regEn.test(palNo) || regCn.test(palNo)) {
            layer.msg("台架号不能包含特殊字符.");
            return;
        }
        /*if (palNo == null || palNo == '') {
            layer.msg('请输入台架号！');
            return;
        }*/

        var trayNo = $("#trayNo").val();
        if(regEn.test(trayNo) || regCn.test(trayNo)) {
            layer.msg("托盘号不能包含特殊字符.");
            return;
        }
        /*if (trayNo == null || trayNo == '') {
            layer.msg('请输入托盘号！');
            return;
        }*/
    }

    //根据不同选项获取下拉框
    $(function () {
        var type = "";
        var pid = 0;
        $("#issueCategoryL1").change(function () {
            $("#issueCategoryL2").empty();
            var val = $("#issueCategoryL1").val();
            type = "level";
            pid = val;
            getSelectlist("#issueCategoryL2", type, pid);
        })
    })

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

    //提交
/*    function subIssue() {
        checking();
        window.location.href = '${webPath}/bims/common/Eqr?id='+id
    }*/
    //保存
    function saveIssue() {
        checking();
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

    //取消
    function cancle() {
        window.location.href = '${webPath}/back/toTzone';
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

        /*var projectNo = $("#projectNo").val();
        if (projectNo == null || projectNo == '') {
            layer.msg('请输入项目号！');
            return;
        }*/

        /*var engineSeries = $("#engineSeries").val();
        if (engineSeries == null || engineSeries == '') {
            layer.msg('请输入发动机系列！');
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

        var issueDesc = $("#issueDesc").val();
        if (issueDesc == null || issueDesc == '') {
            layer.msg('请输入问题描述！');
            return;
        }

        var palNo = $("#palNo").val();
        if(regEn.test(palNo) || regCn.test(palNo)) {
            layer.msg("台架号不能包含特殊字符.");
            return;
        }
        /*if (palNo == null || palNo == '') {
            layer.msg('请输入台架号！');
            return;
        }*/

        var trayNo = $("#trayNo").val();
        if(regEn.test(trayNo) || regCn.test(trayNo)) {
            layer.msg("托盘号不能包含特殊字符.");
            return;
        }
        /*if (trayNo == null || trayNo == '') {
            layer.msg('请输入托盘号！');
            return;
        }*/

        /*var leakage = $("#leakage").val();
        if (leakage == null || leakage == '') {
            layer.msg('请输测量值/漏液！');
            return;
        }*/

        var issueExtend = $("#issueExtend").val();
        var result = '{"palNo":"' + palNo + '","trayNo":"' + trayNo + '"}'
        $("#issueExtend").attr("value", result);
        // saveIssue();
    }

    //选择文件
    function selectFile() {

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
            placeholder: "请输入ESN.",
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
                    $("#seriesNo").val(esn);
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
</script>
</body>
</html>
