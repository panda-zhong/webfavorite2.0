<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="icon" href="http://p0.meituan.net/merchantpic/23b79725bae58f57fc22400187cc0bed33254.jpg" type="img/x-ico" />
		<title>最新发布</title>
		<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" />
	</head>
	<!--
author:panda
computer:@Berenice
createTime:2019年2月17日 上午10:51:53
-->

	<body>
		<%@include file="head.jsp"%>
		<div class="container">
			<div class="clo-md-12">
				<div class="row">
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
			$('.banner').show();
			$("#recentWeb").attr('class', 'active')
		})
	</script>

</html>