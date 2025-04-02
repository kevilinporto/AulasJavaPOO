package com.senai.aula06_abstracao.exemplos_classes_abstratas.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testarContas(new ContaCorrente("Vitoria", 100));
        testarContas(new ContaPoupanca("Kevilin", 1000));
    }
    public static void testarContas(ContaBancaria contaBancaria){
        contaBancaria.exibirSaldo();
        contaBancaria.aplicarTaxaMensal();
        contaBancaria.exibirSaldo();
        contaBancaria.sacar(50);
    }
}
