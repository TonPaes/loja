package com.grupo7.loja.dto;

public class ProdutoDTO {
    private int id;
    private double preco;
    private String cor;
    private int quantidade;
    private String descricao;

    static int qtdProdutos = 0;

    ProdutoDTO(){
        this.id = qtdProdutos;
        qtdProdutos++;
    }
    
    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }
    public String getCor() {
        return cor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public String getDescricao() {
        return descricao;
    }

}
