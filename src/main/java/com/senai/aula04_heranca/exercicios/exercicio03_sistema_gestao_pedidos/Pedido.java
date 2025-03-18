package com.senai.aula04_heranca.exercicios.exercicio03_sistema_gestao_pedidos;

public class Pedido {
    protected int numPedido;
    protected double valorTotal;

    public Pedido(int numPedido, double valorTotal) {
        this.numPedido = numPedido;
        this.valorTotal = valorTotal;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "\nNúmero do pedido: " + numPedido + "\nValor total: " + valorTotal + "\n";
    }
}

