package dao;

import java.util.List;

import model.*;


public interface ShopDao {
	//定义注册方法的接口
	public int RegisterDao(User u);
	
	//定义登录方法接口
	public User loginDao(String name,String password);
	
	//定义搜索商品接口
	public List<Goods> searchDao(String key);
	
	//定义添加商品接口
	public int AddGoodsDao(Goods g);
	
	//定义修改用户信息接口
	public int UpdateUserDao(User u);
	
	//查询用户信息
	public User QueryUserDao(int id);
	
	//查询所有用户信息
	public List<User> AllUserDao();
	
	//删除用户
	public int DeleteUserDao(int id);
	
	//添加订单
	public int DingDanDao(Order o);
	
	//查询订单
	public List<Order> QueryDingDan(int id);
	
	//删除订单
	public int DeleteDingDanDao(int id);
	
	//查看所有商品信息
	public List<Goods> AllGoodsDao();
	
	//删除商品
	public int DeleteGoodsDao(int id);
	
	//修改商品信息
	public int UpdateGoodsDao(Goods g);
	
	//查询所有订单
	public List<Order> AllOrderDao();

}
