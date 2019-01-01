package com.jike.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jike.entity.User;
import com.jike.service.CheakUserService;

/**
 * Servlet implementation class CheakServlet
 */
@WebServlet("/CheakServlet")
public class CheakServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CheakUserService cheakUserService=new CheakUserService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheakServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String passwd=request.getParameter("upwd");
		RequestDispatcher requestDispatcher=null;
		System.out.println("====dopost========");
		String forward=null;
		if (uname==null||passwd==null) {
			request.setAttribute("msg", "用户名或密码为空");
			requestDispatcher=request.getRequestDispatcher("/15/error.jsp");
			requestDispatcher.forward(request, response);
		} else {
			User user=new User();
			user.setName(uname);
			user.setPassword(passwd);
			boolean bool =cheakUserService.cheak(user);
			if (bool) {
				forward="/15/success.jsp";
				System.out.println();
			} else {
				request.setAttribute("msg", "用户名或密码输入错误,请重新输入");
				forward="/15/error.jsp";
			}
			requestDispatcher=request.getRequestDispatcher(forward);
			requestDispatcher.forward(request, response);
		}
	}

}
