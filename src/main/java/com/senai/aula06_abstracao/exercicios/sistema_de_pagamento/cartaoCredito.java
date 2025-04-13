package com.senai.aula06_abstracao.exercicios.sistema_de_pagamento;

public class cartaoCredito extends Pagamento{
    public cartaoCredito(String usuario, double valor) {
        super(usuario, valor);
    }

    @Override
    void executarPagamento() {
        System.out.println("Pagamento com cartão de crédito aprovado.");
    }
}
