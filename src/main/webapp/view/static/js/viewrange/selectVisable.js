/**
 * v 0.3(生产用)
 * time: 2016-8-23
 * 新增:
 *   1、标签功能(ajax方法在927行);
 * 修复:
 *   1、删除键删除内容时弹框内联动问题;
 *   2、部门人员单独设置单选多选时不生效的bug;
 */
// 自引所需资源(css || js)
;(function () {
	var resources = ['css/viewrange_new.css']; // 需要被自动引入的资源css or js, 位置相对于当前文件;
	var jsPath = function () {
		var js = document.scripts;
		var jsName = 'selectVisable.js'; // 主文件name，用于判断路径
		for (var i = 0; i < js.length; i++) {
			var curJs = js[i],
				curJsSrc = curJs.src,
				curJsName = curJsSrc.substring(curJsSrc.lastIndexOf('/') + 1, curJsSrc.length);
			if (curJsName.match(jsName) !== null) {
				return curJsSrc.substring(0, curJsSrc.lastIndexOf('/') + 1);
			}
		}
	}();
	var head = document.getElementsByTagName('head')[0];
	for (var i in resources) {
		var fileType = resources[i].substring(resources[i].lastIndexOf('.') + 1, resources[i].length);
		if (fileType == 'css') {
			var link = document.createElement('link');
			link.rel = 'stylesheet';
			link.href = jsPath + resources[i];
			head.appendChild(link);
		} else if (fileType == 'js') {
			var script = document.createElement("script");
			script.src = jsPath + resources[i];
			document.body.appendChild(script);
		}
	}
})();

