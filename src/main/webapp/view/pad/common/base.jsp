<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/fmt' prefix='fmt' %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/functions' prefix='fn' %>
<%@ page isELIgnored="false" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<c:if test="${pageContext.request.serverPort=='80'}">
    <c:set var="basePath" value="http://${pageContext.request.serverName}${path}${path==''?'':''}"/>
</c:if>
<c:if test="${pageContext.request.serverPort!='80'}">
    <c:set var="basePath" value="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${path}${path==''?'':''}"/>
</c:if>

<%--<c:set var="webPath" value="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${path}${path==''?'':''}"/>
<c:set var="resPath" value="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${path}${path==''?'':''}"/>
<c:set var="filePath" value="http://test.cncnews.cn/wup"/>--%>

<c:set var="webPath" value="/bims"/>
<c:set var="resPath" value="/bims"/>
<c:set var="filePath" value="http://tran.bfcec.com.cn:8080"/>

<c:set var="sysName" value="BIMS 问题管理系统"/>
