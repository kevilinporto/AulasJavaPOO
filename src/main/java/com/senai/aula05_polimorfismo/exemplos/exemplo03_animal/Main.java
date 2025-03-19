package com.senai.aula05_polimorfismo.exemplos.exemplo03_animal;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();

        animal1.fazerSom();
        cachorro1.fazerSom();
        gato1.fazerSom();
    }
}
