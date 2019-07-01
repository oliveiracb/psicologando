package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.UsuarioFiltro;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Mural;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.TerapiaAdj;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;

public class TerapiaAdjDAO extends DAO<TerapiaAdj>{
	public TerapiaAdjDAO() {
		super(TerapiaAdj.class);
	}

	public List<Usuario> findBy(UsuarioFiltro filtro) {
		return null;
	}

}
