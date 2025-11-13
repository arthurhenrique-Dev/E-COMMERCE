package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.UsuarioComum;

import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario.*;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.*;

import java.util.List;

public class Comum extends BaseUsuario {

    private List<Endereco> enderecos;
    private List<ItensCarrinho> carrinho;
    private DataNascimento dataNascimento;


    public Comum(Nome nome, Cpf cpf, Email email, Celular celular, Sexo sexo, Senha senha, Permissao permissao, Atividade atividade, List<ItensCarrinho> carrinho, DataNascimento dataNascimento) {
        super(nome, cpf, email, celular, sexo, senha, permissao, atividade);
        this.dataNascimento = dataNascimento;
        this.carrinho = carrinho;
    }
}
