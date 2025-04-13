package com.senai.aula06_abstracao.exercicios.sistema_de_pagamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do usuário:");
        String usuario = scanner.nextLine();

        System.out.println("Informe o valor do pagamento:");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // limpar

        System.out.println("""
            Selecione o método de pagamento:
            1 - Cartão de crédito
            2 - PIX
            3 - Carteira digital
        """);
        int opcao = scanner.nextInt();

        Pagamento pagamento;

        switch (opcao) {
            case 1:
                pagamento = new cartaoCredito(usuario, valor);
                break;

            case 2:
                pagamento = new PIX(usuario, valor);
                break;

            case 3:
                pagamento = new carteiraDigital(usuario, valor);
                break;

            default:
                System.out.println("Opção inválida.");
                return;

        }
        pagamento.processarPagamento();
        scanner.close();
    }
}
