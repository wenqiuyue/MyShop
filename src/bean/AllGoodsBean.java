package bean;

import java.sql.SQLException;
import java.util.List;

import dao.ShopDao;
import daoImp.ShopDaoImp;
import model.Goods;

public class AllGoodsBean {
public List<Goods> allGoodsBean(){
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
	return shop.AllGoodsDao();
}
}
