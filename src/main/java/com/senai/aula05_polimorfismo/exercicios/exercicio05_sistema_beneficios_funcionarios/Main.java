package com.senai.aula05_polimorfismo.exercicios.exercicio05_sistema_beneficios_funcionarios;

public class Main {
    public static void main(String[] args) {
        calcularDesconto(new ValeAlimentacao(1127, 0.1, 3000));
        calcularDesconto(new AuxilioTransporte(300, 0.8, 3000));

    }
    public static void calcularDesconto(Beneficio beneficio){
        beneficio.calcularDesconto();
    }
}
