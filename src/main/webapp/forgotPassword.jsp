<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="icon" href="http://p0.meituan.net/merchantpic/23b79725bae58f57fc22400187cc0bed33254.jpg" type="img/x-ico" />
		<title>忘记密码</title>
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
				font-size: 18px;
				background: #fff;
				text-align: center;
			}
			
			.titActive {
				color: #5cb85c;
				font-size: 18px;
			}
			
			.titLine {
				display: inline-block;
				width: 30px;
				height: 1px;
				border-bottom: 1px solid #5cb85c;
			}
			
			.form-horizontal {
				margin-top: 50px;
			}
			
			.form-group {
				display: none;
			}
			
			.glyphicon {
				font-size: 12px;
				line-height: 10px;
			}
			
			.glyphicon:empty {
				width: 2em;
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
				<div class="row">
					<ol class="breadcrumb">
						<li>
							<a href="#">登录</a>
						</li>
						<li class="active">
							忘记密码
						</li>
					</ol>
				</div>
				<div class="row titrow">
					<p class="tit">
						<span id="titFirst" class="titActive"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>确认账号</span>
						<span>--------</span>
						<span id="titSecond"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>重置密码</span>
						<span>--------</span>
						<span id="titThird">
						<span class="glyphicon glyphicon-check" aria-hidden="true"></span> 重置成功
						</span>
					</p>
				</div>
				<div class="row">
					<div class="progress" style="width: 50%; margin: 0 auto;">
						<div class="progress-bar  progress-bar-info" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%;">
							30%
						</div>
					</div>
				</div>
				<div class="row">
					<form class="form-horizontal">

						<div class="form-group" id="passwordGroup">
							<label for="inputPassword" class="col-sm-4 control-label">密码</label>
							<div class="col-sm-4">
								<input type="password" class="form-control" name="password" id="inputPassword" placeholder="密码">
								<span id="nullPassword" class="glyphicon glyphicon-remove" aria-hidden="true" style="color: #d9534f;display: none;">密码不能为空</span>
							</div>

						</div>

						<div class="form-group" id="passwordAgainGroup">
							<label for="inputPasswordAgain" class="col-sm-4 control-label">确认密码</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="passwordAgain" id="inputPasswordAgain" placeholder="确认密码">
								<span id="passwordAgainOk" class="glyphicon glyphicon-ok" aria-hidden="true" style="color: #5cb85c;display: none;"></span>
								<span id="passwordAgainFail" class="glyphicon glyphicon-remove" aria-hidden="true" style="color: #d9534f;display: none;">两次密码不一致</span>
							</div>
						</div>
						<div class="form-group" id="emailGroup">
							<label for="inputEmail" class="col-sm-4 control-label">邮箱</label>
							<div class="col-sm-4">
								<input type="email" name="email" class="form-control" id="inputEmail" placeholder="邮箱">
								<span id="nullEmail" class="glyphicon glyphicon-remove" aria-hidden="true" style="color: #d9534f;display: none;">邮箱不能为空</span>
							</div>

						</div>
						<div class="form-group" id="emailValueGroup">
							<label for="inputEmailValu" class="col-sm-4 control-label">邮箱</label>
							<div class="col-sm-2" style="margin-top: 5px;">
								<p>
									<span id="userEmail">287595523@qq.com</span>
								</p>
							</div>
							<div class="col-sm-2">
								<a href="javascript:" class="btn btn-small btn-success" id="sendCode">发送验证码</a>
								<a class="btn btn-small btn-warning" id="backClick" href="#">修改</a>
							</div>

						</div>
						<div class="form-group" id="emailCodeGroup">
							<label for="inputEmailCode" class="col-sm-4 control-label">验证码</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="inputEmailCode" placeholder="验证码">
								<span class="glyphicon glyphicon-ok" aria-hidden="true" style="color: #5cb85c;"></span>
								<span class="glyphicon glyphicon-remove" aria-hidden="true" style="color: #d9534f;">验证码不正确</span>
							</div>
						</div>
						<div class="form-group" id="finishGroup">
							<label for="inputEmailCode" class="col-sm-4 control-label">信息：</label>
							<div class="col-sm-4" style="margin-top: 5px;">
								<p>
									<span id="finishTip">修改密码完成，3秒后跳转到登录界面</span>
								</p>
							</div>
						</div>
						<div class="form-group" style="display: block;">
							<div class="col-sm-offset-4 col-sm-4">
								<button type="button" id="click" class=" btn btn-block btn-small btn-success">确定</button>

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
		var step = 1;
		var flashTime = 500;
		$(document).on('ready', function() {
			$('.banner').show();
			$("#emailGroup").show();

			$('#click').on('click', function() {
				if(step == 1) {
					second();
				} else if(step == 2) {
					third();
				} else {

				}

			})
			$('#backClick').on('click', function() {
				step = 1;
				first();
			});
			$('#sendCode').on('click', function() {
				$(this).addClass('disabled');
				var time = 60;
				$('#backClick').hide();
				var alarm = setInterval(function() {
					time--;
					$('#sendCode').text(time + '秒后可重新发送')
					if(time == 0) {
						clearInterval(alarm);
						$('#backClick').show();
						$('#sendCode').text('发送验证码')
					}
				}, 1000)

				//				set
				setTimeout(function() {
					$('#sendCode').removeClass('disabled');
				}, 60000)
			})
			$("#inputEmail").on('input', function() {
				$("#nullEmail").hide();
			})
			$("#inputPassword").on('input', function() {
				$('#nullPassword').hide();
			})
			$("#inputPasswordAgain").on('blur', function() {
				var password = $('[name = password]').val();
				var passwordAgain = $(this).val();
				if(password == "") {
					$('#nullPassword').show();
				} else {
					if(password != passwordAgain) {
						//					passwordAgainOk
						$("#passwordAgainFail").show();
					} else {
						$("#passwordAgainOk").show();
						$("#passwordAgainFail").hide();
					}
				}
			})

			function second() {
				var userEmail = $('[name = email]').val();
				if(userEmail == "") {
					$("#nullEmail").show();
				} else {
					$("#nullEmail").hide();
					$("#titFirst").attr('class', '');
					$("#titSecond").attr('class', 'titActive');
					$('.progress-bar').attr('aria-valuenow', '66');
					$('.progress-bar').text('66%');
					$('.progress-bar').css('width', '66%');
					$('#emailGroup').hide(flashTime);
					$('#emailCodeGroup').show(flashTime);
					$('#passwordAgainGroup').show(flashTime);
					$('#passwordGroup').show(flashTime);
					$('#emailValueGroup').show(flashTime);
					$('#userEmail').text(userEmail);
					step++;
				}

			}

			function first() {
				$("#titFirst").attr('class', 'titActive');
				$("#titSecond").attr('class', '');
				$('.progress-bar').attr('aria-valuenow', '30');
				$('.progress-bar').text('30%');
				$('.progress-bar').css('width', '30%');
				$('#emailGroup').show(flashTime);
				$('#emailCodeGroup').hide(flashTime);
				$('#passwordAgainGroup').hide(flashTime);
				$('#passwordGroup').hide(flashTime);
				$('#emailValueGroup').hide(flashTime);
			}

			function third() {
				$("#titFirst").attr('class', '');
				$("#titSecond").attr('class', '');
				$("#titThird").attr('class', 'titActive');
				$('.progress-bar').attr('aria-valuenow', '100');
				$('.progress-bar').text('100%');
				$('.progress-bar').css('width', '100%');
				$('#emailCodeGroup').hide(flashTime);
				$('#passwordAgainGroup').hide(flashTime);
				$('#passwordGroup').hide(flashTime);
				$('#emailValueGroup').hide(flashTime);
				$('#emailGroup').hide(flashTime);
				$('#finishGroup').show(flashTime);
				setTimeout(function() {
					window.location = '/';
				}, 3000)
			}
		})
	</script>

</html>