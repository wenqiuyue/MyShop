package bean;

import java.sql.SQLException;

import dao.ShopDao;
import daoImp.ShopDaoImp;
import model.User;

public class QueryUserBean {
public User queryUserBean(int id) {
	ShopDao user=null;
	try {
		user = new ShopDaoImp();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return user.QueryUserDao(id);
}
}
