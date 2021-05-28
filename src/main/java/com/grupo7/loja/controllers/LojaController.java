package com.grupo7.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.websocket.server.PathParam;

import com.grupo7.loja.dto.*;
import com.grupo7.loja.models.*;
import com.grupo7.loja.services.*;

@RestController
@RequestMapping("/")
public class LojaController {

    @Autowired
    private ClientService clientService;
    
    @GetMapping("/{clientId}")
    public ResponseEntity<String> getHello(@PathVariable int clientId){
        Cliente c = ClienteAgregado.getClient(clientId);
        return ResponseEntity.status(200).body(clientService.consultarProdutosCliente(c));
    }

    @PostMapping("/cliente")
    public ResponseEntity<String> cadastrarClient(@RequestBody ClienteDTO cliente){
        clientService.insertClient(cliente);
        return ResponseEntity.status(201).body("Cliente Cadastrado");
    }

    @PostMapping("{cliente}/pedido")
    public ResponseEntity<String> cadastrarPedido(
                                                 @RequestBody PedidoDTO pedido,
                                                 @PathVariable int cliente
        ){
        clientService.insertPedido(ClienteAgregado.getClient(cliente), pedido);
        return ResponseEntity.status(201).body("Pedido Criado");
    }

    @PostMapping("/{cliente}/{pedido}")
    public ResponseEntity<String> cadastrarProduto(
                                                  @RequestBody ProdutoDTO produto,
                                                  @PathVariable int cliente, 
                                                  @PathVariable int pedido)
        {
        Cliente c = ClienteAgregado.getClient(cliente);
        for ( Pedido p : c.getPedidos()) {
            if (p.getId() == pedido){
                clientService.insertProduct(produto, p);
                break;
            }
        }
        return ResponseEntity.status(201).body("Produdo Cadastrado");
        
    }
}
