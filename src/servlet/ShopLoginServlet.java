package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AllGoodsBean;
import bean.AllOrderBean;
import bean.AllUserBean;
import bean.LoginBean;
import model.Goods;
import model.Order;
import model.User;

/**
 * Servlet implementation class ShopLoginServlet
 */
@WebServlet("/ShopLoginServlet")
public class ShopLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		LoginBean loginBean=new LoginBean();
		User u=loginBean.Login(username, password);
		if(u!=null) {
		
			System.out.println("µÇÂ¼³É¹¦");
			request.getSession().setAttribute("user", u);
			if(u.getUsertype().equals("0")) {
				AllUserBean allBean=new AllUserBean();
				List<User> li=allBean.allUserBean();
				System.out.println(li.size());
				request.getSession().setAttribute("all", li);
				
				AllGoodsBean allGoods=new AllGoodsBean();
				List<Goods> goodsList=allGoods.allGoodsBean();
				request.getSession().setAttribute("goodsLiebiao", goodsList);
				
				AllOrderBean allOrder=new AllOrderBean();
				List<Order> orderlist=allOrder.allOrderBean();
				request.getSession().setAttribute("OrderLiebiao",orderlist);
				response.sendRedirect("yemian.jsp");
			}
			if(u.getUsertype().equals("1")) {
				response.sendRedirect("index.jsp");
			}
		}else {
			System.out.println("µÇÂ¼Ê§°Ü");
			response.sendRedirect("login.jsp");
		}
		
	}

}
