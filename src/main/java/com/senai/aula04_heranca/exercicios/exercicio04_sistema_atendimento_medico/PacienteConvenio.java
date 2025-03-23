package com.senai.aula04_heranca.exercicios.exercicio04_sistema_atendimento_medico;

public class PacienteConvenio extends Paciente {
    private double descontoConsulta;

    public PacienteConvenio(String nome, int idade, double descontoConsulta) {
        super(nome, idade);
        this.descontoConsulta = descontoConsulta;
    }

    public double getDescontoConsulta() {
        return descontoConsulta;
    }

    public void setDescontoConsulta(double descontoConsulta) {
        this.descontoConsulta = descontoConsulta;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " | Idade: " + getIdade() + " | Paciente conveniado. Desconto de consulta: R$" +
                descontoConsulta + "\n";
    }
}
