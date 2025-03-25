package com.senai.aula05_polimorfismo.exemplos.exemplo05_gestao_veiculos;

public class Main {
    public static void main(String[] args) {
        realizarManutencao(new Carro("City"));
        realizarManutencao(new Moto("Factor"));
        realizarManutencao(new Caminhao("Scania"));
    }

    private static void realizarManutencao(Veiculo veiculo){
        veiculo.realizarManutencao();
    }
}
