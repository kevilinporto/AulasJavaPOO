package com.senai.aula05_polimorfismo.exercicios.exercicio03_gestao_produtos;

public class ProdutoFisico extends Produto{
    private double impostoProdutoFisico;

    public ProdutoFisico(double precoProduto, String nomeProduto, double impostoProdutoFisico) {
        super(precoProduto, nomeProduto);
        this.impostoProdutoFisico = impostoProdutoFisico;
    }


    @Override
    public double calcularPrecoFinal() {
        double total = getPrecoProduto() + impostoProdutoFisico;
        return total;
    }

    public double getImpostoProdutoFisico() {
        return impostoProdutoFisico;
    }

    public void setImpostoProdutoFisico(double impostoProdutoFisico) {
        this.impostoProdutoFisico = impostoProdutoFisico;
    }
}
