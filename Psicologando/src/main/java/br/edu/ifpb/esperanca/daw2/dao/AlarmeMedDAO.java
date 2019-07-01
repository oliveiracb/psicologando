package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.UsuarioFiltro;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.AlarmeMed;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;

public class AlarmeMedDAO extends DAO<AlarmeMed> {
	public AlarmeMedDAO() {
		super(AlarmeMed.class);
	}

	public List<Usuario> findBy(UsuarioFiltro filtro) {
		return null;
	}

}
