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
    <%--<link rel="stylesheet" type="text/css" href="/view/static/layer/skin/layer.css"/>--%>
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
                        <!--卡片工具开始-->
                        <div class="x_content">
                            <%--<form id="demo-form1" data-parsley-validate class="form-horizontal form-label-left">--%>
                            <div class="form-group">
                                <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                    <!--Car表单工具开始-->
                                    <div id="myTabContent2" class="tab-content">
                                        <div role="tabpanel" class="tab-pane fade active in" id="tab_content11"
                                             aria-labelledby="home-tab">
                                            <!--Car开始-->
                                            <form id="demo-form2" data-parsley-validate
                                                  class="form-horizontal form-label-left">
                                                <input type="hidden" value="${car.id}" name="id">
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
                                                        <td><select disabled name="carType" class="form-control">
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
                                                            <input disabled type="radio" class="flat" name="happenArea"
                                                                   id="ISF Plant"
                                                                   value="1"
                                                                   <c:if test="${car.happenArea eq '1' }">checked</c:if>/>&nbsp;ISF
                                                            Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input disabled type="radio" class="flat" name="happenArea"
                                                                   id="X Plant"
                                                                   value="2"
                                                                   <c:if test="${car.happenArea eq '2' }">checked</c:if>/>&nbsp;X
                                                            Plant&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input disabled type="radio" class="flat" name="happenArea"
                                                                   id="OEM"
                                                                   value="3"
                                                                   <c:if test="${car.happenArea eq '3' }">checked</c:if>/>&nbsp;OEM&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input disabled type="radio" class="flat" name="happenArea"
                                                                   id="IPTV"
                                                                   value="4"
                                                                   <c:if test="${car.happenArea eq '4' }">checked</c:if>/>&nbsp;IPTV&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input disabled type="radio" class="flat" name="happenArea"
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
                                                        <td><i class="fa fa-file-picture-o"
                                                               style="font-size:30px;vertical-align:middle;"></i>&nbsp;<button
                                                                type="button" class="btn btn-default btn-sm">上传图片
                                                        </button>
                                                        </td>
                                                        <td align="right">潜在影响范围/数量：</td>
                                                        <td><input readonly type="text" id="amount" name="amount"
                                                                   required="required"
                                                                   class="form-control" value="${car.amount}"></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="right">邮件通知：</td>
                                                        <td><input readonly type="text" id="notice" name="notice"
                                                                   required="required"
                                                                   class="form-control" value=""></td>
                                                        <td align="right">目标关闭日期：</td>
                                                        <td><input readonly type="date" id="aimCloseDate"
                                                                   name="aimCloseDate"
                                                                   required="required"
                                                                   class="form-control"
                                                                   value="<fmt:formatDate value="${car.aimCloseDate}" pattern="yyyy-MM-dd"/>">
                                                        </td>
                                                    </tr>
                                                </table>

                                                <div class="ln_solid"></div>
                                                <div class="x_title">
                                                    <h2>Step2识别和排列必然因素：</h2>
                                                    <div class="clearfix"></div>
                                                </div>

                                                <div class="form-group">
                                                    <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                                           style="border-collapse:separate;border-spacing:15px;">
                                                        <tr>
                                                            <td align="right" style="width:17%">必然因素：</td>
                                                            <td><input type="text" id="stepTwo" name="stepTwo"
                                                                       required="required" class="form-control"
                                                                       value="${car.stepTwo}"></td>
                                                            <td width="8%" align="right">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">附件上传：</td>
                                                            <td><i class="fa fa fa-file-text"
                                                                   style="font-size:30px;vertical-align:middle;"></i>&nbsp;
                                                                <button id="yyzz" type="button" class="btn btn-default btn-sm" onclick="$('#YYZZFBSMJ').click();">
                                                                上传附件
                                                                </button><p id="fileName"></p>
                                                                <input type="file" name="YYZZFBSMJ" id="YYZZFBSMJ" style="display: none;" onchange="fileType()">
                                                                <input type="hidden" name="" id="setp2file" style="display: none;">
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
                                                        <tr>
                                                            <td align="right" style="width:17%">断点：</td>
                                                            <td><input type="text" id="breakpoint" name="breakpoint"
                                                                       required="required" class="form-control"
                                                                       value="${car.breakpoint}"></td>
                                                            <td width="8%" align="right">&nbsp;</td>
                                                        </tr>
                                                    </table>
                                                </div>

                                                <div class="ln_solid"></div>
                                                <div class="x_title">
                                                    <h2>Step4 确定必然因素</h2>
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

                                                </div>
                                                <div class="form-group">
                                                    <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                                           style="border-collapse:separate;border-spacing:15px;">
                                                        <tr>
                                                            <td width="20%" align="right" style="width:17%">改进过程：
                                                            </td>
                                                            <td colspan="5">
                                                                <input type="radio" class="flat" name="improve"
                                                                       id="ER" value="ER" checked="" required/>&nbsp;ER&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                <input type="radio" class="flat" name="improve"
                                                                       id="MCR" value="MCR"/>&nbsp;MCR&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                <input type="radio" class="flat" name="improve"
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
                                                            <td><input name="rac" type="text" id="rac"
                                                                       required="required" class="form-control"
                                                                       value="${car.rac}"></td>
                                                            <td align="right">7步法报告上传：</td>
                                                            <td><i class="fa fa fa-file-text"
                                                                   style="font-size:30px;vertical-align:middle;"></i>&nbsp;<button
                                                                    type="button" class="btn btn-default btn-sm">
                                                                上传附件
                                                            </button>
                                                            </td>
                                                            <td align="right">&nbsp;</td>
                                                        </tr>

                                                    </table>
                                                </div>
                                            </form>

                                            <div class="ln_solid"></div>
                                            <div class="form-group">
                                                <div style="text-align:center">
                                                    <button class="btn" type="button"
                                                            onClick="javascrtpt:window.location.href='z_a_eqr.html'">
                                                        取消
                                                    </button>
                                                    <button class="btn btn-primary" type="button" data-toggle="modal"
                                                            data-target=".this-go">保存
                                                    </button>
                                                </div>
                                            </div>
                                            <!--Car结束-->
                                        </div>
                                        <!--Car表单工具结束-->
                                    </div>
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
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onclick="submit(${car.id},${issue.id})">确定
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
    $(function () {
        $('input:radio:first').attr('checked', 'checked');
    })


    //提交
    function submit(carId, issueId) {
        var stepTwo = $("#stepTwo").val();
        var breakpoint = $("#breakpoint").val();
        var improve = $("#improve").val();
        var updateFile = $("#updateFile").val();
        var rac = $("#rac").val();
        var arr = new Array();

        let step3 = $('#step3').find("table");
        for (let i = 0; i < step3.length; i++) {
            let measure = step3.eq(i).find('input[name="measure"]').val();
            let thirdDutyPerson = step3.eq(i).find('input[name="thirdDutyPerson"]').val();
            let thirdExecuteDate = step3.eq(i).find('input[name="thirdExecuteDate"]').val();
            arr.push({
                carStep: "3",
                measure: "" + measure + "",
                thirdDutyPerson: "" + thirdDutyPerson + "",
                thirdExecuteDate: "" + thirdExecuteDate + ""
            })
        }
        ;

        let step4 = $('#step4').find("table");
        for (let i = 0; i < step4.length; i++) {
            let reason = step4.eq(i).find('input[name="reason"]').val();
            let method = step4.eq(i).find('input[name="method"]').val();
            let fourthDutyPerson = step4.eq(i).find('input[name="fourthDutyPerson"]').val();
            let fourthDate = step4.eq(i).find('input[name="fourthDate"]').val();
            let conclusion = step4.eq(i).find('input[name="conclusion"]').val();
            arr.push({
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
            let scheme = step5.eq(i).find('input[name="scheme"]').val();
            let schemeResult = step5.eq(i).find('input[name="schemeResult"]').val();
            let fifthDate = step5.eq(i).find('input[name="fifthDate"]').val();
            let action = step5.eq(i).find('input[name="action"]').val();
            arr.push({
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
            let lastScheme = step6.eq(i).find('input[name="lastScheme"]').val();
            let sixthDutyPerson = step6.eq(i).find('input[name="sixthDutyPerson"]').val();
            let sixthDate = step6.eq(i).find('input[name="sixthDate"]').val();
            let sixthExecuteDate = step6.eq(i).find('input[name="sixthExecuteDate"]').val();
            let sixthAttach = step6.eq(i).find('input[name="sixthAttach"]').val();
            let sixthAttachName = step6.eq(i).find('input[name="sixthAttachName"]').val();
            let sixthAttachDesc = step6.eq(i).find('input[name="sixthAttachDesc"]').val();
            arr.push({
                carStep: "6",
                lastScheme: "" + lastScheme + "",
                sixthDutyPerson: "" + sixthDutyPerson + "",
                sixthDate: "" + sixthDate + "",
                sixthExecuteDate: "" + sixthExecuteDate + "",
                sixthAttach: "" + sixthAttach + "",
                sixthAttachName: "" + sixthAttachName + "",
                sixthAttachDesc: "" + sixthAttachDesc + ""
            })
        }
        ;

        var params = {
            "id": "" + carId + "",
            "stepTwo": "" + stepTwo + "",
            "breakpoint": "" + breakpoint + "",
            "improve": "" + improve + "",
            "updateFile": "" + updateFile + "",
            "rac": "" + rac + "",
            "ext": arr
        };
        console.log(JSON.stringify(params))
        $.ajax({
            url: '${webPath}/car/updStep',
            type: "POST",
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(params),
            success: function (res) {
                window.location.href = '${webPath}/bims/apucheck/toCarStep27detail?carId=' + carId + '&issueId=' + issueId;
            }
        })
    }

    //加载step3
    $(function () {
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
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
            + '<td><input name="thirdDutyPerson" type="text" id="thirdDutyPerson" required="required" class="form-control" value=""></td>'
            + '<td align="right">执行日期：</td>'
            + '<td><input name="thirdExecuteDate" type="date" id="thirdExecuteDate" required="required" class="form-control" value=""></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step3").append(html);
    })

    //加载step4
    $(function () {
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
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
            + '<td><input name="fourthDutyPerson" type="text" id="fourthDutyPerson" required="required" class="form-control" value=""></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="fourthDate" type="date" id="fourthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">结论 Y/N：</td>'
            + '<td><input name="conclusion" type="text" id="conclusion" required="required" class="form-control" value=""></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step4").append(html);
    })

    //加载step5
    $(function () {
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
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
            + '<td><input name="fifthDate" type="date" id="fifthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
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
            + '<td><input name="sixthDutyPerson" type="text" id="sixthDutyPerson" required="required" class="form-control" value=""></td>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="sixthDate" type="date" id="sixthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">执行日期：</td>'
            + '<td><input name="sixthExecuteDate" type="date" id="sixthExecuteDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '<td>&nbsp;</td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step6").append(html);
    })

    //setp6添加附件
    $(function () {
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">添加附件：</td>'
            + '<td colspan="3"><i class="fa fa fa-file-text" style="font-size:30px;vertical-align:middle;"></i>&nbsp;<butto type="button" class="btn btn-default btn-sm">上传附件</button>'
            + '<td align="right">'
            + '<a href="javascript:;" class="addStep6addfile">'
            + '<span class="glyphicon glyphicon-plus"></span> 添加'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '</table>';
        $("#step6addfile").append(html);
    })


    $("body").on('click', '.addInputReturn3', function () {
        //step3添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">短期措施：</td>'
            + '<td colspan="3"><input name="measure" type="text" id="measure" required="required" class="form-control" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput3">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">责任人：</td>'
            + '<td><input name="thirdDutyPerson" type="text" id="thirdDutyPerson" required="required" class="form-control" value=""></td>'
            + '<td align="right">执行日期：</td>'
            + '<td><input name="thirdExecuteDate" type="date" id="thirdExecuteDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step3").append(html);
    })

    $("body").on('click', '.addInputReturn4', function () {
        //step4添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">潜在原因：</td>'
            + '<td colspan="3"><input name="reason" type="text" id="reason" required="required" class="form-control" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput4">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">验证方法：</td>'
            + '<td><input name="method" type="text" id="method" required="required" class="form-control" value=""></td>'
            + '<td align="right">责任人：</td>'
            + '<td><input name="fourthDutyPerson" type="text" id="fourthDutyPerson" required="required" class="form-control" value=""></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="fourthDate" type="date" id="fourthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">结论 Y/N：</td>'
            + '<td><input name="conclusion" type="text" id="conclusion" required="required" class="form-control" value=""></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step4").append(html);
    })

    $("body").on('click', '.addInputReturn5', function () {
        //step5添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">解决潜在原因方案：</td>'
            + '<td colspan="3"><input name="scheme" type="text" id="scheme" required="required" class="form-control" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput5">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">验证结果：</td>'
            + '<td><input name="schemeResult" type="text" id="schemeResult" required="required" class="form-control" value=""></td>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="fifthDate" type="date" id="fifthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
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

    $("body").on('click', '.addInputReturn6', function () {
        //step6添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">永久解决方案：</td>'
            + '<td colspan="3"><input name="lastScheme" type="text" id="lastScheme" required="required" class="form-control" value=""></td>'
            + '<td align="right">'
            + '<a href="javascript:;" class="delInput6">'
            + '<span class="glyphicon glyphicon-minus"></span> 删除'
            + '</a>'
            + '</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">责任人：</td>'
            + '<td><input name="sixthDutyPerson" type="text" id="sixthDutyPerson" required="required" class="form-control" value=""></td>'
            + '<td align="right">目标日期：</td>'
            + '<td><input name="sixthDate" type="date" id="sixthDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '<tr>'
            + '<td align="right">执行日期：</td>'
            + '<td><input name="sixthExecuteDate" type="date" id="sixthExecuteDate" required="required" class="form-control" value="" pattern="yyyy-MM-dd"></td>'
            + '<td align="right">&nbsp;</td>'
            + '<td>&nbsp;</td>'
            + '<td align="right">&nbsp;</td>'
            + '</tr>'
            + '</table>';
        $("#step6").append(html);
    })

    $("body").on('click', '.addStep6addfile', function () {
        //step6addfile添加减号
        var html = "";
        html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
            + '<tr>'
            + '<td align="right" style="width:17%">添加附件：</td>'
            + '<td colspan="3"><i class="fa fa fa-file-text" style="font-size:30px;vertical-align:middle;"></i>&nbsp;<butto type="button" class="btn btn-default btn-sm">上传附件</button>'
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
        $(this).parent().parent().parent().remove();
    })
    $("body").on('click', '.delInput4', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().remove();
    })
    $("body").on('click', '.delInput5', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().remove();
    })
    $("body").on('click', '.delInput6', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().remove();
    })
    $("body").on('click', '.delStep6addfile', function () {
        //获取当前点击的元素的父级的父级进行删除
        $(this).parent().parent().parent().remove();
    })
/*
    $(function getCarExtList() {
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
                        if (res.obj[i].carStep =="3"){
                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">短期措施：</td>'
                                + '<td colspan="3"><input name="measure" type="text" id="measure" required="required" class="form-control" value="'+res.obj[i].measure+'"></td>'
                                + '<td align="right">'
                                + '<a href="javascript:;" class="addInputReturn3">'
                                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                + '</a>'
                                + '</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">责任人：</td>'
                                + '<td><input name="thirdDutyPerson" type="text" id="thirdDutyPerson" required="required" class="form-control" value="'+res.obj[i].thirdDutyPerson+'"></td>'
                                + '<td align="right">执行日期：</td>'
                                + '<td><input name="thirdExecuteDate" type="date" id="thirdExecuteDate" required="required" class="form-control" value="'+res.obj[i].thirdExecuteDate+'"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '</table>';
                            $("#step3").append(html);
                        }
                        if (res.obj[i].carStep=="4"){
                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">潜在原因：</td>'
                                + '<td colspan="3"><input name="reason" type="text" id="reason" required="required" class="form-control" value="'+res.obj[i].reason+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">'
                                + '<a href="javascript:;" class="addInputReturn4">'
                                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                + '</a>'
                                + '</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">验证方法：</td>'
                                + '<td><input name="method" type="text" id="method" required="required" class="form-control" value="'+res.obj[i].method+'"></td>'
                                + '<td align="right">责任人：</td>'
                                + '<td><input name="fourthDutyPerson" type="text" id="fourthDutyPerson" required="required" class="form-control" value="'+res.obj[i].fourthDutyPerson+'"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">目标日期：</td>'
                                + '<td><input name="fourthDate" type="date" id="fourthDate" required="required" class="form-control" value="'+res.obj[i].fourthDate+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">结论 Y/N：</td>'
                                + '<td><input name="conclusion" type="text" id="conclusion" required="required" class="form-control" value="'+res.obj[i].conclusion+'"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '</table>';
                            $("#step4").append(html);
                        }
                        if (res.obj[i].carStep=="5"){
                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">解决潜在原因方案：</td>'
                                + '<td colspan="3"><input name="scheme" type="text" id="scheme" required="required" class="form-control" value="'+res.obj[i].scheme+'"></td>'
                                + '<td align="right">'
                                + '<a href="javascript:;" class="addInputReturn5">'
                                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                + '</a>'
                                + '</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">验证结果：</td>'
                                + '<td><input name="schemeResult" type="text" id="schemeResult" required="required" class="form-control" value="'+res.obj[i].schemeResult+'"></td>'
                                + '<td align="right">目标日期：</td>'
                                + '<td><input name="fifthDate" type="date" id="fifthDate" required="required" class="form-control" value="'+res.obj[i].fifthDate+'" pattern="yyyy-MM-dd"></td>'
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
                        }
                        if (res.obj[i].carStep=="6"){
                            var html = "";
                            html += '<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">'
                                + '<tr>'
                                + '<td align="right" style="width:17%">永久解决方案：</td>'
                                + '<td colspan="3"><input name="lastScheme" type="text" id="lastScheme" required="required" class="form-control" value="'+res.obj[i].lastScheme+'"></td>'
                                + '<td align="right">'
                                + '<a href="javascript:;" class="addInputReturn6">'
                                + '<span class="glyphicon glyphicon-plus"></span> 添加'
                                + '</a>'
                                + '</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">责任人：</td>'
                                + '<td><input name="sixthDutyPerson" type="text" id="sixthDutyPerson" required="required" class="form-control" value="'+res.obj[i].sixthDutyPerson+'"></td>'
                                + '<td align="right">目标日期：</td>'
                                + '<td><input name="sixthDate" type="date" id="sixthDate" required="required" class="form-control" value="'+res.obj[i].sixthDate+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '<tr>'
                                + '<td align="right">执行日期：</td>'
                                + '<td><input name="sixthExecuteDate" type="date" id="sixthExecuteDate" required="required" class="form-control" value="'+res.obj[i].sixthExecuteDate+'" pattern="yyyy-MM-dd"></td>'
                                + '<td align="right">&nbsp;</td>'
                                + '<td>&nbsp;</td>'
                                + '<td align="right">&nbsp;</td>'
                                + '</tr>'
                                + '</table>';
                            $("#step6").append(html);
                        }
                    }

                }
            }
        });
    })*/

    //附件上传
    function fileType(file){
        var formData = new FormData();
        formData.append("file",$('#YYZZFBSMJ')[0].files[0]);
        console.log($('#YYZZFBSMJ')[0].files[0])
        $("#fileName").text($('#YYZZFBSMJ')[0].files[0].name);
        $.ajax({
            type: 'post',
            //url: "http://test.cncnews.cn/wup/webUploader",
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

</script>
</body>
</html>
