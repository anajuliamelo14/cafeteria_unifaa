package com.desafio2.cafeteria_unifaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio2.cafeteria_unifaa.model.Cliente;


public interface ClienteRepository extends JpaRepository< Cliente, Long>{

    Cliente findByObservacao(String observacao);
    
}
