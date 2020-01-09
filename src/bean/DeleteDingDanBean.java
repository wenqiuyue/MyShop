package bean;

import java.sql.SQLException;

import dao.ShopDao;
import daoImp.ShopDaoImp;

public class DeleteDingDanBean {
public int deleteDingDanBean(int id) {
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
	return shop.DeleteDingDanDao(id);
}
}
