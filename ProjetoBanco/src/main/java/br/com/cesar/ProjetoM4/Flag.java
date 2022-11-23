package br.com.cesar.ProjetoM4;

public class Flag {
	
	private String idFlag;
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
