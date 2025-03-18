package com.senai.aula04_heranca.exercicios.exercicio02_sistema_de_funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {
    protected String nome;
    private double salario;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Funcionario> listaFuncionarios;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirInformacoes(){
        System.out.println("Nome do funcionário: " + nome + ", Salário: R$" + salario);
    }


    public void aumentarSalario(double aumento) {
        this.salario += aumento;
        System.out.println("Salário de " + getNome() + " aumentado para R$" + this.salario);
    }

    public void diminuirSalario(double diminuicao){
        this.salario -= diminuicao;
        System.out.println("Salário de " + getNome() + " diminuido para R$" + this.salario);
    }


}