<%@ page contentType="text/html;charset=utf-8" language="java"%>
<div class="top_nav">
	<div class="nav_menu">
		<nav>
			<div class="nav toggle" style="padding-top: 0px;text-align: center; margin: 0px 0px;">
				<span class="btn black" style=""><a id="menu_toggle"><i
						class="fa fa-bars"></i></a> <font
					style="font-size: 22px; color: #5A738E; overflow: hidden;">${sysName}</font></span>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li class=""><a class="user-profile dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false">  <img
						src="${resPath}/view/static/images/img1.png" alt="">${person.name}&nbsp;&nbsp;&nbsp;<span
						class=" fa fa-angle-down"></span></a>
					<ul class="dropdown-menu dropdown-usermenu pull-right">
						<!-- <li><a href="javascript:;"><span
								class="badge bg-red pull-right">50%</span><span>设置</span></a></li>
						<li><a href="javascript:;">帮助</a></li> --> 
						<li><a href="${webPath}/back/logout"><i
								class="fa fa-sign-out pull-right"></i> 退出</a></li>
						<li><a data-toggle="modal"
							data-target=".this-updPwd"><i
								class="fa fa-edit pull-right"></i> 修改密码</a></li>
					</ul></li>

				<li role="presentation" class="dropdown"><a href="javascript:;"
					class="dropdown-toggle info-number" data-toggle="dropdown"
					aria-expanded="false"><%--<i class="fa fa-envelope-o"></i>--%><!-- <span
						class="badge bg-green">6</span> --> </a>
					<ul id="menu1" class="dropdown-menu list-unstyled msg_list"
						role="menu">
						<%-- <li><a><span class="image"><img
									src="/view/static/static/back/images/img.jpg" alt="Profile Image" /></span>
								<span><span>李斌</span><span class="time">3 分钟前</span></span> <span
								class="message">这里是她要显示的内容....</span></a></li>
						<li>
							<div class="text-center">
								<a><strong>查看更多</strong> <i class="fa fa-angle-right"></i></a>
							</div>
						</li> --%>
					</ul></li>
			</ul>
		</nav>

	</div>
</div>

<div class="modal fade this-updPwd" tabindex="-1" role="dialog" aria-hidden="true" >
	<div class="modal-dialog modal-lg" style="width:400px;padding-top:200px;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><i class="fa fa-close"></i></button>
				<h4 class="modal-title" id="myModalLabel">密码修改</h4>
			</div>
			<div class="modal-body">
				<label>新密码：</label>
				<input id="password" type="text" class="form-control" placeholder="密码的格式为6-12位,只能是字母、数字和下划线" required/>
				<%--<input id="account" type="hidden" class="form-control" value="${person.account}" placeholder="" required/>--%>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-primary antoclose2" data-dismiss="modal" onclick="updPwd()">保存</button>
				<button type="button" class="btn btn-default antoclose2" data-dismiss="modal">取消</button>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	function updPwd() {
		var account = "${person.account}";
		var password = $('#password').val();
		var reg = /^[A-Za-z0-9]{6,16}$/;
		var flagnewPwd = reg.test(password);
		if(flagnewPwd == false){
			layer.msg("密码必须由 6-16位字母、数字组成");
			return;
		}
		if (password == null || password == ""){
			layer.msg("请输入新密码!");
			return;
		}
		$.ajax({
			type : "POST",
			async: false,
			url : "${webPath}/back/updPwd",
			dataType : "json",
			data :{
				account: account,
				password: password,
			},
			success : function(data) {
				if(data.success){
					layer.msg("密码修改成功!请重新登录");
					setTimeout(function(){ window.location.href ="${webPath}/back/login"; }, 1000);
				}else{
					alert(data.msg);
				}
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
			}
		});
	}
</script>