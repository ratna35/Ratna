package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContextDemo")
public class ServletContextDemo extends HttpServlet{

	public ServletContextDemo() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        
        //How to get the Servletcontext object
        ServletContext ctx = getServletContext();
        
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaa : ");
        
        String s1 =ctx.getInitParameter("n1");
        String s2 =ctx.getInitParameter("n2");
        
        String s3 = ctx.getInitParameter("avinash");
        String s4 = ctx.getInitParameter("chandu");
        
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB : ");
        pw.println("n1 value is " +s1+ " and n2 is " +s2);
        pw.println("Avinash value is " +s3+ " and chandu is " +s4);
        
        
        /***
		 * 
		 * ServletConfig demo*/
		 
		ServletConfig config = getServletConfig();
		String tempString = config.getInitParameter("Avi");
		String tempString1 = config.getInitParameter("Sai");
		pw.println(" <br>Avinash from ServletConfig  : " +tempString +" Chandu " + tempString1); 
	
       pw.close();    
    }
	
	
}
