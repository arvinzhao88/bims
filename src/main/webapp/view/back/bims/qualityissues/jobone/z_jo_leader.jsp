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
                <div class="title_left"><h3>JOB1 问题处理</h3></div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>问题描述</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a></li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <%@include file="/view/back/bims/qualityissues/common/issuedesc.jsp" %>
                    </div>

                    <div class="x_panel" style="width:75%;float:left; margin-right:10px;">

                        <div id="reviewAndDeal">
                        <div class="x_title">
                            <h2>处理工具</h2>
                            <%--<span style="float:right; font-size:14px; margin-top:10px;">状态：<font
                                style="color:#00CC00; font-weight:bold;">处理中</font></span>--%>
                            <div class="clearfix"></div>
                        </div>
                        <!--卡片工具开始-->
                        <div class="x_content">
                            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                                <input type="hidden" value="${jobReview.id}" name="id">
                                <input type="hidden" value="${jobReview.issueId}" name="issueId">
                                <input type="hidden" value="${jobReview.handlerPersonAccount}" name="handlerPersonAccount">
                                <div class="form-group">


                                    <!--7 STEP分段附件结束-->

                                    <table width="100%" class="table table-hover table-bordered" id="datatable1">
                                        <tr>
                                            <td colspan="3">
                                                <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                        class="fa fa-file-text"></i> 处理
                                                </div>
                                                <%--<div style="color:#5A738E; float:right;">责任人：材料采购部 胡平</div>--%>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <i class="fa fa-file-image-o"
                                                   style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;
                                                <c:if test="${not empty jobReview.attment}">
                                                    <a href="${uploadUrl}${jobReview.attment}" download target="_blank">查看附件</a>
                                                </c:if>
                                            </td>
                                            <td>
                                                <i class="fa fa-file-text"
                                                   style="font-size:30px;padding:10px;vertical-align:middle;"></i>&nbsp;
                                                <c:if test="${not empty jobReview.measureAttment}">
                                                    <a href="${uploadUrl}${jobReview.measureAttment}" download target="_blank">查看措施附件</a>
                                                </c:if>
                                                <%--<input type="text" id="measureText" name="measureText" required readonly
                                                       style="width:100%; height:35px; padding:5px;"
                                                       value="${jobReview.measureText}">--%>
                                            </td>
                                            <td width="40%">
                                                <textarea id="measureText" name="measureText"  cols="200" rows="2" readonly
                                                          class="form-control" required placeholder="输入措施">${jobReview.measureText}
                                                </textarea>
                                            </td>
                                        </tr>
                                    </table>
                                    <table width="100%" class="table table-hover table-bordered" id="datatable1">
                                        <tr>
                                            <td colspan="7">
                                                <div style="font-size:16px; color:#5A738E; float:left;"><i
                                                        class="fa fa-file-text"></i> 审核
                                                </div>
                                                <%--&nbsp;&nbsp;<font color="#FF0000" style="font-size:12px;">评审结论如果选择OK则按钮为“处理完成”，选NOK时按钮显示“驳回”。</font>--%>
                                                <%--<div style="color:#5A738E; float:right;">质量工程师：质量部 王丙</div>--%>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="12%">评审人员：

                                            </td>
                                            <td width="22%"><select name="reviewers" id="reviewers" multiple="multiple"
                                                                    style="width:100%; height:35px;padding:2px;" required>
                                            </select></td>
                                            <td width="12%">评审日期：</td>
                                            <td width="21%"><input readonly type="text" id="reviewDate"
                                                                   name="reviewDate"
                                                                   required="required"
                                                                   class="form-control"></td>
                                            <td width="12%">评审结论：</td>
                                            <td width="21%"><select name="conclusion" id="conclusion"
                                                                    style="width:100%; height:35px;padding:2px;" onchange="showBtn()">
                                                <option value="0">请选择</option>
                                                <option value="1">OK</option>
                                                <option value="2">NOK</option>
                                                <%--<option>NOK（有条件上线，后续再验证一台）</option>--%>
                                            </select></td>
                                        </tr>
                                    </table>
                                    <!--按钮-->
                                    <div class="ln_solid"></div>
                                    <div class="form-group">
                                        <div id="btn1" style="text-align:center; display: none">
                                            <button class="btn btn-danger" type="button" data-toggle="modal" onclick="checkNull()">驳回
                                            </button>
                                        </div>
                                        <div id="btn2" style="text-align:center; display: none">
                                            <textarea id="reason" name="reason" cols="200" rows="3"
                                                      class="form-control" placeholder="问题关闭原因" required></textarea>
                                            <br>
                                            <button class="btn btn-primary" type="button" data-toggle="modal" onclick="checkNull()">处理完成
                                            </button>
                                        </div>
                                    </div>
                                    <!--按钮完成-->

                                </div>
                            </form>
                        </div>
                        </div>
                        <!--卡片工具完成-->
                        <div class="x_title">
                            <h2>评审记录</h2>
                            <div class="clearfix"></div>
                        </div>

                        <div class="x_content">

                            <table class="table table-bordered">
                                <thead>
                                <tr>
                                    <th style="width: 5%">序号</th>
                                    <th style="width: 10%">责任部门</th>
                                    <th style="width: 10%">责任人</th>
                                    <th style="width: 10%">措施</th>
                                    <th style="width: 10%">评审结论</th>
                                    <th style="width: 15%">日期</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${jobReviewList}" var="jobReviewList" varStatus="status">
                                    <c:if test="${not empty jobReviewList.conclusion}">
                                        <tr>
                                            <th scope="row">${status.count-1}</th>
                                            <td>${jobReviewList.handlerDeptName}</td>
                                            <td>${jobReviewList.handlerPersonName}</td>
                                            <td>${jobReviewList.measureText}</td>
                                            <td><c:if test="${jobReviewList.conclusion == '1'}">OK</c:if>
                                            <c:if test="${jobReviewList.conclusion == '2'}">NOK</c:if></td>
                                            <td><fmt:formatDate value="${jobReviewList.reviewDate}" pattern="yyyy-MM-dd"/> </td>
                                        </tr>
                                    </c:if>
                                </c:forEach>
                                </tbody>
                            </table>

                        </div>
                    </div>


                    <!--处理记录开始-->
                    <div class="x_panel" style="width:calc(25% - 10px); float:left;">
                        <div class="x_title">
                            <h2>处理记录</h2>
                            <div class="clearfix"></div>
                        </div>
                        <div id="dealLog" class="x_content">
                        </div>
                        <!--处理记录结束-->


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
                        onClick="javascrtpt:window.location.href='z_a_ts1.jsp'">确定
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
                        onClick="javascrtpt:window.location.href='z_a_ts1.jsp'">确定
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
    $("#menuJobOne").addClass("current-page");

