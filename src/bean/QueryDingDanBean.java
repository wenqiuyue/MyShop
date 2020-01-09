package bean;

import java.sql.SQLException;
import java.util.List;

import dao.ShopDao;
import daoImp.ShopDaoImp;
import model.Order;

public class QueryDingDanBean {
public List<Order> queryDingDanBean(int id){
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
	return shop.QueryDingDan(id);
}
}
