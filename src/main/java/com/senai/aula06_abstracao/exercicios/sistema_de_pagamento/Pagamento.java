package com.senai.aula06_abstracao.exercicios.sistema_de_pagamento;

public abstract class Pagamento {
    protected String usuario;
    protected double valor;

    public Pagamento(String usuario, double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    public void processarPagamento() {
        autenticarUsuario();
        validarAntifraude();
        executarPagamento();
        registrarTransacao();
        registrarLog();
    }

    void autenticarUsuario() {
        System.out.println("Autenticando usuário: " + usuario);
    }

    void validarAntifraude() {
        System.out.println("Validando segurança antifraude para o valor de R$ " + valor);
    }

    void registrarTransacao() {
        System.out.println("Transação registrada no sistema.");
    }

    void registrarLog() {
        System.out.println("Log: Usuário " + usuario + " realizou um pagamento de R$ " + valor);
    }

    abstract void executarPagamento();

}
