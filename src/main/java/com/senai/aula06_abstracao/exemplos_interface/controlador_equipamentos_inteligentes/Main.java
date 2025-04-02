package com.senai.aula06_abstracao.exemplos_interface.controlador_equipamentos_inteligentes;

public class Main {
    public static void main(String[] args) {
        testarAparelhos(new LampadaInteligente());
        testarAparelhos(new TVSmart());
    }
    public static void testarAparelhos(AparelhoInteligente aparelhoInteligente){
        System.out.printf("---------------- Teste %s  -------------------\n", aparelhoInteligente.getClass().getSimpleName());
        aparelhoInteligente.ligar();
        if(aparelhoInteligente instanceof LampadaInteligente lampadaInteligente){
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.diminuirBrilho();
            lampadaInteligente.diminuirBrilho();
            lampadaInteligente.diminuirBrilho();
        } else if (aparelhoInteligente instanceof TVSmart tvSmart){
            tvSmart.aumentarVolume();
            tvSmart.aumentarVolume();
            tvSmart.diminuirVolume();
            tvSmart.diminuirVolume();
            tvSmart.diminuirVolume();
        }

        aparelhoInteligente.desligar();
    }
}
