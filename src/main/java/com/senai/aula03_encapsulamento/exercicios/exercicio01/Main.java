package com.senai.aula03_encapsulamento.exercicios.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto1 = new Produto();

        int opcao; // Declaração da variável fora do loop

        do {
            System.out.println("""
                1 - Alterar preço
                2 - Alterar nome
                3 - Listar produtos
                4 - Sair
                """);
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Alterar preço do produto
                    System.out.print("Digite o novo preço do produto: ");
                    produto1.setPreco(scanner.nextDouble());
                    System.out.println("Novo preço: " + produto1.getPreco());
                    break;

                case 2:
                    // Alterar nome do produto
                    scanner.nextLine(); // Limpa a quebra de linha pendente
                    System.out.print("Digite o novo nome do produto: ");
                    produto1.setNome(scanner.nextLine());
                    System.out.println("Novo nome: " + produto1.getNome());
                    break;

                case 3: // listar
                    System.out.println(produto1);
                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close(); // Fechar o scanner para evitar vazamento de recursos
    }


}
