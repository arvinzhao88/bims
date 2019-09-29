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

<body style="background: white">
<%--<div class="right_col" role="main">--%>
    <%--<div class="page-title">
        <div class="title_left"><h3>A区 问题处理</h3></div>
    </div>

    <div class="clearfix"></div>--%>

    <%--<div class="row">--%>
        <%--<div class="col-md-12 col-sm-12 col-xs-12">--%>
            <div class="x_panel" style="width:100%;float:left; margin-right:10px;">
                <!--卡片工具开始-->
                <div class="x_content">
                    <div class="form-group">
                        <div class="" role="tabpanel" data-example-id="togglable-tabs">
                            <!--Car表单工具开始-->
                            <div id="myTabContent2" class="tab-content">
                                <!--Notification开始-->
                                <div role="tabpanel" class="tab-pane fade active in" id="tab_content4"
                                     aria-labelledby="profile-tab">
                                    <table width="100%" class="table table-hover table-bordered"
                                           id="notification" style="font-size:12px;">
                                        <tr>
                                            <td colspan="4">
                                                <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                        class="fa fa-file-text"></i> Notification
                                                </div>
                                                <%--<div style="color:#5A738E; float:right;">责任人：&lt;%&ndash;售后质量工程师 胡平&ndash;%&gt;
                                                </div>--%>

                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <textarea name="message" rows="4" class="form-control"
                                                          id="message" required="required"
                                                          data-parsley-trigger="keyup"
                                                          data-parsley-minlength="20"
                                                          data-parsley-maxlength="100"
                                                          placeholder="请输入通知内容" <c:if test="${notification.status == '1'}">disabled</c:if>
                                                >${notification.notificationInfo}</textarea>
                                            </td>
                                        </tr>
                                    </table>
                                    <%--<h2>邮件接收人</h2>
                                    <c:if test="${notification.status == '1'}">
                                        <input type="text" disabled value="${notification.person.name}" />
                                    </c:if>--%>
                                    <c:if test="${notification.status != '1'}">
                                        <select id="sendEmail" name="email" class="form-control" required
                                                multiple="multiple">
                                        </select>
                                    </c:if>
                                    <!--按钮-->
                                    <div class="ln_solid"></div>
                                    <div class="form-group">
                                        <div class="form-group" style="text-align:center">

                                            <%--<button class="btn btn-primary" type="button" data-toggle="modal"
                                                    data-target=".this-close">问题关闭
                                            </button>--%>
                                            <button class="btn btn-primary" type="button" data-toggle="modal"<c:if test="${notification.status == '1'}">disabled</c:if>
                                                    onclick="send()">发送邮件
                                            </button>
                                        </div>
                                    </div>
                                    <!--按钮完成-->
                                    <!--Notification结束-->
                                </div>
                            </div>
                            <!--Notification直接附件结束-->

                        </div>
                    </div>
                    <%--</form>--%>
                </div>
                <!--卡片工具完成-->
            </div>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
<!-- 内容区结束 -->
<div class="modal fade this-close" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="">确定</h4>
            </div>
            <div class="modal-body">
                <p>确定关闭问题吗?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onclick="closeIssue()">确定
                </button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade this-send" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="">确定</h4>
            </div>
            <div class="modal-body">
                <p>确定发送邮件吗?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal"
                        onclick="send()">确定
                </button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->

<%@include file="/view/static/common/core_js.jsp" %>
<script type="text/javascript">
    /**左侧菜单操作**/

    /**共用部分 start**/
    $(".side-menu li").each(function (index) {
        $(this).removeClass("active");
    });
    $(".child_menu li").each(function (index) {
        $(this).removeClass("current-page");
    });
    $(".child_menu").css('display', 'none');
    /**共用部分 end**/

    /**父菜单*/
    $("#menuIssusParent").addClass("active");
    /**父菜单*/
    $("#menuIssusChild").css('display', 'block');
    //$("#menuIssusParent").show();
    /**子菜单*/
    $("#menuA").addClass("current-page");

</script>
<script>
    //发送邮件
    function send() {
        layer.confirm('确定发送邮件吗？', {icon: 3, title: '系统提示'}, function (index) {
            //do something
            var msg = $("#message").val();
            if (msg == null || msg == '') {
                layer.msg('请填写发送内容！');
                return;
            }
            var emails = $("#sendEmail").val();
            if (emails == null || emails == '') {
                layer.msg('请选择邮件接收人！');
                return;
            }
            var str = emails.toString();
            var toolId = '${toolId}';
            var issueId = '${issueId}';
            $.ajax({
                url: '${webPath}/sendEmail/send',
                type: "POST",
                dataType: "json",
                data: {
                    id: toolId,
                    notificationInfo: msg,
                    back1: str,
                },
                success: function (res) {
                    $(":button").attr("disabled", true);
                    $(":input").attr("disabled", true);
                    layer.msg("邮件已发送");
                }
            })
            layer.close(index);
        });


    }

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
</script>
</body>
</html>
