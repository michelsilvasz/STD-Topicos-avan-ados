package br.com.std.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Login() {
        super();
 
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String usuario = request.getParameter("usuario");
			String senha = request.getParameter("senha");
		} catch (NullPointerException e) {
			System.out.println("Dados invalidos!");
		}
		
		

	}

}
