package com.desafio2.cafeteria_unifaa.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;

@Entity
public class Endereco {
   
    @JsonBackReference
    private Long id;
    private String cep;
    private String bairro;
    private int numero;
    private String cidade;
    private String estado;
    private String rua;
    private String complemento;


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

