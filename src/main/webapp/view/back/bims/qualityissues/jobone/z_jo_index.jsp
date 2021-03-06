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
        var account = '${person.account}';
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
                <div class="title_right">
                    <div class="col-md-6 col-sm-5 col-xs-12 form-group pull-right top_search">
                        <div class="input-group">
                            <input id="content" name="content" type="text" class="form-control" placeholder="输入零件号,供应商代码,ESN,机型,SO,描述查询">
                            <span class="input-group-btn">
				  <button id="minSearch" class="btn btn-default" type="button"><i
                          class="fa fa-search"></i></button></span>
                        </div>
                    </div>
                </div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>问题列表</h2>
                            <%--<ul class="nav navbar-right panel_toolbox">
                              <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                              <li><a class="close-link"><i class="fa fa-close"></i></a></li>
                            </ul>--%>
                            <!--工具条-->
                            <%--<form>--%>
                            <table width="100%" border="0" cellspacing="0" cellpadding="0"
                                   style="border-collapse:separate;border-spacing:15px;">
                                <tbody>
                                <tr>

                                    <td width="3%" align="right">
                                        <p></p>
                                        <p>工厂：</p>
                                    </td>
                                    <td width="10%">
                                        <select id="plant" name="plant" class="form-control">
                                            <option value="">- 请选择 -</option>
                                        </select>
                                    </td>
                                    <td width="3%" align="right">
                                        <p></p>
                                        <p>评审结论：</p>
                                    </td>
                                    <td width="10%">
                                        <select id="isClaim" name="isClaim" class="form-control">
                                            <option value="">- 请选择 -</option>
                                            <option value="1">OK</option>
                                            <option value="2">NOK</option>
                                        </select>
                                    </td>
                                    <td width="3%" align="right">

                                        <p></p>
                                        <p>问题状态：</p>
                                    </td>
                                    <td width="10%">
                                        <select id="processStatus" name="processStatus" class="form-control">
                                            <option value="">- 请选择 -</option>
                                            <option value="1">待处理</option>
                                            <option value="2,3,4,5,6,8">处理中</option>
                                            <option value="7">关闭</option>
                                        </select>
                                    </td>
                                </tr>

                                <!-- 第二个tr dt -->
                                <tr>
                                    <td width="3%" align="right">
                                        <p></p>
                                        <p>处理人：</p>
                                    </td>
                                    <td width="10%">
                                        <input id="processPersonName" placeholder="请输入处理人" type="text"
                                               class="form-control">
                                    </td>
                                    <td width="3%" align="right">

                                        <p></p>
                                        <p>时间段：</p>
                                    </td>
                                    <td width="10%" id="datetimepicker1" class="date-picker input-daterange"
                                        data-date-format="yyyy-mm-dd">
                                        <input id="startDate" name="startDate" type="text" class="form-control" value=""
                                               placeholder="开始日期" style="float:left;width:48%;">
                                        <input id="endDate" name="endDate" type="text" class="form-control" value=""
                                               placeholder="结束日期" style="float:left;width:48%;margin-left:4%;">
                                    </td>
                                    <td width="3%" align="right">
                                        <p></p>
                                        <p>问题编码：</p>
                                    </td>
                                    <td width="10%">
                                        <input id="number" placeholder="请输入问题编码" type="text" class="form-control">
                                    </td>
                                </tr>
                                <tr>
                                    <td width="3%" align="right">
                                        <p></p>
                                        <p>是否批量：</p>
                                    </td>
                                    <td width="10%">
                                        <select id="issueCategoryL1Name" name="issueCategoryL1Name" class="form-control">
                                            <option value="">- 请选择 -</option>
                                            <option value="1">是</option>
                                            <option value="2">否</option>
                                        </select>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                            <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3" style="margin-left: 8.4%;">
                                <button type="button" id="query" class="btn btn-primary">查询</button>
                                <input id="reset" type="reset" value="重置" onclick="" class="btn btn-default">
                            </div>

                            <c:if test="${fn:contains(person.belongRole, '2') or fn:contains(person.belongRole, '7')}">
                                <button type="button" class="btn btn-primary"
                                        style="margin-bottom:-4px; float: right; margin-right: 1%"
                                        onclick="location.href='${webPath}/back/jobOneAdd'">新建
                                </button>
                            </c:if>
                            <button type="button" class="btn btn-success"
                                    style="margin-bottom:-4px; float: right; margin-right: 0.5%"
                                    onClick="excel()"> 导出
                            </button>
                            <div class="clearfix">

                            </div>
                        </div>

                            <div class="x_content">
                                <table width="100%" class="table table-bordered table-hover" id="example"
                                       style="margin-bottom: 0px;border-bottom: 0px;">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>工厂</th>
                                        <th>问题编号</th>
                                        <th>问题描述</th>
                                        <th>录入人</th>
                                        <th>录入时间</th>
                                        <th>责任人工号</th>
                                        <th>责任人</th>
                                        <th>评审结论</th>
                                        <th>关闭时间</th>
                                        <th>是否批量</th>
                                        <th>问题状态</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    </tbody>
                                </table>
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
<div class="modal fade this-true" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">删除</h4>
            </div>
            <div class="modal-body">
                <p>确定删除该条问题吗?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal">确定</button>
            </div>
        </div>
    </div>
</div>


<div class="modal fade this-time" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:350px;padding-top:200px;">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
                <h4 class="modal-title" id="myModalLabel">处理状态</h4>
            </div>


            <%--<div style="padding:20px;">
            <div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
            <div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
            <div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
            <div style="width:51%; float:right">录入人 提交问题</div>
            </div>
            <div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
            <div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
            <div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
            <div style="width:51%; float:right">工程师 修正更新问题</div>
            </div>
            <div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
            <div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
            <div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
            <div style="width:51%; float:right">工程师 选择EQR</div>
            </div>
            <div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">
            <div style="width:41%; float:left; text-align:right">2018-09-12 12:11</div>
            <div style="width:8%; float:left; text-align:center"><img src="images/time.png"></div>
            <div style="width:51%; float:right">Leader 选择责任人</div>
            </div>
            </div>--%>


            <div class="modal-footer">
                <button type="button" class="btn btn-primary antoclose2" data-dismiss="modal">确定</button>
            </div>
        </div>
    </div>
</div>
<!-- 遮蔽内容结束 -->

<%@include file="/view/static/common/core_js.jsp" %>
<script type="text/javascript">
    $(document).ready(
        function () {
            dataTablesInit(jobone);
        });
</script>
<script type="text/javascript" src="${resPath}/view/back/bims/js/qualityissues/jobone/jobone.js"></script>
<script>
    $(function () {
        var pid = 0;
        getSelectlist("#plant", "xf", pid);
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
                    $(subject).html(html);
                } else {
                    $(subject).html("<option selected value='0'>请选择</option>");
                }
            }
        })
    }

    /**
     * 导出excel
     */
    function excel() {
        var qType = "J";
        location.href = '${webPath}/excel/jobExport?qualityType=' + qType
    }
</script>
</body>
</html>
