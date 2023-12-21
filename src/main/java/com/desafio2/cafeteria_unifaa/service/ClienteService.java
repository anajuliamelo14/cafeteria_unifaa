package com.desafio2.cafeteria_unifaa.service;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio2.cafeteria_unifaa.model.Cliente;
import com.desafio2.cafeteria_unifaa.model.exception.ResourceBadRequestException;
import com.desafio2.cafeteria_unifaa.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository ClienteRepository; 

    
    public Cliente adicionar(Cliente Cliente){
         
        Cliente.setId(0);
        return ClienteRepository.save(Cliente);
    }

   
    public List<Cliente> obterTodos(){ 
        return ClienteRepository.findAll();
    }

   
    public Cliente obterPorId(Long id){
        Optional<Cliente> optCliente = ClienteRepository.findById(id);
   
       if(optCliente.isEmpty()){
        throw new ResourceBadRequestException("Não existe um tipo de Café com o ID " + id);
       }

       return optCliente.get();
    }

    
    public Cliente atualizar(Long id, Cliente Cliente){
        
        Cliente.setId(id);
        return ClienteRepository.save(Cliente);
    }

   
    public void deletar(Long id){
        ClienteRepository.deleteById(id);
    }

    public Cliente obterpelaObservacao(String observacao){

     return ClienteRepository.findByObservacao(observacao);
    }
}
