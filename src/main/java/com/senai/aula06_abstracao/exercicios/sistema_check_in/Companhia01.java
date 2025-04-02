package com.senai.aula06_abstracao.exercicios.sistema_check_in;

public class Companhia01 implements SistemaCheckIn{
    @Override
    public void realizarCheckIn() {
        SistemaCheckIn.mensagemCheckIn();
    }

    @Override
    public void validarDocumentos() {
        System.out.println("Documentos validados com sucesso!");
    }

    @Override
    public void emitirCartaoEmbarque() {
        System.out.printf("Cartão de embarque emitido com sucesso!");
    }
}
