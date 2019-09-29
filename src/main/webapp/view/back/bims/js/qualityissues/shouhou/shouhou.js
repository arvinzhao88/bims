var apucheck = {};
apucheck.property = {
	version:"v1.0",
	name:"apucheck",
	tableId:"example",
	checkAllId:"personCheckAll",
	buttonId:"personButtonId",
	formId:"personForm",
	corporateFormId:"personForm",
	returnStatus:"SUCCESS",
	returnTitle:"操作成功",
	statusTitle:"请选择一条数据！",
	idFailure:"获取id失败",
	prompt:"提示",
	pleaseConfirm:"请确认！",
	wantToDelete:"您确定要删除吗?",
	sexMan:"男",
	sexWoman:"女",
	isTest:"是",
	noTest:"否",
	banned:"禁用",
	enable:"启用"
};
//初始化配置
apucheck.gridInit = {
		searching:false,
		lengthxChange:true,
		paging: true,
		scrollCollapse:true,
		serverSide : true,//开启服务器模式:启用服务器分页
		search:true,
		processing:true,
		scrollX:"100%",
		scrollXInner:"100%",
		scrollCollapse:true,
		jQueryUI:false,
		autoWidth:true,
		autoSearch:false
};
//路径配置
apucheck.url=ctx+"/bims/aftersale/";
apucheck.requestUrl = {
		queryList:apucheck.url+"getList"
};

apucheck.status = [
	//第一行不进行排序和搜索
	{
		"searchable": false, 
		"orderable": false, 
		"targets": 0,
		"render":function(data,type,row,meta) {
            return meta.row + 1 +
            meta.settings._iDisplayStart;
        }
	},
	{defaultContent: '',targets: ['_all']} //所有列设置默认值为空字符串
	];

