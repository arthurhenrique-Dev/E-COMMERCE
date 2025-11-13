package com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Usuario;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.Usuario.DTOCadastroUsuario;

public interface CadastrarUsuarioPort {

    void CadastrarUsuario(DTOCadastroUsuario dto);
}
