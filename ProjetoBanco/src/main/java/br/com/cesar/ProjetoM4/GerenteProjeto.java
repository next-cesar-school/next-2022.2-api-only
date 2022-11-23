package br.com.cesar.ProjetoM4;

public class GerenteProjeto extends Usuario{

	private Usuario usuario;
	private boolean gerente;
	
	public GerenteProjeto(Usuario usuario, boolean gerente) {
		super.UsuarioG(idFuncionario,nomeFuncionario, gerente, matricula, status); 
		this.gerente = gerente;	
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isGerente() {
		return gerente;
	}

	public void setGerente(boolean gerente) {
		this.gerente = gerente;
	}

	
	
	
	
/* GET http://<servidor>/projects; retornar a lista de projetos cadastrados no banco de dados; OPCIONAL: incluir filtros por certas entidades mencionadas acima
- POST http://<servidor>/projects; adicionar um novo projeto ao banco de dados.
- PUT http://<servidor>/projects/<id>; editar projeto existente no banco de dados.
- GET http://<servidor>/projects/<id>; retornar um projeto em específico.
- GET http://<servidor>/users; retornar a lista de usuários do sistema
- POST http://<servidor>/users; ad
*/
	
	
}
