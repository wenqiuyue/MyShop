package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AllGoodsBean;
import bean.UpdateGoodsBean;
import model.Goods;

/**
 * Servlet implementation class UpdateGoodsServlet
 */
@WebServlet("/UpdateGoodsServlet")
public class UpdateGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		String desc=request.getParameter("desc");
		int Id=Integer.parseInt(id);
		Goods g=new Goods();
		g.setGoodname(name);
		g.setGoodprice(price);
		g.setGooddesc(desc);
		g.setId(Id);
		UpdateGoodsBean update=new UpdateGoodsBean();
		int i=update.updateGoodsBean(g);
		if(i>0) {
			System.out.println("修改成功");
			AllGoodsBean all=new AllGoodsBean();
			List<Goods> up=all.allGoodsBean();
			response.sendRedirect("Goodsliebiao.jsp");
		}else {
			System.out.println("修改失败");
			response.sendRedirect("Goodsliebiao.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
