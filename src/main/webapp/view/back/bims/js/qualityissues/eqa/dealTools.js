// var ctx = this.webPath;
// var ctx = "/";
var i = 1;

/*$(function() {
    var html = "";
    html += ;
    $("#tools").append(html);
    i++;
});*/

var data = [{id:1,text:"car"},{id:2,text:"Scar"},{id:3,text:"7 Step"},{id:4,text:"Notification"},{id:5,text:"PQC"}];
$("body").on('click', '#addDeal', function () {
    //添加减号
    $("#saveBtnTools").html("<button class=\"btn btn-primary\" id=\"saveTools\" type=\"button\" data-toggle=\"modal\"\n" +
        "data-target=\".this-go\">确认\n" +
        "</button>");
    var html = "";

    var isDel = '<a href="javascript:;" class="delBefore">'
        + '<span class="glyphicon glyphicon-minus"></span> 删除<input type="hidden" id="count' + i + '" required="required" class="count" value=' + i + '>'
        + '</a>';
    //判断当前操作人是否是该问题的创建者 如果不是则不可操作其他
    if(nowAccount != dataAccount) {
        isDel = "";
    }
    html += '<tr class="tool" issub="y" id="delMark'+i+'">'
        + '<label class="control-label" for="processTool' + i + '"><td id="toolDutyPerson1' + i + '" align="right" width="10%">选择工具：</td></label>'
        + '<td colspan="2" align="right">'
        + '<input type="hidden" id="count' + i + '" required="required" class="count" value=' + i + '>'
        + '<input name="toolId" type="hidden" id="toolId' + i + '" required="required">'
        + '<input name="carId" type="hidden" id="carId' + i + '" required="required">'
        + '<select id="processTool' + i + '" name="processTool" class="form-control">'  // <!--multiple="multiple"-->
        + '<option value="1">CAR</option>'
        + '<option value="2">SCAR</option>'
        + '<option value="3">7 Step</option>'
        + '<option value="4">Notification</option>'
        + '<option value="5">PQC</option>'
        + '</select></td>'
        + '<label class="control-label" for="toolDutyPerson' + i + '"><td id="toolDutyPerson1' + i + '" align="right">责任人：</td></label>'
        + '<td><select id="toolDutyPerson' + i + '" name="toolDutyPerson" class="form-control">'
        + '</select></td>'
        + '<label class="control-label" for="toolDutyPerson' + i + '"><td id="toolDutyPerson1' + i + '" align="right">审核人：</td></label>'
        + '<td><select id="reviewPerson' + i + '" name="reviewPerson" class="form-control">'
        + '<option value="'+account+'">'+personName+'</option>'
        + '</select></td>'
        + '<td align="right"></td>'
        + '<td id="shanchu' + i + '" align="right">'
        + isDel
        + '</td>'
        + '</tr>';

    $("#tools").append(html);

    /** 选择工具 **/
 /*$('#processTool'+i).select2({
        placeholder: "请选择,可多选",
        language: "zh-CN",
        closeOnSelect:true,
        allowClear: true,
        data:data,
        minimumInputLength : 0,
    });*/

    /** 责任人绑定 **/
    $('#toolDutyPerson'+i).select2({
        placeholder: "--输入姓名--",
        language: "zh-CN",
        minimumInputLength: 1,
        allowClear: true,
        ajax : {
            url : ctx+"/back/person/queryByNameNotSelf",
            dataType: 'json',
            data: function (params) {
                return {
                    userName: params.term, // search term
                };
            },
            processResults: function (data) {
                var options = new Array();
                $(data).each(function(i, o) {
                    options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                        id : o.account,         //取出items中Code赋值给id
                        text : o.name+"<"+o.account+">"    //取出items中CodeName赋值给text
                    });
                });
                return {
                    results: options        //返回数据
                };
            },
            cache : true
        }
    });

    /** 审核人绑定 **/
    $('#reviewPerson'+i).select2({
        placeholder: "--输入姓名--",
        language: "zh-CN",
        minimumInputLength: 1,
        allowClear: true,
        ajax : {
            url : ctx+"/back/person/queryByName",
            dataType: 'json',
            data: function (params) {
                return {
                    userName: params.term, // search term
                };
            },
            processResults: function (data) {
                var options = new Array();
                $(data).each(function(i, o) {
                    options.push({　　　　　　　　　　//获取select2个必要的字段，id与text
                        id : o.account,         //取出items中Code赋值给id
                        text : o.name+"<"+o.account+">"    //取出items中CodeName赋值给text
                    });
                });
                return {
                    results: options        //返回数据
                };
            },
            cache : true
        }
    });

    //notifaction没有责任人和审核人
    $("#processTool"+i).change(function(){
        var type = $(this).val();
        if(type == "4" || type =="5") {
            $(this).parent().parent().find("select:not(:first)").text("无");
            $(this).parent().parent().find("select:not(:first)").val(null);
            $(this).parent().parent().find("select:not(:first)").attr("disabled", true);
        } else {
            $(this).parent().parent().find("select").removeAttr("disabled");
        }
    });
    i++;
})

