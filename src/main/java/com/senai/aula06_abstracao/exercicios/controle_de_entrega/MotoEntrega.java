package com.senai.aula06_abstracao.exercicios.controle_de_entrega;

public class MotoEntrega extends VeiculoEntrega{

    public MotoEntrega(double velocidadeAtual, double capacidadeDeCarga, double distancia) {
        super(velocidadeAtual, capacidadeDeCarga, distancia);
    }

    @Override
    void verificarVelocidadeAtual() {
        System.out.println("Velocidade atual da moto: " + velocidadeAtual + " Km/h");
    }

    @Override
    void verificarDistancia() {
        System.out.println("Distância restante até o destino com atraso do trânsito: " + distancia + " Km");
        tempoEstimado();
    }

    @Override
    void tempoEstimado() {
        // Converte a distância de metros para quilômetros
        if (distancia < 1) {
            distancia = distancia / 1000;
        }

        double tempoDouble = distancia / velocidadeAtual; // Calcula o tempo em horas
        int tempoEmMinutos = (int) (tempoDouble * 60); // Converte para minutos

        System.out.println("Tempo estimado de entrega: " + tempoEmMinutos + " minutos");
    }

    @Override
    void aumentarVelocidade(double incrementoVelocidade) {
        velocidadeAtual += incrementoVelocidade;
        System.out.println("Aumentando velocidade em: " + incrementoVelocidade + " Km/h");

    }
}
