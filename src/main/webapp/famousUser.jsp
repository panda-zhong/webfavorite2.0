<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="icon" href="http://p0.meituan.net/merchantpic/23b79725bae58f57fc22400187cc0bed33254.jpg" type="img/x-ico" />
		<title>知名用户</title>
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
				border-bottom: 1px solid #e5e9ef;
			}
			
			.userLogo img {
				position: absolute;
				width: 120px;
				left: 0;
				top: 40px;
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
			
			.userCollectList .website {
				position: relative;
				width: 150px;
				padding-left: 50px;
				padding-bottom: 10px;
				padding-top: 10px;
				color: black;
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
									<a href="javascript:" class="btn btn-small btn-success likeUserOp">关注</a>
									<p>
										<small>收藏：<span id="collect">
											3
										</span>
										&nbsp;&nbsp;&nbsp; 粉丝：
										<span id="funs">2</span>
										</small>
									</p>
									<p>
										<span id="introduction">
											哈哈哈哈哈哈哈或或或或或
										</span>
									</p>
								</div>
								<div class="info-foot">
									<ul class="userCollectList list-unstyled">
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
						</li>

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
									<a href="" class="btn btn-small btn-success ">关注</a>
									<a href="javascript:" class="btn btn-small btn-warning unlikeUser">已关注</a>
									<p>
										<small>收藏：<span id="collect">
											3
										</span>
										&nbsp;&nbsp;&nbsp; 粉丝：
										<span id="funs">2</span>
										</small>
									</p>
									<p>
										<span id="introduction">
											哈哈哈哈哈哈哈或或或或或
										</span>
									</p>
								</div>
								<div class="info-foot">
									<ul class="userCollectList list-unstyled">
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
						</li>

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
									<a href="" class="btn btn-small btn-success ">关注</a>
									<a href="" class="btn btn-small btn-warning disabled">已关注</a>
									<p>
										<small>收藏：<span id="collect">
											3
										</span>
										&nbsp;&nbsp;&nbsp; 粉丝：
										<span id="funs">2</span>
										</small>
									</p>
									<p>
										<span id="introduction">
											哈哈哈哈哈哈哈或或或或或
										</span>
									</p>
								</div>
								<div class="info-foot">
									<ul class="userCollectList list-unstyled">
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
						</li>
					</ul>
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
			$("#famousUser").attr('class', 'active');
			$(".website").hover(function() {
				$(this).children('.websiteDetail').show(100);
			}, function() {
				$(this).children('.websiteDetail').hide(100);
			})
			$('.likeUserOp').on('click', function() {
				var op = $(this).text();
				if(op == '关注') {
					$(this).text('已关注')
					$(this).attr('class', 'btn btn-small btn-warning likeUserOp');
				} else {
					$(this).text('关注')
					$(this).attr('class', 'btn btn-small btn-success  likeUserOp');
				}
			})

		})
	</script>

</html>