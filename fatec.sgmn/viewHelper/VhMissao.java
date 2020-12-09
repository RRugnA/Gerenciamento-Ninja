package viewHelper;

import javax.servlet.http.HttpServletRequest;

import model.EntidadeDominio;
import model.Missao;

public class VhMissao implements IViewHelper {

	@Override
	public EntidadeDominio getCadastro(HttpServletRequest request) {
		String name = request.getParameter("missionName");
		String rank = request.getParameter("missionRank");
		double pay = Double.parseDouble(request.getParameter("missionPayment"));
		String desc = request.getParameter("missionDescription");
		
		String ninjaTeam = request.getParameter("ninjaTeam");		
		String[] codTeam = ninjaTeam.split(" - ");
		int team = Integer.parseInt(codTeam[0]);
		
		Missao missao = new Missao(name, rank, pay, desc, team);
		
		return missao;
	}

	@Override
	public EntidadeDominio getAlteracao(HttpServletRequest request) {
		String name = request.getParameter("missionName");
		String rank = request.getParameter("missionRank");
		Double pay = Double.parseDouble(request.getParameter("missionPayment"));
		
		String ninjaTeam = request.getParameter("ninjaTeam");		
		String[] codTeam = ninjaTeam.split(" - ");
		int team = Integer.parseInt(codTeam[0]);
		
		String desc = request.getParameter("missionDescription");
		int id = Integer.parseInt(request.getParameter("missaoId"));
		
		Missao missao = new Missao(id, name, rank, pay, team, desc);
		
		return missao;
	}

	@Override
	public EntidadeDominio getId(HttpServletRequest request) {
		String paramId = request.getParameter("id");
		int id = Integer.parseInt(paramId);
	 
		System.out.println(id);
	 
		Missao missao = new Missao(id);
		
		return missao;
	}

}
