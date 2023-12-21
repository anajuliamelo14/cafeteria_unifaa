package com.desafio2.cafeteria_unifaa.model;

import com.desafio2.cafeteria_unifaa.model.Enum.EUnidadeMedida;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
//@Table( name = "tipos_de_cafe")
public class tiposCafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tiposCafe")
    private long id;
    
    @Column(nullable = false)
    private String nome;

    private double valor;

    @Column(nullable = false)
    private EUnidadeMedida medida;


    private String observacao;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public EUnidadeMedida getMedida() {
        return medida;
    }

    public void setMedida(EUnidadeMedida medida) {
        this.medida = medida;
    }


    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
