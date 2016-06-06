package br.com.std.model.business;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.std.model.dao.ConnectionFactory;
import br.com.std.model.business.DadosDocumentoTramite;;

@WebServlet("/CadastroDocEnvia")
public class CadastroDocEnvia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CadastroDocEnvia() {
        super();
    }
    @Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		log("Iniciando a servlet");
	}

	@Override
	public void destroy() {
		super.destroy();
		log("Destruindo a servlet");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher;
		String pagina = null;
		System.out.println(request.getParameter("tipoDoc"));
		System.out.println(request.getParameter("nomeDoc"));
		System.out.println(request.getParameter("descDoc"));
		System.out.println(request.getParameter("centroC"));
		System.out.println(request.getParameter("nomeDest"));
		System.out.println(request.getParameter("data1"));
		
		DadosDocumentoTramite registro = new DadosDocumentoTramite(); 
		registro.setTipo(new String(request.getParameter("tipoDoc")));
		registro.setNomeDocumento(new String(request.getParameter("nomeDoc")));
		registro.setDescricao(new String(request.getParameter("descDoc")));
		registro.setCentroCusto(new String(request.getParameter("centroC")));
		registro.setDestinatario(new String(request.getParameter("nomeDest")));
		registro.setDataTramite(new String(request.getParameter("data1")));
		
		try {
			StdDAO regDAO = new StdDAO();
			try {
				regDAO.incluir(registro);
				pagina = "DocumentoCadEnvio.jsp";
			
			} catch (Exception e) {
				PrintWriter out = response.getWriter();
				out.println("Erro de Inclusão.");
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