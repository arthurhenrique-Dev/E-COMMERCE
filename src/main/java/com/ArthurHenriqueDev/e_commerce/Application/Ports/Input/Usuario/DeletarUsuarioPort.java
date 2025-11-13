package com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Usuario;

import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Cpf;

public interface DeletarUsuarioPort {

    void DeletarUsuario(Cpf cpf);
}
