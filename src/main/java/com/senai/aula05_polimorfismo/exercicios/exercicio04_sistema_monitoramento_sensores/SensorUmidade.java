package com.senai.aula05_polimorfismo.exercicios.exercicio04_sistema_monitoramento_sensores;

public class SensorUmidade extends Sensor{

    private int umidade;

    public SensorUmidade(int umidade) {
        this.umidade = umidade;
    }

    public int getUmidade() {
        return umidade;
    }

    public void setUmidade(int umidade) {
        this.umidade = umidade;
    }

    @Override
    public void reportarValor() {
        System.out.println("SENSOR DE UMIDADE: A umidade atual está em " + umidade + "%");
    }
}





