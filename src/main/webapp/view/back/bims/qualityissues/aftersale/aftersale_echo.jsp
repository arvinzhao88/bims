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
	<link rel="stylesheet" type="text/css" href="${resPath}/view/static/layer/skin/layer.css"/>
	<title>${sysName}</title>
	<%@include file="/view/static/common/global_css.jsp"%>

	<style type="text/css">
		th{
			border-bottom-width: 0px !important;
		}
		th,td{
			text-align: center;
			vertical-align: middle !important;
		}

		.liinfo {
			list-style: none;
			margin-top: 10px;
			margin-right: 30px;
			width: 100%;
		}
		.spaninfo {
			margin-right: 10px;
		}
	</style>

	<script type="text/javascript">
		var ctx='${webPath}';
	</script>
</head>
<body class="nav-md">

<div class="container body">
<div class="main_container">

<div class="col-md-3 left_col">
<div class="left_col scroll-view">

	<%@include file="/view/static/common/sysinfo.jsp"%>

<!-- 侧导航开始 -->
	<%@include file="/view/static/common/siderbar.jsp"%>
<!-- /测导航结束 -->
</div>
</div>

<!-- 顶部开始 -->
	<%@include file="/view/static/common/head.jsp"%>
<!-- 顶部结束 -->

        <!-- 内容区开始 -->
<div class="right_col" role="main">

<div class="page-title">

			<div class="title_left"><h3>售后 提交问题</h3></div><div class="title_right"></div>
            <div class="clearfix"></div>

<div class="row">

