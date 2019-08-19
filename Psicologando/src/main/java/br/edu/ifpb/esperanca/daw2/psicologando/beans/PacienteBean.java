package br.edu.ifpb.esperanca.daw2.psicologando.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.Paciente;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.services.PacienteService;
import br.edu.ifpb.esperanca.daw2.services.UserService;

@ViewScoped
@Named
public class PacienteBean implements Serializable{
	@Inject
	private PacienteService service;

	protected Paciente entidade;

	protected Collection<Paciente> entidades;

	public PacienteBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Paciente entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Usuario getEntidade() {
		return entidade;
	}

	public void setEntidade(Paciente entidade) {
		this.entidade = entidade;
	}

	public Collection<Paciente> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Paciente> entidades) {
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

	protected Paciente newEntidade() {
		return new Paciente();
	}

	public PacienteService getService() {
		return service;
	}

}
