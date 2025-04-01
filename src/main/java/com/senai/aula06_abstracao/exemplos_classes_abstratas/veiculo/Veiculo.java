package com.senai.aula06_abstracao.exemplos_classes_abstratas.veiculo;

public abstract class Veiculo {
    private int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }

    void acelerar(int incremento){
        velocidade += incremento;
        System.out.println("Acelerando para " + velocidade + "Km/h");
    }

    abstract void ligar();
}
