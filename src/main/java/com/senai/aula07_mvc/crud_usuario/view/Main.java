package com.senai.aula07_mvc.crud_usuario.view;

import com.senai.aula07_mvc.crud_usuario.controller.OperadorController;
import com.senai.aula07_mvc.crud_usuario.controller.SupervisorController;
import com.senai.aula07_mvc.crud_usuario.model.Operador;
import com.senai.aula07_mvc.crud_usuario.model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();


        String menu = """
               |             Menu               |
               | 1 - Cadastrar usuário          |
               | 2 - Deletar usuário            |
               | 3 - Atualizar usuário          |
               | 4 - Exibir usuários            |
               | 5 - Ligar máquina              |
               | 6 - Demitir operador           |
               | 7 - Sair                       |
               """;

        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Que tipo de usuário você deseja cadastrar?");
                    System.out.println("1 - Operador\n2 - Supervisor");
                    int escolhaTipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Preencha os dados a seguir:");
                    String nome = scanner.nextLine();
                    int id = scanner.nextInt();
                    scanner.nextLine(); //limpar buffer

                    if(escolhaTipo == 1){
                        //cadastri operador
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        opController.cadastrarOperador(operador);

                    } else if (escolhaTipo == 2) {
                        //cadastro supervisor
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supController.cadastrarSupervisor(supervisor);

                    } else{
                        System.out.println("Opção inválida");
                    }

                    break;

                case 2:

                    break;

                case 3:
                    break;

                case 4:
                    //listar
                    opController.listarOperadores().forEach(System.out::println);
                    supController.listarSupervisores().forEach(System.out::println);
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }

        }while (opcao != 7);
    }

}
