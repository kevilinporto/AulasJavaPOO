package com.senai.aula04_heranca.exercicios.exercicio03_sistema_gestao_pedidos;

public class PedidoOnline extends Pedido {
    protected double taxaEntrega;

    public PedidoOnline(int numPedido, double valorTotal, double taxaEntrega) {
        super(numPedido, valorTotal);
        this.taxaEntrega = taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
}
