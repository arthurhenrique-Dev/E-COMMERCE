package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.UsuarioAdministrador;

import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario.Atividade;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario.BaseUsuario;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario.Permissao;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario.Sexo;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.*;

public class Admin extends BaseUsuario {


    public Admin(Nome nome, Cpf cpf, Email email, Celular celular, Sexo sexo, Senha senha, Permissao permissao, Atividade atividade) {
        super(nome, cpf, email, celular, sexo, senha, permissao, atividade);
        this.permissao = Permissao.ADMINISTRADOR;
    }
}
