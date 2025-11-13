package com.ArthurHenriqueDev.e_commerce.Application.UseCases.Usuario;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.Usuario.DTOCadastroUsuario;
import com.ArthurHenriqueDev.e_commerce.Application.Mapper.Usuario.Mapper;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Usuario.CadastrarAdminPort;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Output.UsuarioRepository;
import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.FalhaValidacaoException;

public class CadastrarAdminUseCase implements CadastrarAdminPort {

    private final UsuarioRepository repository;
    private final Mapper mapper;

    protected CadastrarAdminUseCase(UsuarioRepository repository, Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public void CadastrarAdmin(DTOCadastroUsuario dto) {
        var retorno = repository.LerPorCpf(dto.cpf());
        if (retorno != null) throw new FalhaValidacaoException("Usuario já existente");
        else {
            var salvo = mapper.DTOToDomainAdmin(dto);
            repository.Salvar(salvo);
        }
    }
}
