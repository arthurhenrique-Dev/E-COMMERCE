package com.ArthurHenriqueDev.e_commerce.Application.DTOs.Usuario;

import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Celular;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Email;

public record DTOAtualizacaoUsuario(

        Email email,
        Celular celular
) {
}
