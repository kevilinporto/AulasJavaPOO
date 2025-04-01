package com.senai.aula06_abstracao.exemplos_classes_abstratas.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listaDeAnimais = new ArrayList<>();

        listaDeAnimais.add(new Cachorro("Rex"));
        listaDeAnimais.add(new Gato("Augusto"));

        listaDeAnimais.forEach(animal -> {
                animal.dormir();
                animal.fazerSom();
        });
    }
}
