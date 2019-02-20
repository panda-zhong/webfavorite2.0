<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="icon" href="http://p0.meituan.net/merchantpic/23b79725bae58f57fc22400187cc0bed33254.jpg" type="img/x-ico" />
		<title>个人空间</title>
		<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" />
		<style type="text/css">
			a {
				text-decoration: none;
			}
			
			.container {
				/*border-left: 1px solid RGB(82, 148, 201);*/
				/*border-right: 1px solid RGB(82, 148, 201);*/
			}
			
			.userInfo {
				position: relative;
				padding: 20px 0 0px 132px;
				background-color: RGB(247, 247, 247);
			}
			
			.userLogo img {
				position: absolute;
				width: 120px;
				left: 0;
				top: 20px;
			}
			
			.info-head {
				border-bottom: 1px solid #e5e9ef;
			}
			
			.detailInfo .userName {
				display: inline-block;
				margin-right: 15px;
			}
			
			.detailInfo .userName:hover {
				color: #00a1d6;
			}
			
			.detailInfo a {
				color: black;
			}
			
			.userCollectList {
				margin-top: 20px;
			}
			
			.userCollectList .website {
				position: relative;
				width: 150px;
				padding-left: 50px;
				padding-bottom: 10px;
				padding-top: 10px;
				color: black;
				background-color: RGB(247, 247, 247);
			}
			
			.userCollectList>a {
				display: inline-block;
			}
			/*.userCollectList .website .webLogo img {
				position: absolute;
			}*/
			
			.userCollectList .website .webLogo img {
				width: 50px;
				height: 50px;
			}
			
			.userCollectList .website .webInfo {
				width: 50px;
			}
			
			.websiteDetail {
				width: 300px;
				padding-left: 10px;
				padding-right: 10px;
				background-color: white;
				border: 1px solid #ccd0d7;
				border-radius: 4px;
				box-shadow: 0 2px 4px rgba(0, 0, 0, .16);
				box-sizing: border-box;
				z-index: 10020;
				position: absolute;
				display: none;
			}
			.label-info{
				margin-left: 5px;
			}
		</style>
	</head>
	<!--
