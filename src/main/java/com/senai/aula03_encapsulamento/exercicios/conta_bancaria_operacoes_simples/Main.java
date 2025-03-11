package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_operacoes_simples;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Vitoria", 2000);
        ContaBancaria contaBancaria2 = new ContaBancaria("Kevilin", 1000);

        System.out.println("-------------teste saque---------------");
        contaBancaria1.sacar(-10);
        contaBancaria1.sacar(100);
        contaBancaria2.sacar(10);

        System.out.println("-------------teste depósito---------------");
        contaBancaria1.sacar(-200);
        contaBancaria2.depositar(200);

        System.out.println("-------------teste transferência---------------");
        contaBancaria1.transferencia(500, contaBancaria2);
    }
}
