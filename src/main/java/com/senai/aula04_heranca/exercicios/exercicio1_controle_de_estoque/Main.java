package com.senai.aula04_heranca.exercicios.exercicio1_controle_de_estoque;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Eletronico eletronico1 = new Eletronico("Geladeira", 1200, 20, 220);
        Alimento alimento1 = new Alimento("Arroz", 6, 200, LocalDate.of(2025, 6, 20));

        alimento1.exibirInformacoes();
        eletronico1.exibirInformacoes();
    }
}
