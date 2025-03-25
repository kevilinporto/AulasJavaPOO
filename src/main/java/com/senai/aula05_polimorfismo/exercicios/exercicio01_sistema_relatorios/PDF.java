package com.senai.aula05_polimorfismo.exercicios.exercicio01_sistema_relatorios;

public class PDF extends Relatorio{

    @Override
    public void gerar() {
        System.out.println("Relatório em PDF gerado com sucesso.");
    }
}
