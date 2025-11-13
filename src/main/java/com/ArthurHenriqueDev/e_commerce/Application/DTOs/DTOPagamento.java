package com.ArthurHenriqueDev.e_commerce.Application.DTOs;

import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pagamentos.MetodoPagamento;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Cpf;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Preco;

import java.math.BigDecimal;

public record DTOPagamento(

        Cpf cpfComprador,
        Long idProduto,
        Preco valorPagamento,
        MetodoPagamento metodoPagamento
) {
}
