package com.senai.aula04_heranca.exemplos.exemplo2_sistema_de_cadastro_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 1000);
        Gerente gerente1 = new Gerente("Vitoria", 6000, 1000);

        funcionario1.exibirDados();
        gerente1.exibirDados();
    }
}
