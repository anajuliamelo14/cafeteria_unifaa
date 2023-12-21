package com.desafio2.cafeteria_unifaa.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Detalhes {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalhes")
    private Long id;

   // @Column(nullable = false)
    private String tamanho; // pequeno (100ml), medio(200ml) , grande(400ml-frappuccino)

        private double valor;

        private String observacao;

        @ManyToOne
        @JoinColumn(name = "id_cafe")
        @JsonBackReference
        private Cafe cafe;
        
        
        public Long getId() {
            return id;
        }


        public void setId(Long id) {
            this.id = id;
        }


        public String getTamanho() {
            return tamanho;
        }

        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }


        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }


        public String getObservacao() {
            return observacao;
        }

        public void setObservacao(String observacao) {
            this.observacao = observacao;
        }


        public void setId(int i) {
        }

    
}
