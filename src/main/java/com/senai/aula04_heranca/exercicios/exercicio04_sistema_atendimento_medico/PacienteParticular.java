package com.senai.aula04_heranca.exercicios.exercicio04_sistema_atendimento_medico;

public class PacienteParticular extends Paciente {
    private double custoCosulta;

    public PacienteParticular(String nome, int idade, double custoCosulta) {
        super(nome, idade);
        this.custoCosulta = custoCosulta;
    }

    public double getCustoCosulta() {
        return custoCosulta;
    }

    public void setCustoCosulta(double custoCosulta) {
        this.custoCosulta = custoCosulta;
    }

    @Override
    public String toString() {
        return  "Nome: " + getNome() + " | Idade: " + getIdade() +" | Paciente sem convênio. Custo de consulta: R$" +
                getCustoCosulta() + "\n";
    }
}
