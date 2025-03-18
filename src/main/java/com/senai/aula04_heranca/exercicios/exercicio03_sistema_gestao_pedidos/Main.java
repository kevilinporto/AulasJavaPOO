package com.senai.aula04_heranca.exercicios.exercicio03_sistema_gestao_pedidos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDePedidos gerenciadorDePedidos = new GerenciadorDePedidos(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);
        PedidoOnline pedidoOnline1 = new PedidoOnline(1, 28.90, 5);
        PedidoPresencial pedidoPresencial1 = new PedidoPresencial(2, 67.50, 10);

        gerenciadorDePedidos.criarPedidoOnline(2222, 78, 10);
        gerenciadorDePedidos.criarPedidoPresencial(3333, 20, 4);
        gerenciadorDePedidos.listarPedidos();


        int opcao;

        do {
            System.out.println("""
                    |   Bem-vindo ao gerenciador de pedidos    |
                    |                                          |
                    |       Selecione uma opção a seguir:      |
                    | 1 - Cadastrar um pedido presencial       |
                    | 2 - Cadastrar um pedido online           |
                    | 3 - Listar todos os pedidos              |
                    | 4 - Atualizar um pedido                  |
                    | 5 - Remover um pedido                    |
                    | 6 - Buscar produto pelo número           |
                    | 7 - Sair                                 |
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
                    gerenciadorDePedidos.criarPedidoPresencial(numero, valorTotal, 10);


                    break;
                case 2:
                    break;
                case 3:
                    gerenciadorDePedidos.listarPedidos();
                    //listar
                    break;
                case 4:
                    System.out.println("Digite o  número do pedido que quer atualizar: ");
                    int numeroPedido = scanner.nextInt();
                    System.out.println("Digite o novo valor do pedido: ");
                    valorTotal = scanner.nextDouble();
                    gerenciadorDePedidos.atualizarPedido(numeroPedido, valorTotal);
                    //atualizar
                    break;
                case 5:
                    System.out.println("Digite o número do pedido a ser deletado: ");
                    int numPedido = scanner.nextInt();
                    scanner.nextLine();
                    gerenciadorDePedidos.removerPedido(numPedido);
                    //remover
                    break;
                case 6:
                    System.out.print("Pesquisa de produto: ");
                    //pesquisar
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }

        } while (opcao != 7);
    }
}
