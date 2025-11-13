package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

import java.util.List;

public record IndiceModelos(Integer indice) {

    public IndiceModelos(Integer indice) {
        if (indice != null && indice >= 0) this.indice = indice;
        else throw new DadoInvalidoException();
    }

    public Integer VerificaIndiceIdeal(Modelos lista) {
        if (this.indice <=  lista.modelos().size() - 1) return this.indice;
        else throw new DadoInvalidoException();
    }
}
