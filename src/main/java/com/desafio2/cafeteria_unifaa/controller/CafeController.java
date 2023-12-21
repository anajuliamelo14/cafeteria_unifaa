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

import com.desafio2.cafeteria_unifaa.model.Cafe;
import com.desafio2.cafeteria_unifaa.service.CafeService;

@RestController
@RequestMapping("/api/Cafes")
@CrossOrigin("*")
public class CafeController {
    
    @Autowired
    private CafeService CafeService;
   
    @GetMapping
    public List<Cafe> obterTodos(){   
        return CafeService.obterTodos();
    }

    @GetMapping("/{id}")
    public Cafe obterPorId(@PathVariable Long id){
       return CafeService.obterPorId(id);
    }


    @PostMapping
    public Cafe adicionar(@RequestBody Cafe Cafe){
       return CafeService.adicionar(Cafe);
    }


    @PutMapping("/{id}")
    public Cafe atualizar(@PathVariable Long id, @RequestBody Cafe Cafe){
       return CafeService.atualizar(id, Cafe);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
         CafeService.deletar(id);
    }
}
