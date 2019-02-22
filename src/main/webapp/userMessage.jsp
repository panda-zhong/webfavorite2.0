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
			
			.message {
				padding: 24px 16px;
				background-color: #fff;
				margin-bottom: 10px;
				border-radius: 4px;
				width: 700px;
				box-shadow: 0 2px 4px 0 rgba(121, 146, 185, .54);
			}
			
			.messageList {
				width: 800px;
				float: left;
				margin-top: 20px;
			}
			
			.messageDetail {
				font-size: 12px;
				line-height: 12px;
				color: #666;
			}
			
			#messageUser {
				color: #333;
				font-weight: 700;
			}
			
			#messageTime {
				color: #999;
				font-size: 12px;
				line-height: 22px;
				margin: 0 10px;
			}
			
			.leftNav {
				width: 200px;
				float: left;
				display: inline-block;
				box-sizing: border-box;
				list-style-type: disc;
				-webkit-margin-before: 1em;
				-webkit-margin-after: 1em;
				-webkit-margin-start: 0px;
				-webkit-margin-end: 0px;
				-webkit-padding-start: 40px;
				margin-top: 20px;
				margin-right: 20px;
				background-color: RGB(247, 247, 247);
			}
			
			.leftNav li {
				height: 40px;
				position: relative;
				color: #6b757b;
				font-size: 14px;
				font-weight: 700;
				color: #666;
			}
			
			.leftNav li a {
				outline: 0;
				padding: 0;
				margin: 0;
				border: 0;
				background-color: transparent;
				padding-left: 10px;
				line-height: 40px;
				-ms-flex: 1;
				flex: 1;
				color: #6b757b;
			}
			
			.leftNav li a:hover {
				text-decoration: none;
			}
			
			.leftNav li a:active {
				text-decoration: none;
			}
			
			.leftActive a {
				color: #2faee3 !important;
			}
			
			.label-info {
				margin-left: 5px;
			}
			
			.webInfo {
				margin-top: 20px;
			}
			
			.webInfoLeft {
				font-size: 14px;
				font-weight: 700;
				color: #666;
				height: 62px;
				-ms-flex-pack: center;
				justify-content: center;
				display: flex;
				-ms-flex-align: center;
				align-items: center;
				width: 200px;
				float: left;
				margin-right: 20px;
				background-color: RGB(247, 247, 247);
			}
			.webInfoRIght{
				padding: 24px 16px;
				background-color: #fff;
				margin-bottom: 10px;
				border-radius: 4px;
				width: 700px;
				box-shadow: 0 2px 4px 0 rgba(121, 146, 185, .54);
				float: left;
				      font-size: 15px;
    color: #666;
			}
			#nav{
				margin-top: 25px;
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
									<img alt="140x140" src="${USERINSESSION.logo}" class="img-circle" />
								</a>
							</div>
							<div class="detailInfo">
								<div class="info-head">
									<a href="">
										<h2 class="userName"><strong>${USERINSESSION.name}	</strong></h2>
									</a>
									<p>
										<small>
										<a href="">
										关注：<span id="collect">
										${USERINSESSION.idolSize}										
										</span>
										</a>
										&nbsp;&nbsp;&nbsp; 
										<a href="">
											粉丝：
											<span id="funs">${USERINSESSION.funsSize}</span>
											
										</a>
										</small>
									</p>
									<p>
										<span id="introduction">
											${USERINSESSION.introduction}
										</span>
									</p>
								</div>
							</div>
						</li>
					</ul>
				</div>
				<div class="row" id="nav">
					<ul class="nav nav-pills">
						<li role="presentation">
							<a href="userIndex.jsp">收藏<span class="label label-info">30</span></a>
						</li>
						<li role="presentation" class="active">
							<a href="userMessage.jsp">信息<span class="label label-info">${UNREADSIZE}</span></a>
						</li>
						<li role="presentation">
							<a href="userInfo.jsp">资料</a>
						</li>
					</ul>
				</div>

				<div class="row">
					<div class="webInfo">
						<div class="webInfoLeft">
							<span class="glyphicon glyphicon-send" aria-hidden="true">&nbsp;消息中心</span>
						</div>
						<div class="webInfoRIght">
							回复我的
						</div>
					</div>
				</div>

				<div class="row">
					<ul class="leftNav">
						<li class="leftActive" id="left1">
							<a href="javascript:">回复我的</a>
						</li>
						<li id="left2">
							<a href="javascript:">收到的赞</a>
						</li>
						<li id="left3">
							<a href="javascript:">
								系统通知
							</a>
						</li>
					</ul>
					<div class="messageList">
					<c:forEach items="${USERMESSAGEINSESSION}" var="message"></c:forEach>
						<div class="message">
							<div class="messageTop">
								<span id="messageUser">${message.from}</span>
								<span id="messageTime">${message.time}</span>
							</div>
							<div class="messageDetail">
								${message.detail}
							</div>
						</div>
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
			$(".leftNav li").on('click', function() {
				$(".leftNav li").removeClass();
				var leftText = $(this).children('a').text();
				$(this).attr('class', 'leftActive')
				$('.webInfoRIght').text(leftText.replace(/\d+/g,''));
			})
			$("#left1").on('click',function(){
				getUserMessage();
			})
			$("#left2").on('click',function(){
				getLikeMessage();
			})
			$("#left3").on('click',function(){
				getAdminMessage();
			})
			$("#left1Number").text(5);
			getUserMessage();
			setReadState();
			function getUserMessage(){
				$.ajax({
					type:"get",
					url:"user/message/getByUser",
					contentType: "application/x-www-form-urlencoded; charset=utf-8", 
					data:{ 
						
					},
					dataType:"json",
					success:function(result){
						var messageList = result;
						setMessage(messageList)
					},
					async:true
				});
			}
			function setReadState (){
				$.ajax({
					type:"get",
					url:"user/message/setReadState",
					data:{ 
					},
					dataType:"json",
					success:function(result){
					},
					async:true
				});
			}
			function getAdminMessage(){
				$.ajax({
					type:"get",
					url:"user/message/getByAdmin",
					contentType: "application/x-www-form-urlencoded; charset=utf-8", 
					data:{ 
						
					},
					dataType:"json",
					success:function(result){
						var messageList = result;
						setMessage(messageList)
					},
					async:true
				});
			}
			function getLikeMessage(){
				$.ajax({
					type:"get",
					url:"user/message/getByLike",
					contentType: "application/x-www-form-urlencoded; charset=utf-8", 
					data:{ 
						
					},
					dataType:"json",
					success:function(result){
						var messageList = result;
						setMessage(messageList)
					},
					async:true
				});
			}
			
			function setMessage(messageList){
				var messageSize = messageList.length;
				var messageListDiv = $(".messageList");
				messageListDiv.empty()
				for(i=0;i<messageSize;i++){
					var message = $("<div class='message'></div>")
					var messageTop = $("<div class='messageTop'></div>")
					var messageUser = $("<span id='messageUser'></span>")
					messageUser.text(messageList[i].from);
					var messageTime = $("<span id='messageTime'></span>")
					messageTime.text(messageList[i].time);
					messageTop.append(messageUser)
					messageTop.append(messageTime);
					var messageDetail = $("<div class='messageDetail'></div>") 
					messageDetail.text(messageList[i].detail);
					message.append(messageTop);
					message.append(messageDetail);
					messageListDiv.append(message)
				}
			}
		})
	</script>

</html>