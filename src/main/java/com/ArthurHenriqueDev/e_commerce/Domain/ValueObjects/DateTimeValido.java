package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

import java.time.LocalDateTime;

public record DateTimeValido(LocalDateTime dataValida) {

    public DateTimeValido(LocalDateTime dataValida) {
        if (dataValida != null && dataValida.isBefore(LocalDateTime.now()))this.dataValida = dataValida;
        else throw new DadoInvalidoException("Data invalida");
    }
}
