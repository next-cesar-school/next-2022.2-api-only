package com.m4.ProjetoBanco.models;

public class CentroCusto {
	
	int idCusto;
	
	Double valorTotal;

	public int getIdCusto() {
		return idCusto;
	}

	public void setIdCusto(int idCusto) {
		this.idCusto = idCusto;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public CentroCusto(int idCusto, Double valorTotal) {
		super();
		this.idCusto = idCusto;
		this.valorTotal = valorTotal;
	}
	

}
