var jobone = {};
jobone.property = {
	version:"v1.0",
	name:"jobone",
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
jobone.gridInit = {
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
jobone.url=ctx+"/bims/job/";
jobone.requestUrl = {
		queryList:jobone.url+"getList"
};

jobone.status = [
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

jobone.filed =[
	{
		"data": null,//序号
	},
	{
		"data": "plantname",//工厂
	},
	{
		"data": "number",	//编号
		"createdCell": function (nTd, sData, oData, iRow, iCol) {

		}
	},
	{
		"data": "issueDesc",	//描述
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			if (oData.issueDesc != null) {
				var issueDesc = oData.issueDesc.substring(0, 5) + "…";
				var html = '<span class="text-muted" data-toggle=tooltip" data-placement="bottom" title='+oData.issueDesc+'>'+issueDesc+'</span>';
				$(nTd).html(html);
			}
		}
	},
	{
		"data": "inputPresonName",	//录入人
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
		}
	},
	{
		"data": "inputTime",	//录入时间
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
		}
	},
	{
		"data": "processPersonAccount"	//责任人工号
	},
	{
		"data": "processPersonName"	//责任人
	},
	{
		"data": "isClaim",	//评审结论
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			var type="----";
			if(sData == '1') {
				type = "<font color=\"#0066cc\">OK</font>";
			}else if(sData == '2'){
				type = "<font color=\"#009900\">NOK</font>";
			}else {
				type = "<font color=\"#009900\">NOK</font>";
			}
			$(nTd).html(type);
		}
	},



	{
		"data": "closeTime",	//关闭时间
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			if(sData == null) {
				var html = '---/---';
				$(nTd).html(html);
			}
		}
	},
	{
		"data": "issueCategoryL1Name", // 是否批量
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			var html = '----';
			if(sData == "1"){
				html = '是';
			}
			if(sData == "2"){
				html = '否';
			}
			$(nTd).html(html);
		}
	},
	{
		"data": "processStatus",	//处理状态
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			var type="----";
			if(sData == '1') {
				type = "<font color=\"#0066cc\">待处理</font>";
			}
			if(sData != '7' && sData != '1'){
				type = "<font color=\"#009900\">处理中</font>";
			}
			if(sData == '7'){
				type = "关闭";
			}
			$(nTd).html(type);
		}
	},
	{
		"data": "id",
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			var html ="";
			if(oData.inputPersonAccount == account){
				if (oData.processStatus == "1") {
					html +=	'<a href="#" onclick="toToleader('+sData+')" data-target=".this-true"><i class="fa fa-edit"></i> 查看</a></h4>';
					$(nTd).html(html);
				}else if (oData.processStatus == "3") {
					html +=	'<a href="#" onclick="toToleader('+sData+')" data-target=".this-true"><i class="fa fa-edit"></i> 查看</a></h4>';
					$(nTd).html(html);
				}else {
					html +=	'<a href="#" onclick="toHandlerView('+sData+')" data-target=".this-true"><i class="fa fa-edit"></i> 查看</a></h4>';
					$(nTd).html(html);
				}

			}else if(oData.processPersonAccount == account){
				if (oData.processStatus == "1") {
					html +=	'<a href="#" onclick="toHandler('+sData+')" data-target=".this-true"><i class="fa fa-edit"></i> 查看</a></h4>';
					$(nTd).html(html);
				}else if (oData.processStatus == "3") {
					html += '<a href="#" onclick="toHandlerView('+sData+')" data-target=".this-true"><i class="fa fa-edit"></i> 查看</a></h4>';
					$(nTd).html(html);
				}else {
					html +=	'<a href="#" onclick="toHandlerView('+sData+')" data-target=".this-true"><i class="fa fa-edit"></i> 查看</a></h4>';
					$(nTd).html(html);
				}

			}else {
				html +=	'<a href="#" onclick="toHandlerView('+sData+')" data-target=".this-true"><i class="fa fa-edit"></i> 查看</a></h4>';
				$(nTd).html(html);
			}
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
					"qualityType": "J",
					"issueCategoryL1Name": $("#issueCategoryL1Name option:selected").val(),
					"plant": $("#plant option:selected").val(), // 工厂
					"area" : $("#area option:selected").val(), // 区域
					"isClaim": $("#isClaim option:selected").val(), // 评审结论
					"processStatus" : $("#processStatus option:selected").val(), // 处理状态
					"processPersonName" : $("#processPersonName").val().trim(), // 处理人
					"number": $("#number").val().trim(), // 问题编码
					"content": $("#content").val().trim(), // 问题描述
					"startTime" : $("#startDate").val(), // 开始时间
					"endTime": $("#endDate").val(), // 结束时间
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

			$("#reset").click(function(){
				perReload();
			});

			$("#search").click(function () {
				search();
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



//删除信息
function del(id){
	layer.confirm('确定删除吗', {icon: 3, title:'提示'}, function(index){
		$.ajax({
			type : "POST",
			dataType : "json",
			url : ctx+'/bims/apucheck/del',
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
		layer.close(index);
	});
}

//责任人处理页面
function toHandler(id){
	window.location.href=ctx+'/bims/job/jobToHandler?id='+id;
}
//责任人查看页面
function toHandlerView(id){
	window.location.href=ctx+'/bims/job/jobToHandlerView?id='+id;
}

//录入人处理页面
function toToleader(id){
	window.location.href=ctx+'/bims/job/jobToleader?id='+id;
}
//录入人查看页面
function toToleaderView(id){
	window.location.href=ctx+'/bims/job/jobToleaderView?id='+id;
}

//刷新页面
//重新加载数据
function perReload(){
	perEloancn.table.grid.ajax.reload();
}


//查看入库单详情
function todetail(id){
	window.location.href=ctx+'/back/page/todetail?id='+id;
}

//查看入库单签收后详情
function toInfo(id){
	window.location.href=ctx+'/back/page/toInfo?id='+id;
}



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