<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/fmt' prefix='fmt'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/functions' prefix='fn'%>
<%-- <%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> --%>
<%@ page isELIgnored="false"%> 
<%@ page trimDirectiveWhitespaces="true" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<c:if test="${pageContext.request.serverPort=='80'}">
<c:set var="basePath" value="http://${pageContext.request.serverName}${path}${path==''?'':'/'}" />
</c:if>
<c:if test="${pageContext.request.serverPort!='80'}">
<c:set var="basePath" value="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${path}${path==''?'':'/'}" />
</c:if>

<%--<c:set var="webPath" value="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${path}${path==''?'':'/'}" />
<c:set var="resPath" value="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${path}${path==''?'':'/'}" />
<c:set var="uploadUrl" value="http://test.cncnews.cn/wup" />
<c:set var="upUrl" value="http://test.cncnews.cn/wup"/>--%>

<c:set var="webPath" value="" />
<c:set var="resPath" value="" />
<c:set var="uploadUrl" value="http://192.168.66.155:8080" />
<c:set var="upUrl" value="http://192.168.66.155:8080"/>

<c:set var="sysName" value="福田康明斯BIMS问题管理系统"/>

