package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public record NumeroEndereco(String numero) {

    public NumeroEndereco(String numero) {
        if (numero.matches("^\\d+(?:[\\/\\-]\\d+)?(?:\\s*[A-Za-z])?$\n")) this.numero = numero;
        else throw new DadoInvalidoException("Numero invalido");
    }
}