/** 点击保存时保存 **/
$("body").on('click', '#saveTools', function () {
    var tools = $(".tool");
    var arr = new Array();

    for(var s=0;s<tools.length;s++) {
        var tooltr = tools[s];
        var issub = tools[s].getAttribute("issub");
        if(issub == "n") {
            continue;
        }
        var trNum = tooltr.getAttribute("id");
        trNum = trNum.split("k")[1];
        console.log(trNum);
        var tool = $("#processTool"+trNum).val();   //工具编号
        console.log(tool);
        var toolName = $("#processTool"+tool+" option:checked").text();   //责任人姓名
        var dutyPersonAccount = $("#toolDutyPerson"+trNum).val();   //责任人account
        var dutyPersonName = $("#toolDutyPerson"+trNum+" option:checked").text();   //责任人姓名
        var reviewPersonAccount = $("#reviewPerson"+trNum).val();   //审核人account
        var reviewPersonName = $("#reviewPerson"+trNum+" option:checked").text();   //审核人姓名
        var issueId = $("#issueId").val();  //单据ID
        var issueNo = $("#issueNo").val();  //问题编号
        if(tool == "1" || tool == "2" || tool == "3") {
            if(null == dutyPersonAccount || "" == dutyPersonAccount || undefined == dutyPersonAccount) {
                layer.msg("请选择第"+(s+1)+"行责任人");
                arr = new Array();
                return;
            }
            if(null == reviewPersonAccount || "" == reviewPersonAccount || undefined == reviewPersonAccount) {
                layer.msg("请选择第"+(s+1)+"行审核人");
                arr = new Array();
                return;
            }
        } else {
            dutyPersonAccount = "";
            dutyPersonName = "";
            reviewPersonAccount = "";
            reviewPersonName = "";
        }
        var qualityType = $("#qualityType").val();  //问题发生区域
        var json = {"toolType":tool,"processPersonAccount":dutyPersonAccount,"reviewPersonAccount":reviewPersonAccount,
            "reviewPersonName":reviewPersonName,"processPersonName":dutyPersonName,"issueId":issueId,
            "back1":issueNo,"issueArea":qualityType};   //责任人  所以状态为 1

        arr.push(json);
    }
    $.post(ctx+"/back/dealToolPerson/addToolBatch", {"jsonArr":JSON.stringify(arr)}, function(data) {
        /** 回显为input框 **/
        $(".tool").remove();
        if(data.success) {
            var list = data.obj;
            if(list.length>0) {
                for (var j = 0; j < list.length; j++) {
                    //$("#delMark"+(i-j-1)+"").remove();
                    var name1 = "无";
                    var name2 = "无";
                    if(list[j].processPersonName != null) {
                        name1 = list[j].processPersonName;
                    }
                    if(list[j].reviewPersonName != null && list[j].reviewPersonName != "") {
                        name2 = list[j].reviewPersonName;
                    }
                    var html = '<tr>'
                        + '<label class="control-label" for="processTool' + i + '"><td align="right" width="10%">选择工具：</td></label>'
                        + '<td colspan="2"><input disabled value="'+list[j].toolName+'" class="form-control" />'  // <!--multiple="multiple"-->
                        + '<input type="hidden" id="count' + i + '" required="required" class="count" value=' + i + '>'
                        + '<input name="toolId" type="hidden" id="toolId' + j + '" required="required" value="'+list[j].toolNo+'">'
                        + '<input name="carId" type="hidden" id="carId' + i + '" required="required">'
                        + '</td>'
                        + '<label class="control-label" for="toolDutyPerson' + i + '"><td align="right">责任人：</td></label>'
                        + '<td><input disabled value="'+name1+'" class="form-control" />'
                        + '</td>'
                        + '<label class="control-label" for="toolDutyPerson' + i + '"><td align="right">审核人：</td></label>'
                        + '<td><input disabled value="'+name2+'" class="form-control" />'
                        + '</td>'
                        + '<td></td>'
                        + '<td id="shanchu' + i + '" align="right">'
                        + '<a href="javascript:;" class="delMarkA">'
                        + '<span class="glyphicon glyphicon-minus"></span> 删除<input type="hidden" id="count' + j + '" required="required" class="count" value=' + j + '>'
                        + '</a>'
                        + '</td>'
                        + '</tr>';
                    $("#tools").children().append(html);
                }
            }
            i = 1;
            getToolTabs();
            $("#saveTools").remove();
        }
    });
});
/** 保存后删除事件 */
$("body").on('click', '.delMarkA', function () {
    var num = $(this).find("input").val();
    var toolId = $("#toolId" + num + "").val();
    var this_ = $(this);
    layer.confirm('确定要删除这个工具吗?', {icon: 3, title:'提示'}, function(index){
        //删除处理措施
        $.ajax({
            url: ctx + "/back/dealToolPerson/delTool",
            type: "POST",
            dataType: "json",
            data: {
                toolNo: toolId,
            },
            success: function (res) {
                if (res.success) {
                    //window.location.reload();
                    getToolTabs();
                    $("#myAppendTools").empty();
                    //获取当前点击的元素的父级的父级进行删除
                    this_.parent().parent().remove();
                }
            }
        });
        layer.close(index);
    });
    if ($("#processTool" + num + "").val() == 1) {
        $("#bill_tab_content1").remove(html);
    }
});
/** 保存前删除事件 */
$("body").on('click', '.delBefore', function () {
    //删除处理措施
    //获取当前点击的元素的父级的父级进行删除
    $(this).parent().parent().remove();
    var $tr = $(".tool");
    if($tr.length==0) {
        $("#saveTools").remove();
    }
    i--;
});

