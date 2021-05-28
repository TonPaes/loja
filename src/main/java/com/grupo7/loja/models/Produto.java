package com.grupo7.loja.models;

import com.grupo7.loja.dto.ProdutoDTO;

public class Produto {
    private ProdutoDTO produto;
    private double preco;

    public Produto(ProdutoDTO produto){
        this.produto = produto;
    }

    public ProdutoDTO getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }
}
