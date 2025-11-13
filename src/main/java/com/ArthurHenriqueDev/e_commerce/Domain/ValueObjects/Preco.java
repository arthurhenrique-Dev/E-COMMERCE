package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

import java.math.BigDecimal;

public class Preco {

    private BigDecimal preco;

    private BigDecimal validaPreco(BigDecimal preco) {
        if (preco.compareTo(BigDecimal.ZERO) <= 0) throw new DadoInvalidoException("Preço não pode ser menor que zero");
        if (preco.scale() != 2) preco = preco.setScale(2, BigDecimal.ROUND_HALF_UP);
        return preco;
    }
}
