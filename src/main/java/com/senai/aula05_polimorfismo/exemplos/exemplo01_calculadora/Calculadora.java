package com.senai.aula05_polimorfismo.exemplos.exemplo01_calculadora;

public class Calculadora {

    //method para somar dois inteiros
    public int somar (int x, int y){
        System.out.println("(int , int)");
        return x + y;
    }

    //method para somar três inteiros (mesmo nome, diferente quantidade de parâmetros)
    int somar (int x, int y, int z){
        System.out.println("(int , int , int)");
        return x + y + z;
    }

    //method para somar dois números de ponto flutuante (mesmo nome, diferentes tipos de parâmetros)
    double somar (double x, double y){
        System.out.println("(double , double)");
        return x + y;
    }

    double somar (int x, double y){
        System.out.println("(int , double)");
        return x + y;
    }

    double somar (double x, int y){
        System.out.println("(double , int)");
        return x + y;
    }
}
