package com.senai.aula06_abstracao.exercicios.sistema_check_in;

import java.util.Scanner;

public interface SistemaCheckIn {
    Scanner scanner = new Scanner(System.in);
    double PESO_MAX_BAGAGENS_INTER = 10;
    double PESO_MAX_BAGAGENS_NACIO = 20;

    default void realizarCheckIn(){
        System.out.println("Check-in realizado com sucesso!");
    }

    default void validarDocumentos(){
        System.out.println("Documentos validados com sucesso!");
    }

    default void emitirCartaoEmbarque(){
        System.out.println("Cartão de embarque emitido com sucesso!");

    }

    default void checarPesoBagagem(){
        int opcao;
        do {
            System.out.println("""
                | VERIFICADOR DE PESO DE BAGAGEM DE MÃO |
                |      Escolha o tipo de voo:           |
                |                                       |
                |    1 - Nacional                       |
                |    2 - Internacional                  |
                |    3 - Sair                           |
                """);
            opcao = scanner.nextInt();
            double pesoBagagem;
            switch (opcao){
                case 1: // viagens nacionais
                    System.out.println("Pese sua bagagem:");
                    pesoBagagem = scanner.nextDouble();
                    scanner.nextLine();
                    if (pesoBagagem > PESO_MAX_BAGAGENS_NACIO){
                        System.out.println("Peso da bagagem:" + pesoBagagem + "\n Excedido o limite de " + PESO_MAX_BAGAGENS_NACIO +
                                " kg para viagens nacionais.\n");
                    } else {
                        System.out.println("Peso da bagagem: " + pesoBagagem + " kg.\nDentro dos limites de peso para o embarque em " +
                                "viagens nacionais.\n");
                    }
                    break;

                case 2: //viagens internacionais
                    System.out.println("Pese sua bagagem:");
                    pesoBagagem = scanner.nextDouble();
                    scanner.nextLine();
                    if (pesoBagagem > PESO_MAX_BAGAGENS_INTER){
                        System.out.println("Peso da bagagem: " + pesoBagagem + "kg.\nExcedido o limite de " + PESO_MAX_BAGAGENS_INTER +
                                " kg para viagens internacionais.\n");
                    } else {
                        System.out.println("Peso da bagagem: " + pesoBagagem + " kg.\nDentro dos limites de peso para o embarque " +
                                "em viagens nacionais.\n");

                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (opcao != 3);

    }

    static void mensagemCheckIn(){
        System.out.println("Check-in seguro realizado realizado pela Fly-Secure");
    }

    static void mensagemBoasVindas(){
        System.out.println("Boas vindas ao sistema de check-in da Fly-Secure!");
    }


}

