<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@include file="/view/static/common/base.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="/view/static/images/favicon.ico"
          type="image/ico"/>
    <%--<link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>--%>
    <title>${sysName}</title>
    <%@include file="/view/static/common/global_css.jsp" %>

    <style type="text/css">
        th {
            border-bottom-width: 0px !important;
        }

        th, td {
            text-align: center;
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
    </style>

    <script type="text/javascript">
        var ctx = '${webPath}';
    </script>
</head>

<body class="nav-md">
<!-- 内容区开始 -->
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel" style="width:100%;float:left; margin-right:10px;">
                <%--<div class="x_title">
                    <h2>处理工具</h2><span style="float:right; font-size:14px; margin-top:10px;">状态：<font
                        style="color:#00CC00; font-weight:bold;">处理中</font></span>
                    <div class="clearfix"></div>
                </div>--%>
                <!--卡片工具开始-->
                <div class="x_content">
                    <%--<form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">--%>
                    <div class="form-group">
                        <div class="" role="tabpanel" data-example-id="togglable-tabs">
                            <%--<ul id="myTab1" class="nav nav-tabs bar_tabs right" role="tablist">
                                <li role="presentation" class="active"><a href="#tab_content11"
                                                                          id="home-tabb" role="tab"
                                                                          data-toggle="tab"
                                                                          aria-controls="home"
                                                                          aria-expanded="true">CAR</a></li>
                                <li role="presentation" class=""><a href="#tab_content22" role="tab"
                                                                    id="profile-tabb" data-toggle="tab"
                                                                    aria-controls="profile"
                                                                    aria-expanded="false">SCAR</a></li>
                                <li role="presentation" class=""><a href="#tab_content33" id="home-tabb"
                                                                    role="tab" data-toggle="tab"
                                                                    aria-controls="home"
                                                                    aria-expanded="true">7 STEP</a></li>
                                <li role="presentation" class=""><a href="#tab_content44" role="tab"
                                                                    id="profile-tabb" data-toggle="tab"
                                                                    aria-controls="profile"
                                                                    aria-expanded="false">Notification</a>
                                </li>
                            </ul>--%>


                            <!--Car表单工具开始-->
                            <c:if test="${dealPerson.status == 0}">
                                <div id="myTabContent2" class="tab-content">
                                <div role="tabpanel" class="tab-pane fade active in" id="tab_content11"
                                     aria-labelledby="home-tab">
                                    <!--Car开始-->
                                    <form id="demo-form2" data-parsley-validate
                                          class="form-horizontal form-label-left">
                                        <input type="hidden" value="${car.id}" name="id">
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
                                                    <option value="">请选择</option>
                                                    <option value="1"
                                                            <c:if test="${car.carType eq '1' }">selected</c:if>>CAR
                                                    </option>
                                                    <option value="2"
                                                            <c:if test="${car.carType eq '2' }">selected</c:if>>SCAR
                                                    </option>
                                                    <option value="3"
                                                            <c:if test="${car.carType eq '3' }">selected</c:if>>7STEP
                                                    </option>
                                                    <option value="4"
                                                            <c:if test="${car.carType eq '4' }">selected</c:if>>
                                                        Notifiction
                                                    </option>
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
                                                    <input type="radio" class="flat" name="happenArea"
                                                           id="ISF Plant"
                                                           value="1"
                                                           <c:if test="${car.happenArea eq '1' }">checked</c:if>/>&nbsp;ISF
                                                    Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <input type="radio" class="flat" name="happenArea"
                                                           id="X Plant"
                                                           value="2"
                                                           <c:if test="${car.happenArea eq '2' }">checked</c:if>/>&nbsp;X
                                                    Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <input type="radio" class="flat" name="happenArea"
                                                           id="OEM"
                                                           value="3"
                                                           <c:if test="${car.happenArea eq '3' }">checked</c:if>/>&nbsp;OEM&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <input type="radio" class="flat" name="happenArea"
                                                           id="IPTV"
                                                           value="4"
                                                           <c:if test="${car.happenArea eq '4' }">checked</c:if>/>&nbsp;IPTV&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <input type="radio" class="flat" name="happenArea"
                                                           id="Warranty"
                                                           value="5"
                                                           <c:if test="${car.happenArea eq '5' }">checked</c:if>/>&nbsp;Warranty
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
                                                            <img src="/view/static/images/icon_upload.png">
                                                            <input id="fileImage" type="file" name="file[]" multiple/>
                                                            <%--<div class="num">0/6</div>--%>
                                                        </li>
                                                    </div>
                                                </td>
                                                <td align="right">潜在影响范围/数量：</td>
                                                <td><input type="text" id="amount" name="amount"
                                                           required="required"
                                                           class="form-control" value="${car.amount}"></td>
                                            </tr>
                                            <tr>
                                                <td align="right">邮件通知：</td>
                                                <td>
                                                    <textarea name="notice" rows="4" class="form-control"
                                                              id="notice" required="required"
                                                              data-parsley-trigger="keyup"
                                                              data-parsley-minlength="20"
                                                              data-parsley-maxlength="100"
                                                              placeholder="请输入通知内容"
                                                    ></textarea>
                                                </td>
                                                <td align="right">目标关闭日期：</td>
                                                <td><input type="date" id="aimCloseDate" name="aimCloseDate"
                                                           required="required"
                                                           value="<fmt:formatDate value="${car.aimCloseDate}" pattern="yyyy-MM-dd"/>"
                                                           class="form-control" pattern="yyyy-MM-dd HH:mm:ss"></td>
                                            </tr>
                                            <tr>
                                                <td align="right">邮件接收人：</td>
                                                <td>
                                                    <select id="sendEmail" name="email" class="form-control"
                                                            multiple="multiple">
                                                    </select>
                                                </td>
                                                <td align="right"></td>
                                                <td>
                                                </td>
                                            </tr>
                                        </table>
                                        <%@include file="/view/static/common/img.jsp" %>
                                    </form>
                                    <div class="ln_solid"></div>
                                    <div class="form-group">
                                        <div style="text-align:center">
                                            <button class="btn" type="button"
                                                    onClick="javascrtpt:window.location.href='${webPath}/back/toApu'">
                                                取消
                                            </button>
                                            <%--<button class="btn btn-primary" type="button" data-toggle="modal"
                                                    data-target=".this-go">保存
                                            </button>--%>
                                            <button class="btn btn-success" type="button" data-toggle="modal"
                                                    data-target=".this-go"
                                                    onclick="submit('${car.id}','${car.issueId}')">提交
                                            </button>
                                        </div>
                                    </div>
                                    <!--Car结束-->
                                </div>
                                <!--Car表单工具结束-->
                            </div>
                            </c:if>
                            <c:if test="${dealPerson.status != 0}">
                                <div id="myTabContent2" class="tab-content">
                                    <div role="tabpanel" class="tab-pane fade active in" id="tab_content11"
                                         aria-labelledby="home-tab">
                                        <!--Car开始-->
                                        <form id="demo-form2" data-parsley-validate
                                              class="form-horizontal form-label-left">
                                            <input type="hidden" value="${car.id}" name="id">
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
                                                    <td><input readonly type="text" id="dutyDept" name="dutyDept"
                                                               required="required"
                                                               class="form-control" value="${car.dutyDept}"></td>
                                                </tr>
                                                <tr>
                                                    <td align="right">责任人：</td>
                                                    <td><input readonly type="text" id="dutyPersonName"
                                                               name="dutyPersonName" required="required"
                                                               class="form-control" value="${car.dutyPersonName}"></td>
                                                    <td align="right">CAR类型：</td>
                                                    <td><select disabled name="carType" class="form-control">
                                                        <option value="">请选择</option>
                                                        <option value="1"
                                                                <c:if test="${car.carType eq '1' }">selected</c:if>>CAR
                                                        </option>
                                                        <option value="2"
                                                                <c:if test="${car.carType eq '2' }">selected</c:if>>SCAR
                                                        </option>
                                                        <option value="3"
                                                                <c:if test="${car.carType eq '3' }">selected</c:if>>
                                                            7STEP
                                                        </option>
                                                        <option value="4"
                                                                <c:if test="${car.carType eq '4' }">selected</c:if>>
                                                            Notifiction
                                                        </option>
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
                                                        <input readonly type="radio" class="flat" name="happenArea"
                                                               id="ISF Plant"
                                                               value="1"
                                                               <c:if test="${car.happenArea eq '1' }">checked</c:if>/>&nbsp;ISF
                                                        Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                        <input readonly type="radio" class="flat" name="happenArea"
                                                               id="X Plant"
                                                               value="2"
                                                               <c:if test="${car.happenArea eq '2' }">checked</c:if>/>&nbsp;X
                                                        Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                        <input readonly type="radio" class="flat" name="happenArea"
                                                               id="OEM"
                                                               value="3"
                                                               <c:if test="${car.happenArea eq '3' }">checked</c:if>/>&nbsp;OEM&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                        <input readonly type="radio" class="flat" name="happenArea"
                                                               id="IPTV"
                                                               value="4"
                                                               <c:if test="${car.happenArea eq '4' }">checked</c:if>/>&nbsp;IPTV&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                        <input readonly type="radio" class="flat" name="happenArea"
                                                               id="Warranty"
                                                               value="5"
                                                               <c:if test="${car.happenArea eq '5' }">checked</c:if>/>&nbsp;Warranty
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td align="right">Step1 识别问题：</td>
                                                    <td colspan="3"><input readonly type="text" id="stepOne"
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
                                                                <img src="/view/static/images/icon_upload.png">
                                                                <input readonly id="fileImage" type="file" name="file[]"
                                                                       multiple/>
                                                               <%--<div class="num">0/6</div>--%>
                                                            </li>
                                                        </div>
                                                    </td>
                                                    <td align="right">潜在影响范围/数量：</td>
                                                    <td><input readonly type="text" id="amount" name="amount"
                                                               required="required"
                                                               class="form-control" value="${car.amount}"></td>
                                                </tr>
                                                <tr>
                                                    <td align="right">邮件通知：</td>
                                                    <td>
                                                    <textarea readonly name="notice" rows="4" class="form-control"
                                                              id="notice" required="required"
                                                              data-parsley-trigger="keyup"
                                                              data-parsley-minlength="20"
                                                              data-parsley-maxlength="100"
                                                              placeholder="请输入通知内容"
                                                    ></textarea>
                                                    </td>
                                                    <td align="right">目标关闭日期：</td>
                                                    <td><input readonly type="date" id="aimCloseDate"
                                                               name="aimCloseDate"
                                                               required="required"
                                                               value="<fmt:formatDate value="${car.aimCloseDate}" pattern="yyyy-MM-dd"/>"
                                                               class="form-control" pattern="yyyy-MM-dd HH:mm:ss"></td>
                                                </tr>
                                                <tr>
                                                    <td align="right">邮件接收人：</td>
                                                    <td>
                                                        <select disabled id="sendEmail" name="email"
                                                                class="form-control"
                                                                multiple="multiple">
                                                        </select>
                                                    </td>
                                                    <td align="right"></td>
                                                    <td>
                                                    </td>
                                                </tr>
                                            </table>
                                            <%@include file="/view/static/common/img.jsp" %>
                                        </form>
                                        <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div style="text-align:center">
                                                <button class="btn" type="button"
                                                        onClick="javascrtpt:window.location.href='${webPath}/back/toApu'">
                                                    取消
                                                </button>
                                                    <%--<button class="btn btn-primary" type="button" data-toggle="modal"
                                                            data-target=".this-go">保存
                                                    </button>--%>
                                                <button class="btn btn-success" type="button" data-toggle="modal"
                                                        data-target=".this-go"
                                                        onclick="submit('${car.id}','${car.issueId}')">提交
                                                </button>
                                            </div>
                                        </div>
                                        <!--Car结束-->
                                    </div>
                                    <!--Car表单工具结束-->
                                </div>
                            </c:if>
                        </div>
                    </div>
                    <%--</form>--%>
                </div>
                <!--卡片工具完成-->
            </div>
        </div>
    </div>
</div>
<!-- 内容区结束 -->
<%@include file="/view/static/common/core_js.jsp" %>
<script>
    //获取处理记录
    $(function getDealLog() {
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
                            + '<div style="width:8%; float:left; text-align:center"><img src="/view/static/images/time.png"></div>'
                            + '<div style="width:51%; float:right">' + logList[i].processPerson + ' ' + logList[i].actionName + '</div>'
                            + '</div>';
                    }
                }
                ;
                $("#dealLog").append(html);
            }
        })
    })
    //默认选中第一个
    /*$(function () {
        $('input:radio:first').attr('checked', 'checked');
    })*/
    //提交
    function submit(carId, issueId) {
        var params = $("#demo-form2").serialize();
        $.ajax({
            url: '${webPath}/car/addStep1',
            type: "POST",
            dataType: "json",
            data: params,
            success: function (res) {
                //提交时发送邮件
                send();
                $("input[type='radio']").attr('disabled', 'disabled');
                $("input[type='checkbox']").attr('disabled', 'disabled');
                $("input,textarea").each(function () {
                    $(this).attr('readonly', 'readonly');
                });
                $("select").attr('disabled', 'disabled');
                //window.location.href = '${webPath}/bims/apucheck/toCarStep27?carId=' + carId + '&issueId=' + issueId;
            }
        })

    }

    //邮件接收人
    jQuery(document).ready(function () {
        //前置库下拉框
        $('#sendEmail').select2({
            placeholder: "-- 输入姓名 --",
            language: "zh-CN",
            minimumInputLength: 0,
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
        var msg = $("#notice").val();
        var emails = $("#sendEmail").val();
        var str = emails.toString();
        $.ajax({
            url: '${webPath}/sendEmail/send',
            type: "POST",
            dataType: "json",
            data: {
                notificationInfo: msg,
                back1: str,
            },
            success: function (res) {
                alert("邮件已发送");
            }
        })
    }
</script>
</body>
</html>
