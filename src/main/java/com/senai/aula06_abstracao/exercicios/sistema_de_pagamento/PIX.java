package com.senai.aula06_abstracao.exercicios.sistema_de_pagamento;

public class PIX extends Pagamento{
    public PIX(String usuario, double valor) {
        super(usuario, valor);
    }

    @Override
    void executarPagamento() {
        System.out.println("Pagamento via PIX efetuado com sucesso.");
    }
}
