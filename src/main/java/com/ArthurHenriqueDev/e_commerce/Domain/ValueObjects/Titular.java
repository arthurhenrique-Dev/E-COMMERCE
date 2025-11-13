package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public record Titular(String titular) {

    public Titular(String titular) {
        if (titular != null && titular.matches("^[\\\\p{L} ]+$")) this.titular = titular;
        else throw new DadoInvalidoException("Titular invalido");
    }
}
