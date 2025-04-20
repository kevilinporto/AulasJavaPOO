package com.senai.aula06_abstracao.exercicios.gerenciamento_eventos;

public abstract class Evento {
    protected static final int TEMPO_LIMITE_PADRAO = 60;
    protected static final String PREMIACAO_PADRAO = "Medalha de participação";

    public void iniciarEvento() {
        System.out.println("Iniciando evento com tempo limite: " + TEMPO_LIMITE_PADRAO + " minutos.");
    }

    public void finalizarEvento() {
        System.out.println("Evento finalizado.");
    }

    public void premiarParticipantes() {
        System.out.println("Premiando com: " + PREMIACAO_PADRAO);
    }


}
