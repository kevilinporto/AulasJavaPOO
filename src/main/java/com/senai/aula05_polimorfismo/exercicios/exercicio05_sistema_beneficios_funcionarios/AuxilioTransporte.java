package com.senai.aula05_polimorfismo.exercicios.exercicio05_sistema_beneficios_funcionarios;

public class AuxilioTransporte extends Beneficio{

    public AuxilioTransporte(double valorBeneficio, double porcentagemDesconto, double salario) {
        super(valorBeneficio, porcentagemDesconto, salario);
    }

    @Override
    public double calcularDesconto() {
        double totalDesconto = getValorBeneficio() - (getValorBeneficio() * getPorcentagemDesconto());
        System.out.println(totalDesconto);
        return totalDesconto;
    }
}
