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

    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel">
                <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                    <input type="hidden" name="id" value="${pqcTool.id}">
                    <input type="hidden" name="issueId" value="${issueId}">
                    <div class="form-group">
                        <table width="100%" class="table table-hover table-bordered"
                               id="" style="font-size:12px;">
                            <tr>
                                <td colspan="4">
                                    <div style="font-size:16px; color:#5A738E; float:left;"><i
                                            class="fa fa-file-text"></i> PQC
                                    </div>
                                    <%--<div style="color:#5A738E; float:right;">责任人：材料采购部 胡平</div>--%>
                                </td>
                            </tr>
                            <tr>
                                <c:if test="${pqcTool.status eq '1'}">
                                    <td colspan="4"><i class="fa fa fa-file-text"
                                                       style="font-size:30px;vertical-align:middle;"></i>&nbsp;
                                        <button style="right: auto" id="yyzz" type="button" class="btn btn-default btn-sm" onclick="$('#attach').click();">
                                            上传附件
                                        </button><span id="setp2fileName"></span>
                                        <input type="file" multiple name="" id="attach" style="display: none;" onchange="setp2File()">
                                        <input type="hidden" name="attach" id="setp2file" style="display: none;" value="">
                                    </td>
                                </c:if>
                                <c:if test="${pqcTool.status eq '2' && not empty pqcTool.attach}">
                                    <td colspan="4">
                                        附件下载：<i class="fa fa-file-text" style="font-size:40px; padding:10px;vertical-align:middle;"></i>&nbsp;
                                        <a href="${uploadUrl}${pqcTool.attach}" download target="_blank">查阅</a></td>
                                </c:if>
                                <%--<td colspan="1">
                                    <i class="fa fa-edit"
                                       style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;<button
                                        type="button" class="btn btn-default btn-sm">处理审核
                                </button>
                                </td>--%>
                            </tr>
                            <tr>
                                <td width="20%">Target Date 目标日期</td>
                                <td width="30%"><i class="fa fa-history"></i><fmt:formatDate value="${pqcTool.targetDate}" pattern="yyyy-MM-dd"/></td>
                                <td width="20%">Complete Date 完成日期</td>
                                <c:if test="${pqcTool.status eq '2'}"><td width="30%"><fmt:formatDate value="${pqcTool.completeDate}" pattern="yyyy-MM-dd"/></td></c:if>
                                <c:if test="${pqcTool.status eq '1'}"><td width="30%">处理中</td></c:if>
                            </tr>
                        </table>
                        <div class="form-group">
                            <div style="text-align:center;">
                                <c:if test="${pqcTool.status eq '1'}"><button class="btn btn-success" type="button" onclick="savePqc()">处理完成</button></c:if>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<!-- 遮蔽内容开始 -->
<div class="modal fade this-pic" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:860px;padding-top:20px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">照片预览</h4>
            </div>
            <div class="modal-body"
                 style="width:800px; height:500px; margin:30px;background-color:#EFEFEF; text-align:center;">这里是照片
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade this-go" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">确认</h4>
            </div>
            <div class="modal-body">
                <p>点击后将无法返回，确定进行下一步处理吗？</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal">确定</button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->
<%@include file="/view/static/common/core_js.jsp" %>
</body>
<script>
    function setp2File(){
        var formData = new FormData();
        formData.append("file",$('#attach')[0].files[0]);
        console.log($('#attach')[0].files[0])
        $("#setp2fileName").text($('#attach')[0].files[0].name);
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

    function savePqc() {
        var params = $("#demo-form2").serialize();
        $.ajax({
            url: '${webPath}/bims/aftersale/savePqc',
            type: "POST",
            dataType: "json",
            data: params,
            success: function (res) {
                layer.msg("操作成功");
                window.location.reload();
            },
            error: function (res) {
                layer.msg("操作失败");
            }
        })
    }
</script>
</html>
