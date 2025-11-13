package com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Usuario;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.Usuario.DTOCadastroUsuario;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario.Sexo;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.*;

public interface CadastrarAdminPort {
    void CadastrarAdmin(DTOCadastroUsuario dto);
}
