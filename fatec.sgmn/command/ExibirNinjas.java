package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import strategy.ExibirNinjaStrategy;
import strategy.IStrategy;

public class ExibirNinjas implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		IStrategy strategy = new ExibirNinjaStrategy();
		return strategy.run(request, response);
	}

}