<div class="col-md-12 col-sm-12 col-xs-12">
<div class="x_panel">
			<div class="x_title">
			<h2>内容</h2>
				<ul class="nav navbar-right panel_toolbox">
				  <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
				</ul>

			<div class="clearfix"></div>
			</div>

            <div class="x_content">

			<form id="form1" name="form1" method="post">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" style="border-collapse:separate;border-spacing:15px;">
				<input type="hidden" id="qualityType" name="id" required="required" class="form-control" value="${afterSaleIssue.id}">
			<tr>
				<td width="18%" align="right" style="font-weight:bold;text-align:center;">Initiated By 录入人：</td>
				<td width="32%"><input type="text" name="inputPerson"  style="width:100%; height:35px; padding:5px;" readonly="readonly" value="${afterSaleIssue.inputPerson}" ></td>
				<td width="18%" align="right" style="font-weight:bold;text-align:center;">Initiated On 录入时间：</td>
				<td width="32%"><input type="text" name="inputTime" style="width:100%; height:35px; padding:5px;"  readonly="readonly" value="<fmt:formatDate value="${afterSaleIssue.inputTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"></td>

			<tr/>

			<%--分割线--%>
			<tr>
				<td colspan="4" align="right" style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
			</tr>
			<tr>
				<td width="18%" align="right" style="font-size: 20px; text-align: left;">General information 车辆信息</td>
			</tr>

			<tr>
			<td width="18%" align="right" style="font-weight:bold;text-align:center;" >Issue Resource 信息来源 <font color='red'>*</font>：</td>
			<td width="32%"><select name="informationSource" id="findSite" style="width:100%; height:35px;padding:2px;">
				<c:if test="${afterSaleIssue.informationSource==1}">
					<option value="">请选择</option>
					<option value="1" selected="selected">OEM Quality</option>
					<option value="2">CS</option>
					<option value="3">Reliability</option>
					<option value="4">Executive Complaint</option>
					<option value="5">Plant Quality</option>
				</c:if>
				<c:if test="${afterSaleIssue.informationSource==2}">
					<option value="">请选择</option>
					<option value="1" >OEM Quality</option>
					<option value="2" selected="selected">CS</option>
					<option value="3">Reliability</option>
					<option value="4">Executive Complaint</option>
					<option value="5">Plant Quality</option>
				</c:if>
				<c:if test="${afterSaleIssue.informationSource==3}">
					<option value="">请选择</option>
					<option value="1" >OEM Quality</option>
					<option value="2" >CS</option>
					<option value="3" selected="selected">Reliability</option>
					<option value="4">Executive Complaint</option>
					<option value="5">Plant Quality</option>
				</c:if>
				<c:if test="${afterSaleIssue.informationSource==4}">
					<option value="">请选择</option>
					<option value="1" >OEM Quality</option>
					<option value="2" >CS</option>
					<option value="3" >Reliability</option>
					<option value="4" selected="selected">Executive Complaint</option>
					<option value="5">Plant Quality</option>
				</c:if>
				<c:if test="${afterSaleIssue.informationSource==5}">
					<option value="">请选择</option>
					<option value="1" >OEM Quality</option>
					<option value="2" >CS</option>
					<option value="3" >Reliability</option>
					<option value="4" >Executive Complaint</option>
					<option value="5" selected="selected">Plant Quality</option>
				</c:if>
				<c:if test="${ empty afterSaleIssue.informationSource}">
					<option value="">请选择</option>
					<option value="1" >OEM Quality</option>
					<option value="2" >CS</option>
					<option value="3" >Reliability</option>
					<option value="4" >Executive Complaint</option>
					<option value="5" >Plant Quality</option>
				</c:if>

				</select></td>
			<td width="18%"  align="right" style="font-weight:bold;text-align:center;">OEM Name 整车/设备制造商和客户名称 <font color='red'>*</font>：</td>
			<td width="32%"><input type="text" id="oemName" name="vehicleEquipment" style="width:100%; height:35px;padding:5px;" value="${afterSaleIssue.vehicleEquipment}" placeholder="手工输入"></td>
			</tr>
			<tr>
			<td align="right" style="font-weight:bold;text-align:center;">Vehicle VIN 出厂编号 <font color='red'>*</font>：</td>
			<td><input name="vehicleVin" type="text" id="vehicleNo" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.vehicleVin}" placeholder="手工输入"></td>
			<td align="right" style="font-weight:bold;text-align:center;">Engine Series 发动机系列 <font color='red'>*</font>：</td>
			<td><input type="text" id="engineSeries" name="engineSeries" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.engineSeries}" placeholder="手工输入"></td>
			</tr>
			<tr>
			<td align="right" style="font-weight:bold;text-align:center;">Engine Type 发动机型号 <font color='red'>*</font>：</td>
			<td><input name="engineType" type="text" id="engineType" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.engineType}" placeholder="手工输入"></td>
			<td align="right" style="font-weight:bold;text-align:center;">发动机编号ESN <font color='red'>*</font>：</td>
			<td><select name="engineSeriesNo" id="esn" style="width:100%; height:35px;padding:2px;">
				<option selected="selected" >${afterSaleIssue.engineSeriesNo}</option>
				</select></td>
			</tr>
			<tr>
			<td align="right" style="font-weight:bold;">SO Shop Oder <font color='red'>*</font>：</td>
			<td>
				<input id="so" name="shopOrder"value="${afterSaleIssue.shopOrder}"  readonly="readonly" style="width:100%; height:35px;padding:2px;/"></td>
			<td align="right" style="font-weight:bold;text-align:center;">Engine Build Date 发动机生产日期 <font color='red'>*</font>：</td>
			<td><input readonly="readonly"  id="engineBuildDate" name="engineBuildDate" style="width:100%; height:35px; padding:5px;"  value="${afterSaleIssue.engineBuildDate}" placeholder=""></td>
			</tr>
			<tr>
			<td align="right" style="font-weight:bold;text-align:center;">Dealer Name 服务站名称 <font color='red'>*</font>：</td>
			<td><input type="text" id="dealerName" name="dealerName" style="width:100%; height:35px; padding:5px;"  value="${afterSaleIssue.dealerName}" placeholder="请输入"></td>
			<td align="right" style="font-weight:bold;text-align:center;">Phone 服务站联系人及方式：</td>
			<td><input type="text" id="phone" name="dealerContact" style="width:100%; height:35px; padding:5px;"  value="${afterSaleIssue.dealerContact}" placeholder="请输入"></td>
			</tr>
			<tr>
			<td align="right" style="font-weight:bold;text-align:center;">Vehicle Build Date 出厂日期 <font color='red'>*</font>：</td>
			<td><input type="date" id="vehicleBuildDate" name="vehicleBuildDate" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.vehicleBuildDate}" placeholder=""></td>
			<td align="right" style="font-weight:bold;text-align:center;">Vehicle Sale Date 购车日期 <font color='red'>*</font>：</td>
			<td><input type="date" id="vehicleSaleDate" name="vehicleSaleDate" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.vehicleSaleDate}" placeholder=""></td>
			</tr>
			<tr>
			<td align="right" style="font-weight:bold;text-align:center;">Failure Date 故障日期 <font color='red'>*</font>：</td>
			<td><input type="date" id="failureDate" name="failureDate" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.failureDate}" placeholder=""></td>
			<td align="right" style="font-weight:bold;text-align:center;">Mileage 故障里程 <font color='red'>*</font>：</td>
			<td><input type="text" id="mileage" name="failureMileage" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.failureMileage}" placeholder="请输入"></td>
			</tr>
			<tr>
			<td align="right" style="font-weight:bold;text-align:center">Failures 失效数量 <font color='red'>*</font>：</td>
			<td><input type="text" id="qty" name="failureNum" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.failureNum}" placeholder="请输入"></td>
			<td align="right" style="font-weight:bold;text-align:center">Repair Location 失效区域：</td>
			<td><input type="text" id="failureLocation" name="repairLocation" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.repairLocation}" placeholder="请输入"></td>
			</tr>
			<tr>
			<td align="right" style="font-weight:bold;text-align:center">Using Condition 使用工况及环境：</td>
			<td><input type="text" id="usingCondition" name="usingCondition" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.usingCondition}" placeholder="请输入"></td>
			<td align="right"></td>
			<td></td>
			</tr>
			<%--分割线--%>
			<tr>
			<td colspan="4" align="right" style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
			</tr>
			<tr>
				<td width="18%" align="right" style="font-size: 20px; text-align: left;">Customer complaint Information 故障信息</td>
			</tr>

			<tr>
				<td align="right" style="font-weight:bold;text-align:center">Fault description 故障现象 <font color='red'>*</font>：</td>
				<td colspan="3"><textarea name="faultDesc" type="text" id="fieldInspect7" style="width:100%; height:75px; padding:15px;" placeholder="请输入">${afterSaleIssue.faultDesc}</textarea></td>

			</tr>
			<tr>
			<td align="right" style="font-weight:bold;text-align:center">Failure Part 祸首件名称 <font color='red'>*</font>：</td>
			<td><input type="text" id="failureMode" name="faultPart" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.faultPart}" placeholder="请输入"></td>
			<td align="right" style="font-weight:bold;text-align:center">Failure Mode 故障模式 <font color='red'>*</font>：</td>
			<td><input type="text" id="partNo" name="failureMode" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.faultDesc}" placeholder="请输入"></td>
			</tr>
			<tr>
				<td align="right" style="font-weight:bold;text-align:center">Part Number 祸首件图号：</td>
				<td><input type="text" id="failurePart" name="faultPartNo" style="width:100%; height:35px; padding:5px;" value="${afterSaleIssue.faultPartNo}" placeholder="请输入"></td>
			</tr>
			<tr>
			<td colspan="4" align="right" style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
			</tr>

			<tr>
			<td align="right" style="font-weight:bold;text-align:center">Field inspect 现场检查：</td>
			<td colspan="3"><textarea name="fieldInspect" type="text" id="fieldInspect" style="width:100%; height:75px; padding:15px;" value="" placeholder="请输入">${afterSaleIssue.fieldInspect}</textarea></td>
			</tr>
			<tr>
			<td colspan="4" align="right" style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
			</tr>

			<td align="right" style="font-weight:bold;text-align:center">Failure analysis and conclusion<br> 故障分析及结论：</td>
				<td colspan="3"><textarea name="failureAnalysisConclusion" type="text" id="fieldInspect2" style="width:100%; height:75px; padding:15px;" value="" placeholder="请输入">${afterSaleIssue.failureAnalysisConclusion}</textarea></td>

				</tr>
			<tr>
			<td colspan="4" align="right" style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
			</tr>

			<td align="right" style="font-weight:bold;text-align:center"> Customer requirement & Short Term Fix <br>客户需求及短期维修措施：</td>
				<td colspan="3"><textarea name="requireFix" type="text" id="fieldInspect4" style="width:100%; height:75px; padding:15px;" value="" placeholder="请输入">${afterSaleIssue.requireFix}</textarea></td>

				</tr>

			<tr>
			<td colspan="4" align="right" style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
			</tr>

			<tr>
			<td rowspan="2" align="right" style="font-weight:bold;text-align:center">Vehicle&Failure Photo<br>车辆及故障照片：</td>
			<td><input name="failurePhoto" type="text" id="failurePhoto" style="width:100%; height:35px; padding:5px;" value="" placeholder="请输入图片说明"></td>
			<td align="right" style="font-weight:bold;"><i class="fa fa-image"></i> <a href="#">上传图片</a></td>
			<td align="center"><i class="fa fa-plus-circle green"></i> 添加</td>
			</tr>

			<tr>
			<td><input name="text6" type="text" id="text6" style="width:100%; height:35px; padding:5px;" value="" placeholder="请输入图片说明"></td>
			<td align="right" style="font-weight:bold;"><i class="fa fa-image"></i> <a href="#">上传图片</a></td>
			<td align="center"><i class="fa fa-minus-circle red"></i> 删除</td>
			</tr>

			<tr>
				<td colspan="4" align="right" style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
			</tr>
			<tr>
				<td align="right" style="font-weight:bold;text-align:center">Research Report 调查报告(附件)：</td>
				<td><input type="text" id="report" name="report" style="width:100%; height:35px; padding:5px;" value="" placeholder="附件"></td>

			</tr>
			<tr>
				<td colspan="4" align="right" style="border-top: #CCCCCC 1px dashed; height:1px;"></td>
			</tr>
			<tr>
				<td align="right" style="font-weight:bold;text-align:center">Comments 备注：</td>
				<td colspan="3"><textarea name="comments" type="text" id="fieldInspect1" style="width:100%; height:75px; padding:15px;" value="" placeholder="请输入">${afterSaleIssue.comments}</textarea></td>

			</tr>

			</table>
            </form>

			 <div class="ln_solid"></div>
			  <div class="form-group">
				<div style="text-align:center">
                    <button class="btn btn-success" type="button" data-toggle="modal" data-target=".this-save" onclick="savetData()">保存</button>
				   &nbsp; &nbsp; &nbsp;
				  <button class="btn btn-success" type="button" data-toggle="modal" data-target=".this-save" onclick="submitData()">提交</button>
                    &nbsp; &nbsp; &nbsp;
                    <button class="btn btn-success" type="button" data-toggle="modal" data-target=".this-save" onclick="checking()">关闭</button>
				</div>
			  </div>

			</div>


