package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class List implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("form");
		
		switch(nome) {
			case "ninja":
				return "forward:listNinja.jsp";
			case "mission":
				return "forward:listMission.jsp";
		}
		return null;
	}

}
