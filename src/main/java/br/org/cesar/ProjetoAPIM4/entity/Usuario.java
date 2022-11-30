package br.org.cesar.ProjetoAPIM4.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFuncionario;
    private String nomeFuncionario;
    private long matricula;
    private boolean status;
    private boolean gerente;
    
    
    public Usuario() {
    }

    public Usuario(String nomeFuncionario, long matricula, boolean status, boolean gerente) {
        this.nomeFuncionario = nomeFuncionario;
        this.matricula = matricula;
        this.status = status;
        this.gerente = gerente;
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
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

    public boolean isGerente() {
        return gerente;
    }

    public void setGerente(boolean gerente) {
        this.gerente = gerente;
    }
    
}
