package com.ArthurHenriqueDev.e_commerce.Application.Ports.Output;

import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.UsuarioAdministrador.Admin;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.UsuarioComum.Comum;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.*;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {

    void Salvar(Comum dto);
    void SalvarAdmin(Comum dto);
    List<Comum> LerComuns(Integer page, Integer size);
    List<Admin> LerAdmin(Integer page, Integer size);
    Optional<Comum> LerPorCpf(Cpf cpf);
    void Atualizar(Cpf cpf, Email email, Celular celular);
    void AdicionarItemCarrinho(Cpf cpf, List<Item> carrinho, Long id);
    void RemoverItemCarrinho(Cpf cpf);
}
