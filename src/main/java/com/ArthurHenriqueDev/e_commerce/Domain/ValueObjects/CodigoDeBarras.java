package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public record CodigoDeBarras(String codigo) {

    public CodigoDeBarras(String codigo) {
        if (codigo != null && codigo.matches("\"^\\\\d{44,54}$\"")) this.codigo = codigo;
        else throw new DadoInvalidoException();
    }
}
