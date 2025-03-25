package com.senai.aula05_polimorfismo.exercicios.exercicio03_gestao_produtos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new ProdutoFisico(8000, "Geladeira", 0.1));
        listaProdutos.add(new ProdutoDigital(200, "Licença de Software", 0.08));
        listaProdutos.add(new ProdutoServico(500, "Instalação de software", 0.01));

        listaProdutos.forEach(Produto::calcularPrecoFinal);
        listaProdutos.forEach(produto -> System.out.printf(
                "O produto %s tem o preço final de R$%,.2f\n", produto.getNomeProduto(), produto.calcularPrecoFinal()
        ));

    }
}
