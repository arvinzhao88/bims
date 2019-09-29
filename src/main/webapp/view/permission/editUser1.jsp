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
    <title>${sysName}111</title>
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

                <div class="title_left"><h3>用户管理</h3></div>
                <div class="title_right">
                    <%--<div class="col-md-6 col-sm-5 col-xs-12 form-group pull-right top_search">
                      <div class="input-group" style=" margin-bottom:-15px;">
                        <input name="text" type="text" class="form-control" placeholder="查询">
                        <span class="input-group-btn">
                      <button class="btn btn-default" type="button"><i class="fa fa-search"></i></button></span>
                    </div></div>--%>
                </div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>用户修改</h2>
                            <div class="clearfix"></div>
                        </div>
                        <form id="form1" class="form-horizontal form-label-left">
                            <input type="hidden" name="id" value="${bimsPerson.id}">
                            <div class="x_content">
                                <%--<div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">用户头像</label>
                                    <div class="col-md-6 col-sm-6 col-xs-12" style="text-align: center">
                                        <input type="file" id="userLogo" name="userLogo" required="required"
                                               class="" value=""/>
                                        <img id="userUrl" style="width:100px"
                                             src="http://test.cncnews.cn/wup${bimsPerson.logo}"/>
                                        <input type="hidden" name="logo" id="logo" value="${bimsPerson.logo}">
                                    </div>
                                </div>--%>

                                <table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>工号</strong></td>
                                        <td width="80%">
                                            <select id="account" class="required form-control col-md-7 col-xs-12"
                                                    name="account">
                                                <c:if test="${not empty bimsPerson.account}">
                                                    <option value="${bimsPerson.account}">${bimsPerson.account}</option>
                                                </c:if>
                                            </select>
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>用户名</strong></td>
                                        <td width="80%">
                                            <input id="name" class="required form-control col-md-7 col-xs-12" type="text" readonly="readonly"
                                                   name="name" value="${bimsPerson.name}">
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>登录名</strong></td>
                                        <td width="80%">
                                            <input id="loginName" class="required form-control col-md-7 col-xs-12" readonly="readonly"
                                                   type="text" name="loginName" value="${bimsPerson.loginName}">
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>手机号</strong></td>
                                        <td width="80%">
                                            <input id="mobile" class="required form-control col-md-7 col-xs-12" type="text" readonly="readonly"
                                                   name="mobile" value="${bimsPerson.mobile}">
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>邮箱</strong></td>
                                        <td width="80%">
                                            <input id="email" class="required form-control col-md-7 col-xs-12" type="text" readonly="readonly"
                                                   name="email" value="${bimsPerson.email}">
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="font-size: 20px; text-align: left;">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>角色</strong></td>
                                        <td width="80%">
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongRole,1)}">checked="checked"</c:if> class="flat" name="belongRole" value="1">线边工人&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongRole,2)}">checked="checked"</c:if> class="flat" name="belongRole" value="2">质量工程师&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongRole,3)}">checked="checked"</c:if> class="flat" name="belongRole" value="3">责任人&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongRole,4)}">checked="checked"</c:if> class="flat" name="belongRole" value="4">EQRleader&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongRole,5)}">checked="checked"</c:if> class="flat" name="belongRole" value="5">质量经理&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongRole,6)}">checked="checked"</c:if> class="flat" name="belongRole" value="6">处理人&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongRole,7)}">checked="checked"</c:if> class="flat" name="belongRole" value="7">质检&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongRole,8)}">checked="checked"</c:if> class="flat" name="belongRole" value="8">用户管理&nbsp;&nbsp;&nbsp;&nbsp;

                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="font-size: 20px; text-align: left;">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right;"><strong>对应区域</strong></td>
                                        <td width="80%">
                                            <span style="width:60px;"><a><em>APU：</em></a></span>
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'8X')}">checked="checked"</c:if> class="flat" name="belongArea"  value="8X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'8F')}">checked="checked"</c:if> class="flat" name="belongArea"  value="8F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>T&nbsp;&nbsp;&nbsp区：</em></a></span>
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'1X')}">checked="checked"</c:if> class="flat" name="belongArea"  value="1X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'1F')}">checked="checked"</c:if> class="flat" name="belongArea"  value="1F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>机加：</em></a></span>
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'2X')}">checked="checked"</c:if> class="flat" name="belongArea"  value="2X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'2F')}">checked="checked"</c:if> class="flat" name="belongArea"  value="2F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>JOB1：</em></a></span>
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'3X')}">checked="checked"</c:if> class="flat" name="belongArea"  value="3X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'3F')}">checked="checked"</c:if> class="flat" name="belongArea"  value="3F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="font-size: 20px; text-align: left;">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong></strong></td>
                                        <td width="80%">
                                            <span style="width:60px;"><a><em>B&nbsp;I&nbsp;S&nbsp;：</em></a></span>
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'4X')}">checked="checked"</c:if> class="flat" name="belongArea"  value="4X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'4F')}">checked="checked"</c:if> class="flat" name="belongArea"  value="4F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>E&nbsp;QA：</em></a></span>
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'5X')}">checked="checked"</c:if> class="flat" name="belongArea"  value="5X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'5F')}">checked="checked"</c:if> class="flat" name="belongArea"  value="5F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>SQA：</em></a></span>
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'6X')}">checked="checked"</c:if> class="flat" name="belongArea"  value="6X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'6F')}">checked="checked"</c:if> class="flat" name="belongArea"  value="6F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>售&nbsp;&nbsp;后：</em></a></span>
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'7X')}">checked="checked"</c:if> class="flat" name="belongArea"  value="7X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" <c:if test="${fn:contains(bimsPerson.belongArea,'7F')}">checked="checked"</c:if> class="flat" name="belongArea"  value="7F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        </td>
                                    </tr>
                                </table>
                                <div class="form-group">
                                    <div style="text-align:center">
                                        &nbsp; &nbsp; &nbsp;
                                        <button class="btn btn-primary" type="button" data-toggle="modal" onclick="saveUser()">提交
                                        </button>
                                        &nbsp; &nbsp; &nbsp;
                                    </div>
                                </div>
                            </div>
                        </form>


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


