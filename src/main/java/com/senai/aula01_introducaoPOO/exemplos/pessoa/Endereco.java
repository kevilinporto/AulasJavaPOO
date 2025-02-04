package com.senai.aula01_introducaoPOO.exemplos.pessoa;

public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String estado;

    // Constructor
    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rua " + rua + ", " + numero + ", " + bairro + ", " + cidade + ", " + estado;

    }
}
