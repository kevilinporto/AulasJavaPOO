package com.senai.aula02_colecoes.exemplos.pessoa;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Vitoria", 18);
        Pessoa pessoa2 = new Pessoa("Beatriz", 19);
        Pessoa pessoa3 = new Pessoa("Kevilin", 20);
        Pessoa pessoa4 = new Pessoa("Katarina", 24);

        //-------------------usando matriz-------------------------//

        Pessoa[] matrizPessoas = new Pessoa[4];

        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;
        matrizPessoas[3] = pessoa4;

        for (Pessoa pessoa : matrizPessoas) {
            System.out.println(pessoa);

        }
        matrizPessoas[0].falar("AAAAAAAAAA");
        matrizPessoas[3] = new Pessoa("Camila", 22);
        System.out.println(matrizPessoas[3].nome);

        //------------------usando o ArrayList---------------//


        ArrayList lista = new ArrayList(); // Uma lista com vários tipos de dados misturados. Possível, mas não viável

        lista.add(12);
        lista.add(true);
        lista.add("Teste");
        lista.add(pessoa1);

        Pessoa pessoa = (Pessoa) lista.get(3);
        pessoa.falar("teste");


        // ArrayList com um tipo definido
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(pessoa1); // variável já criada
        listaPessoas.add(new Pessoa("Joseph", 40)); //constrói direto na lista
        listaPessoas.add(new Pessoa("Katarina", 40)); //constrói direto na lista


        System.out.printf("Tamanho da lista: " + listaPessoas.size()); // o método size mostra o tamanho da lista
        listar(listaPessoas);
        listaPessoas.remove(pessoa1); // o remove retira um elemento da lista
        listar(listaPessoas);

        listaPessoas.set(0, pessoa2); // o set substitui um elemento da lista
        listar(listaPessoas);

        listaPessoas.add(0, pessoa3); // o add adiciona um elemento na lista
        listar(listaPessoas);
        System.out.println("---------teste com o forEach---------");
        listaPessoas.forEach(System.out::println);

        List<Pessoa> listaFiltrada = listaPessoas.stream().filter(p -> p.nome.contains("K")).toList(); // para cada elemento da lista
        // o stream filtrará e retornará uma nova lista de acordo com a condição estabelecida
        System.out.println("-----------teste filtro--------------");
        listaFiltrada.forEach(System.out::println);
        System.out.println("------------fim teste filtro------");

        System.out.println("---------teste preenchimento------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha as informações a seguir: ");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        listaPessoas.add(new Pessoa(nome, idade)); // adiciona nova pessoa na lista com um nome e idade
        listaPessoas.forEach(System.out::println);
        System.out.println("-------fim teste preenchimento---------");
    }

    public static void listar(ArrayList<Pessoa> lista) { // função para exibir todos os elementos da lista
        System.out.println("\n----------lista----------");
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa);
        }
        System.out.println("----------------------------");
    }
}
