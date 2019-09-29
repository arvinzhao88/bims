<%--
  APU及终检提交问题
  Date: 2019/6/17
  Time: 11:10
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
    <%@include file="/view/pad/common/core_js.jsp" %>
    <%@include file="/view/pad/common/global_css.jsp" %>
</head>
<body style="background-image:url(${resPath}/view/pad/images/beijing2.jpg);background-size:cover;">
<%@include file="/view/pad/common/header.jsp" %>
<div id="main" align="center">
    <div class="mycontent">
        <form id="form_content" class="cmxform" method="post">
            <!-- 状态不为空且不为0，不可编辑 -->
            <div class="table" align="center"
                 <c:if test="${not empty issue.processStatus and issue.processStatus != '0' and issue.processStatus != '-1'}">style="pointer-events: none"</c:if>>
                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">Plant/工厂：</div>
                        <div class="na2">
                            <select id="plant" name="plant" class="select" onchange="getAreaList('')">
                                <%--<option value="">--请选择--</option>--%>
                                <option value="64" <c:if test="${issue.plant == '64' or fn:contains(person.belongArea, '8F')}">selected="selected"</c:if>>F
                                </option>
                                <option value="63" <c:if test="${issue.plant == '63' or fn:contains(person.belongArea, '8X')}">selected="selected"</c:if>>X
                                </option>
                            </select>
                            <input id="plantName" name="plantName" value="" type="hidden"/>
                        </div>
                    </div>
                    <div class="biao_l">
                        <div class="na1">OP/工位：</div>
                        <div class="na2">
                            <input id="op_no" name="op_no"
                                   <c:if test="${not empty issue.issueStation}">value="${issue.issueStation}"</c:if>
                                   type="text" class="input" placeholder="请输入"/>
                        </div>
                    </div>
                </div>
                <div class="biao">
                    <!-- 选择工厂，级联查询 -->
                    <div class="biao_l">
                        <div class="na1">Area/区域：</div>
                        <div class="na2">
                            <select id="area" name="area" class="select">
                                <option value="">--请选择--</option>
                            </select>
                        </div>
                    </div>
                    <div class="biao_l">
                        <div class="na1">Failure Location/问题失效位置：</div>
                        <div class="na2">
                            <select id="fail_location" name="fail_location" class="select">
                                <option value="">--请选择--</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">S/N/序列号：</div>
                        <div class="na2">
                            <input id="serial_no" name="serial_no"
                                   <c:if test="${not empty issue.seriesNo}">value="${issue.seriesNo}"</c:if> type="text"
                                   class="input_scan" placeholder="请扫描/输入"/>
                            <div class="scan" onclick="scan('serial_no')"></div>
                        </div>
                    </div>
                </div>
                <div class="biao">
                    <div class="biao_2">
                        <div class="na1">Issue Description/具体问题描述：</div>
                        <div class="na2" style="height: auto;">
                            <textarea id="issue_desc" name="issue_desc" rows="2" class="input2" placeholder="请输入"><c:if
                                    test="${not empty issue.issueDesc}">${issue.issueDesc}</c:if></textarea>
                        </div>
                    </div>
                </div>
                <br/><br/><br/>
                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">Issue Category L1/质量问题分类L1：</div>
                        <div class="na2">
                            <select id="issue_cate_1" name="issue_cate_1" class="select" onchange="choose()">
                                <option value="">--请选择--</option>
                                <%--<option value="1"
                                        <c:if test="${issue.issueCategoryL1 == '1'}">selected="selected"</c:if>>自制件
                                </option>--%>
                                <option value="2"
                                        <c:if test="${issue.issueCategoryL1 == '2'}">selected="selected"</c:if>>采购件
                                </option>
                                <option value="3"
                                        <c:if test="${issue.issueCategoryL1 == '3'}">selected="selected"</c:if>>在制发动机
                                </option>
                            </select>
                        </div>
                    </div>
                </div>
                <!-- 选择自制件、采购件显示 -->
                <div id="div_part"
                     <c:choose>
                     <c:when test="${issue.issueCategoryL1 == '2'}">style="display: block" </c:when>
                         <c:otherwise>style="display: none"</c:otherwise>
                </c:choose>>
                    <div class="biao">
                        <div class="biao_l">
                            <div class="na1">Part Number/零件号：</div>
                            <div class="na2">
                                <input id="part_no" name="part_no"
                                       <c:if test="${not empty issue.partNo}">value="${issue.partNo}"</c:if> type="text"
                                       class="input_scan" placeholder="请扫描/输入" list="part_no_list" onkeyup="getPartNo()"
                                       onblur="partNoTakeOut()"/>
                                <datalist id="part_no_list"></datalist>
                                <div class="scan" onclick="scan('part_no')"></div>
                            </div>
                        </div>
                        <div class="biao_l">
                            <div class="na1">Part Name/零件名称：</div>
                            <div class="na2">
                                <input id="part_name" name="part_name"
                                       <c:if test="${not empty issue.partName}">value="${issue.partName}"</c:if>
                                       type="text" class="input" placeholder="零件名称" readonly="readonly"/>
                            </div>
                        </div>
                    </div>
                    <div class="biao">
                        <div class="biao_l">
                            <div class="na1">Supplier Code/供应商代码：</div>
                            <div class="na2">
                                <select id="supplier_code" name="supplier_code" class="select"
                                        onchange="getSupplierName()">
                                    <c:if test="${empty issue.vendorCode}">
                                        <option value="">--请选择--</option>
                                    </c:if>
                                    <c:if test="${not empty issue.vendorCode}">
                                        <option value="${issue.vendorCode}"
                                                selected="selected">${issue.vendorCode}</option>
                                    </c:if>
                                </select>
                            </div>
                        </div>
                        <div class="biao_l">
                            <div class="na1">Supplier Name/供应商名称：</div>
                            <div class="na2">
                                <input id="supplier_name" name="supplier_name"
                                       <c:if test="${not empty issue.vendorName}">value="${issue.vendorName}"</c:if>
                                       type="text" class="input" placeholder="供应商名称" readonly="readonly"/>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- 选择在制发动机显示 -->
                <div id="div_esn"
                     <c:choose>
                     <c:when test="${issue.issueCategoryL1 == '3'}">style="display: block" </c:when>
                         <c:otherwise>style="display: none"</c:otherwise>
                </c:choose>>
                    <div class="biao">
                        <div class="biao_l">
                            <div class="na1">ESN/发动机ESN：</div>
                            <div class="na2">
                                <input id="esn" name="esn" list="esn_list" onkeyup="inputListener(this)"
                                       onblur="esnTakeOut()"
                                       <c:if test="${not empty issue.esn}">value="${issue.esn}"</c:if> type="text"
                                       class="input_scan" placeholder="请扫描/输入"/>
                                <div class="scan" onclick="scan('esn')"></div>
                            </div>
                        </div>
                        <!-- ERP接口，由ESN带出 -->
                        <div class="biao_l">
                            <div class="na1">SO/发动机SO：</div>
                            <div class="na2">
                                <input id="so" name="so"
                                       <c:if test="${not empty issue.so}">value="${issue.so}"</c:if> type="text"
                                       class="input" placeholder="SO" readonly="readonly"/>
                            </div>
                        </div>
                    </div>
                    <div class="biao">
                        <div class="biao_l">
                            <div class="na1">Engine Type/机型：</div>
                            <div class="na2">
                                <input id="engine_type" name="engine_type" onkeyup="inputListener(this)"
                                       <c:if test="${not empty issue.engineType}">value="${issue.engineType}"</c:if>
                                       type="text" class="input" placeholder="请输入"/>
                            </div>
                        </div>
                        <!-- ERP接口，由SO带出 -->
                        <div class="biao_l">
                            <div class="na1">VPI Project/项目号：</div>
                            <div class="na2">
                                <input id="project_no" name="project_no"
                                       <c:if test="${not empty issue.projectNo}">value="${issue.projectNo}"</c:if>
                                       type="text" class="input" placeholder="项目号" readonly="readonly"/>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">Failure Qty./数量：</div>
                        <div class="na2">
                            <input id="fail_num" name="fail_num"
                                   <c:if test="${not empty issue.qty and issue.qty != 0}">value="${issue.qty}"</c:if>
                                   type="text" class="input" placeholder="请输入"/>
                        </div>
                    </div>
                </div>
                <div class="biao">
                    <div class="biao_2">
                        <div class="na1">Issue Comments/备注：</div>
                        <div class="na2" style="height: auto;">
                            <textarea id="issue_comment" name="issue_comment" rows="2" class="input2" placeholder="请输入"><c:if
                                    test="${not empty issue.comments}">${issue.comments}</c:if></textarea>
                        </div>
                    </div>
                </div>
                <div class="biao">
                    <div class="biao_l" style="width: 80%">
                        <div class="na1">Attach./附件：</div>
                        <div class="na2">
                            <%--<div onclick="previewImage('${resPath}/view/pad/images/fadonji1.png');"
                                 class="image-item" style="background-image:url('${resPath}/view/pad/images/fadonji1.png');">
                                <div class="image-close" onclick="deleteImg(this);event.cancelBubble = true">X</div>
                            </div><div onclick="previewImage('${resPath}/view/pad/images/fadonji1.png');"
                                 class="image-item" style="background-image:url('${resPath}/view/pad/images/fadonji1.png');">
                                <div class="image-close" onclick="deleteImg(this);event.cancelBubble = true">X</div>
                        </div><div onclick="previewImage('${resPath}/view/pad/images/fadonji1.png');"
                                 class="image-item" style="background-image:url('${resPath}/view/pad/images/fadonji1.png');">
                                <div class="image-close" onclick="deleteImg(this);event.cancelBubble = true">X</div>
                        </div><div onclick="previewImage('${resPath}/view/pad/images/fadonji1.png');"
                                 class="image-item" style="background-image:url('${resPath}/view/pad/images/fadonji1.png');">
                                <div class="image-close" onclick="deleteImg(this);event.cancelBubble = true">X</div></div>--%>

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
                                     style=" width: 60px;height: 60px;display: inline-block;"/>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div align="center" style="width:100%;display:inline-block; margin-bottom:30px;">
                <div id="btn_reset" class="cancel" onclick="reset()"
                     <c:if test="${not empty issue.processStatus and issue.processStatus != '0'}">style="display: none"
                </c:if>">重置
            </div>
            <!-- 添加 -->
            <c:if test="${empty issue.processStatus}">
            <div id="btn_add" class="ok" onclick="edit(this)">提交</div>
            </c:if>
            <!-- 修改 -->
            <c:if test="${issue.processStatus == '0' || issue.processStatus == '-1'}">
            <div id="btn_modify" class="ok" onclick="edit(this)">修改</div>
            </c:if>
    </div>
    </form>
