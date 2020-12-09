package strategy;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facade.Facade;
import facade.IFacade;
import model.Ninja;

public class ExibirNinjaStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Listando Ninjas");
		
		Ninja ninja = new Ninja();
		
		IFacade facade = new Facade();
		List<Ninja> ninjaList = facade.listar(ninja);
		
		request.setAttribute("ninjas", ninjaList);
		
		return "forward:listaNinjas.jsp";
	}

}
