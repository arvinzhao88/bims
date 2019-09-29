<%--
  Date: 2019/6/26
  Time: 10:21
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
/**
 * 获取下拉列表数据
 */
function getSelectList(type, pid) {
    var list;
    $.ajax({
        type: "get",
        url: "${webPath}/dict/getSelectList",
        dataType: "json",
        async: false,
        data: {
            "type": type,
            "pid": Number(pid)
        },
        success: function (data) {
            if (data != null && data.success == true) {
                list = data.obj;
            }
        }
    });
    return list;
}

/**
 * select option
 * @param data
 * @param id
 * @param selected
 */
function getOptionHtml(list, selected) {
    var opts = "<option value=''>--请选择--</option>";
    for(var i in list) {
        opts += "<option value=" + list[i].id;
        if (list[i].id == selected) {
            opts += " selected=selected";
        }
        opts += ">" + list[i].name + "</option>";
    }
    return opts;
}

/**
 * 零件号模糊查询
 */
function getPartNoList(partNo) {
    var list;
    $.ajax({
        type: "get",
        url: "${webPath}/Supplier/partNumberlike?partNo=" + partNo,
        dataType: "json",
        async: false,
        success: function (data) {
            console.info(data);
            list = data;
        }
    });
    return list;
    /*var list;
    $.ajax({
        type: "get",
        url: "${webPath}/Components/fuzzyQueryComponents/" + partNo,
        dataType: "json",
        async: false,
        success: function (data) {
            list = data;
        }
    });
    return list;*/
}

/**
 * datalist option
 */
function getDataListHtml(list) {
    var opts = "";
    for (var i in list) {
        opts += "<option value=" + list[i] + "></option>"
    }
    return opts;
}

/**
 * 零件号带出零件名称
 */
function getPartNameByNo(partNo) {
    var data;
    if (partNo != null && partNo != "") {
        $.ajax({
            type: "get",
            url: "${webPath}/Components/getPartNameByPartNumber/" + partNo,
            dataType: "json",
            async: false,
            success: function (result) {
                data = result.partName;
            }
        });
    }
    return data;
}

/**
 * 零件号带出供应商列表
 * 2019年8月6日
 */
function getSupplierListByPartNo(partNo) {
    var list;
    $.ajax({
        type: "get",
        url: "${webPath}/Supplier/getSupplierByPartNo?partNo=" + partNo,
        dataType: "json",
        async: false,
        success: function (result) {
            console.info(result);
            list = result;
        }
    });
    return list;
}

/**
 * 零件号带出供应商列表
 */
function getSuppNoListByPartNo(partNo) {
    var list;
    $.ajax({
        type: "get",
        url: "${webPath}/Components/queryVendorCodeByPartNumber/" + partNo,
        dataType: "json",
        async: false,
        success: function (result) {
            list = result;
        }
    });
    return list;
}

/**
 * 供应商代码带出供应商名称
 */
function getSupplierNameByNo(supplierNo) {
    var data;
    $.ajax({
        type: "get",
        url: "${webPath}/Supplier/getSupplierNameBycode/" + supplierNo,
        dataType: "json",
        async: false,
        success: function (result) {
            data = result.supplierName;
        }
    });
    return data;
}

/**
 * esn带出so，项目号
 */
function getDataByEsn(esn) {
    var data;
    $.ajax({
        type: "get",
        url: "${webPath}/Esn/queryItemNumberByEsn/" + esn,
        dataType: "json",
        async: false,
        success: function (result) {
            data = result;
        }
    });
    return data;
}

/**
 * 粗加工商代码option
 * @param list
 */
function getSuppOptionHtml(list, selected) {
    var opts = "<option value=''>--请选择--</option>";
    for(var i in list) {
        opts += "<option value=" + list[i].id;
        if (list[i].id == selected) {
            opts += " selected=selected";
        }
        opts += ">" + list[i].tips + "</option>";
    }
    return opts;
}

