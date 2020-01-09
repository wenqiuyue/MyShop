package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Goods;

/**
 * Servlet implementation class GouWuCheServlet
 */
@WebServlet("/GouWuCheServlet")
public class GouWuCheServlet extends HttpServlet {
	List<Goods> list=new ArrayList<Goods>();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GouWuCheServlet() {
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
		//doGet(request, response);
		request.setCharacterEncoding("utf-8");
		String goodpic=request.getParameter("goodpic");
		String goodname=request.getParameter("goodname");
		String goodprice=request.getParameter("goodprice");
		System.out.println(goodpic+goodname+goodprice);
		
		  
		Goods goods=new Goods();
	
		
		goods.setGoodpic(goodpic);
		goods.setGoodname(goodname);
		goods.setGoodprice(goodprice);
		list.add(goods);
	
		request.getSession().setAttribute("gouwuche",list);
		ArrayList<Goods> goodslist = (ArrayList<Goods>)request.getSession().getAttribute("gouwuche"); 
		request.getSession().setAttribute("gouwucheshow",goodslist);
		response.sendRedirect("liebiao.jsp");
		System.out.println(goodslist.size());
		
	}

}
