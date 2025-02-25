package com.senai.aula03_encapsulamento.exemplos.exemplo01;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        // utilizando métodos públicos para modificar e acessar uma variável privada
        carro1.setVelocidade(100);
        System.out.println("Velocidade atual: " + carro1.getVelocidade());

        // testando uma velocidade inválida

        carro1.setVelocidade(-20);


    }
}
