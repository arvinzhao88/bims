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
            <fieldset>
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
                    <td colspan="3"><input type="text" id="stepOne"
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
                            <%--<li class="fl">--%>
                                <%--<img src="${resPath}/view/static/images/icon_upload.png">
                                <input id="fileImage" type="file" name="file" multiple/>
                                <div class="num">0/6</div>--%>
                            <%--</li>--%>
                        </ul>
                    </td>
                    <td align="right">潜在影响范围/数量：</td>
                    <td><input type="text" id="amount" name="amount"
                               required="required" placeholder="请输入数字"
                               class="form-control" value="${car.amount}"></td>
                </tr>
                <tr>
                    <td align="right">邮件通知：</td>
                    <td><input type="text" id="notice" name="notice"
                               required="required"
                               class="form-control" value="${car.emailReceive}"></td>
                    <td align="right">目标关闭日期：</td>
                    <td><input type="date" id="aimCloseDate" name="aimCloseDate"
                               required="required" value="<fmt:formatDate value="${car.aimCloseDate}" pattern="yyyy-MM-dd"/>"
                               class="form-control" pattern="yyyy-MM-dd HH:mm:ss"></td>
                </tr>
            </table>
                <input type="hidden" id="attach" name="attach" value="${car.picture}">
            </fieldset>
            <%@include file="/view/static/common/img.jsp" %>
        </form>
        <div class="ln_solid"></div>
        <div class="form-group">
            <div style="text-align:center">
                <%--<button class="btn" type="button"
                        onClick="javascrtpt:window.location.href='${webPath}/back/toApu'">
                    取消
                </button>--%>
                <%--<button class="btn btn-primary" type="button" data-toggle="modal"
                        data-target=".this-go">保存
                </button>--%>
                <%--<button class="btn btn-success" type="button" data-toggle="modal"
                        data-target=".this-go">提交
                </button>--%>
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
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onclick="submit(${car.id},${car.issueId})">确定</button>
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
    $(function () {
        _showPic();
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

    //提交
    function submit(carId,issueId) {
        var params = $("#demo-form2").serialize();
        $.ajax({
            url: '${webPath}/car/addStep1',
            type: "POST",
            dataType: "json",
            data: params,
            success: function(res) {
                $("input[type='radio']").attr('disabled', 'disabled');
                $("input[type='checkbox']").attr('disabled', 'disabled');
                $("input,textarea").each(function () {
                    $(this).attr('readonly', 'readonly');
                });
                $("select").attr('disabled', 'disabled');
                //window.location.href='${webPath}/bims/apucheck/toCarStep27?carId='+carId+'&issueId='+issueId;
            }
        })

    }
    //页面数据加载完成时判断
    function loadd() {
        var status = '${toolPerson.status}';
        // if(status == "0") {
            $(":input").attr("disabled","disabled");
            $(":checkbox").attr("disabled","disabled");
            $(":selected").attr("disabled","disabled");
            $(":button").attr("disabled","disabled");
        // }
    }

    setInterval('loadd();', 200);
</script>
</body>
</html>
