package com.jsp.Basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LogIn")
public class MyaccountLogin  extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if(email.equals("bknandahari2000@gmail.com") && password.equals("WASDskal@4"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("MyAccount.html");
			rd.forward(req, resp);
		}
		else
		{
			out.println("<h3>Please Enter the Right Credentials</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("LoginPage.html");
			rd.include(req, resp);
		}
	}
}
