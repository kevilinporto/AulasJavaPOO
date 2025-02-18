package com.senai.aula02_colecoes.exercicios.exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Tarefa> listaTarefas = new ArrayList<>();

        int opcao;
        do {
            System.out.println("""
                    ---------- Gerenciador de Tarefas ----------
                    
                    1 - Adicionar tarefas
                    2 - Listar
                    3 - Marcar tarefa como concluída
                    4 - Remover tarefa
                    5 - Sair
                    
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    adicionarTarefa(listaTarefas);
                    break;

                case 2:
                    listarTarefas(listaTarefas);
                    //listar
                    break;

                case 3:
                    concluirTarefa(listaTarefas);

                    break;

                case 4:
                    removerTarefa(listaTarefas);
                    //remover tarefa
                    break;

                case 5:
                    System.out.println("Fim do programa");
                    break;

                default:
                    System.out.println("Opção inválida. Digite novamente");
                    break;
            }


        } while (opcao != 5);


    }


    public static void adicionarTarefa(ArrayList<Tarefa> listaTarefas) {
        Scanner scanner = new Scanner(System.in);
        String nomeTarefa;
        System.out.println("Digite o nome da tarefa: ");
        nomeTarefa = scanner.nextLine();
        listaTarefas.add(new Tarefa(nomeTarefa, false));
        System.out.println("Tarefa adicionada com sucesso");
    }

    public static void listarTarefas(ArrayList<Tarefa> listaTarefas) {
        listaTarefas.forEach(System.out::println);

    }

    public static void concluirTarefa(ArrayList<Tarefa> listaTarefas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma tarefa para marcar como concluída: ");
        listarTarefas(listaTarefas); // mostra todas as tarefas
        int tarefaEscolhida = scanner.nextInt();


    }

    public static void removerTarefa(ArrayList<Tarefa> listaTarefas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da tarefa a ser excluída: ");
        String tarefaEscolhida = scanner.nextLine();
        if (tarefaEscolhida.equals(listaTarefas)) {
            listaTarefas.remove(tarefaEscolhida);
        } else {
            System.out.println("Tarefa não encontrada.");
        }


    }

}
