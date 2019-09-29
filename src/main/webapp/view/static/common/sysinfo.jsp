<%@ page contentType="text/html;charset=utf-8" language="java"%>
<div class="navbar nav_title" style="border: 0;">
    <a href="${webPath}/back/index" class="site_title">&nbsp;<img src="${resPath}/view/static/images/logo1.png" alt="..."  width="33" height="30">&nbsp;
        <img src="${resPath}/view/static/images/logo2.png" alt="..."  width="120" height="30"></a>
</div>
<div class="clearfix"></div>
<!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <%--<img src="${uploadUrl}${sessionScope.person.logo}" alt="..." class="img-circle profile_img">--%>
                <img src="${resPath}/view/static/images/img1.png" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>${sessionScope.person.account}</span>
                <h2> ${sessionScope.person.name}</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->