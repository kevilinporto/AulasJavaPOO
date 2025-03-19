package com.senai.aula05_polimorfismo.exemplos.exemplo03_animal;

public class Cachorro extends Animal{
    @Override
    void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}
