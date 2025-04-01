package com.senai.aula06_abstracao.exemplos_interface.aparelho_eletronico;

public class Main {
    public static void main(String[] args) {
        testeAparelho(new Computador());
        testeAparelho(new Televisao());
        Televisao televisao = new Televisao();

        televisao.ligar();
        televisao.mudarCanal();


        Computador computador = new Computador();
        computador.ligar();

        AparelhoEletronico ap = televisao;
        ap.ligar();

        Televisao tv2 = (Televisao) ap;

        tv2.mudarCanal();



    }
    private static void testeAparelho(AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
