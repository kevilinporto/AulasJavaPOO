package com.senai.aula06_abstracao.exercicios.gerenciamento_eventos;

public class Main {
    public static void main(String[] args) {
        EventoSocial evento1 = new EventoSocial();
        Competicao evento2 = new Competicao();
        DesafioRelampago evento3 = new DesafioRelampago();

        evento1.iniciarEvento();
        evento1.finalizarEvento();
        evento1.premiarParticipantes();

        System.out.println("-----");

        evento2.iniciarEvento();
        evento2.finalizarEvento();
        evento2.premiarParticipantes();

        System.out.println("-----");

        evento3.iniciarEvento();
        evento3.finalizarEvento();
        evento3.premiarParticipantes();
    }
}

