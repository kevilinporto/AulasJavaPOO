package com.senai.aula06_abstracao.exemplos_interface.veiculo;

public class Carro implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando.");
    }
}