</div>
</div>
<%@include file="/view/pad/common/footer.jsp" %>
<%@include file="/view/pad/common/common_js.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        // 设置菜单栏内容
        $("#label_area")[0].innerHTML = "APU&终检";
        $("#label_option")[0].innerHTML = "问题提交";
        $("#div_submit").attr("class", "ppt1_on");
        $("#div_list").attr("onclick", "javascript:location.href='${webPath}/pad/issue/list?temp=a','_self'");

        // 表单数据校验
        $("#form_content").validate({
            rules: {
                serial_no: {
                    required: true,
                    isNo: true
                },
                plant: "required",
                area: "required",
                op_no: {
                    required: true,
                    isNo: true
                },
                fail_location: "required",
                issue_desc: {
                    required: true,
                    isDesc: true
                },
                issue_cate_1: "required",
                fail_num: {
                    required: true,
                    isNum: true
                }
            },
            messages: {
                serial_no: {
                    required: "",
                    isNo: ""
                },
                plant: "",
                area: "",
                op_no: {
                    required: "",
                    isNo: ""
                },
                fail_location: "",
                issue_desc: {
                    required: "",
                    isDesc: ""
                },
                issue_cate_1: "",
                fail_num: {
                    required: "",
                    isNum: ""
                }
            }
        });

        // 获取失效位置列表
        var failLocationData = getSelectList("position", 0);
        if (failLocationData != null && failLocationData.length > 0) {
            $("#fail_location").html(getOptionHtml(failLocationData, "${issue.failureLocation}"));
        }

        // 回显获取区域列表
        var area = "${issue.area}";
        getAreaList(area);

        var attachs = "${issue.attach}";
        attach = attachs.split(",");
    });

    /**
     * 质量问题分类选择事件
     */
    function choose() {
        var issueCate = $("#issue_cate_1 option:selected").val();
        // 未选择、自制件
        if (issueCate == "" || issueCate == "1") {
            $("#div_esn").css("display", "none");
            $("#div_part").css("display", "none");
            resetEsn();
            resetPart();
        }
        // 采购件
        if (issueCate == 2) {
            $("#div_esn").css("display", "none");
            $("#div_part").css("display", "block");
            resetEsn();
        }
        // 在制发动机
        if (issueCate == "3") {
            $("#div_esn").css("display", "block");
            $("#div_part").css("display", "none");
            resetPart();
        }
    }

    /**
     * 选择工厂获取区域列表
     */
    function getAreaList(selected) {
        var plant = $("#plant option:selected").val();
        var data = getSelectList("xf", plant);
        if (data != null && data.length > 0) {
            $("#area").html(getOptionHtml(data, selected));
        }
    }

    /**
     * 零件号模糊查询
     */
    function getPartNo() {
        var partNo = $("#part_no").val().trim();
        if (partNo != null && partNo != "" && isNo(partNo) == true) {
            $("#part_no").css("border", "");
        }
        if (partNo.length >= 4 && partNo.length < 7) {
            // 零件号模糊查询
            var partNoList = getPartNoList(partNo);
            if (partNoList != null && partNoList.length > 0) {
                $("#part_no_list").html(getDataListHtml(partNoList));
            }
        }
    }

    /**
     * 零件号带出
     */
    function partNoTakeOut() {
        var partNo = $("#part_no").val().trim();
        if (partNo != null && partNo != "") {
            // 获取供应闪列表
            var supplierList = getSupplierListByPartNo(partNo);
            if (supplierList != null && supplierList.length > 0) {
                // 带出零件名称
                // var partName = getPartNameByNo(partNo);
                var partName = supplierList[0].partName;
                if (partName != null && partName != "") {
                    $("#part_name").val(partName);
                } else {
                    $("#part_name").val("");
                }
                // 带出供应商代码列表
                // var supplierList = getSuppNoListByPartNo(partNo);
                var opts = getSuppNoOptHtml(supplierList);
                // 返回一条数据，直接带出供应商名称
                if (supplierList.length == 1) {
                    $("#supplier_code").html(opts);
                    $("#supplier_name").val(supplierList[0].supplierName);
                    // getSupplierName(supplierList[0]);
                }
                // 多条下拉
                if (supplierList.length > 1) {
                    $("#supplier_code").html("<option value=''>--请选择--</option>" + opts);
                }
            } else {
                $("#part_name").val("");
                $("#supplier_code").html("<option value=''>--请选择--</option>");
                getSupplierName();
            }
        } else {
            $("#part_name").val("");
            $("#supplier_code").html("<option value=''>--请选择--</option>");
            getSupplierName();
        }
    }

    /**
     * 获取供应商名称
     * @param no
     */
    function getSupplierName() {
        var supplierName = $("#supplier_code option:selected").val();
        if (supplierName != null && supplierName != "") {
            $("#supplier_code").css("border", "");
            $("#supplier_name").val(supplierName);
        } else {
            $("#supplier_name").val("");
        }

        /*if (no == '') {
            var supplierNo = $("#supplier_code option:selected").val();
        } else {
            var supplierNo = no;
        }
        if (supplierNo != null && supplierNo != "") {
            $("#supplier_code").css("border", "");
            var supplierName = getSupplierNameByNo(supplierNo);
            if (supplierName != null && supplierName != "") {
                $("#supplier_name").val(supplierName);
            } else {
                $("#supplier_name").val("");
            }
        } else {
            $("#supplier_name").val("");
        }*/
    }

    /**
     * esn带出
     */
    function esnTakeOut() {
        var esn = $("#esn").val().trim();
        if (esn != null && esn != "") {
            $("#serial_no").val(esn); // 如果是在制发动机，序列号和ESN相同
            var data = getDataByEsn(esn);
            if (data != null && data.so != "") {
                $("#so").val(data.so);
            } else {
                $("#so").val("");
            }
            if (data.prjectName != null && data.prjectName != "") {
                $("#project_no").val(data.prjectName);
            } else {
                $("#project_no").val("");
            }
        } else {
            $("#so").val("");
            $("#project_no").val("");
        }
    }

    /**
     * 供应商代码option
     * @param list
     * @returns {*}
     */
    function getSuppNoOptHtml(list) {
        var opts;
        for (var i in list) {
            opts += "<option value=" + list[i].supplierName + ">" + list[i].supplierCode + "</option>";
        }
        return opts;
    }

    /**
     * esn监听
     */
    function inputListener(obj) {
        var id = obj.id;
        var value = $("#" + id).val();
        if (value != null && value != "" && isNo(value)) {
            $("#" + id).css("border", "");
        }
    }

    /**
     * 编辑
     */
    function edit(obj) {
        check();
        if ($("#form_content").valid() && check()) {
            if (obj.id == "btn_add") {
                var uri = "/pad/issue/add";
            }
            if (obj.id == "btn_modify") {
                var uri = "/pad/issue/modify";
            }
            editIssue(uri, getData());
        }
    }

    /**
     * 零件块数据清空
     */
    function resetPart() {
        $("#part_no").val("");
        $("#part_name").val("");
        $("#supplier_code").html("<option value=''>--请选择--</option>");
        $("#supplier_name").val("");
        $("#part_no").css("border", "");
        $("#supplier_code").css("border", "");
    }

    /**
     * esn块数据清空
     */
    function resetEsn() {
        $("#esn").val("");
        $("#so").val("");
        $("#project_no").val("");
        $("#engine_type").val("");
        $("#esn").css("border", "");
        $("#engine_type").css("border", "");
    }

    /**
     * 检查数据合法性
     * @returns {boolean}
     */
    function check() {
        var result = true;
        var issueCate1 = $("#issue_cate_1 option:selected").val(); // 问题分类1
        // 采购件
        if (issueCate1 == "2") {
            var partNo = $("#part_no").val(); // 零件号
            var supplierCode = $("#supplier_code option:selected").val(); // 供应商代码
            if (partNo == null || partNo == "" || isNo(partNo) == false) {
                $("#part_no").css("border", "1px solid red");
                result = false;
            } else {
                $("#part_no").css("border", "");
            }
            if (supplierCode == null || supplierCode == "") {
                $("#supplier_code").css("border", "1px solid red");
                result = false;
            } else {
                $("#supplier_code").css("border", "");
            }
        }
        // 在制发动机
        if (issueCate1 == "3") {
            var esn = $("#esn").val();
            var engineType = $("#engine_type").val(); // 机型
            if (esn == null || esn == "" || isNo(esn) == false) {
                $("#esn").css("border", "1px solid red");
                result = false;
            } else {
                $("#esn").css("border", "");
            }
            if (engineType == null || engineType == "" || isNo(engineType) == false) {
                $("#engine_type").css("border", "1px solid red");
                result = false;
            } else {
                $("#engine_type").css("border", "");
            }
        }
        return result;
    }

    /**
     * 获取页面数据
     */
    function getData() {
        var att = attach.toString();
        if (att.startsWith(",")) {
            var att = att.substring(1, att.length);
        }
        var suppTemp = $("#supplier_code option:selected").val();
        if(suppTemp != null && suppTemp != "") {
            var suppCode = $("#supplier_code option:selected").text();
        }
        var data = {
            "id": "${issue.id}", // id
            "qualityType": "A", // 大区
            "number": "${issue.number}", // 问题编号
            "inputPersonAccount": "${issue.inputPersonAccount}", // 录入人工号
            "seriesNo": $("#serial_no").val().trim(), // 序列号
            "plant": $("#plant option:selected").val(), // 工厂
            "plantName": $("#plant option:selected").text(), // 工厂
            "area": $("#area option:selected").val(), // 区域
            "issueStation": $("#op_no").val().trim(), // 工位
            "failureLocation": $("#fail_location option:selected").val(), // 失效位置
            "issueDesc": $("#issue_desc").val().trim(), // 具体问题描述
            "issueCategoryL1": $("#issue_cate_1 option:selected").val(), // 问题分类1
            "partNo": $("#part_no").val().trim(), // 零件号
            "partName": $("#part_name").val(), // 零件名称
            "vendorCode": suppCode, // 供应商代码
            "vendorName": $("#supplier_name").val(), // 供应商名称
            "esn": $("#esn").val().trim(),
            "so": $("#so").val(),
            "projectNo": $("#project_no").val(), // 项目号
            "engineType": $("#engine_type").val().trim(), // 机型
            "qty": Number($("#fail_num").val().trim()), // 数量
            "attach": att, // 附件
            "processStatus": '${issue.processStatus}',
            "issueCategoryL2Name": $("#issue_comment").val().trim() // 备注
        };
        return data;
    }

    // 保存
    <%--function save() {--%>
    <%--    $.ajax({--%>
    <%--        type: "post",--%>
    <%--        url: "${webPath}/pad/issue/save",--%>
    <%--        contentType: "application/json; charset=utf-8",--%>
    <%--        dataType: "json",--%>
    <%--        data: JSON.stringify(getData()),--%>
    <%--        success: function (msg) {--%>
    <%--            if (msg != null && msg != "") {--%>
    <%--                alert(msg.msg);--%>
    <%--            }--%>
    <%--        }--%>
    <%--    });--%>
    <%--}--%>
</script>
</body>
</html>
