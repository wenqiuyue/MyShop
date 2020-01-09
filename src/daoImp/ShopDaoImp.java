package daoImp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ShopDao;
import model.Goods;
import model.Order;
import model.User;
import util.ShopDbutil;

public class ShopDaoImp implements  ShopDao {
	//连接数据库
	ShopDbutil shopdb=null;
	public ShopDaoImp() throws ClassNotFoundException, SQLException {
		shopdb=new ShopDbutil();
	}

	@Override
	public int RegisterDao(User u) {
		// TODO Auto-generated method stub
		//定义注册用户的sql语句
		String sql="insert into userinfo(username,password,phone,usertype) values(?,?,?,?)";
		//执行sql语句
		PreparedStatement pre=shopdb.PrepareSt(sql);
		try {
			pre.setString(1, u.getUsername());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(2, u.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(3, u.getPhone());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(4, u.getUsertype());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int i=-1;
		try {
			i = pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public User loginDao(String name, String password) {
		// TODO Auto-generated method stub
		String sql="select * from userinfo where username=? and password=?";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		try {
			pre.setString(1, name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(2, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
		ResultSet re=null;
		try {
			re = pre.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(re == null)
			return null;
		
		User u=null;
		try {
			while(re.next()) {
				u=new User();
				u.setUsername(re.getString("username"));
				u.setPassword(re.getString("password"));
				u.setUsertype(re.getString("usertype"));
				u.setPhone(re.getString("phone"));
				u.setAddress(re.getString("address"));
				u.setId(re.getInt("Id"));
				return u;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
		
	}

	@Override
	public List<Goods> searchDao(String key) {
		// TODO Auto-generated method stub
		String sql="select * from goods where goodname like'%"+key+"%'";
		ResultSet re=shopdb.DoQuery(sql);
		List<Goods> goods=new ArrayList<Goods>();
		try {
			while(re.next()) {
				Goods g=new Goods();
				g.setGoodname(re.getString("goodname"));
				g.setGoodprice(re.getString("goodprice"));
				g.setGoodpic(re.getString("goodpic"));
				g.setGooddesc(re.getString("gooddesc"));
				g.setGoodpic1(re.getString("goodpic1"));
				goods.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return goods;
	}

	@Override
	public int AddGoodsDao(Goods g) {
		// TODO Auto-generated method stub
		String sql="insert into goods(goodname,goodprice,gooddesc,goodpic,goodpic1) values(?,?,?,?,?)";
		PreparedStatement pre= shopdb.PrepareSt(sql);
		try {
			pre.setString(1, g.getGoodname());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(2, g.getGoodprice());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(3, g.getGooddesc());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(4, g.getGoodpic());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(5, g.getGoodpic1());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=-1;
		try {
			i = pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public int UpdateUserDao(User u) {
		// TODO Auto-generated method stub
		String sql="update userinfo set username=?,phone=?,address=? where id=?";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		try {
			pre.setString(1, u.getUsername());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(2, u.getPhone());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(3, u.getAddress());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setInt(4, u.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=-1;
		try {
			i = pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public User QueryUserDao(int id) {
		// TODO Auto-generated method stub
		String sql="select * from userinfo where id=?";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		try {
			pre.setInt(1, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet re=null;
		try {
			re = pre.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User u=null;
		try {
			while(re.next()) {
				
					u=new User();
					u.setUsername(re.getString("username"));
					u.setPassword(re.getString("password"));
					u.setUsertype(re.getString("usertype"));
					u.setPhone(re.getString("phone"));
					u.setAddress(re.getString("address"));
					u.setId(re.getInt("Id"));
					return u;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}

	@Override
	public List<User> AllUserDao() {
		System.out.println("jin");
		// TODO Auto-generated method stub
		String sql="select * from userinfo";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		ResultSet re=null;
		try {
			re = pre.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<User> list=new ArrayList<User>();
		try {
			System.out.println("123");
			while(re.next()) {
				User u=new User();
				u.setUsername(re.getString("username"));
				u.setPassword(re.getString("password"));
				u.setUsertype(re.getString("usertype"));
				u.setPhone(re.getString("phone"));
				u.setAddress(re.getString("address"));
				u.setId(re.getInt("Id"));
				list.add(u);
				System.out.println("list.size()"+list.size());
			}
		} catch (SQLException e) {
			System.out.println("12");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int DeleteUserDao(int id) {
		// TODO Auto-generated method stub
		String sql="delete from userinfo where Id=?";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		try {
			pre.setInt(1, id);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int i=-1;
		try {
			i = pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int DingDanDao(Order o) {
		// TODO Auto-generated method stub
		String sql="insert into orders(name,price,pic,userid) values(?,?,?,?)";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		try {
			pre.setString(1, o.getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(2, o.getPrice());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(3, o.getPic());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setInt(4, o.getUserid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=-1;
		try {
			i = pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<Order> QueryDingDan(int id) {
		// TODO Auto-generated method stub
		String sql="select * from orders where userid=?";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		try {
			pre.setInt(1, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet re=null;
		try {
			re = pre.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Order> li=new ArrayList<Order>();
		try {
			while(re.next()) {
				Order o=new Order();
				o.setId(re.getInt("Id"));
				o.setName(re.getString("name"));
				o.setPrice(re.getString("price"));
				o.setPic(re.getString("pic"));
				o.setUserid(re.getInt("userid"));
				li.add(o);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}

	@Override
	public int DeleteDingDanDao(int id) {
		// TODO Auto-generated method stub
		String sql="delete from orders where Id=?";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		try {
			pre.setInt(1, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=-1;
		try {
			i = pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<Goods> AllGoodsDao() {
		// TODO Auto-generated method stub
		String sql="select * from goods";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		ResultSet re=null;
		try {
			re = pre.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Goods> li=new ArrayList<Goods>();
		try {
			while(re.next()) {
				Goods g=new Goods();
				g.setId(re.getInt("Id"));
				g.setGoodname(re.getString("goodname"));
				g.setGoodprice(re.getString("goodprice"));
				g.setGooddesc(re.getString("gooddesc"));
				g.setGoodpic1(re.getString("goodpic1"));
				li.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}

	@Override
	public int DeleteGoodsDao(int id) {
		// TODO Auto-generated method stub
		String sql="delete from goods where id=?";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		try {
			pre.setInt(1, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=-1;
		try {
			i = pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int UpdateGoodsDao(Goods g) {
		// TODO Auto-generated method stub
		String sql="update goods set goodname=?,goodprice=?,gooddesc=? where Id=?";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		try {
			pre.setString(1, g.getGoodname());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(2, g.getGoodprice());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setString(3, g.getGooddesc());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pre.setInt(4, g.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=-1;
		try {
			i = pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<Order> AllOrderDao() {
		// TODO Auto-generated method stub
		String sql="select * from orders";
		PreparedStatement pre=shopdb.PrepareSt(sql);
		ResultSet re=null;
		try {
			re = pre.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Order> list=new ArrayList<Order>();
		try {
			while(re.next()) {
				Order or=new Order();
				or.setName(re.getString("name"));
				or.setPrice(re.getString("price"));
				or.setPic(re.getString("pic"));
				list.add(or);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	

}
