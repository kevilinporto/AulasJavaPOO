package com.senai.aula06_abstracao.exemplos_classes_abstratas.gerenciador_funcionarios;

public class Main {
    public static void main(String[] args) {
        pagarFuncionarios(new FuncionarioEfetivo("Vitoria", 1000, 10));
        pagarFuncionarios(new FuncionarioTemporario("Kevilin", 1000, 200, 100));
    }
    public static void pagarFuncionarios(Funcionario funcionario){
        System.out.printf("------------------Teste pagamento funcionário " + funcionario.nome + " --------------------------------\n");
        funcionario.exibirDados();
        funcionario.aumentarSalario(20);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
