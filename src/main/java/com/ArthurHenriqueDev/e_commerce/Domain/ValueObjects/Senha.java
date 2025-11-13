package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.SenhaFracaException;

public record Senha(String senha) {

    public Senha(String senha) {
        if (senha != null && senha.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$")) this.senha = senha;
        if (!(senha.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$") && senha.isEmpty())); throw new SenhaFracaException();
    }
}
