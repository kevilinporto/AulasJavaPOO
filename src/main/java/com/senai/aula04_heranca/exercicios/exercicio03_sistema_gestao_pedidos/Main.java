package com.senai.aula04_heranca.exercicios.exercicio03_sistema_gestao_pedidos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDePedidos gerenciadorDePedidos = new GerenciadorDePedidos(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);
        PedidoOnline pedidoOnline1 = new PedidoOnline(1, 28.90, 5);
        PedidoPresencial pedidoPresencial1 = new PedidoPresencial(2, 67.50, 10);

        gerenciadorDePedidos.criarPedido(2222, 78);
        gerenciadorDePedidos.criarPedido(3333, 20);
        gerenciadorDePedidos.listarPedidos();


        int opcao;

        do {
            System.out.println("""
                    |   Bem-vindo ao gerenciador de pedidos    |
                    |                                          |
                    |       Selecione uma opção a seguir:      |
                    | 1 - Cadastrar um pedido                  |
                    | 2 - Listar todos os pedidos              |
                    | 3 - Atualizar um pedido                  |
                    | 4 - Remover um pedido                    |
                    | 5 - Buscar produto pelo número           |
                    | 6 - Sair                                 |
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    //cadastrar
                    System.out.println("Digite o número do pedido: ");
                    int numero = scanner.nextInt();

                    System.out.println("Digite o valor total do pedido: ");
                    double valorTotal = scanner.nextDouble();
                    scanner.nextLine();
                    gerenciadorDePedidos.criarPedido(numero, valorTotal);


                    break;
                case 2:
                    gerenciadorDePedidos.listarPedidos();
                    //listar
                    break;
                case 3:
                    System.out.println("Digite o  número do pedido que quer atualizar: ");
                    int numeroPedido = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o novo valor do pedido: ");
                    valorTotal = scanner.nextDouble();
                    gerenciadorDePedidos.atualizarPedido(numeroPedido, valorTotal);
                    //atualizar
                    break;
                case 4:
                    System.out.println("Digite o número do pedido a ser deletado: ");
                    int numPedido = scanner.nextInt();
                    scanner.nextLine();
                    gerenciadorDePedidos.removerPedido(numPedido);
                    //remover
                    break;
                case 5:
                    System.out.print("Pesquisa de produto: ");
                    //pesquisar
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }

        } while (opcao != 6);
    }
}
