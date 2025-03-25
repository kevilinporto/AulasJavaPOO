package com.senai.aula05_polimorfismo.exemplos.exemplo04_sistema_pagamento;

public class Freelancer extends Pagamento {
    private double valorProjeto;

    public Freelancer(String nome, double valorProjeto) {
        super(nome);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamento() {
        return valorProjeto;
    }


}
