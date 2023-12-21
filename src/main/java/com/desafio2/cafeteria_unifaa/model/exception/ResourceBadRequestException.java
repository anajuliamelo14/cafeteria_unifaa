package com.desafio2.cafeteria_unifaa.model.exception;

public class ResourceBadRequestException extends RuntimeException{
    
    public ResourceBadRequestException (String mensagem){
        super(mensagem);
    }
}
