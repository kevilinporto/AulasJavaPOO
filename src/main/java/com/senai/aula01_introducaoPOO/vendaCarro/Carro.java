package com.senai.aula01_introducaoPOO.vendaCarro;

public class Carro {
    String cor;
    String fabricante;
    String modelo;
    double valorInicial;
    int anoFabricacao;

    public Carro(String cor, String fabricante, String modelo, double valorInicial, int anoFabricacao) { // o this deixa explicito que o atributo pertence exclusivamente à classe carro
        this.cor = cor;                                                     // use o this quando houver variáveis de nomes iguais
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.valorInicial = valorInicial;
        this.anoFabricacao = anoFabricacao;
    }



    public void testeDrive() {
        System.out.println("Vrooom! " + modelo + " ligado!");

    }

    public void comprar(String nomeCliente) {
        System.out.println("Parabéns " + nomeCliente + ", você acaba de adquirir o carro " + modelo);

    }

    public void valorTabelaFipe(int anoAtual) {
        double valorFinal = valorInicial;
        int idade = anoAtual - anoFabricacao;

        for (int i = 0; i < idade; i++) {
            valorFinal -= (valorFinal * 0.02);
        }
        System.out.println("Com uma desvalorização de 2% ao ano, o valor final do veículo " + modelo + " é de R$" + String.format("%,3.2f",valorFinal));

    }

}


