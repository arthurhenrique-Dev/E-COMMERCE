package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Usuarios.BaseUsuario;

import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.Cep;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.NumeroEndereco;

public class Endereco {

    private Cep cep;
    private String logradouro;
    private NumeroEndereco numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(Cep cep, String logradouro, NumeroEndereco numero, String complemento, String bairro, String cidade, String estado) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public NumeroEndereco getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
