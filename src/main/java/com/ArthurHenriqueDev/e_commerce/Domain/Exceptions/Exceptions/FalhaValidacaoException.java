package com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions;

public class FalhaValidacaoException extends RuntimeException {
    public FalhaValidacaoException(String message) {
        super(message);
    }

    public FalhaValidacaoException() {
        super("Falha na validacao");
    }
}
