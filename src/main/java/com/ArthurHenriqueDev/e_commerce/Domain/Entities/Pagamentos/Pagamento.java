package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pagamentos;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Cpf;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.InfoCartao;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Preco;

import java.time.LocalDateTime;

public class Pagamento {

    private Cpf cpf;
    private Long idPagamento;
    private Long idExternoPagamento;
    private Preco valorPagamento;
    private StatusPagamento statusPagamento;
    private MetodoPagamento metodoPagamento;
    private Pix pix;
    private Cartao cartao;
    private Boleto boleto;
    private LocalDateTime momentoPagamento;

    private void ProtegeMetodoPagamento(MetodoPagamento metodoPagamento, InfoCartao cartao, Boleto boleto, Pix pix) {

        switch (metodoPagamento){
            case PIX:
                this.pix = pix;
                this.cartao = null;
                this.boleto = null;
                if (this.pix == null) throw new DadoInvalidoException();
                break;
            case DEBITO:
                this.cartao = Cartao.GeradorCartaoDebito(cartao);
                this.boleto = null;
                this.pix = null;
                if (this.cartao == null) throw new DadoInvalidoException();
                break;
            case CREDITO:
                this.cartao = Cartao.GeradorCartaoCredito(cartao);
                this.boleto = null;
                this.pix = null;
                if (this.cartao == null) throw new DadoInvalidoException();
                break;
            case BOLETO:
                this.boleto = boleto;
                this.cartao = null;
                this.pix = null;
                if (this.boleto == null) throw new DadoInvalidoException();
                break;
            default:
                throw new DadoInvalidoException("Erro no metodo de pagamento.");
        }
    }

    private Pagamento(Cpf cpf, Long idExternoPagamento, Preco valorPagamento, MetodoPagamento metodoPagamento, Pix pix, InfoCartao cartao, Boleto boleto, LocalDateTime momentoPagamento, StatusPagamento statusPagamento) {


        if (metodoPagamento == null) throw new DadoInvalidoException();
        if (momentoPagamento == null) throw new DadoInvalidoException();

        ProtegeMetodoPagamento(metodoPagamento, cartao, boleto, pix);

        this.cpf = cpf;
        this.idPagamento = null;
        this.idExternoPagamento = idExternoPagamento;
        this.valorPagamento = valorPagamento;
        this.metodoPagamento = metodoPagamento;
        this.momentoPagamento = momentoPagamento;
    }

    public static Pagamento AprovarPagamento(Cpf cpf, Long idExternoPagamento, Preco valorPagamento, MetodoPagamento metodoPagamento, Pix pix, InfoCartao cartao, Boleto boleto, LocalDateTime momentoPagamento){

        return new Pagamento(
                cpf,
                idExternoPagamento,
                valorPagamento,
                metodoPagamento,
                pix,
                cartao,
                boleto,
                momentoPagamento,
                StatusPagamento.APROVADO
        );
    }

    public static Pagamento RecusarPagamento(Cpf cpf, Long idExternoPagamento, Preco valorPagamento, MetodoPagamento metodoPagamento, Pix pix, InfoCartao cartao, Boleto boleto, LocalDateTime momentoPagamento){

        return new Pagamento(
                cpf,
                idExternoPagamento,
                valorPagamento,
                metodoPagamento,
                pix,
                cartao,
                boleto,
                momentoPagamento,
                StatusPagamento.RECUSADO
        );
    }

    public static Pagamento GeradorPagamentoEmAguardo(Cpf cpf, Long idExternoPagamento, Preco valorPagamento, MetodoPagamento metodoPagamento, Pix pix, InfoCartao cartao, Boleto boleto, LocalDateTime momentoPagamento){

        return new Pagamento(
                cpf,
                idExternoPagamento,
                valorPagamento,
                metodoPagamento,
                pix,
                cartao,
                boleto,
                momentoPagamento,
                StatusPagamento.AGUARDANDO
        );
    }
}