getToolTabs();
/** 加载工具标签 **/
function getToolTabs () {
    $.ajax({
        url: ctx+"/back/dealToolPerson/getToolTabs",
        type: "POST",
        dataType: "json",
        data: {
            issueId: $("#issueId").val(),
            issueArea: $("#qualityType").val(),
        },
        success: function (res) {
            var html = "";
            var isuseId = $("#issueId").val();
            if (res.success) {
                var toolList = res.obj;
                for (var i = 0; i < toolList.length; i++) {
                    var toolType = toolList[i].toolType;
                    var toolNo = toolList[i].toolNo;
                    var pathUrl = toolList[i].pathUrl;
                    var toDoStatus = toolList[i].toDoStatus;
                    var redPoint = "";
                    if(toDoStatus == 0) {
                        redPoint = '<div style="width:10px !important;height: 10px !important;background: red;position: absolute; z-index: 999;border-radius: 50%;right:5px;"></div>';
                    }
                    if(i == (toolList.length - 1)) {
                        html += '<li style="position: relative;" role="presentation" class="active">'
                            + redPoint
                            + '<a href="#tab_content'+i+'" onclick="getIframe(\''+toolType+'\',\''+pathUrl+'\',\''+isuseId+'\',\''+toolNo+'\')" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">'+toolList[i].toolName+'</a>'  //onclick="getListByToolType('+toolList[i].processTool+')"
                            + '</li>';

                        continue;
                    }
                    html += '<li style="position: relative;" role="presentation">'
                        + redPoint
                        + '<a href="#tab_content'+i+'" onclick="getIframe(\''+toolType+'\',\''+pathUrl+'\',\''+isuseId+'\',\''+toolNo+'\')" id="home-tabb" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">'+toolList[i].toolName+'</a>'  //onclick="getListByToolType('+toolList[i].processTool+')"
                        + '</li>';
                }
                //判断当前数据是否是登录用户的数据 如果不是的话则隐藏所有的添加删除按钮
                $("#myToolsList").html(html);
                if(toolList.length>0) {
                    getIframe(toolList[toolList.length - 1].toolType, toolList[toolList.length - 1].pathUrl, isuseId, toolList[toolList.length - 1].toolNo);
                }
            }
        }
    })
}

