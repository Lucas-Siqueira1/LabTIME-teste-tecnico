package com.testetecnico.ticket_3.modificacoes;

import com.testetecnico.ticket_3.Arma;
import com.testetecnico.ticket_3.ArmamentoDecorator;

/**
 * Modificação de arma que adiciona um efeito de fogo ao disparo.
 */
public class DanoFogo extends ArmamentoDecorator {

    /**
     * Cria a modificação de dano de fogo sobre a arma informada.
     *
     * @param armamentoDecorado arma (ou outra modificação) a ser decorada
     */
    public DanoFogo(Arma armamentoDecorado) {
        super(armamentoDecorado);
    }

    /**
     * Executa o disparo da arma decorada e, em seguida, exibe o
     * efeito de fogo adicionado.
     */
    @Override
    public void atirar() {
        armamentoDecorado.atirar();
        System.out.println(" + Efeito de fogo!");
    }
}