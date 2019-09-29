<%--
  T区提交问题
  Date: 2019/6/17
  Time: 17:49
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/view/pad/common/base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta charset="utf-8" content="width=device-width, initial-scale=0.87, maximum-scale=0.87, user-scalable=0"
          name="viewport"/>
    <title>${sysName}</title>
    <%@include file="/view/pad/common/global_css.jsp" %>
    <%@include file="/view/pad/common/core_js.jsp" %>
</head>
<body style="background-image:url(${resPath}/view/pad/images/beijing2.jpg);background-size:cover;">
<%@include file="/view/pad/common/header.jsp" %>
<input id="ip" type="hidden" value="${printer.printerIp}">
<div id="main" align="center">
    <div class="mycontent">
        <form id="form_content" class="cmxform" method="post">
            <div class="table" align="center"
                 <c:if test="${not empty issue.processStatus and issue.processStatus != '8' and issue.processStatus != '-1'}">style="pointer-events: none"</c:if>>
                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">Plant/工厂：</div>
                        <div class="na2">
                            <select id="plant" name="plant" class="select">
                                <%--<option value="">--请选择--</option>--%>
                                <option value="64" <c:if test="${issue.plant == '64' or fn:contains(person.belongArea, '1X')}">selected="selected"</c:if>>F
                                </option>
                                <option value="63" <c:if test="${issue.plant == '63' or fn:contains(person.belongArea, '1F')}">selected="selected"</c:if>>X
                                </option>
                            </select>
                            <input id="plantName" name="plantName" value="" type="hidden"/>
                        </div>
                    </div>
                    <div class="biao_l">
                        <div class="na1">ESN/发动机ESN：</div>
                        <div class="na2">
                            <input id="esn" name="esn"
                                   <c:if test="${not empty issue.esn}">value="${issue.esn}"</c:if> onblur="esnTakeOut()"
                                   type="text" class="input_scan" placeholder="请扫描/输入""/>
                            <div class="scan" onclick="esnScan()"></div>
                        </div>
                    </div>
                </div>

                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">SO/发动机SO：</div>
                        <div class="na2">
                            <input id="so" name="so"
                                   <c:if test="${not empty issue.so}">value="${issue.so}"</c:if> type="text"
                                   class="input" placeholder="SO" readonly="readonly"/>
                        </div>
                    </div>
                    <div class="biao_l">
                        <div class="na1">Engine Type/机型：</div>
                        <div class="na2">
                            <input id="engine_type" name="engine_type"
                                   <c:if test="${not empty issue.engineType}">value="${issue.engineType}"</c:if>
                                   type="text" class="input" placeholder="请输入"/>
                        </div>
                    </div>
                </div>

                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">PAL No./台架号：</div>
                        <div class="na2">
                            <input id="pal_no" name="pal_no"
                                   <c:if test="${not empty extend.palNo}">value="${extend.palNo}"</c:if> type="text"
                                   class="input" placeholder="请输入"/>
                        </div>
                    </div>
                    <div class="biao_l">
                        <div class="na1">Tray No./托盘号：</div>
                        <div class="na2">
                            <input id="tray_no" name="tray_no"
                                   <c:if test="${not empty extend.trayNo}">value="${extend.trayNo}"</c:if> type="text"
                                   class="input" placeholder="请输入"/>
                        </div>
                    </div>
                </div>

                <div class="biao">
                    <%--<div class="biao_l">
                        <div class="na1">S/N/序列号：</div>
                        <div class="na2">
                            <input id="serial_no" name="serial_no"
                                   <c:if test="${not empty issue.seriesNo}">value="${issue.seriesNo}"</c:if> type="text"
                                   class="input" placeholder="请输入"/>
                        </div>
                    </div>--%>
                    <div class="biao_l">
                        <div class="na1">Yes or No/是否合格：</div>
                        <div class="na2">
                            <select id="is_pass" name="is_pass" class="select" onchange="passChange()">
                                <option value="0" <c:if test="${issue.isRft == '0'}">selected="selected"</c:if>>No
                                </option>
                                <option value="1" <c:if test="${issue.isRft == '1'}">selected="selected"</c:if>>Yes
                                </option>
                                <option value="2" <c:if test="${issue.isRft == '2'}">selected="selected"</c:if>>只记录
                                </option>
                            </select>
                        </div>
                    </div>
                </div>
                <!-- 合格时不显示 -->
                <%--<div id="div_handler" <c:if test="${issue.isRft == '1'}">style="display: none"</c:if>>--%>
                <div id="div_handler"
                     <c:if test="${issue.isRft == '1'}">style="display: none"</c:if> class="biao">
                    <div class="biao_l">
                        <div class="na1">Handler Departments/处理部门：</div>
                        <div class="na2">
                            <select id="handler_depart" name="handler_depart" onchange="selectChange(this)"
                                    class="select">
                                <option value="">--请选择--</option>
                                <c:forEach var="dep" items="${dealList}" varStatus="status">
                                    <c:if test="${status.count == 1}">
                                        <c:set var="sel" value="${dep.handlerDeptId}"></c:set>
                                    </c:if>
                                </c:forEach>
                                <option
                                     <c:if test="${sel == 124914}">selected="selected"</c:if> value="124914">制造工程部
                                </option>
                                <option
                                     <c:if test="${sel == 124906}">selected="selected"</c:if> value="124906">质量部
                                </option>
                            </select>
                        </div>
                    </div>
                    <div class="biao_l">
                        <div class="na1">Handler Personnel/处理人员：</div>
                        <div class="na2">
                            <select id="handler_person" name="handler_person" required class="select2_category"
                                    style="width:265px;height:32px;padding:1px;font-size:16px;font-family:Arial;">
                                <option value="">-- 请选择 --</option>
                                <%--<c:if test="${not empty issue.processPersonAccount}">
                                    <option selected="selected" value="${issue.processPersonAccount}">${issue.processPersonName}</option>
                                </c:if>--%>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">Issue Category L1/质量问题类型l1：</div>
                        <div class="na2">
                            <select id="issue_cate_1" name="issue_cate_1" class="select" onchange="getIssueCate2()">
                                <option value="">--请选择--</option>
                            </select>
                        </div>
                    </div>
                    <div class="biao_l">
                        <div class="na1">Issue Category L2/质量问题类型l2：</div>
                        <div class="na2">
                            <select id="issue_cate_2" name="issue_cate_2" onchange="selectPersonChange(this)"
                                    class="select">
                                <option value="">--请选择--</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">Issue Category L3/质量问题类型l3：</div>
                        <div class="na2">
                            <input id="issue_cate_3" name="issue_cate_3"
                                   <c:if test="${issue.isRft == '1'}">value="${issue.issueCategoryL3}"</c:if>
                                   onkeyup="issueCateListener3()" type="text" class="input" placeholder="请输入"/>
                        </div>
                    </div>
                </div>
                <%--</div>--%>
                <div class="biao">
                    <div class="biao_2">
                        <div class="na1">Issue Comments/备注：</div>
                        <div class="na2" style="height: auto;">
                            <textarea id="issue_comment" name="issue_comment" rows="2" class="input2" placeholder="请输入"><c:if
                                    test="${not empty issue.issueCategoryL2Name}">${issue.issueCategoryL2Name}</c:if></textarea>
                        </div>
                    </div>
                </div>
                <div class="biao">
                    <div class="biao_l" style="width: 80%; height:120px;">
                        <div class="na1">Attach./附件：</div>
                        <div class="na2">
                            <c:if test="${not empty issue.attach}">
                                <c:forEach var="att" items="${fn:split(issue.attach, ',')}">
                                    <div class="image-item" style="background-image:url(${filePath}${att});"
                                         onclick="previewImage('${filePath}${att}')">
                                        <div class="image-close" onclick="deleteImg(this);event.cancelBubble = true">X</div>
                                    </div>
                                </c:forEach>
                            </c:if>

                            <div id="img_show" class="image-item space" onclick="chooseImgs();">
                                <img src="${resPath}/view/pad/images/img_add.png" alt=""
                                     style="width:60px;height:60px;display:inline-block;"/>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <div id="div_deal_list"
                <c:if test="${empty dealList}">style="display: none" </c:if>
                <c:if test="${not empty dealList}">style="display: block"</c:if>>
                <c:if test="${issue.isRft == '0' and issue.processStatus == '1'}">
                    <c:forEach var="deal" items="${dealList}" varStatus="sta">
                        <c:if test="${sta.count > 1}">
                            <table width="94%" border="0" cellspacing="0" cellpadding="0"
                                   style="font-size:14px; line-height:25px;">
                                <tr>
                                    <td style="border-top:#666666 1px dashed; padding-top:5px;">序号：<c:if
                                            test="${not empty deal.id}">${sta.count - 1}</c:if></td>
                                    <td style="border-top:#666666 1px dashed; padding-top:5px;">日期：<c:if
                                            test="${not empty deal.handlerDate}">${deal.handlerDate}</c:if></td>
                                </tr>
                                <tr>
                                    <td width="40%">处理部门：<c:if
                                            test="${not empty deal.handlerDeptName}">${deal.handlerDeptName}</c:if></td>
                                    <td width="60%">处理人：<c:if
                                            test="${not empty deal.handlerPersonName}">${deal.handlerPersonName}</c:if></td>
                                </tr>
                                <tr>
                                    <td>问题分类L1：<c:if
                                            test="${not empty deal.issueCategoryL1Name}">${deal.issueCategoryL1Name}</c:if></td>
                                    <td>问题分类L2：<c:if
                                            test="${not empty deal.issueCategoryL2Name}">${deal.issueCategoryL2Name}</c:if></td>
                                </tr>
                                <tr>
                                    <td colspan="2">问题分类L3：<c:if
                                            test="${not empty deal.issueCategoryL3}">${deal.issueCategoryL3}</c:if></td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="padding-bottom:5px;">处理意见：<c:if
                                            test="${not empty deal.resolution}">${deal.resolution}</c:if></td>
                                </tr>
                                <div class='ok1' style='width:18%;float:right;text-align:center; margin-top: 10px;'>打印</div>
                            </table>
                        </c:if>
                    </c:forEach>
                </c:if>
                <c:if test="${issue.isRft == '1' or (issue.isRft == '0' and issue.processStatus != '1')}">
                    <c:forEach var="deal" items="${dealList}" varStatus="sta">
                        <table class="content" width="94%" border="0" cellspacing="0" cellpadding="0"
                               style="font-size:14px; line-height:25px;">
                            <tr>
                                <td style="border-top:#666666 1px dashed; padding-top:5px;">序号：<c:if
                                        test="${not empty deal.id}">${sta.count}</c:if></td>
                                <td style="border-top:#666666 1px dashed; padding-top:5px;">日期：<c:if
                                        test="${not empty deal.handlerDate}">${deal.handlerDate}</c:if></td>
                            </tr>
                            <tr>
                                <td width="40%">处理部门：<c:if
                                        test="${not empty deal.handlerDeptName}">${deal.handlerDeptName}</c:if></td>
                                <td width="60%">处理人：<c:if
                                        test="${not empty deal.handlerPersonName}">${deal.handlerPersonName}</c:if></td>
                            </tr>
                            <tr>
                                <td>问题分类L1：<c:if
                                        test="${not empty deal.issueCategoryL1Name}">${deal.issueCategoryL1Name}</c:if></td>
                                <td>问题分类L2：<c:if
                                        test="${not empty deal.issueCategoryL2Name}">${deal.issueCategoryL2Name}</c:if></td>
                            </tr>
                            <tr>
                                <td colspan="2">问题分类L3：<c:if
                                        test="${not empty deal.issueCategoryL3}">${deal.issueCategoryL3}</c:if></td>
                            </tr>
                            <tr>
                                <td colspan="2" style="padding-bottom:5px;">处理意见：<c:if
                                        test="${not empty deal.resolution}">${deal.resolution}</c:if></td>
                            </tr>
                            <tr>
                                <td colspan="2" style="padding-bottom:5px;">
                                    <div class='ok1' id="${deal.id}" style='width:18%;float:right;text-align:center; margin-top: 10px;'>打印
                                        <input id="${deal.id}" name="resolution" type="hidden" value="${deal.resolution}"/>
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </c:forEach>
                </c:if>
            </div>

            <div align="center" style="width:94%;display:inline-block; margin-bottom:30px;">
                <div class="cancel" onclick="reset()" style="<c:if
                        test="${not empty issue.processStatus and issue.processStatus != '8'}">display: none</c:if>">重置
                </div>
                <!-- 添加 -->
                <c:if test="${empty issue.processStatus or issue.processStatus == '8' or issue.processStatus == '-1'}">
                    <div id="btn_add" class="ok" onclick="edit()">提交</div>
                </c:if>
                <!-- 修改 -->
                <%--<div class="print" style="margin-left: 8px">打印</div>--%>
            </div>
        </form>
    </div>
