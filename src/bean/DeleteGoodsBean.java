package bean;

import java.sql.SQLException;

import dao.ShopDao;
import daoImp.ShopDaoImp;

public class DeleteGoodsBean {
public int deleteGoodsBean(int id) {
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
	return shop.DeleteGoodsDao(id);
}
}
