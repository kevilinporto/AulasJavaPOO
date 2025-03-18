package com.senai.aula04_heranca.exercicios.exercicio02_sistema_de_funcionarios;

import java.util.ArrayList;

public class SistemaFuncionarios {
        private ArrayList<Professor> listaProfessores;

        // Construtor da classe SistemaDeFuncionarios
        public SistemaFuncionarios() {
            listaProfessores = new ArrayList<>();
        }

        // Método para adicionar um professor
        public void adicionarProfessor(Professor professor) {
            listaProfessores.add(professor);
            System.out.println("Professor " + professor.getNome() + " adicionado com sucesso!");
        }

        // Método para exibir todos os professores
        public void exibirTodosProfessores() {
            for (Professor professor : listaProfessores) {
                professor.exibirInformacoes();
            }
        }
    }

