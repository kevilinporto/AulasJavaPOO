package com.senai.aula02_colecoes.exemplos.pessoa;

import com.senai.aula01_introducaoPOO.exemplos.pessoa.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Vitoria", 18);
        Pessoa pessoa2 = new Pessoa("Beatriz", 19);
        Pessoa pessoa3 = new Pessoa("Kevilin", 20);

        Pessoa[] matrizPessoas = new Pessoa[4];

        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;

        for (Pessoa pessoa : matrizPessoas) {
            System.out.println(pessoa);

        }
        matrizPessoas[0].falar("AAAAAAAAAA");
        matrizPessoas[3] = new Pessoa("Camila", 22);
        System.out.println(matrizPessoas[3].nome);

        //possível, mas não viável
        ArrayList lista = new ArrayList();

        lista.add(12);
        lista.add(true);
        lista.add("Teste");
        lista.add(pessoa1);

        Pessoa pessoa = (Pessoa) lista.get(3);

        pessoa.falar("teste");

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(pessoa1); // variável já criada
        listaPessoas.add(new Pessoa("Joseph", 40)); //constrói direto na lista

        System.out.printf("Tamanho da lista: " + listaPessoas.size());
        listar(listaPessoas);
        listaPessoas.remove(pessoa1);
        listar(listaPessoas);

        listaPessoas.set(0, pessoa2);
        listar(listaPessoas);

        listaPessoas.add(0, pessoa3);
        listar(listaPessoas);
    }
    public static void listar (ArrayList<Pessoa> lista){
        System.out.println("");
        for (Pessoa pessoa : lista){
            System.out.println(pessoa);
        }
    }
}
