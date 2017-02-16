package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletClass
 */
@WebServlet("/servletClass")
public class servletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletClass() {
        super();
        System.out.println("Default @@@@@@@@@@@@@@@@@");
        // TODO Auto-generated constructor stub
    }

    
    /***
     * For first time request from the client, It will call the init method (It means only one time init method will call)
     * Reason :Why we go for init method?
     * 			- WE can use as preloader or you can use based on the business req .
     */
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("INIT method >>>>>>>>>>>>>>>>>>>>>>> ");
	}
	

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destory >>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	/**
	 * 
	 * It will call for every request from the client.
	 * Reason : it will take care of the calls from the client and what response from the server
	 * 
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Sevice Method .... ");
		PrintWriter out = response.getWriter();
        out.println("Hello World from Service Method .... ");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
        out.println("Hello World from Servlet Class doGET ... ...... ..... ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