/**
 * 获取供应商名称
 * @param pid
 * @param tips
 * @param id
 */
function getSupplierNameByTips(pid, tips) {
    var data;
    $.ajax({
        type: "get",
        url: "${webPath}/dict/getSupplierNameByTips",
        async: false,
        dataType: "json",
        data: {
            "pid": Number(pid),
            "tips": tips
        },
        success: function (result) {
            data = result.name;
        }
    });
    return data;
}

/**
 * 编辑（添加、修改）
 */
function editIssue(uri, issue) {
   $.ajax({
        type: "post",
        url: "${webPath}" + uri,
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: JSON.stringify(issue),
        success: function (msg) {
            // mui.toast(msg.msg);
            if (msg.success == true) {
                var temp = "${temp}".toLowerCase();
                // 成功返回列表
                location.href="${webPath}/pad/issue/list?temp=" + temp;
            }
        },
        error: function (err) {
            if (uri.endsWith("add")) {
                mui.toast("提交失败");
            }
            if (uri.endsWith("modify")) {
                mui.toast("修改失败");
            }
        }
    });
}

/**
 * 重置
 */
function reset() {
    location.reload();
}

/*upload img begin*/
/**
 * config
 */
wx.config({
    beta: true, // 必须这么写，否则wx.invoke调用形式的jsapi会有问题
    debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
    appId: '${wxJsData.appId}', // 必填，企业微信的corpID
    timestamp: ${wxJsData.timestamp}, // 必填，生成签名的时间戳
    nonceStr: '${wxJsData.nonceStr}', // 必填，生成签名的随机串
    signature: '${wxJsData.signature}',// 必填，签名，见 附录-JS-SDK使用权限签名算法
    jsApiList: ['chooseImage', 'uploadImage', 'scanQRCode', 'hideOptionMenu', 'checkJsApi', 'scanQRCode'] // 必填，需要使用的JS接口列表，凡是要调用的接口都需要传进来
});

/**
 * choose img
 */
var count = 0;
var attach = [];
function chooseImgs() {
    if(count < 4) {
        wx.chooseImage({
            count: 4 - count, // 默认9
            sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有
            sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有
            defaultCameraMode: "batch", // 表示进入拍照界面的默认模式，目前有normal与batch两种选择，normal表示普通单拍模式，batch表示连拍模式，不传该参数则为normal模式。（注：用户进入拍照界面仍然可自由切换两种模式）
            isSaveToAlbum: 1, // 整型值，0表示拍照时不保存到系统相册，1表示自动保存，默认值是1
            success: function (res) {
                var localIds = res.localIds; // 返回选定照片的本地ID列表，
                count += localIds.length;
                // andriod中localId可以作为img标签的src属性显示图片；
                // iOS应当使用 getLocalImgData 获取图片base64数据，从而用于img标签的显示（在img标签内使用 wx.chooseImage 的 localid 显示可能会不成功）
                for (var i = 0; i < localIds.length; i++) {
                    // upload to tencent server
                    wx.uploadImage({
                        localId: localIds[i], // 需要上传的图片的本地ID，由chooseImage接口获得
                        isShowProgressTips: 1, // 默认为1，显示进度提示
                        success: function (res) {
                            var serverId = res.serverId; // 返回图片的服务器端ID
                            // upload to file server
                            $.ajax({
                                type: "post",
                                url: "${webPath}/pad/issue/savePicture",
                                dataType: "json",
                                data: {
                                    "mediaId": serverId
                                },
                                success: function (msg) {
                                    var html = '<div onclick="previewImage( \'${filePath}' + msg.imgPath + '\' );" class="image-item" style="background-image:url('+ '${filePath}' + msg.imgPath +');">' +
                                        '<div class="image-close" onclick="deleteImg(this);event.cancelBubble = true">X</div></div>';
                                    $("#img_show").before(html);
                                    attach.push(msg.imgPath); // push to array
                                },
                                error: function () {
                                    mui.toast("上传失败");
                                }
                            });
                        }
                    });
                }
            }
        });
    } else {
        mui.toast("最多可上传4张图片");
    }
}

