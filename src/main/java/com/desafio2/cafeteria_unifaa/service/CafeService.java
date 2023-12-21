package com.desafio2.cafeteria_unifaa.service;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio2.cafeteria_unifaa.model.Cafe;
import com.desafio2.cafeteria_unifaa.model.exception.ResourceBadRequestException;
import com.desafio2.cafeteria_unifaa.repository.CafeRepository;

@Service
public class CafeService {

    @Autowired
    private CafeRepository cafeRepository; 

    
    public Cafe adicionar(Cafe cafe){
         
        cafe.setId((long) 0);
        return cafeRepository.save(cafe);
    }

   
    public List<Cafe> obterTodos(){ 
        return cafeRepository.findAll();
    }

   
    public Cafe obterPorId(Long id){
        Optional<Cafe> optCafe = cafeRepository.findById(id);
   
       if(optCafe.isEmpty()){
        throw new ResourceBadRequestException("Não existe um tipo de Café com o ID " + id);
       }

       return optCafe.get();
    }

    
    public Cafe atualizar(Long id, Cafe cafe){
        
        cafe.setId(id);
        return cafeRepository.save(cafe);
    }

   
    public void deletar(Long id){
        cafeRepository.deleteById(id);
    }

}
