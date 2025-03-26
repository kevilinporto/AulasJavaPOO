package com.senai.aula05_polimorfismo.exercicios.exercicio01_sistema_relatorios;

public class Main {
    public static void main(String[] args) {
        gerar(new PDF());
        gerar(new CSV());
        gerar(new JSON());
    }

    public static void gerar(Relatorio relatorio){
        relatorio.gerar();
    }
}
