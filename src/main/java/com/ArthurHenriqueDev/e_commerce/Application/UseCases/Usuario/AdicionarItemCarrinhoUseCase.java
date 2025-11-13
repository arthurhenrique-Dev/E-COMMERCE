package com.ArthurHenriqueDev.e_commerce.Application.UseCases.Usuario;

import com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Usuario.AdicionarItemCarrinhoPort;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Output.UsuarioRepository;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.ItensCarrinho;

import java.util.List;

public class AdicionarItemCarrinhoUseCase implements AdicionarItemCarrinhoPort {

    private final UsuarioRepository repository;

    public AdicionarItemCarrinhoUseCase(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ItensCarrinho> AdicionarItemCarrinho(Item item) {
        if (item.);
    }
}
