package com.ArthurHenriqueDev.e_commerce.Application.Mapper.Usuario;

import com.ArthurHenriqueDev.e_commerce.Application.DTOs.Usuario.DTOCadastroUsuario;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario.Atividade;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario.Permissao;
import com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.UsuarioComum.Comum;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.ItensCarrinho;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    List<ItensCarrinho> itens = new ArrayList<>();
    public Comum DTOToDomain(DTOCadastroUsuario dto){

        Comum comum = new Comum(
                dto.nome(),
                dto.cpf(),
                dto.email(),
                dto.celular(),
                dto.sexo(),
                dto.senha(),
                Permissao.COMUM,
                Atividade.ATIVO,
                itens,
                dto.dataNascimento()
        );
        return comum;
    }
    public Comum DTOToDomainAdmin(DTOCadastroUsuario dto){

        Comum comum = new Comum(
                dto.nome(),
                dto.cpf(),
                dto.email(),
                dto.celular(),
                dto.sexo(),
                dto.senha(),
                Permissao.ADMINISTRADOR,
                Atividade.ATIVO,
                itens,
                dto.dataNascimento()
        );
        return comum;
    }
}
