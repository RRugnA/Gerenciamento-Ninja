package strategy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facade.Facade;
import facade.IFacade;
import model.Missao;
import viewHelper.IViewHelper;
import viewHelper.VhMissao;

public class CadastrarMissaoStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando Missao");
		
		IViewHelper vhMissao = new VhMissao();
		Missao missao = (Missao) vhMissao.getCadastro(request);
		
		System.out.println(missao.getName() + " cadastrada!");
		
		IFacade facade = new Facade();
		facade.cadastrar(missao);
		
		System.out.println("Missão cadastrado!");
		
		request.setAttribute("missao", missao);
		
		return "forward:confirmaCadastroMissao.jsp";
	}

}
