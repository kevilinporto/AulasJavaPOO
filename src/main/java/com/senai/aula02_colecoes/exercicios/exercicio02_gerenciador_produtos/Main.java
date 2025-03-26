package com.senai.aula02_colecoes.exercicios.exercicio02_gerenciador_produtos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();
        int opcao;

        do {
            System.out.println("""
                    |   Bem-vindo ao gerenciador de produtos   |
                    |                                          |
                    |       Selecione uma opção a seguir:      |
                    | 1 - Cadastrar um produto                 |
                    | 2 - Listar todos os produtos             |
                    | 3 - Atualizar a quantidade de um produto |
                    | 4 - Remover um produto                   |
                    | 5 - Buscar produto pelo nome             |
                    | 6 - Sair                                 |
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    //cadastrar
                    System.out.println("Digite o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a quantidade de estoque do produto: ");
                    int qtdEstoque = scanner.nextInt();
                    scanner.nextLine();

                    gerenciador.cadastrarProduto(nome, qtdEstoque);

                    break;
                case 2:
                    gerenciador.listarProdutos();
                    //listar
                    break;
                case 3:
                    System.out.println("Digite o nome do produto a ser atualizado: ");
                    gerenciador.listarProdutos();
                    gerenciador.atualizarProduto(scanner.nextLine(), scanner.nextInt());
                    //atualizar
                    break;
                case 4:
                    System.out.println("Digite o nome do produto a ser deletado: ");
                    gerenciador.listarProdutos();
                    gerenciador.removerProduto(scanner.nextLine());
                    //remover
                    break;
                case 5:
                    System.out.print("Pesquisa de produto: ");
                    gerenciador.pesquisarProduto(scanner.nextLine());
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
        scanner.close();
    }

}
