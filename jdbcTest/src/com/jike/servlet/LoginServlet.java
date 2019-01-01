package com.jike.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5864346102781070171L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=====进入doGet方法====");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=====进入doPost方法====");
		String userName=req.getParameter("uname");
		String password=req.getParameter("upwd");
		System.out.println("用户名==》"+userName);
		System.out.println("密码==》"+password);
		
		String forward=null;
		
		if (userName.equals("darkmi")&&password.equals("jike")) {
			forward="/14/mysuccess.jsp";
			RequestDispatcher requestDispatcher=req.getRequestDispatcher(forward);
			//转发
			requestDispatcher.forward(req, resp);
			//重定向
//			resp.sendRedirect(req.getContextPath()+"/14/mysuccess.jsp");
		}else {
			forward="/14/myerror.jsp";
			RequestDispatcher requestDispatcher=req.getRequestDispatcher(forward);
			//转发
			requestDispatcher.forward(req, resp);
			//重定向
			//resp.sendRedirect(req.getContextPath()+"/14/myerror.jsp");
		}
	}

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String userName=req.getParameter("uname");
//		String password=req.getParameter("upwd");
//		System.out.println("用户名==》"+userName);
//		System.out.println("密码==》"+password);
//	}
	
}
