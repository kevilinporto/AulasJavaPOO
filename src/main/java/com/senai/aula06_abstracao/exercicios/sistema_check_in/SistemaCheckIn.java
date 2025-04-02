package com.senai.aula06_abstracao.exercicios.sistema_check_in;

public interface SistemaCheckIn {
    double PESO_MAX_BAGAGENS_INTER = 30;
    double PESO_MAX_BAGAGENS_NACIO = 50;

    void realizarCheckIn();

    void validarDocumentos();

    void emitirCartaoEmbarque();

    static void mensagemCheckIn(){
        System.out.println("Check-in seguro realizado realizado pela Fly-Secure");
    }
}

