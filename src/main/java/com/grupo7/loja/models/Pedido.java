package com.grupo7.loja.models;

import java.util.List;

import com.grupo7.loja.dto.*;

public class Pedido {
    private int id;
    private double valorTotal=0;

    private List<Produto> produtos;
    
    static private int qtdPedidos = 0;

    public Pedido(PedidoDTO pedido){
        this.valorTotal  = pedido.getValorTotal();
        this.id = qtdPedidos;
        qtdPedidos++;
    }

    public void insertProduct(Produto p){
        this.produtos.add(p);
        this.valorTotal += p.getPreco();
    }

    public int getQtdProdutos() {
        return produtos.size();
    }
    public List<Produto> getProdutos(){
        return this.produtos;
    }
    public int getId() {
        return id;
    }
    public double getValorTotal() {
        return valorTotal;
    }

}
