package com.senai.aula04_heranca.exemplos.exemplo1_veiculo;

public class Carro extends Veiculo {
    private int portas;

    public Carro(int ano, String modelo, int portas) {
        super(ano, modelo);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes(); //exibe os atributos da classe pai
        System.out.println(", Portas: " + portas); //exibe o atributo específico da subclasse
    }
}
