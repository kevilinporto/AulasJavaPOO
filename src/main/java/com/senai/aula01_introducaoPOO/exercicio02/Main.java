package com.senai.aula01_introducaoPOO.exercicio02;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];
        alunos[0] = new Aluno("Kevilin", 7777, 18, 8.5f);
        alunos[1] = new Aluno("Vitoria", 5555, 19, 6.5f);
        alunos[2] = new Aluno("Beatriz", 2222, 19, 9.0f);

        int opcao = 0;

        do {


            System.out.println("""
                    
                    | 1 - Exibir todos os alunos  |
                    | 2 - Atualizar nota          |
                    | 3 - Verificar aprovação     |
                    | 4 - Sair                    |
                    
                    """);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1: //Exibir as informações de todos o alunos.
                    for (int i = 0; i < alunos.length; i++) {
                        System.out.println("\nInformações do aluno " + alunos[i].nome + ":");
                        alunos[i].exibirInformacoes();

                    }
                    break;

                case 2: //Atualizar a nota de um aluno;
                    for (int i = 0; i < alunos.length; i++) {
                        System.out.println("Digite o nome do aluno que deseja atualizar a nota: ");
                        alunos[i].encontrado(scanner.nextLine(), alunos);

                        scanner.nextLine(); //limpar o buffer
                        System.out.println("Digite a nota do aluno " + alunos[i].nome);
                        alunos[i].atualizarNota(scanner.nextFloat());


                    }
                    break;


                case 3: //Verificar se o aluno está aprovado.

                    alunos[0].verificarAprovacao();
                    alunos[1].verificarAprovacao();
                    alunos[2].verificarAprovacao();

                    break;

                case 4: //Sair
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");


            }

        } while (opcao != 4);

    }
}

