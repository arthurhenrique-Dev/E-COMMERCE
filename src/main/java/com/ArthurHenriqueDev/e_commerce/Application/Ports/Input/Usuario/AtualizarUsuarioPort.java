package com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Usuario;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.Usuario.DTOAtualizacaoUsuario;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Cpf;

public interface AtualizarUsuarioPort {

    void AtualizarUsuario(Cpf cpf, DTOAtualizacaoUsuario dto);
}
