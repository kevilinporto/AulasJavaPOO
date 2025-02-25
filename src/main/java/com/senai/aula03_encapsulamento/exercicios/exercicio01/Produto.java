package com.senai.aula03_encapsulamento.exercicios.exercicio01;

import com.senai.aula02_colecoes.exercicios.exercicio01.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    Scanner scanner = new Scanner(System.in);
    private static String nome;
    private double preco;

    @Override
    public String toString() {
        return "Produto:" + nome +
                "\npreco: " + preco;
    }

    public Produto(){
        nome = null;
        preco = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){

        if(preco >= 1){
            this.preco = preco;
        } else {
            System.out.println("Valor inválido.");
        }
    }


}
