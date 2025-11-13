package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public record Cep(String cep) {

    public Cep(String cep) {
        if (cep.matches("^[0-9]{8}$")) this.cep = cep;
        else throw new DadoInvalidoException("CEP invalido");
    }
}