</script>
<script>
    $(document).ready(
        function reviewAndDeal() {
            var status  = '${issue.processStatus}';
            if (status == "3") {
                $("#reviewAndDeal").show();
            }else {
                $("#reviewAndDeal").hide();
            }

        });

    $(function () {
        getDealLog();
    })
    //获取处理记录
    function getDealLog(){
        $.ajax({
            url: "${webPath}/dealLog/getLog",
            type: "get",
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
                            + '<div style="width:51%; float:right">' + logList[i].processPerson + '<'+logList[i].processPersonAccount+'>'+ ' ' + logList[i].actionName + '</div>'
                            + '</div>';
                    }
                }
                $("#dealLog").append(html);
            }
        })
    }

    //根据评审结论显示不同按钮
    function showBtn() {
        var val =  $("#conclusion option:selected").val();
        switch (val) {
            case '1':
                $('#btn1').hide();
                $('#btn2').show();
                break;
            case '2':
                $('#btn1').show();
                $('#btn2').hide();
                break;

            default:
                $('#btn1').hide();
                $('#btn2').hide();
                break;
        }
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
                                text : o.account+'<'+o.name+'>',
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

    //带出评审人元
    $(function echoReviewPeresonSelect2(){
        var dom = $("#reviewers");
        var reviewers = '${issueExtend.reviewers}';
        var arr =  reviewers.split(",");
        for (var i = 0; i < arr.length; i++) {
            var acc = arr[i];
            $.ajax({
                url: "${webPath}/back/person/queryByAccount",
                type: "get",
                dataType: "json",
                data: {
                    account: acc,
                },
                success: function (ajaxJson) {
                    var value = ajaxJson;
                    $.each(value, function (index) {
                        var res= value[index];
                        var name= res.name;
                        var account=res.account;
                        for (var i = 0; i < arr.length; i++) {
                            var acc = arr[i];
                            if (account == acc) {
                                $(dom).append(new Option(name, acc, false, true));
                            }
                        }
                        $(dom).trigger("change");
                    });
                }
            });
        }

    })

    //默认当前日期
    $(document).ready(function () {
        layui.use('laydate', function() {
            var laydate = layui.laydate;

            //常规用法
            laydate.render({
                elem: '#reviewDate',
            });
        });

        var time = new Date();
        var day = ("0" + time.getDate()).slice(-2);
        var month = ("0" + (time.getMonth() + 1)).slice(-2);
        var today = time.getFullYear() + "-" + (month) + "-" + (day);
        $('#reviewDate').val(today);
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
        $("#reviewDate").attr("min",year+"-"+month+"-"+date);
    })

    //提交时验证
    function checkNull(){
        if($("#demo-form2").valid()){
            var params = $("#demo-form2").serialize();
            var isok = $('#conclusion option:selected') .val();
            if (isok=="1"){
                layer.confirm('确定完成并关闭问题吗？', {icon: 3, title: '系统提示',offset: "50%"}, function (index) {
                    $.ajax({
                        type: "post",
                        url: "${webPath}/bims/job/job1Close",
                        data: params,
                        dataType: "json",
                        success: function (data) {
                            console.log(data)
                            if (data.success) {
                                console.log(data)
                                layer.msg("操作成功");
                                setTimeout(window.location.href = '${webPath}/back/toJobOne', 1000);
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
            if (isok=="2"){
                layer.confirm('确定驳回吗？', {icon: 3, title: '系统提示',offset: "50%"}, function (index) {
                    $.ajax({
                        type: "post",
                        url: "${webPath}/bims/job/job1Reject",
                        data: params,
                        dataType: "json",
                        success: function (data) {
                            console.log(data)
                            if (data.success) {
                                console.log(data)
                                layer.msg("操作成功");
                                setTimeout(window.location.href = '${webPath}/back/toJobOne', 1000);
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

        }
        return;
    };
</script>
</body>
</html>