apucheck.filed =[
	{
		"data": null//序号
	},
	{
		"data": "factory",	//工厂
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			$(nTd).html(sData);
		}
	},
	{
		"data": "number",	//问题编号
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			$(nTd).html(sData);
			/*var name = sData;
			var info = name;
			if(name != null && name.length>20) {
				name = name.substring(0,5)+"......";
			}
			var html = "<p title='"+info+"'>"+name+"</p>";
			$(nTd).html(html);*/
		}

	},
	{
		"data": "faultPart",	//故障件名称{祸首件名称}
		"createdCell": function (nTd, sData, oData, iRow, iCol) {

			/*var html = ''
			if(sData == 1) {
				html = '自制件'
				$(nTd).html(html);
			}
			if(sData == 2) {
				html = '采购件'
				$(nTd).html(html);
			}
			if(sData == 3) {
				html = '在制发动机'
				$(nTd).html(html);
			}*/
		}
	},
	{
		"data": "faultDesc",	//故障件现象
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			var name = sData;
			var info = name;
			if(name != null && name.length>20) {
				name = name.substring(0,5)+"......";
			}
			var html = "<p title='"+info+"'>"+name+"</p>";
			$(nTd).html(html);
			/*var id=sData;
			var html = "";
			$.ajax( {
				type : "POST",
				url : "/bims/apucheck/getDictName",
				data : {id: id},
				dataType:"json",
				success : function(data) {
					if (data.obj!=null){
						html=data.obj.name;
						$(nTd).html(html);
					}else {
						html="-----";
						$(nTd).html(html);
					}

				},
			});*/
		}
	},
	{
		"data": "inputTime",	//录入时间
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			$(nTd).html(sData);
			/*var id=sData;
			var html = "";
			$.ajax( {
				type : "POST",
				url : "/bims/apucheck/getDictName",
				data : {id: id},
				dataType:"json",
				success : function(data) {
					if (data.obj!=null){
						html=data.obj.name;
						$(nTd).html(html);
					}else {
						html="-----";
						$(nTd).html(html);
					}

				},
			});*/
		}
	},
	{
		"data": "closeDate",	//关闭时间
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
		}
	},
	{
		"data": "inputPerson",	//提交人
	},
	{
		"data": "handler",	//处理人
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			/*var html = "";
			if(sData == null) {
				html += '----'
				$(nTd).html(html);
			}else if(sData == 1){
				html += '是'
				$(nTd).html(html);
			}else if(sData == 2){
				html += '否'
				$(nTd).html(html);
			}*/
			/*//var type="";
			if(sData == 6) {
				var html = '<td style="color:#FF9900; font-weight:bold;">待发出</td>';
				//type = "未签收";
				$(nTd).html(html);
			} else if(sData == 3){
				var html = '<td style="color:#FF9900; font-weight:bold;">已签收</td>';
				//type = "已签收";
				$(nTd).html(html);
			}else if(sData == 2){
				var html = '<td style="color:#FF9900; font-weight:bold;">已发出</font></td>';
				//type = "已发出";
				$(nTd).html(html);
			}*/

			//$(nTd).html(type);
		}
	},

	{
		"data": "id",	//处理工具
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			var issueId = sData;
			var html = "";
			$.ajax( {
				type : "POST",
				url : "/dealtool/getTools",
				data : {issueId: issueId},
				dataType:"json",
				success : function(data) {
					if(data.obj.length>0) {
						for (var i = 0; i < data.obj.length; i++) {
							html+=''+data.obj[i].toolDutyPersonName+'/'+data.obj[i].processToolName+'<br>'
						}
						$(nTd).html(html);
					}else{
						html += '---/---';
						$(nTd).html(html);
					}

				},
			});

		}
	},
	//问题状态
	{
		"data": "type",
		"createdCell": function (nTd, sData, oData, iRow, iCol) {

			if(sData == "1") {

				var	html = "保存";
				$(nTd).html(html);
			}else if(sData == "2") {
				var	html2 = "提交";
				$(nTd).html(html2);
			}

		}
	}
	,
	//工具状态
	{
		"data": "toolsType",
		"createdCell": function (nTd, sData, oData, iRow, iCol) {

		}
	},
	{//操作
		"data": "questionType",
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			// $.ajax( {
			// 	type : "POST",
			// 	url : "/bims/aftersale/judgmentDisplay",
			// 	data : {id: sData},
			// 	dataType:"json",
			// 	success : function(data) {
			// 		if(data.obj.type==2){
			// 			var html = '<a href="#" onclick="del('+sData+')" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></h4><br>'+
			// 			 '<a href="#" onclick="toView('+sData+')" data-target=".this-true"><i class="fa fa-trash"></i>查看</a></h4>';
			// 			$(nTd).html(html)
			// 		}
			// 		if(data.obj.type==1){
			// 			var html = '<a href="#" onclick="del('+sData+')" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></h4><br>'+
			// 				'<a href="#" onclick="toEdit('+sData+')" data-target=".this-true"><i class="fa fa-trash"></i>编辑</a></h4>';
			// 			$(nTd).html(html)
			// 		}
			// 	},
			// });
		}

	}

];


