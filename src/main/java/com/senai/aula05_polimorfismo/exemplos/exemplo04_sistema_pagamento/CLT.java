package com.senai.aula05_polimorfismo.exemplos.exemplo04_sistema_pagamento;

public class CLT extends Pagamento{
    private double salario;

    public CLT(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }
}
