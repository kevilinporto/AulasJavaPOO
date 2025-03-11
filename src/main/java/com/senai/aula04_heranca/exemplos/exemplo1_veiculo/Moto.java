package com.senai.aula04_heranca.exemplos.exemplo1_veiculo;

public class Moto extends Veiculo{
    private boolean partidaEletrica;

    public Moto(int ano, String modelo, boolean partidaEletrica) {
        super(ano, modelo);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println(", Partida elétrica: " + (partidaEletrica ? "Sim" : "Não")); //operador ternário para fazer o teste
    }
}
