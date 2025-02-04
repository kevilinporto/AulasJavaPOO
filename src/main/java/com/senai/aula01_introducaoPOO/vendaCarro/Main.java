package com.senai.aula01_introducaoPOO.vendaCarro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Preto", "Hyundai", "Tucson", 150000, 2020);
        Carro carro2 = new Carro("Vermelho", "Chevrolet", "Palio", 80000, 2011);

        System.out.println(carro1);
        System.out.println(carro2);

        carro1.testeDrive();
        carro1.comprar("Vitoria");
        carro2.testeDrive();
        carro2.comprar("Vitoria");

        carro1.valorTabelaFipe(2025);
        carro2.valorTabelaFipe(2025);
    }
}
