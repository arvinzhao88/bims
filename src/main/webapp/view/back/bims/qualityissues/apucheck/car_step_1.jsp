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

<body style="background: #FFF" class="">
<div class="container body">
    <div class="x_panel" style="width:100%;float:left; margin-right:10px;">
        <!--Car开始-->
        <form id="demo-form2" data-parsley-validate
              class="form-horizontal form-label-left">
            <input type="hidden" value="${car.id}" name="id">
            <input type="hidden" value="${car.issueId}" name="issueId">
            <table id="step1" width="100%" border="0" cellspacing="0" cellpadding="0"
                   class="table table-hover table-bordered">
                <tr>
                    <td width="23%" align="right">纠正措施报告编号：</td>
                    <td width="29%"><input readonly type="text" id="carNo" name="carNo"
                                           required="required"
                                           class="form-control"
                                           value="${car.carNo}"></td>
                    <td width="19%" align="right">填写日期：</td>
                    <td width="29%"><input readonly type="text" id="createDate"
                                           name="createDate"
                                           required="required"
                                           class="form-control"
                                           value="<fmt:formatDate value="${car.createDate}" pattern="yyyy-MM-dd"/>">
                    </td>
                </tr>
                <tr>
                    <td align="right">发出者：</td>
                    <td><input readonly type="text" id="sponsorName" name="sponsorName"
                               required="required"
                               class="form-control"
                               value="${car.sponsorName}"></td>
                    <td align="right">责任部门：</td>
                    <td><input type="text" id="dutyDept" name="dutyDept"
                               required="required"
                               class="form-control" value="${car.dutyDept}"></td>
                </tr>
                <tr>
                    <td align="right">责任人：</td>
                    <td><input type="text" id="dutyPersonName"
                               name="dutyPersonName" required="required"
                               class="form-control" value="${car.dutyPersonName}"></td>
                    <td align="right">CAR类型：</td>
                    <td><select disabled name="carType" class="form-control">
                        <option value="" >请选择</option>
                        <option value="1" <c:if test="${car.carType eq '1' }">selected</c:if>>CAR</option>
                        <option value="2" <c:if test="${car.carType eq '2' }">selected</c:if>>SCAR</option>
                        <option value="3" <c:if test="${car.carType eq '3' }">selected</c:if>>7STEP</option>
                        <option value="4" <c:if test="${car.carType eq '4' }">selected</c:if>>Notifiction</option>
                    </select></td>
                </tr>
                <tr>
                    <td align="right">问题标题：</td>
                    <td colspan="3"><input readonly type="text" id="issueTitle"
                                           name="issueTitle"
                                           required="required"
                                           class="form-control"
                                           value="${car.issueTitle}"></td>
                </tr>
                <tr>
                    <td align="right">发生区域：</td>
                    <td colspan="3">
                        <input type="checkbox" class="flat" name="happenArea"
                               id="ISF Plant"
                               value="1" <c:if test="${fn:contains(car.happenArea, '1') }">checked="checked"</c:if>/>&nbsp;ISF Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="checkbox" class="flat" name="happenArea"
                               id="X Plant"
                               value="2" <c:if test="${fn:contains(car.happenArea, '2') }">checked="checked"</c:if>/>&nbsp;X Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="checkbox" class="flat" name="happenArea"
                               id="OEM"
                               value="3" <c:if test="${fn:contains(car.happenArea, '3') }">checked="checked"</c:if>/>&nbsp;OEM&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="checkbox" class="flat" name="happenArea"
                               id="IPTV"
                               value="4" <c:if test="${fn:contains(car.happenArea, '4') }">checked="checked"</c:if>/>&nbsp;IPTV&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="checkbox" class="flat" name="happenArea"
                               id="Warranty"
                               value="5" <c:if test="${fn:contains(car.happenArea, '5') }">checked="checked"</c:if>/>&nbsp;Warranty
                    </td>
                </tr>
                <tr>
                    <td align="right">Step1 识别问题：</td>
                    <td colspan="3"><input type="text" id="stepOne"
                                           name="stepOne"
                                           required="required"
                                           class="form-control"
                                           value="${car.stepOne}"></td>
                </tr>
                <tr>
                    <td align="right">上传图片：</td>
                    <td class="list-img">
                        <div id="preview" class="clear">
                            <li class="fl">
                                <img src="${resPath}/view/static/images/icon_upload.png">
                                <input id="fileImage" type="file" name="file[]" multiple/>
                                <%--<div class="num">0/6</div>--%>
                            </li>
                        </div>
                    </td>
                    <%--<td><i class="fa fa-file-picture-o"
                           style="font-size:30px;vertical-align:middle;"></i>&nbsp;<button
                            type="button" class="btn btn-default btn-sm">上传图片
                    </button>
                    </td>--%>
                    <td align="right">潜在影响范围/数量：</td>
                    <td><input type="text" id="amount" name="amount" onblur="check(this)" onkeyup="this.value=this.value.replace(/[^0-9.]/g,'')"
                               required="required" placeholder="请输入数字"
                               class="form-control" value="${car.amount}"></td>
                </tr>
                <tr>
                    <td align="right">邮件通知：</td>
                    <td>
                        <select id="sendEmail" name="email"
                                class="form-control" multiple="multiple">
                        </select>
                    </td>

                    <%--<td>
                                                    <textarea name="notice" rows="4" class="form-control"
                                                              id="notice" required="required"
                                                              data-parsley-trigger="keyup"
                                                              data-parsley-minlength="20"
                                                              data-parsley-maxlength="100"
                                                              placeholder="请输入通知内容"
                                                    ></textarea>
                    </td>--%>
                    <td align="right">目标关闭日期：</td>
                    <td><%--<input type="date" id="aimCloseDate" name="aimCloseDate"
                               required="required" value="<fmt:formatDate value="${car.aimCloseDate}" pattern="yyyy-MM-dd"/>"
                               class="form-control" pattern="yyyy-MM-dd HH:mm:ss"></td>--%>
                    <input readonly type="text" id="aimCloseDate" name="aimCloseDate"
                               required="required" value="<fmt:formatDate value="${car.aimCloseDate}" pattern="yyyy-MM-dd"/>"
                               class="layui-input" placeholder="yyyy年MM月dd日">
                    </td>

                </tr>
                <%--<tr>
                    <td align="right">邮件接收人：</td>
                    <td>
                        <select id="sendEmail" name="email"
                                class="form-control">
                        </select>
                    </td>
                    <td align="right"></td>
                    <td>
                    </td>
                </tr>--%>
            </table>
            <%@include file="/view/static/common/img.jsp" %>
            <input type="hidden" id="attach" name="attach"/>
            <input type="hidden" id="picture" name="picture"/>
            <input type="hidden" id="emailReceive" name="emailReceive"/>
            <input type="hidden" name="emailNos" id="emailNos" value="">
        </form>
        <div class="ln_solid"></div>
        <div class="form-group" id="step1Btn">
            <div style="text-align:center">
                <%--<button class="btn" type="button"
                        onClick="javascrtpt:window.location.href='${webPath}/back/toApu'">
                    取消
                </button>--%>
                <%--<button class="btn btn-primary" type="button" data-toggle="modal"
                        data-target=".this-go">保存
                </button>--%>
                <button class="btn btn-primary" type="button" data-toggle="modal"
                        <%--data-target=".this-go"--%> onclick="checkNull(${car.id},${car.issueId})">提交
                </button>
            </div>
        </div>
    </div>
