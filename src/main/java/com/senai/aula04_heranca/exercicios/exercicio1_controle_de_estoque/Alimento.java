package com.senai.aula04_heranca.exercicios.exercicio1_controle_de_estoque;
import java.time.LocalDate;
public class Alimento extends Produto{
    private LocalDate dataValidade;

    public Alimento(String nome, double preco, int qtdEstoque, LocalDate dataValidade) {
        super(nome, preco, qtdEstoque);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() + "\n Preço: R$" + getPreco() + "\n Quantidade em estoque: " + getQtdEstoque()
                + "\n Data de validade: " + getDataValidade() + "\n");
    }
}
