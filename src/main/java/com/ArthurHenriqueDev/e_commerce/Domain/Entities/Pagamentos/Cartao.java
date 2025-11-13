package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pagamentos;

import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.InfoCartao;

public class Cartao{

    private InfoCartao infoCartao;
    private MetodoPagamento metodoPagamento;

    public Cartao(InfoCartao infoCartao, MetodoPagamento metodoPagamento) {
        this.infoCartao = infoCartao;
        this.metodoPagamento = metodoPagamento;
    }


    public static Cartao GeradorCartaoCredito(InfoCartao info){
        Cartao cartaoCredito = new Cartao(

                info,
                MetodoPagamento.CREDITO
        );
        return cartaoCredito;
    }

    public static Cartao GeradorCartaoDebito(InfoCartao info){
        Cartao cartaoDebito = new Cartao(

                info,
                MetodoPagamento.DEBITO
        );
        return cartaoDebito;
    }
}
