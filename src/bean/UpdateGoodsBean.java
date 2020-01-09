package bean;

import java.sql.SQLException;

import dao.ShopDao;
import daoImp.ShopDaoImp;
import model.Goods;

public class UpdateGoodsBean {
public int updateGoodsBean(Goods g) {
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
	return shop.UpdateGoodsDao(g);
}
}
