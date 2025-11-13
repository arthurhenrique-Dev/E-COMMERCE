package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

import java.time.LocalDate;

public record DataNascimento(LocalDate dataNascimento) {

    public DataNascimento(LocalDate dataNascimento) {
        if (dataNascimento != null && dataNascimento.isBefore(LocalDate.now().minusYears(18)) && dataNascimento.isAfter(dataNascimento.minusYears(100))){
            this.dataNascimento = dataNascimento;
        } else throw new DadoInvalidoException("Data de nascimento invalida");
    }
}
