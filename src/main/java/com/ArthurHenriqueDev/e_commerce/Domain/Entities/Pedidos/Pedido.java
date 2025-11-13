package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pedidos;

import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pagamentos.Pagamento;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Produtos.Produto;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.UsuarioComum.Comum;
import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Preco;

import java.util.List;

public class Pedido {

    private int idItem;
    private Long id;
    private Comum comprador;
    private Pagamento pagamento;
    private Frete opcaoFrete;
    private List<Produto> produtos;
    private Preco valorTotal;

    private Preco CalculaValorTotal(List<Produto> produtosRequisitados, Frete opcaoFrete) {
        var valorTotal = new Preco(0);
        for (Produto produto : produtosRequisitados) {
            valorTotal = valorTotal.add(produto.getPreco());
        }
        valorTotal = valorTotal.add(opcaoFrete.getPreco());
        return valorTotal;
    };

    public Pedido(Comum comprador, Pagamento pagamento, Frete opcaoFrete, List<Produto> produtos, Preco valorTotal) {
        if (comprador == null) throw new DadoInvalidoException();
        if (Pedido.this.produtos == null) throw new DadoInvalidoException("Nenhum produto");
        if (pagamento == null) throw new DadoInvalidoException("Erro de pagamento");
        if (opcaoFrete == null) throw new DadoInvalidoException("Frete indisponivel");

        this.comprador = comprador;
        this.pagamento = pagamento;
        this.opcaoFrete = opcaoFrete;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
        this.valorTotal = this.CalculaValorTotal(produtos, opcaoFrete);
    }
}
