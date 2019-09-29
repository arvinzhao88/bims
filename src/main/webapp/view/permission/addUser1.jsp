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
                            <h2>用户添加</h2>
                            <div class="clearfix"></div>
                        </div>
                            <div class="x_content">
                                <form id="form1" class="form-horizontal form-label-left">

                                <table width="100%" border="0" cellpadding="0" cellspacing="0" style="border-collapse:separate;border-spacing:15px;">
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>工号</strong></td>
                                        <td width="80%">
                                            <select id="account" class="required form-control col-md-7 col-xs-12"
                                                    name="account">
                                            </select>
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>用户名</strong></td>
                                        <td width="80%">
                                            <input id="name" class="required form-control col-md-7 col-xs-12" type="text" readonly="readonly"
                                                   name="name" value="">
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>登录名</strong></td>
                                        <td width="80%">
                                            <input id="loginName" class="required form-control col-md-7 col-xs-12" readonly="readonly"
                                                   type="text" name="loginName" value="">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>手机号</strong></td>
                                        <td width="80%">
                                            <input id="mobile" class="required form-control col-md-7 col-xs-12" type="text" readonly="readonly"
                                                   name="mobile" value="">
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>邮箱</strong></td>
                                        <td width="80%">
                                            <input id="email" class="required form-control col-md-7 col-xs-12" type="text" readonly="readonly"
                                                   name="email" value="">
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong>角色</strong></td>
                                        <td width="80%">
                                            <c:forEach items="${bimsRole}" var="list">
                                                <input type="checkbox" class="flat" id="belongRole" name="belongRole"
                                                       value="${list.id}">${list.roleName}&nbsp;&nbsp;&nbsp;&nbsp;
                                            </c:forEach>
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right;"><strong>对应区域</strong></td>
                                        <td width="80%">
                                            <span style="width:60px;"><a><em>APU：</em></a></span>
                                            <input type="checkbox" class="flat" name="belongArea"  value="8X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" class="flat" name="belongArea"  value="8F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>T&nbsp;&nbsp;&nbsp区：</em></a></span><input type="checkbox" class="flat" name="belongArea"  value="1X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" class="flat" name="belongArea"  value="1F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>机加：</em></a></span><input type="checkbox" class="flat" name="belongArea"  value="2X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" class="flat" name="belongArea"  value="2F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>JOB1：</em></a></span><input type="checkbox" class="flat" name="belongArea"  value="3X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" class="flat" name="belongArea"  value="3F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td width="20%" align="right" style="text-align: right"><strong></strong></td>
                                        <td width="80%">
                                            <span style="width:60px;"><a><em>B&nbsp;I&nbsp;S&nbsp;：</em></a></span><input type="checkbox" class="flat" name="belongArea"  value="4X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" class="flat" name="belongArea"  value="4F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>E&nbsp;QA：</em></a></span><input type="checkbox" class="flat" name="belongArea"  value="5X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" class="flat" name="belongArea"  value="5F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>SQA：</em></a></span><input type="checkbox" class="flat" name="belongArea"  value="6X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" class="flat" name="belongArea"  value="6F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                            <span style="width:60px;"><a><em>售&nbsp;&nbsp;后：</em></a></span><input type="checkbox" class="flat" name="belongArea"  value="7X"/>&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="checkbox" class="flat" name="belongArea"  value="7F"/>&nbsp;F&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        </td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                </table>
                                    <div class="form-group">
                                        <div style="text-align:center">
                                            <button class="btn btn-primary" type="button" data-toggle="modal"
                                                    data-target=".this-save" onclick="saveUser()">提交
                                            </button>
                                            <%--<a  class="btn btn-default" type="button" href="${webPath}/upload/人员角色清单.xlsx">
                                                <i class="fa fa-arrow-down"></i> 下载导入模板
                                            </a>
                                                <input type="file" id="upfile" name="upfile" class="form-control"
                                                       placeholder="" onchange="importExp();" style="display: none;">
                                                <button id="import" onclick="importInfo()" class="btn btn-dark"
                                                        type="button">
                                                    <i class="fa fa-arrow-up"></i> 导入模板
                                                </button>--%>
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

    /* 提交 */
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
            url: "${webPath}/permission/addUser",
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


    $(function () {
        getDutyPerson("account");
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


    function importExp() {
        var importFile = $("#upfile").val();
        var reg = ".xlsx$";
        var patrn = new RegExp(reg);
        if (patrn.exec(importFile)) {
            //不做任何事
        } else {
            layer.msg("请导入.xlsx形式的Excel!");
            return false;
        }
        var result = "";
        var index = layer.load(1, {time: 20 * 1000});  // 调用加载层
        var formData = new FormData();
        var name = $("#upfile").val();
        formData.append("name", name);
        formData.append("file", $("#upfile")[0].files[0]);

        $.ajax({
            url: '${webPath}/permission/uploadloadTemplate',
            type: 'POST',
            data: formData,
            datatype: 'json',
            //ajax2.0可以不用设置请求头，但是jq帮我们自动设置了，这样的话需要我们自己取消掉
            contentType: false,
            //取消帮我们格式化数据，是什么就是什么
            processData: false,
            success: function (data) {
                //关闭 加载层
                layer.close(index);
                if (data.success == false) {
                    alert(data.msg)
                    layer.msg(data.msg);
                }
                if (data.success) {
                    console.log(data)
                    if (data.obj.length > 0) {
                    }
                    layer.msg("导入成功");
                   window.location.href = '${webPath}/permission/jumpQueryUserList';
                }
            },
            error: function () {
                layer.msg("导入失败");

            }

        });
        $("#upfile").val("");
    }

    //打开文件窗口
    function importInfo() {
        $("#upfile").click();
    }

</script>


</body>
</html>
