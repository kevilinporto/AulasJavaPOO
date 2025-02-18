package com.senai.aula02_colecoes.exemplos.carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Carro> listaDeCarros = new ArrayList<>();

        System.out.print("Quantos carros você deseja inserir no sistema? ");
        int qtdCarros = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Preencha as informações a seguir: ");
        for (int i = 0; i < qtdCarros; i++) {
            System.out.println("\nCarro " + (i+1) + "\n");

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Fabricante: ");
            String fabricante = scanner.nextLine();

            System.out.print("Cor: ");
            String cor = scanner.nextLine();

            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine(); //limpa o buffer

            System.out.print("Valor inicial: ");
            double valorInicial = scanner.nextDouble();
            scanner.nextLine();

            listaDeCarros.add(new Carro(cor, fabricante, modelo, valorInicial, ano)); //cria um objeto, associa os atributos digitados à ele e adiciona no ArrayList

        }

        listaDeCarros.forEach(System.out::println);

    }
}
