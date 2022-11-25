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
	public int idFuncionario;

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
	
	public Usuario(int idFuncionario, String nomeFuncionario, long matricula, boolean status) {
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.matricula = matricula;
		this.status = status;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}


	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}


	public String getNomeFuncionario() {
		return nomeFuncionario;
	}


	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public void UsuarioG(int idFuncionario2, String nomeFuncionario2, boolean gerente, long matricula2,
			boolean status2) {
		
	}

}
