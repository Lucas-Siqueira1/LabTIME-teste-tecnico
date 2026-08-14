package com.testetecnico.ticket_2.funcoes;

import com.testetecnico.ticket_2.Funcao;
import com.testetecnico.ticket_2.Tripulante;

/**
 * Função de mecânico: responsável por organizar ferramentas e
 * conferir a situação geral da nave.
 */
public class FuncaoMecanico implements Funcao {

    /**
     * Exibe uma mensagem indicando que o tripulante assumiu a
     * função de mecânico.
     *
     * @param tripulante tripulante que está trabalhando como mecânico
     */
    @Override
    public void trabalhar(Tripulante tripulante) {
        System.out.println("\n" + tripulante.getName() + " é o novo mecânico da nave! Organizando caixa de ferramentas e conferindo situação da nave.");
    }
}