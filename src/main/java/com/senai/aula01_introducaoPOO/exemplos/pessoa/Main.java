package com.senai.aula01_introducaoPOO.exemplos.pessoa;

public class Main {
    public static void main(String[] args) {
        // O new cria um novo objeto e atribui um endereço à variável
        Pessoa pessoa1 = new Pessoa("Vitoria", 18);

        Pessoa pessoa2 = new Pessoa(
                18,
                new Endereco(
                        203,
                        "Brigadeiro Luís Antônio",
                        "Bela Vista",
                        "São Paulo",
                        "SP"
                ),
                1.67f,
                "Kevilin");



        System.out.println(pessoa1);
        System.out.println(pessoa2);

        pessoa1.comer("Tonkatsu");
        pessoa2.comer("Karê");

        pessoa1.falar("RDR2 Goty");
        pessoa2.falar("pprt");

    }
}
