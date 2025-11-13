package com.ArthurHenriqueDev.e_commerce.Application.DTOs.Usuario;

import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario.Sexo;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.*;

import java.time.LocalDate;

public record DTOCadastroUsuario(

        Nome nome,
        Cpf cpf,
        Email email,
        Celular celular,
        Sexo sexo,
        Senha senha,
        LocalDate dataNascimento
) {
}
