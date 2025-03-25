package com.senai.aula05_polimorfismo.exercicios.exercicio05_sistema_beneficios_funcionarios;

public class Beneficio {
    private double salario;
    private double valorBeneficio;
    private double porcentagemDesconto;

    public Beneficio(double valorBeneficio, double porcentagemDesconto, double salario) {
        this.valorBeneficio = valorBeneficio;
        this.porcentagemDesconto = porcentagemDesconto;
        this.salario = salario;
    }

    public double calcularDesconto(){
        return valorBeneficio -= valorBeneficio * porcentagemDesconto;

    }

    public double getSalario() {
        return salario;
    }

    public double getValorBeneficio() {
        return valorBeneficio;
    }

    public void setValorBeneficio(double valorBeneficio) {
        this.valorBeneficio = valorBeneficio;
    }

    public double getPorcentagemDesconto() {
        return porcentagemDesconto;
    }

    public void setPorcentagemDesconto(double porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }
}
