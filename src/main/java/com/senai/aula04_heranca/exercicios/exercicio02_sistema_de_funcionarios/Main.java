package com.senai.aula04_heranca.exercicios.exercicio02_sistema_de_funcionarios;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaFuncionarios sistemaFuncionarios = new SistemaFuncionarios();
        Professor professor1 = new Professor("Vitoria", 3500, "Geografia");
        Professor professor2 = new Professor("Beatriz", 4000, "Matemática");
        Coordenador coordenador1 = new Coordenador("Guilherme", 6000, new ArrayList<>());

        int opcao;

        do {
            System.out.println("""
                    |   Bem-vindo ao gerenciador de produtos   |
                    |                                          |
                    |       Selecione uma opção a seguir:      |
                    | 1 - Exibir funcionários                  |
                    | 2 - Aumentar salário                     |
                    | 3 - Diminuir salário                     |
                    | 4 - Adicionar                            |
                    | 5 -                                      |
                    | 6 - Sair                                 |
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Exibir todos os Funcionários: ");
                    System.out.println("\nProfessores: ");
                    sistemaFuncionarios.exibirTodosProfessores();
                    System.out.println("\nCoordenadores: ");
                    coordenador1.exibirInformacoes();

                    break;
                case 2:
                    professor1.aumentarSalario(2000);
                    coordenador1.diminuirSalario(200);
                    //listar
                    break;
                case 3:

                    //atualizar
                    break;
                case 4:
                    sistemaFuncionarios.adicionarProfessor(professor1);
                    sistemaFuncionarios.adicionarProfessor(professor2);
                    sistemaFuncionarios.exibirTodosProfessores();
                    //adicionar
                    break;
                case 5:
                    //pesquisar
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }

        } while (opcao != 6);

    }
    }

