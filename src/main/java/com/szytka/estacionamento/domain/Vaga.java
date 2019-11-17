package com.szytka.estacionamento.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.szytka.estacionamento.domain.enums.TipoVaga;

@Entity
public class Vaga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer tipoVaga;
	private Integer status;

	@ManyToOne
	@JoinColumn(name = "id_veiculo")
	private Veiculo veiculo;

	public Vaga() {

	}

	public Vaga(Integer id, TipoVaga tipoVaga, Integer status,Veiculo veiculo) {
		super();
		this.id = id;
		this.tipoVaga = (tipoVaga == null) ? null : tipoVaga.getCod();
		this.status = status;
		this.veiculo = veiculo;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setTipoVaga(Integer tipoVaga) {
		this.tipoVaga = tipoVaga;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTipoVaga() {
		return tipoVaga;
	}

	public void setTipo(TipoVaga tipo) {
		this.tipoVaga = tipo.getCod();
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Vaga other = (Vaga) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vaga [id=" + id + ", tipoVaga=" + tipoVaga + ", status=" + status + "]";
	}

}
