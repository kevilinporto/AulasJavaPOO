package com.senai.aula03_encapsulamento.exercicios.exercicio02;
import java.util.Scanner;

public class ContaBancaria {
    Scanner scanner = new Scanner(System.in);
    private String titular;
    private double saldo;

    @Override
    public String toString() {
        return "Titular: " + titular + "\nsaldo: " + saldo;
    }

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = 0;
    }


    public double getSaldo(){
        return saldo;
    }

    public void depositar(double saldo){
        if (saldo >= 0){
            this.saldo += saldo;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valorSaque){ //setter
        if (valorSaque > 0 && valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }


}
