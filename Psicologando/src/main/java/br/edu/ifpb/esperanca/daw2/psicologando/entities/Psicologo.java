package br.edu.ifpb.esperanca.daw2.psicologando.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Psicologo extends Usuario implements Identificavel {
	private Long crp;
	
	@ManyToMany
	@JoinTable(name="pontoApoio_psicologo")
	private Set<PontoApoio> pontosApoio;

	public Long getCrp() {
		return crp;
	}

	public void setCrp(Long crp) {
		this.crp = crp;
	}

	public Set<PontoApoio> getPontosApoio() {
		return pontosApoio;
	}

	public void setPontosApoio(Set<PontoApoio> pontosApoio) {
		this.pontosApoio = pontosApoio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((crp == null) ? 0 : crp.hashCode());
		result = prime * result + ((pontosApoio == null) ? 0 : pontosApoio.hashCode());
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
		Psicologo other = (Psicologo) obj;
		if (crp == null) {
			if (other.crp != null)
				return false;
		} else if (!crp.equals(other.crp))
			return false;
		if (pontosApoio == null) {
			if (other.pontosApoio != null)
				return false;
		} else if (!pontosApoio.equals(other.pontosApoio))
			return false;
		return true;
	}

	

}