</div>
</div>

</div>
</div>
</div>
        <!-- 内容区结束 -->

        <!-- 页脚开始 -->
	<%@include file="/view/static/common/foot.jsp"%>
        <!-- 页脚结束 -->
</div>
</div>


<%@include file="/view/static/common/core_js.jsp"%>
<script>

	//更新
    function  savetData() {
    	if(${afterSaleIssue.type=='2'}){
			alert("您已提交，请勿重复保存");
			return false;
		}
        console.log($('#form1').serialize());
        $.ajax({
            url: "${resPath}/bims/aftersale/updateAfterSalesData",
            type: "post",
            data: $('#form1').serialize(),
            success: function (data) {
				console.log(data)
				layer.msg("已保存");
				window.location.reload();
            }
        });
    }
	//提交
	//更新
	function  submitData() {
		if(${afterSaleIssue.type=='2'}){
			alert("您已提交，请勿重复提交");
			return false;
		}
		console.log($('#form1').serialize());
		$.ajax({
			url: "${resPath}/bims/aftersale/submitAfterSalesData",
			type: "post",
			data: $('#form1').serialize(),
			success: function (data) {
				console.log(data)
				layer.msg("已保存");
				window.location.href='${webPath}/bims/aftersale/toAfterSale'
			}
		});
	}

    var esn;
    $(function () {
        esn = $("#esn");
        initSelectEsn();
    });

    function initSelectEsn() {
        esn.select2({
            ajax: {
                url: function (params) {
                    return "${webPath}/Esn/fuzzyQueryEsn/"+ params.term;
                },
                dataType: 'json',
                processResults: function (data, params) {
                    var options = new Array();

                    for (var i = 0; i < data.length; i++) {//获取select2个必要的字段，id与text
                        options.push({
                            //取出items中Code赋值给id
                            id : data[i],
                            //取出items中CodeName赋值给text
                            text : data[i],
                        })
                    }
                    return {
                        //返回数据
                        results: options
                    };
                    /*$(data).each(function(i, o) {
                        alert(o);
                        options.push({　
                            id : o[i],         //取出items中Code赋值给id
                            text : o[i]    //取出items中CodeName赋值给text
                        });
                    });
                    return {
                        results: options        //返回数据
                    };*/
                },
                cache: true
            },

            width: '100%',
            allowClear: true,    //选中之后，可手动点击删除
            placeholder: "输入ESN搜索...",
            escapeMarkup: function (markup) { return markup; }, // 让template的html显示效果，否则输出代码
            minimumInputLength: 2,    //搜索框至少要输入的长度，此处设置后需输入才显示结果
            language: "zh-CN",         //中文
            //templateResult: formatTelehoneNumber, // 自定义下拉选项的样式模板
            //templateSelection: formatTelehoneNumberSelection     // 自定义选中选项的样式模板
        });

        esn.on("select2:select", function (evt) {
            //这里是选中触发的事件
            //evt.params.data 是选中项的信息
            var esn = evt.params.data.text;
            $.ajax({
                type: "POST",
                url: "${webPath}/Esn/queryItemNumberByEsn/"+esn,
                data: {},
                dataType: "json",
                success: function (data) {
                    console.log(data)
                    $("#so").val(data.so);
                    $("#engineBuildDate").val(data.productionDate);
                },
                error: function (data) {
                }
            });
        });

        esn.on("select2:unselect", function (evt) {
            //这里是取消选中触发的事件
            //如配置allowClear: true后，触发
        });
    }


</script>
  </body>
</html>
