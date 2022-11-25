package br.com.cesar.ProjetoM4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CC_CUSTO")
public class CentroCusto {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="CUSTO_ID", nullable=false)
	private long idCentro;
	
	@Column(name="CUSTO_NOME_CUSTEADOR")
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
