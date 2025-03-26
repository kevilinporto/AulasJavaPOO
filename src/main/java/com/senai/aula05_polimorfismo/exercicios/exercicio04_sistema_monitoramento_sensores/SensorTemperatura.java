package com.senai.aula05_polimorfismo.exercicios.exercicio04_sistema_monitoramento_sensores;

public class SensorTemperatura extends Sensor {
    private double temperatura;

    public SensorTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void reportarValor() {
        System.out.printf("SENSOR DE TEMPERATURA: A temperatura atual é de %.2f °C\n", temperatura);
    }
}
