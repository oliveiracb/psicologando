package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.UsuarioFiltro;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.AlarmeMed;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.MaterialApoio;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;

public class MaterialApoioDAO extends DAO<MaterialApoio>{
	public MaterialApoioDAO() {
		super(MaterialApoio.class);
	}

	public List<Usuario> findBy(UsuarioFiltro filtro) {
		return null;
	}

}
