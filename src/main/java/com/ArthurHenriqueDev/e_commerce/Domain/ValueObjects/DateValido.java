package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

import java.time.LocalDate;

public record DateValido(LocalDate dataValida) {

    public DateValido(LocalDate dataValida) {
        if (dataValida != null && dataValida.isBefore(LocalDate.now()))this.dataValida = dataValida;
        else throw new DadoInvalidoException("Data invalida");
    }
}
