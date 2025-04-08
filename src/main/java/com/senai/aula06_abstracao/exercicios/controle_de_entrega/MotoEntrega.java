package com.senai.aula06_abstracao.exercicios.controle_de_entrega;

public class MotoEntrega extends VeiculoEntrega{

    public MotoEntrega(double velocidadeAtual, double capacidadeDeCarga, double distancia) {
        super(velocidadeAtual, capacidadeDeCarga, distancia);
    }

    @Override
    void verificarVelocidadeAtual() {

    }

    @Override
    void verificarDistancia() {
    }

    @Override
    void aumentarVelocidade() {

    }
}
