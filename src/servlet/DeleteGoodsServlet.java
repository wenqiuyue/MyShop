package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AllGoodsBean;
import bean.DeleteGoodsBean;
import model.Goods;

/**
 * Servlet implementation class DeleteGoodsServlet
 */
@WebServlet("/DeleteGoodsServlet")
public class DeleteGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteGoodsServlet() {
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
		int Id=Integer.parseInt(id);
		DeleteGoodsBean de=new DeleteGoodsBean();
		int i=de.deleteGoodsBean(Id);
		if(i>0) {
			System.out.println("删除商品成功");
			AllGoodsBean all=new AllGoodsBean();
			List<Goods> li=all.allGoodsBean();
			request.getSession().setAttribute("goodsLiebiao",li);
			
			response.sendRedirect("Goodsliebiao.jsp");
		}else {
			System.out.println("删除商品失败");
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
