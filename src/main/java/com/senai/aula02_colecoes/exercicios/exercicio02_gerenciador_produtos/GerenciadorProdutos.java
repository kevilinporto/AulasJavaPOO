package com.senai.aula02_colecoes.exercicios.exercicio02_gerenciador_produtos;

import java.util.ArrayList;

public class GerenciadorProdutos {
    // Classe com todos os métodos gerenciadores de produto

    public ArrayList<Produto> listaProdutos;

    public GerenciadorProdutos() { //construtor
        this.listaProdutos = new ArrayList<>();
    }


    public void cadastrarProduto(String nome, int qtdEstoque) {
        Produto novoProduto = new Produto(nome, qtdEstoque);
        listaProdutos.add(novoProduto);
        System.out.println("Produto: " + nome + " | Estoque: " + qtdEstoque + "\n Cadastrado com sucesso.");
    }


    public void listarProdutos() {
        listaProdutos.forEach(System.out::println);
    }


    public void atualizarProduto(String nome, int novaQtdEstoque) {
        boolean encontrado = false;
        System.out.println("Digite a nova quantidade de estoque: ");
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setQtdEstoque(novaQtdEstoque);
                System.out.println("Novo estoque do produto " + nome + " atualizado para " + novaQtdEstoque);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado.");

        }


    }


    public void removerProduto(String nome) {
        boolean produtoEncontrado = false;
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                listaProdutos.remove(produto);
                System.out.println("Produto " + nome + " removido com sucesso.");
                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado.");
        }
    }


    public void pesquisarProduto(String nome) {
        boolean produtoEncontrado = false;
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Produto: " + produto.getNome());
                System.out.println("Estoque: " + produto.getQtdEstoque());
                produtoEncontrado = true;
                break;
            }
        }
        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado");
        }
    }

}
