package com.ArthurHenriqueDev.e_commerce.Application.UseCases.Pagamento;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.DTOPagamento;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Pagamentos.ProcessarPagamentoPort;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Output.PagamentoRepository;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pagamentos.Pagamento;

import java.time.LocalDateTime;

public class ProcessarPagamentoUseCase implements ProcessarPagamentoPort {

    private final PagamentoRepository repository;

    public ProcessarPagamentoUseCase(PagamentoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Pagamento ProcessarPagamento(DTOPagamento dto) {
        Pagamento pagamento = new Pagamento(
                dto.cpfComprador(),
                dto.idProduto(),
                dto.valorPagamento(),
                dto.metodoPagamento(),
                LocalDateTime.now(),

        );
    }
}
