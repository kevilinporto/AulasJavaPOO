package com.senai.aula05_polimorfismo.exercicios.exercicio04_sistema_monitoramento_sensores;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double tempAleatoria = Math.random() * 40;
        int porcenAleatoria = random.nextInt(100);

        SensorTemperatura sensorTemperatura = new SensorTemperatura(tempAleatoria);
        SensorUmidade sensorUmidade = new SensorUmidade(porcenAleatoria);


        sensorTemperatura.reportarValor();
        sensorUmidade.reportarValor();

    }
}
