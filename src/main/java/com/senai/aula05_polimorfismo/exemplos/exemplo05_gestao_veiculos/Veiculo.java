package com.senai.aula05_polimorfismo.exemplos.exemplo05_gestao_veiculos;

public class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void realizarManutencao(){
        System.out.println("Manutenção genérica");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

