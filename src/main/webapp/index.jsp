<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="icon" href="http://p0.meituan.net/merchantpic/23b79725bae58f57fc22400187cc0bed33254.jpg" type="img/x-ico" />
		<title>首页</title>
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
							<a href="website/search/index">上一页</a>
						</li>
						<li class="active" id="page1">
							<a href="website/search/index?page=1">1</a>
						</li>
						<li class="" id="page2">
							<a href="website/search/index?page=2">2</a>
						</li>

						<li class="" id="page3">
							<a href="website/search/index?page=3">3</a>
						</li>
						<li class="" id="page4">
							<a href="website/search/index?page=4">4</a>
						</li>
						<li class="disabled">
							<a href="">...</a>
						</li>
						<li class="" id="page5">
							<a href="website/search/index?page=5">5</a>
						</li>
						<li class="next ">
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
			$("#index").attr('class', 'active');
			var pages = 5;
			var currentPage = 1;
			setPage(currentPage,pages);
			function setPage(){
				if(currentPage==1){
					$(".pagination .previous").attr('class','previous disabled');
				}
				if(currentPage == pages){
					$(".pagination .next").attr('class','next disabled');
				}
				$(".pagination .active").attr('class','')
				$("#page"+currentPage).addClass('active');
				
			}
		})
	</script>

</html>