</div>

<!-- 遮蔽内容开始 -->
<div class="modal fade this-shenpi" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:900px;padding-top:50px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">处理工具审批</h4>
            </div>
            <div class="modal-body">
                <br><br><br><br>
                <p>此处为审批流程处理内容区</p>
                <br><br><br><br>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onClick="javascrtpt:window.location.href='z_a_ts1.html'">确定
                </button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade this-go" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel1">确定</h4>
            </div>
            <div class="modal-body">
                <p>确定提交吗?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onclick="checkNull(${car.id},${car.issueId})">确定</button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->


<!-- 遮蔽内容开始 -->
<div class="modal fade this-biaodan" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:900px;padding-top:50px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">这里是问题附加表单的名称</h4>
            </div>
            <div class="modal-body">
                <br><br><br><br>
                <p>此处为处理附加表单的内容区</p>
                <br><br><br><br>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onClick="javascrtpt:window.location.href='z_a_ts1.html'">确定
                </button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->
<!-- 遮蔽内容开始 -->
<div class="modal fade this-no" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">驳回</h4>
            </div>
            <div class="modal-body">
                <p>请输入驳回原因！</p>
                <textarea name="message" rows="4" class="form-control" id="message" required="required"
                          data-parsley-trigger="keyup" data-parsley-minlength="20"
                          data-parsley-maxlength="100">请输入</textarea>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-danger" data-dismiss="modal">驳回</button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->