var perEloancn = {};
perEloancn.table={
		grid:"",
		statusTitle:"请选择一条数据！"
};
//dataTables方法封装
function dataTablesInit(elo){
	//console.log(elo)
	perEloancn.table.grid = $('#'+elo.property.tableId).DataTable({
		ajax: function (data, callback, settings) {
			console.log(data)
			//ajax请求数据方法
			$.ajax({
				type: "post",
				url: elo.requestUrl.queryList,//请求后台路径
				data: {
					"area" : "A",
					"content" : $("#content").val(),
					"isEqr" : $("#isEqr").val(),//是否EQR
					"processStatus" : $("#status").val(),//处理状态
                    "issueCategoryL1" : $("#issueCategoryL1").val(),//质量分类
					"state" : $("#model").val(),
					"pageSize" : data.length,
					"startIndex" : 1,//开始的记录序号
					"pageNo" : (data.start / data.length)+1//当前页码
				},
				dataType: "json",
				success: function (result) {
				    	console.log(result)
						if (result.data==null) {
							//封装返回数据重要
							var returnData = {};
							//这里直接自行返回了draw计数器,应该由后台返回
							returnData.draw = data.draw;
							//返回数据全部记录
							returnData.recordsTotal = result.recordsTotal;
							//后台不实现过滤功能，每次查询均视作全部结果
							returnData.recordsFiltered = result.recordsTotal;
							//返回的数据列表
							returnData.data = result;
							//调用DataTables提供的callback方法，代表数据已封装完成并传回DataTables进行渲染
							//此时的数据需确保正确无误，异常判断应在执行此回调前自行处理完毕
							callback(returnData);
						}else {
							//封装返回数据重要
							var returnData = {};
							//这里直接自行返回了draw计数器,应该由后台返回
							returnData.draw = data.draw;
							//返回数据全部记录
							returnData.recordsTotal = result.recordsTotal;
							//后台不实现过滤功能，每次查询均视作全部结果
							returnData.recordsFiltered = result.recordsTotal;
							//返回的数据列表
							returnData.data = result.data;
							//调用DataTables提供的callback方法，代表数据已封装完成并传回DataTables进行渲染
							//此时的数据需确保正确无误，异常判断应在执行此回调前自行处理完毕
							callback(returnData);
						}


				},
				error: function(jqXHR, textStatus, errorMsg){
					layer.msg("请求失败");
				}
			});
		},
		"bLengthChange": false,
		"ordering": false, // 禁止排序
		"searching":elo.gridInit.searching,//搜索框，默认是开启
		"lengthChange": elo.gridInit.lengthChange,//是否允许用户改变表格每页显示的记录数，默认是开启
		"paging": elo.gridInit.paging,//是否开启本地分页，默认是开启
		"processing": elo.gridInit.processing,//是否显示中文提示
		"scrollCollapse" : elo.gridInit.scrollCollapse,  //是否开启DataTables的高度自适应，当数据条数不够分页数据条数的时候，插件高度是否随数据条数而改变
		"serverSide": elo.gridInit.serverSide, //开启服务器模式，默认是关闭
		"scrollY": elo.gridInit.scrollY,//设置高
		"scrollX": elo.gridInit.scrollX,//设置宽度
		"scrollXInner": elo.gridInit.scrollXInner,//设置内宽度
		"scrollCollapse": elo.gridInit.scrollCollapse,//设置折叠
		"jQueryUI": elo.gridInit.jQueryUI,//jquery 风格
		"autoWidth" : elo.gridInit.autoWidth, //是否自适应宽度
		"columns":elo.filed,//字段
		"columnDefs":elo.status,//列表状态
		"language": {
			"sProcessing": "处理中...",
			"sLengthMenu": "显示 _MENU_ 项结果",
			"sZeroRecords": "没有匹配结果",
			"sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
			"sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
			"sInfoFiltered": "",
			"sInfoPostFix": "",
			"sSearch": "搜索:",
			"sUrl": "",
			"sEmptyTable": "未搜索到数据",
			"sLoadingRecords": "载入中...",
			"sInfoThousands": ",",
			"oPaginate" : {
	               "sFirst" : "第一页",
	               "sPrevious" : "上一页",
	               "sNext" : "下一页",
	               "sLast" : "最后一页"
	           },
			"oAria": {
				"sSortAscending": ": 以升序排列此列",
				"sSortDescending": ": 以降序排列此列"
			}
		},
		"initComplete":function(){

			$("#reload").click(function(){
				perReload();
			});

			$("#search").click(function () {
                perReload();
			});
			$("#query").click(function () {
				search();
			});
			$("#minSearch").click(function () {
				search();
			});
			$("#clearSearch").click(function () {
				clearSearch("form-controlSearch");
			});

		}
	});
	//错误信息提示
	$.fn.dataTable.ext.errMode = function(s,h,m){
		if(h==1){
			layer.msg("连接服务器失败！");
		}else if(h==7){
			layer.msg("返回数据错误！");
		}
	};
	//回调，如果返回的时候有问题提示信息
	perEloancn.table.grid.on('xhr.dt', function ( e, settings, json, xhr ) {
		if(typeof(json.code)!="undefined"	&&	json.code!="0"){
			layer.msg(json.message);
		}
	} );
	//鼠标经过高亮
	var lastIdx = null;
	perEloancn.table.grid.on( 'mouseover', 'td', function () {
		if(typeof(perEloancn.table.grid.cell(this).index())!="undefined"){
			var colIdx = perEloancn.table.grid.cell(this).index().column;
			if ( colIdx !== lastIdx ) {
				$( perEloancn.table.grid.cells().nodes() ).removeClass( 'highlight' );
				$( perEloancn.table.grid.column( colIdx ).nodes() ).addClass( 'highlight' );
			}
		}
	} );
	perEloancn.table.grid.on( 'mouseleave', function () {
		$(perEloancn.table.grid.cells().nodes()).removeClass( 'highlight' );
	} );
	//自动搜索方法
	$('.form-controlSearch').on('keyup change', function () {
		elo.gridInit.autoSearch = $("#autoSearch").prop("checked");
		if(elo.gridInit.autoSearch){
			filterColumn( $(this).attr('data-column') );
		}
	} );
}

