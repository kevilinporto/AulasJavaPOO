package com.senai.aula06_abstracao.exemplos_interface.matematica;

public interface Matematica {
    double PI = 3.14;

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }
}
