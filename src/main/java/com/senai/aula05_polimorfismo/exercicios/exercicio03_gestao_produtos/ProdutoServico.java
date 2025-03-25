package com.senai.aula05_polimorfismo.exercicios.exercicio03_gestao_produtos;

public class ProdutoServico extends Produto{
    private double impostoServico;

    public ProdutoServico(double precoProduto, String nomeProduto, double impostoServico) {
        super(precoProduto, nomeProduto);
        this.impostoServico = impostoServico;
    }

    @Override
    public double calcularPrecoFinal() {
        double total = getPrecoProduto() + impostoServico;
        return total;
    }

    public double getImpostoServico() {
        return impostoServico;
    }

    public void setImpostoServico(double impostoServico) {
        this.impostoServico = impostoServico;
    }
}
