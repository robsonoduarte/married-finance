package br.com.married.finance.web.controller;




import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/login")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;



    public Login() {
        super();
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		login(request,response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		login(request,response);		
	}


	private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getOutputStream().print("IN CONSTRUCTION");
	}
	
}
