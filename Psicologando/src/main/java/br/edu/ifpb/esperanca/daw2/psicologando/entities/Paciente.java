package br.edu.ifpb.esperanca.daw2.psicologando.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Paciente extends Usuario implements Identificavel{
	private Long cpf;
	
	@ManyToMany
	@JoinTable(name="material_paciente")
	private Set<MaterialApoio> apoio;
	
	@ManyToMany
	@JoinTable(name="terapia_paciente")
	private Set<TerapiaAdj> terapias;
	
	@ManyToMany
	@JoinTable(name="psicologo_paciente")
	private Set<Psicologo> psicologos;

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Set<MaterialApoio> getApoio() {
		return apoio;
	}

	public void setApoio(Set<MaterialApoio> apoio) {
		this.apoio = apoio;
	}

	public Set<TerapiaAdj> getTerapias() {
		return terapias;
	}

	public void setTerapias(Set<TerapiaAdj> terapias) {
		this.terapias = terapias;
	}

	public Set<Psicologo> getPsicologos() {
		return psicologos;
	}

	public void setPsicologos(Set<Psicologo> psicologos) {
		this.psicologos = psicologos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((apoio == null) ? 0 : apoio.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((psicologos == null) ? 0 : psicologos.hashCode());
		result = prime * result + ((terapias == null) ? 0 : terapias.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (apoio == null) {
			if (other.apoio != null)
				return false;
		} else if (!apoio.equals(other.apoio))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (psicologos == null) {
			if (other.psicologos != null)
				return false;
		} else if (!psicologos.equals(other.psicologos))
			return false;
		if (terapias == null) {
			if (other.terapias != null)
				return false;
		} else if (!terapias.equals(other.terapias))
			return false;
		return true;
	}
	
	
	

}
