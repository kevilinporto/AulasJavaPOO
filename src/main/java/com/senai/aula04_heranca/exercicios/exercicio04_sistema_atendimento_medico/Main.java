package com.senai.aula04_heranca.exercicios.exercicio04_sistema_atendimento_medico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorPacientes gerenciadorPacientes = new GerenciadorPacientes();


        int opcao;

        do {
            System.out.println("""
                    |        Bem-vindo ao gerenciador de pacientes         |
                    |                                                      |
                    |            Selecione uma opção a seguir:             |
                    |                                                      |
                    | 1 - Adicionar um paciente ao sistema                 |
                    | 2 - Listar todos os pacientes                        |
                    | 3 - Remover um paciente da lista                     |
                    | 4 - Consultar paciente específico                    |
                    | 5 - Sair                                             |
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    int opcaoPaciente;

                    do {
                        System.out.println("""
                    
                    Selecione o tipo de paciente que deseja adicionar:
                    
                    1 - Paciente conveniado
                    2 - Paciente particular
                    3 - Sair
                    
                    
                    """);
                        opcaoPaciente = scanner.nextInt();
                        switch (opcaoPaciente){
                            case 1:
                                gerenciadorPacientes.adicionarPacienteConveniado();
                                break;

                            case 2:
                                gerenciadorPacientes.adicionarPacienteParticular();
                                break;

                            case 3:
                                System.out.println("Voltando ao menu principal...");
                        }

                    }while (opcaoPaciente != 3);
                    break;

                case 2:
                    System.out.println("Todos os pacientes cadastrados no sistema:\n");
                    gerenciadorPacientes.listaPacientes.forEach(System.out::println);
                    break;

                case 3: //remover conveniado
                    System.out.println("Digite o nome do paciente a ser removido da lista:");
                    gerenciadorPacientes.removerPaciente();
                    break;
                case 4:
                    System.out.println("Digite o nome do paciente a ser consultado: ");
                    gerenciadorPacientes.buscarPaciente();
                    break;
                case 5:
                    System.out.println("placeholder2");
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.\n");
                    break;
            }

        } while (opcao != 5);


    }
}
