package com.testetecnico.ticket_2.funcoes;

import com.testetecnico.ticket_2.Funcao;
import com.testetecnico.ticket_2.Tripulante;

/**
 * Função de operador de canhões: responsável por conferir o
 * armamento e ajustar a mira.
 */
public class FuncaoOperadorCanhoes implements Funcao {

    /**
     * Exibe uma mensagem indicando que o tripulante assumiu a
     * função de operador de canhões.
     *
     * @param tripulante tripulante que está trabalhando como operador de canhões
     */
    @Override
    public void trabalhar(Tripulante tripulante) {
        System.out.println("\n" + tripulante.getName() + " é o novo operador de canhões! Conferindo armamento e ajustando mira.");
    }
}