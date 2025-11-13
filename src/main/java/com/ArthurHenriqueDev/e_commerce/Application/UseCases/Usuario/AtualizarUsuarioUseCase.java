package com.ArthurHenriqueDev.e_commerce.Application.UseCases.Usuario;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.Usuario.DTOAtualizacaoUsuario;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Usuario.AtualizarUsuarioPort;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Output.UsuarioRepository;
import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.DadoInvalidoException;
import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.UsuarioNaoEncontradoException;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Cpf;

public class AtualizarUsuarioUseCase implements AtualizarUsuarioPort {

    private final UsuarioRepository repository;

    public AtualizarUsuarioUseCase(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public void AtualizarUsuario(Cpf cpf, DTOAtualizacaoUsuario dto) {

        var retorno = repository.LerPorCpf(cpf)
                .orElseThrow(() -> new UsuarioNaoEncontradoException());
        if (dto.celular() != null) retorno.setCelular(dto.celular());
        if (dto.email() != null) retorno.setEmail(dto.email());
        if (dto.celular() == null && dto.email() == null) throw new DadoInvalidoException("Insira os dados para a atualização");
    }
}
