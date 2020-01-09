package bean;

import java.sql.SQLException;

import dao.ShopDao;
import daoImp.ShopDaoImp;
import model.User;

public class LoginBean {
public User Login(String name, String password) {
	ShopDao dao=null;
	try {
		dao = new ShopDaoImp();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	User u=dao.loginDao(name, password);
	return u;
		
}
}
