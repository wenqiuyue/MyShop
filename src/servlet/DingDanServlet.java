package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DingDanBean;
import bean.QueryDingDanBean;
import model.Goods;
import model.Order;
import model.User;

/**
 * Servlet implementation class DingDanServlet
 */
@WebServlet("/DingDanServlet")
public class DingDanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DingDanServlet() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		
		ArrayList<Goods> goodslist = (ArrayList<Goods>)request.getSession().getAttribute("gouwucheshow");
		User user=(User)request.getSession().getAttribute("user");
		System.out.println(goodslist.size()+"hjkds"+user.getId());
		for(int i=0;i<goodslist.size();i++) {
			Goods g=goodslist.get(i);
			String name=g.getGoodname();
			String price=g.getGoodprice();
			String pic=g.getGoodpic();
			int id=user.getId();
			Order o=new Order();
			o.setName(name);
			o.setPrice(price);
			o.setPic(pic);
			o.setUserid(id);
			DingDanBean ding=new DingDanBean();
			int k=ding.dingDanBean(o);
			if(k>0) {
				System.out.println("第"+i+"条数据插入成功");
			}
		}
		
		QueryDingDanBean que=new QueryDingDanBean();
		List<Order> queryList=que.queryDingDanBean(user.getId());
		request.getSession().setAttribute("queryList", queryList);
		response.sendRedirect("dingdanzhongxin.jsp");
		
		
	}

}
