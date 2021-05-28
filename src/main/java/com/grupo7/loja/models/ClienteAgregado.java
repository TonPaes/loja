package com.grupo7.loja.models;

import java.util.HashMap;
import com.grupo7.loja.dto.ClienteDTO;

public class ClienteAgregado {
    private static HashMap<String,Cliente>clientes = new HashMap<>();
    private static String id;

    static public void addCliente(ClienteDTO c){
        Cliente cliente = new Cliente(c);
        clientes.put(id, cliente);
    }

    static public Cliente getClient(int id){
        return clientes.get(String.valueOf(id));
    }
}
