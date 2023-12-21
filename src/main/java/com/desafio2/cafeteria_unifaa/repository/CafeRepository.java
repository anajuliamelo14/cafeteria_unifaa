package com.desafio2.cafeteria_unifaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio2.cafeteria_unifaa.model.Cafe;


public interface CafeRepository extends JpaRepository< Cafe, Long>{

    
}