// viewrange主体方法
(function ($) {
	var configAll = null; // 全局参
	var defaults = { // 插件默认值
			webUrl: '/',
			tagEnable:true,//是否显示标签
			initialDep:"",
			initialPerson:"",
			initialTag:"",
			selectEn: undefined //
		};
	var hadSelectedDepId = "";
	var hadSelectedPersonId = "";
	var hadSelectedTagId = "";
	
	

	$.fn.viewRange = function (params) {
		return new MyViewRange(this, params);
	};
	
	
	var MyViewRange = function (elememt, params) {
		var vr = this;
		vr.$el = elememt;
		vr.init(params);
	};

	//初始化
	MyViewRange.prototype.init = function (params) {
		var vr = this;		
		vr.el = {};
		vr.opts = $.extend({}, defaults, params);
		configAll = $.extend({}, vr.opts, vr.el);
		hadSelectedDepId = vr.opts.initialDep;
		hadSelectedPersonId = vr.opts.initialPerson;
		hadSelectedTagId = vr.opts.initialTag;
		
		
		
		$more = vr.$el;
		$more.on('click', function () {
		
			viewBoxShow();
		});
		viewBoxInit();
		
		vr.reInitHadSelected = function (selectedDepId,selectedPersonId,selectedTagId) {
			
			
			hadSelectedDepId = selectedDepId;
			hadSelectedPersonId = selectedPersonId;
			hadSelectedTagId = selectedTagId;
			
		};
		
		
	};
	
	

	var $bomBox = '';
	var $maskBox = '';
	function viewBoxInit() {
		$bomBox = $('<div id="viewRangeDiv" class="qui_dialog ww_dialog  ww_dialog_NoWidthLimit multiselect_dialog hidden_checkbox"' +
					'style="display:none">'+
					'<div class="qui_dialog_body ww_dialog_body"'+
					'	style="overflow-y: auto; max-height: 314.8px;">'+
					'	<div class="js_body_wrap">'+
					'		<div class="js_col_wrap">'+
					'			<div class="multiPickerDlg multiPickerDlg_WithSearch">'+
					'				<div class="multiPickerDlg_left js_select">'+
					'					<div class="multiPickerDlg_left_cnt">'+
					'						<div class="multiPickerDlg_search">'+
					'							<span class="ww_searchInput"><span '+
					'								class="ww_commonImg ww_commonImg_Search ww_searchInput_icon" '+
					'								href="javascript:;"></span></span> '+
					'						</div> '+
					'						<div id="searchResult" class="ww_searchResult" '+
					'							style="display: none"></div> '+
					'						<div class="ww_loading js_search_loading" '+
					'							style="display: none"> '+
					'							<span class="ww_loadingIconSmall"></span> <span '+
					'								class="ww_loading_text">正在搜索，请稍候…</span> '+
					'						</div> '+
					'						<div id="typeTabs" class="multiPickerDlg_searchTab"></div> '+
					'						<div id="partyTree" class="multiPickerDlg_left_cnt_list" '+
					'							style="top: 83px"> '+
					'							<div class="ww_loading js_loading" style="display: none"> '+
					'								<span class="ww_loadingIconSmall"></span> <span '+
					'									class="ww_loading_text">正在加载，请稍候…</span> '+
					'							</div> '+
					'							<div class="js_left_col jstree jstree-8 jstree-default" '+
					'								role="tree" aria-multiselectable="true" tabindex="0" '+
					'								aria-activedescendant="1688853806295065" aria-busy="false">		 '+									
					'								<ul id="selctVisableDepartTree" class="ztree sync-tree"></ul> '+
					'							</div> '+
					'						</div> '+
					'						<div id="tagList" class="multiPickerDlg_left_cnt_list" '+
					'							style="top: 83px; display: none"> '+
					'							<div class="ww_loading js_loading_tags" '+
					'								style="display: none;"> '+
					'								<span class="ww_loadingIconSmall"></span> <span '+
					'									class="ww_loading_text">正在加载，请稍候…</span> '+
					'							</div> '+
					'							<div class="member_tag_empty js_tag_empty" '+
					'								style="margin-top: 70px; display: none"> '+
					'								<i class="member_empty_icon"></i> '+
					'								<div class="member_empty_text"> '+
					'									<p style="font-size: 14px">暂无标签</p> '+
					'									<p style="margin: 10px 30px 0; font-size: 12px">你可以按角色设置标签，如财务、行政、出纳，设置后标签内任一成员审批即可</p> '+
					'									<p style="margin: 10px 0 0 0; font-size: 14px"> '+
					'										<a target="_blank" href="/wework_admin/frame#contacts/tag">添加标签</a> '+
					'										<a class="js_tag_refresh" href="javascript:;">刷新数据</a> '+
					'									</p> '+
					'								</div> '+
					'						</div> '+
					'							<div class="js_tag_list" style=""> '+
					'								<div class="member_tag_list_listWrap_title">所有标签</div> '+
					'								<ul id="js_tag_ul" class="member_tag_list"> '+
					'								</ul> '	+											
					'							</div> '+
					'						</div> '+
					'					</div> '+
					'					<div class="multiPickerDlg_left_mask js_left_mask"></div> '+
					'				</div> '+
					'				<div class="multiPickerDlg_right"> '+
					'					<div class="multiPickerDlg_right_title">已选择的部门、成员或标签</div> '+
					'					<div class="multiPickerDlg_right_cnt"> '+
					'						<div class="js_right_col"> '+
					'							<ul id="js_selected"> '+
					'							</ul> '+
					'						</div> '+
					'					</div> '+
					'				</div> '+
					'			</div> '+
					'		</div> '+
					'		<a class="js_multiselect_focus" href="javascript:;"></a> '+
					'	</div> '+
					'</div> '+
					'<div class="qui_dialog_foot ww_dialog_foot"></div> '+
				'</div>');
		
		$head = $('<div class="qui_dialog_head ww_dialog_head" style="cursor: move;"><span class="qui_dialog_title ww_dialog_title">设置应用可见范围</span></div>');
		$close = $('<a class="qui_dialog_close ww_dialog_close ww_commonImg ww_commonImg_CloseDialog" href="javascript:;"></a>');
		
		$searchInput = $('<input type="text" id="memberSearchInput" class="qui_inputText ww_inputText ww_searchInput_text" placeholder="搜索成员、部门或标签">');
		$searchClear = $('<span class="ww_commonImg ww_commonImg_ClearText ww_searchInput_delete" style="display: none" id="clearMemberSearchInput"></span>');
		
		$ok = $('<a class="qui_btn ww_btn ww_btn_Blue js_submit" d_ck="submit" href="javascript:;">确认</a>');
		$cancel = $('<a class="qui_btn ww_btn js_cancel" d_ck="cancel" href="javascript:;">取消</a>');	
		
		
		$tab_dep = $('<a href="javascript:;" class="multiPickerDlg_searchTab_item js_select_tree multiPickerDlg_searchTab_item_current">组织架构</a>');	
		$tab_tag = $('<a href="javascript:;" class="multiPickerDlg_searchTab_item js_select_tag" style="display: none">标签</a>');
		
		//头
		$bomBox.find('.qui_dialog_body').before($head);
		//关闭按钮
		$bomBox.find('.ww_dialog_title').append($close);
		
		//搜索输入框
		
		$bomBox.find('.ww_searchInput').append($searchClear);
		$bomBox.find('.ww_searchInput').append($searchInput);
		//清除搜索
		//两个按钮
		$bomBox.find('.qui_dialog_foot').append($ok);
		$bomBox.find('.qui_dialog_foot').append($cancel);
		
		//选项卡标签
		$bomBox.find('.multiPickerDlg_searchTab').append($tab_dep);
		$bomBox.find('.multiPickerDlg_searchTab').append($tab_tag);
		
		//事件绑定
		$close.on('click', viewBoxHide);
		$cancel.on('click', viewBoxHide);
		$ok.on('click', viewBoxOk);
		$head.on('mousedown', moveBox);		
		$tab_dep.on('click', changeTab);
		$tab_tag.on('click', changeTab);
		
		$searchClear.on('click', clearSearch);	
		$searchInput.on('change', doSearch);		
		$maskBox = $('<div class="qui_mask ww_mask js_dialog_mask" style="z-index: 998; height: 100%; width: 100%;display:none"></div>');
		
		$('body').append($bomBox);
		$('body').append($maskBox);
	}
	
	
	
	
	function initHadSelected(){
		if(hadSelectedDepId!=""||hadSelectedPersonId!=""||hadSelectedTagId!=""){
			$('#js_selected').empty();
			$.ajax({
				//几个参数需要注意一下
				type : "get",
				dataType : "json",
				data: {
					depIds:hadSelectedDepId,
					personIds:hadSelectedPersonId,
					tagIds:hadSelectedTagId
		        },				
				url :configAll.webUrl + "/commonList/initSelected",
				success : function(data) {				
					var obj = data.obj;
					//var deparmentArray = new Array();
					//var personArray = new Array();
					//var tagArray = new Array();
					if (obj != null) {
						for (var i = 0; i < obj.length; i++) {
							
							/*if(obj[i].type=="person"){
								personArray.push(obj[i]);
							}else if(obj[i].type=="department"){
								deparmentArray.push(obj[i]);
							}else if(obj[i].type=="tag"){
								tagArray.push(obj[i]);
							} */
							addSelected(obj[i].type,obj[i].name,obj[i].id);
						}
					}
					//initSearchResult(deparmentArray,personArray,tagArray);
					
				},
				error : function() {
					
				}
			}); 
		}
		
		
	}

	// 隐藏弹框
	function viewBoxHide() {		
		$bomBox.hide();
		$maskBox.hide();
	}
	
	// 隐藏弹框
	function viewBoxOk() {
		
		if (configAll.selectEn) {
			//得到所有选中的数据
			var selectData = [];
			$('#js_selected').find('li').each(function() {
				var dataType = $(this).attr("data-type");
				var dataId = $(this).attr("data-id");
				var dataAccount = "";
				try {
						dataAccount = $(this).attr("data-account");
					}
					catch(err){
					   
					}
				
				var dataName = $(this).attr("title");
				selectData.push({"type":dataType,"id":dataId,"account":dataAccount,"name":dataName});
			});
			
            configAll.selectEn(selectData);
        }
		
		$bomBox.hide();
		$maskBox.hide();
	}
	
	//清除搜索
	function clearSearch(){
		$('#memberSearchInput').val("");
		$('#clearMemberSearchInput').hide();//等待清除搜索结果
		$('#searchResult').empty();
		$('#searchResult').hide();
		$('#typeTabs').show();
		$('#partyTree').show();
		$('#tagList').hide();
	}
	//执行搜索
	function doSearch(){
		$('#typeTabs').hide();
		$('#partyTree').hide();
		$('#tagList').hide();
		$('#searchResult').empty();
		
		$('.js_search_loading').show();
		var searchTxt = $('#memberSearchInput').val();
		if(searchTxt!=""){
			$.ajax({
				//几个参数需要注意一下
				type : "get",
				dataType : "json",
				data: {
					searchTxt:encodeURI(encodeURI(searchTxt))
		        },				
				url :configAll.webUrl+ "/commonList/search",
				success : function(data) {				
					var obj = data.obj;
					var deparmentArray = new Array();
					var personArray = new Array();
					var tagArray = new Array();
					if (obj != null) {
						for (var i = 0; i < obj.length; i++) {
							
							if(obj[i].type=="person"){
								personArray.push(obj[i]);
							}else if(obj[i].type=="department"){
								deparmentArray.push(obj[i]);
							}else if(obj[i].type=="tag"){
								tagArray.push(obj[i]);
							} 
						}
					}
					initSearchResult(deparmentArray,personArray,tagArray);
					
				},
				error : function() {
					
				}
			}); 
		}		
	}
	
	function initSearchResult(deparmentArray,personArray,tagArray){
		$('.js_search_loading').hide();
		if(deparmentArray.length>0){
			var $departmentResult =  $('<div id="search_member_list_title" class="ww_searchResult_title ww_searchResult_title_First">部门</div>');			
			var $ul = $('<ul></ul>');
			for (var i = 0; i < deparmentArray.length; i++) {
				var $departmentResultLi =  $('<li data-type="department" data-id="'+deparmentArray[i].id+'"'+
						' class="js_search_item">'+
						'<span class="ww_icon ww_searchResult_itemCheckbox ww_icon_Checkbox" style="display: none"></span>'+
						'<a href="javascript:;" class="ww_searchResult_itemTxt"><span class="ww_searchResult_title_peopleName">'+deparmentArray[i].name+'</span>'+
						'</a></li>');
				$departmentResultLi.click({paramName:'department-'+deparmentArray[i].name+'-'+deparmentArray[i].id},addSelectedByObject);
				$ul.append($departmentResultLi);
			}
			$('#searchResult').append($departmentResult);
			$('#searchResult').append($ul);
		}
		if(personArray.length>0){
			var $personResult =  $('<div id="search_member_list_title" class="ww_searchResult_title ww_searchResult_title_First">人员</div>');	
			var $ul = $('<ul></ul>');
			for (var i = 0; i < personArray.length; i++) {
				var $personResultLi =  $('<li data-type="person" data-account="'+personArray[i].account+'" data-id="'+personArray[i].id+'"'+
						' class="js_search_item">'+
						'<span class="ww_icon ww_searchResult_itemCheckbox ww_icon_Checkbox" style="display: none"></span>'+
						'<a href="javascript:;" class="ww_searchResult_itemTxt"><span class="ww_searchResult_title_peopleName">'+personArray[i].name+'</span>'+
						'</a></li>');
				$personResultLi.click({paramName:'person-'+personArray[i].name+'-'+personArray[i].id+'-'+personArray[i].account},addSelectedByObject);
				$ul.append($personResultLi);
			}
			
			$('#searchResult').append($personResult);
			$('#searchResult').append($ul);
		}
		if(tagArray.length>0){
			var $tagResult =  $('<div id="search_member_list_title" class="ww_searchResult_title ww_searchResult_title_First">标签</div>');
			var $ul = $('<ul></ul>');
			for (var i = 0; i < tagArray.length; i++) {
				var $tagResultLi =  $('<li data-type="tag" data-id="'+tagArray[i].id+'"'+
						' class="js_search_item">'+
						'<span class="ww_icon ww_searchResult_itemCheckbox ww_icon_Checkbox" style="display: none"></span>'+
						'<a href="javascript:;" class="ww_searchResult_itemTxt"><span class="ww_searchResult_title_peopleName">'+tagArray[i].name+'</span>'+
						'</a></li>');
				$tagResultLi.click({paramName:'tag-'+tagArray[i].name+'-'+tagArray[i].id},addSelectedByObject);
				$ul.append($tagResultLi);
			}
			//加入搜索结果
			$('#searchResult').append($tagResult);
			$('#searchResult').append($ul);
		}
		$('#clearMemberSearchInput').show();//等待清除搜索结果
		
		$('#searchResult').show();
		
	}
	var tabpos = 1;
	function changeTab(){
		if(tabpos==2){
			$('.js_select_tag').removeClass("multiPickerDlg_searchTab_item_current");
			$('.js_select_tree').addClass("multiPickerDlg_searchTab_item_current");
			$('#partyTree').show();
			$('#tagList').hide();
			tabpos = 1; 
		}else{
			$('.js_select_tree').removeClass("multiPickerDlg_searchTab_item_current");
			$('.js_select_tag').addClass("multiPickerDlg_searchTab_item_current");
			$('#partyTree').hide();
			$('#tagList').show();
			tabpos = 2; 
		}
	}

	///根据对象单个移除选中
	function removeSelectedFromObj(selectNode){		
         $(selectNode.target).parents('li').remove();        
	}
	function addSelectedByObject(selectNode){	
		var selectTagValue = selectNode.data.paramName;
		var selectTagValueArray = selectTagValue.split("-");
		if(selectTagValueArray.length==3){
			addSelected(selectTagValueArray[0],selectTagValueArray[1],selectTagValueArray[2]);
		}else{
			addSelected(selectTagValueArray[0],selectTagValueArray[1],selectTagValueArray[2],selectTagValueArray[3]);
		}
		
		//alert(selectTagValue);
	}
	//加入选择的
	function addSelected(type,name,id,account){		
		var isSelected = false;
		$('#js_selected').find('li').each(function() {
			var dataType = $(this).attr("data-type");
			var dataId = $(this).attr("data-id");
			var dataAccount = $(this).attr("data-account");
			
			if(account){
				if((id==dataId ||  account == dataAccount )&& type==dataType){
					$(this).remove();
					isSelected = true;
				}	
			}else{
				if(id==dataId && type==dataType){
					$(this).remove();
					isSelected = true;
				}	
			}
			
			
		});
		if(isSelected){
			return;
		}
		
				
		if(type=="person"){
			var $selectLi =  $('<li class="ww_menuDialog_DualCols_colRight_cnt_item token-input-token js_list_item"'+
					'data-type="'+type+'" data-account="'+account+'" data-id="'+id+'" title="'+name+'">'+
					'<span class="ww_commonImg icon jstree-people-icon"></span><span class="ww_treeMenu_item_text">'+name+'</span></li>');	
		}else if(type=="department"){
			var $selectLi =  $('<li class="ww_menuDialog_DualCols_colRight_cnt_item token-input-token js_list_item"'+
					'data-type="'+type+'" data-id="'+id+'" title="'+name+'">'+
					'<span class="ww_commonImg icon icon_folder_blue"></span><span class="ww_treeMenu_item_text">'+name+'</span></li>');	
		}else if(type=="tag"){
			var $selectLi =  $('<li class="ww_menuDialog_DualCols_colRight_cnt_item token-input-token js_list_item"'+
					'data-type="'+type+'" data-id="'+id+'" title="'+name+'">'+
					'<span class="ww_commonImg icon ww_icon_TagBlue"></span><span class="ww_treeMenu_item_text">'+name+'</span></li>');	
		}		
		$selectLiA = $('<a href="javascript:" class="ww_menuDialog_DualCols_colRight_cnt_item_delete"><span class="ww_commonImg ww_commonImg_DeleteItem js_delete"></span>');
		$selectLi.append($selectLiA);
		$selectLiA.click({paramName:type+'-'+name+'-id'},removeSelectedFromObj);
		$('#js_selected').append($selectLi);
		
	}
	// 弹出弹框
	function viewBoxShow(trans) {
		
		/*if(!configAll.tagEnable){
			$("js_select_tag").hide();
		}*/
		
		//清空搜索结果
		clearSearch();
		//清空已选中结果
		$('#js_selected').empty();
		$maskBox.show();
		$bomBox.show();		
		$("viewRangeDiv").mousedown(function(event){
			moveBox(event);
		});		
		zTreeInit();
		
		initHadSelected();
		changePos();
	}

	//调整窗体剧中
	function changePos(){
		var _scrollHeight = $(document).scrollTop(),//获取当前窗口距离页面顶部高度
	    _windowHeight = $(window).height(),//获取当前窗口高度
	    _windowWidth = $(window).width(),//获取当前窗口宽度
	    _popupHeight = $('#viewRangeDiv').height(),//获取弹出层高度
	    _popupWeight = $('#viewRangeDiv').width();//获取弹出层宽度
	    _posiTop = (_windowHeight - _popupHeight)/2 + _scrollHeight;
	    _posiLeft = (_windowWidth - _popupWeight)/2;
	    $('#viewRangeDiv').css({"left": _posiLeft + "px","top":_posiTop + "px","display":"block","z-index":999});//设置position
	}
	function moveBox(event){
        
    }

	function zTreeInit() {
		var setting = {
			async:{
			            enable: true,
			            url:configAll.webUrl+ "/commonList/listDepartmentToTree",
			            autoParam: ["id=pid"],
			            dataFilter: filter,
						type: 'get'
			    },			    
				view : {
					dblClickExpand: false,
					selectedMulti : false
				},
				check : {
					enable : false
				},
				simpleData: {
					enable: true,
					idKey: "id",
					pIdKey: "pid",
					rootPId: 0
				},
				edit : {
					enable: false	
				},
				callback : {
					onAsyncSuccess: ztreeOnAsyncSuccess,
					onClick: zTreeOnClick,
					
				}
			};
		
		$.fn.zTree.init($("#selctVisableDepartTree"), setting);
		initTagList();
	}
	
	function zTreeOnClick(e, treeId, treeNode) {
		
		if(treeNode.isParent){
			return;
		}
		
		if (treeNode.checked) {			
			removeSelectedFromData(treeNode.nodeType,treeNode.name,treeNode.id);
		} else {		
			addSelected(treeNode.nodeType,treeNode.name,treeNode.id,treeNode.account);
		}
	}
	
	
	function filter(treeId, parentNode, responseData) {
		// deptListAuthorized = responseData.obj.deptListAuthorized;
		// var departList = responseData.obj.departList;
		var departList = responseData.obj;
		if (!departList)
			return null;
		for (var i = 0, l = departList.length; i < l; i++) {
			//departList[i].isParent = !departList[i].isLeaf;
			var name = departList[i].name.replace(/\.n/g, '.');
			departList[i].title = name;
			name = name.length > 8 ? name.substring(0, 8) + '...' : name;
			departList[i].name = name;			
		}
		//$('#dept-loading-icon').remove();
		return departList;
	}
	
	function ztreeOnAsyncSuccess(event, treeId, treeNode, msg) {
		var treeObj = $.fn.zTree.getZTreeObj(treeId);		
		var nodes = treeObj.getNodes();
		treeObj.selectNode(nodes[0]);
		treeObj.expandNode(nodes[0], true, false, false);
	}
	
	
	function initPersonTree(){
			
	}
	
	function initTagList(){
		
		
		if(configAll.tagEnable){
			$('.js_select_tag').show();
			
			$.ajax({
				//几个参数需要注意一下
				type : "get",
				dataType : "json",
				url : configAll.webUrl+ "/commonList/listTag",//url
				success : function(data) {				
					var obj = data.obj;
					if (obj != null) {
						for (var i = 0; i < obj.length; i++) {
							var $li = $('<li class="member_tag_list_item js_tag_item" data-id="'+obj[i].id+'"><i class="ww_icon ww_icon_TagBlue"></i>'+obj[i].name+'<i class="jstree-custom-checked"></i></li>');
							$li.click({paramName:'tag-'+obj[i].name+'-'+obj[i].id},addSelectedByObject);
							$('.member_tag_list').append($li);
							
						}
					
					}
					$('.js_loading_tags').hide();
				},
				error : function() {
					
				}
			}); 
		}
		
		
	}

})(window.jQuery);


