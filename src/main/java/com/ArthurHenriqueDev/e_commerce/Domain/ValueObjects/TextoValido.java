package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public record TextoValido(String tv) {

    public TextoValido(String tv) {
        if (tv != null && !tv.trim().isEmpty()) this.tv = tv;
        else throw new DadoInvalidoException();
    }
}
