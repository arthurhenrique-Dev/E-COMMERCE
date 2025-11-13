package com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Pagamentos;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.DTOPagamento;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pagamentos.Pagamento;

public interface ProcessarPagamentoPort {

    Pagamento ProcessarPagamento(DTOPagamento dto);
}
