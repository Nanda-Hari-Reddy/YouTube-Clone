package com.jsp.Basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/MyAccount")
public class MyAccountServelet extends HttpServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String firstName = req.getParameter("first name");
		String lastName = req.getParameter("last name");
		String date = req.getParameter("date");
		String mobNo = req.getParameter("mobile");
		String gender = req.getParameter("gender");
		String address = req.getParameter("Address");
		String city = req.getParameter("city");
		int pincode = Integer.parseInt(req.getParameter("pincode"));
		String state = req.getParameter("state");
		
		PrintWriter out = res.getWriter();
		out.println(email);out.println(password);out.println(firstName);out.println(lastName);out.println(date);out.println(mobNo);out.println(gender);out.println(address);out.println(city);out.println(pincode);out.println(state);
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		Connection con;
		try 
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myaccount","root","root");
			Statement st = con.createStatement();
			String s = "INSERT INTO user_details VALUES(3,'"+email+"','"+password+"','"+firstName+"','"+lastName+"','"+date+"','"+mobNo+"','"+gender+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
			st.execute(s);
			con.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}

