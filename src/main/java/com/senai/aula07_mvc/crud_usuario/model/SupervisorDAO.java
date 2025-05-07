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

public class SupervisorDAO {
    private List<Supervisor> supervisores; // lista de supervisores
    private final String FILE_PATH = "supervisores.json"; //constante para guardar o caminho do arquivo
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create(); //biblioteca json


    private List<Supervisor> carregar() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<ArrayList<Operador>>() {
            }.getType(); //Verifica o tipo de estrutura
            return gson.fromJson(reader, listType); //Busca do json com um leitor(reader), converte e retorna uma lista
        } catch (IOException e) {
            return new ArrayList<>(); //retorna uma nova lista vazia caso o arquivo não exista
        }
    }

    public SupervisorDAO() { //Construtor que carrega a lista de supervisores
        supervisores = carregar();
    }

    public List<Supervisor> listar(Supervisor supervisor ){
        List<Supervisor> lista = new ArrayList<>();
        return lista;
    }

    public void salvar(Supervisor supervisor) {
        supervisores.add(supervisor);
        salvarJson();
    }

    public void salvarJson() { //metodo para salvar o arquivo
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(supervisores, writer); //Pega a lista de supervisores e passa para o writer
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Supervisor> listar() { //metodo que retorna a lista de supervisores
        return supervisores;
    }

    public void atualizar(Supervisor supervisor) {
        supervisores.forEach(o -> { //itera sobre cada um dos itens da lista e joga para Operador o
            if (o.getId() == supervisor.getId()) { //compara se o id de o é igual de operador
                o.setNome(supervisor.getNome()); //atualiza o nome
                o.setArea(supervisor.getArea()); //atualiza a área
                salvarJson();
            }
        });
    }

    public boolean deletar(int id) {
        Iterator<Supervisor> iterator = supervisores.iterator();
        while (iterator.hasNext()) { //enquanto verdadeiro, existe um próximo elemento
            Supervisor s = iterator.next(); //Pega cada um dos objetos até que não exista mais nenhum
            if (s.getId() == id) {
                iterator.remove();
                salvarJson();
                return true;
            }
        }
        return false;
    }
}
