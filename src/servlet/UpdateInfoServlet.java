package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.QueryUserBean;
import bean.UpdateUserBean;
import model.User;

/**
 * Servlet implementation class UpdateInfoServlet
 */
@WebServlet("/UpdateInfoServlet")
public class UpdateInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateInfoServlet() {
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
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String tel=request.getParameter("tel");
		String address=request.getParameter("address");
		String id=request.getParameter("id");
		int Id=Integer.parseInt(id);
		User u=new User();
		u.setUsername(username);
		u.setPhone(tel);
		u.setAddress(address);
		u.setId(Id);
		System.out.println(username+tel+address+id);
		UpdateUserBean update=new UpdateUserBean();
		int i=update.updateUserBean(u);
		if(i>0) {
			System.out.println("信息修改成功");
			QueryUserBean query=new QueryUserBean();
			User user=query.queryUserBean(Id);
			request.getSession().setAttribute("user", user);
			response.sendRedirect("update_info.jsp");
		
		}else{
			System.out.println("信息修改失败");
			response.sendRedirect("update_info.jsp");
		}
		
		
		
	}

}