/**
 * del img
 */
function deleteImg(obj) {
    var img = $(obj).parent().css("background-image");
    img = img.substring(img.length - 41, img.length - 2);
    for(var i=0; i<attach.length; i++) {
        if (attach[i] == img) {
            attach.splice(i, 1);
        }
    }
    count--;
    $(obj).parent().remove();
}

/**
 * 图片点击放大
 */
function previewImage(url) {
    wx.previewImage({
        current: url,
        urls: [url]
    });
}
/*upload img end*/

/*scan begin*/
/**
 * scan
 */
function scan(id){
    wx.scanQRCode({
        desc: 'scanQRCode desc',
        needResult: 1, // 默认为0，扫描结果由企业微信处理，1则直接返回扫描结果，
        scanType: ["qrCode", "barCode"], // 可以指定扫二维码还是条形码（一维码），默认二者都有
        success: function(res) {
            if (res != null) {
                $("#" + id).val(res.resultStr);
                $("#" + id).focus();
            } else {
                mui.toast("请稍后重试");
            }
        },
        error: function(res) {
            if (res.errMsg.indexOf('function_not_exist') > 0) {
                mui.toast("版本过低请升级");
            }
        }
    })
}

/**
 * t esn scan
 */
function esnScan(){
    wx.scanQRCode({
        desc: 'scanQRCode desc',
        needResult: 1, // 默认为0，扫描结果由企业微信处理，1则直接返回扫描结果，
        scanType: ["qrCode", "barCode"], // 可以指定扫二维码还是条形码（一维码），默认二者都有
        success: function(res) {
            if (res != null) {
                if (res.resultStr.indexOf("*") != -1) {
                    var r = res.resultStr.split("*");
                    $("#engine_type").val(r[0]);
                    $("#esn").val(r[1]);
                } else {
                    $("#esn").val(res.resultStr);
                }
                $("#esn").focus();
            } else {
                mui.toast("请稍后重试");
            }
        },
        error: function(res) {
            if (res.errMsg.indexOf('function_not_exist') > 0) {
                mui.toast("版本过低请升级");
            }
        }
    })
}
/*scan end*/

/**
 * 校验编号(字母、数字、下划线、中划线)
 */
jQuery.validator.addMethod("isNo", function(value, element) {
    return this.optional(element) || isNo(value);
}, "");

/**
 * 校验描述（中文、字母、数字、-、_、逗号、句号）
 */
jQuery.validator.addMethod("isDesc", function(value, element) {
    return this.optional(element) || isDesc(value);
}, "");

/**
 * 校验数字(非零正数)
 */
jQuery.validator.addMethod("isNum", function(value, element) {
    return this.optional(element) || isNumber(value);
}, "");

/**
 * 校验编号(字母、数字、下划线、中划线、点)
 * @param no
 * @returns {boolean}
 */
function isNo(no) {
    // var regex = /^([A-Za-z0-9._-]*)$/;
    var regex = /[^\/\\:\*"<>\|]*/;
    return regex.test(no);
}

/**
 * 校验描述（中文、字母、数字、-、_、逗号、句号）
 * @param str
 * @returns {boolean}
 */
function isDesc(str) {
    // var regex = /^[\u4E00-\u9FA5A-Za-z0-9,.，。_-]*$/;
    var regex = /[^\/\\:\*"<>\|]*/;
    return regex.test(str);
}

/**
 * 校验数字(非零正数)
 * @param num
 * @returns {boolean}
 */
function isNumber(num) {
    var regex = /^([1-9][0-9]*)+(\.[0-9]{0,2})?$/;
    return regex.test(num);
}
</script>