package servlet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import bean.AddGoodsBean;
import bean.AllGoodsBean;
import model.Goods;

/**
 * Servlet implementation class AddShopGoods
 */
@MultipartConfig
@WebServlet("/AddShopGoods")
public class AddShopGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String contextPath;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddShopGoods() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException {
        contextPath = getServletContext().getRealPath("/");
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
		String goodsname=request.getParameter("goodsname");
		String goodsprice=request.getParameter("goodsprice");
		String goodsdesc=request.getParameter("goodsdesc");
		Part part1=request.getPart("goodpic");
		Part part2=request.getPart("goodpic1");
		System.out.println(part1+"part1");
		String f1=getFileName(part1);
		String f2=getFileName(part2);
		System.out.println(f1+f2);
		
		writeTo(f1,part1);
		writeTo(f2,part2);
		
		Goods g=new Goods();
		g.setGoodname(goodsname); 
		g.setGoodprice(goodsprice);
		g.setGooddesc(goodsdesc);
		g.setGoodpic(f1);
		g.setGoodpic1(f2);
		
	    AddGoodsBean addgoods=new AddGoodsBean();
	    int i=addgoods.addGoodsBean(g);
//	    List <Goods> list=new ArrayList<Goods>();
//	    list.add(g);
//	    if(i>0) {
	    	
//	    	request.setAttribute("goods", list);
//	    }
	    System.out.println("商品添加成功");
	    AllGoodsBean all=new AllGoodsBean();
		List<Goods> li=all.allGoodsBean();
		request.getSession().setAttribute("goodsLiebiao",li);
		request.getRequestDispatcher("Goodsliebiao.jsp").forward(request, response);
//		request.getRequestDispatcher("xiangqing.jsp").forward(request, response);
		
	}
	//取得上传文件名
	private String getFileName(Part part) {
        String header = part.getHeader("Content-Disposition");
        System.out.println(header+"-------header");
//        String fileName = header.substring(header.indexOf("filename=\"") + 10,
//                header.lastIndexOf("\""));
        String fileName=header.substring(header.lastIndexOf("=")+2, header.length()-1);
        System.out.println("文件名"+fileName);
        return fileName;
        
        
}
	private void writeTo(String fileName, Part part) throws IOException, FileNotFoundException {
        InputStream in = part.getInputStream();
        System.out.println("contextPath"+contextPath);
        OutputStream out = new FileOutputStream(contextPath+fileName);
     
        byte[] buffer = new byte[1024];
        int length = -1;
        while ((length = in.read(buffer)) != -1) {
            out.write(buffer, 0, length);
        }
        in.close();
        out.close();
    }

}
