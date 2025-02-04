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
        System.out.println("Detalhes do produto: " + nome);
        System.out.println("\tNome: " + nome);
        System.out.println("\tQuantidade em estoque: " + qtdEstoque);
        System.out.println("\tPreço: " + preco);


    }

    public void atualizarEstoque(){
        String produtoEscolhido;
        boolean produtoEncontrado = false;

        System.out.println("Escolha o produto a ter o estoque atualizado: ");
        produtoEscolhido = scanner.nextLine();

        if(produtoEscolhido.equals(nome)){
            produtoEncontrado = true;
            System.out.println("Digite o novo valor de estoque");
            int valorNovo = scanner.nextInt();
            scanner.nextLine();
            qtdEstoque += valorNovo;

            System.out.println("Atualizado com sucesso. Novo valor de estoque de " + nome + " é de" + qtdEstoque);

        }else {
            System.out.println("Produto não encontrado.");
        }

    }

    public void calcularValorEstoque(){
        double resultado = preco * qtdEstoque;

        System.out.println("O valor de estoque do produto " + nome + " é de: R$" + resultado);
    }


}

