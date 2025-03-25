package com.senai.aula05_polimorfismo.exercicios.exercicio03_gestao_produtos;

public class ProdutoDigital extends Produto{
    private double impostoProdutoDigital;

    public ProdutoDigital(double precoProduto, String nomeProduto, double impostoProdutoDigital) {
        super(precoProduto, nomeProduto);
        this.impostoProdutoDigital = impostoProdutoDigital;
    }


    @Override
    public double calcularPrecoFinal() {
        double total = getPrecoProduto() + (getPrecoProduto() * impostoProdutoDigital);
        return total;
    }

    public double getImpostoProdutoDigital() {
        return impostoProdutoDigital;
    }

    public void setImpostoProdutoDigital(double impostoProdutoDigital) {
        this.impostoProdutoDigital = impostoProdutoDigital;
    }
}
