package com.senai.aula05_polimorfismo.exercicios.exercicio01_sistema_relatorios;

public class CSV extends Relatorio{

    @Override
    public void gerar() {
        System.out.println("Relatório CSV gerado com sucesso.");;
    }
}
