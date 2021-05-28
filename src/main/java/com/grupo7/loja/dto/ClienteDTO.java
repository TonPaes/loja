package com.grupo7.loja.dto;

public class ClienteDTO {
    private String id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

   

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getId() {
        return id;
    }
    public String getNome() {
        return nome; 
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
} 

