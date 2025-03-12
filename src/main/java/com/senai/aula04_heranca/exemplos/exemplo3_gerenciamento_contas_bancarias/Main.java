package com.senai.aula04_heranca.exemplos.exemplo3_gerenciamento_contas_bancarias;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Vitoria", 10000,1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Kevilin", 100, 5);

        System.out.println("---------------teste exibir--------------");
        contaPoupanca.exibirSaldo();
        contaCorrente.exibirSaldo();

        System.out.println("---------------------teste saque CC---------------------");
        contaCorrente.sacar(12000);
        contaCorrente.sacar(10500);
        System.out.println("---------------------teste rendimento CP---------------------");
        contaPoupanca.aplicarRendimento();
        System.out.println("---------------------teste exibir---------------------");
        contaPoupanca.exibirSaldo();
        contaCorrente.exibirSaldo();
    }
}
