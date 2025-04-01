package com.senai.aula06_abstracao.exemplos_classes_abstratas.animal;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " está miando: Miau!");
    }
}
