package com.desafio2.cafeteria_unifaa.service;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio2.cafeteria_unifaa.model.Detalhes;
import com.desafio2.cafeteria_unifaa.repository.DetalhesRepository;

@Service
public class DetalhesService {

    @Autowired
    private DetalhesRepository DetalhesRepository; 

    
    public Detalhes adicionar(Detalhes detalhes){
         
        detalhes.setId(0);
        return DetalhesRepository.save(detalhes);
    }

   
    public List<Detalhes> obterTodos(){ 
        return DetalhesRepository.findAll();
    }

   
    public Detalhes obterPorId(Long id){
        Optional<Detalhes> optdetalhes = DetalhesRepository.findById(id);
   

       return optdetalhes.get();
    }

    
    public Detalhes atualizar(Long id, Detalhes detalhes){
        
        detalhes.setId(id);
        return DetalhesRepository.save(detalhes);
    }

   
    public void deletar(Long id){
        DetalhesRepository.deleteById(id);
    }
}
