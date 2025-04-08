package com.senai.aula06_abstracao.exercicios.sistema_check_in;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompanhiaAerea companhiaAerea1 = new CompanhiaAerea();
        SistemaCheckIn.mensagemBoasVindas();

        int opcao;
        do {
            System.out.println("""
                    |       Selecione uma opção a seguir:      |
                    |                                          |
                    | 1 - Realizar check-in                    |
                    | 2 - Validar documentos                   |
                    | 3 - Emitir cartão de embarque            |
                    | 4 - Verificar peso de bagagem            |
                    | 5 - Sair                                 |
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    companhiaAerea1.realizarCheckIn();
                    break;
                case 2:
                    companhiaAerea1.validarDocumentos();
                    break;
                case 3:
                    companhiaAerea1.emitirCartaoEmbarque();
                    break;
                case 4:
                    companhiaAerea1.checarPesoBagagem();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    break;
            }

        } while (opcao != 5);
    }
}
