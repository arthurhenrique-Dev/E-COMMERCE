package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import java.time.YearMonth;

public record InfoCartao(

        Titular titular,
        NumeroCartao numero,
        YearMonth validade,
        Cvv cvv
) {



    public InfoCartao(Titular titular, NumeroCartao numero, YearMonth validade, Cvv cvv) {
        this.titular = titular;
        this.numero = numero;
        this.validade = validade;
        this.cvv = cvv;
    }
}
