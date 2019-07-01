package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.UsuarioFiltro;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Mural;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Psicologo;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;

public class PsicologoDAO extends DAO<Psicologo>{
	public PsicologoDAO() {
		super(Psicologo.class);
	}

	public List<Usuario> findBy(UsuarioFiltro filtro) {
		return null;
	}

}
