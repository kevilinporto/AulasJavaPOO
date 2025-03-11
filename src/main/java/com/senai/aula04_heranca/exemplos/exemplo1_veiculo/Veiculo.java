package com.senai.aula04_heranca.exemplos.exemplo1_veiculo;

public class Veiculo {
    private int ano;
    private String modelo;

    public Veiculo(int ano, String modelo) {
        this.ano = ano;
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibirDetalhes(){
        System.out.print("Modelo: " + modelo + ", Ano: " + ano);
    }
}