</div>
<%@include file="/view/pad/common/footer.jsp" %>
<%@include file="/view/pad/common/common_js.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        // 设置菜单栏内容
        $("#label_area")[0].innerHTML = "T 区";
        $("#label_option")[0].innerHTML = "问题提交";
        $("#div_submit").attr("class", "ppt1_on");
        $("#div_list").attr("onclick", "javascript:location.href='${webPath}/pad/issue/list?temp=t','_self'");

        $('#handler_person').select2();

        // 表单数据校验
        $("#form_content").validate({
            rules: {
                plant: "required",
                esn: {
                    required: true,
                    isNo: true
                },
                engine_type: {
                    required: true,
                    isNo: true
                },
                pal_no: {
                    required: false,
                    isNo: true
                },
                tray_no: {
                    required: false,
                    isNo: true
                },
                issue_cate_1: "required",
                issue_cate_2: "required",
                issue_cate_3: "required"
            },
            messages: {
                plant: "",
                esn: {
                    required: "",
                    isNo: ""
                },
                engine_type: {
                    required: "",
                    isNo: ""
                },
                pal_no: {
                    required: "",
                    isNo: ""
                },
                tray_no: {
                    required: "",
                    isNo: ""
                },
                issue_cate_1: "",
                issue_cate_2: "",
                issue_cate_3: ""
            }
        });

        // 分类1
        var cateList = getSelectList("level", 0);
        var isRft = "${issue.isRft}";
        /*if (isRft == '1') {
            var cate1 = "


        ${issue.issueCategoryL1}";
            var cate2 = "


        ${issue.issueCategoryL2}";
        } else {
            var cate1 = "";
            var cate2 = "";
        }*/
        var cate1 = "${issue.issueCategoryL1}";
        var cate2 = "${issue.issueCategoryL2}";
        if (cateList != null && cateList.length > 0) {
            $("#issue_cate_1").html(getOptionHtml(cateList, cate1));
        }
        if (cate1 != null && cate1 != "") {
            var cateList2 = getSelectList("level", cate1);
            $("#issue_cate_2").html(getOptionHtml(cateList2, cate2));
        }
        $("#issue_cate_3").val("${issue.issueCategoryL3}");

        var dept = $("#handler_depart option:selected").val();
        if (dept != null && dept != "") {
            // selectChange("");
            getUserListByDeptId(dept, "${issue.processPersonAccount}");
        }

        var attachs = "${issue.attach}";
        attach = attachs.split(",");
    });

    /**
     * esn带出
     */
    function esnTakeOut() {
        var esn = $("#esn").val().trim();
        if (esn != null && esn != "") {
            var data = getDataByEsn(esn);
            if (data != null && data.so != "") {
                $("#so").val(data.so);
            } else {
                $("#so").val("");
            }
        } else {
            $("#so").val("");
        }
    }

    /**
     * 是否合格
     */
    function passChange() {
        // 合格
        var isPass = $("#is_pass option:selected").val();
        if (isPass == 1) {
            $("#div_handler").css("display", "none");
            $("#handler_depart").css("border", "");
            $("#handler_person").css("border", "");
        }
        // 不合格
        if (isPass == 0) {
            $("#div_handler").css("display", "block");
            var cateList = getSelectList("level", 0);
            $("#issue_cate_1").html(getOptionHtml(cateList, ""));
            $("#issue_cate_2").html("<option value=''>--请选择--</option>");
            $("#issue_cate_3").val("");
        }

        if (isPass == 2) {
            $("#div_handler").css("display", "none");
            $("#handler_depart").css("border", "");
            $("#handler_person").css("border", "");
        }
    }

    /**
     * 部门
     */
    function selectChange(obj) {
        if (obj != null && obj != "") {
            var id = obj.id;
            var selected = $("#" + id + " option:selected").val();
            if (selected != null && selected != "") {
                $("#" + id).css("border", "");
            }
        }
        getUserListByDeptId(selected, "");
    }

    /**
     * 获取处理人列表
     */
    function getUserListByDeptId(deptId, selected) {
        $.ajax({
            type: "get",
            url: "${webPath}/commonList/getUserByDeptID",
            dataType: "json",
            data: {
                "deptId": Number(deptId),
            },
            success: function (result) {
                var html = "<option value=''>--请选择--</option>";
                for (var i in result) {
                    if (selected == result[i].account) {
                        html += "<option selected='selected' value='" + result[i].account + "'>" + result[i].name + "</option>";
                    } else {
                        html += "<option value='" + result[i].account + "'>" + result[i].name + "</option>";
                    }
                }
                $("#handler_person").html(html);
            }
        });
    }

    /**
     * 处理人
     */
    function selectPersonChange(obj) {
        var id = obj.id;
        var selected = $("#" + id + " option:selected").val();
        if (selected != null && selected != "") {
            $("#" + id).css("border", "");
        }
    }

    /**
     * 获取分类2列表
     */
    function getIssueCate2() {
        var cate1 = $("#issue_cate_1 option:selected").val();
        if (cate1 != null && cate1 != "") {
            $("#issue_cate_1").css("border", "");
        }
        var list = getSelectList("level", cate1);
        if (list != null && list.length > 0) {
            $("#issue_cate_2").html(getOptionHtml(list, ""));
        }
    }

    /**
     * 分类3监听
     */
    function issueCateListener3() {
        var cate3 = $("#issue_cate_3").val();
        if (cate3 != null && cate3 != "" && isDesc(cate3)) {
            $("#issue_cate_3").css("border", "");
        }
    }

    /**
     * 重置
     */
    function reset() {
        location.reload();
    }

    /**
     * 编辑
     */
    function edit() {
        check();
        if ($("#form_content").valid() && check()) {
            // 添加
            var isPass = $("#is_pass option:selected").val();
            if ("${issue.processStatus}" == "" && isPass == 2) {
                var uri = "/pad/issue/add";
            }
            if ("${issue.processStatus}" == "") {
                var uri = "/pad/issue/add";
            }
            // 修改
            if ("${issue.processStatus}" == "8" || "${issue.processStatus}" == "-1") {
                var uri = "/pad/issue/modify";
            }
            editIssue(uri, getData());
        }
    }

    /**
     * 主表数据
     */
    function getData() {
        var att = attach.toString();
        if (att.startsWith(",")) {
            var att = att.substring(1, att.length);
        }
        var processAccount = $("#handler_person option:selected").val(); // 工号
        if (processAccount != null && processAccount != "") {
            var processName = $("#handler_person option:selected").text();
        }
        var data = {
            "id": "${issue.id}", // id
            "qualityType": "T", // 大区
            "number": "${issue.number}", // 问题编号
            "inputPersonAccount": "${issue.inputPersonAccount}", // 录入人工号
            "processPersonAccount": processAccount, // 处理人工号
            "processPersonName": processName, // 处理人姓名
            "plant": $("#plant option:selected").val(), // 工厂
            "plantName": $("#plant option:selected").text(), // 工厂
            "esn": $("#esn").val().trim(),
            "so": $("#so").val(),
            "engineType": $("#engine_type").val().trim(), // 机型
            "isRft": $("#is_pass option:selected").val(), // 是否合格
            "issueCategoryL1": $("#issue_cate_1 option:selected").val(), // 分类
            "issueCategoryL2": $("#issue_cate_2 option:selected").val(), // 分类2
            "issueCategoryL3": $("#issue_cate_3").val().trim(), // 分类3
            "issueDesc": $("#issue_cate_3").val().trim(), // 分类3
            "seriesNo": $("#esn").val().trim(), // 序列号
            "attach": att, // 附件
            "issueExtend": JSON.stringify(getExtendData()), // 扩展表信息
            "comments": JSON.stringify(getDealData()), // 处理流程信息
            "processStatus": '${issue.processStatus}',
            "issueCategoryL2Name": $("#issue_comment").val().trim() // 备注
        };
        return data;
    }

    /**
     * 扩展表数据
     */
    function getExtendData() {
        var data = {
            "palNo": $("#pal_no").val().trim(), // 台架号
            "trayNo": $("#tray_no").val().trim() // 托盘号
        };
        return data;
    }

    /**
     * 处理流程数据
     */
    function getDealData() {
        var data = {
            "handlerDeptId": $("#handler_depart option:selected").val(), // 处理部门id
            "handlerDeptName": $("#handler_depart option:selected").text(), // 处理部门名称
            "handlerPersonAccount": $("#handler_person option:selected").val(), // 处理人工号
            "handlerPersonName": $("#handler_person option:selected").text(), // 处理人姓名
            "issueCategoryL1": $("#issue_cate_1 option:selected").val(), // 分类1
            "issueCategoryL1Name": $("#issue_cate_1 option:selected").text(), // 分类1
            "issueCategoryL2": $("#issue_cate_2 option:selected").val(), // 分类2
            "issueCategoryL2Name": $("#issue_cate_2 option:selected").text(), // 分类2
            "issueCategoryL3": $("#issue_cate_3").val().trim(), // 分类3
        };
        return data;
    }

    /**
     * 不合格时校验数据
     */
    function check() {
        var result = true;
        var isPass = $("#is_pass option:selected").val();
        if (isPass == 0) {
            var dept = $("#handler_depart option:selected").val(); // 处理部门
            var person = $("#handler_person option:selected").val(); // 处理人员
            // var cate1 = $("#issue_cate_1 option:selected").val(); // 分类1
            // var cate2 = $("#issue_cate_2 option:selected").val(); // 分类2
            // var cate3 = $("#issue_cate_3").val(); // 分类3
            if (dept == null || dept == "") {
                $("#handler_depart").css("border", "1px solid red");
                result = false;
            } else {
                $("#handler_depart").css("border", "");
            }
            if (person == null || person == "") {
                $("#handler_person").css("border", "1px solid red");
                result = false;
            } else {
                $("#handler_person").css("border", "");
            }
            // if(cate1 == null || cate1 == "") {
            //     $("#issue_cate_1").css("border", "1px solid red");
            //     result = false;
            // } else {
            //     $("#issue_cate_1").css("border", "");
            // }
            // if(cate2 == null || cate2 == "") {
            //     $("#issue_cate_2").css("border", "1px solid red");
            //     result = false;
            // } else {
            //     $("#issue_cate_2").css("border", "");
            // }
            // if(cate3 == null || cate3 == "" || isDesc(cate3) == false) {
            //     $("#issue_cate_3").css("border", "1px solid red");
            //     result = false;
            // } else {
            //     $("#issue_cate_3").css("border", "");
            // }
        }
        return result;
    }
    /**
     * 打印待处理标签
     */
    function printHoldTag(resolution) {
        alert(resolution)
        var index = layer.load(1, {
            shade: [0.1,'#fff'] // 0.1透明度的白色背景
        });
        $.ajax({
            type: "get",
            url: "${webPath}/printer/printRepairTag",
            dataType: "json",
            data: {
                "issueNo": '${issue.number}',
                "issueDesc": '${issue.issueDesc}',
                "esn": '${issue.esn}',
                "so": '${issue.so}',
                "tc": '${extend.palNo}',
                "pallet": '${extend.trayNo}',
                "repairAction": resolution,
                "ip": $("#ip").val(),
            },
            success: function (result) {
                layer.close(index);
                console.info(result);
                mui.toast(result.msg);
            },
            error: function () {
                layer.close(index);
                mui.toast("打印失败");
            }
        });
    }
    /**
     * 点击事件
     */
    mui(".content").on("tap", ".ok1", function () {
        var id = $(this).attr("id");// 处理id
        var resolution = $(this).find("input[id="+id+"]").val();// 处理id
        alert(resolution)
        if ($("#ip").val() != null && $("#ip").val() != "") { // 已绑定打印机
            console.info($("#ip").val());
            printHoldTag(resolution);
        } else { // 未绑定打印机
            mui.toast("请联系管理员绑定打印机后重试");
        }
    });


</script>
</body>
</html>
