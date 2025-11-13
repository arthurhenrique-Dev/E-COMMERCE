package com.ArthurHenriqueDev.e_commerce.Domain.Services;

import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Email;

public interface EmailService {

    boolean ValidarEmail(Email emailDestino, String tokenProposto);

    boolean AlteracaoSenha(Email emailDestino, String tokenProposto);
}
