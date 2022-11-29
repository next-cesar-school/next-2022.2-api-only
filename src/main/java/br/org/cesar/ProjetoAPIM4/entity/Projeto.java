package br.org.cesar.ProjetoAPIM4.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
// import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;

@Entity
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idProjeto;
    private String nomeProjeto;
    private Date dataInicio;
    private Date dataTermino;
    private Status status;
    private Flag flag;
    
    @ManyToOne
    // @JoinColumn(name="USUARIO", referencedColumnName = "idFuncionario")
    // @org.hibernate.annotations.ForeignKey(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    private CentroCusto centroDeCusto;

    
    public Projeto() {
    }


    public Projeto(String nomeProjeto, Date dataInicio, Date dataTermino, Status status, Flag flag,
            Usuario usuario, CentroCusto centroDeCusto) {
        this.nomeProjeto = nomeProjeto;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.status = status;
        this.flag = flag;
        this.usuario = usuario;
        this.centroDeCusto = centroDeCusto;
    }


    public long getIdProjeto() {
        return idProjeto;
    }


    public String getNomeProjeto() {
        return nomeProjeto;
    }


    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
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


    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }


    public Flag getFlag() {
        return flag;
    }


    public void setFlag(Flag flag) {
        this.flag = flag;
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public CentroCusto getCentroDeCusto() {
        return centroDeCusto;
    }


    public void setCentroDeCusto(CentroCusto centroDeCusto) {
        this.centroDeCusto = centroDeCusto;
    }
   
}
