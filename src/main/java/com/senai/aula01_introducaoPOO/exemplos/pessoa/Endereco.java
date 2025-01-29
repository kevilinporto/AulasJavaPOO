package com.senai.aula01_introducaoPOO.exemplos.pessoa;

public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String estado;

    // Constructor
    public Endereco(int numero, String rua, String bairro, String cidade, String estado) {
        this.numero = numero;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rua " + rua + ", " + numero + ", " + bairro + ", " + cidade + ", " + estado;

    }
}
