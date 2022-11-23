package br.com.cesar.ProjetoM4;

public class CentroCusto {
	
	private long idCentro;
	private String nomeCusteador;
	
	public CentroCusto() {
	}

	public CentroCusto(long idCentro, String nomeCusteador) {
		this.idCentro = idCentro;
		this.nomeCusteador = nomeCusteador;
	}

	public long getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(long idCentro) {
		this.idCentro = idCentro;
	}

	public String getNomeCusteador() {
		return nomeCusteador;
	}

	public void setNomeCusteador(String nomeCusteador) {
		this.nomeCusteador = nomeCusteador;
	}
	
}
