package com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Pedidos;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.Produto.DTOPedido;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pedidos.Pedido;

public interface CompraPort {

    Pedido Compra(DTOPedido dto);
}
