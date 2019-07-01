package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.UsuarioFiltro;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Mural;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Paciente;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;

public class PacienteDAO extends DAO<Paciente> {
	public PacienteDAO() {
		super(Paciente.class);
	}

	public List<Usuario> findBy(UsuarioFiltro filtro) {
		return null;
	}

}
