package com.senai.aula05_polimorfismo.exemplos.exemplo02_produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Feijão");
        Produto produto2 = new Produto("Arroz", 25.5);
        Produto produto3 = new Produto("Macarrão", 5, 5);
        Produto produto4 = new Produto();

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
    }
}
