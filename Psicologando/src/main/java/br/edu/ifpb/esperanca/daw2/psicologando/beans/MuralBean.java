package br.edu.ifpb.esperanca.daw2.psicologando.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.Mural;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.services.MuralService;
import br.edu.ifpb.esperanca.daw2.services.UserService;

public class MuralBean implements Serializable{
	private static final Usuario texto = null;

	@Inject
	private MuralService service;

	protected Mural entidade;

	protected List<Mural> entidades;

	public MuralBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Mural entidade) {
		getService().remove(texto);
		limpar();
	}

	public Usuario getEntidade() {
		return entidade;
	}

	public void setEntidade(Mural entidade) {
		this.entidade = entidade;
	}

	public Collection<Mural> getEntidades() {
		return entidades;
	}

	public void setEntidades(Mural entidades) {
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

	protected Mural newEntidade() {
		return new Mural();
	}

	public MuralService getService() {
		return service;
	}

}
