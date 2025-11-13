package com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions;

public class SenhaFracaException extends RuntimeException {
    public SenhaFracaException() {
        super("Senha fraca");
    }
}
