package com.senai.aula07_mvc.crud_usuario.model;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperadorDAO {
    private List<Operador> operadores; //cria lista de operadores
    private final String FILE_PATH = "operadores.json"; //constante para guardar o caminho do arquivo
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create(); //biblioteca json

    private List<Operador> carregar() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<ArrayList<Operador>>() {
            }.getType(); //Verifica o tipo de estrutura
            return gson.fromJson(reader, listType); //Busca do json com um leitor(reader), converte e retorna uma lista
        } catch (IOException e) {
            return new ArrayList<>(); //retorna uma nova lista vazia caso o arquivo não exista
        }
    }

    public OperadorDAO() { //Construtor que carrega a lista de operadores
        operadores = carregar();
    }

    public void salvar(Operador operador) {
        operadores.add(operador);
        salvarJson();
    }

    public void salvarJson() { //metodo para salvar o arquivo
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(operadores, writer); //Pega a lista de operadores e passa para o writer
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Operador> listar() { //metodo que retorna a lista de operadores
        return operadores;
    }

    public void atualizar(Operador operador) {
        operadores.forEach(o -> { //itera sobre cada um dos itens da lista e joga para Operador o
            if (o.getId() == operador.getId()) { //compara se o id de o é igual de operador
                o.setNome(operador.getNome()); //atualiza o nome
                o.setSetor(operador.getSetor()); //atualiza o setor
                salvarJson();
            }
        });
    }

    public boolean deletar(int id) {
        Iterator<Operador> iterator = operadores.iterator();
        while (iterator.hasNext()) { //enquanto verdadeiro, existe um próximo elemento
            Operador o = iterator.next(); //Pega cada um dos objetos até que não exista mais nenhum
            if (o.getId() == id) {
                iterator.remove();
                salvarJson();
                return true;
            }
        }
        return false;
    }
}
