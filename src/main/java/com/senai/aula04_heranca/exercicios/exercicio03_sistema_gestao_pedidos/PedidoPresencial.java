package com.senai.aula04_heranca.exercicios.exercicio03_sistema_gestao_pedidos;

public class PedidoPresencial extends Pedido{
    protected double descontoAVista;

    public PedidoPresencial(int numPedido, double valorTotal, double descontoAVista) {
        super(numPedido, valorTotal);
        this.descontoAVista = descontoAVista;
    }

    public double getDescontoAVista() {
        return descontoAVista;
    }

    public void setDescontoAVista(double descontoAVista) {
        this.descontoAVista = descontoAVista;
    }
}
