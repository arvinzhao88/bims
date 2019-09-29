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
                        <form id="form1" class="form-horizontal form-label-left" method="post">
                            <div class="x_content">
                                <%--<div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">用户头像</label>
                                    <div class="col-md-6 col-sm-6 col-xs-12" style="text-align: center">
                                        <input type="file" id="userLogo" name="userLogo" required="required"
                                               class="" value=""/>
                                        <img id="userUrl" style="width:100px" src=""/>
                                        <input type="hidden" name="logo" id="logo" value="">
                                    </div>
                                </div>--%>
                                <div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">工号</label>
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <select id="account" class="required form-control col-md-7 col-xs-12"
                                                name="account">
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">用户名</label>
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <input id="name" class="required form-control col-md-7 col-xs-12" type="text" readonly="readonly"
                                               name="name" value="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">登录名</label>
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <input id="loginName" class="required form-control col-md-7 col-xs-12" readonly="readonly"
                                               type="text" name="loginName" value="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">手机号</label>
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <input id="mobile" class="required form-control col-md-7 col-xs-12" type="text" readonly="readonly"
                                               name="mobile" value="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">邮箱</label>
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <input id="email" class="required form-control col-md-7 col-xs-12" type="text" readonly="readonly"
                                               name="email" value="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">角色</label>
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <c:forEach items="${bimsRole}" var="list">
                                            <input type="checkbox" class="" id="belongRole" name="belongRole"
                                                   value="${list.id}">${list.roleName}&nbsp;&nbsp;&nbsp;&nbsp;
                                        </c:forEach>
                                        <%--线编工人 <input type="checkbox" name="belongRole" value="1">
                                        质量工程师 <input type="checkbox" name="belongRole" value="2">
                                        责任人 <input type="checkbox" name="belongRole" value="3">
                                        EQRleader <input type="checkbox" name="belongRole" value="4">
                                        质量经理 <input type="checkbox" name="belongRole" value="5">
                                        处理人 <input type="checkbox" name="belongRole" value="6">--%>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12"
                                           style="height: 200px">对应区域</label>
                                    <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 5px;">
                                        <a>APU&终检：</a>
                                        <input type="checkbox" name="belongArea" value="8X"> X
                                        <input type="checkbox" name="belongArea" value="8F" style="margin-left: 8px;">
                                        F
                                    <%--</div>

                                    <div class="col-md-6 col-sm-6 col-xs-12">--%>
                                        <a style="margin-left: 6%;">T区：</a>
                                        <input type="checkbox" name="belongArea" value="1X"> X

                                        <input type="checkbox" name="belongArea" value="1F" style="margin-left: 8px;">
                                        F
                                   <%-- </div>

                                    <div class="col-md-6 col-sm-6 col-xs-12">--%>
                                        <a style="margin-left: 6%;">机加：</a>
                                        <input type="checkbox" name="belongArea" value="2X"> X
                                        <input type="checkbox" name="belongArea" value="2F" style="margin-left: 8px;">
                                        F
                                    </div>

                                   <%-- <div class="col-md-6 col-sm-6 col-xs-12">
                                        <a style="margin-left: 28.5px;">JOB1:</a>
                                        <input type="checkbox" name="belongArea" value="3X"> X
                                        <input type="checkbox" name="belongArea" value="3F" style="margin-left: 15px;">
                                        F
                                    </div>

                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <a style="margin-left: 40px;">BIS:</a>
                                        <input type="checkbox" name="belongArea" value="4X"> X
                                        <input type="checkbox" name="belongArea" value="4F" style="margin-left: 15px;">
                                        F
                                    </div>

                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <a style="margin-left: 33.5px;">EQA:</a>
                                        <input type="checkbox" name="belongArea" value="5X"> X
                                        <input type="checkbox" name="belongArea" value="5F" style="margin-left: 15px;">
                                        F
                                    </div>

                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <a style="margin-left: 33.5px;">SQA:</a>
                                        <input type="checkbox" name="belongArea" value="6X"> X
                                        <input type="checkbox" name="belongArea" value="6F" style="margin-left: 15px;">
                                        F
                                    </div>

                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <a style="margin-left: 33.5px;">售后:</a>
                                        <input type="checkbox" name="belongArea" value="7X"> X
                                        <input type="checkbox" name="belongArea" value="7F" style="margin-left: 15px;">
                                        F
                                    </div>--%>
                                </div>


                            </div>

                        </form>
                        <div class="form-group">
                            <div style="text-align:center">
                                <button class="btn btn-primary" type="button" data-toggle="modal"
                                        data-target=".this-save" onclick="submit()">提交
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
    function submit() {
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
