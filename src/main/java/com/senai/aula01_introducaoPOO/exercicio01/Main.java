package com.senai.aula01_introducaoPOO.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto("Maçã", scanner.nextInt(), scanner.nextDouble());

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

                    break;

                case 2:
                    break;

                case 3:
                    produto.calcularValorEstoque();
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
