package com.businesslogic;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginChecker")
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public LoginChecker() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("txtUname");
		String password=request.getParameter("txtPassword");
	         PrintWriter out=response.getWriter();
	if(username.equalsIgnoreCase("david") && password.equals("david@123"))
	{
	out.println("you are welcome");
	}
	else
	{
	out.println("Invalid username or password");
	}
	}

		
	}
