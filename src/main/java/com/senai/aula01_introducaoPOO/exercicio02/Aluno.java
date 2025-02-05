package com.senai.aula01_introducaoPOO.exercicio02;

public class Aluno {
    String nome;
    int matricula;
    int idade;
    float nota;

    public Aluno(String nome, int matricula, int idade, float nota) {
        this.matricula = matricula;
        this.idade = idade;
        this.nota = nota;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "\n\tnome: " + nome +
                "\nmatricula:" + matricula +
                "\nidade: " + idade +
                "\nnota: " + nota;

    }

    public void exibirInformacoes() {
        System.out.println("\tNome: " + nome);
        System.out.println("\tIdade: " + idade);
        System.out.println("\tMatrícula: " + matricula);
        System.out.println("\tNota: " + nota);

    }

    public void atualizarNota(float novaNota) {
        float notaAntiga = nota;
        this.nota = novaNota;
        System.out.println("Aluno: " + nome + " teve a nota antiga " + notaAntiga + " atualizada para " + novaNota);

    }

    public void verificarAprovacao() {
        if (nota < 6.0) {
            System.out.println("Aluno " + nome + " reprovado com nota: " + nota);
        } else {
            System.out.println("Aluno " + nome + " aprovado com nota: " + nota);
        }


    }

    public void encontrado(String nomeAluno, Aluno[] alunos){
        boolean encontrado = false;
        for (int i = 0; i < alunos.length; i++) {
            if (nomeAluno.equals(alunos[i].nome)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Aluno " + nomeAluno + " encontrado.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
