<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/fmt' prefix='fmt'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/functions' prefix='fn'%>
<div id="x_content_issue" class="x_content" style="display:none;">
    <c:choose>
        <c:when test="${issue.qualityType eq 'A'}">
            <div class="page-title">
                <div class="title_left"><h3>A区 问题处理</h3></div>
            </div>
        </c:when>
        <c:when test="${issue.qualityType eq 'T'}">
            <div class="page-title">
                <div class="title_left"><h3>T区 问题处理</h3></div>
            </div>
        </c:when>
        <c:when test="${issue.qualityType eq 'M'}">
            <div class="page-title">
                <div class="title_left"><h3>机加 问题处理</h3></div>
            </div>
        </c:when>
        <c:when test="${issue.qualityType eq 'J'}">
            <div class="page-title">
                <div class="title_left"><h3>JOB1 问题处理</h3></div>
            </div>
        </c:when>
        <c:when test="${issue.qualityType eq 'B'}">
            <div class="page-title">
                <div class="title_left"><h3>BIS 问题处理</h3></div>
            </div>
        </c:when>
        <c:when test="${issue.qualityType eq 'E'}">
            <div class="page-title">
                <div class="title_left"><h3>EQA 问题处理</h3></div>
            </div>
        </c:when>
        <c:when test="${issue.qualityType eq 'S'}">
            <div class="page-title">
                <div class="title_left"><h3>SQA 问题处理</h3></div>
            </div>
        </c:when>
    </c:choose>
</div>
