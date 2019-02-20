<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="icon" href="http://p0.meituan.net/merchantpic/23b79725bae58f57fc22400187cc0bed33254.jpg" type="img/x-ico" />
		<title>搜索结果</title>
		<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" />
		<style type="text/css">
			.searchInfo {
				background-color: RGB(247, 247, 247);
				margin-top: 20px;
				margin-bottom: 20px;
				padding-top: 20px;
				padding-left: 20px;
				/*width: 800px;*/
			}
			
			.sortKind li {
				padding-left: 8px;
				padding-right: 8px;
				padding-top: 4px;
				padding-bottom: 4px;
				border-radius: 4px;
				margin-right: 15px;
				font-size: 12px;
			}
			
			.sortKind a {
				color: black;
				text-decoration: none;
			}
			
			.sortKind a:hover {
				color: #00a1d6;
			}
			
			.sortKindActive {
				background-color: #00a1d6;
			}
			
			.sortKindActive a {
				color: white;
				padding-left: 8px;
			}
			
			.sortKindActive a:hover {
				color: white;
			}
			
			.nav-justified {
				/*margin-top: 20px;*/
				/*background-color: RGB(247, 247, 247);*/
			}
			.thumbnail{
				background-color: RGB(247, 247, 247);
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
			<div class="clo-md-6 col-md-offset-1">
				<div class="row">
					<ul class="nav nav-tabs nav-justified" style="width: 800px;">
						<li role="presentation" class="active">
							<a href="#">网站</a>
						</li>
						<li role="presentation">
							<a href="" id="searchUser">用户</a>
						</li>
					</ul>
				</div>
				<div class="row searchInfo">
					<small class="searchNumber">共10条结果</small>
					<div class="sortKind">
						<ul class="list-inline">
							<li class="sortKindActive">
								<a href="javascript:">
									综合排序
								</a>
							</li>
							<li>
								<a href="javascript:">
									收藏最多
								</a>
							</li>
							<li>
								<a href="javascript:">
									浏览最多
								</a>
							</li>
							<li>
								<a href="javascript:">
									点击最多
								</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="clo-md-12" >
				<div class="row">
					<div class="col-sm-4 col-md-4" >
						<div class="thumbnail" style="background-color: RGB(247, 247, 247);">
							<a href="">
								<img src="img/weblogo.png" alt="...">
							</a>
							<div class="caption">
								<h3>网站名称</h3>
								<p>描述</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">访问</a>
									<a href="#" class="btn btn-default" role="button">详情</a>
								</p>
							</div>
						</div>
					</div>
					<div class="col-sm-4 col-md-4">
						<div class="thumbnail">
							<a href="">
								<img src="img/weblogo.png" alt="...">
							</a>
							<div class="caption">
								<h3>网站名称</h3>
								<p>描述</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">访问</a>
									<a href="#" class="btn btn-default" role="button">详情</a>
								</p>
							</div>
						</div>
					</div>
					<div class="col-sm-4 col-md-4">
						<div class="thumbnail">
							<a href="">
								<img src="img/weblogo.png" alt="...">
							</a>
							<div class="caption">
								<h3>网站名称</h3>
								<p>描述</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">访问</a>
									<a href="#" class="btn btn-default" role="button">详情</a>
								</p>
							</div>
						</div>
					</div>

					<div class="col-sm-4 col-md-4">
						<div class="thumbnail">
							<a href="">
								<img src="img/weblogo.png" alt="...">
							</a>
							<div class="caption">
								<h3>网站名称</h3>
								<p>描述</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">访问</a>
									<a href="#" class="btn btn-default" role="button">详情</a>
								</p>
							</div>
						</div>
					</div>
					<div class="col-sm-4 col-md-4">
						<div class="thumbnail">
							<a href="">
								<img src="img/weblogo.png" alt="...">
							</a>
							<div class="caption">
								<h3>网站名称</h3>
								<p>描述</p>
								<p>
									<a href="#" class="btn btn-primary" role="button">访问</a>
									<a href="#" class="btn btn-default" role="button">详情</a>
								</p>
							</div>
						</div>
					</div>
				</div>
				<div style="margin: 0 auto; width: 400px;">
					<ul class="pagination">
						<li class="previous">
							<a href="#">上一页</a>
						</li>
						<li class="">
							<a href="#">1</a>
						</li>
						<li class="">
							<a href="#">2</a>
						</li>

						<li class="">
							<a href="#">3</a>
						</li>
						<li class="">
							<a href="#">4</a>
						</li>
						<li class="disabled">
							<a href="">...</a>
						</li>
						<li class="active">
							<a href="#">5</a>
						</li>
						<li class="next disabled">
							<a href="#"> 下一页</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<%@include file="foot.jsp"%>
	</body>
	<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
	<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(document).on('ready', function() {
			var keyword = "hello";
			$("#searchUser").attr('href','website/search/searchUser?key='+keyword);
			$(".sortKind li").on('click', function() {
				$(".sortKind li").attr('class', '');
				$(this).attr('class', 'sortKindActive');
			})
		})
	</script>

</html>