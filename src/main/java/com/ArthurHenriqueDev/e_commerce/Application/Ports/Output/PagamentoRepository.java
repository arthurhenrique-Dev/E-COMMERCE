package com.ArthurHenriqueDev.e_commerce.Application.Ports.Output;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.DTOPagamento;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pagamentos.Pagamento;

public interface PagamentoRepository {

    Pagamento ProcessarPagamento(DTOPagamento dto);
    void SalvarPagamento(Pagamento pagamento);
}
