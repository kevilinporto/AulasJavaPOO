package com.senai.aula01_introducaoPOO.exemplos.pessoa;

public class Pessoa {
    // Se a agrupam os dados na classe

    // Atributos
    String nome;
    int idade;
    float altura;
    Endereco endereco;

    // Reserva um espaço na memória e solicita as informações dos atributos caso for pedido.
    // O construtor é sempre público e tem o mesmo nome da classe. Não precisa de retorno.
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, float altura, Endereco endereco ) {
        this.endereco = endereco;
        this.idade = idade;
        this.altura = altura;
        this.nome = nome;
    }

    // Métodos
    public void falar(String frase) {
        System.out.println(nome + " falou " + frase);
    }

    public void comer(String alimento) {
        System.out.println(nome + " comeu " + alimento);
    }

    @Override
    // o ToString pega o conteúdo das váriaveis para mostrá-las
    public String toString() {
        return "O nome da pessoa é " + this.nome + ", tem " + this.idade + " anos de idade, " + this.altura + " de altura e mora no endereço " + this.endereco;
    }
}
