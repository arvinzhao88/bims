<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/fmt' prefix='fmt'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/functions' prefix='fn'%>
<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
<div class="menu_section">
<h3>系统导航</h3>
	<ul id="menuRoot" class="nav side-menu">
		<li id="menuHomeParent"><a><i class="fa fa-home"></i> 系统首页 <span class="fa fa-chevron-down"></span></a>
			<ul id="menuHomeHomeChild" class="nav child_menu">
				<%--<li class="current-page"><a href="${webPath}/view/mytodolist.jsp">我的</a></li>--%>
				<li class="current-page"><a href="${webPath}/back/index">工作台</a></li>
			</ul>
		</li>
		<c:if test="${fn:contains(sessionScope.person.belongRole,8)}">
			<li id="menuUserParent"><a><i class="fa fa-user"></i> 用户管理 <span class="fa fa-chevron-down"></span></a>
				<ul id="menuUserChild" class="nav child_menu">
					<li id="adduser"><a href="${webPath}/permission/jumpAddUser">添加用户</a></li>
					<li id="userList"><a href="${webPath}/permission/jumpQueryUserList">用户列表</a></li>
					<li id="menuPrinter"><a href="${webPath}/printer/toPrinterList">打印机管理</a></li>
				</ul>
			</li>
		</c:if>
		<li id="menuIssusParent"><a><i class="fa fa-wrench"></i> 质量问题 <span class="fa fa-chevron-down"></span></a>
			<ul id="menuIssusChild" class="nav child_menu">
				<c:if test="${fn:contains(sessionScope.person.belongArea,8)}">
				<li  id="menuA"><a href="${webPath}/back/toApu">APU&终检</a></li>
				</c:if>
				<c:if test="${fn:contains(sessionScope.person.belongArea,1)}">
					<li id="menuT"><a href="${webPath}/back/toTzone">T区</a></li>
				</c:if>
				<c:if test="${fn:contains(sessionScope.person.belongArea,2)}">
					<li id="menuMachine"><a href="${webPath}/back/toMachine">机加</a></li>
				</c:if>
				<c:if test="${fn:contains(sessionScope.person.belongArea,3)}">
					<li id="menuJobOne"><a href="${webPath}/back/toJobOne">JOB1</a></li>
				</c:if>
				<c:if test="${fn:contains(sessionScope.person.belongArea,4)}">
					<li id="menuBIS"><a href="${webPath}/back/toBis">BIS</a></li>
				</c:if>
				<c:if test="${fn:contains(sessionScope.person.belongArea,5)}">
					<li id="menuEqa"><a href="${webPath}/back/toEqa">EQA</a></li>
				</c:if>
				<c:if test="${fn:contains(sessionScope.person.belongArea,6)}">
					<li id="menuSQA"><a href="${webPath}/back/toSqa">SQA</a></li>
				</c:if>
				<c:if test="${fn:contains(sessionScope.person.belongArea,7)}">
					<li id="menuAfterSale"><a href="${webPath}/bims/aftersale/toAfterSale">售后</a></li>
				</c:if>
			</ul>
		</li>

		<li id="menu_report_parent"><a><i class="fa fa-clipboard"></i> 系统报表 <span class="fa fa-chevron-down"></span></a>
			<ul id="menu_report_forms" class="nav child_menu">
				<li id="menu_issue_list"><a href="${webPath}/report/issue/list">问题列表</a></li>
			</ul>
		</li>

		<%--<li><a><i class="fa fa-times-circle"></i> 停线问题 <span class="fa fa-chevron-down"></span></a>
			<ul class="nav child_menu">
				<li><a href="t_stop_index.html">停线</a></li>
			</ul>
		</li>

		<li><a><i class="fa fa-pencil-square-o"></i> 审核问题 <span class="fa fa-chevron-down"></span></a>
			<ul class="nav child_menu">
				<li><a href="s_sh_index.html">审核</a></li>
			</ul>
		</li>

		<li><a><i class="fa fa-clipboard"></i> 系统报表 <span class="fa fa-chevron-down"></span></a>
			<ul class="nav child_menu">
				<li><a href="sys_index.html">内容列表</a></li>
			</ul>
		</li>--%>
		<%--<c:forEach var="tree" items="${treeList}" >
			<c:choose>
				<c:when test="${empty tree.childList}">
					<li <c:if test="${tree.liId!=''}">id="${tree.liId}"</c:if>>
						<a  <c:if test="${tree.href!=''}">href="${webPath}${tree.href}"</c:if>>
							<i class="${tree.permission}"></i> ${tree.name} ${tree.parentIds}
						</a>
					</li>
				</c:when>
				<c:otherwise>
					<li <c:if test="${tree.liId!=''}">id="${tree.liId}"</c:if>>
						<a>
							<i class="${tree.permission}"></i> ${tree.name} <span class="fa fa-chevron-down"></span>
						</a>
						<ul class="nav child_menu">
							<c:forEach var="treeChild" items="${tree.childList}" >
								<li <c:if test="${treeChild.liId!=''}">id="${treeChild.liId}"</c:if>>
									<a href="${webPath}${treeChild.href}">${treeChild.name}</a>
								</li>
							</c:forEach>
						</ul>
					</li>
				</c:otherwise>
			</c:choose>
		</c:forEach>--%>
	</ul>
</div>
</div>
</ul>


