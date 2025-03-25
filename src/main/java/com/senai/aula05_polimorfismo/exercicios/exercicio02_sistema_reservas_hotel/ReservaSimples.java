package com.senai.aula05_polimorfismo.exercicios.exercicio02_sistema_reservas_hotel;

public class ReservaSimples extends Reserva {
    private double custoServicos;

    public ReservaSimples(double custoReserva, double custoServicos) {
        super(custoReserva);
        this.custoServicos = custoServicos;
    }

    @Override
    public double calcularCusto() {
        System.out.println("O valor total da reserva simples é de: " + getCustoReserva() + " com adição de R$" + custoServicos + " por serviço solicitado.");
        return getCustoReserva() + custoServicos;
    }

    @Override
    public void tipoReserva() {
        System.out.println("Reserva simples gerada. Custo de reserva: " + getCustoReserva() + " | Taxa de serviços: " + custoServicos);
    }
}
