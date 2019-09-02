package br.edu.ifpb.esperanca.daw2.psicologando.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;


import br.edu.ifpb.esperanca.daw2.psicologando.entities.Psicologo;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.MaterialApoio;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.TerapiaAdj;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.services.PsicologoService;
import br.edu.ifpb.esperanca.daw2.services.MaterialApoioService;
import br.edu.ifpb.esperanca.daw2.services.TerapiaAdjService;
import br.edu.ifpb.esperanca.daw2.services.UserService;

public class TerapiaAdjBean implements Serializable{
	@Inject
	private TerapiaAdjService service;

	protected TerapiaAdj entidade;

	protected Collection<TerapiaAdj> entidades;


	public TerapiaAdjBean() {
	}

	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(TerapiaAdj entidade) {
		getService().remove(entidade);
		limpar();
		
	}

	public TerapiaAdj getEntidade() {
		return entidade;
	}

	public void setEntidade(TerapiaAdj entidade) {
		this.entidade = entidade;
	}

	public Collection<TerapiaAdj> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<TerapiaAdj> entidades) {
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
	
	protected TerapiaAdj newEntidade() {
		return new TerapiaAdj();
	}

	public TerapiaAdjService getService() {
		return service;
	}
}