package com.senai.aula06_abstracao.exemplos_interface.smartwatch;

public class SmartWatchAvancado implements SensorCardiaco, SensorPassos, SensorSono {

    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Batimentos cardíacos: 80bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos contados hoje: 2000");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Qualidade sono: 7h30 de sono profundo");
    }

    void exibirInfoDispositivos(){
        System.out.println("Dispositos conectados: ...");
    }
}
