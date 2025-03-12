package com.senai.aula04_heranca.exemplos.exemplo2_sistema_de_cadastro_de_funcionarios;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Nome: %s, Salário: R$%,.2f\n", getNome(), salario + bonus);

    }
}

