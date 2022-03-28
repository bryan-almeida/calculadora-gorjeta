package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelGorjeta;

import java.io.IOException;

@WebServlet(urlPatterns = {"/principal/ServletGorjeta", "/ServletGorjeta"})
public class ServletGorjeta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletGorjeta() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numeroPessoa = request.getParameter("numeroPessoa");
		String valorServico = request.getParameter("valorServico");
		String porcentagem = request.getParameter("porcentagemGorjeta");
		
		ModelGorjeta modelGorjeta = new ModelGorjeta();
		
		try {
			if (numeroPessoa != null && !numeroPessoa.isEmpty() &&
					valorServico != null && !valorServico.isEmpty() &&
					porcentagem != null && !porcentagem.isEmpty() 
					) {
				
				modelGorjeta.setNumeroPessoa(numeroPessoa != null && !numeroPessoa.isEmpty() ? Integer.parseInt(numeroPessoa) : null );
				modelGorjeta.setValorServico(valorServico != null && !valorServico.isEmpty() ? Double.parseDouble(valorServico) : null );
				modelGorjeta.setPorcentagem(porcentagem != null && !porcentagem.isEmpty() ? Double.parseDouble(porcentagem) : null );
				
				request.setAttribute("modelGorjeta", modelGorjeta);
				
				
			}
			
			
			RequestDispatcher redirecionar = request.getRequestDispatcher("/principal/gorjeta.jsp");
			redirecionar.forward(request, response);	
		} catch (Exception e) {
			e.printStackTrace();
			
			
			
			
			RequestDispatcher redirecionar = request.getRequestDispatcher("/principal/gorjeta.jsp");
			redirecionar.forward(request, response);
			
		}
	}

}
