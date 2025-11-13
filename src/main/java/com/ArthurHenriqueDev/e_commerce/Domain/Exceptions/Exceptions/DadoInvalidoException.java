package com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions;

public class DadoInvalidoException extends RuntimeException {
    public DadoInvalidoException(String message) {
        super(message);
    }
    public DadoInvalidoException() {
        super("Erro de processamento");
    }
}
