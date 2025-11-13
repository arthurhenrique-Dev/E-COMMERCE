package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public record QuantidadeValida(Integer valor) {

    public QuantidadeValida(Integer valor) {
        if (valor < 0) this.valor = valor;
        else throw new DadoInvalidoException("Valor deve ser positivo");
    }
}