function getIframe(toolType, pathUrl, isuseId, toolNo) {
    if(toolType == 1) {
        pathUrl = pathUrl+"?issueId="+isuseId+"&carId="+toolNo;
        var iframe = "<iframe id='myfrm' src='"+ctx+'/'+pathUrl+"'onload=\"setIframeHeight(this)\" scrolling='auto' frameborder='0' height='300' width='100%'></iframe>";
        $("#myAppendTools").html(iframe);
        //获取日志
        getToolLog(isuseId,toolNo,toolType);
    } else if(toolType == 2) {
        pathUrl = pathUrl+"/"+toolNo+"/"+isuseId;
        var iframe = "<iframe id='myfrm' src='"+ctx+'/'+pathUrl+"'onload=\"setIframeHeight(this)\" scrolling='auto' frameborder='0' height='300' width='100%'></iframe>";
        $("#myAppendTools").html(iframe);
        //获取日志
        getToolLog(isuseId,toolNo,toolType);
    } else if(toolType == 3) {
        pathUrl = pathUrl+"/"+toolNo+"/"+isuseId;
        var iframe = "<iframe id='myfrm' src='"+ctx+'/'+pathUrl+"'onload=\"setIframeHeight(this)\" scrolling='auto' frameborder='0' height='300' width='100%'></iframe>";
        $("#myAppendTools").html(iframe);
        //获取日志
        getToolLog(isuseId,toolNo,toolType);
    } else if(toolType == 4) {
        pathUrl = pathUrl+"?issueId="+isuseId+"&toolId="+toolNo;
        var iframe = "<iframe id='myfrm' src='"+ctx+'/'+pathUrl+"'onload=\"setIframeHeight(this)\" scrolling='auto' frameborder='0' height='300' width='100%'></iframe>";
        $("#myAppendTools").html(iframe);
        //获取日志
        getToolLog(isuseId,toolNo,toolType);
    }else if(toolType == 5) {
        pathUrl = pathUrl+"?issueId="+isuseId+"&toolId="+toolNo;
        var iframe = "<iframe id='myfrm' src='"+ctx+'/'+pathUrl+"'onload=\"setIframeHeight(this)\" scrolling='auto' frameborder='0' height='300' width='100%'></iframe>";
        $("#myAppendTools").html(iframe);
        //获取日志
        getToolLog(isuseId,toolNo,toolType);
    }
}
/** iframe自适应----start **/
function setIframeHeight(iframe) {
    if (iframe) {
        var iframeWin = iframe.contentWindow || iframe.contentDocument.parentWindow;
        /*wdx*/
        if (iframeWin.document.body) {
            iframe.height = iframeWin.document.documentElement.scrollHeight || iframeWin.document.body.scrollHeight;
        }
    }
};
window.onload = function () {
    setIframeHeight(document.getElementById('myfrm'));
};
/** iframe自适应----end **/
//页面初始化时加载负责人等
function loadDutyAnd() {
    $.ajax({
        url: ctx+"/back/dealToolPerson/getTools",
        type: "get",
        dataType: "json",
        data: {
            issueId: $("#issueId").val(),
        },
        success: function (res) {
            var html = "";
            if (res.success) {
                //$("#tools :not(:first-child)").remove();
                var toollist = res.obj;
                for (var i = 0; i < toollist.length; i++) {
                    var name1 = "无";
                    var name2 = "无";
                    if(toollist[i].processPersonName != null && toollist[i].processPersonName != "") {
                        name1 = toollist[i].processPersonName;
                    }
                    if(toollist[i].reviewPersonName != null && toollist[i].reviewPersonName != "") {
                        name2 = toollist[i].reviewPersonName;
                    }
                    var html = "";
                    var isDel = '<a href="javascript:;" class="delInputTool" data-num="' + toollist[i].toolNo + '">'
                        + '<span class="glyphicon glyphicon-minus"></span> 删除'
                        + '</a>';
                    //判断当前操作人是否是该问题的创建者 如果不是则不可操作其他
                    if(nowAccount != dataAccount || processStatus=="7") {
                        isDel = "";
                    }
                    html += '<tr id="delInput">&lt;%&ndash;'
                        + '<td align="right"><span style="width:10%">选择工具：</span></td>'
                        + '<td colspan="2" align="right"><input  name="processTool" disabled value="' + toollist[i].toolName + '" class="form-control"></td>'
                        + '<td align="right">责任人：</td>'
                        + '<td align="right"><input value="' + name1 + '" name="toolDutyPerson" disabled class="form-control"></td>'
                        + '<td align="right">审核人：</td>'
                        + '<td align="right"><input value="' + name2 + '" name="reviewPerson" disabled class="form-control"></td>'
                        + '<td></td>'
                        + '<td align="right">'
                        + isDel
                        + '</td>&ndash;%&gt;'
                        + '</tr>';
                    $("#tools").append(html);
                }
            }
        }
    })
}
$(function(){
    loadDutyAnd();
})

