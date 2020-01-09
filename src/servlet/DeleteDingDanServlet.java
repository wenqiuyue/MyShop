package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DeleteDingDanBean;
import bean.QueryDingDanBean;
import model.Order;

/**
 * Servlet implementation class DeleteDingDanServlet
 */
@WebServlet("/DeleteDingDanServlet")
public class DeleteDingDanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDingDanServlet() {
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
		String uid=request.getParameter("userid");
		int Id=Integer.parseInt(id);
		int Uid=Integer.parseInt(uid);
		DeleteDingDanBean de=new DeleteDingDanBean();
		int i=de.deleteDingDanBean(Id);
		if(i>0) {
			QueryDingDanBean que=new QueryDingDanBean();
			List<Order> li=que.queryDingDanBean(Uid);
			request.getSession().setAttribute("queryList", li);
			System.out.println("É¾³ý¶©µ¥³É¹¦");
			response.sendRedirect("dingdanzhongxin.jsp");
		}else {
			System.out.println("É¾³ý¶©µ¥Ê§°Ü");
			response.sendRedirect("dingdanzhongxin.jsp");
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
