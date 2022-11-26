package br.com.cesar.ProjetoM4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USR_USUARIO")
public class Usuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USUARIO_ID", nullable=false)
	public long idFuncionario;

	@Column(name="USUARIO_NOME")
	public String nomeFuncionario;

	@Column(name="USUARIO_MATRICULA")
	public long matricula;

	@Column(name="USUARIO_STATUS")
	public boolean status;

	@Column(name="USUARIO_GERENTE")
	public boolean gerente;
	
	public Usuario() {
	}
	
	public Usuario(long idFuncionario, String nomeFuncionario, long matricula, boolean status, boolean gerente) {
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.matricula = matricula;
		this.status = status;
		this.gerente = gerente;
	}

	public long getMatricula() {
		return matricula;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}


	public String getNomeFuncionario() {
		return nomeFuncionario;
	}


	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
}
