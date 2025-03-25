package com.senai.aula05_polimorfismo.exercicios.exercicio02_sistema_reservas_hotel;

public class ReservaVIP extends Reserva{
    private double pacoteVIP;

    public ReservaVIP(double custoReserva, double pacoteVIP) {
        super(custoReserva);
        this.pacoteVIP = pacoteVIP;
    }

    @Override
    public double calcularCusto() {
        double total = getCustoReserva() + pacoteVIP;
        System.out.println("O valor total da reserva incluso o pacote VIP é de: " + total);
        return getCustoReserva() + pacoteVIP;
    }

    @Override
    public void tipoReserva() {
        System.out.println("Reserva VIP gerada. Custo de reserva: " + getCustoReserva() + " | Pacote VIP com todos os serviços inclusos: " + pacoteVIP);
    }
}
