package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import strategy.ExibirMissaoStrategy;
import strategy.IStrategy;

public class ExibirMissao implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		IStrategy strategy = new ExibirMissaoStrategy();
		return strategy.run(request, response);
	}

}
