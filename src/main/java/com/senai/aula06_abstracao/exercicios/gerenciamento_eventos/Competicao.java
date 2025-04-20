package com.senai.aula06_abstracao.exercicios.gerenciamento_eventos;

public class Competicao extends Evento{
    @Override
    public void iniciarEvento() {
        super.iniciarEvento();
        System.out.println("Competição iniciada! Que vença o melhor.");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiando 1º, 2º e 3º lugares com troféus.");
    }
}
