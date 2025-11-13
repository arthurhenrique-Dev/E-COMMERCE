package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Produtos;

import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.*;

import java.util.List;

public class Produto {

    private final Long id;
    private final Modelos modelos;
    private List<Avaliacao> avaliacoes;
    private TextoValido nome;
    private final TextoValido descricao;
    private Preco preco;
    private Integer quantidade;
    private IndiceModelos indiceModelos;
    private Disponibilidade status;

    private Integer CalculaQuantidade(Modelos modelo) {
        Integer total = 0;
        for (Item item : modelo.modelos()) {
            total += item.quantidade().valor();
        }
        return total;
    }
    private Disponibilidade ChecaDisponibilidade(Integer quantidade) {
        if (quantidade > 0) return Disponibilidade.DISPONIVEL;
        else return Disponibilidade.INDISPONIVEL;
    }
    public void SelecionarModelo(IndiceModelos novoIndiceModelo) {
        int i = novoIndiceModelo.VerificaIndiceIdeal(modelos);
        Item itemSelecionado = modelos.modelos().get(i);

        this.indiceModelos = novoIndiceModelo;
        this.nome = itemSelecionado.nome();
        this.preco = itemSelecionado.preco();
    }
    public Produto(Modelos modelos, List<Avaliacao> avaliacoes, TextoValido nome, TextoValido descricao, IndiceModelos indice) {
        this.id = null;
        this.modelos = modelos;
        this.avaliacoes = avaliacoes;
        this.nome = modelos.modelos().get(indice.VerificaIndiceIdeal(modelos)).nome();
        this.descricao = descricao;
        this.preco = modelos.modelos().get(indice.VerificaIndiceIdeal(modelos)).preco();
        this.quantidade = CalculaQuantidade(modelos);
        this.status = ChecaDisponibilidade(quantidade);
    }


}
