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

import com.desafio2.cafeteria_unifaa.model.tiposCafe;
import com.desafio2.cafeteria_unifaa.service.tiposCafeService;

@RestController
@RequestMapping("/api/tiposCafes")
@CrossOrigin("*")
public class tiposCafeController {
    
    @Autowired
    private tiposCafeService tiposCafeService;
   
    @GetMapping
    public List<tiposCafe> obterTodos(){   
        return tiposCafeService.obterTodos();
    }

    @GetMapping("/{id}")
    public tiposCafe obterPorId(@PathVariable Long id){
       return tiposCafeService.obterPorId(id);
    }


    @PostMapping
    public tiposCafe adicionar(@RequestBody tiposCafe tiposCafe){
       return tiposCafeService.adicionar(tiposCafe);
    }


    @PutMapping("/{id}")
    public tiposCafe atualizar(@PathVariable Long id, @RequestBody tiposCafe tiposCafe){
       return tiposCafeService.atualizar(id, tiposCafe);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
         tiposCafeService.deletar(id);
    }
}
