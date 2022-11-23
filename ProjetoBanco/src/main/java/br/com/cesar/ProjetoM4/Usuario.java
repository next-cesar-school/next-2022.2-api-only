package br.com.cesar.ProjetoM4;

public class Usuario {
	
	public int idFuncionario;
	public String nomeFuncionario;
	public long matricula;
	public boolean status;
	
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
