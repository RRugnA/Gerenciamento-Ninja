package viewHelper;

import javax.servlet.http.HttpServletRequest;

import model.EntidadeDominio;

public interface IViewHelper {

	public EntidadeDominio getCadastro(HttpServletRequest request);
	
	public EntidadeDominio getAlteracao(HttpServletRequest request);
	
	public EntidadeDominio getId(HttpServletRequest request);
}
