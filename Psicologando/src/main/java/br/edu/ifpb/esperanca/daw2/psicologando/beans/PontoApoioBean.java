package br.edu.ifpb.esperanca.daw2.psicologando.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.PontoApoio;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.services.PontoApoioService;
import br.edu.ifpb.esperanca.daw2.services.UserService;

public class PontoApoioBean implements Serializable{
	@Inject
	private PontoApoioService service;

	protected PontoApoio entidade;

	protected Collection<PontoApoio> entidades;

	public PontoApoioBean() {
		
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}


	public void remove(PontoApoio entidade) {
		getService().remove(entidade);
		limpar();
	}

	public PontoApoio getEntidade() {
		return entidade;
	}

	public void setEntidade(PontoApoio entidade) {
		this.entidade = entidade;
	}

	public Collection<PontoApoio> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<PontoApoio> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		entidade = newEntidade();
	}

	protected PontoApoio newEntidade() {
		return new PontoApoio();
	}

	public PontoApoioService getService() {
		return service;
	}

}
