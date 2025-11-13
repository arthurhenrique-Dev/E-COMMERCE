package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pagamentos;

import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.CodigoDeBarras;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.DateValido;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.LinhaDigitavel;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.UrlBoleto;

public class Boleto {

    private LinhaDigitavel linhaDigitavel;
    private CodigoDeBarras codigoDeBarras;
    private DateValido dataVencimento;
    private UrlBoleto urlBoleto;

    public Boleto(LinhaDigitavel linhaDigitavel, CodigoDeBarras codigoDeBarras, DateValido dataVencimento, UrlBoleto urlBoleto) {
        this.linhaDigitavel = linhaDigitavel;
        this.codigoDeBarras = codigoDeBarras;
        this.dataVencimento = dataVencimento;
        this.urlBoleto = urlBoleto;
    }
}
