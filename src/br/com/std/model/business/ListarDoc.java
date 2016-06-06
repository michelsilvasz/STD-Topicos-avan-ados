package br.com.std.model.business;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ListarDoc
 */
@WebServlet("/ListarDoc")
public class ListarDoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListarDoc() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		RequestDispatcher dispatcher;
		String pagina = null;
		DadosDocumentoTramite u = new DadosDocumentoTramite();
	
		u.setIdBusca(new Integer(request.getParameter("idDoc")));
		System.out.println(request.getParameter("idDoc"));
			
		try {
			StdDAO regDAO = new StdDAO();
			try {
				regDAO.lista();
				pagina = "listaTramite.jsp";
			
			} catch (Exception e) {
				PrintWriter out = response.getWriter();
				out.println("Erro de Consulta.");
				e.printStackTrace();
			} finally {
				regDAO.finalize();
			}
		} catch (Exception e) {
			PrintWriter out = response.getWriter();
			out.println("Erro de abertura de conexão.");
			e.printStackTrace();
		}
	
		System.out.println("forward: " + pagina);
		dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	}

}
