package strategy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("form");
		
		switch(nome) {
			case "ninja":
				return "forward:formNinja.jsp";
			case "mission":
				return "forward:formMission.jsp";
		}
		return null;
	}

}
