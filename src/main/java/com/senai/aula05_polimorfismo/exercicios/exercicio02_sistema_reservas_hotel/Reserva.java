package com.senai.aula05_polimorfismo.exercicios.exercicio02_sistema_reservas_hotel;

public class Reserva {
    private double custoReserva;

    public Reserva(double custoReserva) {
        this.custoReserva = custoReserva;
    }

    public double getCustoReserva() {
        return custoReserva;
    }

    public void setCustoReserva(double custoReserva) {
        this.custoReserva = custoReserva;
    }

    public double calcularCusto(){
        return custoReserva;
    }

    public void tipoReserva(){
        System.out.println("Reserva genérica");
    }
}
