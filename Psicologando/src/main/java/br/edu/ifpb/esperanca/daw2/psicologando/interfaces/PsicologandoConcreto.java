package br.edu.ifpb.esperanca.daw2.psicologando.interfaces;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.AlarmeMed;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.MaterialApoio;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Mural;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Paciente;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.PontoApoio;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Psicologo;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.TerapiaAdj;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;

public class PsicologandoConcreto implements Psicologando{

	@Override
	public Usuario cadastrarUsu(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void acessarMaterialDeApoio(Paciente paciente, MaterialApoio materialDeApoio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MaterialApoio postarMaterial(Psicologo psicologo, MaterialApoio material) {
		// TODO Auto-generated method stub
		return new MaterialApoio();
	}

	@Override
	public Mural addRelato(Paciente paciente, Mural muralRelatar) {
		// TODO Auto-generated method stub
		return new Mural();
	}

	@Override
	public void acessarRelato(Usuario usuario, Mural muralRelatar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mural enviarRelato(Paciente paciente, Mural muralRelato) {
		// TODO Auto-generated method stub
		return new Mural ();
	}

	@Override
	public void removerRelato(Psicologo psicologo, Mural muralRelato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Psicologo editarMural(Psicologo psicologo, Mural editarRelatos) {
		// TODO Auto-generated method stub
		return new Psicologo();
	}

	@Override
	public AlarmeMed addHoraMedicamento(Paciente paciente, AlarmeMed addHoraMed) {
		// TODO Auto-generated method stub
		return new AlarmeMed();
	}

	@Override
	public void alarmarMed(Paciente paciente, AlarmeMed alarmarParaTomarMed) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removerAlarm(Paciente paciente, AlarmeMed alarmarParaTomarMed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PontoApoio indicarPontoMaisProximo(PontoApoio pontoApoio, Psicologo psicologo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TerapiaAdj addTerapia(TerapiaAdj TerapiaAdjuvante, Psicologo indicaTerapia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void acessarTerapiaAdj(Paciente paciente, TerapiaAdj visualizarMApoio) {
		// TODO Auto-generated method stub
		
	}
	
	

}
