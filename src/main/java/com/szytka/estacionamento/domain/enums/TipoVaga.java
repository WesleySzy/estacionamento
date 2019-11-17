package com.szytka.estacionamento.domain.enums;

public enum TipoVaga {
	
	VAZIA(1, "Vaga Vazia"),
	OCUPADA(2, "Vaga Ocupada");

	private int cod;
	private String descricao;
	
	private TipoVaga(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static TipoVaga toEnum(Integer cod) {
		if (cod ==null) {
			return null;
		}
		for (TipoVaga x : TipoVaga.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido "+ cod);
	}

}
