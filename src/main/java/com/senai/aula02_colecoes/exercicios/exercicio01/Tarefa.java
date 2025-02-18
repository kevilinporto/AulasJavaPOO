package com.senai.aula02_colecoes.exercicios.exercicio01;

import java.util.ArrayList;


public class Tarefa {
    String nomeTarefa;
    int identificador;
    boolean status;


    public Tarefa(String nomeTarefa, boolean status) {
        this.nomeTarefa = nomeTarefa;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa: " + nomeTarefa + " - " + " [ " + (status ? "concluído" : "pendente") + " ]";

    }


}
