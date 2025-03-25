package com.senai.aula05_polimorfismo.exercicios.exercicio03_gestao_produtos;

public class Produto {
    private double precoProduto;
    private String nomeProduto;
    private double porcentagemImposto;

    public Produto(double precoProduto, String nomeProduto) {
        this.precoProduto = precoProduto;
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPorcentagemImposto() {
        return porcentagemImposto;
    }

    public double calcularPrecoFinal(){
        return precoProduto * porcentagemImposto;
    }
}
