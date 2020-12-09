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

public class AlterarMissaoStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Alterando dados da missão");
		
		IViewHelper vhMissao = new VhMissao();
		Missao missao = (Missao) vhMissao.getAlteracao(request);
		
		IFacade facade = new Facade();
		facade.alterar(missao);
		
		request.setAttribute("missao", missao);
		
		return "forward:confirmaCadastroMissao.jsp";
	}

}
