package com.senai.aula06_abstracao.exercicios.sistema_check_in;

import java.util.Scanner;

public interface SistemaCheckIn {
    // Constantes padrão
    double PESO_MAX_BAGAGENS_INTER = 10.0;
    double PESO_MAX_BAGAGENS_NACIO = 20.0;

    // Método estático para mensagem de boas-vindas
    static void mensagemBoasVindas() {
        System.out.println("Check-in seguro realizado pela FlySecure.");
    }

    // Métodos obrigatórios para as companhias
    void validarDocumentos();
    void emitirCartaoEmbarque();
    void checarPesoBagagem(Scanner scanner);
}

