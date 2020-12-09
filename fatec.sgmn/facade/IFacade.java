package facade;

import java.util.List;

import model.EntidadeDominio;

public interface IFacade {

	void cadastrar(EntidadeDominio ed);
	
	void alterar(EntidadeDominio ed);
	
	void excluir(EntidadeDominio ed);
	
	List listar(EntidadeDominio ed);
	
	EntidadeDominio consultar(EntidadeDominio ed);
}
