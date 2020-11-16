package controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;

/**
 * Servlet Filter implementation class Controller
 */
@WebFilter("/")
public class Controller implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
	}
	
	public void destroy() {
	}
	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("ControladorFilter");
		
		HttpServletRequest request =  (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = request.getParameter("action");
		
		String nomeDaClasse = "action." + paramAcao;
		
		String nome;
		try {
			Class classe = Class.forName(nomeDaClasse); // Carrega a classe com o nome da string => API Reflection
			Action action = (Action) classe.newInstance();
			nome = action.run(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		String[] tipoEndereco = nome.split(":");		
		if(tipoEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
			rd.forward(request, response);
			return;
		}else {
			response.sendRedirect(tipoEndereco[1]);
			return;
		}	
	}
	
}
