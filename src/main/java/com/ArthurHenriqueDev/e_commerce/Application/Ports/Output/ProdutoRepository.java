package com.ArthurHenriqueDev.e_commerce.Application.Ports.Output;

import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Produtos.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository {

    void Salvar(Produto produto);
    List<Produto> Ler(Integer page, Integer size);
    List<Produto> Buscar(Integer page, Integer size, String nome);
    Optional<Produto> BuscarPorId(Long id);
    void Atualizar(Long id);
    void Deletar(Long id);
}
