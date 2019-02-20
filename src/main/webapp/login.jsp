<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="icon" href="http://p0.meituan.net/merchantpic/23b79725bae58f57fc22400187cc0bed33254.jpg" type="img/x-ico" />
		<title>登录</title>
		<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" />
		<style type="text/css">
			.titrow {
				border-bottom: 1px solid #ddd;
				height: 28px;
				text-align: center;
				margin-bottom: 40px;
			}
			
			.tit {
				height: 56px;
				line-height: 56px;
				margin: 0 auto;
				padding: 0 20px;
				font-size: 40px;
				background: #fff;
				text-align: center;
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

			<div class="clo-md-8 clo-md-offset-2">
				<div class="row titrow">
					<span class="tit" style="">登录</span>
				</div>
				<div class="row"> 
					<form action="user/login/check" class="form-horizontal">
						<div class="form-group">
							<label for="inputAccount" class="col-sm-3 control-label">账号</label>
							<div class="col-sm-6">
								<input type="text" name="account" class="form-control" id="inputAccount" placeholder="账号">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" name="password" class="col-sm-3 control-label">密码</label>
							<div class="col-sm-6">
								<input type="password" class="form-control" id="inputPassword3" placeholder="密码">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-8 col-sm-2">
								<a href="forgotPassword.jsp" style="color: gray;text-decoration: none;">
									<small>
									忘记密码？
								</small>
								</a>

							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-3 col-sm-3">
								<button type="submit" class="btn btn-block btn-small btn-success">登录</button>

							</div>
							<div class="col-sm-3">
								<a href="regedit.jsp" type="submit" class="btn btn-block btn-large btn-warning">注册</a>
							</div>
						</div>
					</form>
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
			$("#index").attr('class', 'active')
		})
	</script>

</html>