package com.senai.aula04_heranca.exercicios.exercicio04_sistema_atendimento_medico;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorPacientes {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Paciente> listaPacientes;

    public GerenciadorPacientes() {
        this.listaPacientes = new ArrayList<>();
    }

    public void adicionarPacienteConveniado(){
        double descontoConsulta = 40;

        System.out.println("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade");
        int idade = scanner.nextInt();
        scanner.nextLine(); //limpa o buffer

        PacienteConvenio novoPacienteConvenio = new PacienteConvenio(nome, idade, descontoConsulta);
        listaPacientes.add(novoPacienteConvenio);
        System.out.println("Novo paciente conveniado adicionado:\n" + "Nome: " + nome + " | Idade: " + idade +
                " | Paciente convêniado. Desconto de consulta: " + descontoConsulta + "\n");

    }
    public void adicionarPacienteParticular(){
        double custoCosulta = 80;

        System.out.println("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade");
        int idade = scanner.nextInt();
        scanner.nextLine(); //limpa o buffer

        PacienteParticular novoPacienteParticular = new PacienteParticular(nome, idade, custoCosulta);
        listaPacientes.add(novoPacienteParticular);
        System.out.println("Novo paciente conveniado adicionado:\n" + "Nome: " + nome + " | Idade: " + idade +
                " | Paciente particular adicionado. Custo de consulta: " + custoCosulta + "\n");

    }

}
