package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import strategy.ExcluirNinjaStrategy;
import strategy.IStrategy;

public class ExcluirNinja implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IStrategy strategy = new ExcluirNinjaStrategy();
		return strategy.run(request, response);
	}

}
