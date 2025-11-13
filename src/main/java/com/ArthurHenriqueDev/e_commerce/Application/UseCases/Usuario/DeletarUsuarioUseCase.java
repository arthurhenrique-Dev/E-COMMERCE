package com.ArthurHenriqueDev.e_commerce.Application.UseCases.Usuario;

import com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Usuario.DeletarUsuarioPort;
import com.ArthurHenriqueDev.e_commerce.Application.Ports.Output.UsuarioRepository;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario.Atividade;
import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.UsuarioNaoEncontradoException;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Cpf;

public class DeletarUsuarioUseCase implements DeletarUsuarioPort {

    private final UsuarioRepository repository;

    public DeletarUsuarioUseCase(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public void DeletarUsuario(Cpf cpf) {
        var retorno = repository.LerPorCpf(cpf)
                .orElseThrow(() -> new UsuarioNaoEncontradoException());
        retorno.setAtividade(Atividade.INATIVO);
        repository.Salvar(retorno);
    }
}
