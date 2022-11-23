package br.com.cesar.ProjetoM4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FL_FLAG")
public class Flag {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FLAG_ID", nullable=false)
	private String idFlag;
	
	@Column(name="FLAG_CLASSIFICACAO")
	private String classificacao;
	
	public Flag() {
	}
	
	public Flag(String idFlag, String classificacao) {
		this.idFlag = idFlag;
		this.classificacao = classificacao;
	}
	
	public String getIdFlag() {
		return idFlag;
	}
	public void setIdFlag(String idFlag) {
		this.idFlag = idFlag;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

}
