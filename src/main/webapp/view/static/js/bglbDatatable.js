var person = {};
person.property = {
		version:"v1.0",
		name:"person",
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
person.gridInit = {
		searching:false,
		lengthChange:true,
		paging: true,
		scrollCollapse:true,
		serverSide : true,//开启服务器模式:启用服务器分页
		search:false,
		processing:true,
		scrollX:"100%",
		scrollXInner:"100%",
		scrollCollapse:true,
		jQueryUI:false,
		autoWidth:true,
		autoSearch:false
};
//路径配置
person.url=ctx+"/back/report/";
person.requestUrl = {
		queryList:person.url+"list"
};

person.status = [
	//第一行不进行排序和搜索
	{
		"searchable": false, 
		"orderable": false, 
		"targets": 0
	},
	{defaultContent: '',targets: ['_all']} //所有列设置默认值为空字符串
	];

person.filed =[
	{
		//"data": "pptPath",
		"data": "pptFileName",
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			//var pptPath = sData;
			//var start = pptPath.lastIndexOf("/");
			//var end = pptPath.lastIndexOf(".");
		    //var html = '<a href="'+ctx+'/back/report/bgxq?reportId='+oData.id+'"  data-target=".this-true">'+pptPath.substring(start+1,end)+'</a></h4>';
			var html = '<a href="'+ctx+'/back/report/bgxq?reportId='+oData.id+'"  data-target=".this-true">'+sData+'</a></h4>';
		$(nTd).html(html);
		}
	}, //PPT	
	{
		"data": "pptTitle",
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
		    var html = '<a href="'+ctx+'/back/report/bgxq?reportId='+oData.id+'"  data-target=".this-true">'+sData+'</a></h4>';    
		$(nTd).html(html);
		}
	}, //标题
	{"data": "pptAuthorName"}, //PPT作者
	{
		"data": "showCreateTime"
	}, //提交时间
	{"data": "sumscore"}, //分数
	{
		"data": "state",
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			 var html;
			if(sData ===0 ){
				html = '<font style="color:#1ABB9C;font-weight:bold">打分中</font>'; 
			}else{
				html = '<font style="color:#939393;font-weight:bold">已完成</font>';
			}
		       
		$(nTd).html(html);
	}}, //状态
	{
		"data": "id",
		"createdCell": function (nTd, sData, oData, iRow, iCol) {
			    var html = '<a href="#" onclick="delPerson('+sData+')" data-target=".this-true"><i class="fa fa-trash"></i> 删除</a></h4>';    
			$(nTd).html(html);
		}
	}  //操作
];


var perEloancn = {};

perEloancn.table={
		grid:"",
		statusTitle:"请选择一条数据！"
};
//dataTables方法封装
function dataTablesInit(elo){
	perEloancn.table.grid = $('#'+elo.property.tableId).DataTable({
		ajax: {
			url: elo.requestUrl.queryList,//请求后台路径
			type: 'POST',
			data: function ( d ) {  
				var searchText = $("#searchText").val(); 
				var orderMethod = $("#orderMethod").val();
				var stepId = $("#stepId").val();
				//添加额外的参数传给服务器  
				d.stepId = stepId;
				d.searchText = encodeURI(encodeURI(searchText));  
				d.orderMethod = orderMethod;  
			},
			dataType: 'json',
			
			error: function(jqXHR, textStatus, errorMsg){
				layer.msg("请求失败");
			}
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
			/*if(elo.gridInit.search){
				$search = $("input[type='search']");
				//隐藏默认的搜索框
				$search.parent().hide();
			}*/

//			$("#reload").click(function(){
//				perReload();
//			});
			
			$(".btnSearch").click(function () {
				search();
			});
			
//			$("#clearSearch").click(function () {
//				clearSearch("form-controlSearch");
//			});

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



//删除成员
function delPerson(id){
	layer.confirm('确定删除吗？', {
		 btn: ['确定','取消'] //按钮
		}, function(){
		$.ajax({
			//几个参数需要注意一下
			type : "POST",
			dataType : "json",
			url : ctx+'/back/report/del',
			data : {
				"id" : id
			},
			success : function(result) {
				layer.msg('删除成功');
				perEloancn.table.grid.columns().draw();
			},
			error : function() {
				layer.msg('删除失败');
			}
		});
		}, function(){
		});
}

//刷新页面
//重新加载数据
function perReload(){
	perEloancn.table.grid.ajax.reload();
}


