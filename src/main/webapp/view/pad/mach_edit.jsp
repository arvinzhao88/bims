<%--
  机加提交问题
  Date: 2019/6/17
  Time: 17:50
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
<div id="main" align="center">
    <div class="mycontent">
        <form id="form_content" class="cmxform" method="post">
            <div class="table" align="center" <c:if
                    test="${not empty issue.processStatus and issue.processStatus != '0' and issue.processStatus != '-1'}"> style="pointer-events: none"</c:if>>
                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">Plant/工厂：</div>
                        <div class="na2">
                            <select id="plant" name="plant" class="select">
                                <%--<option value="">--请选择--</option>--%>
                                <option value="64" <c:if test="${issue.plant == '64' or fn:contains(person.belongArea, '2X')}">selected="selected"</c:if>>F
                                </option>
                                <option value="63" <c:if test="${issue.plant == '63' or fn:contains(person.belongArea, '2F')}">selected="selected"</c:if>>X
                                </option>
                            </select>
                            <input id="plantName" name="plantName" value="" type="hidden"/>
                        </div>
                    </div>

                    <div class="biao_l">
                        <div class="na1">Issue Category L1/质量问题类型l1：</div>
                        <div class="na2">
                            <select id="issue_cate_1" name="issue_cate_1" class="select" onchange="showInput()">
                                <option value="">--请选择--</option>
                                <option value="1"
                                        <c:if test="${issue.issueCategoryL1 == '1'}">selected="selected"</c:if>>自制件
                                </option>
                                <option value="2"
                                        <c:if test="${issue.issueCategoryL1 == '2'}">selected="selected"</c:if>>采购件
                                </option>
                                <option value="3"
                                        <c:if test="${issue.issueCategoryL1 == '3'}">selected="selected"</c:if>>在制发动机
                                </option>
                            </select>
                        </div>
                    </div>
                    <%--<div class="biao_l" id="seriesNo">
                        <div class="na1">S/N/序列号：</div>
                        <div class="na2">
                            <input id="serial_no" name="serial_no"
                                   <c:if test="${not empty issue.seriesNo}">value="${issue.seriesNo}"</c:if>
                                   onblur="getCastSupplierName()" type="text" class="input_scan" placeholder="请扫描/输入" >
                            <div class="scan" onclick="scan('serial_no')"></div>
                        </div>
                    </div>
                    <div class="biao_l" id="batchInfo" style="display: none">
                        <div class="na1">BatchInfo/批次号：</div>
                        <div class="na2">
                            <input id="batch_info" name="batchInfo"
                                   <c:if test="${not empty extend.batchInfo}">value="${extend.batchInfo}"</c:if>
                                   type="text" class="input" placeholder="请输入" >
                        </div>
                    </div>--%>
                </div>


                <div class="biao">
                    <%--<div class="biao_l">
                        <div class="na1">Part Number/零件号：</div>
                        <div class="na2">
                            <input id="part_no" name="part_no"
                                   <c:if test="${not empty issue.partNo}">value="${issue.partNo}"</c:if>
                                   onblur="getPartName()" onkeyup="getPartNo()" type="text" class="input_scan"
                                   placeholder="请扫描/输入" list="part_no_list"/>
                            <datalist id="part_no_list"></datalist>
                            <div class="scan" onclick="scan('part_no')"></div>
                        </div>
                    </div>--%>
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
                                   <c:if test="${not empty issue.partName}">value="${issue.partName}"</c:if> type="text"
                                   class="input" placeholder="零件名称" readonly="readonly"/>
                        </div>
                    </div>
                </div>


                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">Product Type/产品系列：</div>
                        <div class="na2">
                            <input id="product_type" name="product_type"
                                   <c:if test="${not empty extend.productType}">value="${extend.productType}"</c:if>
                                   type="text" class="input" placeholder="请输入"/>
                        </div>
                    </div>
                    <div class="biao_l">
                        <div class="na1">OP/工序号：</div>
                        <div class="na2">
                            <input id="op_no" name="op_no"
                                   <c:if test="${not empty issue.issueStation}">value="${issue.issueStation}"</c:if>
                                   type="text" class="input" placeholder="请输入"/>
                        </div>
                    </div>
                </div>

                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">Failure location/失效位置：</div>
                        <div class="na2">
                            <select id="fail_location" name="fail_location" class="select">
                                <option value="">--请选择--</option>
                            </select>
                        </div>
                    </div>
                    <%--<div class="biao_l">
                        <div class="na1">Issue Category L1/质量问题类型l1：</div>
                        <div class="na2">
                            <select id="issue_cate_1" name="issue_cate_1" class="select" onchange="showInput()">
                                <option value="">--请选择--</option>
                                <option value="1"
                                        <c:if test="${issue.issueCategoryL1 == '1'}">selected="selected"</c:if>>自制件
                                </option>
                                <option value="2"
                                        <c:if test="${issue.issueCategoryL1 == '2'}">selected="selected"</c:if>>采购件
                                </option>
                                <option value="3"
                                        <c:if test="${issue.issueCategoryL1 == '3'}">selected="selected"</c:if>>在制发动机
                                </option>
                            </select>
                        </div>
                    </div>--%>
                    <div class="biao_l" id="seriesNo">
                        <div class="na1">S/N/序列号：</div>
                        <div class="na2">
                            <input id="serial_no" name="serial_no"
                                   <c:if test="${not empty issue.seriesNo}">value="${issue.seriesNo}"</c:if>
                                   onblur="getCastSupplierName()" type="text" class="input_scan" placeholder="请扫描/输入" >
                            <div class="scan" onclick="scan('serial_no')"></div>
                        </div>
                    </div>
                    <div class="biao_l" id="batchInfo" style="display: none">
                        <div class="na1">BatchInfo/批次号：</div>
                        <div class="na2">
                            <input id="batch_info" name="batchInfo"
                                   <c:if test="${not empty extend.batchInfo}">value="${extend.batchInfo}"</c:if>
                                   type="text" class="input" placeholder="请输入" >
                        </div>
                    </div>
                </div>


                <div class="biao">
                    <div class="biao_2">
                        <div class="na1">Issue Description/问题描述：</div>
                        <div class="na2" style="height: auto;">
                            <textarea id="issue_desc" name="issue_desc" rows="2" class="input2" placeholder="请输入"><c:if
                                    test="${not empty issue.issueDesc}">${issue.issueDesc}</c:if></textarea>
                        </div>
                    </div>
                </div>


                <div class="biao" id="s_supplier">
                    <div class="biao_l">
                        <div class="na1" style="font-size:12px; line-height:20px;">Semifinishing Supplier
                            Code/粗加工供应商代码：
                        </div>
                        <div class="na2">
                            <select id="s_supplier_code" name="s_supplier_code" class="select"
                                    onchange="getSemiSupplierName()">
                                <option value="">--请选择--</option>
                            </select>
                        </div>
                    </div>
                    <div class="biao_l">
                        <div class="na1">Semifinishing Supplier/粗加工供应商名称：</div>
                        <div class="na2">
                            <input id="s_supplier_name" name="s_supplier_name"
                                   <c:if test="${not empty extend.semiSupplierName}">value="${extend.semiSupplierName}"</c:if>
                                   type="text" class="input" placeholder="粗加工供应商名称" readonly="readonly"/>
                        </div>
                    </div>
                </div>
                <div class="biao" id="supplier" style="display: none">
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

                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">Casting Supplier/毛坯供应商名称：</div>
                        <div class="na2">
                            <input id="c_supplier_name" name="c_supplier_name"
                                   <c:if test="${not empty extend.castSupplierName}">value="${extend.castSupplierName}"</c:if>
                                   type="text" class="input" placeholder="毛坯供应商名称" readonly="readonly"/>
                        </div>
                    </div>
                    <div class="biao_l">
                        <div class="na1">Casting NO./毛坯号：</div>
                        <div class="na2">
                            <input id="cast_no" name="cast_no"
                                   <c:if test="${not empty extend.castNo}">value="${extend.castNo}"</c:if> type="text"
                                   class="input"
                                   <c:if test="${empty issue.processStatus or issue.processStatus == '0'}">placeholder="请输入"</c:if>/>
                        </div>
                    </div>
                </div>


                <div class="biao">
                    <div class="biao_l">
                        <div class="na1">Failure Qty./数量：</div>
                        <div class="na2">
                            <input id="fail_num" name="fail_num"
                                   <c:if test="${not empty issue.qty}">value="${issue.qty}"</c:if> type="text"
                                   class="input" placeholder="请输入"/>
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
                    <div class="biao_l" style="width:80%">
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
            <div align="center" style="width:100%;display:inline-block;">
                <div onclick="reset()" class="cancel" style="<c:if
                        test="${not empty issue.processStatus and issue.processStatus != '0'}">display: none</c:if>">重置
                </div>
                <!-- 添加 -->
                <c:if test="${empty issue.processStatus}">
                    <div id="btn_add" class="ok" onclick="edit(this)">提交</div>
                </c:if>
                <!-- 修改 -->
                <c:if test="${issue.processStatus == '0'}">
                    <div id="btn_modify" class="ok" onclick="edit(this)">修改</div>
                </c:if>

                <c:if test="${issue.processStatus == '-1'}">
                    <div id="btn_modify1" class="ok" onclick="edit(this)">修改</div>
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
        $("#label_area")[0].innerHTML = "机加";
        $("#label_option")[0].innerHTML = "问题提交";
        $("#div_submit").attr("class", "ppt1_on");
        $("#div_list").attr("onclick", "javascript:location.href='${webPath}/pad/issue/list?temp=m','_self'");

        // 表单数据校验
        $("#form_content").validate({
            rules: {
                plant: "required",
                op_no: {
                    required: true,
                    isNo: true
                },
                fail_location: {
                    required: false,
                },
                part_no: {
                    required: true,
                    isNo: true
                },
                product_type: {
                    required: true,
                    isNo: true
                },
                cast_no: "isNo",
                serial_no: {
                    required: false,
                    isNo: true
                },
                s_supplier_code: "required",
                issue_cate_1: "required",
                fail_num: {
                    required: true,
                    isNum: true
                },
                issue_desc: "required"
            },
            messages: {
                plant: "",
                op_no: {
                    required: "",
                    isNo: ""
                },
                fail_location: "",
                part_no: {
                    required: "",
                    isNo: ""
                },
                product_type: {
                    required: "",
                    isNo: ""
                },
                cast_no: "",
                serial_no: {
                    required: "",
                    isNo: ""
                },
                s_supplier_code: "",
                issue_cate_1: "",
                fail_num: {
                    required: "",
                    isNum: ""
                },
                issue_desc: ""
            }
        });

        // 获取失效位置下拉列表
        var locationList = getSelectList("position", 0);
        if (locationList != null && locationList.length > 0) {
            $("#fail_location").html(getOptionHtml(locationList, "${issue.failureLocation}"));
        }

        // 获取粗加工商列表
        var supplierList = getSelectList("supplier", 127);
        if (supplierList != null && supplierList.length > 0) {
            $("#s_supplier_code").html(getSuppOptionHtml(supplierList, "${extend.semiSupplierCode}"));
        }

        var attachs = "${issue.attach}";
        attach = attachs.split(",");
    });

    /**
     * 零件号模糊查询
     */
    function getPartNo() {
        var partNo = $("#part_no").val().trim();
        if (partNo.length >= 4 && partNo.length < 7) {
            // 零件号模糊查询
            var partNoList = getPartNoList(partNo);
            if (partNoList != null && partNoList.length > 0) {
                $("#part_no_list").html(getDataListHtml(partNoList));
            }
        }
    }

    /**
     * 零件号带出零件名称
     */
    /*function getPartName() {
        var partNo = $("#part_no").val().trim();
        // var partName = getPartNameByNo(partNo);
        var list = getSupplierListByPartNo(partNo);
        if (list != null && list.length > 0) {
            $("#part_name").val(list[0].partName);
        } else {
            $("#part_name").val("");
        }

    }*/

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
     * 获取毛坯供应商名称
     */
    function getCastSupplierName() {
        var serialNo = $("#serial_no").val().trim();
        var name = getSupplierNameByTips(126, serialNo);
        if (name != null && name != "") {
            $("#c_supplier_name").val(name);
        } else {
            $("#c_supplier_name").val("");
        }
    }

    /**
     * 获取粗加工供应商名称
     */
    function getSemiSupplierName() {
        var semiSupplierCode = $("#s_supplier_code option:selected").text();
        var name = getSupplierNameByTips(127, semiSupplierCode);
        if (name != null && name != "") {
            $("#s_supplier_name").val(name);
        } else {
            $("#s_supplier_name").val("");
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
     * @param obj
     */
    function edit(obj) {
        if ($("#form_content").valid()) {
            // 新增
            if (obj.id == "btn_add") {
                var uri = "/pad/issue/add";
            }
            if (obj.id == "btn_modify") {
                var uri = "/pad/issue/modify"
            }
            if (obj.id == "btn_modify1") {
                var uri = "/pad/issue/modify"
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
        var data = {
            "id": "${issue.id}", // id
            "qualityType": "M", // 大区
            "number": "${issue.number}", // 问题编号
            "inputPersonAccount": "${issue.inputPersonAccount}", // 录入人工号
            "plant": $("#plant option:selected").val(), // 工厂
            "plantName": $("#plant option:selected").text(), // 工厂
            "issueStation": $("#op_no").val().trim(), // 工序
            "failureLocation": $("#fail_location option:selected").val(), // 失效位置
            "partNo": $("#part_no").val().trim(), // 零件号
            "partName": $("#part_name").val(), // 零件名称
            "seriesNo": $("#serial_no").val().trim(), // 序列号
            "issueCategoryL1": $("#issue_cate_1 option:selected").val(), // 问题分类1
            "qty": Number($("#fail_num").val().trim()), // 数量
            "issueDesc": $("#issue_desc").val().trim(), // 问题描述
            "engineSeries": $("#product_type").val().trim(), // 产品系列
            "attach": att, // 附件
            "issueExtend": JSON.stringify(getExtendData()), // 扩展表信息
            "processStatus": '${issue.processStatus}',
            "vendorCode": $("#supplier_code option:selected").val(),//供应商代码
            "vendorName": $("#supplier_name").val().trim(),//供应商名称
            "issueCategoryL2Name": $("#issue_comment").val().trim() // 备注
        };
        return data;
    }

    /**
     * 扩展表数据
     */
    function getExtendData() {
        var data = {
            "productType": $("#product_type").val().trim(), // 产品系列
            "castNo": $("#cast_no").val().trim(), // 毛坯号
            "castSupplierName": $("#c_supplier_name").val().trim(), // 毛坯供应商名称
            "semiSupplierCode": $("#s_supplier_code option:selected").val(), // 粗加工供应商代码
            "semiSupplierName": $("#s_supplier_name").val().trim(), // 粗加工供应商名称
            "batchInfo": $("#batch_info").val().trim(), // 批次号
        }
        return data;
    }


    /**
     * 采购件时录入批次号，供应商代码，供应商名称
     */
    $(function showInput() {
        var val = $("#issue_cate_1 option:selected").val();
        switch (val) {
            case '2':
                $('#seriesNo,#s_supplier').hide();
                $('#batchInfo,#supplier').show();
                break;
            default:
                $('#seriesNo,#s_supplier').show();
                $('#batchInfo,#supplier').hide();
                break;
        }
        //显示批次号,供应商
        $("#issue_cate_1").change(function (){
            var val = $("#issue_cate_1 option:selected").val();
            switch (val) {
                case '2':
                    $('#seriesNo,#s_supplier').hide();
                    $('#batchInfo,#supplier').show();
                    break;
                default:
                    $('#seriesNo,#s_supplier').show();
                    $('#batchInfo,#supplier').hide();
                    break;
            }
        })
    })
</script>
</body>
</html>

