package com.senai.aula03_encapsulamento.exercicios.exercício03;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String cargo, double salario, String nome) {
        this.cargo = cargo;
        this.salario = salario;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void alterarSalario(double valor){
        if(valor > 1320){
            salario = valor;
            System.out.println("Novo salário do funcionário " + nome + " definido para " + salario);
        } else {
            System.out.println("Inválido. Valor menor que um salário mínimo");

        }

    }

    public void calcularAumento(double salario){


    }
}
