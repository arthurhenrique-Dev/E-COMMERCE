package com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Usuario;

import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.ItensCarrinho;

import java.util.List;

public interface AdicionarItemCarrinhoPort {

    List<ItensCarrinho> AdicionarItemCarrinho(Item item);

}
