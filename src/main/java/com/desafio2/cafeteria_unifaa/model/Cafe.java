package com.desafio2.cafeteria_unifaa.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cafe")
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @OneToMany(mappedBy = "cafe")
    @JsonManagedReference
    private List<Detalhes> detalhes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public List<Detalhes> getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(List<Detalhes> detalhes) {
        this.detalhes = detalhes;
    }

    
    
}
