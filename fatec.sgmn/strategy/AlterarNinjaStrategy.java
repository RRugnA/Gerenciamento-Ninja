package strategy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facade.Facade;
import facade.IFacade;
import model.Ninja;
import viewHelper.IViewHelper;
import viewHelper.VhNinja;

public class AlterarNinjaStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Alterando dados do ninja");
		
		IViewHelper vhNinja = new VhNinja();
		Ninja ninja = (Ninja) vhNinja.getAlteracao(request);
		
		IFacade facade = new Facade();
		facade.alterar(ninja);
		
		request.setAttribute("ninja", ninja);
		
		return "forward:confirmaCadastroNinja.jsp";
	}

}
