package com.senai.aula06_abstracao.exercicios.gerenciamento_eventos;

public class EventoSocial implements GerenciadorEventos{
    @Override
    public void iniciarEvento() {
        GerenciadorEventos.super.iniciarEvento();
    }
}
