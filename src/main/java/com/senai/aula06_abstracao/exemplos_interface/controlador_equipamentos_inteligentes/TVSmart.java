package com.senai.aula06_abstracao.exemplos_interface.controlador_equipamentos_inteligentes;

public class TVSmart implements AparelhoInteligente{
    private int volume;

    public TVSmart() {
        this.volume = 0;
    }

    @Override
    public void ligar() {
        System.out.println("SmartTV ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("SmartTV desligada.");
    }

    public void aumentarVolume(){
        System.out.printf("Volume %d\n", volume = ajustarNivel(volume,1));
    }

    public void diminuirVolume(){
        System.out.printf("Volume %d\n", volume = ajustarNivel(volume,-1));
    }
}
