package com.senai.aula06_abstracao.exemplos_classes_abstratas.animal;

public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    void dormir(){
        System.out.println(nome + " está dormindo!");
    }

    abstract void fazerSom();
}
