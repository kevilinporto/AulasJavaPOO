package com.senai.aula04_heranca.exercicios.exercicio02_sistema_de_funcionarios;

public class Professor extends Funcionario{
    private String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void alterarDisciplina(){

    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome do professor: " + getNome() + ", Salário: R$" + getSalario() + ", Disciplina ministrada: " + disciplina);
    }
}
