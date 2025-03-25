package com.senai.aula05_polimorfismo.exemplos.exemplo04_sistema_pagamento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamento> listaPagamentos = new ArrayList<>();

        listaPagamentos.add(new CLT("Vitoria", 1000));
        listaPagamentos.add(new PJ("Kevilin", 24, 1000));
        listaPagamentos.add(new Freelancer("Guilherme", 100000));

        listaPagamentos.forEach(pagamento -> System.out.printf(
                "%s recebe R$%,.2f\n", pagamento.getNome(), pagamento.calcularPagamento()
        ));
    }
}
