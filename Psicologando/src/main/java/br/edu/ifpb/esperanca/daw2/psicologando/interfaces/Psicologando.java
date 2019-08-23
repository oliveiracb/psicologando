package br.edu.ifpb.esperanca.daw2.psicologando.interfaces;

	import br.edu.ifpb.esperanca.daw2.psicologando.entities.AlarmeMed;
	import br.edu.ifpb.esperanca.daw2.psicologando.entities.MaterialApoio;
	import br.edu.ifpb.esperanca.daw2.psicologando.entities.Mural;
	import br.edu.ifpb.esperanca.daw2.psicologando.entities.Paciente;
	import br.edu.ifpb.esperanca.daw2.psicologando.entities.PontoApoio;
	import br.edu.ifpb.esperanca.daw2.psicologando.entities.Psicologo;
	import br.edu.ifpb.esperanca.daw2.psicologando.entities.TerapiaAdj;
	import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;

	public interface Psicologando {

	public Usuario cadastrarUsu(Usuario usuario);
	public void acessarMaterialDeApoio(Paciente paciente, MaterialApoio materialDeApoio);
	public MaterialApoio postarMaterial(Psicologo psicologo, MaterialApoio material);
	public Mural addRelato(Paciente paciente, Mural muralRelatar);
	public void acessarRelato(Usuario usuario, Mural muralRelatar);
	public Mural enviarRelato(Paciente paciente, Mural muralRelato);
	public void removerRelato(Psicologo psicologo,Mural muralRelato);
	public Psicologo editarMural(Psicologo psicologo, Mural editarRelatos );
	public AlarmeMed addHoraMedicamento(Paciente paciente, AlarmeMed addHoraMed);
	public void alarmarMed( Paciente paciente, AlarmeMed alarmarParaTomarMed);
	public void removerAlarm( Paciente paciente, AlarmeMed alarmarParaTomarMed);
	public PontoApoio indicarPontoMaisProximo(PontoApoio pontoApoio, Psicologo psicologo);
	public TerapiaAdj addTerapia(TerapiaAdj TerapiaAdjuvante, Psicologo indicaTerapia);
	public void acessarTerapiaAdj(Paciente paciente, TerapiaAdj visualizarMApoio);
	


}


