package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.RegisterBean;
import model.User;

/**
 * Servlet implementation class ShopRegsterServlet
 */
@WebServlet("/ShopRegsterServlet")
public class ShopRegsterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopRegsterServlet() {
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
		//获取前台注册传来的值
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String tel=request.getParameter("tel");
		
		User u=new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setPhone(tel);
		u.setUsertype("1");
		RegisterBean register=new RegisterBean();
		int i=register.Register(u);
		if(i>0) {
			System.out.println("注册成功");
			
			response.sendRedirect("login.jsp");
		}else {
			System.out.println("注册失败");
			response.sendRedirect("register.html");
		}
		
	}

}
