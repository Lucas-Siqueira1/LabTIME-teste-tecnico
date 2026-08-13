package com.testetecnico.ticket_3;

public class Nave {

    private Arma armaAtual = null;

    public void trocarArma(Arma novaArma) {
        this.armaAtual = novaArma;
        System.out.println("\nArma equipada com sucesso!\n");
    }

    public Arma getArmaAtual() {
        return armaAtual;
    }

    public void atirar() {
        if (armaAtual == null) {
            System.out.println("\nVocê ainda não equipou nenhum armamento.\n");
        }else {
            armaAtual.atirar();
        }
    }

    public void adicionarModificacao(Arma armamentoDecorado) {
        this.armaAtual = armamentoDecorado;
    }
}
