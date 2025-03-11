package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_operacoes_simples;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) { //constructor
        this.titular = titular;
        if(saldo >= 0){ //só é possivel alterar se saldo for maior que 0
            this.saldo = saldo;
        } else {
            System.out.println("O saldo não pode iniciar negativo. Valor atribuido: R$O,O");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar (double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            mensagemDeSucesso("Saque", this);
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public boolean depositar (double valor) {
        if (valor > 0) {
            saldo += valor;
            mensagemDeSucesso("Deposito", this);
            return true;
        } else {
            System.out.println("Operação inválida. O valor de depósito deve ser maior que R$0,0.");
            return false;
        }
    }

    public static void mensagemDeSucesso(String operacao, ContaBancaria minhaConta){
        System.out.println(operacao + " na conta de " + minhaConta.titular + " realizado com sucesso. Saldo atual: R$" + minhaConta.saldo);

    }

    public void transferencia (double valor, ContaBancaria contaDestino){
        if (this.sacar(valor)) { // verifica se há saldo na conta
            contaDestino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}


