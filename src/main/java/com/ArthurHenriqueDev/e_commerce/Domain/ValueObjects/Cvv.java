package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public record Cvv(String cvv) {

    public Cvv(String cvv) {
        if (cvv != null && cvv.matches("^\\\\d{3,4}$")) this.cvv = cvv;
        else throw new DadoInvalidoException("CVV invalido");
    }
}
