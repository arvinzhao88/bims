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
            <div role="tabpanel" class="tab-pane fade active in" id="tab_content11"
                 aria-labelledby="home-tab">
                <!--Car开始-->
                <form id="demo-form2" data-parsley-validate
                      class="form-horizontal form-label-left">
                    <input type="hidden" value="${car.id}" name="id">

                    <fieldset>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0"
                           class="table table-hover table-bordered">

                        <div class="ln_solid"></div>
                        <div class="x_title">
                            <h2>Step1：</h2>
                            <div class="clearfix"></div>
                        </div>
                        <tr>
                            <td width="23%" align="right">纠正措施报告编号：</td>
                            <td width="29%"><input readonly type="text" id="carNo"
                                                   name="carNo"
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
                            <td><input readonly type="text" id="sponsorName"
                                       name="sponsorName"
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
                                       class="form-control" value="${car.dutyPersonName}">
                            </td>
                            <td align="right">CAR类型：</td>
                            <td><select readonly name="carType" class="form-control">
                                <option value="">请选择</option>
                                <option value="1"
                                        <c:if test="${car.carType eq '1' }">selected</c:if>>
                                    CAR
                                </option>
                                <option value="2"
                                        <c:if test="${car.carType eq '2' }">selected</c:if>>
                                    SCAR
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
                                <input type="checkbox" class="flat" name="happenArea"
                                       id="ISF Plant"
                                       value="1" <c:if test="${fn:contains(car.happenArea, '1') }">checked="checked"</c:if>/>&nbsp;ISF Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="checkbox" class="flat" name="happenArea"
                                       id="X Plant"
                                       value="2" <c:if test="${fn:contains(car.happenArea, '2') }">checked="checked"</c:if>/>&nbsp;X Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="checkbox" class="flat" name="happenArea"
                                       id="OEM"
                                       value="3" <c:if test="${fn:contains(car.happenArea, '3') }">checked="checked"</c:if> />&nbsp;OEM&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="checkbox" class="flat" name="happenArea"
                                       id="IPTV"
                                       value="4" <c:if test="${fn:contains(car.happenArea, '4') }">checked="checked"</c:if> />&nbsp;IPTV&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="checkbox" class="flat" name="happenArea"
                                       id="Warranty"
                                       value="5" <c:if test="${fn:contains(car.happenArea, '5') }">checked="checked"</c:if> />&nbsp;Warranty
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
                            <%--<td><i class="fa fa-file-picture-o"
                                   style="font-size:30px;vertical-align:middle;"></i>&nbsp;<button
                                    type="button" class="btn btn-default btn-sm">上传图片
                            </button>
                            </td>--%>
                            <td class="list-img">
                                <ul id="preview" class="clear">
                                    <li class="fl">
                                        <%--<img src="${resPath}/view/static/images/icon_upload.png">--%>
                                        <%--<input id="fileImage" type="file" name="file" multiple/>--%>
                                        <%--<div class="num">0/6</div>--%>
                                    </li>
                                </ul>
                            </td>
                            <td align="right">潜在影响范围/数量：</td>
                            <td><input readonly type="text" id="amount" name="amount"
                                       required="required"
                                       class="form-control" value="${car.amount}"></td>
                        </tr>
                        <tr>
                            <td align="right">邮件通知：</td>
                            <td><input readonly type="text" id="notice" name="notice"
                                       class="form-control" value="${car.emailReceive}"></td>
                            <td align="right">目标关闭日期：</td>
                            <td><input readonly type="date" id="aimCloseDate"
                                       name="aimCloseDate"
                                       required="required"
                                       class="form-control"
                                       value="<fmt:formatDate value="${car.aimCloseDate}" pattern="yyyy-MM-dd"/>">
                            </td>
                        </tr>
                    </table>
                    </fieldset>
                    <%@include file="/view/static/common/img.jsp" %>
                    <input type="hidden" id="attach" name="attach" value="${car.picture}">

                    <div class="ln_solid"></div>
                    <div class="x_title">
                        <h2>Step2识别和排列必然原因：</h2>
                        <div class="clearfix"></div>
                    </div>

                    <div class="form-group">
                        <table width="100%" border="0" cellpadding="0" cellspacing="0"
                               style="border-collapse:separate;border-spacing:15px;">
                            <tr>
                                <td align="right" style="width:17%">必然原因：</td>
                                <td><input type="text" id="stepTwo" name="stepTwo"
                                           required="required" class="form-control"
                                           value="${car.stepTwo}"></td>
                                <td width="8%" align="right">&nbsp;</td>
                            </tr>
                            <tr>
                                <td align="right">附件上传：</td>

                                <td><i class="fa fa fa-file-text"
                                       style="font-size:30px;vertical-align:middle;"></i>&nbsp;
                                    <button style="right: auto" id="yyzz" type="button" class="btn btn-default btn-sm" onclick="$('#YYZZFBSMJ').click();">
                                        上传附件
                                    </button><span id="setp2fileName"></span>
                                    <input type="file" multiple name="YYZZFBSMJ" id="YYZZFBSMJ" style="display: none;" onchange="setp2File()">
                                    <c:if test="${empty extCar}">
                                        <input type="hidden" name="" id="setp2file" style="display: none;" value="">
                                    </c:if>
                                        <c:forEach items="${extCar}" var="ext">
                                            <c:if test="${ext.carStep == '2' && not empty ext.attachName}">
                                                <input type="hidden" name="" id="setp2file" style="display: none;" value="${ext.attachName}">
                                                <a href="${uploadUrl}${ext.attachName}" download target="_blank">查看附件</a>
                                            </c:if>
                                            <c:if test="${ext.carStep == '2' &&  empty ext.attachName}">
                                                <input type="hidden" name="" id="setp2file" style="display: none;" value="">
                                            </c:if>
                                        </c:forEach>
                                </td>
                                <td align="right"></td>
                            </tr>
                        </table>
                    </div>

                    <div class="ln_solid"></div>
                    <div class="x_title">
                        <h2>Step3 采取短期措施</h2>
                        <div class="clearfix"></div>
                    </div>
                    <div id="step3" class="form-group">

                    </div>
                    <div class="form-group">
                        <table width="100%" border="0" cellpadding="0" cellspacing="0"
                               style="border-collapse:separate;border-spacing:15px;">
                            <%--<tr>
                                <td align="right" style="width:17%">断点：</td>
                                <td><input type="text" id="breakpoint" name="breakpoint"
                                           required="required" class="form-control"
                                           value="${car.breakpoint}"></td>
                                <td width="8%" align="right">&nbsp;</td>
                            </tr>--%>
                        </table>
                    </div>

                    <div class="ln_solid"></div>
                    <div class="x_title">
                        <h2>Step4 确定必然原因</h2>
                        <div class="clearfix"></div>
                    </div>
                    <div id="step4" class="form-group">

                    </div>


                    <div class="ln_solid"></div>
                    <div class="x_title">
                        <h2>Step5 选择和验证解决方案</h2>
                        <div class="clearfix"></div>
                    </div>

                    <div class="ln_solid"></div>

                    <div id="step5" class="form-group">

                    </div>


                    <div class="ln_solid"></div>
                    <div class="x_title">
                        <h2>Step6 实施永久解决方案</h2>
                        <div class="clearfix"></div>
                    </div>

                    <div id="step6" class="form-group">

                    </div>
                    <div id="step6addfile" class="form-group">
                        <table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">
                            <tr>
                                <td align="right" style="width:17%">添加附件：</td>
                                <td colspan="3"><i class="fa fa fa-file-text" style="font-size:30px;vertical-align:middle;"></i>&nbsp;
                                    <button type="button" class="btn btn-default btn-sm" onclick=$("#AAABBB").click();>上传附件</button><span id="setp6fileName"></span>
                                    <input type="file" name="AAABBB" id="AAABBB" style="display: none;" onchange=step6File()>
                                    <c:if test="${empty extCar}">
                                        <input type="hidden" name="" id="step6file" style="display: none;" value="">
                                    </c:if>
                                        <c:forEach items="${extCar}" var="ext">
                                            <c:choose>
                                                <c:when test="${ext.carStep == '6' && not empty ext.sixthAttach}">
                                                    <input type="hidden" name="" id="step6file" style="display: none;" value="${ext.sixthAttach}">
                                                    <a href="${uploadUrl}${ext.sixthAttach}" download target="_blank">查看附件</a>
                                                </c:when>
                                                <c:when test="${ext.carStep == '6' && empty ext.sixthAttach}">
                                                     <input type="hidden" name="" id="step6file" style="display: none;" value="">
                                                </c:when>
                                            </c:choose>
                                        </c:forEach>

                                <td align="right"></td>
                            </tr>
                        </table>
                    </div>
                    <div class="form-group">
                        <table width="100%" border="0" cellpadding="0" cellspacing="0"
                               style="border-collapse:separate;border-spacing:15px;">
                            <tr>
                                <td width="20%" align="right" style="width:17%">改进过程：
                                </td>
                                <td colspan="5">
                                    <input type="checkbox" class="flat" name="improve" <c:if test="${fn:contains(car.improve, 'ER') }">checked="checked"</c:if>
                                           id="ER" value="ER"  required/>&nbsp;ER&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <input type="checkbox" class="flat" name="improve" <c:if test="${fn:contains(car.improve, 'MCR') }">checked="checked"</c:if>
                                           id="MCR" value="MCR"/>&nbsp;MCR&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <input type="checkbox" class="flat" name="improve" <c:if test="${fn:contains(car.improve, 'SCR') }">checked="checked"</c:if>
                                           id="SCR" value="SCR"/>&nbsp;SCR&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                </td>
                            </tr>
                            <tr>
                                <td align="right">断点：</td>
                                <td><input name="breakpoint" type="text" id="breakpoint"
                                           required="required" class="form-control"
                                           value="${car.breakpoint}"></td>
                                <td align="right">更新文件：</td>
                                <td><input name="updateFile" type="text" id="updateFile"
                                           required="required" class="form-control"
                                           value="${car.updateFile}"></td>
                                <td align="right"></td>
                            </tr>
                        </table>
                    </div>
                    <div class="ln_solid"></div>
                    <%--<div class="form-group">
                        <div style="text-align:center">
                            <button class="btn" type="button"
                                    onClick="javascrtpt:window.location.href='z_a_eqr.html'">
                                取消
                            </button>
                            <button class="btn btn-primary" type="button" data-toggle="modal"
                                    data-target=".this-go">保存
                            </button>
                        </div>
                    </div>--%>


                    <div class="x_title">
                        <h2>Step7.1 防止再发生</h2>
                        <div class="clearfix"></div>
                    </div>
                    <div class="form-group">
                        <table width="100%" border="0" cellpadding="0" cellspacing="0"
                               style="border-collapse:separate;border-spacing:15px;">
                            <tr>
                                <td align="right" style="width:17%">RCA：</td>
                                <td><input name="rac" type="text" id="rac" class="form-control"
                                           value="${car.rac}"></td>
                                <td align="right">7步法报告上传：</td>
                                <td><i class="fa fa fa-file-text"
                                       style="font-size:30px;vertical-align:middle;"></i>&nbsp;
                                    <button type="button" class="btn btn-default btn-sm" onclick="$('#SSTTEEPP7').click();">
                                        上传附件
                                    </button><span id="setp7fileName"></span>
                                    <input type="file" name="SSTTEEPP7" id="SSTTEEPP7" style="display: none;" onchange="step7File()">
                                    <%--<input type="hidden" name="" id="setp7file" style="display: none;" value=""><span id="setp7fileName"></span>
                                    <c:forEach items="${extCar}" var="ext">
                                        <c:if test="${ext.carStep == '7' && not empty ext.reportName}">
                                            <input type="hidden" name="" id="setp7file" style="display: none;" value="${ext.reportName}"><span id="setp7fileName"></span>
                                            <a href="${uploadUrl}${ext.reportName}" download target="_blank">查看附件</a>
                                        </c:if>
                                    </c:forEach>--%>
                                    <c:if test="${empty extCar}">
                                        <input type="hidden" name="" id="setp7file" style="display: none;" value="">
                                    </c:if>
                                        <c:forEach items="${extCar}" var="ext">
                                            <c:choose>
                                                <c:when test="${ext.carStep == '7' && not empty ext.reportName}">
                                                    <input type="hidden" name="" id="setp7file" style="display: none;" value="${ext.reportName}">
                                                    <a href="${uploadUrl}${ext.reportName}" download target="_blank">查看附件</a>
                                                </c:when>
                                                <c:when test="${ext.carStep == '7' && empty ext.reportName}">
                                                    <input type="hidden" name="" id="setp7file" style="display: none;" value="">
                                                </c:when>
                                            </c:choose>
                                        </c:forEach>
                                </td>
                                <%--<td align="right"></td>--%>
                                <%--<td align="right"></td>--%>
                            </tr>

                        </table>
                    </div>
                </form>

                <div class="ln_solid"></div>
                <div id="carbtn" class="form-group">
                    <div style="text-align:center">
                        <%--<button class="btn" type="button"
                                onClick="">
                            取消
                        </button>--%>
                        <button class="btn btn-primary" type="button" data-toggle="modal"
                                <%--data-target=".this-go"--%> onclick="checkNull()">提交
                        </button>
                    </div>
                </div>
                <!--Car结束-->
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
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:1000px;">
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
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onclick="checkNull();">确定
                </button>
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
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:1400px;">
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
<script>
    /**
     * 针对具有相同名称的元素的验证的处理
     */
    $(function(){
        if ($.validator) {
            $.validator.prototype.elements = function () {
                var validator = this,
                    rulesCache = {};

                // select all valid inputs inside the form (no submit or reset buttons)
                return $(this.currentForm)
                    .find("input, select, textarea")
                    .not(":submit, :reset, :image, [disabled]")
                    .not(this.settings.ignore)
                    .filter(function () {
                        if (!this.name && validator.settings.debug && window.console) {
                            console.error("%o has no name assigned", this);
                        }
                        //注释这行代码
                        // select only the first element for each name, and only those with rules specified
                        //if ( this.name in rulesCache || !validator.objectLength($(this).rules()) ) {
                        //    return false;
                        //}
                        rulesCache[this.name] = true;
                        return true;
                    });
            }
        }
    });
