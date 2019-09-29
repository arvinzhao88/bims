<%@ page contentType="text/html;charset=utf-8" language="java"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="${resPath}/view/static/images/favicon.ico"
          type="image/ico" />
    <style>
        .clear::after {
            content: '';
            clear: both;
            display: block;
        }
        .fl {
            float: left;
        }
        .list-img li {
            position: relative;
            margin-right: 10px;
            list-style: none;
        }
        .list-img img {
            display: inline-block;
            width: 50px;
            height:50px;
        }
        .list-img input {
            position: absolute;
            top: 0;
            left: 0;
            z-index: 10;
            width: 50px;
            height:50px;
            opacity: 0;
        }
        .list-img i {
            position: absolute;
            top: 0;
            right: 0;
            width: 15px;
            height: 15px;
            background: url(${resPath}/view/static/images/icon_del.png) no-repeat center;
            background-size: 100%;
        }
        .list-img .num {
            position: absolute;
            left: 0;
            bottom: 0;
            width: 100%;
            text-align: center;
            color: #999;
            font-size: 12px;
        }
    </style>
</head>
<body>
<%--<div class="list-img">--%>
    <%--<ul id="preview" class="clear">--%>
        <%--<li class="fl">--%>
            <%--<img src="/images/icon_upload.png">--%>
            <%--<input id="fileImage" type="file" name="file[]" multiple />--%>
            <%--<div class="num">0/20</div>--%>
        <%--</li>--%>
    <%--</ul>--%>
<%--</div>--%>

