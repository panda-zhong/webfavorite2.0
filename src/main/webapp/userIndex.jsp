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
				width: 870px;
			}
			
			.website {
				position: relative;
				width: 150px;
				padding-left: 50px;
				padding-bottom: 10px;
				padding-top: 10px;
				color: black;
				background-color: RGB(247, 247, 247);
				margin-top: 20px;
				margin-right: 20px;
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
			
			.label-info {
				margin-left: 5px;
			}
			
			.myCollect {
				position: relative;
			}
			
			.addCollect {
				width: 150px;
				height: 100px;
				border: 2px dashed #b8c0cc;
				border-radius: 4px;
				transition: border .2s ease;
				box-sizing: border-box;
				position: absolute;
				right: 2%;
				top: 8%;
			}
			
			.addCollect img {
				width: 50px;
				position: absolute;
				top: 15%;
				left: 33%;
			}
			
			.addCollect h5 {
				position: absolute;
				top: 55%;
				left: 40%;
			}
			
			.addCollect:hover {
				border: 2px dashed skyblue;
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

			<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="exampleModalLabel">新网站</h4>
						</div>
						<div class="modal-body">
							<form>
								<div class="form-group">
									<label for="recipient-url" class="control-label">网址:</label>
									<input type="text" class="form-control" id="recipient-url">
								</div>
								<div class="form-group">
									<label for="recipient-name" class="control-label">名称:</label>
									<input type="text" class="form-control" id="recipient-name">
								</div>
								<div class="form-group">
									<label for="recipient-logo" class="control-label">logo:<img src="img/weblogo.png" id="addWebLogo"/></label>
									<input type="file" class="form-control" onchange="show(&quot;addWebLogo&quot;,&quot;recipient-logo&quot;)" id="recipient-logo" style="display: none;">
								</div>
								<div class="form-group">
									<label for="message-text" class="control-label">描述:</label>
									<textarea class="form-control" id="message-text"></textarea>
								</div>

								<div class="form-group">
									<label for="radio-no" class="control-label">发布广场:</label>
									<label for="radio-ye" class="control-label">是</label>
									<input type="radio" name="toWebSite" id="radio-yes" value="" />
									<label for="radio-no" class="control-label">否:</label>
									<input type="radio" name="toWebSite" id="radio-no" value="" checked="" />
								</div>
							</form>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
							<button type="button" class="btn btn-primary">提交</button>
						</div>
					</div>
				</div>
			</div>
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
						<li role="presentation" class="active">
							<a href="user/collect/getAll">收藏<span class="label label-info">30</span></a>
						</li>
						<li role="presentation">
							<a href="user/message/getBy">信息<span class="label label-info">3</span></a>
						</li>
						<li role="presentation">
							<a href="userInfo.jsp">资料</a>
						</li>
					</ul>
				</div>
				<div class="row">
					<div class="myCollect">
						<a href="" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">
							<div class="addCollect">

								<img src="img/add.png" class="img-rounded" />
								<h5 class="text-center">添加</h5>
							</div>
						</a>
						<ul class="userCollectList list-unstyled">
							<a href="">
								<li class="website">
									<div class="webLogo">
										<img src="img/flash.jpg" class="img-rounded" />
									</div>
									<div class="webInfo">
										<h5 class="text-center">添加</h5>

									</div>

								</li>
							</a>

							<a href="">
								<li class="website">
									<div class="webLogo">
										<img src="img/flash.jpg" class="img-rounded" />
									</div>
									<div class="webInfo">
										<h5 class="text-center">添加</h5>

									</div>

								</li>
							</a>

							<a href="">
								<li class="website">
									<div class="webLogo">
										<img src="img/flash.jpg" class="img-rounded" />
									</div>
									<div class="webInfo">
										<h5 class="text-center">添加</h5>

									</div>

								</li>
							</a>

							<a href="">
								<li class="website">
									<div class="webLogo">
										<img src="img/flash.jpg" class="img-rounded" />
									</div>
									<div class="webInfo">
										<h5 class="text-center">百度</h5>

									</div>
									<div class="websiteDetail">
										<div class="header">
											<h4>百度</h4>
											<button class="btn btn-small btn-success">编辑</button>
											<button class="btn btn-small btn-danger">删除</button>
											<p>
												<small class="weburl">
															www.baidu.com
														</small> |
												<small class="webtime">
															2019-1-1
														</small>
											</p>
										</div>
										<hr />
										<div class="webIntroduction">
											<span>
														百度（纳斯达克：BIDU），全球最大的中文搜索引擎、最大的中文网站。百度愿景是：成为最懂用户，并能帮助人们成长的全球顶级高科技公司。
													</span>
										</div>
										<hr />
										<div class="webStatiste">
											<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
											<span id="skim">3000</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
											<span id="like">3</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<span class="glyphicon glyphicon-save" aria-hidden="true"></span>
											<span id="click">30</span>
										</div>
									</div>

								</li>
							</a>

							<a href="">
								<li class="website">
									<div class="webLogo">
										<img src="img/flash.jpg" class="img-rounded" />
									</div>
									<div class="webInfo">
										<h5 class="text-center">百度</h5>
									</div>
									<div class="websiteDetail">
										<div class="header">
											<h4>百度</h4>
											<p>
												<small class="weburl">
															www.baidu.com
														</small> |
												<small class="webtime">
															2019-1-1
														</small>
											</p>
										</div>
										<hr />
										<div class="webIntroduction">
											<span>
														百度（纳斯达克：BIDU），全球最大的中文搜索引擎、最大的中文网站。百度愿景是：成为最懂用户，并能帮助人们成长的全球顶级高科技公司。
													</span>
										</div>
										<hr />
										<div class="webStatiste">
											<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
											<span id="skim">3000</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
											<span id="like">3</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<span class="glyphicon glyphicon-save" aria-hidden="true"></span>
											<span id="click">30</span>
										</div>
									</div>

								</li>
							</a>

							<a href="">
								<li class="website">
									<div class="webLogo">
										<img src="img/flash.jpg" class="img-rounded" />
									</div>
									<div class="webInfo">
										<h5 class="text-center">百度</h5>
									</div>
									<div class="websiteDetail">
										<div class="header">
											<h4>百度</h4>
											<p>
												<small class="weburl">
															www.baidu.com
														</small> |
												<small class="webtime">
															2019-1-1
														</small>
											</p>
										</div>
										<hr />
										<div class="webIntroduction">
											<span>
														百度（纳斯达克：BIDU），全球最大的中文搜索引擎、最大的中文网站。百度愿景是：成为最懂用户，并能帮助人们成长的全球顶级高科技公司。
													</span>
										</div>
										<hr />
										<div class="webStatiste">
											<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
											<span id="skim">3000</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
											<span id="like">3</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<span class="glyphicon glyphicon-save" aria-hidden="true"></span>
											<span id="click">30</span>
										</div>
									</div>

								</li>
							</a>

							<a href="">
								<li class="website">
									<div class="webLogo">
										<img src="img/flash.jpg" class="img-rounded" />
									</div>
									<div class="webInfo">
										<h5 class="text-center">百度</h5>
									</div>
									<div class="websiteDetail">
										<div class="header">
											<h4>百度</h4>
											<p>
												<small class="weburl">
															www.baidu.com
														</small> |
												<small class="webtime">
															2019-1-1
														</small>
											</p>
										</div>
										<hr />
										<div class="webIntroduction">
											<span>
														百度（纳斯达克：BIDU），全球最大的中文搜索引擎、最大的中文网站。百度愿景是：成为最懂用户，并能帮助人们成长的全球顶级高科技公司。
													</span>
										</div>
										<hr />
										<div class="webStatiste">
											<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
											<span id="skim">3000</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
											<span id="like">3</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<span class="glyphicon glyphicon-save" aria-hidden="true"></span>
											<span id="click">30</span>
										</div>
									</div>

								</li>
							</a>

							<a href="">
								<li class="website">
									<div class="webLogo">
										<img src="img/flash.jpg" class="img-rounded" />
									</div>
									<div class="webInfo">
										<h5 class="text-center">百度</h5>
									</div>
									<div class="websiteDetail">
										<div class="header">
											<h4>百度</h4>
											<p>
												<small class="weburl">
															www.baidu.com
														</small> |
												<small class="webtime">
															2019-1-1
														</small>
											</p>
										</div>
										<hr />
										<div class="webIntroduction">
											<span>
														百度（纳斯达克：BIDU），全球最大的中文搜索引擎、最大的中文网站。百度愿景是：成为最懂用户，并能帮助人们成长的全球顶级高科技公司。
													</span>
										</div>
										<hr />
										<div class="webStatiste">
											<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
											<span id="skim">3000</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
											<span id="like">3</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<span class="glyphicon glyphicon-save" aria-hidden="true"></span>
											<span id="click">30</span>
										</div>
									</div>

								</li>
							</a>
						</ul>

					</div>
				</div>
			</div>
		</div>
		<%@include file="foot.jsp"%>
	</body>
	<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
	<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(document).on('ready', function() {
			$(".website").hover(function() {
				$(this).children('.websiteDetail').show(100);
			}, function() {
				$(this).children('.websiteDetail').hide(100);
			})

		})

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