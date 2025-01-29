package com.senai.aula01_introducaoPOO.exercicio01;

import java.util.Scanner;

public class Produto {
    Scanner scanner = new Scanner(System.in);
    String nome;
    double preco;
    int qtdEstoque;

    public Produto(String nome, int qtdEstoque, double preco) {
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
    }

    public void exibirDetalhes(){

    }

    public void atualizarEstoque(){

    }

    public void calcularValorEstoque(){
        System.out.println("Calculadora de estoque");
        System.out.println("Digite o preço do produto: ");
        preco = scanner.nextDouble();

        System.out.println("Digite a quantidade do estoque: ");
        qtdEstoque = scanner.nextInt();

        double resultado = preco * qtdEstoque;

        System.out.println("O valor de estoque é: " + resultado);
    }

}

