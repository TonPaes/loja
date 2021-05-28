package com.grupo7.loja.services;

import com.grupo7.loja.dto.ClienteDTO;
import com.grupo7.loja.dto.PedidoDTO;
import com.grupo7.loja.dto.ProdutoDTO;
import com.grupo7.loja.models.*;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    public void insertClient(ClienteDTO c){
        ClienteAgregado.addCliente(c);
    }

    public void insertPedido(Cliente cliente, PedidoDTO p){
        Pedido pedido = new Pedido(p);
        cliente.addPedido(pedido);
    }

    public void insertProduct(ProdutoDTO produto, Pedido pedido){
        Produto prod = new Produto(produto);

        pedido.insertProduct(prod);
    }

    public String consultarProdutosCliente(Cliente c){


        StringBuilder result = new StringBuilder();

        for (Pedido p : c.getPedidos()) {
            for ( Produto prod : p.getProdutos()) {
                result.append(
                             prod.getProduto().getPreco() + ": " + 
                             prod.getProduto().getCor() + ": " + 
                             prod.getProduto().getDescricao() + ": " +
                             prod.getProduto().getQuantidade() + ",\n");
            }
        }
        return result.toString();
    }


}
