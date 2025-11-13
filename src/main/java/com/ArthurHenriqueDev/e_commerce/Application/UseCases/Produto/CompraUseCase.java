package com.ArthurHenriqueDev.e_commerce.Application.UseCases.Produto;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.Produto.DTOPedido;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Pedidos.CompraPort;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Output.PedidoRepository;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Output.ProdutoRepository;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Output.UsuarioRepository;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pagamentos.Pagamento;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pedidos.Pedido;

public class CompraUseCase implements CompraPort {

    private final PedidoRepository repository;
    private final UsuarioRepository usuarioRepository;
    private final ProdutoRepository produtoRepository;

    public CompraUseCase(PedidoRepository repository, UsuarioRepository usuarioRepository, ProdutoRepository produtoRepository) {
        this.repository = repository;
        this.usuarioRepository = usuarioRepository;
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Pedido Compra(DTOPedido dto) {
        var Pagamento = dto.dtoPagamento();
    }
}
