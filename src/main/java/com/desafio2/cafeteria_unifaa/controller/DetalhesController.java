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

import com.desafio2.cafeteria_unifaa.model.Detalhes;
import com.desafio2.cafeteria_unifaa.service.DetalhesService;

@RestController
@RequestMapping("/api/Detalhes")
@CrossOrigin("*")
public class DetalhesController {
    
    @Autowired
    private DetalhesService DetalhesService;
   
    @GetMapping
    public List<Detalhes> obterTodos(){   
        return DetalhesService.obterTodos();
    }

    @GetMapping("/{id}")
    public Detalhes obterPorId(@PathVariable Long id){
       return DetalhesService.obterPorId(id);
    }


    @PostMapping
    public Detalhes adicionar(@RequestBody Detalhes Detalhes){
       return DetalhesService.adicionar(Detalhes);
    }


    @PutMapping("/{id}")
    public Detalhes atualizar(@PathVariable Long id, @RequestBody Detalhes Detalhes){
       return DetalhesService.atualizar(id, Detalhes);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
         DetalhesService.deletar(id);
    }
}
