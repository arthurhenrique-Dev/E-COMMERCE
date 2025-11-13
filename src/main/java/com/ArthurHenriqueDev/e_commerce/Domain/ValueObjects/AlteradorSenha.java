package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Exceptions.FalhaValidacaoException;

import java.time.LocalDateTime;
import java.util.UUID;

public record AlteradorSenha(

        String token,
        LocalDateTime expiracaoToken
) {
    public static AlteradorSenha Iniciar() {
       String token = UUID.randomUUID().toString();
       LocalDateTime expiracaoToken = LocalDateTime.now().plusHours(1);
       return new AlteradorSenha(token, expiracaoToken);
    }

    public boolean Validar(String tokenProposto){
        if (tokenProposto.equals(this.token) && LocalDateTime.now().isBefore(this.expiracaoToken)){
            return true;
        }
        else  {
            throw new FalhaValidacaoException();
        }
    }
    public AlteradorSenha Zerar(){
        return new AlteradorSenha(null, null);
    }
}