<div class="modal fade this-pic" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:860px;padding-top:20px;">
        <div class="modal-content">
            <div class="modal-header">
                <div type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></div>
                <h4 class="modal-title" id="myModalLabel">照片预览</h4>
            </div>
            <div class="modal-body"
                 style="width:800px; height:500px; margin:30px;background-color:#EFEFEF; text-align:center;" id="showImg">
            </div>
            <div class="modal-footer">
                <div type="button" class="btn btn-primary antoclose2" data-dismiss="modal">关闭</div>
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
    $("#menuA").addClass("current-page");

</script>
<script>
    layui.use('laydate', function() {
        var laydate = layui.laydate;

        //常规用法
        laydate.render({
            elem: '#aimCloseDate'/*,
            format: 'yyyy年MM月dd日'*/
        });
    });

    /*laydate.render({
        elem: '#aimCloseDate',
        format: 'yyyy年MM月dd日'
    });*/

    function check(e) {
        var re = /^\d+(?=\.{0,1}\d+$|$)/;
        if (e.value != "") {
            if (!re.test(e.value)) {
                e.value = "";
                e.focus();
            }
        }
    }
    //默认当前日期
    $(document).ready(function () {
        var time = new Date();
        var day = ("0" + time.getDate()).slice(-2);
        var month = ("0" + (time.getMonth() + 1)).slice(-2);
        var today = time.getFullYear() + "-" + (month) + "-" + (day);
        $('#aimCloseDate').val(today);
    })
    //日期不能小于当前日期
    $(function(){
        //得到当前时间
        var date_now = new Date();
        //得到当前年份
        var year = date_now.getFullYear();
        //得到当前月份
        //注：
        //  1：js中获取Date中的month时，会比当前月份少一个月，所以这里需要先加一
        //  2: 判断当前月份是否小于10，如果小于，那么就在月份的前面加一个 '0' ， 如果大于，就显示当前月份
        var month = date_now.getMonth()+1 < 10 ? "0"+(date_now.getMonth()+1) : (date_now.getMonth()+1);
        //得到当前日子（多少号）
        var date = date_now.getDate() < 10 ? "0"+date_now.getDate() : date_now.getDate();
        //设置input标签的max属性
        $("#aimCloseDate").attr("min",year+"-"+month+"-"+date);
    })

    //获取处理记录
    /*$(function getDealLog() {
        $.ajax({
            url: "${webPath}/dealLog/getLog",
            type: "POST",
            dataType: "json",
            data: {
                issueId: ${issue.id},
            },
            success: function (res) {
                var html = "";
                if (res.success) {
                    var logList = res.obj;
                    for (var i = 0; i < logList.length; i++) {
                        html += '<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">'
                            + '<div style="width:41%; float:left; text-align:right">' + logList[i].processTime + '</div>'
                            + '<div style="width:8%; float:left; text-align:center"><img src="${resPath}/view/static/images/time.png"></div>'
                            + '<div style="width:51%; float:right">' + logList[i].processPerson + ' ' + logList[i].actionName + '</div>'
                            + '</div>';
                    }
                }
                ;
                $("#dealLog").append(html);
            }
        })
    })*/


    //提交
    /*function submit(carId,issueId) {
        var params = $("#demo-form2").serialize();
        $.ajax({
            url: '${webPath}/car/addStep1',
            type: "POST",
            dataType: "json",
            data: params,
            success: function(res) {
                $(":input").attr("disabled","disabled");
                $(":checkbox").attr("disabled","disabled");
                $(":selected").attr("disabled","disabled");
                $(":button").attr("disabled","disabled");
                $("input[type='radio']").attr('disabled', 'disabled');
                $("input[type='checkbox']").attr('disabled', 'disabled');
                $("input,textarea").each(function () {
                    $(this).attr('readonly', 'readonly');
                });
                $("select").attr('disabled', 'disabled');
                //window.location.href='${webPath}/bims/apucheck/toCarStep27?carId='+carId+'&issueId='+issueId;
            }
        })

    }*/


    //默认选中第一个
    // $(function () {
    //     $('input:checkbox:first').attr('checked', 'checked');
    // })

    //提交
    function submit(carId, issueId) {
        //获取图片路径
        var picture =$("#attach").val();
        $("#picture").val(picture);

        var dutyPersonName = $("#sendEmail option:checked").text();   //邮件接收人
        if(dutyPersonName==null){
            layer.msg("请选择邮件接收人")
            return;
        }
        $("#emailReceive").val(dutyPersonName);


        var params = $("#demo-form2").serialize();
        $.ajax({
            url: '${webPath}/car/addStep1',
            type: "POST",
            dataType: "json",
            data: params,
            success: function (res) {
                //提交时发送邮件
                send();
                $("#step1Btn").hide();
                $("input[type='button']").remove();
                $("input[type='radio']").attr('disabled', 'disabled');
                $("input[type='checkbox']").attr('disabled', 'disabled');
                $("input,textarea").each(function () {
                    $(this).attr('readonly', 'readonly');
                });
                $("select").attr('disabled', 'disabled');
                //window.location.href = '${webPath}/bims/apucheck/toCarStep27?carId=' + carId + '&issueId=' + issueId;
                layer.msg("提交成功!");
                // setTimeout(function(){ window.location.reload(); }, 1000);
            }
        })

    }

    //邮件接收人
    jQuery(document).ready(function () {
        //下拉框
        $("#sendEmail").select2({
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
                    var email = "";
                    $(data).each(function (i, o) {
                        if (o.email == null || o.email == "") {
                            email = '';
                        } else {
                            email = '(' + o.email + ')';
                        }
                        options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                            id: o.email,         //取出items中Code赋值给id
                            text: o.name+ email,
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
    //默认发给责任人和审核人
    $(function echoEendEmailSelect2(){
        var dom = $("#sendEmail");
        var reviewPerson = '${car.confirmPerson}';//审核人
        var reviewPersonName = '${car.confirmPersonName}';
        var dutyPerson = '${car.dutyPerson}';//责任人
        var dutyPersonName = '${car.dutyPersonName}';
        $.ajax({
            url: "${webPath}/back/person/queryByAccount",
            type: "get",
            dataType: "json",
            data: {
                account: dutyPerson,
            },
            success: function (ajaxJson) {
                var value = ajaxJson;
                $.each(value, function (index) {
                    var res= value[index];
                    var mail= res.email;
                    if (mail==null || mail==""){
                        mail="";
                    }else {
                        mail='(' + res.email + ')';
                    }
                    var account=res.account;
                    if (account == dutyPerson) {
                        if (mail=="") {
                            $(dom).append(new Option(dutyPersonName+"(无邮箱)", " ", false, true));
                        }else {
                            $(dom).append(new Option(dutyPersonName+mail, res.email, false, true));
                        }
                    }
                });
                $(dom).trigger("change");
            }
        });

        /*$.ajax({
            url: "${webPath}/back/person/queryByAccount",
            type: "get",
            dataType: "json",
            data: {
                userName: reviewPerson,
            },
            success: function (ajaxJson) {
                var value = ajaxJson;
                $.each(value, function (index) {
                    var res= value[index];
                    var mail= res.email;
                    if (mail==null || mail==""){
                        mail="";
                    }else {
                        mail='(' + res.email + ')';
                    }
                    var account=res.account;
                    if (account == reviewPerson && account != '${person.account}') {
                        if (mail=="") {
                            $(dom).append(new Option(reviewPersonName+"(无邮箱)", " ", false, true));
                        }else {
                            $(dom).append(new Option(reviewPersonName+mail, res.email, false, true));
                        }
                    }
                });
                $(dom).trigger("change");
            }
        })*/
    })

    $(function echoEendEmailSelect2(){
        var dom = $("#sendEmail");
        var reviewPerson = '${car.confirmPerson}';//审核人
        var reviewPersonName = '${car.confirmPersonName}';
        var dutyPerson = '${car.dutyPerson}';//责任人
        var dutyPersonName = '${car.dutyPersonName}';
        /*$.ajax({
            url: "${webPath}/back/person/queryByAccount",
            type: "get",
            dataType: "json",
            data: {
                userName: dutyPerson,
            },
            success: function (ajaxJson) {
                var value = ajaxJson;
                $.each(value, function (index) {
                    var res= value[index];
                    var mail= res.email;
                    if (mail==null || mail==""){
                        mail="";
                    }else {
                        mail='(' + res.email + ')';
                    }
                    var account=res.account;
                    if (account == dutyPerson) {
                        if (mail=="") {
                            $(dom).append(new Option(dutyPersonName+"(无邮箱)", " ", false, true));
                        }else {
                            $(dom).append(new Option(dutyPersonName+mail, res.email, false, true));
                        }
                    }
                });
                $(dom).trigger("change");
            }
        });*/

        $.ajax({
            url: "${webPath}/back/person/queryByAccount",
            type: "get",
            dataType: "json",
            data: {
                account: reviewPerson,
            },
            success: function (ajaxJson) {
                var value = ajaxJson;
                $.each(value, function (index) {
                    var res= value[index];
                    var mail= res.email;
                    if (mail==null || mail==""){
                        mail="";
                    }else {
                        mail='(' + res.email + ')';
                    }
                    var account=res.account;
                    if (account == reviewPerson && account != '${person.account}') {
                        if (mail=="") {
                            $(dom).append(new Option(reviewPersonName+"(无邮箱)", " ", false, true));
                        }else {
                            $(dom).append(new Option(reviewPersonName+mail, res.email, false, true));
                        }
                    }
                });
                $(dom).trigger("change");
            }
        })
    })
    //发送邮件
    function send() {
        var emails = $("#sendEmail").val();
        var str = emails.toString().trim();
        $("#emailNos").val(str);
        var params = $("#demo-form2").serialize();
        $.ajax({
            url: '${webPath}/sendEmail/sendCAR',
            type: "POST",
            dataType: "json",
            data: params,
            success: function (res) {
                // layer.msg("邮件已发送");
            },
            error: function (res) {
                return;
            }
        })
    }

    function checkNull(carId, issueId){
        // $("#demo-form2").validate({
        //     errorClass: "error"
        // })
        // $("#demo-form2").validate();
        if($("#demo-form2").valid()){
            // if($("#demo-form2").valid()){
                //是否选中发生区域
                var val=$('input[name="happenArea"]:checked').val();
                if(val==null){
                    layer.msg("请选择发生区域")
                    return;
                }
                layer.confirm("确定提交并发送给责任人处理吗?", {
                    icon: 3,
                    title: '系统提示'
                }, function () {
                    submit(carId, issueId);
                });
            // }
        }
        // return;
    };
</script>
</body>
</html>
