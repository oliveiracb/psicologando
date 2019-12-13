package br.edu.ifpb.esperanca.daw2.psicologando.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Principal;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.services.UserService;

@ViewScoped
@Named
public class UsuarioBean implements Serializable {

	@Inject
	private UserService service;

	protected Usuario entidade;

	protected Collection<Usuario> entidades;

	public UsuarioBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Usuario entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Usuario getEntidade() {
		return entidade;
	}

	public void setEntidade(Usuario entidade) {
		this.entidade = entidade;
	}

	public Collection<Usuario> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Usuario> entidades) {
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

	protected Usuario newEntidade() {
		return new Usuario();
 
	}

	public UserService getService() {
		return service;
	}
	public String logarUsuario() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		java.security.Principal userPrincipal = externalContext.getUserPrincipal();
		if (userPrincipal == null) {
			return "";
		}
		return null;
	}
	
	public void desconectar() throws IOException, ServletException {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);
		session.invalidate();
		HttpServletRequest request = (HttpServletRequest) ec.getRequest();
		request.logout();
		ec.redirect(ec.getApplicationContextPath());
	}
	
	public boolean usuarioLogado(String role) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		return externalContext.isUserInRole(role);
	}
}

