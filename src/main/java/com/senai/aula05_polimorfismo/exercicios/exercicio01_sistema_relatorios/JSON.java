package com.senai.aula05_polimorfismo.exercicios.exercicio01_sistema_relatorios;

public class JSON extends Relatorio{
    @Override
    public void gerar() {
        System.out.println("Relatório JSON gerado com sucesso.");
    }
}
