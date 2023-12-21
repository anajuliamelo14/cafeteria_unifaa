package com.desafio2.cafeteria_unifaa.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.desafio2.cafeteria_unifaa.model.ModeloErro;
import com.desafio2.cafeteria_unifaa.model.exception.ResourceBadRequestException;
import com.desafio2.cafeteria_unifaa.model.exception.ResourceNotFoundException;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFoundException ex){
        
        ModeloErro erro = new ModeloErro("Not Found", ex.getMessage(), 404);
        return ResponseEntity.status(404).body(erro);
    }

     @ExceptionHandler(ResourceBadRequestException.class)
    public ResponseEntity<?> handlerResourceBadRequestException(ResourceBadRequestException ex){
        
        ModeloErro erro = new ModeloErro("Bad Request", ex.getMessage(), 400);
        return ResponseEntity.status(404).body(erro);
    }
    
}
