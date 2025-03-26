package com.senai.aula05_polimorfismo.exercicios.exercicio02_sistema_reservas_hotel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ReservaSimples reservaSimples1 = new ReservaSimples(600, 70);
        ReservaVIP reservaVIP1 = new ReservaVIP(300, 1000);

        reservaSimples1.tipoReserva();
        reservaSimples1.calcularCusto();

        reservaVIP1.tipoReserva();
        reservaVIP1.calcularCusto();

    }
}