<%--<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>--%>
<script src="${resPath}/view/static/vendors/jquery/dist/jquery.min.js"></script>
<script>
    var pageCtrl = {
        imgId : 0, //图片id标志, 方便删除预览图片
        maxNum : 1, //最多上传图片张数
        count : 0,
        /* 选择图片 */
        _choosePic : function() {
            var _self = this;
            $('#fileImage1').change(function() {
                var files = this.files,
                    len = $('#preview1').find('.pic').length;
                if (len + files.length > _self.maxNum) {
                    _self._showTip('最多只能上传' + _self.maxNum + '张图片哦~');
                    return;
                }
                for (var i = 0; i < files.length; i++) {
                    var file = files[i];
                    if (file.type.indexOf("image") == 0) {
                        if (file.size >= 1024 * 1024 * 3) {
                            _self._showTip('图片大小过大，应小于3M');
                        } else {
                            _self._showPic(file); //图片预览
                        }
                    } else {
                        _self._showTip('文件"' + file.name + '"不是图片类型')
                        break;
                    }
                }
            });
        },

        /* 渲染图片 */
        _showPic : function(file) {
            var _self = this,
                html = '',
                $wap = $('#preview1'),
                reader = new FileReader();
            reader.readAsDataURL(file);
                reader.onload = function(e) {
                var image_base64 = this.result,
                    count=_self.count

                    html = '<li class="fl pic" id="imgItem_' + count + '">' +
                    '<span data-toggle="modal" data-target=".this-pic" onclick="showImg(\''+image_base64+'\')">' +
                    '<img src="' + image_base64 + '" alt="" />' +
                    '</span>' +
                    '<input id="imgUrl_' + count + '" type="hidden" class="imgUrl">' +
                    '<i class="del-img"></i>' +
                    '</li>';
                    $wap.append(html);

                $('#fileImage1').next().text($wap.find('.pic').length + '/' + _self.maxNum);

                //图片压缩上传，大于1.2M压缩图片
                if (file.size / 1024 > 1024 * 1.2) {
                    _self._dealImage(image_base64, {
                        quality: 0.5
                    }, function(base64Codes) {
                        var bl = _self._processData(base64Codes, file.type);
                        _self._uploadPic(bl, count);
                    });
                } else {
                    _self._uploadPic(file, count);
                }
                    count++;
                    _self.count=count;
            }
        },


        /**
         * 图片压缩（利用canvas）
         * @param  path     图片路径
         * @param  obj      压缩配置width,height,quality，不传则按比例压缩
         * @param  callback  回调函数
         */
        _dealImage : function(path, obj, callback) {
            var img = new Image();
            img.src = path;
            img.onload = function() {
                var that = this;
                // 默认按比例压缩
                var w = that.width,
                    h = that.height,
                    scale = w / h;
                w = obj.width || w;
                h = obj.height || (w / scale);

                //生成canvas
                var canvas = document.createElement('canvas'),
                    ctx = canvas.getContext('2d');
                canvas.width = w;
                canvas.height = h;
                ctx.drawImage(that, 0, 0, w, h);

                // 默认图片质量为0.7
                var quality = 0.7;
                if (obj.quality && obj.quality <= 1 && obj.quality > 0) {
                    quality = obj.quality;
                }

                // 回调函数返回base64的值
                var base64 = canvas.toDataURL('image/jpeg', quality);
                callback(base64);
            }
        },

        /* 将以base64的图片url数据转换为Blob */
        _processData : function(dataUrl, type) {
            var binaryString = window.atob(dataUrl.split(',')[1]),
                arrayBuffer = new ArrayBuffer(binaryString.length),
                intArray = new Uint8Array(arrayBuffer);
            for (var i = 0, j = binaryString.length; i < j; i++) {
                intArray[i] = binaryString.charCodeAt(i);
            }

            var data = [intArray], blob;

            try {
                blob = new Blob(data);
            } catch (e) {
                window.BlobBuilder = window.BlobBuilder ||
                    window.WebKitBlobBuilder ||
                    window.MozBlobBuilder ||
                    window.MSBlobBuilder;
                if (e.name === 'TypeError' && window.BlobBuilder) {
                    var builder = new BlobBuilder();
                    builder.append(arrayBuffer);
                    blob = builder.getBlob(type);
                } else {
                    _showTip('版本过低，不支持图片压缩上传');
                }
            }
            return blob;
        },

        /* 上传图片 */
        _uploadPic : function(file, id) {
            var _self = this,
                formData = new FormData();
            formData.append('file', file);
            $.ajax({
                url: '${webPath}/uploadFile/uploader',
                type: 'post',
                dataType: 'json',
                data: formData,
                contentType: false,
                processData: false,
                success: function(res){
                    var result = $("#attach").val();
                    result==""?result:result=result+',';
                    if(res.imgPath !=null) {
                        $("#attach").val(result+res.imgPath);//将地址存储好
                        $('#imgUrl_' + id).attr('value', res.imgPath);
                        console.log(id)
                        $('#imgItem_' + id).find('.del-img').attr('data-src', res.imgPath);//显示图片
                        var img = $("#attach").val();
                        result=img ;
                        $("#attach").attr("value",result);
                        console.log(result);
                    }else {
                        _self._showTip('文件上传失败！');
                    }
                }
            });
        },

        /* 删除图片 */
        _delPic : function() {
            var _self = this,
                $wap = $('#preview1');
            $wap.on('click', '.del-img', function() {
                //TODO:从数据库删除图片
                $(this).parent().remove();
                $('#fileImage1').next().text($wap.find('.pic').length + '/' + _self.maxNum);
                //更新隐藏图片路径
                var numArr = new Array();
                $('.imgUrl').each(function(){
                    numArr.push($(this).val());//添加至数组
                    console.log(numArr)
                });
                $("#attach").val(numArr.toString());
            });

        },

        _showTip : function(str) {
            //TODO信息提示
            console.log(str);
        },

        init: function() {
            this._choosePic();
            this._delPic();
        }
    };

    $(function(){
        pageCtrl.init();
    });

    /** 展示图片 **/
    function showImg(byteImg) {
        $("#showImg").html("<img style='width: 100%;height: 100%;' src='"+byteImg+"' />");
    }
</script>
</body>
</html>