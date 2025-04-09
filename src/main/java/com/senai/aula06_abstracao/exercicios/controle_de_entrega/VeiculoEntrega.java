package com.senai.aula06_abstracao.exercicios.controle_de_entrega;

public abstract class VeiculoEntrega {
    protected double velocidadeAtual;
    protected double capacidadeDeCarga;
    protected double distancia;

    public VeiculoEntrega(double velocidadeAtual, double capacidadeDeCarga, double distancia) {
        this.velocidadeAtual = velocidadeAtual;
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.distancia = distancia;
    }

    abstract void verificarVelocidadeAtual();

    abstract void verificarDistancia();

    abstract void tempoEstimado();

    abstract void aumentarVelocidade(double incrementoVelocidade);
}