//级联删除工具
/*function delTool(id) {
    $this = $(this);
    layer.confirm('确定要删除这个工具吗?', {icon: 3, title:'提示'}, function(index) {
        $.ajax({
            url: ctx + "back/dealToolPerson/delTool",
            type: "POST",
            dataType: "json",
            data: {
                toolNo: id
            },
            success: function (res) {
                if (res.success) {
                    //loadDutyAnd();
                    //获取当前点击的元素的父级的父级进行删除
                    getToolTabs();
                    $("#myAppendTools").empty();
                    $this.closest('tr').remove();
                }
            }
        });
        layer.close(index);
    });
}*/

/** 保存后删除事件 */
$("body").on('click', '.delInputTool', function () {
    var num = $(this).attr("data-num");
    var this_ = $(this);
    layer.confirm('确定要删除这个工具吗?', {icon: 3, title:'提示'}, function(index) {
        $.ajax({
            url: ctx + "/back/dealToolPerson/delTool",
            type: "POST",
            dataType: "json",
            data: {
                toolNo: num
            },
            success: function (res) {
                if (res.success) {
                    //loadDutyAnd();
                    //获取当前点击的元素的父级的父级进行删除
                    getToolTabs();
                    $("#myAppendTools").empty();
                    this_.closest('tr').remove();
                }
            }
        });
        layer.close(index);
    });
});


//获取工具日志
function getToolLog(isuseId,toolNo,toolType){
    $.ajax({
        url: "${webPath}/toolLog/getLog",
        type: "get",
        dataType: "json",
        data: {
            issueId: isuseId,
            toolId: toolNo,
            type: toolType,
        },
        success: function (res) {
            var html = "";
            if (res.success) {
                var logList = res.obj;
                for (var i = 0; i < logList.length; i++) {
                    html += '<div style="width:100%;line-height:25px;font-size:12px; overflow:hidden;">'
                        + '<div style="width:41%; float:left; text-align:right">' + logList[i].processTime + '</div>'
                        + '<div style="width:8%; float:left; text-align:center"><img src="${resPath}/view/static/images/time.png"></div>'
                        + '<div style="width:51%; float:right"> ' + logList[i].action + '</div>'
                        + '</div>';
                }
            }
            $("#toolLog").html(html);
        }
    })
}
