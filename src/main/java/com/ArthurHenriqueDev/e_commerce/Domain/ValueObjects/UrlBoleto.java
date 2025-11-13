package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;

public record UrlBoleto(String urlBoleto) {

    public UrlBoleto(String urlBoleto) {
        if (urlBoleto != null && !urlBoleto.trim().isEmpty()) this.urlBoleto = urlBoleto;
        else throw new DadoInvalidoException("Erro na url do boleto invalido");
    }
}
