package com.senai.aula04_heranca.exercicios.exercicio04_sistema_atendimento_medico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorPacientes gerenciadorPacientes = new GerenciadorPacientes();

        PacienteConvenio pacienteConvenio1 = new PacienteConvenio("Vitoria", 23, 40);
        PacienteParticular pacienteParticular1 = new PacienteParticular("Kevilin", 18, 80);

        int opcao;

        do { //MENU
            System.out.println("""
                    |   Bem-vindo ao gerenciador de produtos   |
                    |                                          |
                    |       Selecione uma opção a seguir:      |
                    | 1 - Adicionar um paciente ao sistema     |
                    | 2 - Listar todos os pacientes            |
                    | 3 - Atualizar a quantidade de um produto |
                    | 4 - Remover um produto                   |
                    | 5 - Buscar produto pelo nome             |
                    | 6 - Sair                                 |
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
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.print("Pesquisa de produto: ");
                    //pesquisar
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }

        } while (opcao != 6);


    }
}
