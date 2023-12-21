package com.desafio2.cafeteria_unifaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio2.cafeteria_unifaa.model.Cliente;
import com.desafio2.cafeteria_unifaa.service.ClienteService;

@RestController
@RequestMapping("/api/Clientes")
@CrossOrigin("*")
public class ClienteController {
    
    @Autowired
    private ClienteService ClienteService;
   
    @GetMapping
    public List<Cliente> obterTodos(){   
        return ClienteService.obterTodos();
    }

    @GetMapping("/{id}")
    public Cliente obterPorId(@PathVariable Long id){
       return ClienteService.obterPorId(id);
    }


    @PostMapping
    public Cliente adicionar(@RequestBody Cliente Cliente){
       return ClienteService.adicionar(Cliente);
    }


    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente Cliente){
       return ClienteService.atualizar(id, Cliente);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
         ClienteService.deletar(id);
    }
}
