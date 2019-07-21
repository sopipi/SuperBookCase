package controller;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import entity.ShoppingOrderUBook;
import service.ShoppingOrderUBookService;

/**
 * Servlet implementation class ShowBookAndOrder
 */
@WebServlet(urlPatterns = "/ShowBookAndOrder")
public class ShowBookAndOrder extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	private ShoppingOrderUBookService sobookservice = new  ShoppingOrderUBookService();
	private ShoppingOrderUBook sobook = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowBookAndOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取前端返回的订单号
		String str = req.getParameter("shoppingOrderId");
		int shoppingOrderId = Integer.parseInt(str);
		//调用service获取信息
		sobook = sobookservice.selectByShoppingOrderId(shoppingOrderId);
		//返回信息
		String result = JSON.toJSONString(sobook);
		resp.setContentType("application/json;character=utf-8");
		resp.getWriter().write(result);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
