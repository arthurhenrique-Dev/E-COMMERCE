package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import java.math.BigDecimal;

public record Produto(

        String nome,
        Integer quantidade,
        BigDecimal preco
) {
    public Produto(String nome, Integer quantidade, BigDecimal preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
