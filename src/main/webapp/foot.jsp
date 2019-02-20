<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="icon" href="http://p0.meituan.net/merchantpic/23b79725bae58f57fc22400187cc0bed33254.jpg" type="img/x-ico" />
		<title>foot</title>
		<style type="text/css">
			#goToTop {
				position: fixed;
				bottom: 20%;
				right: 5%;
			}
			
			#goToTop a img {
				width: 60px;
			}
			
			.foot{
				background-color: #f8f8f8;
				width: 100%;
				height: 130px;
			}
		</style>
	</head>
	<!--
author:panda
computer:@Berenice
createTime:2019年2月17日 下午3:16:49
-->

	<body>
		<div id="goToTop">
			<a href="javascript:;">
				<img src="img/totop.png" />
			</a>
		</div>
		<div class="foot">
			<blockquote class="pull-right" >
				<p>
					收藏夹管理系统
				</p> <small>panda <cite>2019</cite></small>
			</blockquote>
		</div>
	</body>
	<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
	<script type="text/javascript">
		$('#goToTop a').click(function() {
			$('html , body').animate({
				scrollTop: 0
			}, 'slow');
		});
	</script>

</html>