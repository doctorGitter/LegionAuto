/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dock.servlet;

/**
 *
 * @author sourabh.a.mahajan
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dock.dao.LoginDao;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  

        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        
        String n=request.getParameter("username");  
        String p=request.getParameter("userpass"); 
        
        HttpSession session = request.getSession(false);
        if(session!=null)
        session.setAttribute("name", n);

/*        if(LoginDao.validate(n, p)){  
            RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
            rd.forward(request,response);  
        }   
*/
	if(( n.equals("jmat123") || n.equals("npot123") || n.equals("vbro123") ) && (p.equals("test@123"))){
            RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
            rd.forward(request,response);	
	}

        else{  
            out.print("<p style=\"color:red\">Sorry username or password error</p>");  
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
            rd.include(request,response);  
        }  

        out.close();  
    }  
}
