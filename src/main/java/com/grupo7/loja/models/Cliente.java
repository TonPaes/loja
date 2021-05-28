package com.grupo7.loja.models;

import java.util.List;
import com.grupo7.loja.dto.*;

public class Cliente {
    private ClienteDTO cliente;
    private List<Pedido>pedidos;

    public Cliente(ClienteDTO cliente){
        this.cliente = cliente;
    }
    public void addPedido(Pedido p){
        pedidos.add(p);
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public ClienteDTO getCliente() {
        return cliente;
    }
}