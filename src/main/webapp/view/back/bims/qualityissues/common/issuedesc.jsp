<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/fmt' prefix='fmt'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/functions' prefix='fn'%>
<div id="x_content" class="x_content" style="display:block;">
    <c:if test="${not empty issue.issueCategoryL3Name and issue.processStatus == '7'}">
        <p style="color: #FF0000;">关闭原因：${issue.issueCategoryL3Name}</p>
    </c:if>
    <c:choose>
        <c:when test="${issue.qualityType eq 'A'}">
            <table width="100%" class="table table-hover table-bordered" id="datatable1">
                <tr>
                    <th  width="10%">问题编号：</th>
                    <td  width="23%">${issue.number}</td>
                    <th width="10%">工厂：</th>
                    <td width="23%">${issueInfo.plantname}</td>
                    <th width="11%">工位：</th>
                    <td width="23%">${issueInfo.issue_station}</td>
                </tr>
                <tr>
                    <th>区域：</th>
                    <td>${issueInfo.areaname}</td>
                    <th>失效位置：</th>
                    <td>${issueInfo.locationname}</td>
                    <th>具体问题描述：</th>
                    <td>${issueInfo.issue_desc}</td>
                </tr>
                <c:if test="${issue.issueCategoryL1 eq '2'}">
                    <tr>
                        <th>零件号/零件名称：</th>
                        <td>${issue.partNo}/${issue.partName}</td>
                        <th>供应商代码</th>
                        <td>${issue.vendorCode}</td>
                        <th>供应商名称</th>
                        <td>${issue.vendorName}</td>
                    </tr>
                </c:if>
                <c:if test="${issue.issueCategoryL1 eq '3'}">
                    <tr>
                        <th>ESN/SO：</th>
                        <td>${issueInfo.esn}/${issueInfo.so}</td>
                        <th>机型：</th>
                        <td>${issueInfo.engine_type}</td>
                        <th>项目号：</th>
                        <td>${issueInfo.project_no}</td>
                    </tr>
                </c:if>
                <tr>
                    <th>质量问题分类Level1：</th>
                    <td>
                        <c:if test="${issue.issueCategoryL1 == '2'}">采购件</c:if>
                        <c:if test="${issue.issueCategoryL1 == '3'}">在制发动机</c:if>
                    </td>
                    <th>质量问题分类Level2：</th>
                    <td>${issueInfo.l2name}</td>
                    <th>质量问题分类Level3：</th>
                    <td>${issueInfo.l3name}</td>
                </tr>
                <tr>
                    <th>数量：</th>
                    <td>${issueInfo.qty}</td>
                    <th>备注：</th>
                    <td>${issue.comments}</td>
                    <th>照片附件：</th>
                    <td colspan="2"><c:if test="${not empty issue.attach}">
                        <c:forEach var="att" items="${fn:split(issue.attach, ',')}">
                            <span  data-toggle="modal" data-target=".this-pic"  onclick="showImg('${uploadUrl}${att}')">
                                <img class="img-preview" style="width: 70px ;height: 70px;" src="${uploadUrl}${att}" alt="${uploadUrl}${att}">
                            </span>
                        </c:forEach>
                    </c:if>
                    </td>
                </tr>
            </table>
        </c:when>
        <c:when test="${issue.qualityType eq 'T'}">
            <table width="100%" class="table table-hover table-bordered" id="datatable2">
                <tr>
                    <th  width="10%">问题编号：</th>
                    <td  width="23%">${issue.number}</td>
                    <th width="10%">工厂：</th>
                    <td width="23%">${issueInfo.plantname}</td>
                    <th width="10%">ESN/SO：</th>
                    <td width="24%">${issue.esn}/${issue.so}</td>
                </tr>
                <tr>
                    <th>机型：</th>
                    <td>${issue.engineType}</td>
                    <th>台架号：</th>
                    <td>${issueExtend.palNo}</td>
                    <th>托盘号：</th>
                    <td>${issueExtend.trayNo}</td>
                </tr>
                <tr>
                    <th>问题类型Level1：</th>
                    <td>${issueInfo.l1name}</td>
                    <th>问题类型Level2：</th>
                    <td>${issueInfo.l2name}</td>
                    <th>问题描述Level3：</th>
                    <td>${issue.issueDesc}</td>
                </tr>
                <tr>
                    <th>备注：</th>
                    <td>${issue.comments}</td>
                    <th>照片附件：</th>
                    <td colspan="4"><c:if test="${not empty issue.attach}">
                        <c:forEach var="att" items="${fn:split(issue.attach, ',')}">
                            <span  data-toggle="modal" data-target=".this-pic"  onclick="showImg('${uploadUrl}${att}')">
                                <img class="img-preview" style="width: 70px ;height: 70px;" src="${uploadUrl}${att}" alt="${uploadUrl}${att}">
                            </span>
                        </c:forEach>
                    </c:if></td>
                </tr>
            </table>
            <table width="100%" class="table table-hover table-bordered" id="datatable3">
                <c:forEach items="${adviceList}" var="advice">
                    <tr>
                        <th width="10%">处理意见：</th>
                        <td width="23%">${advice.resolution}</td>
                        <th width="10%">处理人：</th>
                        <td width="23%">${advice.handlerPersonName}</td>
                        <th width="10%">处理时间：</th>
                        <td width="24%">
                            <fmt:formatDate value="${advice.handlerDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:when test="${issue.qualityType eq 'M'}">
            <table width="100%" class="table table-hover table-bordered" id="datatable4">
                <tr>
                    <th width="10%">问题编号：</th>
                    <td width="23%">${issue.number}</td>
                    <th width="10%">工厂：</th>
                    <td width="23%">${issueInfo.plantname}</td>
                    <th width="11%">工序号：</th>
                    <td width="23%">${issueInfo.issue_station}</td>
                </tr>
                <tr>
                    <th>零件号/零件名称：</th>
                    <td>${issue.partNo}/${issue.partName}</td>
                    <th>毛坯号/毛坯供应商：</th>
                    <td>${issueExtend.castNo}/${issueExtend.castSupplierName}</td>
                    <th>粗加工供应商名称</th>
                    <td>${issueExtend.semiSupplierName}</td>
                </tr>
                <tr>
                    <th>失效位置：</th>
                    <td>${issueInfo.locationname}</td>
                    <th>质量问题分类Level1</th>
                    <td>
                        <c:if test="${issue.issueCategoryL1 == '1'}">自制件</c:if>
                        <c:if test="${issue.issueCategoryL1 == '2'}">采购件</c:if>
                        <c:if test="${issue.issueCategoryL1 == '3'}">在制发动机</c:if>
                    </td>
                    <th>质量问题分类Level2：</th>
                    <td>${issueInfo.l2name}</td>
                </tr>
                <tr>
                    <th>质量问题分类Level3：</th>
                    <td>${issueInfo.l3name}</td>
                    <th>问题描述：</th>
                    <td>${issueInfo.issue_desc}</td>
                    <th>数量：</th>
                    <td>${issueInfo.qty}</td>
                </tr>
                <tr>
                    <th>备注：</th>
                    <td>${issue.comments}</td>
                    <th>照片附件：</th>
                    <td colspan="4">
                        <c:if test="${not empty issueInfo.attach}">
                            <c:forEach var="att" items="${fn:split(issueInfo.attach, ',')}">
                            <span  data-toggle="modal" data-target=".this-pic"  onclick="showImg('${uploadUrl}${att}')">
                                <img class="img-preview" style="width: 70px ;height: 70px;" src="${uploadUrl}${att}" alt="${uploadUrl}${att}">
                            </span>
                            </c:forEach>
                        </c:if>
                    </td>
                </tr>
            </table>
        </c:when>
        <c:when test="${issue.qualityType eq 'J'}">
            <table width="100%" class="table table-hover table-bordered" id="datatable5">
                <tr>
                    <th>厂区：</th>
                    <td>${issueInfo.plantname}</td>
                    <th>问题编号：</th>
                    <td>${issue.number}</td>
                </tr>
                <tr>
                    <th>SO：</th>
                    <td>${issue.so}</td>
                    <th>ESN：</th>
                    <td>${issue.esn}</td>
                </tr>
                <tr>
                    <th>问题描述：</th>
                    <td>${issue.issueDesc}</td>
                    <th><span style="font-weight:bold;">评审人员：</span></th>
                    <td>${issueExtend.reviewersAccount}</td>
                </tr>
                <tr>
                    <th><span style="font-weight:bold;">评审日期：</span></th>
                    <td>${issueExtend.reviewDate}</td>
                    <th><span style="font-weight:bold;">评审结论：</span></th>
                    <c:if test="${'1' eq issue.isClaim}"><td width="24%">OK</td></c:if>
                    <c:if test="${'2' eq issue.isClaim}"><td width="24%">NOK</td></c:if>
                </tr>
            </table>
        </c:when>
        <c:when test="${issue.qualityType eq 'B'}">
            <table width="100%" class="table table-hover table-bordered" id="datatable6">
                <tr>
                    <th width="10%"><strong>类型：</strong></th>
                    <c:if test="${'1' eq issue.issueType}"><td width="24%">OK</td></c:if>
                    <c:if test="${'2' eq issue.issueType}"><td width="24%">OK</td></c:if>
                    <c:if test="${'3' eq issue.issueType}"><td width="24%">OK</td></c:if>
                    <th width="10%"><strong>问题描述：</strong></th>
                    <td width="24%">${issue.issueDesc}</td>
                    <td width="10%"><strong>失效日期：</strong></td>
                    <td width="23%"><fmt:formatDate value="${issue.inputTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                </tr>

                <tr>
                    <th><strong>客户：</strong></th>
                    <td>${issueExtend.customer}</td>
                    <td><strong>主机厂：</strong></td>
                    <td>${issueExtend.oem}</td>
                    <td><strong>机型：</strong></td>
                    <td>${issue.engineType}</td>
                </tr>
                <tr>
                    <th><strong>发动机 SO：</strong></th>
                    <td>${issue.so}</td>
                    <th><strong>发动机 ESN：</strong></th>
                    <td width="23%">${issue.esn}</td>
                    <th width="10%"><strong>数量：</strong></th>
                    <td width="24%">${issue.qty}</td>
                </tr>
                <tr>
                    <th><strong>生产日期：</strong></th>
                    <td>${issueExtend.failureDate}</td>
                    <th><strong>零件号：</strong></th>
                    <td>${issue.partNo}</td>
                    <th><strong>零件名称：</strong></th>
                    <td>${issue.partName}</td>
                </tr>
                <tr>
                    <th><strong>序列号：</strong></th>
                    <td>${issue.seriesNo}</td>
                    <th><strong>供应商代码：</strong></th>
                    <td>${issue.vendorCode}</td>
                    <th><strong>供应商名称：</strong></th>
                    <td>${issue.vendorName}</td>
                </tr>
                <tr>
                    <th><strong>是否索赔：</strong></th>
                    <c:if test="${'1' eq issue.isClaim}"><td width="24%">是</td></c:if>
                    <c:if test="${'2' eq issue.isClaim}"><td width="24%">否</td></c:if>
                    <th><strong>索赔单号：</strong></th>
                    <td>${issueExtend.claimNumber}</td>
                    <th><strong>计入指标：</strong></th>
                    <c:if test="${'1' eq issue.isCountindex}"><td width="24%">是</td></c:if>
                    <c:if test="${'2' eq issue.isCountindex}"><td width="24%">否</td></c:if>
                </tr>
                <tr>
                    <th>厂区：</th>
                    <td>${issueInfo.plantname}</td>
                    <th>问题编号：</th>
                    <td>${issue.number}</td>
                    <th><strong>备注：</strong></th>
                    <td>${issue.comments}</td>
                </tr>

            </table>
        </c:when>
        <c:when test="${issue.qualityType eq 'E'}">
            <table width="100%" class="table table-hover table-bordered" id="datatable6">
                <tr>
                    <th width="10%"><strong>工厂：</strong></th>
                    <td width="24%">${issueInfo.plantname}</td>
                    <th width="10%"><strong>问题描述：</strong></th>
                    <td width="24%">${issue.issueDesc}</td>
                    <td width="10%"><strong>是否计入指标：</strong></td>
                    <c:if test="${'1' eq issue.isCountindex}"><td width="24%">是</td></c:if>
                    <c:if test="${'2' eq issue.isCountindex}"><td width="24%">否</td></c:if>
                </tr>

                <tr>
                    <th><strong>是否搭载：</strong></th>
                    <c:if test="${'1' eq issue.isCarry}"><td width="24%">是</td></c:if>
                    <c:if test="${'2' eq issue.isCarry}"><td width="24%">否</td></c:if>
                    <td><strong>级别：</strong></td>
                    <c:if test="${issueExtend.level eq '1'}"><td width="24%">A</td></c:if>
                    <c:if test="${issueExtend.level eq '2'}"><td width="24%">B</td></c:if>
                    <c:if test="${issueExtend.level eq '3'}"><td width="24%">C</td></c:if>
                    <td><strong>机型：</strong></td>
                    <td>${issue.engineType}</td>
                </tr>
                <tr>
                    <th><strong>发动机 SO：</strong></th>
                    <td>${issue.so}</td>
                    <th><strong>发动机 ESN：</strong></th>
                    <td width="23%">${issue.esn}</td>
                    <th width="10%"><strong>数量：</strong></th>
                    <td width="24%">${issue.qty}</td>
                </tr>
                <tr>
                    <th><strong>扣分：</strong></th>
                    <td>${issueExtend.deduct}</td>
                    <th><strong>零件号：</strong></th>
                    <td>${issue.partNo}</td>
                    <th><strong>零件名称：</strong></th>
                    <td>${issue.partName}</td>
                </tr>
                <tr>
                    <th><strong>供应商代码：</strong></th>
                    <td>${issue.vendorCode}</td>
                    <th><strong>供应商名称：</strong></th>
                    <td>${issue.vendorName}</td>
                    <th><strong>备注：</strong></th>
                    <td>${issue.comments}</td>
                </tr>
                <tr>
                    <th>厂区：</th>
                    <td>${issueInfo.plantname}</td>
                    <th>问题编号：</th>
                    <td>${issue.number}</td>
                    <th>图片附件：</th>
                    <td>
                        <c:if test="${not empty issue.attach}">
                            <c:forEach var="att" items="${fn:split(issue.attach, ',')}">
                            <span  data-toggle="modal" data-target=".this-pic"  onclick="showImg('${uploadUrl}${att}')">
                                <img class="img-preview" style="width: 70px ;height: 70px;" src="${uploadUrl}${att}" alt="${uploadUrl}${att}">
                            </span>
                            </c:forEach>
                        </c:if>
                    </td>
                </tr>
            </table>
        </c:when>
        <c:when test="${issue.qualityType eq 'S'}">
            <table width="100%" class="table table-hover table-bordered" id="datatable7">
                <tr>
                    <th width="10%">厂区：</th>
                    <td width="23%">${issueInfo.plantname}</td>
                    <th width="10%"><strong>PPAP：</strong></th>
                    <td width="23%">${issueExtend.ppap}</td>
                    <th width="10%"><strong>生产线</strong>：</th>
                    <td width="24%">${line.name}</td>
                </tr>
                <tr>
                    <th><strong>项目号</strong>：</th>
                    <td>${issue.projectNo}</td>
                    <th><strong>零件号</strong>：</th>
                    <td>${issue.partNo}</td>
                    <th>零件名称：</th>
                    <td>${issue.partName}</td>
                </tr>
                <tr>
                    <th>供应商代码：</th>
                    <td>${issue.vendorCode}</td>
                    <th><strong>供应商名称</strong>：</th>
                    <td>${issue.vendorName}</td>
                    <th><strong>SQI</strong>：</th>
                    <td>${issueExtend.sqi}</td>
                </tr>
                <tr>
                    <th><strong>失效数量</strong>：</th>
                    <td>${issue.qty}</td>
                    <th>失效比例：</th>
                    <td>${issueExtend.failureRatio}</td>
                    <th>Batch info：</th>
                    <td>${issueExtend.batchInfo}</td>
                </tr>
                <tr>
                    <th>Found site：</th>
                    <c:if test="${issueExtend.foundSite eq '1'}"><td>IQC</td></c:if>
                    <c:if test="${issueExtend.foundSite eq '2'}"><td>On Line</td></c:if>
                    <th>质量追溯码：</th>
                    <td>${issue.seriesNo}</td>
                    <th>Inspector：</th>
                    <td>${issueExtend.inspector}</td>
                </tr>
                <tr>
                    <th>发生频次：</th>
                    <td>${issueExtend.occurRate}</td>
                    <th>探测度：</th>
                    <td>${issueExtend.detection}</td>
                    <th>RPN：</th>
                    <td>${issueExtend.rpn}</td>
                </tr>
                <tr>
                    <th>问题描述：</th>
                    <td>${issue.issueDesc}</td>
                    <th>备注：</th>
                    <td>${issue.comments}</td>
                    <th>严重程度：</th>
                    <td>${issueExtend.severity}</td>
                </tr>
                <tr>
                    <th>厂区：</th>
                    <td>${issueInfo.plantname}</td>
                    <th>问题编号：</th>
                    <td>${issue.number}</td>
                    <th>图片附件：</th>
                    <td>
                        <c:if test="${not empty issue.attach}">
                            <c:forEach var="att" items="${fn:split(issue.attach, ',')}">
                            <span  data-toggle="modal" data-target=".this-pic"  onclick="showImg('${uploadUrl}${att}')">
                                <img class="img-preview" style="width: 70px ;height: 70px;" src="${uploadUrl}${att}" alt="${uploadUrl}${att}">
                            </span>
                            </c:forEach>
                        </c:if>
                    </td>
                </tr>
            </table>
        </c:when>
    </c:choose>
</div>