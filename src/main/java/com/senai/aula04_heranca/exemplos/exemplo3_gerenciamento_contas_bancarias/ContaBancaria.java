package com.senai.aula04_heranca.exemplos.exemplo3_gerenciamento_contas_bancarias;

public class ContaBancaria {
    private String titular;
    protected  double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
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

    public static void mensagemDeSucesso(String operacao, ContaBancaria minhaContaBancaria){
        System.out.println(operacao + " na conta de " + minhaContaBancaria.titular + " realizado com sucesso. Saldo atual: R$" + minhaContaBancaria.saldo);

    }

    public void exibirSaldo(){
        System.out.printf("Titular: %s, Saldo: R$%,.2f\n", titular, saldo);
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