author:panda
computer:@Berenice
createTime:2019年2月17日 上午10:51:53
-->

	<body>
		<%@include file="head.jsp"%>
		<div class="container">
			<div class="clo-md-6  col-md-offset-1">
				<div class="row">
					<ul class="userList list-unstyled">
						<li class="userInfo">
							<div class="userLogo">
								<a href="">
									<img alt="140x140" src="img/weblogo.png" class="img-circle" />
								</a>
							</div>
							<div class="detailInfo">
								<div class="info-head">
									<a href="">
										<h2 class="userName"><strong>panda</strong></h2>
									</a>
									<p>
										<small>
										<a href="">
										关注：<span id="collect">
										3											
										</span>
										</a>
										&nbsp;&nbsp;&nbsp; 
										<a href="">
											粉丝：
											<span id="funs">2</span>
											
										</a>
										</small>
									</p>
									<p>
										<span id="introduction">
											哈哈哈哈哈哈哈或或或或或
										</span>
									</p>
								</div>
							</div>
						</li>
					</ul>
				</div>
				<div class="row">
					<ul class="nav nav-pills">
						<li role="presentation">
							<a href="userIndex.jsp">收藏<span class="label label-info">30</span></a>
						</li>
						<li role="presentation">
							<a href="userMessage.jsp">信息<span class="label label-info">3</span></a>
						</li>
						<li role="presentation" class="active">
							<a href="userInfo.jsp">资料</a>
						</li>
					</ul>
				</div>
				<div class="row">
					<form class="form-horizontal">
						<div class="form-group">
							<label for="inputName" class="col-sm-4 control-label">昵称</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="inputName" placeholder="昵称">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail" class="col-sm-4 control-label">邮箱</label>
							<div class="col-sm-3">
								<input type="email" class="form-control" id="inputEmail" placeholder="邮箱">
							</div>
							<div class="col-sm-1">
								<a href="" class="btn btn-small btn-success">获取验证码</a>
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmailCode" class="col-sm-4 control-label">验证码</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="inputEmailCode" placeholder="验证码">
							</div>

						</div>
						<div class="form-group">
							<div class="col-sm-offset-4 col-sm-4">
								<button type="submit" class="btn btn-block btn-small btn-success">修改</button>

							</div>
						</div>
					</form>

				</div>
				<div class="row">
					<form class="form-horizontal" action="${pageContext.request.contextPath}/user/modifyInfo/modifyLogo" method="post" enctype="multipart/form-data">

						<div class="form-group">
							<label for="inputLogo" class="col-sm-4 control-label"><img src="img/weblogo.png" class="" alt="加载失败" id="img"></label>
							<div class="col-sm-3">
								<!--<label for="inputLogo" class="col-sm-4 control-label"><img src="img/weblogo.png" class="" alt="加载失败" id="img"></label>-->
								<input type="submit" id="modifyLogoGroup" class="btn btn-block btn-small btn-success" value="修改头像" style="display: none;margin-top: 70px;"/>
								<input type="file" name="logo" onchange="show(&quot;img&quot;,&quot;inputLogo&quot;)" id="inputLogo" style="display: none;" />
							</div>
						</div>

					</form>

				</div>
			</div>
		</div>
		</div>
		<%@include file="foot.jsp"%>
	</body>
	<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
	<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		function show(imgID, iptfileupload) { // 接收传过来的img标签的ID 和 当前input的框的ID
			var file_img = document.getElementById(imgID),
				iptfileupload = document.getElementById(iptfileupload);
			// 调用上传图片函数
			getPath(file_img, iptfileupload, file_img);
			$("#modifyLogoGroup").show(500);
		};

		//上传图片函数封装
		function getPath(obj, fileQuery, transImg) {

			var imgSrc = '',
				imgArr = [],
				strSrc = '';

			if(window.navigator.userAgent.indexOf("MSIE") >= 1) { // IE浏览器判断
				if(obj.select) {
					obj.select();
					var path = document.selection.createRange().text;
					alert(path);
					obj.removeAttribute("src");
					imgSrc = fileQuery.value;
					imgArr = imgSrc.split('.');
					strSrc = imgArr[imgArr.length - 1].toLowerCase();
					if(strSrc.localeCompare('jpg') === 0 || strSrc.localeCompare('jpeg') === 0 || strSrc.localeCompare('gif') === 0 || strSrc.localeCompare('png') === 0) {
						obj.setAttribute("src", transImg);
						obj.style.filter =
							"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='" + path + "', sizingMethod='scale');"; // IE通过滤镜的方式实现图片显示
					} else {
						//try{
						throw new Error('File type Error! please image file upload..');
						//}catch(e){
						//  alert('name: ' + e.name + 'message: ' + e.message) ;
						//}
					}
				} else {
					// alert(fileQuery.value) ;
					imgSrc = fileQuery.value;
					imgArr = imgSrc.split('.');
					strSrc = imgArr[imgArr.length - 1].toLowerCase();
					if(strSrc.localeCompare('jpg') === 0 || strSrc.localeCompare('jpeg') === 0 || strSrc.localeCompare('gif') === 0 || strSrc.localeCompare('png') === 0) {
						obj.src = fileQuery.value;
					} else {
						//try{
						throw new Error('File type Error! please image file upload..');
						//}catch(e){
						//  alert('name: ' + e.name + 'message: ' + e.message) ;
						//}
					}

				}

			} else {
				var file = fileQuery.files[0];
				var reader = new FileReader();
				reader.onload = function(e) {

					imgSrc = fileQuery.value;
					imgArr = imgSrc.split('.');
					strSrc = imgArr[imgArr.length - 1].toLowerCase();
					if(strSrc.localeCompare('jpg') === 0 || strSrc.localeCompare('jpeg') === 0 || strSrc.localeCompare('gif') === 0 || strSrc.localeCompare('png') === 0) {
						obj.setAttribute("src", e.target.result);
					} else {
						//try{
						throw new Error('File type Error! please image file upload..');
						//}catch(e){
						//  alert('name: ' + e.name + 'message: ' + e.message) ;
						//}
					}

					// alert(e.target.result); 
				}
				reader.readAsDataURL(file);
			}
		}
	</script>

</html>