package com.senai.aula02_colecoes.exercicios.exercicio02;


public class Produto {
    private String nome;
    private int qtdEstoque;

    public Produto(String nome, int qtdEstoque) {
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Quantidade em estoque: " + qtdEstoque;
    }

    public String getNome(){ // getter
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQtdEstoque(){
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
