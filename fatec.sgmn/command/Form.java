package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import strategy.FormStrategy;
import strategy.IStrategy;

public class Form implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IStrategy strategy = new FormStrategy();
		return strategy.run(request, response);
	}

}
