package com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects;

import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Produtos.Disponibilidade;

public record Item(


        TextoValido nome,
        QuantidadeValida quantidade,
        Preco preco,
        Disponibilidade disponibilidade


) {
}
