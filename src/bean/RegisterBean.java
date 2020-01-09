package bean;

import java.sql.SQLException;

import dao.ShopDao;
import daoImp.ShopDaoImp;
import model.User;

public class RegisterBean {
	public int Register(User u) {
		ShopDao dao=null;
		try {
			dao = new ShopDaoImp();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dao.RegisterDao(u);
	}

}
