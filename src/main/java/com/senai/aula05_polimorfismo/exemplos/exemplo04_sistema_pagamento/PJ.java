package com.senai.aula05_polimorfismo.exemplos.exemplo04_sistema_pagamento;

public class PJ extends Pagamento{
    private double horasTrabalhadas;
    private double valorPorHora;

    public PJ(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorPorHora;
    }
}
