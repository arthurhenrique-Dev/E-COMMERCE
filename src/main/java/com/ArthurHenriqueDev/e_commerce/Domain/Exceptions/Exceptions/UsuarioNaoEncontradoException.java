package com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions;

public class UsuarioNaoEncontradoException extends RuntimeException {
    public UsuarioNaoEncontradoException(String message) {
        super(message);
    }

    public UsuarioNaoEncontradoException() {
        super("Usuario nao encontrado");
    }
}
