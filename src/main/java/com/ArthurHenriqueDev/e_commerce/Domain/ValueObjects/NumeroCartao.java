package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public record NumeroCartao(String numeroCartao) {

    public NumeroCartao(String numeroCartao) {
        if (numeroCartao != null && numeroCartao.matches("^\\\\d{13,19}$")) this.numeroCartao = numeroCartao;
        else throw new DadoInvalidoException("Numero de cartao invalido");
    }
}
