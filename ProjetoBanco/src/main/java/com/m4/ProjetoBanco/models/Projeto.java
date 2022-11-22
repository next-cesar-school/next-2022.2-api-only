package com.m4.ProjetoBanco.models;

public class Projeto {
	
	String nomeProjeto;
	
	int idUnico;
	
	String dataInicio;
	
	String dataTermino;

	public Projeto(String nomeProjeto, int idUnico, String dataInicio, String dataTermino) {
		super();
		this.nomeProjeto = nomeProjeto;
		this.idUnico = idUnico;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public int getIdUnico() {
		return idUnico;
	}

	public void setIdUnico(int idUnico) {
		this.idUnico = idUnico;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

}
