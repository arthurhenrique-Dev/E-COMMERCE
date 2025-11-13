package com.ArthurHenriqueDev.e_commerce.Application.Ports.Output;

import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pedidos.Estado;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pedidos.Pedido;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Cpf;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Nome;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PedidoRepository {

    void Salvar(Pedido pedido);
    List<Pedido> Ler(Integer pages, Integer size);
    List<Pedido> LerPorNomeDeProduto(Integer pages, Integer size, String nome);
    List<Pedido> LerPorCpf(Integer pages, Integer size, Cpf cpf);
    List<Pedido> LerPorDia(Integer pages, Integer size, LocalDate dia);
    List<Pedido> LerPorNomeDePessoa(Integer pages, Integer size, Nome nome);
    List<Pedido> LerPorEstadoDeEntrega(Integer pages, Integer size, Estado estado);
    Optional<Pedido> LerPorId(Long id);
    void CancelarPedido(Long id);
}
