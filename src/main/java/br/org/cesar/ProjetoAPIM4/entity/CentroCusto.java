package br.org.cesar.ProjetoAPIM4.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CentroCusto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCentro;
    private String nomeCusteador;
    
    public CentroCusto() {
    }

    public CentroCusto(String nomeCusteador) {
        this.nomeCusteador = nomeCusteador;
    }

    public long getIdCentro() {
        return idCentro;
    }


    public String getNomeCusteador() {
        return nomeCusteador;
    }

    public void setNomeCusteador(String nomeCusteador) {
        this.nomeCusteador = nomeCusteador;
    }
    
    
}
