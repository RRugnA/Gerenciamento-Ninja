package strategy;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facade.Facade;
import facade.IFacade;
import model.Missao;

public class ExibirMissaoStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Listando Missões");
		
		Missao missao = new Missao();
		
		IFacade facade = new Facade();
		List<Missao> missaoList = facade.listar(missao);
		
		request.setAttribute("missoes", missaoList);
		
		return "forward:listaMissoes.jsp";
	}

}
