package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

import java.util.List;

public record Modelos(List<Item> modelos) {

    public Modelos(List<Item> modelos) {
        if (modelos != null && !modelos.isEmpty()) this.modelos = modelos;
        else throw new DadoInvalidoException("Modelos não pode ser vazio, exemplo de modelos: controle preto, controle branco");
    }
}
