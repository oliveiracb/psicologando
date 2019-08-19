package br.edu.ifpb.esperanca.daw2.testes;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.psicologando.entities.MaterialApoio;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Mural;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Paciente;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Psicologo;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.AlarmeMed;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.PontoApoio;
import br.edu.ifpb.esperanca.daw2.psicologando.entities.TerapiaAdj;
import br.edu.ifpb.esperanca.daw2.psicologando.interfaces.Psicologando;
import br.edu.ifpb.esperanca.daw2.services.UserService;

class Testes {

  @Test
  void  cadastrarUsu() {
    UserService a = null;
    Usuario usuario = new Usuario();
    a.save(usuario);
    assertNotNull(usuario.getId());
    
    Usuario outro = a.getByID(usuario.getId());
   assertEquals(outro, usuario);
   
   outro.setEmail("dfghj");
   a.update(outro);
   
   Usuario outro2 = a.getByID(usuario.getId());
   assertEquals(outro2.getEmail(), "dfghj");
   
   a.remove(outro2);
   
   Usuario outro3 = a.getByID(usuario.getId());
   
   assertNull(outro3);
   
}

  @Test
  void  postarMaterial() {
    Psicologando b = null;
    MaterialApoio materialApoio = new MaterialApoio();
    Psicologo psicologo =  new Psicologo();
    MaterialApoio n = b.postarMaterial(psicologo, materialApoio);
    assertNotNull(n);
    assertEquals("", n.getId());
   }
   
  @Test
   void  addRelato() {
     Psicologando c = null;
     Mural muralrelatar = new Mural();
     Paciente paciente =  new Paciente();
     Mural m = c.enviarRelato(paciente, muralrelatar);
     assertNotNull(m);
     assertEquals("", m.getId());
   }
   
  @Test
   void  enviarRelato() {
     Psicologando d = null;
     Mural mural = new Mural();
     Paciente paciente =  new Paciente();
     Mural m = d.enviarRelato(paciente, mural);
     assertNotNull(m);
     assertEquals("", m.getId());
   }
   
  @Test
   void  ediTarMural() {
     Psicologando e = null;
     Mural mural = new Mural();
     Psicologo psicologo  =  new Psicologo();
     Psicologo m = e.editarMural(psicologo, mural);
     assertNotNull(m);
     assertEquals("", m.getId());
   }
   
  @Test
   void  addHoraMedicamento() {
     Psicologando f = null;
     AlarmeMed alarmMed = new AlarmeMed();
     Paciente paciente =  new Paciente();
     AlarmeMed a = f.addHoraMedicamento(paciente, alarmMed);
     assertNotNull(a);
     assertEquals("", a.getId());
    }

  @Test
    void IndicarPontoMaisProximo(){
      Psicologando g = null;
      PontoApoio pontoApoio = new PontoApoio();
      Psicologo psicologo = new Psicologo();
      PontoApoio p = g.indicarPontoMaisProximo(pontoApoio, psicologo);
      assertNotNull(p);
      assertEquals("", p.getId());
    }
    
  @Test
    void addTerapia(){
        Psicologando h = null;
        TerapiaAdj TerapiaAdjuvante = new TerapiaAdj();
        Psicologo indicaTerapia = new Psicologo();
        TerapiaAdj t = h.addTerapia(TerapiaAdjuvante, indicaTerapia);
        assertNotNull(t);
        assertEquals("", t.getId());
    }

}


