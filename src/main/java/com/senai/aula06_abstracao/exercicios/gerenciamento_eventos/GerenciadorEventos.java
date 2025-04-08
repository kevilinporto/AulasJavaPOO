package com.senai.aula06_abstracao.exercicios.gerenciamento_eventos;

public interface GerenciadorEventos {
    double PREMIO = 1000;
    int TEMPO_LIMITE = 6;

    default void iniciarEvento(){
        System.out.println("Iniciando evento!");
    }
    default void finalizarEvento(){
        System.out.println("Finalizando evento.");
    }

    default void premiarParticipantes(){}
}
