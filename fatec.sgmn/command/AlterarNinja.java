package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import strategy.AlterarNinjaStrategy;
import strategy.IStrategy;

public class AlterarNinja implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IStrategy strategy = new AlterarNinjaStrategy();
		return strategy.run(request, response);
	}

}
