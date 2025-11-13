package com.ArthurHenriqueDev.e_commerce.Application.UseCases.Usuario;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.Usuario.DTOCadastroUsuario;
import com.ArthurHenriqueDev.e_commerce.Application.Mapper.Usuario.Mapper;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Usuario.CadastrarUsuarioPort;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Output.UsuarioRepository;
import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.FalhaValidacaoException;

public class CadastrarUsuarioUsecase implements CadastrarUsuarioPort {

    private final UsuarioRepository repository;
    private final Mapper mapper;

    public CadastrarUsuarioUsecase(UsuarioRepository repository, Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void CadastrarUsuario(DTOCadastroUsuario dto) {

        var retorno = repository.LerPorCpf(dto.cpf());
        if (retorno != null) throw new FalhaValidacaoException("Usuario já existente");
        else {
            var salvo = mapper.DTOToDomain(dto);
            repository.Salvar(salvo);
        }
    }
}
