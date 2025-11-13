package com.ArthurHenriqueDev.e_commerce.Application.DTOs.Produto;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.DTOPagamento;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pedidos.Frete;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Cpf;

import java.util.List;

public record DTOPedido(

        DTOPagamento dtoPagamento,
        List<Long> idProdutos,
        Frete opcaoFrete
) {
}
