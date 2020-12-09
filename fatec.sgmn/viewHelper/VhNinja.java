package viewHelper;

import javax.servlet.http.HttpServletRequest;

import model.EntidadeDominio;
import model.Ninja;

public class VhNinja implements IViewHelper{

	@Override
	public EntidadeDominio getCadastro(HttpServletRequest request) {
		String name = request.getParameter("ninjaName");
		String ninjaClass = request.getParameter("ninjaClass");
		String ninjaTeam = request.getParameter("ninjaTeam");
		
		String[] codTeam = ninjaTeam.split(" - ");
		int team = Integer.parseInt(codTeam[0]);
		
		Ninja ninja = new Ninja(name, ninjaClass, team);
		
		return ninja;
	}

	@Override
	public EntidadeDominio getAlteracao(HttpServletRequest request) {
		String name = request.getParameter("ninjaName");
		String ninjaClass = request.getParameter("ninjaClass");
		
		String ninjaTeam = request.getParameter("ninjaTeam");		
		String[] codTeam = ninjaTeam.split(" - ");
		int team = Integer.parseInt(codTeam[0]);
		
		int id = Integer.parseInt(request.getParameter("ninjaId"));
		
		System.out.println(id);
		
		Ninja ninja = new Ninja(id, name, ninjaClass, team);
		
		return ninja;
	}

	@Override
	public EntidadeDominio getId(HttpServletRequest request) {
		String paramId = request.getParameter("id");
		int id = Integer.parseInt(paramId);
	 
		System.out.println(id);
	 
		Ninja ninja = new Ninja(id);
		
		return ninja;
	}

}
