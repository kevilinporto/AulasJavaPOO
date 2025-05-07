package com.senai.aula07_mvc.crud_usuario.view;
import com.senai.aula07_mvc.crud_usuario.controller.OperadorController;
import com.senai.aula07_mvc.crud_usuario.controller.SupervisorController;
import com.senai.aula07_mvc.crud_usuario.model.Operador;
import com.senai.aula07_mvc.crud_usuario.model.Supervisor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController operadorController = new OperadorController();
        SupervisorController supervisorController = new SupervisorController();
        int opcao = 0;
        int escolhaTipo = 0;

        String menu = """
                \nMenu 
                    1 - Cadastrar Usuario
                    2 - Deletar Usuario
                    3 - Atualizar Usuario
                    4 - Exibir Usuarios
                    5 - Ligar Maquina
                    6 - Demitir Operador
                    7 - Sair
                """;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao!=7){
                System.out.println("""
                            Tipo de usuario:
                                1 - Operador
                                2 - Supervisor
                            """);
                escolhaTipo = scanner.nextInt();
                scanner.nextLine();
            }

            switch (opcao){
                case 1:
                    System.out.println("\nPreencha os dados a seguir: ");
                    System.out.print("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    if (escolhaTipo == 1){
                        System.out.print("Setor: ");
                        String setor = scanner.nextLine();

                        Operador operador = new Operador(nome, id, setor);
                        if(operadorController.cadastrarOperador(operador)){
                            System.out.println("Operario cadastrado com sucesso");
                        } else {
                            System.out.println("Nao foi possivel cadastrar");
                        }
                    } else if (escolhaTipo == 2){
                        System.out.print("Area: ");
                        String area = scanner.nextLine();

                        Supervisor supervisor = new Supervisor(nome, id, area);
                        if(supervisorController.cadastrarSupervisor(supervisor)){
                            System.out.println("Supervisor cadastrado com sucesso");
                        } else {
                            System.out.println("Nao foi possivel cadastrar");
                        }
                    }

                    break;

                case 2:
                    if (escolhaTipo == 1){
                        operadorController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2){
                        supervisorController.listarSupervisores().forEach(System.out::println);
                    }
                    System.out.println("Escolha um usuário para deletar (id): ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaTipo == 1){
                        if(operadorController.deletarOperador(id)){
                            System.out.println("Operario deletado com sucesso");
                        } else {
                            System.out.println("Nao foi possivel deletar");
                        }
                    } else if (escolhaTipo == 2){
                        if(supervisorController.deletarSupervisor(id)){
                            System.out.println("Supervisor deletado com sucesso");
                        } else {
                            System.out.println("Nao foi possivel deletar");
                        }
                    }
                    break;

                case 3:
                    if (escolhaTipo == 1){
                        operadorController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2){
                        supervisorController.listarSupervisores().forEach(System.out::println);
                    }
                    System.out.println("Escolha um usuário para atualizar (id): ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Atualize as seguintes informações: ");
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();

                    if (escolhaTipo == 1){
                        System.out.print("Setor: ");
                        String setor = scanner.nextLine();

                        Operador operador = new Operador(nome, id, setor);
                        if(operadorController.atualizarOperador(operador)){
                            System.out.println("Operador atualizado com sucesso");
                        } else {
                            System.out.println("Nao foi possivel atualizar");
                        }
                    } else if (escolhaTipo == 2){
                        System.out.print("Area: ");
                        String area = scanner.nextLine();

                        Supervisor supervisor = new Supervisor(nome, id, area);
                        if(supervisorController.atualizarSupervisor(supervisor)){
                            System.out.println("Supervisor atualizado com sucesso");
                        } else {
                            System.out.println("Nao foi possivel atualizar");
                        }
                    }
                    break;

                case 4:
                    if (escolhaTipo == 1){
                        operadorController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2){
                        supervisorController.listarSupervisores().forEach(System.out::println);
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Saindo do sistema");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while (opcao != 7);
    }
}