</script>
<script type="text/javascript">
    //默认当前日期
    $(document).ready(function () {
        var time = new Date();
        var day = ("0" + time.getDate()).slice(-2);
        var month = ("0" + (time.getMonth() + 1)).slice(-2);
        var today = time.getFullYear() + "-" + (month) + "-" + (day);
        $('input[type="date"]').val(today);
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
        $('input[type="date"]').attr("min",year+"-"+month+"-"+date);
    })
    //页面数据加载完成时判断
    $(window).load(function(){
        var status = '${toolPerson.status}';
        if(status == "2") {
            $(":input").attr("disabled","disabled");
            $(":checkbox").attr("disabled","disabled");
            $(":selected").attr("disabled","disabled");
            $(":button").attr("disabled","disabled");
        }
    });
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
        laydate.render({
            elem: '#thirdExecuteDate'/*,
            format: 'yyyy年MM月dd日'*/
        });
        laydate.render({
            elem: '#fourthDate'
        });
        laydate.render({
            elem: '#fifthDate'
        });
        laydate.render({
            elem: '#sixthDate'
        });
        laydate.render({
            elem: '#sixthExecuteDate'
        });
    });

    //判断加载初始数据
    
    $(function initHtml() {
        var id = ${car.id};
        $.ajax({
            url: "${webPath}/car/getExtCar",
            type: "POST",
            dataType: "json",
            data: {
                id: id,
            },
            success: function (res) {
                console.log(res.obj)
                if(res.obj.length>0){
                    getExtCar();
                }else {
                    getStep37();
                }
            }
        })
        
    })


    function getExtCar()  {
        var carStep3 = 0;
        var carStep4 = 0;
        var carStep5 = 0;
        var carStep6 = 0;
        var id = ${car.id};
        $.ajax({
            url: "${webPath}/car/getExtCar",
            type: "POST",
            dataType: "json",

            data: {
                id: id,
            },
            success: function (res) {
                console.log(res)
                var id = res.obj.id;
                if (res.success) {
                    for (let i = 0; i <res.obj.length ; i++) {
                        var adddelhtml = "";

                        if (res.obj[i].carStep =="3"){
                            if (carStep3==0){
                                adddelhtml +='<td align="right">'
                                    + '<a href="javascript:;" class="addInputReturn3">'
                                    + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                    + '</a>'
                                    + '</td>';

                            } else {
                                adddelhtml +='<td align="right">'
                                    + '<a href="javascript:;" class="delInput3">'
                                    + '<span class="glyphicon glyphicon-minus"></span> 删除'
                                    + '</a>'
                                    + '</td>';
                            }

                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<input type="hidden" value="'+res.obj[i].id+'" name="id">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">短期措施：</td>'
                                + '<td colspan="3"><input name="measure" type="text" id="measure" required="required" class="form-control" value="'+res.obj[i].measure+'"></td>'
                                + adddelhtml
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">责任人：</td>'
                                // + '<td><select name="thirdDutyPerson" type="text" id="thirdDutyPerson" required="required" class="form-control"><option>'+res.obj[i].thirdDutyPerson+'</option></select></td>'
                                + '<td><input name="thirdDutyPerson" type="text" id="thirdDutyPerson'+carStep3+'" required="required" class="form-control" value="'+res.obj[i].thirdDutyPerson+'"></td>'
                                + '<td align="right">执行日期：</td>'
                                + '<td><input readonly name="thirdExecuteDate" type="text" id="thirdExecuteDate" required="required" class="layui-input" value="'+res.obj[i].thirdExecuteDate+'"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '</table>';
                            $("#step3").append(html);
                            // getDutyPerson("thirdDutyPerson");
                            carStep3++;
                        }
                        if (res.obj[i].carStep=="4"){
                            if (carStep4==0){
                                adddelhtml +='<td align="right">'
                                    + '<a href="javascript:;" class="addInputReturn4">'
                                    + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                    + '</a>'
                                    + '</td>';

                            } else {
                                adddelhtml +='<td align="right">'
                                    + '<a href="javascript:;" class="delInput4">'
                                    + '<span class="glyphicon glyphicon-minus"></span> 删除'
                                    + '</a>'
                                    + '</td>';
                            }
                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<input type="hidden" value="'+res.obj[i].id+'" name="id">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">潜在原因：</td>'
                                + '<td colspan="3"><input name="reason" type="text" id="reason" required="required" class="form-control" value="'+res.obj[i].reason+'" pattern="yyyy-MM-dd"></td>'
                                + adddelhtml
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">验证方法：</td>'
                                + '<td><input name="method" type="text" id="method" required="required" class="form-control" value="'+res.obj[i].method+'"></td>'
                                + '<td align="right">责任人：</td>'
                                // + '<td><select name="fourthDutyPerson" type="text" id="fourthDutyPerson" required="required" class="form-control" ><option>'+res.obj[i].fourthDutyPerson+'</option></select></td>'
                                + '<td><input name="fourthDutyPerson" type="text" id="fourthDutyPerson" required="required" class="form-control" value="'+res.obj[i].fourthDutyPerson+'"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">目标日期：</td>'
                                + '<td><input readonly name="fourthDate" type="text" id="fourthDate" required="required" class="layui-input" value="'+res.obj[i].fourthDate+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">结论 Y/N：</td>'
                                + '<td><select  name="conclusion" type="" id="conclusion'+i+'" required="required" class="form-control"><option value="">请选择</option><option value="YES">YES</option><option value="NO">NO</option> </select></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '</table>';
                            $("#step4").append(html);

                            var conclusion = res.obj[i].conclusion;
                            var all_select=$('#conclusion'+i+'  > option');
                            for(var j=0;j<all_select.length;j++){
                                var svalue=all_select[j].value;
                                if(conclusion==svalue){  //取select中所有的option的值与其进行对比，相等则令这个option添加上selected属性
                                    $('#conclusion'+i+' option[value='+svalue+']').attr("selected","selected");
                                }
                            }
                            // getDutyPerson("fourthDutyPerson");
                            carStep4++;
                        }
                        if (res.obj[i].carStep=="5"){
                            if (carStep5==0){
                                adddelhtml +='<td align="right">'
                                    + '<a href="javascript:;" class="addInputReturn5">'
                                    + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                    + '</a>'
                                    + '</td>';

                            } else {
                                adddelhtml +='<td align="right">'
                                    + '<a href="javascript:;" class="delInput5">'
                                    + '<span class="glyphicon glyphicon-minus"></span> 删除'
                                    + '</a>'
                                    + '</td>';
                            }
                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<input type="hidden" value="'+res.obj[i].id+'" name="id">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">解决潜在原因方案：</td>'
                                + '<td colspan="3"><input name="scheme" type="text" id="scheme" required="required" class="form-control" value="'+res.obj[i].scheme+'"></td>'
                                + adddelhtml
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">验证结果：</td>'
                                + '<td><input name="schemeResult" type="text" id="schemeResult" required="required" class="form-control" value="'+res.obj[i].schemeResult+'"></td>'
                                + '<td align="right">目标日期：</td>'
                                + '<td><input readonly name="fifthDate" type="text" id="fifthDate" required="required" class="layui-input" value="'+res.obj[i].fifthDate+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">关键行动：</td>'
                                + '<td><input name="action" type="text" id="action" required="required" class="form-control" value="'+res.obj[i].action+'"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '<td>&nbsp;</td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '</table>';
                            $("#step5").append(html);
                            carStep5++;
                        }
                        if (res.obj[i].carStep=="6"){
                            if (carStep6==0){
                                adddelhtml +='<td align="right">'
                                    + '<a href="javascript:;" class="addInputReturn6">'
                                    + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                    + '</a>'
                                    + '</td>';

                            } else {
                                adddelhtml +='<td align="right">'
                                    + '<a href="javascript:;" class="delInput6">'
                                    + '<span class="glyphicon glyphicon-minus"></span> 删除'
                                    + '</a>'
                                    + '</td>';
                            }
                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<input type="hidden" value="'+res.obj[i].id+'" name="id">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">永久解决方案：</td>'
                                + '<td colspan="3"><input name="lastScheme" type="text" id="lastScheme" required="required" class="form-control" value="'+res.obj[i].lastScheme+'"></td>'
                                +  adddelhtml
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">责任人：</td>'
                                // + '<td><select  name="sixthDutyPerson" type="text" id="sixthDutyPerson" required="required" class="form-control" ><option>'+res.obj[i].sixthDutyPerson+'</option></select></td>'
                                + '<td><input name="sixthDutyPerson" type="text" id="sixthDutyPerson" required="required" class="form-control" value="'+res.obj[i].sixthDutyPerson+'"></td>'
                                + '<td align="right">目标日期：</td>'
                                + '<td><input readonly name="sixthDate" type="text" id="sixthDate" required="required" class="layui-input" value="'+res.obj[i].sixthDate+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">执行日期：</td>'
                                + '<td><input readonly name="sixthExecuteDate" type="text" id="sixthExecuteDate" required="required" class="layui-input" value="'+res.obj[i].sixthExecuteDate+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '<td>&nbsp;</td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '</table>';
                            $("#step6").append(html);
                            //getDutyPerson("sixthDutyPerson");
                            carStep6++;
                        }
                    }

                }
            }
        });
    }


    $(document).ready(function () {
        //getDutyPerson();
       /* alert($("#setp2file").val())
        alert($("#step6file").val())
        alert($("#setp7file").val())*/
    });
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
                            + '<div style="width:8%; float:left; text-align:center"><img src="/view/static/images/time.png"></div>'
                            + '<div style="width:51%; float:right">' + logList[i].processPerson + ' ' + logList[i].actionName + '</div>'
                            + '</div>';
                    }
                }
                ;
                $("#dealLog").append(html);
            }
        })
    })*/

    function checkNull(){
        // $("#demo-form2").validate({
        //     errorClass: "error"
        // })
        // $("#demo-form2").validate();
        if($("#demo-form2").valid()){
            layer.confirm("确定提交并发送给审核人处理吗?", {
                offset: "70%",
                icon: 3,
                title: '系统提示'
            }, function () {
                submit("${car.id}","${car.issueId}");
            });
        }
        // return;
    };


    //提交
    function submit(carId, issueId) {
        var stepTwo = $("#stepTwo").val();
        var breakpoint = $("#breakpoint").val();
        // var improve = $("input[name='improve']:checked").val();
        var improve = $('input:checkbox[name="improve"]:checked').map(function () {
            return $(this).val();
        }).get().join(",");
        var updateFile = $("#updateFile").val();
        var rac = $("#rac").val();
        var arr = new Array();

        //step2附件
        var setp2filePath = $("#setp2file").val();
        arr.push({
            carStep: "2",
            attachName: "" + setp2filePath + "",
        })

        //step6附件
        var setp6filePath = $("#step6file").val();

        //step7.1附件
        var setp7filePath = $("#setp7file").val();
        arr.push({
            carStep: "7",
            reportName: "" + setp7filePath + "",
        })

        let step3 = $('#step3').find("table");
        for (let i = 0; i < step3.length; i++) {
            let id = step3.eq(i).find('input[name="id"]').val();
            let measure = step3.eq(i).find('input[name="measure"]').val();
            // let thirdDutyPerson = step3.eq(i).find('select[name="thirdDutyPerson"]').val();
            let thirdDutyPerson = step3.eq(i).find('input[name="thirdDutyPerson"]').val();
            let thirdExecuteDate = step3.eq(i).find('input[name="thirdExecuteDate"]').val();
            arr.push({
                id: "" + id + "",
                carStep: "3",
                measure: "" + measure + "",
                thirdDutyPerson: "" + thirdDutyPerson + "",
                thirdExecuteDate: "" + thirdExecuteDate + ""
            })
        }
        ;

        let step4 = $('#step4').find("table");
        for (let i = 0; i < step4.length; i++) {
            let id = step4.eq(i).find('input[name="id"]').val();
            let reason = step4.eq(i).find('input[name="reason"]').val();
            let method = step4.eq(i).find('input[name="method"]').val();
            // let fourthDutyPerson = step4.eq(i).find('select[name="fourthDutyPerson"]').val();
            let fourthDutyPerson = step4.eq(i).find('input[name="fourthDutyPerson"]').val();
            let fourthDate = step4.eq(i).find('input[name="fourthDate"]').val();
            let conclusion = step4.eq(i).find('select[name="conclusion"]').val();
            arr.push({
                id: "" + id + "",
                carStep: "4",
                reason: "" + reason + "",
                method: "" + method + "",
                fourthDutyPerson: "" + fourthDutyPerson + "",
                fourthDate: "" + fourthDate + "",
                conclusion: "" + conclusion + ""
            })
        }
        ;

        let step5 = $('#step5').find("table");
        for (let i = 0; i < step5.length; i++) {
            let id = step5.eq(i).find('input[name="id"]').val();
            let scheme = step5.eq(i).find('input[name="scheme"]').val();
            let schemeResult = step5.eq(i).find('input[name="schemeResult"]').val();
            let fifthDate = step5.eq(i).find('input[name="fifthDate"]').val();
            let action = step5.eq(i).find('input[name="action"]').val();
            arr.push({
                id: "" + id + "",
                carStep: "5",
                carId: "" + carId + "",
                scheme: "" + scheme + "",
                schemeResult: "" + schemeResult + "",
                fifthDate: "" + fifthDate + "",
                action: "" + action + ""
            })
        }
        ;

        let step6 = $('#step6').find("table");
        for (let i = 0; i < step6.length; i++) {
            let id = step6.eq(i).find('input[name="id"]').val();
            let lastScheme = step6.eq(i).find('input[name="lastScheme"]').val();
            // let sixthDutyPerson = step6.eq(i).find('select[name="sixthDutyPerson"]').val();
            let sixthDutyPerson = step6.eq(i).find('input[name="sixthDutyPerson"]').val();
            let sixthDate = step6.eq(i).find('input[name="sixthDate"]').val();
            let sixthExecuteDate = step6.eq(i).find('input[name="sixthExecuteDate"]').val();
            /*let sixthAttach = step6.eq(i).find('input[name="sixthAttach"]').val();
            let sixthAttachName = step6.eq(i).find('input[name="sixthAttachName"]').val();
            let sixthAttachDesc = step6.eq(i).find('input[name="sixthAttachDesc"]').val();*/
            arr.push({
                id: "" + id + "",
                carStep: "6",
                lastScheme: "" + lastScheme + "",
                sixthDutyPerson: "" + sixthDutyPerson + "",
                sixthDate: "" + sixthDate + "",
                sixthExecuteDate: "" + sixthExecuteDate + "",
                sixthAttach: "" + setp6filePath + "",
                /*sixthAttach: "" + sixthAttach + "",
                sixthAttachName: "" + sixthAttachName + "",
                sixthAttachDesc: "" + sixthAttachDesc + ""*/
            })
        }
        ;
        var params = {
            "id": "" + carId + "",
            "issueId": "" + issueId + "",
            "stepTwo": "" + stepTwo + "",
            "breakpoint": "" + breakpoint + "",
            "improve": "" + improve + "",
            "updateFile": "" + updateFile + "",
            "rac": "" + rac + "",
            "ext": arr,
            "carNo": "${car.carNo}"
        };
        console.log(JSON.stringify(params))
        $.ajax({
            url: '${webPath}/car/updStep',
            type: "POST",
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(params),
            success: function (res) {
                console.log(res)
                $("#carbtn").hide();
                $(":input").attr("disabled","disabled");
                $(":checkbox").attr("disabled","disabled");
                $(":selected").attr("disabled","disabled");
                $(":button").attr("disabled","disabled");
                layer.msg("提交成功!", {offset: "70%"});
                setTimeout(function(){ window.location.reload(); }, 1000);
                <%--window.location.href = '${webPath}/bims/apucheck/toCarStep27detail?carId=' + carId + '&issueId=' + issueId;--%>
            },
            error: function () {
                layer.msg("提交失败!", {offset: "70%"});
            }
        })
    }

    function getStep37(){
        //加载step3
        $(function () {
            var html = "";
            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                + '<input type="hidden" value="" name="id">'
                + '<tr>'
                + '<td align="right" style="width:17%">短期措施：</td>'
                + '<td colspan="3"><input name="measure" type="text" id="measure" required="required" class="form-control" value=""></td>'
                + '<td align="right">'
                + '<a href="javascript:;" class="addInputReturn3">'
                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                + '</a>'
                + '</td>'
                + '</tr>'
                + '<tr>'
                + '<td align="right">责任人：</td>'
                // + '<td><select  name="thirdDutyPerson" type="text" id="thirdDutyPerson" required="required" class="form-control" value=""></select></td>'
                + '<td><input name="thirdDutyPerson" type="text" id="thirdDutyPerson" required="required" class="form-control" value=""></td>'
                + '<td align="right">执行日期：</td>'
                + '<td><input readonly name="thirdExecuteDate" type="text" id="thirdExecuteDate" required="required" class="layui-input" value=""></td>'
                + '<td align="right">&nbsp;</td>'
                + '</tr>'
                + '</table>';
            $("#step3").append(html);
            // getDutyPerson('thirdDutyPerson');

        })

        //加载step4
        $(function () {
            var html = "";
            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                + '<input type="hidden" value="" name="id">'
                + '<tr>'
                + '<td align="right" style="width:17%">潜在原因：</td>'
                + '<td colspan="3"><input name="reason" type="text" id="reason" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
                + '<td align="right">'
                + '<a href="javascript:;" class="addInputReturn4">'
                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                + '</a>'
                + '</td>'
                + '</tr>'
                + '<tr>'
                + '<td align="right">验证方法：</td>'
                + '<td><input name="method" type="text" id="method" required="required" class="form-control" value=""></td>'
                + '<td align="right">责任人：</td>'
                // + '<td><select name="fourthDutyPerson" type="text" id="fourthDutyPerson" required="required" class="form-control" value=""></select></td>'
                + '<td><input name="fourthDutyPerson" type="text" id="fourthDutyPerson" required="required" class="form-control" value=""></td>'
                + '<td align="right">&nbsp;</td>'
                + '</tr>'
                + '<tr>'
                + '<td align="right">目标日期：</td>'
                + '<td><input readonly name="fourthDate" type="text" id="fourthDate" required="required" class="layui-input" value="" pattern="yyyy-MM-dd"></td>'
                + '<td align="right">结论 Y/N：</td>'
                + '<td><select name="conclusion" type="text" id="conclusion" required="required" class="form-control" value="">'
                + '<option value="">请选择</option>'
                + '<option value="YES">YES</option>'
                + '<option value="NO">NO</option>'
                + '</select>'
                + '</td>'
                + '<td align="right">&nbsp;</td>'
                + '</tr>'
                + '</table>';
            $("#step4").append(html);
            // getDutyPerson('fourthDutyPerson');
        })

        //加载step5
        $(function () {
            var html = "";
            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                + '<input type="hidden" value="" name="id">'
                + '<tr>'
                + '<td align="right" style="width:17%">解决潜在原因方案：</td>'
                + '<td colspan="3"><input name="scheme" type="text" id="scheme" required="required" class="form-control" value=""></td>'
                + '<td align="right">'
                + '<a href="javascript:;" class="addInputReturn5">'
                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                + '</a>'
                + '</td>'
                + '</tr>'
                + '<tr>'
                + '<td align="right">验证结果：</td>'
                + '<td><input name="schemeResult" type="text" id="schemeResult" required="required" class="form-control" value=""></td>'
                + '<td align="right">目标日期：</td>'
                + '<td><input readonly name="fifthDate" type="text" id="fifthDate" required="required" class="layui-input" value="" pattern="yyyy-MM-dd"></td>'
                + '<td align="right">&nbsp;</td>'
                + '</tr>'
                + '<tr>'
                + '<td align="right">关键行动：</td>'
                + '<td><input name="action" type="text" id="action" required="required" class="form-control" value=""></td>'
                + '<td align="right">&nbsp;</td>'
                + '<td>&nbsp;</td>'
                + '<td align="right">&nbsp;</td>'
                + '</tr>'
                + '</table>';
            $("#step5").append(html);
        })

        //加载step6
        $(function () {
            var html = "";
            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                + '<input type="hidden" value="" name="id">'
                + '<tr>'
                + '<td align="right" style="width:17%">永久解决方案：</td>'
                + '<td colspan="3"><input name="lastScheme" type="text" id="lastScheme" required="required" class="form-control" value=""></td>'
                + '<td align="right">'
                + '<a href="javascript:;" class="addInputReturn6">'
                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                + '</a>'
                + '</td>'
                + '</tr>'
                + '<tr>'
                + '<td align="right">责任人：</td>'
                // + '<td><select name="sixthDutyPerson" type="text" id="sixthDutyPerson" required="required" class="form-control" value=""></select></td>'
                + '<td><input name="sixthDutyPerson" type="text" id="sixthDutyPerson" required="required" class="form-control" value=""></td>'
                + '<td align="right">目标日期：</td>'
                + '<td><input readonly name="sixthDate" type="text" id="sixthDate" required="required" class="layui-input" value="" pattern="yyyy-MM-dd"></td>'
                + '<td align="right">&nbsp;</td>'
                + '</tr>'
                + '<tr>'
                + '<td align="right">执行日期：</td>'
                + '<td><input readonly name="sixthExecuteDate" type="text" id="sixthExecuteDate" required="required" class="layui-input" value="" pattern="yyyy-MM-dd"></td>'
                + '<td align="right">&nbsp;</td>'
                + '<td>&nbsp;</td>'
                + '<td align="right">&nbsp;</td>'
                + '</tr>'
                + '</table>';
            $("#step6").append(html);
            // getDutyPerson('sixthDutyPerson');
        })
    }


    //setp6添加附件
    /*$(function () {
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">添加附件：</td>'
            + '<td colspan="3"><i class="fa fa fa-file-text" style="font-size:30px;vertical-align:middle;"></i>&nbsp;'
            + '<button type="button" class="btn btn-default btn-sm" onclick=$("#AAABBB").click();>上传附件</button><span id="setp6fileName"></span>'
            + '<input type="file" name="AAABBB" id="AAABBB" style="display: none;" onchange=step6File()>'
            + '<input type="hidden" name="" id="step6file" style="display: none;">'
            + '<td align="right">'
            // + '<a href="javascript:;" class="addStep6addfile">'
            // + '<span class="glyphicon glyphicon-plus"></span> 添加'
            // + '</a>'
            + '</td>'
            + '</tr>'
            + '</table>';
        $("#step6addfile").append(html);
    })*/


    /*$.validator.addMethod("quantity", function(value, element) {
        return !this.optional(element) && !this.optional($(element).parent().prev().children("select")[0]);
    }, "请选择项目和数量。");*/

    var step3_sq = 0 ;
    $("body").on('click', '.addInputReturn3', function () {
        //step3添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<input type="hidden" value="" name="id">'
            + '<tr>'
            + '<td align="right" style="width:17%">短期措施：</td>'
            + '<td colspan="3"><input name="measure" type="text" id="measure'+step3_sq+'"  required="required" class="form-control quantity" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput3">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">责任人：</td>'
            // + '<td><select  name="thirdDutyPerson" type="text" id="thirdDutyPerson" required="required" class="form-control" value=""></select></td>'
            + '<td><input name="thirdDutyPerson" type="text" id="thirdDutyPerson'+step3_sq+'" required="required" class="form-control quantity" value=""></td>'
            + '<td align="right">执行日期：</td>'
            + '<td><input name="thirdExecuteDate" type="text" id="thirdExecuteDate'+step3_sq+'" required="required" class="layui-input quantity" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';

        var template = jQuery.validator.format($.trim(html));
        $("#step3").append(template);
        step3_sq++;
        // getDutyPerson('thirdDutyPerson');

        layui.use('laydate', function() {
            var laydate = layui.laydate;

            for(var i=0; i<step3_sq; i++) {
                laydate.render({
                    elem: '#thirdExecuteDate' + i/*,
                    format: 'yyyy年MM月dd日'*/
                });
            }
        });
    })

    var step4_sq = 0 ;
    $("body").on('click', '.addInputReturn4', function () {
        //step4添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<input type="hidden" value="" name="id">'
            + '<tr>'
            + '<td align="right" style="width:17%">潜在原因：</td>'
            + '<td colspan="3"><input name="reason" type="text" id="reason'+step4_sq+'" required="required" class="form-control quantity" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput4">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">验证方法：</td>'
            + '<td><input name="method" type="text" id="method'+step4_sq+'" required="required" class="form-control quantity" value=""></td>'
            + '<td align="right">责任人：</td>'
            // + '<td><select name="fourthDutyPerson" type="text" id="fourthDutyPerson" required="required" class="form-control" value=""></select></td>'
            + '<td><input name="fourthDutyPerson" type="text" id="fourthDutyPerson'+step4_sq+'" required="required" class="form-control quantity" value=""></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="fourthDate" type="text" id="fourthDate'+step4_sq+'" required="required" class="layui-input quantity" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">结论 Y/N：</td>'
            + '<td><select name="conclusion" type="" id="conclusion'+step4_sq+'" class="form-control" value="" required>'
            + '<option value="">请选择</option>'
            + '<option value="YES">YES</option>'
            + '<option value="NO">NO</option>'
            + '</select>'
            + '</td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        // $("#step4").append(html);
        var template = jQuery.validator.format($.trim(html));
        $("#step4").append(template);
        step4_sq++;
        // getDutyPerson('fourthDutyPerson');

        layui.use('laydate', function() {
            var laydate = layui.laydate;

            for(var i=0; i<step4_sq; i++) {
                laydate.render({
                    elem: '#fourthDate' + i
                });
            }
        });
    })

    var step5_sq=0;
    $("body").on('click', '.addInputReturn5', function () {
        //step5添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<input type="hidden" value="" name="id">'
            + '<tr>'
            + '<td align="right" style="width:17%">解决潜在原因方案：</td>'
            + '<td colspan="3"><input name="scheme" type="text" id="scheme'+step5_sq+'" required="required" class="form-control quantity" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput5">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">验证结果：</td>'
            + '<td><input name="schemeResult" type="text" id="schemeResult'+step5_sq+'" required="required" class="form-control quantity" value=""></td>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="fifthDate" type="text" id="fifthDate'+step5_sq+'" required="required" class="layui-input quantity" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">关键行动：</td>'
            + '<td><input name="action" type="text" id="action'+step5_sq+'" required="required" class="form-control quantity" value=""></td>'
            + '<td align="right">&nbsp;</td>'
            + '<td>&nbsp;</td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        // $("#step5").append(html);
        var template = jQuery.validator.format($.trim(html));
        $("#step5").append(template);
        step5_sq++;

        layui.use('laydate', function() {
            var laydate = layui.laydate;

            for(var i=0; i<step5_sq; i++) {
                laydate.render({
                    elem: '#fifthDate' + i
                });
            }
        });
    })

    var step6_sq=0;
    $("body").on('click', '.addInputReturn6', function () {
        //step6添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<input type="hidden" value="" name="id">'
            + '<tr>'
            + '<td align="right" style="width:17%">永久解决方案：</td>'
            + '<td colspan="3"><input name="lastScheme" type="text" id="lastScheme'+step6_sq+'" required="required" class="form-control quantity" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput6">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">责任人：</td>'
            // + '<td><select name="sixthDutyPerson" type="text" id="sixthDutyPerson" required="required" class="form-control" value=""></select></td>'
            + '<td><input name="sixthDutyPerson" type="text" id="sixthDutyPerson'+step6_sq+'" required="required" class="form-control quantity" value=""></td>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="sixthDate" type="text" id="sixthDate'+step6_sq+'" required="required" class="layui-input quantity" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">执行日期：</td>'
            + '<td><input name="sixthExecuteDate" type="text" id="sixthExecuteDate'+step6_sq+'" required="required" class="layui-input quantity" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '<td>&nbsp;</td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        // $("#step6").append(html);
        // getDutyPerson('sixthDutyPerson');
        var template = jQuery.validator.format($.trim(html));
        $("#step6").append(template);
        step6_sq++;

        layui.use('laydate', function() {
            var laydate = layui.laydate;

            for(var i=0; i<step6_sq; i++) {
                laydate.render({
                    elem: '#sixthDate' + i
                });
                laydate.render({
                    elem: '#sixthExecuteDate' + i
                });
            }
        });
    })


    $("body").on('click', '.addStep6addfile', function () {
        //step6addfile添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">添加附件：</td>'
            + '<td colspan="3"><i class="fa fa fa-file-text" style="font-size:30px;vertical-align:middle;"></i>&nbsp;'
            + '<button type="button" class="btn btn-default btn-sm" onclick=$("#AAABBB").click();>上传附件</button>'
            + '<input type="file" name="AAABBB" id="AAABBB" style="display: none;" onchange=step6File()>'
            + '<input type="hidden" name="" id="step6file" style="display: none;">'
            + '<td align="right">'
            + '<a href="javascript:;" class="delStep6addfile">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '</table>';
        $("#step6addfile").append(html);
    })

    /**
     * 删除事件
     */
    $("body").on('click', '.delInput3', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().parent().remove();
    })
    $("body").on('click', '.delInput4', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().parent().remove();
    })
    $("body").on('click', '.delInput5', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().parent().remove();
    })
    $("body").on('click', '.delInput6', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().parent().remove();
    })
    $("body").on('click', '.delStep6addfile', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().parent().remove();
    })



    //step2附件上传
    function setp2File(){
        var formData = new FormData();
        formData.append("file",$('#YYZZFBSMJ')[0].files[0]);
        console.log($('#YYZZFBSMJ')[0].files[0])
        $("#setp2fileName").text($('#YYZZFBSMJ')[0].files[0].name);
        $.ajax({
            type: 'post',
            // //url: "http://test.cncnews.cn/wup/webUploader",
            url: "${webPath}/uploadFile/uploader",
            data: formData,
            dataType: "json",
            cache: false,
            processData: false,
            contentType: false,
        }).success(function (data) {
            console.log(data.imgPath);
            $("#setp2file").val(data.imgPath);
        }).error(function () {
            return layer.msg('上传失败');
        });
    }

    //step6附件上传
    function step6File(){
        var formData = new FormData();
        formData.append("file",$("#AAABBB")[0].files[0]);
        console.log($("#AAABBB")[0].files[0])
        $("#setp6fileName").text($("#AAABBB")[0].files[0].name);
        $.ajax({
            type: 'post',
            // //url: "http://test.cncnews.cn/wup/webUploader",
            url: "${webPath}/uploadFile/uploader",
            data: formData,
            dataType: "json",
            cache: false,
            processData: false,
            contentType: false,
        }).success(function (data) {
            console.log(data.imgPath);
            $("#step6file").val(data.imgPath);
        }).error(function () {
            return layer.msg('上传失败');
        });
    }

    //step7附件上传
    function step7File(){
        var formData = new FormData();
        formData.append("file",$("#SSTTEEPP7")[0].files[0]);
        console.log($("#SSTTEEPP7")[0].files[0])
        $("#setp7fileName").text($("#SSTTEEPP7")[0].files[0].name);
        $.ajax({
            type: 'post',
            // //url: "http://test.cncnews.cn/wup/webUploader",
            url: "${webPath}/uploadFile/uploader",
            data: formData,
            dataType: "json",
            cache: false,
            processData: false,
            contentType: false,
        }).success(function (data) {
            console.log(data.imgPath);
            $("#setp7file").val(data.imgPath);
        }).error(function () {
            return layer.msg('上传失败');
        });
    }

    //选择责任人
    function getDutyPerson(name) {
        //前置库下拉框
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
                                id : o.account+'<'+o.name+'>',         //取出items中Code赋值给id
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
    };

    $(function () {
        _showPic();
    })

    /* 渲染图片 */
    function _showPic() {
        var _self = this;
        imgId = _self.imgId;
        var result = $("#attach").val();
        var img = result.split(",");
        var html = '';
        $wap = $('#preview');
        if (result == "") {
            $wap.append(html);
        } else {
            for (var i = 0; i < img.length; i++) {
                html = '<li data-toggle="modal" data-target=".this-pic" onclick=showImg("'+img[i]+'"); class="fl pic" id="imgItem_' + imgId + '">' +
                    '<img src="${uploadUrl}' + img[i] + '" alt="">' +
                    '<input id="imgUrl" type="hidden" value=' + img[i] + ' class="imgUrl"/>' +
                    // '<i class="del-img"></i>' +
                    '</li>';
                $wap.append(html);
            }
        }
    }
    /** 展示图片 **/
    function showImg(byteImg) {
        $("#showImg").html('<img style="width: 100%;height: 100%;" src="${uploadUrl}'+byteImg+'" />');
    }
</script>
</body>
</html>