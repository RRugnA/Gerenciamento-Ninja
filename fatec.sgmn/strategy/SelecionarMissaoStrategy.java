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

public class SelecionarMissaoStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Mostrando dados do ninja!");
		
		IViewHelper vhMissao = new VhMissao();
		Missao missao = (Missao) vhMissao.getId(request);
		
		IFacade facade = new Facade();
		missao = (Missao) facade.consultar(missao);
		
		request.setAttribute("missao", missao);
		
		return "forward:formAlteraMissao.jsp";
	}

}
