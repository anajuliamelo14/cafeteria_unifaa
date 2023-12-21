package com.desafio2.cafeteria_unifaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio2.cafeteria_unifaa.model.tiposCafe;


public interface tiposCafeRepository extends JpaRepository< tiposCafe, Long>{

    tiposCafe findByObservacao(String observacao);
    
}
