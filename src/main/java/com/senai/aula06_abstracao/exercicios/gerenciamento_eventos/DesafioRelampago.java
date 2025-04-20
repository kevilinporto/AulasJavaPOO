package com.senai.aula06_abstracao.exercicios.gerenciamento_eventos;

public class DesafioRelampago extends Evento {
    @Override
    public void iniciarEvento() {
        System.out.println("Desafio relâmpago! Você tem 5 minutos!");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Somente quem completou em tempo recebe premiação especial.");
    }

    @Override
    public void finalizarEvento() {
        System.out.println("Tempo esgotado! Desafio encerrado.");
    }
}
