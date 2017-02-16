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

/**
 * Servlet implementation class SimpleDoGetExample
 */
@WebServlet("/SimpleDoGetExample")
public class SimpleDoGetExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	
	@Override
	public void init() throws ServletException {
			System.out.println("I come only once");
			super.init();
	}
	
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("Service method ... ");
		super.service(arg0, arg1);
	}
	
	
	@Override
	public void destroy() {
		System.out.println("Destroy");
		super.destroy();
	}
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleDoGetExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(" Students in each department:");
		
		/***
		 * 
		 * ServletConfig demo*/
		 
		ServletConfig config = getServletConfig();
		String tempString = config.getInitParameter("Ece");
		String tempString1 = config.getInitParameter("Cse");
		out.println(" <br>Ece has " +tempString +" <br>Cse has " + tempString1); 
		 
		/***
		 * 
		 * ServletContext demo
		 */
		  //How to get the Servletcontext object
        ServletContext ctx = getServletContext();
        System.out.println("I will come again if you refresh");
        String s1=ctx.getInitParameter("aa");
        String s2=ctx.getInitParameter("bb");
        out.println("<br> Average marks in Ece and Cse are " +s1+ " and " +s2);
        
        String s3 = ctx.getInitParameter("cc");
        String s4 = ctx.getInitParameter("dd");
        
        
        out.println("<br> Highest marks in Ece and Cse are " +s3+ " and " +s4);
    
        out.close();
	}
//Request  - client to server
	//Responce - Server to Client
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	
}
