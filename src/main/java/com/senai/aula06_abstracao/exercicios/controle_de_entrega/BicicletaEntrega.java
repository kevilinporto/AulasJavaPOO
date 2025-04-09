package com.senai.aula06_abstracao.exercicios.controle_de_entrega;

public class BicicletaEntrega extends VeiculoEntrega{


    public BicicletaEntrega(double velocidadeAtual, double capacidadeDeCarga, double distancia) {
        super(velocidadeAtual, capacidadeDeCarga, distancia);
    }

    @Override
    void verificarVelocidadeAtual() {
        System.out.println("Velocidade atual da bicicleta: " + velocidadeAtual + " Km/h");
    }

    @Override
    void verificarDistancia() {
        System.out.println("Distância restante até o destino: " + distancia + " Km");
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
        if (velocidadeAtual + incrementoVelocidade > 30){
            velocidadeAtual = 30;
            System.out.println("Velocidade máxima da bicicleta atingida: " + velocidadeAtual);
        }else{
            velocidadeAtual += incrementoVelocidade;
            System.out.println("Aumentando velocidade: " + velocidadeAtual);
        }
    }
}
