package com.testetecnico.ticket_3.modificacoes;

import com.testetecnico.ticket_3.Arma;
import com.testetecnico.ticket_3.ArmamentoDecorator;

/**
 * Modificação de arma que adiciona um efeito de perfuração de blindagem.
 */
public class PerfuracaoBlindagem extends ArmamentoDecorator {

    /**
     * Cria a modificação de perfuração de blindagem sobre a arma informada.
     *
     * @param armamentoDecorado arma (ou outra modificação) a ser decorada
     */
    public PerfuracaoBlindagem(Arma armamentoDecorado) {
        super(armamentoDecorado);
    }

    /**
     * Executa o disparo da arma decorada e, em seguida, exibe o
     * efeito de perfuração de blindagem adicionado.
     */
    @Override
    public void atirar() {
        armamentoDecorado.atirar();
        System.out.println(" + Efeito de perfuração de blindagem!");
    }
}