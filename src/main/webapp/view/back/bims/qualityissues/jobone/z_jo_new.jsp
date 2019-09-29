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

                <div class="title_left"><h3>JOB1 提交问题</h3></div>
                <div class="title_right"></div>
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
                                <form id="demo-form2">

                                    <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                           style="border-collapse:separate;border-spacing:15px;">
                                        <input type="hidden" id="qualityType" name="qualityType" required="required"
                                               class="form-control" value="J">

                                        <tr>
                                            <td width="15%" align="right" style="font-weight:bold;">ESN： <font color='red'>*</font></td>
                                            <td width="35%">
                                                <select class="form-control" name="esn" id="esn" required
                                                        style="width:100%; height:35px;padding:5px;">
                                                </select>
                                            </td>
                                            <td width="15%" align="right" style="font-weight:bold;">SO： <font color='red'>*</font></td>
                                            <td width="35%">
                                                <input type="text" id="so" name="so" required="required"
                                                       class="form-control" style="width:100%; height:35px; padding:5px;"
                                                       value="">
                                            </td>
                                        </tr>
                                        <tr>

                                            <td width="15%" align="right"><strong>Plant/工厂： <font color='red'>*</font></strong></td>
                                            <td width="35%">
                                                <select name="plant" id="plant" class="form-control" required>

                                                </select>
                                            </td>
                                            <td align="right" style="font-weight:bold;">Reviewers/评审人员： <font color='red'>*</font></td>
                                            <td><select name="reviewers" id="reviewers" multiple="multiple"
                                                        style="width:100%; height:35px;padding:2px;" required>
                                            </select>
                                                <input hidden id="reviewersAccount" name="reviewersAccount" value="">
                                            </td>
                                        </tr>

                                        <tr>

                                            <td align="right" style="font-weight:bold;">Review Date/评审日期： <font color='red'>*</font></td>
                                            <td><input readonly class="layui-input" type="text" id="date_info" name="reviewDate" required
                                                       style="width:100%; height:35px; padding:5px;" value=""
                                                       placeholder="取系统当前日期"></td>

                                            <td align="right" style="font-weight:bold;">JOB1 Conclusion/评审结论： <font color='red'>*</font></td>
                                            <td><select id="isClaim" name="isClaim" required
                                                        style="width:100%; height:35px;padding:2px;">
                                                <%--<option value="">请选择</option>
                                                <option value="1">OK</option>--%>
                                                <option value="2" selected>NOK</option>
                                        </tr>


                                        <tr>
                                            <td align="right"><strong>Issue Description/具体问题描述： <font color='red'>*</font></strong></td>
                                            <td colspan="3"><textarea id="issueDesc" name="issueDesc" cols="200" required
                                                                      rows="2" class="form-control"
                                                                      placeholder="具体问题描述"></textarea></td>
                                        </tr>
                                        <tr>
                                            <td align="right"><strong>Remark/备注</strong></td>
                                            <td colspan="3"><textarea id="comments" name="comments" cols="200" rows="2"
                                                                      class="form-control"
                                                                      placeholder="请输入备注"></textarea></td>
                                        </tr>
                                        <tr>
                                            <%--<td align="right"><strong>责任人部门：</strong></td>
                                            <td>
                                                <select id="depart" name="depart" class="form-control" onchange="getUserListByDeptId(this)" required></select>
                                            </td>--%>

                                            <td align="right"><strong>责任人：<font color='red'>*</font></strong></td>
                                            <td><select id="processPersonAccount" name="processPersonAccount" required
                                                                      class="form-control" ></select></td>
                                                <input type="hidden" id="processPersonName" name="processPersonName" required="required"
                                                       class="form-control" value="">
                                                <td align="right" style="text-align: right"><strong>是否批量 ： <font color='red'>*</font></strong></td>
                                                <td><select name="issueCategoryL1Name" id="issueCategoryL1Name" class="form-control" required>
                                                    <option value="">- 请选择 -</option>
                                                    <option value="1">是</option>
                                                    <option value="2">否</option>
                                                </select></td>
                                        </tr>
                                        <tr>
                                            <td align="right"><strong>邮件通知：</strong></td>
                                            <td><select id="sendEmail" name="reviewPerson" required
                                                        class="form-control" ></select></td>
                                            <input type="hidden" id="" name="" required="required"
                                                   class="form-control" value="">
                                        </tr>
                                    </table>
                                    <input type="hidden" id="issueExtend" name="issueExtend" required="required"
                                           class="form-control col-md-7" value="">
                                    <div class="ln_solid"></div>
                                    <div class="form-group">
                                        <div style="text-align:center">
                                            <button class="btn btn-primary" type="button" data-toggle="modal"
                                                     onclick="checkNull()">确认
                                            </button>
                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                            <%--<button class="btn btn-success" type="button" data-toggle="modal"
                                                    data-target=".this-true" onclick="isOk()">完成
                                            </button>--%>
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
<div class="modal fade this-save" tabindex="-1" role="dialog" aria-hidden="true" >
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
            <h4 class="modal-title" id="myModalLabel">系统提示</h4>
            </div>
            <div class="modal-body">
            <p>确定保存填写的问题表单吗？</p>
            </div>
            <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="button" class="btn btn-success" data-dismiss="modal" onClick="saveIssue()">确定</button>
      </div>
        </div>
    </div>
