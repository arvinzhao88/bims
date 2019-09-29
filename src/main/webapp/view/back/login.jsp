<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@include file="/view/static/common/base.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="${resPath}/view/static/images/favicon.ico"
          type="image/ico" />

    <title>${sysName}</title>

    <%@include file="/view/static/common/global_css.jsp"%>
</head>

<body class="login">
<div>
    <a class="hiddenanchor" id="signup"></a>
    <a class="hiddenanchor" id="signin"></a>

    <div class="login_wrapper">
        <div id="inputlogin" class="animate form login_form" style="display:none">
            <section class="login_content">
                <form>
                    <h1>扫 码 登 录</h1>
                    <div>企业微信登录</div>
                    <br>
                    <div><img src="${resPath}/view/static/images/mark.png" width="240" height="240"></div>
                    <br>
                    <div>请使用企业微信扫描二维码登录系统</div>
                    <div class="clearfix"></div>

                    <div class="separator">
                        <div style="padding-left:15px;"><b>
                            <a href="javascript:void(0);" onclick="choicelogintype();"
                               class="to_register">使用帐号登录</a></b></div>
                        <div class="clearfix"></div>
                        <br/>

                        <div>
                            <h1><img src="${resPath}/view/static/images/logo_b.png" width="150" height="30"></h1>
                            <p>©2018 - 2023 All Rights Reserved. www.bfcec.com.cn<br>北京福田康明斯发动机有限公司</p>
                        </div>
                    </div>
                </form>
            </section>
        </div>

        <div id="weixinlogin" class="animate form registration_form1" style="display:block">
            <section class="login_content">
                <form>
                    <h1>问 题 管 理 系 统</h1>
                    <h1 style="line-height:20px;">系 统 登 录</h1>
                    <div>
                        <input id="userName" type="text" class="form-control" placeholder="Username" required=""/>
                    </div>
                    <div>
                        <input id="password" type="password" class="form-control" placeholder="Password" required=""/>
                    </div>
                    <div style="padding-left:15px;"><a class="btn btn-default submit" onClick="doLogin();">登 录</a></div>

                    <%-- <div class="separator">
                      <div style="padding-left:15px;"><img src="/static/media/images/weixin.png" width="20" height="19" align="top"> <b>
                      <a href="javascript:void(0);" onclick="choicelogintype();" class="to_register">企业微信二维码扫描登录</a></b></div>
                      --%>
                    <br/>
                    <div>
                        <h1><img src="${resPath}/view/static/images/logo_b.png" width="150" height="30"></h1>
                        <p>©2019 - 2024 All Rights Reserved. www.bfcec.com.cn<br>北京福田康明斯发动机有限公司</p>
                    </div>
        </div>
        </form>
        </section>


    </div>
</div>
</div>
</body>
<%--<script src="/view/static/vendors/jquery/dist/jquery.min.js"></script>--%>
<%@include file="/view/static/common/core_js.jsp"%>
<script type="text/javascript">


    function doLogin() {
        var userName = $('#userName').val();
        var password = $('#password').val();
        $.ajax({
            type : "get",
            async: false,
            url : "${webPath}/back/dologin?userName="+userName+"&password="+password+"&"+"t="+Math.random() ,
            dataType : "json",
            success : function(data) {
                if(data.success){
                    window.location.href ="${webPath}/back/index";
                }else{
                    alert(data.msg);
                }
            },
            error : function(XMLHttpRequest, textStatus, errorThrown) {
            }
        });
    }
</script>
</html>
