package com.senai.aula03_encapsulamento.exemplos.exemplo01;

public class Carro {
    private int velocidade;

    public Carro(){
        velocidade = 0;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidade){
        if (velocidade >= 0){ //Regra de negócio: velocidade não pode ser negativa
            this.velocidade = velocidade;
        } else {
            System.out.println("Velocidade inválida");
        }
    }
}