</div>


<div class="modal fade this-true" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">系统提示</h4>
            </div>
            <div class="modal-body">
                <%--<p>如果评审结论为OK，提示：<br>评审结论为OK,确定问题关闭吗？</p>
                <p>如果评审结论为NOK，提示：<br>确定指定责任人并进行处理吗？</p>--%>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onClick="isCloseJob1()">确定
                </button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->

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
    $("#menuJobOne").addClass("current-page");

</script>

<script>
    window.onload = function () {
        var pid = 0;
        getSelectlist("#plant", "xf", pid);

        //部门列表
        getDeptlist("#depart");
    }

    layui.use('laydate', function() {
        var laydate = layui.laydate;

        //常规用法
        laydate.render({
            elem: '#date_info',
            format: 'yyyy-MM-dd'
        });
    });
    $(document).ready(function () {
        var time = new Date();
        var day = ("0" + time.getDate()).slice(-2);
        var month = ("0" + (time.getMonth() + 1)).slice(-2);
        var today = time.getFullYear() + "-" + (month) + "-" + (day);
        $('#date_info').val(today);
    })
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

    //部门列表
    function getDeptlist(dom) {
        var subject = $(dom);//元素
        $.ajax({
            url: "${webPath}/commonList/listDepartment",
            type: "POST",
            dataType: "json",
            data: {
            },
            success: function (ajaxJson) {
                if (ajaxJson.success) {
                    //添加select第一个option
                    var html = '<option selected value="">请选择</option>';
                    for (var i = 0; i < ajaxJson.obj.length; i++) {
                        var checked = "";
                        //添加option元素
                        html += ("<option value='" + ajaxJson.obj[i].id + "'>" + ajaxJson.obj[i].name + "</option>");
                        //如果id等于value，则选中
                    }
                    $(subject).append(html);
                } else {
                    $(subject).append("<option selected value='0'>请选择</option>");
                }
            }
        })
    }

    /**
     * 获取处理人列表
     */
    /*function getUserListByDeptId() {
        var deptId = $("#depart option:selected").val();
        $.ajax({
            type: "get",
            url: "${webPath}/commonList/getUserByDeptID",
            dataType: "json",
            data: {
                "deptId": deptId,
            },
            success: function (result) {
                var html = "<option value=''>--请选择--</option>";
                for (var i in result) {
                    html += "<option value='" + result[i].account + "'>" + result[i].name + "</option>";
                }
                $("#processPersonAccount").html(html);
            }
        });
    }*/

    //返回
    function cancle() {
        window.location.href = '${webPath}/back/toJobOne';
    }
    //保存时验证
    function checkNull(){
        $("#demo-form2").validate({
            errorClass: "error"
        })
        $("#demo-form2").validate();
        if($("#demo-form2").valid()){
            saveIssue();
            // $('.this-save').modal("show");
        }
        return;
    };

    //保存
    function saveIssue() {
        var processPersonName = $("#processPersonAccount option:checked").text();   //责任人姓名
        $("#processPersonName").val(processPersonName);

        var reviewers = $("#reviewers").val();
        var reviewersAccount = $("#reviewers option:selected").text();
        if (reviewers == null || reviewers == '') {
            layer.msg('请输入评审人员！');
            return;
        }

        var reviewDate = $("#date_info").val();
        if (reviewDate == null || reviewDate == '') {
            layer.msg('请输入评审日期！');
            return;
        }

        var conclusion = $("#conclusion").val();
        /*if (conclusion == null || conclusion == '') {
            layer.msg('请输入评审结论！');
            return;
        }*/
        var result = '{"reviewDate":"' + reviewDate + '","reviewers":"' + reviewers + '","reviewersAccount":"' + reviewersAccount + '"}'
        $("#issueExtend").attr("value", result);
        var params = $("#demo-form2").serialize();
        layer.confirm('确定保存并处理问题吗？', {icon: 3, title: '系统提示',offset: "50%"}, function (index) {
            $.ajax({
                type: "POST",
                url: "${webPath}/bims/job/jobAdd",
                data: params,
                dataType: "json",
                success: function (data) {
                    console.log(data)
                    var id = data.obj.id;
                    if (data.success) {
                        console.log(data)
                        if (data.obj == -1){
                            layer.msg("请选择新的ESN");
                            $("#so").val("");
                            return;
                        }else {
                            layer.msg("操作成功");
                            setTimeout(window.location.href = '${webPath}/back/toJobOne', 1000);
                        }
                    } else {
                        layer.msg("操作失败");
                    }
                },
                error: function (data) {
                    layer.msg("操作失败");
                }
            });
        });
    }

    //是否问题关闭
    function isOk(){
        var isok = $('#conclusion option:selected') .val();
        if (isok=="1"){
            var html = '<p>确定问题关闭吗？</p>'
            $(".this-true .modal-body").html(html);
        }
        if (isok=="2"){
            var html = '<p>确定指定责任人并进行处理？</p>'
            $(".this-true .modal-body").html(html);
        }

    }
    function isCloseJob1(){
        var reviewers = $("#reviewers").val();
        if (reviewers == null || reviewers == '') {
            layer.msg('请输入评审人员！');
            return;
        }

        var reviewDate = $("#date_info").val();
        if (reviewDate == null || reviewDate == '') {
            layer.msg('请输入评审日期！');
            return;
        }

        var conclusion = $("#conclusion").val();
        if (conclusion == null || conclusion == '') {
            layer.msg('请输入评审结论！');
            return;
        }
        var result = '{"reviewDate":"' + reviewDate + '","reviewers":"' + reviewers + '","conclusion":"' + conclusion + '"}'
        $("#issueExtend").attr("value", result);

        var isok = $('#conclusion option:selected') .val();
        var params = $("#demo-form2").serialize();

        if (isok=="1"){
            layer.confirm('确定关闭问题吗?', {icon: 3, title:'提示'}, function(index){
                $.ajax({
                    type: "POST",
                    url: '${webPath}/bims/apucheck/correct',
                    data: params,
                    dataType: "json",
                    success: function (data) {
                        console.log(data)
                        var id = data.obj.id;
                        if (data.success) {
                            console.log(data)
                            layer.msg("已保存");
                            setTimeout(window.location.href='${webPath}/bims/job/jobToleader?id='+id, 1000);
                        } else {
                            layer.msg(data.msg);
                        }
                    },
                    error: function (data) {
                        layer.msg(data.msg);
                    }
                });
            });
        }
        if (isok=="2"){
            $.ajax({
                type: "POST",
                url: '${webPath}/bims/apucheck/correct',
                data: params,
                dataType: "json",
                success: function (data) {
                    console.log(data)
                    var id = data.obj.id;
                    if (data.success) {
                        console.log(data)
                        layer.msg("已关闭");
                        setTimeout(window.location.href = '${webPath}/back/toJobOne?id='+id, 1000);
                    } else {
                        layer.msg(data.msg);
                    }
                },
                error: function (data) {
                    layer.msg(data.msg);
                }
            });
        }
    }


    //数据校验
    function checking() {
        var regEn = /[`~!@#$%^&*()_+<>?:"{},.\/;'[\]]/im,
            regCn = /[·！#￥（——）：；“”‘、，|《。》？、【】[\]]/im;

        var plant = $("#plant").val();
        if (plant == null || plant == '') {
            layer.msg('请选择厂区！');
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

        var issueDesc = $("#issueDesc").val();
        if (issueDesc == null || issueDesc == '') {
            layer.msg('请输入问题描述！');
            return;
        }
        var reviewers = $("#reviewers").val();
        if (reviewers == null || reviewers == '') {
            layer.msg('请输入评审人员！');
            return;
        }

        var reviewDate = $("#date_info").val();
        if (reviewDate == null || reviewDate == '') {
            layer.msg('请输入评审日期！');
            return;
        }

        var conclusion = $("#conclusion").val();
        if (conclusion == null || conclusion == '') {
            layer.msg('请输入评审结论！');
            return;
        }
        var comments = $("#comments").val();
        if (comments == null || comments == '') {
            layer.msg('请输入备注！');
            return;
        }

        var issueExtend = $("#issueExtend").val();
        var result = '{"reviewDate":"' + reviewDate + '","reviewers":"' + reviewers + '","conclusion":"' + conclusion + '"}'
        $("#issueExtend").attr("value", result);
        saveIssue();
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


    $(function () {
        var name = "reviewers";
        getDutyPerson(name);
    });
    //选择评审人员
    function getDutyPerson(name) {
        $(function() {
            $("select[name="+name+"]").select2({
                placeholder: "-- 输入姓名 --",
                language: "zh-CN",
                minimumInputLength: 1,
                allowClear: true,
                width: '100%',
                escapeMarkup: function (markup) { return markup; }, // 让template的html显示效果，否则输出代码
                ajax : {
                    url : "${webPath}/back/person/queryByName",
                    dataType: 'json',
                    data: function (params) {
                        return {
                            userName: params.term, // search term
                        };
                    },
                    processResults: function (data) {
                        var options = new Array();
                        $(data).each(function(i, o) {
                            options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                                id : o.account,         //取出items中Code赋值给id
                                text : o.name+" ",
                            });
                        });
                        return {
                            results: options        //返回数据
                        };
                    },
                    cache : true
                }
            });
        })
    };

    $(function() {
        $("select[name=processPersonAccount]").select2({
            placeholder: "-- 输入姓名 --",
            language: "zh-CN",
            minimumInputLength: 1,
            allowClear: true,
            width: '100%',
            escapeMarkup: function (markup) { return markup; }, // 让template的html显示效果，否则输出代码
            ajax : {
                type :"get",
                url : "${webPath}/back/person/queryByNameNotSelf",
                dataType: 'json',
                data: function (params) {
                    return {
                        userName: params.term, // search term
                    };
                },
                processResults: function (data) {
                    var options = new Array();
                    $(data).each(function(i, o) {
                        options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                            id : o.account,         //取出items中Code赋值给id
                            text : o.name,
                        });
                    });
                    return {
                        results: options        //返回数据
                    };
                },
                cache : true
            }
        });
    })

    jQuery(document).ready(function () {
        //前置库下拉框
        $('#sendEmail').select2({
            placeholder: "-- 输入姓名 --",
            language: "zh-CN",
            minimumInputLength: 1,
            allowClear: true,
            width: '100%',
            escapeMarkup: function (markup) {
                return markup;
            }, // 让template的html显示效果，否则输出代码
            ajax: {
                url: "${webPath}/back/person/queryByName",
                dataType: 'json',
                data: function (params) {
                    return {
                        userName: params.term, // search term
                    };
                },
                processResults: function (data) {
                    var options = new Array();
                    $(data).each(function (i, o) {
                        var email = "";
                        if (o.email == null || o.email == "") {
                            email = '';
                        } else {
                            email = '(' + o.email + ')';
                        }
                        options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                            id: o.email,         //取出items中Code赋值给id
                            text: o.name + email,
                        });
                    });
                    return {
                        results: options        //返回数据
                    };
                },
                cache: true
            }
        });
    });

    //发送邮件
    function send() {

    }
</script>
</html>
