package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_operacoes_simples;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Vitoria", 200);
        contaBancaria1.sacar(100);
        System.out.println(contaBancaria1.getSaldo());
    }
}
