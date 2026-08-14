package com.testetecnico.ticket_2.funcoes;

import com.testetecnico.ticket_2.Funcao;
import com.testetecnico.ticket_2.Tripulante;

/**
 * Função de piloto: responsável por ajustar o painel de navegação
 * e a rota da nave.
 */
public class FuncaoPiloto implements Funcao {

    /**
     * Exibe uma mensagem indicando que o tripulante assumiu o
     * controle da nave como piloto.
     *
     * @param tripulante tripulante que está trabalhando como piloto
     */
    @Override
    public void trabalhar(Tripulante tripulante) {
        System.out.println("\n" + tripulante.getName() + " assumiu o controle! Ajustando painel de navegação e ajustando rota.");
    }
}