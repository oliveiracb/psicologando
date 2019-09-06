package br.edu.ifpb.esperanca.daw2.psicologando.entities;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import br.edu.ifpb.esperanca.daw2.psicologando.beans.AlarmeMedBean;

@Entity
public class AlarmeMed implements Identificavel{
	@Id
	@GeneratedValue(generator="alarme_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="alarme_seq")
	private Long id;
	
	@ManyToOne
	private Paciente possui;
	
	private String titulo;
	private ArrayList<String> descricao;
	private Date horaInicio;
	private Date horaFim;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Paciente getPossui() {
		return possui;
	}
	public void setPossui(Paciente possui) {
		this.possui = possui;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public ArrayList<String> getDescricao() {
		return descricao;
	}
	public void setDescricao(ArrayList<String> descricao) {
		this.descricao = descricao;
	}
	public Date getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Date getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(Date horaFim) {
		this.horaFim = horaFim;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((horaFim == null) ? 0 : horaFim.hashCode());
		result = prime * result + ((horaInicio == null) ? 0 : horaInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((possui == null) ? 0 : possui.hashCode());
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
		AlarmeMed other = (AlarmeMed) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (horaFim == null) {
			if (other.horaFim != null)
				return false;
		} else if (!horaFim.equals(other.horaFim))
			return false;
		if (horaInicio == null) {
			if (other.horaInicio != null)
				return false;
		} else if (!horaInicio.equals(other.horaInicio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (possui == null) {
			if (other.possui != null)
				return false;
		} else if (!possui.equals(other.possui))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	public void remove(AlarmeMedBean entidade) {
		// TODO Auto-generated method stub
		
	}
	

}
