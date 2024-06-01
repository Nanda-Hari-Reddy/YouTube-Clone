package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddServelet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int a = Integer.parseInt(req.getParameter("n1"));
		int b = Integer.parseInt(req.getParameter("n2"));
		int r =a+b;
		PrintWriter pw = res.getWriter();
		pw.println(r);
	}
}
