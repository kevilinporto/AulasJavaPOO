package com.senai.aula05_polimorfismo.exemplos.exemplo03_animal;

public class Gato extends Animal{
    @Override
    void fazerSom() {
        System.out.println("O gato mia: Miau Miau!");
    }
}