<%@include file="/view/static/common/core_js.jsp" %>
<%--<link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>--%>
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
    $("#menuUserParent").addClass("active");
    /**父菜单*/
    $("#menuUserChild").css('display','block');
    //$("#menuIssusParent").show();
    /**子菜单*/
    $("#adduser").addClass("current-page");

</script>
<script type="text/javascript">

    /** 图片上传并且回显 **/
    var fil = $("#userLogo");
    fil.bind('change', function () {
        var fordate = new FormData();  //得到一个FormData对象：
        var fils = $("#userLogo").get(0).files[0];  //得到file对象
        fordate.append('file', fils);  //用append方法添加键值对
        var srcc = window.URL.createObjectURL(fils);     //传入的参数创建一个指向该参数对象的URL
        console.log(srcc);
        $("#userUrl").attr({'src': srcc, 'width': 500 + 'px', 'heigth': 500 + 'px'});
        $.ajax({  //发送ajax请求
            //url: "http://test.cncnews.cn/wup/webUploader?myPath=bims",
            type: "post",
            data: fordate,
            processData: false,
            contentType: false,
            success: function (html) {
                var json = eval("(" + html + ")");
                console.log(json.imgPath);
                $("#logo").val(json.imgPath);
            }
        });

    });


    function saveUser() {


        var account = $("#account").val();
        if (account == "") {
            layer.msg("请填写工号");
            return false;
        }
        var name = $("#name").val();
        if (name == "") {
            layer.msg("请填写用户名");
            return false;
        }
        var loginName = $("#loginName").val();
        if (loginName == "") {
            layer.msg("请填写登录名");
            return false;
        }
        /*var belongRoles = document.getElementsByName("belongRole");
        var flag = false;//标记判断是否选中一个
        for (var i = 0; i < belongRoles.length; i++) {
            if (belongRoles[i].checked) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            layer.msg("请选择角色类型！");
            return false;
        }
        var belongAreas = document.getElementsByName("belongArea");
        var flag = false;//标记判断是否选中一个
        for (var i = 0; i < belongAreas.length; i++) {
            if (belongAreas[i].checked) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            layer.msg("请选择所属地区！");
            return false;
        }*/
        console.log($('#form1').serialize());
        $.ajax({
            url: "${webPath}/permission/updateUserById",
            type: "post",
            data: $('#form1').serialize(),
            success: function (data) {
                if (data.success) {
                    window.location.href = "${webPath}/permission/jumpQueryUserList";
                } else {
                    layer.msg(data.msg);
                }

            }
        });
    }


    $(function () {
        getDutyPerson("account");
        // echoAccountSelect2();
    })

    function getDutyPerson(name) {
        //前置库下拉框
        $(function () {
            $("select[name=" + name + "]").select2({
                placeholder: "-- 输入工号 --",
                language: "zh-CN",
                minimumInputLength: 1,
                allowClear: true,
                width: '100%',
                escapeMarkup: function (markup) {
                    return markup;
                }, // 让template的html显示效果，否则输出代码
                ajax: {
                    url: "${webPath}/back/person/queryByAccount",
                    dataType: 'json',
                    data: function (params) {
                        return {
                            account: params.term, // search term
                        };
                    },
                    processResults: function (data) {
                        var options = new Array();
                        $(data).each(function (i, o) {
                            options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                                id: o.account,         //取出items中Code赋值给id
                                text: o.account + '<' + o.name + '>',
                            });
                        });
                        return {
                            results: options        //返回数据
                        };
                    },
                    cache: true
                }
            });
        })
    };


    //回显数据
    function echoAccountSelect2(){
        var dom = $("#account");
        var account = '${bimsPerson.account}';
        $.ajax({
            url: "${webPath}/back/person/queryByAccount",
            type: "get",
            dataType: "json",
            data: {},
            success: function (ajaxJson) {
                var value = ajaxJson;
                $.each(value, function (index) {
                    if (value[index].account == account) {
                        $(dom).append(new Option(account, value[index].account, false, true));
                    }
                });
                $(dom).trigger("change");
            }
        })
    }

    //获取服务站
    $("#account").change(function () {
        var account = $("#account").val();
        if (account != null || account != "") {
            $.ajax({
                url: "${webPath}/back/person/queryByAccountOnly/" + account,
                type: "POST",
                dataType: 'json',
                success: function (data) {
                    $.each(data, function (i, item) {
                        console.log(item);
                        $("#name").val(item.name);
                        $("#loginName").val(item.account);
                        $("#mobile").val(item.mobile);
                        $("#email").val(item.email);
                    });
                }
            });
        }

    });

</script>


</body>
</html>
