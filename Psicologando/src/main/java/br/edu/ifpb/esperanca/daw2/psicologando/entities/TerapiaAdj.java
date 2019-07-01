package br.edu.ifpb.esperanca.daw2.psicologando.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class TerapiaAdj implements Identificavel{
	@Id
	@GeneratedValue(generator="usuario_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="usuario_seq")
	private Long id;
	
	@ManyToOne
	private Psicologo indica;
	
	private ArrayList<String> descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Psicologo getIndica() {
		return indica;
	}

	public void setIndica(Psicologo indica) {
		this.indica = indica;
	}

	public ArrayList<String> getDescricao() {
		return descricao;
	}

	public void setDescricao(ArrayList<String> descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((indica == null) ? 0 : indica.hashCode());
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
		TerapiaAdj other = (TerapiaAdj) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (indica == null) {
			if (other.indica != null)
				return false;
		} else if (!indica.equals(other.indica))
			return false;
		return true;
	}
	
	
}
