package com.senai.aula06_abstracao.exercicios.controle_de_entrega;

public class Main {
    public static void main(String[] args) {
        BicicletaEntrega bicicleta = new BicicletaEntrega(20, 10, 5);
        MotoEntrega moto = new MotoEntrega(50, 40, 200);

        System.out.println("-----------teste moto------------");
        moto.verificarVelocidadeAtual();
        moto.verificarDistancia();
        moto.aumentarVelocidade(10);
        moto.verificarDistancia();

        System.out.println("\n-----------teste bicicleta------------");
        bicicleta.verificarVelocidadeAtual();
        bicicleta.verificarDistancia();
        bicicleta.aumentarVelocidade(20);
        bicicleta.verificarVelocidadeAtual();
    }
}
