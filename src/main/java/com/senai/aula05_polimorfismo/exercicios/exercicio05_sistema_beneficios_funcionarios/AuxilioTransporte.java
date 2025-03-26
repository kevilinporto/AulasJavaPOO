package com.senai.aula05_polimorfismo.exercicios.exercicio05_sistema_beneficios_funcionarios;

public class AuxilioTransporte extends Beneficio{

    public AuxilioTransporte(double valorBeneficio, double porcentagemDesconto, double salario) {
        super(valorBeneficio, porcentagemDesconto, salario);
    }

    @Override
    public double calcularDesconto() {
        double totalDesconto = getValorBeneficio() - (getValorBeneficio() * getPorcentagemDesconto());
        double salarioLiquido = getSalario() - totalDesconto;
        System.out.println("Desconto de R$" + totalDesconto + " do salário de R$" + getSalario() + ". Salário líquido R$" + salarioLiquido);
        return totalDesconto;
    }
}
