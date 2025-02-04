package com.senai.aula01_introducaoPOO.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[3];
        produtos[0] = new Produto("Maçã", 200, 3.50);
        produtos[1] = new Produto("Banana", 150, 7.50);
        produtos[2] = new Produto("Arroz", 500, 30.00);


        int opcao = 0;
        do {

            System.out.println("""
                        |              MENU              |
                        | 1 - Exibir detalhes            |
                        | 2 - Atualizar estoque          |
                        | 3 - Calcular valor de estoque  | 
                        | 4 - Sair                       |
                        """);

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    for (Produto p : produtos) { // iteração para mostrar todos os objetos e seus atributos que estão dentro do array produtos
                        p.exibirDetalhes();
                    }
                    break;

                case 2: // atualizar estoque
                    produtos[0].atualizarEstoque();
                    produtos[1].atualizarEstoque();
                    produtos[2].atualizarEstoque();
                    break;

                case 3:
                    produtos[0].calcularValorEstoque();
                    produtos[1].calcularValorEstoque();
                    produtos[2].calcularValorEstoque();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;

            }
        }while (opcao != 4);


    }
}
