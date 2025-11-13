package com.ArthurHenriqueDev.e_commerce.Application.Ports.Input.Produtos;

import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Produtos.Produto;

public interface CadastrarProdutoPort {

    void CadastrarProduto(Produto produto);
}
