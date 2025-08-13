package dev.fabiosimones.notificacao.infrastructure.exceptions;

import dev.fabiosimones.notificacao.business.EmailService;

public class EmailException extends RuntimeException{
    public EmailException(String mensagem){
        super(mensagem);
    }
    public EmailException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
