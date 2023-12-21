package com.desafio2.cafeteria_unifaa.service;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio2.cafeteria_unifaa.model.tiposCafe;
import com.desafio2.cafeteria_unifaa.model.exception.ResourceBadRequestException;
import com.desafio2.cafeteria_unifaa.repository.tiposCafeRepository;

@Service
public class tiposCafeService {

    @Autowired
    private tiposCafeRepository tiposCafeRepository; 

    
    public tiposCafe adicionar(tiposCafe tiposCafe){
         
        tiposCafe.setId(0);
        return tiposCafeRepository.save(tiposCafe);
    }

   
    public List<tiposCafe> obterTodos(){ 
        return tiposCafeRepository.findAll();
    }

   
    public tiposCafe obterPorId(Long id){
        Optional<tiposCafe> opttiposCafe = tiposCafeRepository.findById(id);
   
       if(opttiposCafe.isEmpty()){
        throw new ResourceBadRequestException("Não existe um tipo de Café com o ID " + id);
       }

       return opttiposCafe.get();
    }

    
    public tiposCafe atualizar(Long id, tiposCafe tiposCafe){
        
        tiposCafe.setId(id);
        return tiposCafeRepository.save(tiposCafe);
    }

   
    public void deletar(Long id){
        tiposCafeRepository.deleteById(id);
    }

    public tiposCafe obterpelaObservacao(String observacao){

     return tiposCafeRepository.findByObservacao(observacao);
    }
}
