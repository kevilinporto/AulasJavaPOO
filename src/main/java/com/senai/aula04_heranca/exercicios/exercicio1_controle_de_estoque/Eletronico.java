package com.senai.aula04_heranca.exercicios.exercicio1_controle_de_estoque;

public class Eletronico extends Produto {
    private int voltagem;

    public Eletronico(String nome, double preco, int qtdEstoque, int voltagem) {
        super(nome, preco, qtdEstoque);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() + "\n Preço: R$" + getPreco() + "\n Quantidade em estoque: " + getQtdEstoque()
                + "\n Voltagem: " + getVoltagem() + "\n");
    }

    public void alterarPreco(){}
}
