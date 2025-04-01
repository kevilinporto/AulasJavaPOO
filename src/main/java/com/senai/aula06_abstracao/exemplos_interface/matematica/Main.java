package com.senai.aula06_abstracao.exemplos_interface.matematica;

public class Main {
    public static void main(String[] args) {
        int soma = Matematica.somar(10, 10);
        System.out.println(soma);

        int subtracao = Matematica.subtrair(20, 15);
        System.out.println(subtracao);

        System.out.println("O valor de pi é " + Matematica.PI);
    }
}
