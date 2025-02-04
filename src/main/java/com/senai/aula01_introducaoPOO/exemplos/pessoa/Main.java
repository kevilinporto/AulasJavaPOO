package com.senai.aula01_introducaoPOO.exemplos.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // O new cria um novo objeto e atribui um endereço à variável
        Pessoa pessoa1 = new Pessoa("Vitoria", 18);
        Scanner scanner = new Scanner(System.in);
        String cabecalho[] = {"Nome: ", "Idade: ", "Altura: ", "Endereço: \n\trua: ", "\tnumero: ",
                "\tbairro: ", "\t cidade: ", "\testado: "};

        //Array para armazenar os dados preenchidos pelo usuário
        String[] dados = new String[8];

        System.out.println("Preencha os dados a seguir: ");
        for (int i = 0; i < cabecalho.length; i++) {
            //Este sout escreve na tela cada elemento de String[] cabecalho
            System.out.print(cabecalho[i]);
            dados[i] = scanner.nextLine();
        }
        Pessoa pessoa2 = new Pessoa(
                dados[0], //nome
                Integer.parseInt(dados[1]), //idade
                Float.parseFloat(dados[2]), //altura
                new Endereco(
                        dados[3], //rua
                        Integer.parseInt(dados[4]), //numero
                        dados[5], //bairro
                        dados[6], //cidade
                        dados[7] //estado
                )
        );


        System.out.println(pessoa1);
        System.out.println(pessoa2);

        pessoa1.comer("Tonkatsu");
        pessoa2.comer("Karê");

        pessoa1.falar("RDR2 Goty");
        pessoa2.falar("pprt");

    }
}
