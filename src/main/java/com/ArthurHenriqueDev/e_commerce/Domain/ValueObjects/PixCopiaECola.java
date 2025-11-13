package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public record PixCopiaECola(String copCol) {

    public PixCopiaECola(String copCol) {
        if (copCol != null && !copCol.trim().isEmpty()) this.copCol = copCol;
        else throw new DadoInvalidoException();
    }
}
