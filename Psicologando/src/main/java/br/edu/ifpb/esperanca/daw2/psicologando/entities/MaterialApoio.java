package br.edu.ifpb.esperanca.daw2.psicologando.entities;

import java.io.File;
import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class MaterialApoio implements Identificavel{
	@Id
	@GeneratedValue(generator="mate_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="mate_seq")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_psi")
	private Psicologo psicologo;
	
	private String titulo;
	private URL link;
	private File arquivo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Psicologo getPsicologo() {
		return psicologo;
	}
	public void setPsicologo(Psicologo psicologo) {
		this.psicologo = psicologo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public URL getLink() {
		return link;
	}
	public void setLink(URL link) {
		this.link = link;
	}
	public File getArquivo() {
		return arquivo;
	}
	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arquivo == null) ? 0 : arquivo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((psicologo == null) ? 0 : psicologo.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		MaterialApoio other = (MaterialApoio) obj;
		if (arquivo == null) {
			if (other.arquivo != null)
				return false;
		} else if (!arquivo.equals(other.arquivo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (psicologo == null) {
			if (other.psicologo != null)
				return false;
		} else if (!psicologo.equals(other.psicologo))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	public void save(MaterialApoio user) {
		// TODO Auto-generated method stub
		
	}

}
