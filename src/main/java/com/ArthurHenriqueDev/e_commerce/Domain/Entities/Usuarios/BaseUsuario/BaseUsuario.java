package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.FalhaValidacaoException;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.*;

public abstract class BaseUsuario {

    protected final Nome nome;
    protected final Cpf cpf;
    protected final Email email;
    protected Celular celular;
    protected final Sexo sexo;
    protected Senha senha;
    protected final Permissao permissao;
    protected EmailValidacao emailValidacao;
    protected AlteradorSenha alteradorSenha;
    protected Atividade atividade;

    public BaseUsuario(Nome nome, Cpf cpf, Email email, Celular celular, Sexo sexo, Senha senha, Permissao permissao, Atividade atividade) {

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.sexo = sexo;
        this.senha = senha;
        this.permissao = permissao;
        this.atividade = atividade;
        this.emailValidacao = EmailValidacao.Iniciar();
        this.alteradorSenha = null;
    }

    public void IniciarAlteracaoSenha() {
        if (this.emailValidacao.validado()) this.alteradorSenha = AlteradorSenha.Iniciar();
        else throw new FalhaValidacaoException("Necessário validar email primeiro");
    }
    public void RedefinirSenha(String tokenProposto, Senha novaSenha) {
        if (tokenProposto == null) throw new FalhaValidacaoException();
            this.alteradorSenha.Validar(tokenProposto);
            this.senha = novaSenha;
            this.alteradorSenha = this.alteradorSenha.Zerar();
    }
    public String getTokenAlterador(){
        if (this.alteradorSenha.token() != null) return this.alteradorSenha.token();
        else return null;
    }
    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Nome getNome() {
        return nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public Email getEmail() {
        return email;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Permissao getPermissao() {
        return permissao;
    }

    public Atividade getAtividade() {
        return atividade;
    }
}

