package com.senai.aula06_abstracao.exemplos_interface.veiculo;

interface Veiculo {
    void acelerar();

    //com o default, é possivel implementar um corpo
    default void buzinar(){
        System.out.println("Bii Bii");
    }
}
