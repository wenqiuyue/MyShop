<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的购物车-小米商城</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
<%List<Goods> goods=(List<Goods>)session.getAttribute("gouwucheshow");
double total=0;%>

<div class="banner_x center">
			<a href="" target="_blank"><div class="logo fl"></div></a>
			
			<div class="wdgwc fl ml40">我的购物车</div>
			<div class="wxts fl ml20">温馨提示：产品是否购买成功，以最终下单为准哦，请尽快结算</div>
			<div class="dlzc fr">
			</div>
			<div class="clear"></div>
		</div>
		<div class="xiantiao"></div>
		<div class="gwcxqbj">
			<div class="gwcxd center">
				<div class="top2 center">
					<div class="sub_top fl">
						<input type="checkbox" value="quanxuan" class="quanxuan" />全选
					</div>
					<div class="sub_top fl">商品名称</div>
					<div class="sub_top fl">单价</div>
					<div class="sub_top fl">数量</div>
					<div class="sub_top fl">小计</div>
					<div class="sub_top fr">操作</div>
					<div class="clear"></div>
				</div>
				
				<%
				Goods g=null;
				if(goods!=null){
					for(int i=0;i<goods.size();i++){
						g=goods.get(i);%>
			
				<div class="content2 center">
					<div class="sub_content fl ">
						<input type="checkbox" value="quanxuan" class="quanxuan" name="check"/>
					</div>
					
					<div class="sub_content fl"><img src="<%=g.getGoodpic()%>" width="60" height="60"></div>
					<div class="sub_content fl ft20"><%=g.getGoodname() %></div>
					<div class="sub_content fl "><%=g.getGoodprice() %></div>
					<div class="sub_content fl">
						<input class="shuliang" type="number" value="1" step="1" min="1" >
					</div>
					<div class="sub_content fl"><%=g.getGoodprice() %></div>
					<div class="clear"></div>
				</div>
				<%double price=Double.parseDouble(g.getGoodprice());
				total=total+price;
			
				%>
				<%}} %>
			
			
			<div class="jiesuandan mt20 center">
				<div class="tishi fl ml20">
					<ul>
						<li><a href="liebiao.jsp">继续购物</a></li>
						<li>|</li>
						<li>共<span><%=goods.size() %></span>件商品</li>
						<div class="clear"></div>
					</ul>
				</div>
				
				<div class="jiesuan fr">
					<div class="jiesuanjiage fl">合计（不含运费）：<span><%=total%>元</span></div>
					<form action="DingDanServlet" method="post">
					<div class="jsanniu fr"><input class="jsan" type="submit" name="jiesuan"  value="去结算" onclick="show()"/></div>
					</form>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
			
		</div>
<footer class="center">
			
			<div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
			<div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>

</body>
<script type="text/javascript">
function show(){
	alert("恭喜你成功购买商品");
}
</script>
</html>