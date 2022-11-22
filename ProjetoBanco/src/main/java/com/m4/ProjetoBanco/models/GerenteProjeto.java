package com.m4.ProjetoBanco.models;

public class GerenteProjeto {
	
	int idGerente;
	
	String nomeGerente;

	public GerenteProjeto(int idGerente, String nomeGerente) {
		super();
		this.idGerente = idGerente;
		this.nomeGerente = nomeGerente;
	}

	public int getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(int idGerente) {
		this.idGerente = idGerente;
	}

	public String getNomeGerente() {
		return nomeGerente;
	}

	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}
}
