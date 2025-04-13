package com.senai.aula06_abstracao.exercicios.sistema_check_in;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompanhiaAerea latam = new CompanhiaAerea();

        SistemaCheckIn.mensagemBoasVindas();

        int opcao;
        do {
            System.out.println("""
                    |       Selecione uma opção:             |
                    |                                        |
                    | 1 - Validar documentos                 |
                    | 2 - Emitir cartão de embarque          |
                    | 3 - Verificar peso da bagagem          |
                    | 4 - Sair                               |
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    latam.validarDocumentos();
                break;

                case 2:
                    latam.emitirCartaoEmbarque();
                break;

                case 3:
                    latam.checarPesoBagagem(scanner);
                break;

                case 4:
                    System.out.println("Encerrando o programa...");
                break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 4);

        scanner.close();
    }
}
