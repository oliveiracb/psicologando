package br.edu.ifpb.esperanca.daw2.psicologando.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.AlarmeMed;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.MaterialApoio;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.services.AlarmeMedService;
import br.edu.ifpb.esperanca.daw2.services.MaterialApoioService;
import br.edu.ifpb.esperanca.daw2.services.UserService;

@ViewScoped
@Named
public class AlarmeMedBean implements Serializable {
	@Inject
	private AlarmeMedService service;

	protected AlarmeMed entidade;
	
	protected Collection<AlarmeMed> entidades;


	public AlarmeMedBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(AlarmeMed entidade) {
		getService().remove(entidade);
		limpar();
		
	}

	public AlarmeMed getEntidade() {
		return entidade;
	}

	public void setEntidade(AlarmeMed entidade) {
		this.entidade = entidade;
	}

	public Collection<AlarmeMed> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<AlarmeMed> entidades) {
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

	protected AlarmeMed newEntidade() {
		return new AlarmeMed();
	}

	public AlarmeMedService getService() {
		return service;
	}

}
