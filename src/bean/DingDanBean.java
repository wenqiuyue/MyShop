package bean;

import java.sql.SQLException;

import dao.ShopDao;
import daoImp.ShopDaoImp;
import model.Order;

public class DingDanBean {
public int dingDanBean(Order o) {
	ShopDao shop=null;
	try {
		shop = new ShopDaoImp();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return shop.DingDanDao(o);
}
}
