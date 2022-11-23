package br.com.cesar.ProjetoM4;

import java.util.Date;

public class Projeto {
	
	private String idProjeto;
	private String nomeProjeto;
	private Date dataInicio;
	private Date dataTermino;
	private Usuario funcionario;
	private Status status;
	private Flag flag;
	private CentroCusto centroDeCusto;
	

	public Flag getFlag() {
		return flag;
	}

	public void setFlag(Flag flag) {
		this.flag = flag;
	}

	public Projeto() {
	}

	public Projeto(String idProjeto, String nomeProjeto, Date dataInicio, Date dataTermino, Usuario funcionario,
			Status status, Flag flag, CentroCusto centroDeCusto) {
		this.idProjeto = idProjeto;
		this.nomeProjeto = nomeProjeto;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.funcionario = funcionario;
		this.status = status;
		this.flag = flag;
		this.centroDeCusto = centroDeCusto;
	}

	public String getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(String idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public Usuario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Usuario funcionario) {
		this.funcionario = funcionario;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public CentroCusto getCentroDeCusto() {
		return centroDeCusto;
	}

	public void setCentroDeCusto(CentroCusto centroDeCusto) {
		this.centroDeCusto = centroDeCusto;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	} 
}
