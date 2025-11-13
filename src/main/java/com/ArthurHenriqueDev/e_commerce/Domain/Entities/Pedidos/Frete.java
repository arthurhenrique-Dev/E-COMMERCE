package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pedidos;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

import java.math.BigDecimal;

public class Frete {

    private String nomeOpcao;
    private BigDecimal preco;
    private Estado estado;


    public Frete(String nomeOpcao, BigDecimal preco, Estado estado) {
        if (preco.compareTo(BigDecimal.ZERO) < 0) throw new DadoInvalidoException();
        if (estado == null) throw new DadoInvalidoException();
        this.nomeOpcao = nomeOpcao;
        this.preco = preco;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getNomeOpcao() {
        return nomeOpcao;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
