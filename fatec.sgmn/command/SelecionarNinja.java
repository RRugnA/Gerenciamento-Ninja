package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import strategy.IStrategy;
import strategy.SelecionarNinjaStrategy;

public class SelecionarNinja implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IStrategy strategy = new SelecionarNinjaStrategy();
		return strategy.run(request, response);
	}

}
