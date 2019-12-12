package br.edu.ifpb.esperanca.daw2.psicologando.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.MaterialApoio;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Mural;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.TerapiaAdj;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.services.MaterialApoioService;
import br.edu.ifpb.esperanca.daw2.services.MuralService;
import br.edu.ifpb.esperanca.daw2.services.TerapiaAdjService;
import br.edu.ifpb.esperanca.daw2.services.UserService;

public class MuralBean implements Serializable{
	private ArrayList<String> texto;

	
	@Inject
	private MuralService service;

	protected Mural entidade;
	
	protected Collection<Mural> entidades;
    
	public MuralBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Mural entidade) {
		getService().remove(entidade);
		limpar();
		
	}
	
	public Mural getEntidade() {
		return entidade;
	}

	public void setEntidade(Mural entidade) {
		this.entidade = entidade;
	}

	public Collection<Mural> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Mural> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
		limpar();
		{FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Usuário cadastrado"));	
		}
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
