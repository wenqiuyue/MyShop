package bean;

import java.sql.SQLException;
import java.util.List;

import dao.ShopDao;
import daoImp.ShopDaoImp;
import model.Order;

public class AllOrderBean {
public List<Order> allOrderBean(){
	ShopDao shop=null;
	try {
		shop = new ShopDaoImp();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return shop.AllOrderDao();
}
}
