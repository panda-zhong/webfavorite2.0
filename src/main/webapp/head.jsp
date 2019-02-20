<%@page import="panda.nono.WebFavorite.po.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="icon" href="http://p0.meituan.net/merchantpic/23b79725bae58f57fc22400187cc0bed33254.jpg" type="img/x-ico" />
		<title>head</title>
		<style type="text/css">
			.banner {
				width: 100%;
				height: 150px;
				overflow: hidden;
				position: relative;
				background-color: RGB(247, 247, 247);
				border-bottom: 2px solid RGB(82, 148, 201);
				margin-bottom: 20px;
			}
			
			.banner img {
				width: 560px;
				margin: 0 auto;
				position: absolute;
				top: -100%;
				right: 15%;
			}
			
			.banner .brand {
				color: RGB(82, 148, 201);
				font-family: STLiti;
				font-size: 60px;
				position: absolute;
				left: 200px;
				top: 30px;
			}
			
			.navbar {
				margin-bottom: 1px;
				border-bottom: 1px solid gainsboro;
			}
		</style>
	</head>
	<!--
author:panda
computer:@Berenice
createTime:2019年2月17日 下午3:16:49
-->

	<body>
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
					<a class="navbar-brand" href="index.jsp" style="padding: 5px 15px; padding-right: 50px;"> <img src="img/weblogo.png" alt="Brand" / style="width: 40px; height: 40px;">
					</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li id="index">
							<a href="website/search/index">热门排行 <span class="sr-only">(current)</span></a>
						</li>
						<li id="recentWeb">
							<a href="recentWeb.jsp">最新发布 <span class="label label-info">3</span></a>
						</li>
						<li id="famousUser">
							<a href="famousUser.jsp">知名用户 </a>
						</li>
					</ul>
					<form action="website/search/searchWeb" class="navbar-form navbar-left">
						<div class="form-group">
							<input type="text" name="key" class="form-control" placeholder="火爆网站排行" style="width: 300px;">
						</div>
						<button type="submit" class="btn btn-default">搜索</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<%-- <c:if test="${empty USERINSESSION}"> --%>
							<li>
								<a href="login.jsp">登录</a>
							</li>
							<li>
								<a href="regedit.jsp">注册</a>
							</li>
						<%-- </c:if> --%>
						<c:if test="${!empty USERINSESSION}">
							<li>
								<a href="user/collect/getAll">收藏夹</a>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${SessionScope.USERINSESSION.name} <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li>
										<a href="userInfo.jsp">我的</a>
									</li>
									<li role="separator" class="divider"></li>
									<li>
										<a href="#">消息 <span class="label label-warning">
										3 </span>
										</a>
									</li>
									<li role="separator" class="divider"></li>
									<li>
										<a href="#">注销</a>
									</li>
								</ul>
							</li>
						</c:if>

					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
		<div class="banner" style="display: none;">
			<img src="img/eye.jpeg" />
			<h1 class="brand">zhong-panda</h1>
		</div>
	</body>

</html>