package com.senai.aula04_heranca.exercicios.exercicio03_sistema_gestao_pedidos;

import java.util.ArrayList;

public class GerenciadorDePedidos{
    ArrayList<Pedido> listaPedidos;

    public GerenciadorDePedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }


    public void criarPedidoPresencial(int numeroPedido, double valorTotal, double desconto){
        PedidoPresencial novoPedidoPresencial = new PedidoPresencial(numeroPedido, valorTotal, desconto);
        listaPedidos.add(novoPedidoPresencial);
        System.out.println("Novo pedido criado. Número do pedido: " + numeroPedido + ", valor total de R$" + valorTotal);
    }

    public void criarPedidoOnline(int numeroPedido, double valorTotal, double taxaDeEntrega){
        PedidoOnline novoPedidoOnline = new PedidoOnline(numeroPedido, valorTotal, taxaDeEntrega);
    }

    public void listarPedidos(){
        System.out.println("Todos os pedidos:");
        listaPedidos.forEach(System.out::println);
    }

    public void atualizarPedido(int numeroPedido, double novoValorTotal){
        boolean encontrado = false;
        for (Pedido pedido : listaPedidos) {
            if (pedido.getNumPedido() == numeroPedido) {
                pedido.setValorTotal(novoValorTotal);
                System.out.println("Novo valor do pedido " + numeroPedido + " atualizado para " + novoValorTotal);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Pedido não encontrado.");

        }
    }


    public void removerPedido(int numeroPedido){
        boolean encontrado = false;
        for (Pedido pedido : listaPedidos) {
            if (pedido.getNumPedido() == numeroPedido) {
                listaPedidos.remove(pedido);
                System.out.println("Pedido " + numeroPedido + " removido da lista de pedidos com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Pedido não encontrado.");

        }
    }



}
