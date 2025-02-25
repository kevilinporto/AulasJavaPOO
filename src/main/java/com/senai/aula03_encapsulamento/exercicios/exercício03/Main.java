package com.senai.aula03_encapsulamento.exercicios.exercício03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario("Gerente", 2000,"Vitoria");

        int opcao; // Declarando a variável antes do loop

        do {
            System.out.println("""
                \nSelecione uma opção:
                1 - Consultar saldo
                2 - Alterar salário
                3 - Sacar
                4 - Sair
            """);

            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer após o nextInt()


            switch (opcao){
                case 1:
                    break;

                case 2:
                    System.out.println("Digite o novo salário do funcionário " + funcionario1.getNome());
                    funcionario1.alterarSalario(scanner.nextDouble());
                    break;

                case 3:
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
