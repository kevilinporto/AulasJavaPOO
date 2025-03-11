package com.senai.aula04_heranca.exemplos.exemplo1_veiculo;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(2013, "City", 4);
        Moto moto1 = new Moto(2020,"Titan", true);

        carro1.exibirDetalhes();
        moto1.exibirDetalhes();
    }
}