//按钮搜索方法
function search(){
	//搜索的数据一次条件，节省资源
	perEloancn.table.grid.draw();
}
//搜索
function filterColumn(i) {
	perEloancn.table.grid.column(i).search(
			$('#col'+i+'_filter').val()
	).draw();
}
//清理搜索数据
function clearSearch(id){
	$("."+id).each(function(){
		$(this).val("");
	});
	//清空查询条件重新读取数据
	perEloancn.table.grid.columns().search("").draw();
}

//编辑售后信息
function toEdit(id){
	window.location.href=ctx+'/bims/aftersale/jumpToEditTheAfterSalesPage/'+id;
}


//展示售后信息
function toView(id){
	window.location.href=ctx+'/bims/aftersale/jumpToEditTheAfterSalesPage/'+id;
}

//删除信息
function del(id){

	layer.open({
		title: '确定删除吗？',
		shadeClose: true,
		//area: ['400px', '500px'],
		btn: ['确定','取消'],
		btn1: function(index){
			$.ajax({
				type : "POST",
				dataType : "json",
				url :ctx+'/bims/aftersale/deleteAfterSalesData',
				data : {
					id: id
				},
				success : function(result) {
					if(result.success) {
						layer.msg("删除成功");
						window.location.reload();
					} else {
						layer.msg("删除失败");
					}
				},
				error : function() {
					layer.msg('失败');
				}
			});
		},
		btn2: function(index){
		},



	});



	/*layer.open({
		title: '确定删除吗？',
		shadeClose: true,
		btn: ['确定','取消'],
		btn1: function(index){
			$.ajax({
				type : "POST",
				dataType : "json",
				url : ctx+'/bims/aftersale/deleteAfterSalesData',
				data : {
					id: id
				},
				success : function(result) {
					if(result.success) {
						layer.msg(result.msg);
						perEloancn.table.grid.columns().draw();
					} else {
						layer.msg(result.msg);
					}
				},
				error : function() {
					layer.msg('失败');
				}
			});
		},
		btn2: function(index){
		},

	});*/
}

