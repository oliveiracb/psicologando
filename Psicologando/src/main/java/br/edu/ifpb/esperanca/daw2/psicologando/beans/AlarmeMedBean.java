package br.edu.ifpb.esperanca.daw2.psicologando.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.AlarmeMed;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.services.UserService;

@ViewScoped
@Named
public class AlarmeMedBean implements Serializable {
	@Inject
	private AlarmeMed service;

	protected Collection<AlarmeMedBean> entidades;

	public AlarmeMedBean() {
	}
	
	@PostConstruct
	public void init() {
		entidades = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(AlarmeMedBean entidade) {
		getService().remove(entidade);
		limpar();
	}

	public AlarmeMedBean getEntidade() {
		return entidades;
	}

	public void setEntidade(AlarmeMedBean entidade) {
		this.entidades = entidade;
	}

	public Collection<AlarmeMedBean> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<AlarmeMedBean> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidades);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		entidades = newEntidade();
	}

	protected AlarmeMedBean newEntidade() {
		return new AlarmeMedBean();
	}

	public AlarmeMed getService() {
		return service;
	}

}
