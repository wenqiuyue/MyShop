package bean;

import java.sql.SQLException;

import dao.ShopDao;
import daoImp.ShopDaoImp;
import model.User;

public class UpdateUserBean {
public int updateUserBean(User u) {
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
	return shop.UpdateUserDao(u);
}
}
