package br.edu.ifpb.esperanca.daw2.psicologando.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.MaterialApoio;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.services.MaterialApoioService;
import br.edu.ifpb.esperanca.daw2.services.UserService;

public class MaterialApoioBean implements Serializable {
	@Inject
	private UserService service;

	protected MaterialApoio entidade;
	
	protected Collection<MaterialApoio> entidades;


	public MaterialApoioBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(MaterialApoio entidade) {
		getService().remove(entidade);
		limpar();
	}

	public MaterialApoio getEntidade() {
		return entidade;
	}

	public void setEntidade(MaterialApoio entidade) {
		this.entidade = entidade;
	}

	public Collection<MaterialApoio> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<MaterialApoio> entidades) {
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

	protected MaterialApoio newEntidade() {
		return new MaterialApoio();
	}

	public UserService getService() {
		return service;
	}

}
