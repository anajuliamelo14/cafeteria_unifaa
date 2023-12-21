package com.desafio2.cafeteria_unifaa.model.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String mensagem){
        super(mensagem);
    }
    
}
