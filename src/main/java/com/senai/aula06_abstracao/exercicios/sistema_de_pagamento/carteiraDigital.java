package com.senai.aula06_abstracao.exercicios.sistema_de_pagamento;

public class carteiraDigital extends Pagamento{
    public carteiraDigital(String nomeUsuario, double valorTransacao) {
        super(nomeUsuario, valorTransacao);
    }

    @Override
    void executarPagamento() {
        System.out.println("Pagamento com carteira digital finalizado.");

    }


}
