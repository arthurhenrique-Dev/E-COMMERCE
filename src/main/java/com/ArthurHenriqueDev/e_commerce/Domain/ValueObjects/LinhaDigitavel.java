package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public record LinhaDigitavel(String linhaDigitavel) {

    public LinhaDigitavel(String linhaDigitavel) {
        if (linhaDigitavel != null && linhaDigitavel.matches("^\\d{47,54}$")) this.linhaDigitavel = linhaDigitavel;
        else throw new DadoInvalidoException("Erro na linha digitavel");
    }
}
