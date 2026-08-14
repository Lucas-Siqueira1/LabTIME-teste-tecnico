package com.testetecnico.ticket_3.modificacoes;

import com.testetecnico.ticket_3.Arma;
import com.testetecnico.ticket_3.ArmamentoDecorator;

/**
 * Modificação de arma que adiciona um efeito de disparo múltiplo.
 */
public class DisparoMultiplo extends ArmamentoDecorator {

    /**
     * Cria a modificação de disparo múltiplo sobre a arma informada.
     *
     * @param armamentoDecorado arma (ou outra modificação) a ser decorada
     */
    public DisparoMultiplo(Arma armamentoDecorado) {
        super(armamentoDecorado);
    }

    /**
     * Executa o disparo da arma decorada e, em seguida, exibe o
     * efeito de disparo múltiplo adicionado.
     */
    @Override
    public void atirar() {
        armamentoDecorado.atirar();
        System.out.println(" + Efeito de disparo múltiplo!");
    }
}