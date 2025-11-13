package com.ArthurHenriqueDev.e_commerce.Domain.Services;

import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario.Endereco;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Cep;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.NumeroEndereco;

public interface EnderecoService {

    Endereco BuscarEndereco(Cep cep, NumeroEndereco numero);
}
