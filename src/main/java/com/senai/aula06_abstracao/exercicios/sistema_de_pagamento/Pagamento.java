package com.senai.aula06_abstracao.exercicios.sistema_de_pagamento;

public abstract class Pagamento {
    protected String nomeUsuario;
    protected double valorTransacao;

    abstract void autenticacaoUsuario();

    abstract void validacaoAntiFraude();

    abstract void registroTransacao();

}
