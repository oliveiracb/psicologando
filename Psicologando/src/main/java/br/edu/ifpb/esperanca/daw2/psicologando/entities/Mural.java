package br.edu.ifpb.esperanca.daw2.psicologando.entities;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Mural implements Identificavel {
	@Id
	@GeneratedValue(generator="mural_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="mural_seq")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_paciente")
	private Paciente mural;
	
	@ManyToMany
	@JoinColumn(name="id_psicologo")
	private Set<Psicologo> analisam;
	
	private ArrayList<String> texto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Paciente getMural() {
		return mural;
	}

	public void setMural(Paciente mural) {
		this.mural = mural;
	}

	public Set<Psicologo> getAnalisam() {
		return analisam;
	}

	public void setAnalisam(Set<Psicologo> analisam) {
		this.analisam = analisam;
	}

	public ArrayList<String> getTexto() {
		return texto;
	}

	public void setTexto(ArrayList<String> texto) {
		this.texto = texto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((analisam == null) ? 0 : analisam.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mural == null) ? 0 : mural.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mural other = (Mural) obj;
		if (analisam == null) {
			if (other.analisam != null)
				return false;
		} else if (!analisam.equals(other.analisam))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mural == null) {
			if (other.mural != null)
				return false;
		} else if (!mural.equals(other.mural))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}
	
	
}