/*
//是EQR就跳转这个页面
function toApuEqrLearder(id){
	window.location.href=ctx+'/bims/apucheck/apuEqrLearder?id='+id;
}

//不是EQR就跳转这个页面
function toApuLearder(id){
	window.location.href=ctx+'/bims/apucheck/apuLearder?id='+id;
}


//更新
function toEdit(id){
	window.location.href=ctx+'/bims/apucheck/apuCorrect?id='+id;
}

//去选择单据页面
function toBill(id){
	window.location.href=ctx+'/bims/apucheck/apuEqr?id='+id;
}

//去选择工具页面
function toTool(id){
	window.location.href=ctx+'/bims/apucheck/apuLearder?id='+id;
}

//去Car第一步填写页面
function toCar(id){
	window.location.href=ctx+'/bims/apucheck/toCarStep1?id='+id;
}



//刷新页面
//重新加载数据
function perReload(){
	perEloancn.table.grid.ajax.reload();
}


//查看详情
function todetail(id){
	window.location.href=ctx+'/bims/apucheck/apuCorrect?id='+id;
}

//查看处理状态详情
function getDealLog(id){
	//获取处理记录
	$.ajax({
		url: ctx+"/dealLog/getLog",
		type: "POST",
		dataType: "json",
		data: {
			issueId: id,
		},
		success: function(res) {
			var html = "";
			if(res.success) {
				var logList = res.obj;
				for(var i = 0; i < logList.length; i++) {
					html+='<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">'
						+'<div style="width:41%; float:left; text-align:right">'+logList[i].processTime+'</div>'
						+'<div style="width:8%; float:left; text-align:center"><img src="/view/static/images/time.png"></div>'
						+'<div style="width:51%; float:right">'+logList[i].processPerson+' '+logList[i].actionName+'</div>'
						+'</div>';
				}
			}
			$("#dealLog").html(html);
		}
	})
}

//查看入库单签收后详情
function toInfo(id){
	window.location.href=ctx+'/back/page/toInfo?id='+id;
}
*/


//设置日期时间控件
function Datetime() {
	$('#datetimepicker1 input').datepicker({
		language: 'zh-CN',//显示中文
		format: 'yyyy-mm-dd',//显示格式
		minView: "month",//设置只显示到月份
		initialDate: new Date(),
		autoclose: true,//选中自动关闭
		//todayBtn: true,//显示今日按钮
		clearBtn: true,//清除按钮
		locale: moment.locale('zh-cn')
	});
	//默认获取当前日期
	/*var today = new Date();
	var nowdate = (today.getFullYear()) + "-" + (today.getMonth() + 1) + "-" + today.getDate();
	//对日期格式进行处理
	var date = new Date(nowdate);
	var mon = date.getMonth() + 1;
	var day = date.getDate();
	var mydate = date.getFullYear() + "-" + (mon < 10 ? "0" + mon : mon) + "-" + (day < 10 ? "0" + day : day);
	document.getElementById("startdate").value = mydate;*/

	/* 日期插件初始化    */
	$('#startDate').datepicker({
		language:  'zh-CN',
		format:'yyyy-mm-dd',
		weekStart: 1, /*以星期一为一星期开始*/
		todayBtn:  1,
		autoclose: 1,
		minView:2, /*精确到天*/
		pickerPosition: "bottom-left"
	}).on("changeDate",function(ev){  //值改变事件
		//选择的日期不能大于第二个日期控件的日期
		if(ev.date){
			$("#endDate").datepicker('setStartDate', new Date(ev.date.valueOf()));
		}else{
			$("#endDate").datepicker('setStartDate',null);
		}
	});
	$('#endDate').datepicker({
		language:  'zh-CN',
		format:'yyyy-mm-dd',
		weekStart: 1, /*以星期一为一星期开始*/
		todayBtn:  1,
		autoclose: 1,
		minView:2, /*精确到天*/
		pickerPosition: "bottom-left"
	}).on("changeDate",function(ev){
		//选择的日期不能小于第一个日期控件的日期
		if(ev.date){
			$("#startDate").datepicker('setEndDate', new Date(ev.date.valueOf()));
		}else{
			$("#startDate").datepicker('setEndDate',new Date());
		}
	});
}
window.onload =function() {
	Datetime();
}