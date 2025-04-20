package com.senai.aula06_abstracao.exercicios.gerenciamento_eventos;

public class EventoSocial extends Evento{
    @Override
    public void iniciarEvento() {
        super.iniciarEvento();
        System.out.println("Evento social começando com interação entre jogadores.");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Todos recebem emojis comemorativos!");
    }
}
