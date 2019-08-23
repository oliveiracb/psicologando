package br.edu.ifpb.esperanca.daw2.psicologando.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.Psicologo;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.services.PsicologoService;
import br.edu.ifpb.esperanca.daw2.services.UserService;

public class PsicologoBean implements Serializable{
	@Inject
	private PsicologoService service;

	protected Psicologo entidade;

	protected Collection<Psicologo> entidades;

	public PsicologoBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Psicologo entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Psicologo getEntidade() {
		return entidade;
	}

	public void setEntidade(Psicologo entidade) {
		this.entidade = entidade;
	}

	public Collection<Psicologo> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Psicologo> entidades) {
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

	protected Psicologo newEntidade() {
		return new Psicologo();
	}

	public PsicologoService getService() {
		return service;
	}

}
