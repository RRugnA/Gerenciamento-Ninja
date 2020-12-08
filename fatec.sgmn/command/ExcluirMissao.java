package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import strategy.ExcluirMissaoStrategy;
import strategy.IStrategy;

public class ExcluirMissao implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		IStrategy strategy = new ExcluirMissaoStrategy();
		return strategy.run(request, response);
	}

}
