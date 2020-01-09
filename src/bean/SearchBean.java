package bean;
import java.sql.SQLException;
import java.util.List;

import dao.ShopDao;
import daoImp.ShopDaoImp;
import model.Goods;
public class SearchBean {
public List<Goods> searchBean(String key){
	ShopDao search=null;
	try {
		search = new ShopDaoImp();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return search.searchDao(key);
	
}
}
