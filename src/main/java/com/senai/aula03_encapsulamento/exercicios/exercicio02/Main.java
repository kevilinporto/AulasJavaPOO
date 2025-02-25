package com.senai.aula03_encapsulamento.exercicios.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria("Vitoria", 0);

        int opcao; // Declarando a variável antes do loop

        do {
            System.out.println("""
                \nSelecione uma opção:
                1 - Consultar saldo
                2 - Depositar
                3 - Sacar
                4 - Sair
            """);

            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer após o nextInt()


            switch (opcao){
                case 1://consultar saldo
                    System.out.println(conta1.getSaldo());
                    break;

                case 2:
                    //depositar
                    System.out.print("Digite o valor do depósito: ");
                    conta1.depositar(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.println("Saldo atual na conta: " + conta1.getSaldo());
                    break;

                case 3: //sacar
                    System.out.println("Digite o valor a ser sacado:");
                    conta1.sacar(scanner.nextDouble());
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida");

            }

        } while (opcao != 4);


    }
}
