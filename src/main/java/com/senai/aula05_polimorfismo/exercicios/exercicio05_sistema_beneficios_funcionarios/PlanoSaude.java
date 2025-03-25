package com.senai.aula05_polimorfismo.exercicios.exercicio05_sistema_beneficios_funcionarios;

public class PlanoSaude extends Beneficio{

    public PlanoSaude(double valorBeneficio, double porcentagemDesconto, double salario) {
        super(valorBeneficio, porcentagemDesconto, salario);
    }

    @Override
    public double calcularDesconto() {
        double totalDesconto = getValorBeneficio() - (getValorBeneficio() * getPorcentagemDesconto());
        return totalDesconto;
    }
}
