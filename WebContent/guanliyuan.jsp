<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>小米商城</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
	</head>
</head>
<body>

<header>
			<div class="top center">
				<div class="left fl">
					<ul>
						<li><a href="http://www.mi.com/" target="_blank">小米商城</a></li>
						<li>|</li>
						<li><a href="">MIUI</a></li>
						<li>|</li>
						<li><a href="">米聊</a></li>
						<li>|</li>
						<li><a href="">游戏</a></li>
						<li>|</li>
						<li><a href="">多看阅读</a></li>
						<li>|</li>
						<li><a href="">云服务</a></li>
						<li>|</li>
						<li><a href="">金融</a></li>
						<li>|</li>
						<li><a href="">小米商城移动版</a></li>
						<li>|</li>
						<li><a href="">问题反馈</a></li>
						<li>|</li>
						<li><a href="">Select Region</a></li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="right fr">
				
					<div class="fr">
						<ul>
							<li>欢迎来到小米之家</li>
							<li>|</li>
							<li><a href="">商城</a></li>
							
						</ul>
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</header>
	<!--end header -->
<form name="form1" method="post" action="AddShopGoods" enctype="multipart/form-data">
<br><br>
  <p>添加商品</p>
  <br><br>
  <table width="500" border="1">
    <tr>
      <th width="98" scope="col">商品名称</th>
      <th width="386" scope="col"><label for="textfield"></label>
      <input type="text" name="goodsname" id="goodsname" ></th>
    </tr>
    <tr>
      <th width="98" scope="col">商品价格</th>
      <th width="386" scope="col"><label for="textfield"></label>
      <input type="text" name="goodsprice" id="goodsprice"></th>
    </tr>
    <tr>
      <td height="187">商品介绍</td>
      <td><label for="textarea"></label>
      <textarea name="goodsdesc" id="goodsdesc" cols="80" rows="12"></textarea></td>
    </tr>
    <tr>
      <th width="98" scope="col">列表图片</th>
      <th width="386" scope="col"><label for="textfield"></label>
      <input type="file" name="goodpic" id="filename1"></th>
    </tr>
    <tr>
      <th width="98" scope="col">详情图片</th>
      <th width="386" scope="col"><label for="textfield"></label>
      <input type="file" name="goodpic1" id="filename2"></th>
    </tr>
    <tr>
      <td height="41" colspan="2">  <input type="submit" name="button" id="button" value="提交"></td>
    </tr>
  </table>
</form>

		<footer class="mt20 center">			
			<div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
			<div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>
</body>
</html>