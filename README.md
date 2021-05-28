# loja

--Criar client
clientes/
POST(nome, cpf, email, telefone ) -> Created

--Registra Pedido
pedidos/{idCliente}/
POST(produtos[], valorTotal )

--Registra Produto no pedido
pedidos/{idPedido}/
UPDATE(produtos[])

--Delete
pedidos/{idPedido}/
DELETE

--Consultar pedidos
pedidos/{idPedido}/
GET(?dataInicio={dataInicio}&dataFinal={dataFinal})

--Consultar pedidos por cliente
clientes/{idCliente}/pedidos/
GET(?id={idPedido})
