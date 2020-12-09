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

public class CadastrarNinjaStrategy implements IStrategy{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando Ninja");
		
		IViewHelper vhNinja = new VhNinja();
		Ninja ninja = (Ninja) vhNinja.getCadastro(request);
		
		System.out.println(ninja.getName() + " | " + ninja.getNinjaClass() + " | " + ninja.getTeamId());
		
		IFacade facade = new Facade();
		facade.cadastrar(ninja);
		
		System.out.println("Ninja cadastrado!");
		
		request.setAttribute("ninja", ninja);
		
		return "forward:confirmaCadastroNinja.jsp";

	}

	
}