/*//选中的部门,员工数据初始化的方法
function initVisiable(contentId, el, fn) {
	if (typeof contentId == 'undefined') {
		$('.reviewrange-btn span').eq(0).click();
		return;
	}
	$.ajax({
		url: ctx + '/app/choose',
		data: {
			content: contentId
		},
		success: function (data) {
			var list = data.obj;
				var $html = $('<ul class="reviewrange-object"></ul>');
				$.each(list, function (i, e) {
					var $li = $('<li><p class="labelvalue">' + e.name + '</p><span class="closeicon"></span></li>');
					$li.data('data', {
						type: e.type,
						id: e.id,
						html: e.name
					});
					$li.find('.closeicon').click(function () {
						$(this).parent().remove();
						//fn(); //personCheck
						console.log("11");
					});
					$html.append($li);
				});
				//console.log($html.children());
				console.log("$(el):"+$(el).attr("id"))
				$(el).append($html.children());
				$(el).closest('.reviewrange-frame').show().prev('.reviewrange-tab').find('li:last').addClass('vcur').siblings().removeClass('vcur');
			;
		}
	})
};


function initCustomVisiable(contentId, el, fn) {
	if (typeof contentId == 'undefined') {
		$('.reviewrange-btn span').eq(0).click();
		return;
	}
	$.ajax({
		url: ctx + '/viewrange/common/person/list',
		data: {			
			content: contentId
		},
		success: function (data) {
			console.log(data);
			var list = data.obj;
			if (list[0].id != '-9') {
				var $html = $('<ul></ul>');
				$.each(list, function (i, e) {
					var $li = $('<li><p class="labelvalue">' + e.name + '</p><span class="closeicon"></span></li>');
					$li.data('data', {
						type: e.type,
						id: e.id,
						html: e.name
					});
					$li.find('.closeicon').click(function () {
						$(this).parent().remove();
						fn(); //personCheck
						console.log("fn()");
					});
					$html.append($li);
				});
				//console.log($html.children());
				$(el).before($html.children());
				$(el).closest('.reviewrange-frame').show().prev('.reviewrange-tab').find('li:last').addClass('vcur').siblings().removeClass('vcur');
			}
			;
		}
	})
};

function getSelectedItem(id) { //'#abc'
	var selected = {
		persons: [],
		departments: [],
		personHtml: [],
		departmentHtml: []
	};
	var index = $('#' + id).find('.reviewrange-tab').find('.vcur').index();
	if (index == 0) {
		selected = {
			persons: [-9],
			departments: [-9],
			personHtml: ['全体成员'],
			departmentHtml: ['全体成员']
		};
	} else {
		$('#' + id + ' .reviewrange-object li').not('.reviewrange-search').each(function () {
			var $this = $(this);
			var data = $this.data('data');
			if (data.type == 'person') {
				selected.persons.push(data.id);
				selected.personHtml.push(data.html);
			} else {
				selected.departments.push(data.id);
				selected.departmentHtml.push(data.html);
			}
		});
	}

	if (selected.persons.length || selected.departments.length)
		return selected;

	layer.msg('未选择可见部门或者人员');
	return null;
}

function checkedAppInfo(el){
	console.log("el:"+$(el))
}*/
