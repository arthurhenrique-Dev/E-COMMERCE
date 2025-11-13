package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Produtos;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public class Avaliacao {

    private String comentario;
    private int avaliacao;

    public Avaliacao(String comentario, int avaliacao) {
        this.comentario = comentario;
        if (avaliacao > 0 && avaliacao <= 5) this.avaliacao = avaliacao;
        else throw new DadoInvalidoException();
    }
}
