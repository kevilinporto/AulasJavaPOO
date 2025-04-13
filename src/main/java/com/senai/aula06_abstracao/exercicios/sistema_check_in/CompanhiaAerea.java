package com.senai.aula06_abstracao.exercicios.sistema_check_in;

import java.util.Scanner;

public class CompanhiaAerea implements SistemaCheckIn{

    @Override
    public void validarDocumentos() {
        System.out.println("Documentos validados com sucesso.");
    }

    @Override
    public void emitirCartaoEmbarque() {
        System.out.println("Cartão de embarque emitido com sucesso.");
    }

    @Override
    public void checarPesoBagagem(Scanner scanner) {
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

            switch (opcao) {
                case 1 -> verificarPeso(scanner, PESO_MAX_BAGAGENS_NACIO, "nacional");
                case 2 -> verificarPeso(scanner, PESO_MAX_BAGAGENS_INTER, "internacional");
                case 3 -> System.out.println("Saindo da verificação de bagagem...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }

    // Método privado para reutilizar a lógica da checagem
    private void verificarPeso(Scanner scanner, double pesoMax, String tipoVoo) {
        System.out.print("Digite o peso da bagagem: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Limpa buffer

        if (peso > pesoMax) {
            System.out.printf("Peso da bagagem: %.2f kg. Excedeu o limite de %.2f kg para voos %s.%n%n", peso, pesoMax, tipoVoo);
        } else {
            System.out.printf("Peso da bagagem: %.2f kg. Dentro do limite permitido para voos %s.%n%n", peso, tipoVoo);
        }
    }
}
